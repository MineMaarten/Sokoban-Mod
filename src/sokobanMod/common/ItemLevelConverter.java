package sokobanMod.common;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.tileentity.TileEntityCommandBlock;
import net.minecraft.tileentity.TileEntitySign;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.ChunkPosition;
import net.minecraft.world.World;
import sokobanMod.common.gen.Converter;
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

    private String lastLevelName = "";

    public ItemLevelConverter(){
        super();
        setMaxStackSize(1);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister par1IconRegister){
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
            if(world.isRemote) player.addChatMessage(new ChatComponentText("\u00a7A[Level Converter] Set start coordinates to " + x + "," + y + "," + z));
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
                        int levelNumber = getLevelNumber(world, startX, startY, startZ, x, y, z);
                        if(levelNumber >= 0) {
                            String difficulty;
                            if(levelNumber < 1000) {
                                difficulty = "Tutorial";
                            } else if(levelNumber < 2000) {
                                difficulty = "Easy";
                            } else if(levelNumber < 3000) {
                                difficulty = "Medium";
                            } else {
                                difficulty = "Hard";
                            }
                            File generationCodeFile = new File("Sokoban Generation Code\\" + difficulty + "Level" + (levelNumber % 1000 + 1) + "Gen.java");
                            if(!generationCodeFile.exists()) {
                                generationCodeFile.getParentFile().mkdirs();
                                new Converter(world, new ChunkPosition(startX, startY, startZ), new ChunkPosition(x, y, z), difficulty + "Level" + (levelNumber % 1000 + 1) + "Gen");
                                player.addChatMessage(new ChatComponentText("\u00a72[Level Converter] Succesfully saved the generation code in '" + generationCodeFile.getName() + "'"));
                            } else {
                                player.addChatMessage(new ChatComponentText(EnumChatFormatting.RED + "[Level Converter] " + generationCodeFile.getName() + " already exists!"));
                            }
                        } else {
                            player.addChatMessage(new ChatComponentText("\u00a7C[Level Converter] The level converter wasn't able to find a Sign located in the level which displays the level info formatted like:"));
                            player.addChatMessage(new ChatComponentText(EnumChatFormatting.BLUE + "[Level Converter] " + (char)34 + "Easy Level" + (char)34));
                            player.addChatMessage(new ChatComponentText(EnumChatFormatting.BLUE + "[Level Converter] " + (char)34 + "    #1    " + (char)34));
                        }
                    } catch(Exception e) {
                        player.addChatMessage(new ChatComponentText("\u00a7C[Level Converter] Exception: " + e.getMessage() + ", report this back to MineMaarten please!"));
                        e.printStackTrace();
                    }
                }
            } else {
                player.addChatMessage(new ChatComponentText("\u00a7CPlease set a start coordinate first!"));
            }

            compound.removeTag("x");
            compound.removeTag("y");
            compound.removeTag("z");
        }
        return false;
    }

    private int getLevelNumber(World world, int startX, int startY, int startZ, int endX, int endY, int endZ){
        for(int i = startX; i <= endX; i++) {
            for(int j = startY; j <= endY; j++) {
                for(int k = startZ; k <= endZ; k++) {
                    if(world.getBlock(i, j, k) == Blocks.standing_sign || world.getBlock(i, j, k) == Blocks.wall_sign) {
                        TileEntity te = world.getTileEntity(i, j, k);
                        if(te instanceof TileEntitySign) {
                            String firstLine = ((TileEntitySign)te).signText[0].toLowerCase();
                            String secondLine = ((TileEntitySign)te).signText[1];

                            if(secondLine.length() == 2) {
                                try {
                                    lastLevelName = ((TileEntitySign)te).signText[2];
                                    int levelNumber = Integer.parseInt(secondLine.substring(1)) - 1; //cut off the '#' from #3 for instance, and convert to a number.
                                    if(firstLine.startsWith("tutorial")) return levelNumber;
                                    if(firstLine.startsWith("easy")) return 1000 + levelNumber;
                                    if(firstLine.startsWith("medium")) return 2000 + levelNumber;
                                    if(firstLine.startsWith("hard")) return 3000 + levelNumber;
                                } catch(Exception e) {}
                            }
                        }
                    }
                }
            }
        }
        return -1;
    }

    private void generateChestContents(World world, int startX, int startY, int startZ, int endX, int endY, int endZ, FileWriter writer){
        try {
            for(int i = startX; i <= endX; i++) {
                for(int j = startY; j <= endY; j++) {
                    for(int k = startZ; k <= endZ; k++) {
                        if(world.getBlock(i, j, k) == Blocks.chest && world.getTileEntity(i, j, k) != null && world.getTileEntity(i, j, k) instanceof TileEntityChest) {
                            TileEntityChest chest = (TileEntityChest)world.getTileEntity(i, j, k);

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
                                    //TODO
                                    // writer.write("(new ItemStack(" + SokobanUtils.getBlockString(stack.itemID) + ", " + stack.stackSize + ", " + stack.getItemDamage() + "))");

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
                        if(world.getBlock(i, j, k) == SokobanMod.BlockLootGenerator && world.getTileEntity(i, j, k) != null && world.getTileEntity(i, j, k) instanceof TileEntityLootGenerator) {
                            TileEntityLootGenerator lootGen = (TileEntityLootGenerator)world.getTileEntity(i, j, k);

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
                                //TODO
                                // writer.write("(new ItemStack(" + SokobanUtils.getBlockIDString(stack.itemID) + ", " + stack.stackSize + ", " + stack.getItemDamage() + "))");

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
                if(world.getBlock(i, startY, j) == Blocks.air) {
                    entranceCoords.add(i - startX);
                    entranceCoords.add(0);
                    entranceCoords.add(j - startZ);
                }
                if(world.getBlock(i, endY, j) == Blocks.air) {
                    entranceCoords.add(i - startX);
                    entranceCoords.add(endY - startY);
                    entranceCoords.add(j - startZ);
                }
            }
        }
        for(int i = startX; i <= endX; i++) {
            for(int j = startY + 1; j < endY; j++) {
                if(world.getBlock(i, j, startZ) == Blocks.air) {
                    entranceCoords.add(i - startX);
                    entranceCoords.add(j - startY);
                    entranceCoords.add(0);
                }
                if(world.getBlock(i, j, endZ) == Blocks.air) {
                    entranceCoords.add(i - startX);
                    entranceCoords.add(j - startY);
                    entranceCoords.add(endZ - startZ);
                }
            }
        }

        for(int i = startY + 1; i < endY; i++) {
            for(int j = startZ + 1; j < endZ; j++) {
                if(world.getBlock(startX, i, j) == Blocks.air) {
                    entranceCoords.add(0);
                    entranceCoords.add(i - startY);
                    entranceCoords.add(j - startZ);
                }
                if(world.getBlock(endX, i, j) == Blocks.air) {
                    entranceCoords.add(endX - startX);
                    entranceCoords.add(i - startY);
                    entranceCoords.add(j - startZ);
                }
            }
        }
        return entranceCoords;
    }

    private void handleSigns(World world, int x, int y, int z, int offsetX, int offsetY, int offsetZ, FileWriter generationCodeWriter){
        if(world.getBlock(x, y, z) == Blocks.standing_sign || world.getBlock(x, y, z) == Blocks.wall_sign) {
            TileEntity te = world.getTileEntity(x, y, z);
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
        if(world.getBlock(x, y, z) == SokobanMod.BlockTargetBox) {
            TileEntity te = world.getTileEntity(x, y, z);
            if(te instanceof TileEntityTargetBox) {
                try {
                    generationCodeWriter.write("if(world.getBlockTileEntity(baseX + " + offsetX + ", baseY + " + offsetY + ", baseZ + " + offsetZ + ") instanceof TileEntityTargetBox){" + NEW_LINE);
                    generationCodeWriter.write("\tTileEntityTargetBox teTb = (TileEntityTargetBox)world.getBlockTileEntity(baseX + " + offsetX + ", baseY + " + offsetY + ", baseZ + " + offsetZ + ");" + NEW_LINE);
                    generationCodeWriter.write("\tteTb.setLevelBounds(baseX, baseY, baseZ, baseX + " + maxX + ", baseY + " + maxY + ", baseZ + " + maxZ + ");" + NEW_LINE);
                    generationCodeWriter.write("\tteTb.levelDropped = getLevelNumber();" + NEW_LINE);

                    generationCodeWriter.write("}" + NEW_LINE);
                } catch(IOException e) {
                    System.out.println("Error when trying to write code for a Target Box!");
                }
            }
        }
    }

    private void handleChests(World world, int x, int y, int z, int offsetX, int offsetY, int offsetZ, FileWriter writer){
        if(world.getBlock(x, y, z) == Blocks.chest) {
            TileEntity te = world.getTileEntity(x, y, z);
            if(te instanceof TileEntityChest) {
                try {
                    writer.write("if(world.getBlockTileEntity(baseX + " + offsetX + ", baseY + " + offsetY + ", baseZ + " + offsetZ + ") instanceof TileEntityChest){" + NEW_LINE);
                    writer.write("\tTileEntityChest teC = (TileEntityChest)world.getBlockTileEntity(baseX + " + offsetX + ", baseY + " + offsetY + ", baseZ + " + offsetZ + ");" + NEW_LINE);
                    writer.write("\tLevelGenBase.setChestContents(teC, staticInventoryContents_" + offsetX + "_" + offsetY + "_" + offsetZ + ", randomInventoryContents_" + offsetX + "_" + offsetY + "_" + offsetZ + ");" + NEW_LINE + "}" + NEW_LINE);

                } catch(IOException e) {
                    System.out.println("Error when trying to write code for a Chest!");
                }
            }
        }
    }

    private void handleLootGenerators(World world, int x, int y, int z, int offsetX, int offsetY, int offsetZ, FileWriter writer){
        if(world.getBlock(x, y, z) == SokobanMod.BlockLootGenerator) {
            TileEntity te = world.getTileEntity(x, y, z);
            if(te instanceof TileEntityLootGenerator) {
                try {
                    writer.write("if(world.getBlockTileEntity(baseX + " + offsetX + ", baseY + " + offsetY + ", baseZ + " + offsetZ + ") instanceof TileEntityLootGenerator){" + NEW_LINE);
                    writer.write("\tTileEntityLootGenerator teLg = (TileEntityLootGenerator)world.getBlockTileEntity(baseX + " + offsetX + ", baseY + " + offsetY + ", baseZ + " + offsetZ + ");" + NEW_LINE);
                    writer.write("\tteLg.setAchievement(getLevelNumber());" + NEW_LINE);
                    writer.write("\tLevelGenBase.setLootGeneratorContents(teLg, staticInventoryContents_" + offsetX + "_" + offsetY + "_" + offsetZ + ", randomInventoryContents_" + offsetX + "_" + offsetY + "_" + offsetZ + ");" + NEW_LINE + "}" + NEW_LINE);

                } catch(IOException e) {
                    System.out.println("Error when trying to write code for a Loot Generator!");
                }
            }
        }
    }

    private void handleCommandBlocks(World world, int x, int y, int z, int offsetX, int offsetY, int offsetZ, FileWriter writer){
        if(world.getBlock(x, y, z) == Blocks.command_block) {
            TileEntity te = world.getTileEntity(x, y, z);
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
