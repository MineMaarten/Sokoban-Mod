package sokobanMod.common.gen;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.util.WeightedRandom;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraft.world.World;
import net.minecraftforge.common.ChestGenHooks;
import sokobanMod.common.LevelRegistrator;
import sokobanMod.common.SokobanMod;
import sokobanMod.common.SokobanUtils;
import sokobanMod.common.TileEntityLootGenerator;

public class levelGenBase{
    public static final int generateItem = 0;
    public static final int generateUnderground = 1;
    public static final int generateSurface = 2;

    public static void setBlockAndMetadata(World world, int x, int y, int z, Block block, int metadata){
        world.setBlock(x, y, z, block, metadata, 3);

    }

    // this method returns the base Y-level it generates at. If it isn't
    // possible to generate here, the method returns 0.
    public static int canGenerateHereAndClear(World world, int levelNumber, ISokobanLevel.EnumGenerationMethod generationMethod, int minX, int minY, int minZ){
        int[] entranceCoords = LevelRegistrator.getLevelEntrances(levelNumber);
        int[] levelBounds = LevelRegistrator.getLevelBounds(levelNumber);
        if(generationMethod == ISokobanLevel.EnumGenerationMethod.UNDERGROUND) {
            // underground levels have to collide with caves to be allowed to
            // generate
            boolean caveFound = false;
            for(int i = 0; i < entranceCoords.length - 2; i += 3) { // cycle
                                                                    // until no
                                                                    // 3 ints
                                                                    // are
                                                                    // available
                                                                    // anymore
                if(world.getBlock(minX + entranceCoords[i], minY + entranceCoords[i + 1], minZ + entranceCoords[i + 2]) == Blocks.air) caveFound = true;
            }
            if(!caveFound) return 0;
        } else if(generationMethod == ISokobanLevel.EnumGenerationMethod.SURFACE) {
            // surface levels need a flat surface to generate on.
            minY = getFlatLandLevel(world, minX, minZ, minX + levelBounds[0], minZ + levelBounds[1]);
            if(minY < 5) return 0;
        }

        // Check if the potential level is going to collide with other levels
        if(SokobanUtils.isCollidingWithLevel(world, minX, minY, minZ, minX + levelBounds[0], minY + levelBounds[1], minZ + levelBounds[2])) return 0;

        // when the generation code has passed all the requirements, clear the
        // level
        for(int i = minX; i <= minX + levelBounds[0]; i++) {
            for(int j = minY; j <= minY + levelBounds[1]; j++) {
                for(int k = minZ; k <= minZ + levelBounds[2]; k++) {
                    setBlockAndMetadata(world, i, j, k, Blocks.air, 0); // Clear the
                                                               // level first
                }
            }
        }
        return minY;
    }

    private static int getFlatLandLevel(World world, int minX, int minZ, int maxX, int maxZ){
        int lastLevel = 0; // the last level the amount of solid blocks were
                           // measured of.
        int currentLevel = 0; // the current level we are measuring the amount
                              // of solid blocks.

        for(int Y = 100; Y > 0; Y--) {
            lastLevel = currentLevel; // begin a new measurement.
            currentLevel = 0; // reset the counter
            for(int i = minX; i <= maxX; i++) {
                for(int j = minZ; j <= maxZ; j++) {
                    if(world.getBlock(i, Y, j) != Blocks.air && world.getBlock(i, Y, j) != Blocks.tallgrass) currentLevel++; // increase
                                                                                                                               // the
                                                                                                                               // counter
                                                                                                                               // when
                                                                                                                               // it
                                                                                                                               // finds
                                                                                                                               // a
                                                                                                                               // block.
                    if(world.getBlock(i, Y, j) == Blocks.water) return 0;
                }
            }
            if(lastLevel < currentLevel - (maxX - minX) * (maxZ - minZ) * 0.9F && Y != 100) { // if the underlying Y level has 90% more
                                                                                              // blocks then the Y level above call it
                                                                                              // flat.
                return Y + 1;
            }
        }

        return 0;
    }

    public static void setChestContents(TileEntityChest chest, ItemStack[] staticStacks, WeightedRandomChestContent[] randomStacks){
        Random rand = new Random();
        // fill in the random stacks first.
        if(randomStacks.length > 0) {
            WeightedRandomChestContent.generateChestContents(rand, randomStacks, chest, 5);
        }

        // then fill in the static stacks, and do that in a way that they don't
        // overwrite each other, so they will be guarenteed to be in the chest.
        List<Integer> occupiedSlots = new ArrayList<Integer>();
        // System.out.println("----------------------");
        for(ItemStack staticStack : staticStacks) {
            int slot = rand.nextInt(chest.getSizeInventory());
            do {
                slot = rand.nextInt(chest.getSizeInventory());
            } while(occupiedSlots.contains(slot)); // this will cause a crash if
                                                   // the staticStacks[] is
                                                   // bigger than
                                                   // getSizeInventory.
            // System.out.println("Slot chosen: " + slot);
            chest.setInventorySlotContents(slot, staticStack);
        }
    }

    public static void setLootGeneratorContents(TileEntityLootGenerator lootGen, ItemStack[] staticStacks, WeightedRandomChestContent[] randomStacks){
        Random rand = new Random();
        // fill in the random stacks first.
        if(randomStacks.length > 0) {
            for(int j = 0; j < 5; ++j) {
                WeightedRandomChestContent weightedrandomchestcontent = (WeightedRandomChestContent)WeightedRandom.getRandomItem(rand, randomStacks);
                //int k = weightedrandomchestcontent.theMinimumChanceToGenerateItem + rand.nextInt(weightedrandomchestcontent.theMaximumChanceToGenerateItem - weightedrandomchestcontent.theMinimumChanceToGenerateItem + 1);

                ItemStack[] stacks = ChestGenHooks.generateStacks(rand, weightedrandomchestcontent.theItemId, weightedrandomchestcontent.theMinimumChanceToGenerateItem, weightedrandomchestcontent.theMaximumChanceToGenerateItem);

                for(ItemStack item : stacks) {
                    if(item == new ItemStack(SokobanMod.ItemLevelGeneratorTutorial)) item.setItemDamage(LevelRegistrator.getRandomNonTutorialLevel(rand));
                    lootGen.addLoot(item);
                }
            }
        }

        // then add the static stacks.
        for(ItemStack staticStack : staticStacks) {
            lootGen.addLoot(staticStack.copy());
        }
    }
}
