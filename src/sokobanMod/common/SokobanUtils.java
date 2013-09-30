package sokobanMod.common;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.PacketDispatcher;

/**
 * Sokoban Mod
 * @author MineMaarten
 * www.minemaarten.com
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */

public class SokobanUtils{

    public static int determineOrientation(EntityPlayer par4EntityPlayer){
        return MathHelper.floor_double(par4EntityPlayer.rotationYaw * 4.0F / 360.0F + 0.5D) & 3;
        // 0 : Z+
        // 1 : X-
        // 2 : Z-
        // 3 : X+
    }

    public static boolean isCollidingWithLevel(World world, int minX, int minY, int minZ, int maxX, int maxY, int maxZ){
        for(int i = minX; i <= maxX; i++) {
            for(int j = minY; j <= maxY; j++) {
                for(int k = minZ; k <= maxZ; k++) {
                    if(world.getBlockId(i, j, k) != 0 && Block.blocksList[world.getBlockId(i, j, k)].getBlockHardness(world, i, j, k) < 0F) return true;
                }
            }
        }
        return false;
    }

    public static String getBlockIDString(int blockID){
        if(blockID == Block.signPost.blockID) return "Block.signPost.blockID";
        if(blockID == Block.signWall.blockID) return "Block.signWall.blockID";
        if(blockID == Block.lever.blockID) return "Block.lever.blockID";
        if(blockID == Block.stoneButton.blockID) return "Block.stoneButton.blockID";
        if(blockID == Block.torchWood.blockID) return "Block.torchWood.blockID";
        if(blockID == Block.doorIron.blockID) return "Block.doorSteel.blockID";
        if(blockID == Block.doorWood.blockID) return "Block.doorWood.blockID";
        if(blockID == Block.redstoneWire.blockID) return "Block.redstoneWire.blockID";
        if(blockID == Block.redstoneRepeaterIdle.blockID) return "Block.redstoneRepeaterIdle.blockID";
        if(blockID == Block.redstoneRepeaterActive.blockID) return "Block.redstoneRepeaterActive.blockID";
        if(blockID == Block.torchRedstoneIdle.blockID) return "Block.torchRedstoneIdle.blockID";
        if(blockID == Block.torchRedstoneActive.blockID) return "Block.torchRedstoneActive.blockID";
        if(blockID == Block.stone.blockID) return "Block.stone.blockID";
        if(blockID == Block.bedrock.blockID) return "Block.bedrock.blockID";
        if(blockID == Block.chest.blockID) return "Block.chest.blockID";
        if(blockID == Block.ladder.blockID) return "Block.ladder.blockID";
        if(blockID == Block.tripWire.blockID) return "Block.tripWire.blockID";
        if(blockID == Block.tripWireSource.blockID) return "Block.tripWireSource.blockID";
        if(blockID == Block.pressurePlateGold.blockID) return "Block.pressurePlateGold.blockID";
        if(blockID == Block.pressurePlateIron.blockID) return "Block.pressurePlateIron.blockID";
        if(blockID == Block.pressurePlatePlanks.blockID) return "Block.pressurePlatePlanks.blockID";
        if(blockID == Block.pressurePlateStone.blockID) return "Block.pressurePlateStone.blockID";

        if(blockID == SokobanMod.BlockTargetBox.blockID) return "SokobanMod.BlockTargetBox.blockID";
        if(blockID == SokobanMod.BlockUnbreakableSolids.blockID) return "SokobanMod.BlockUnbreakableSolids.blockID";
        if(blockID == SokobanMod.BlockUnbreakableGlasses.blockID) return "SokobanMod.BlockUnbreakableGlasses.blockID";
        if(blockID == SokobanMod.BlockUnbreakableLamps.blockID) return "SokobanMod.BlockUnbreakableLamps.blockID";
        if(blockID == SokobanMod.BlockTarget.blockID) return "SokobanMod.BlockTarget.blockID";
        if(blockID == SokobanMod.BlockRedstoneRemover.blockID) return "SokobanMod.BlockRedstoneRemover.blockID";
        if(blockID == SokobanMod.BlockLootGenerator.blockID) return "SokobanMod.BlockLootGenerator.blockID";
        if(blockID == SokobanMod.BlockVaporizingBlock.blockID) return "SokobanMod.BlockVaporizingBlock.blockID";

        if(blockID == SokobanMod.ItemLevelGeneratorTutorial.itemID) return "SokobanMod.ItemLevelGeneratorTutorial.itemID";

        return "" + blockID;
    }

    // if update here, update at BlockTargetBox as well.
    public static boolean isBlockInstable(int blockID){
        return blockID == Block.signPost.blockID || blockID == Block.signWall.blockID || blockID == Block.lever.blockID || blockID == Block.stoneButton.blockID || blockID == Block.torchWood.blockID || blockID == Block.doorIron.blockID || blockID == Block.doorWood.blockID || blockID == Block.redstoneWire.blockID || blockID == Block.redstoneRepeaterIdle.blockID || blockID == Block.redstoneRepeaterActive.blockID || blockID == Block.torchRedstoneIdle.blockID || blockID == Block.torchRedstoneActive.blockID || blockID == Block.ladder.blockID || blockID == Block.tripWire.blockID || blockID == Block.tripWireSource.blockID || blockID == Block.pressurePlateStone.blockID || blockID == Block.pressurePlatePlanks.blockID || blockID == Block.pressurePlateGold.blockID || blockID == Block.pressurePlateIron.blockID || blockID == SokobanMod.BlockTargetBox.blockID;
    }

    // This method returns true if a loot generator has been removed.
    public static boolean removeLevel(World world, int minX, int minY, int minZ, int maxX, int maxY, int maxZ, Random rand){
        boolean lootGeneratorFound = false;
        for(int i = minX; i <= maxX; i++) {
            for(int j = minY; j <= maxY; j++) {
                for(int k = minZ; k <= maxZ; k++) {
                    if(world.getBlockId(i, j, k) == SokobanMod.BlockLootGenerator.blockID) lootGeneratorFound = true;
                    if(world.getBlockId(i, j, k) == Block.chest.blockID) {
                        TileEntity te = world.getBlockTileEntity(i, j, k);
                        if(te instanceof TileEntityChest) {
                            TileEntityChest teC = (TileEntityChest)te;
                            for(int slot = 0; slot < teC.getSizeInventory(); slot++) {
                                teC.setInventorySlotContents(slot, null);
                            }
                        }
                    }
                    if(SokobanUtils.isBlockInstable(world.getBlockId(i, j, k))) world.setBlock(i, j, k, 0);
                }
            }
        }
        for(int i = minX; i <= maxX; i++) {
            for(int j = minY; j <= maxY; j++) {
                for(int k = minZ; k <= maxZ; k++) {
                    if(rand.nextInt(10) == 0) spawnParticle("explode", i + 0.5D, j + 0.5D, k + 0.5D, 0.0D, 0.0D, 0.0D);
                    world.setBlock(i, j, k, 0);
                }
            }
        }
        return lootGeneratorFound;
    }

    public static void spawnParticle(String string, double g, double h, double i, double d, double e, double f){
        PacketDispatcher.sendPacketToAllPlayers(PacketHandlerSokoban.spawnParticle(string, g, h, i, d, e, f));
    }
}
