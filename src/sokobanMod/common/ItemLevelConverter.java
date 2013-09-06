package sokobanMod.common;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.tileentity.TileEntityCommandBlock;
import net.minecraft.tileentity.TileEntitySign;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

/**
 * Sokoban Mod
 * @author MineMaarten
 * www.minemaarten.com
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */

public class ItemLevelConverter extends Item{

    public static final String NEW_LINE = System.getProperty("line.separator");

    public ItemLevelConverter(int par1){
        super(par1);
        setMaxStackSize(1);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister){
        itemIcon = par1IconRegister.registerIcon("sokobanMod:ItemLevelConverter");
    }

    @Override
    public boolean onItemUse(ItemStack IStack, EntityPlayer player, World world, int x, int y, int z, int par7, float par8, float par9, float par10){

        if(IStack.stackTagCompound == null) {
            IStack.setTagCompound(new NBTTagCompound());
        }
        NBTTagCompound compound = IStack.stackTagCompound;
        if(!player.isSneaking()) {
            compound.setInteger("x", x);
            compound.setInteger("y", y);
            compound.setInteger("z", z);
            if(world.isRemote) player.addChatMessage("\u00a7A[Level Converter] Set start coordinates to " + x + "," + y + "," + z);
        } else {
            int startX = compound.getInteger("x");
            int startY = compound.getInteger("y");
            int startZ = compound.getInteger("z");
            if(startX != 0 && startY != 0 && startZ != 0) {
                if(!world.isRemote) {
                    int tempVar;
                    if(startX > x) {
                        tempVar = startX;
                        startX = x;
                        x = tempVar;
                    }
                    if(startY > y) {
                        tempVar = startY;
                        startY = y;
                        y = tempVar;
                    }
                    if(startZ > z) {
                        tempVar = startZ;
                        startZ = z;
                        z = tempVar;
                    }

                    try {
                        File generationCodeFile;
                        int fileCounter = 1;
                        do {
                            generationCodeFile = new File("Sokoban Generation Code\\Generation Code " + fileCounter + ".txt");
                            fileCounter++;
                        } while(generationCodeFile.exists());
                        generationCodeFile.getParentFile().mkdirs();
                        FileWriter generationCodeWriter = new FileWriter(generationCodeFile);

                        // generate the includes
                        generationCodeWriter.write("import sokobanMod.common.SokobanMod;" + NEW_LINE);
                        generationCodeWriter.write("import sokobanMod.common.TileEntityLootGenerator;" + NEW_LINE);
                        generationCodeWriter.write("import sokobanMod.common.TileEntityTargetBox;" + NEW_LINE);
                        generationCodeWriter.write("import sokobanMod.common.gen.levelGenBase;" + NEW_LINE);
                        generationCodeWriter.write("import net.minecraft.block.Block;" + NEW_LINE);
                        generationCodeWriter.write("import net.minecraft.item.ItemStack;" + NEW_LINE);
                        generationCodeWriter.write("import net.minecraft.tileentity.TileEntitySign;" + NEW_LINE);
                        generationCodeWriter.write("import net.minecraft.tileentity.TileEntityChest;" + NEW_LINE);
                        generationCodeWriter.write("import net.minecraft.tileentity.TileEntityCommandBlock;" + NEW_LINE);
                        generationCodeWriter.write("import net.minecraft.util.WeightedRandomChestContent;" + NEW_LINE);
                        generationCodeWriter.write("import net.minecraft.world.World;" + NEW_LINE + NEW_LINE);

                        // generate the classname
                        generationCodeWriter.write("public class levelGen{" + NEW_LINE);
                        generationCodeWriter.write("public static final int levelNumber = 0; //TODO: Set to right level number" + NEW_LINE);
                        generationCodeWriter.write("public static final int[] levelBounds = {" + (x - startX) + ", " + (y - startY) + ", " + (z - startZ) + "};" + NEW_LINE);
                        generationCodeWriter.write("public static final int[] entranceCoords = {");
                        List<Integer> entranceCoords = getEntranceCoords(world, startX, startY, startZ, x, y, z);
                        for(int i = 0; i < entranceCoords.size(); i++) {
                            generationCodeWriter.write(entranceCoords.get(i) + "");
                            if(i < entranceCoords.size() - 1) generationCodeWriter.write(", ");
                        }
                        generationCodeWriter.write("};" + NEW_LINE);

                        // check for any chests/loot generators
                        generateChestContents(world, startX, startY, startZ, x, y, z, generationCodeWriter);
                        generateLootGeneratorContents(world, startX, startY, startZ, x, y, z, generationCodeWriter);

                        // generate the functionname
                        generationCodeWriter.write("public static boolean generate(World world, int generationMethod, int baseX, int baseY, int baseZ){" + NEW_LINE + NEW_LINE);

                        // clear the level first
                        generationCodeWriter.write("int flatY = levelGenBase.canGenerateHereAndClear(world, generationMethod, entranceCoords, baseX, baseY, baseZ, baseX + " + (x - startX) + ", baseY + " + (y - startY) + ", baseZ + " + (z - startZ) + ");" + NEW_LINE);
                        generationCodeWriter.write("if(flatY == 0) return false;" + NEW_LINE);
                        generationCodeWriter.write("if(generationMethod == levelGenBase.generateSurface) baseY = flatY;" + NEW_LINE + NEW_LINE);
                        generationCodeWriter.write("//base blocks" + NEW_LINE);

                        for(int i = startX; i <= x; i++) {
                            for(int j = startY; j <= y; j++) {
                                for(int k = startZ; k <= z; k++) {
                                    int blockID = world.getBlockId(i, j, k);
                                    String blockIDString = SokobanUtils.getBlockIDString(blockID);
                                    if(SokobanUtils.isBlockInstable(blockID) || blockID == 0) continue;
                                    int metadata = world.getBlockMetadata(i, j, k);
                                    String blockName = Block.blocksList[blockID].getUnlocalizedName();
                                    int offsetX = i - startX;
                                    int offsetY = j - startY;
                                    int offsetZ = k - startZ;
                                    generationCodeWriter.write("levelGenBase.setBlockAndMetadata(world, baseX + " + offsetX + ", baseY + " + offsetY + ", baseZ + " + offsetZ + ", " + blockIDString + ", " + metadata + "); //" + blockName + NEW_LINE);
                                    handleLootGenerators(world, i, j, k, offsetX, offsetY, offsetZ, generationCodeWriter);
                                    handleChests(world, i, j, k, offsetX, offsetY, offsetZ, generationCodeWriter);
                                    handleCommandBlocks(world, i, j, k, offsetX, offsetY, offsetZ, generationCodeWriter);
                                }
                            }
                        }

                        generationCodeWriter.write(NEW_LINE + "//Instable blocks (like torches, levers, signs)" + NEW_LINE);
                        for(int i = startX; i <= x; i++) {
                            for(int j = startY; j <= y; j++) {
                                for(int k = startZ; k <= z; k++) {
                                    int blockID = world.getBlockId(i, j, k);
                                    String blockIDString = SokobanUtils.getBlockIDString(blockID);
                                    if(!SokobanUtils.isBlockInstable(blockID)) continue;
                                    int metadata = world.getBlockMetadata(i, j, k);
                                    String blockName = Block.blocksList[blockID].getUnlocalizedName();
                                    int offsetX = i - startX;
                                    int offsetY = j - startY;
                                    int offsetZ = k - startZ;
                                    generationCodeWriter.write("levelGenBase.setBlockAndMetadata(world, baseX + " + offsetX + ", baseY + " + offsetY + ", baseZ + " + offsetZ + ", " + blockIDString + ", " + metadata + "); //" + blockName + NEW_LINE);
                                    handleSigns(world, i, j, k, offsetX, offsetY, offsetZ, generationCodeWriter);
                                    handleTargetBoxes(world, i, j, k, offsetX, offsetY, offsetZ, x - startX, y - startY, z - startZ, generationCodeWriter);
                                }
                            }
                        }
                        generationCodeWriter.write("return true;" + NEW_LINE);
                        generationCodeWriter.write("}" + NEW_LINE + "}"); // close
                                                                          // the
                                                                          // function
                                                                          // and
                                                                          // class
                                                                          // body.
                        generationCodeWriter.close();
                        player.addChatMessage("\u00a72[Level Converter] Succesfully saved the generation code in '" + generationCodeFile.getName() + "'");
                    } catch(Exception e) {
                        player.addChatMessage("\u00a7C[Level Converter] Exception: " + e.getMessage() + ", report this back to MineMaarten please!");
                    }
                }
            } else {
                player.addChatMessage("\u00a7CPlease set a start coordinate first!");
            }

            compound.removeTag("x");
            compound.removeTag("y");
            compound.removeTag("z");
        }
        return false;
    }

    private void generateChestContents(World world, int startX, int startY, int startZ, int endX, int endY, int endZ, FileWriter writer){
        try {
            for(int i = startX; i <= endX; i++) {
                for(int j = startY; j <= endY; j++) {
                    for(int k = startZ; k <= endZ; k++) {
                        if(world.getBlockId(i, j, k) == Block.chest.blockID && world.getBlockTileEntity(i, j, k) != null && world.getBlockTileEntity(i, j, k) instanceof TileEntityChest) {
                            TileEntityChest chest = (TileEntityChest)world.getBlockTileEntity(i, j, k);

                            writer.write("public static final ItemStack[] staticInventoryContents_" + (i - startX) + "_" + (j - startY) + "_" + (k - startZ) + " = new ItemStack[] { ");

                            boolean firstStack = true;
                            String blockName = "";
                            for(int l = 0; l < chest.getSizeInventory(); l++) {
                                if(chest.getStackInSlot(l) != null) {
                                    ItemStack stack = chest.getStackInSlot(l);
                                    if(!firstStack) {
                                        writer.write(", //" + blockName + NEW_LINE);
                                        for(int tab = 0; tab < 8; tab++)
                                            writer.write("\t");
                                    }
                                    writer.write("(new ItemStack(" + SokobanUtils.getBlockIDString(stack.itemID) + ", " + stack.stackSize + ", " + stack.getItemDamage() + "))");

                                    // blockName =
                                    // Block.blocksList[stack.itemID].getUnlocalizedName();
                                    firstStack = false;
                                }
                            }
                            writer.write("}; " + NEW_LINE);

                            writer.write("public static final WeightedRandomChestContent[] randomInventoryContents_" + (i - startX) + "_" + (j - startY) + "_" + (k - startZ) + " = new WeightedRandomChestContent[] {/*new WeightedRandomChestContent(Item.stick.itemID, 0, 1, 3, 10)*/}; " + NEW_LINE);

                        }
                    }
                }
            }
        } catch(Exception e) {

        }
    }

    private void generateLootGeneratorContents(World world, int startX, int startY, int startZ, int endX, int endY, int endZ, FileWriter writer){
        try {
            for(int i = startX; i <= endX; i++) {
                for(int j = startY; j <= endY; j++) {
                    for(int k = startZ; k <= endZ; k++) {
                        if(world.getBlockId(i, j, k) == SokobanMod.BlockLootGenerator.blockID && world.getBlockTileEntity(i, j, k) != null && world.getBlockTileEntity(i, j, k) instanceof TileEntityLootGenerator) {
                            TileEntityLootGenerator lootGen = (TileEntityLootGenerator)world.getBlockTileEntity(i, j, k);

                            writer.write("public static final ItemStack[] staticInventoryContents_" + (i - startX) + "_" + (j - startY) + "_" + (k - startZ) + " = new ItemStack[] { ");

                            boolean firstStack = true;
                            String blockName = "";
                            for(int l = 0; l < lootGen.getLoot().size(); l++) {
                                ItemStack stack = lootGen.getLoot().get(l);
                                if(!firstStack) {
                                    writer.write(", //" + blockName + NEW_LINE);
                                    for(int tab = 0; tab < 8; tab++)
                                        writer.write("\t");
                                }
                                writer.write("(new ItemStack(" + SokobanUtils.getBlockIDString(stack.itemID) + ", " + stack.stackSize + ", " + stack.getItemDamage() + "))");

                                // blockName =
                                // Block.blocksList[stack.itemID].getUnlocalizedName();
                                firstStack = false;
                            }
                            writer.write("}; " + NEW_LINE);

                            writer.write("public static final WeightedRandomChestContent[] randomInventoryContents_" + (i - startX) + "_" + (j - startY) + "_" + (k - startZ) + " = new WeightedRandomChestContent[] {/*new WeightedRandomChestContent(Item.stick.itemID, 0, 1, 3, 10)*/}; " + NEW_LINE);

                        }
                    }
                }
            }
        } catch(Exception e) {

        }
    }

    private List<Integer> getEntranceCoords(World world, int startX, int startY, int startZ, int endX, int endY, int endZ){
        List<Integer> entranceCoords = new ArrayList<Integer>();
        for(int i = startX; i <= endX; i++) {
            for(int j = startZ; j <= endZ; j++) {
                if(world.getBlockId(i, startY, j) == 0) {
                    entranceCoords.add(i - startX);
                    entranceCoords.add(0);
                    entranceCoords.add(j - startZ);
                }
                if(world.getBlockId(i, endY, j) == 0) {
                    entranceCoords.add(i - startX);
                    entranceCoords.add(endY - startY);
                    entranceCoords.add(j - startZ);
                }
            }
        }
        for(int i = startX; i <= endX; i++) {
            for(int j = startY + 1; j < endY; j++) {
                if(world.getBlockId(i, j, startZ) == 0) {
                    entranceCoords.add(i - startX);
                    entranceCoords.add(j - startY);
                    entranceCoords.add(0);
                }
                if(world.getBlockId(i, j, endZ) == 0) {
                    entranceCoords.add(i - startX);
                    entranceCoords.add(j - startY);
                    entranceCoords.add(endZ - startZ);
                }
            }
        }

        for(int i = startY + 1; i < endY; i++) {
            for(int j = startZ + 1; j < endZ; j++) {
                if(world.getBlockId(startX, i, j) == 0) {
                    entranceCoords.add(0);
                    entranceCoords.add(i - startY);
                    entranceCoords.add(j - startZ);
                }
                if(world.getBlockId(endX, i, j) == 0) {
                    entranceCoords.add(endX - startX);
                    entranceCoords.add(i - startY);
                    entranceCoords.add(j - startZ);
                }
            }
        }
        return entranceCoords;
    }

    private void handleSigns(World world, int x, int y, int z, int offsetX, int offsetY, int offsetZ, FileWriter generationCodeWriter){
        if(world.getBlockId(x, y, z) == Block.signPost.blockID || world.getBlockId(x, y, z) == Block.signWall.blockID) {
            TileEntity te = world.getBlockTileEntity(x, y, z);
            if(te instanceof TileEntitySign) {
                try {
                    generationCodeWriter.write("if(world.getBlockTileEntity(baseX + " + offsetX + ", baseY + " + offsetY + ", baseZ + " + offsetZ + ") instanceof TileEntitySign){" + NEW_LINE);
                    generationCodeWriter.write("\tTileEntitySign tes = (TileEntitySign)world.getBlockTileEntity(baseX + " + offsetX + ", baseY + " + offsetY + ", baseZ + " + offsetZ + ");" + NEW_LINE);
                    TileEntitySign tes = (TileEntitySign)te;
                    for(int i = 0; i < 4; i++) {
                        generationCodeWriter.write("\ttes.signText[" + i + "] = " + (char)34 + tes.signText[i] + (char)34 + ";" + NEW_LINE);
                    }
                    // generationCodeWriter.write("\tPacketDispatcher.sendPacketToAllPlayers(tes.getDescriptionPacket());"
                    // + newLine);
                    generationCodeWriter.write("}" + NEW_LINE);
                } catch(IOException e) {
                    System.out.println("Error when trying to write code for a sign!");
                }
            }
        }
    }

    private void handleTargetBoxes(World world, int x, int y, int z, int offsetX, int offsetY, int offsetZ, int maxX, int maxY, int maxZ, FileWriter generationCodeWriter){
        if(world.getBlockId(x, y, z) == SokobanMod.BlockTargetBox.blockID) {
            TileEntity te = world.getBlockTileEntity(x, y, z);
            if(te instanceof TileEntityTargetBox) {
                try {
                    generationCodeWriter.write("if(world.getBlockTileEntity(baseX + " + offsetX + ", baseY + " + offsetY + ", baseZ + " + offsetZ + ") instanceof TileEntityTargetBox){" + NEW_LINE);
                    generationCodeWriter.write("\tTileEntityTargetBox teTb = (TileEntityTargetBox)world.getBlockTileEntity(baseX + " + offsetX + ", baseY + " + offsetY + ", baseZ + " + offsetZ + ");" + NEW_LINE);
                    generationCodeWriter.write("\tteTb.setLevelBounds(baseX, baseY, baseZ, baseX + " + maxX + ", baseY + " + maxY + ", baseZ + " + maxZ + ");" + NEW_LINE);
                    generationCodeWriter.write("\tteTb.levelDropped = levelNumber;" + NEW_LINE);

                    generationCodeWriter.write("}" + NEW_LINE);
                } catch(IOException e) {
                    System.out.println("Error when trying to write code for a Target Box!");
                }
            }
        }
    }

    private void handleChests(World world, int x, int y, int z, int offsetX, int offsetY, int offsetZ, FileWriter writer){
        if(world.getBlockId(x, y, z) == Block.chest.blockID) {
            TileEntity te = world.getBlockTileEntity(x, y, z);
            if(te instanceof TileEntityChest) {
                try {
                    writer.write("if(world.getBlockTileEntity(baseX + " + offsetX + ", baseY + " + offsetY + ", baseZ + " + offsetZ + ") instanceof TileEntityChest){" + NEW_LINE);
                    writer.write("\tTileEntityChest teC = (TileEntityChest)world.getBlockTileEntity(baseX + " + offsetX + ", baseY + " + offsetY + ", baseZ + " + offsetZ + ");" + NEW_LINE);
                    writer.write("\tlevelGenBase.setChestContents(teC, staticInventoryContents_" + offsetX + "_" + offsetY + "_" + offsetZ + ", randomInventoryContents_" + offsetX + "_" + offsetY + "_" + offsetZ + ");" + NEW_LINE + "}" + NEW_LINE);

                } catch(IOException e) {
                    System.out.println("Error when trying to write code for a Chest!");
                }
            }
        }
    }

    private void handleLootGenerators(World world, int x, int y, int z, int offsetX, int offsetY, int offsetZ, FileWriter writer){
        if(world.getBlockId(x, y, z) == SokobanMod.BlockLootGenerator.blockID) {
            TileEntity te = world.getBlockTileEntity(x, y, z);
            if(te instanceof TileEntityLootGenerator) {
                try {
                    writer.write("if(world.getBlockTileEntity(baseX + " + offsetX + ", baseY + " + offsetY + ", baseZ + " + offsetZ + ") instanceof TileEntityLootGenerator){" + NEW_LINE);
                    writer.write("\tTileEntityLootGenerator teLg = (TileEntityLootGenerator)world.getBlockTileEntity(baseX + " + offsetX + ", baseY + " + offsetY + ", baseZ + " + offsetZ + ");" + NEW_LINE);
                    writer.write("\tlevelGenBase.setLootGeneratorContents(teLg, staticInventoryContents_" + offsetX + "_" + offsetY + "_" + offsetZ + ", randomInventoryContents_" + offsetX + "_" + offsetY + "_" + offsetZ + ");" + NEW_LINE + "}" + NEW_LINE);

                } catch(IOException e) {
                    System.out.println("Error when trying to write code for a Loot Generator!");
                }
            }
        }
    }

    private void handleCommandBlocks(World world, int x, int y, int z, int offsetX, int offsetY, int offsetZ, FileWriter writer){
        if(world.getBlockId(x, y, z) == Block.commandBlock.blockID) {
            TileEntity te = world.getBlockTileEntity(x, y, z);
            if(te instanceof TileEntityCommandBlock) {
                try {
                    writer.write("if(world.getBlockTileEntity(baseX + " + offsetX + ", baseY + " + offsetY + ", baseZ + " + offsetZ + ") instanceof TileEntityCommandBlock){" + NEW_LINE);
                    writer.write("\tTileEntityCommandBlock teCb = (TileEntityCommandBlock)world.getBlockTileEntity(baseX + " + offsetX + ", baseY + " + offsetY + ", baseZ + " + offsetZ + ");" + NEW_LINE);
                    NBTTagCompound tag = new NBTTagCompound();
                    ((TileEntityCommandBlock)te).writeToNBT(tag);
                    writer.write("\tteCb.setCommand(\"" + tag.getString("Command") + "\");" + NEW_LINE);

                    writer.write("\tteCb.setCommandSenderName(\"" + tag.getString("CustomName") + "\");" + NEW_LINE + "}" + NEW_LINE);
                } catch(IOException e) {
                    System.out.println("Error when trying to write code for a Command Block!");
                }
            }
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer player, List infoList, boolean par4){
        if(stack.stackTagCompound == null) {
            stack.setTagCompound(new NBTTagCompound());
        }
        NBTTagCompound compound = stack.stackTagCompound;
        int x = compound.getInteger("x");
        int y = compound.getInteger("y");
        int z = compound.getInteger("z");
        if(x != 0 && y != 0 && z != 0) {
            infoList.add("\u00a72Startcoordinate: " + x + ", " + y + ", " + z);
        }
    }

}
