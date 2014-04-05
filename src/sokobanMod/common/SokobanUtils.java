package sokobanMod.common;

import java.util.Random;

import sokobanMod.common.network.PacketSpawnParticle;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

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
                    if(world.getBlock(i, j, k) != Blocks.air && world.getBlock(i, j, k).getBlockHardness(world, i, j, k) < 0F) return true;
                }
            }
        }
        return false;
    }

    public static String getBlockString(Block block){
        if(block == Blocks.standing_sign) return "Block.signPost.blockID";
        if(block == Blocks.wall_sign) return "Block.signWall.blockID";
        if(block == Blocks.lever) return "Block.lever.blockID";
        if(block == Blocks.stone_button) return "Block.stoneButton.blockID";
        if(block == Blocks.torch) return "Block.torchWood.blockID";
        if(block == Blocks.iron_door) return "Block.doorSteel.blockID";
        if(block == Blocks.wooden_door) return "Block.doorWood.blockID";
        if(block == Blocks.redstone_wire) return "Block.redstoneWire.blockID";
        if(block == Blocks.unpowered_repeater) return "Block.redstoneRepeaterIdle.blockID";
        if(block == Blocks.powered_repeater) return "Block.redstoneRepeaterActive.blockID";
        if(block == Blocks.unlit_redstone_torch) return "Block.torchRedstoneIdle.blockID";
        if(block == Blocks.redstone_torch) return "Block.torchRedstoneActive.blockID";
        if(block == Blocks.stone) return "Block.stone.blockID";
        if(block == Blocks.bedrock) return "Block.bedrock.blockID";
        if(block == Blocks.chest) return "Block.chest.blockID";
        if(block == Blocks.ladder) return "Block.ladder.blockID";
        if(block == Blocks.tripwire) return "Block.tripWire.blockID";
        if(block == Blocks.tripwire_hook) return "Block.tripWireSource.blockID";
        if(block == Blocks.light_weighted_pressure_plate) return "Block.pressurePlateGold.blockID";
        if(block == Blocks.heavy_weighted_pressure_plate) return "Block.pressurePlateIron.blockID";
        if(block == Blocks.wooden_pressure_plate) return "Block.pressurePlatePlanks.blockID";
        if(block == Blocks.stone_pressure_plate) return "Block.pressurePlateStone.blockID";

        if(block == SokobanMod.BlockTargetBox) return "SokobanMod.BlockTargetBox.blockID";
        if(block == SokobanMod.BlockUnbreakableSolids) return "SokobanMod.BlockUnbreakableSolids.blockID";
        if(block == SokobanMod.BlockUnbreakableGlasses) return "SokobanMod.BlockUnbreakableGlasses.blockID";
        if(block == SokobanMod.BlockUnbreakableLamps) return "SokobanMod.BlockUnbreakableLamps.blockID";
        if(block == SokobanMod.BlockTarget) return "SokobanMod.BlockTarget.blockID";
        if(block == SokobanMod.BlockRedstoneRemover) return "SokobanMod.BlockRedstoneRemover.blockID";
        if(block == SokobanMod.BlockLootGenerator) return "SokobanMod.BlockLootGenerator.blockID";
        if(block == SokobanMod.BlockVaporizingBlock) return "SokobanMod.BlockVaporizingBlock.blockID";

        // if(item == SokobanMod.ItemLevelGeneratorTutorial) return "SokobanMod.ItemLevelGeneratorTutorial.itemID";

        return "" + block;
    }

    // if update here, update at BlockTargetBox as well.
    public static boolean isBlockInstable(Block block){
        return block == Blocks.standing_sign
        		|| block == Blocks.wall_sign
        		|| block == Blocks.lever
        		|| block == Blocks.stone_button
        		|| block == Blocks.torch
        		|| block == Blocks.iron_door
        		|| block == Blocks.wooden_door
        		|| block == Blocks.redstone_wire
        		|| block == Blocks.unpowered_repeater
        		|| block == Blocks.powered_repeater
        		|| block == Blocks.unlit_redstone_torch
        		|| block == Blocks.redstone_torch
        		|| block == Blocks.ladder
        		|| block == Blocks.tripwire
        		|| block == Blocks.tripwire_hook
        		|| block == Blocks.stone_pressure_plate
        		|| block == Blocks.wooden_pressure_plate
        		|| block == Blocks.light_weighted_pressure_plate
        		|| block == Blocks.heavy_weighted_pressure_plate
        		|| block == SokobanMod.BlockTargetBox;
    }

    // This method returns true if a loot generator has been removed.
    public static boolean removeLevel(World world, int minX, int minY, int minZ, int maxX, int maxY, int maxZ, Random rand){
        boolean lootGeneratorFound = false;
        for(int i = minX; i <= maxX; i++) {
            for(int j = minY; j <= maxY; j++) {
                for(int k = minZ; k <= maxZ; k++) {
                    if(world.getBlock(i, j, k) == SokobanMod.BlockLootGenerator) lootGeneratorFound = true;
                    if(world.getBlock(i, j, k) == Blocks.chest) {
                        TileEntity te = world.getTileEntity(i, j, k);
                        if(te instanceof TileEntityChest) {
                            TileEntityChest teC = (TileEntityChest)te;
                            for(int slot = 0; slot < teC.getSizeInventory(); slot++) {
                                teC.setInventorySlotContents(slot, null);
                            }
                        }
                    }
                    if(SokobanUtils.isBlockInstable(world.getBlock(i, j, k))) world.setBlock(i, j, k, Blocks.air);
                }
            }
        }
        for(int i = minX; i <= maxX; i++) {
            for(int j = minY; j <= maxY; j++) {
                for(int k = minZ; k <= maxZ; k++) {
                    if(rand.nextInt(10) == 0) spawnParticle("explode", i + 0.5D, j + 0.5D, k + 0.5D, 0.0D, 0.0D, 0.0D);
                    world.setBlock(i, j, k, Blocks.air);
                }
            }
        }
        return lootGeneratorFound;
    }

    public static void spawnParticle(String string, double g, double h, double i, double d, double e, double f){
    	SokobanMod.packetPipeline.sendToAll(new PacketSpawnParticle(string, g, h, i, d, e, f));
    }
}
