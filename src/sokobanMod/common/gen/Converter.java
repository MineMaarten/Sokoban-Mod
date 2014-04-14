package sokobanMod.common.gen;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.ChunkPosition;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;

import com.google.common.collect.HashBiMap;

import cpw.mods.fml.common.registry.FMLControlledNamespacedRegistry;
import cpw.mods.fml.relauncher.ReflectionHelper;

public class Converter{

    public List<String> txtOutput = new ArrayList<String>();
    public List<String> classOutput = new ArrayList<String>();
    private static final String PACKAGE = "sokobanMod.common.gen";

    public Converter(World world, ChunkPosition p1, ChunkPosition p2, String fileName){
        classOutput.add("package " + PACKAGE + ";");
        classOutput.add("");
        classOutput.add("public class " + fileName + "{");
        classOutput.add("");

        int minX = Math.min(p1.chunkPosX, p2.chunkPosX);
        int minY = Math.min(p1.chunkPosY, p2.chunkPosY);
        int minZ = Math.min(p1.chunkPosZ, p2.chunkPosZ);
        int maxX = Math.max(p1.chunkPosX, p2.chunkPosX);
        int maxY = Math.max(p1.chunkPosY, p2.chunkPosY);
        int maxZ = Math.max(p1.chunkPosZ, p2.chunkPosZ);

        txtOutput.add(maxX + "," + maxY + "," + maxZ);
        txtOutput.add("// ^ Max boundaries");
        CustomGenerationHeaderEvent event = new CustomGenerationHeaderEvent(world, minX, minY, minZ, maxX, maxY, maxZ);
        MinecraftForge.EVENT_BUS.post(event);
        for(String line : event.headerEntries) {
            txtOutput.add(line);
        }
        txtOutput.add("START");
        txtOutput.add("");
        txtOutput.add("// Stable blocks");

        for(int x = minX; x <= maxX; x++) {
            for(int y = minY; y <= maxY; y++) {
                for(int z = minZ; z <= maxZ; z++) {
                    Block block = world.getBlock(x, y, z);
                    if(!block.isAir(world, x, y, z) && !GenUtils.isInstableBlock(block)) {
                        generateBlockInfo(world, x, y, z, block, minX, minY, minZ);
                    }
                }
            }
        }
        txtOutput.add("");
        txtOutput.add("// Unstable blocks");
        for(int x = minX; x <= maxX; x++) {
            for(int y = minY; y <= maxY; y++) {
                for(int z = minZ; z <= maxZ; z++) {
                    Block block = world.getBlock(x, y, z);
                    if(!block.isAir(world, x, y, z) && GenUtils.isInstableBlock(block)) {
                        generateBlockInfo(world, x, y, z, block, minX, minY, minZ);
                    }
                }
            }
        }

        classOutput.add("}");

        fileName = "Sokoban Generation Code\\" + fileName;
        GenUtils.writeFile(classOutput, fileName + ".java");
        GenUtils.writeFile(txtOutput, fileName + ".txt");
    }

    private void generateBlockInfo(World world, int x, int y, int z, Block block, int minX, int minY, int minZ){
        TileEntity te = world.getTileEntity(x, y, z);
        String functionCall = "";
        if(te != null) {
            functionCall = getTEName(te) + "_" + (x - minX) + "_" + (y - minY) + "_" + (z - minZ);
            classOutput.add("\tpublic static void " + functionCall + "(World world, int x, int y, int z){");
            classOutput.add("\t\tTileEntity te = world.getTileEntity(x, y, z);");
            classOutput.add("\t\t");

            NBTTagCompound tag = new NBTTagCompound();
            te.writeToNBT(tag);
            tagNameIndex = 0;
            tagListIndex = 0;
            parseNBTTag(classOutput, tag, 2);
            classOutput.add("");
            classOutput.add("\t\ttag1.setInteger(\"x\", x);");
            classOutput.add("\t\ttag1.setInteger(\"y\", y);");
            classOutput.add("\t\ttag1.setInteger(\"z\", z);");
            classOutput.add("\t\tte.readFromNBT(tag1);");
            classOutput.add("\t}");
            classOutput.add("");
            functionCall = "," + functionCall;
        }
        txtOutput.add(x - minX + "," + (y - minY) + "," + (z - minZ) + "," + getBlockString(block) + "," + world.getBlockMetadata(x, y, z) + functionCall);
    }

    /**
     * I know it's possible to read/write nbt tags directly through byte streams, but this method gives high flexibility later when tags need to be altered.
     */
    private int tagNameIndex = 0;
    private int tagListIndex = 0;

    private void parseNBTTag(List<String> output, NBTTagCompound tag, int depth){
        String prefix = "";
        for(int i = 0; i < depth; i++)
            prefix += "\t";

        int curIndex = ++tagNameIndex;
        output.add(prefix + "NBTTagCompound tag" + curIndex + " = new NBTTagCompound();");

        boolean isItem = tag.hasKey("id") && tag.hasKey("Count") && tag.hasKey("Damage");
        if(isItem) {
            String[] itemString = getItemString(Item.getItemById(tag.getShort("id"))).split(":");
            output.add("new ItemStack(GameRegistry.findItem(\"" + itemString[0] + "\", \"" + itemString[1] + "\"), " + tag.getByte("Count") + ", " + tag.getShort("Damage") + ").writeToNBT(tag" + curIndex + ");");
        }

        Map<String, NBTBase> tags = getTagMap(tag);
        for(Map.Entry<String, NBTBase> entries : tags.entrySet()) {
            if(isItem && (entries.getKey().equals("id") || entries.getKey().equals("Count") || entries.getKey().equals("Damage"))) continue;
            switch(entries.getValue().getId()){
                case 1:
                    output.add(prefix + "tag" + curIndex + ".setByte(\"" + entries.getKey() + "\", (byte)" + tag.getByte(entries.getKey()) + ");");
                    break;
                case 2:
                    output.add(prefix + "tag" + curIndex + ".setShort(\"" + entries.getKey() + "\", (short)" + tag.getShort(entries.getKey()) + ");");
                    break;
                case 3:
                    if(depth > 2 || !entries.getKey().equals("x") && !entries.getKey().equals("y") && !entries.getKey().equals("z")) output.add(prefix + "tag" + curIndex + ".setInteger(\"" + entries.getKey() + "\", " + tag.getInteger(entries.getKey()) + ");");
                    break;
                case 4:
                    output.add(prefix + "tag" + curIndex + ".setLong(\"" + entries.getKey() + "\", " + tag.getLong(entries.getKey()) + "L);");
                    break;
                case 5:
                    output.add(prefix + "tag" + curIndex + ".setFloat(\"" + entries.getKey() + "\", " + tag.getFloat(entries.getKey()) + "F);");
                    break;
                case 6:
                    output.add(prefix + "tag" + curIndex + ".setDouble(\"" + entries.getKey() + "\", " + tag.getDouble(entries.getKey()) + ");");
                    break;
                case 7:
                    byte[] byteArray = tag.getByteArray(entries.getKey());
                    String byteSetText = "new byte[]{" + (byteArray.length > 0 ? "(byte)" + byteArray[0] : "");
                    for(byte b : byteArray) {
                        byteSetText += ", (byte)" + b;
                    }
                    byteSetText += "}";
                    output.add(prefix + "tag" + curIndex + ".setByteArray(\"" + entries.getKey() + "\", " + byteSetText + ");");
                    break;
                case 8:
                    output.add(prefix + "tag" + curIndex + ".setString(\"" + entries.getKey() + "\", \"" + tag.getString(entries.getKey()) + "\");");
                    break;
                case 9:
                    output.add("");
                    int curListIndex = ++tagListIndex;
                    output.add(prefix + "NBTTagList tagList" + tagListIndex + " = new NBTTagList();");
                    NBTTagList taglist = tag.getTagList(entries.getKey(), 10);
                    for(int i = 0; i < taglist.tagCount(); i++) {
                        int index = tagNameIndex + 1;
                        parseNBTTag(output, taglist.getCompoundTagAt(i), depth + 1);
                        output.add(prefix + "tagList" + curListIndex + ".appendTag(tag" + index + ");");
                    }
                    output.add(prefix + "tag" + curIndex + ".setTag(\"" + entries.getKey() + "\", tagList" + curListIndex + ");");
                    break;
                case 10:
                    output.add("");
                    int tagIndex = curIndex;
                    parseNBTTag(output, tag.getCompoundTag(entries.getKey()), depth + 1);
                    output.add(prefix + "tag" + tagIndex + ".setTag(\"" + entries.getKey() + "\", tag" + (tagIndex + 1) + ");");
                    output.add("");
                    break;
                case 11:
                    int[] intArray = tag.getIntArray(entries.getKey());
                    String intSetText = "new byte[]{" + (intArray.length > 0 ? intArray[0] : "");
                    for(int b : intArray) {
                        intSetText += ", " + b;
                    }
                    intSetText += "}";
                    output.add(prefix + "tag" + curIndex + ".setByteArray(\"" + entries.getKey() + "\", " + intSetText + ");");
                    break;
            }
        }
    }

    private Field tagMapField;

    private Map<String, NBTBase> getTagMap(NBTTagCompound tag){
        if(tagMapField == null) tagMapField = ReflectionHelper.findField(NBTTagCompound.class, "field_74784_a", "tagMap");
        try {
            return (Map<String, NBTBase>)tagMapField.get(tag);
        } catch(Exception e) {
            System.err.println("[Sokoban] Reflection error: NBTTagCompound get tagMap field!");
            return null;
        }

    }

    private HashBiMap<String, Integer> blockIdToStringMapping;
    private HashBiMap<String, Integer> itemIdToStringMapping;
    private Map<Class<? extends TileEntity>, String> teMapping;

    private String getBlockString(Block block){
        if(blockIdToStringMapping == null) {
            blockIdToStringMapping = HashBiMap.<String, Integer> create();
            ((FMLControlledNamespacedRegistry<Block>)Block.blockRegistry).serializeInto(blockIdToStringMapping);
        }
        return blockIdToStringMapping.inverse().get(Block.getIdFromBlock(block)).substring(1);//substring --> remove discriminator.
    }

    private String getItemString(Item item){
        if(itemIdToStringMapping == null) {
            itemIdToStringMapping = HashBiMap.<String, Integer> create();
            ((FMLControlledNamespacedRegistry<Block>)Item.itemRegistry).serializeInto(itemIdToStringMapping);
        }
        return itemIdToStringMapping.inverse().get(Item.getIdFromItem(item)).substring(1);//substring --> remove discriminator. 
    }

    private String getTEName(TileEntity te){
        if(teMapping == null) {
            try {
                teMapping = (Map<Class<? extends TileEntity>, String>)ReflectionHelper.findField(TileEntity.class, "field_145853_j", "classToNameMap").get(null);
            } catch(Exception e) {
                System.err.println("[Sokoban] Reflection error when trying to get the TileEntity's class to name mapping.");
            }
        }
        return teMapping.get(te.getClass());
    }

}
