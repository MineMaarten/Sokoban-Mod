package sokobanMod.common.gen;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.util.WeightedRandom;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraft.world.World;
import net.minecraftforge.common.ChestGenHooks;
import sokobanMod.common.SokobanMod;
import sokobanMod.common.SokobanUtils;
import sokobanMod.common.TileEntityLootGenerator;

public class levelGenBase{
    public static final int generateItem = 0;
    public static final int generateUnderground = 1;
    public static final int generateSurface = 2;

    public static final int levelNumber = 0;
    public static final int[] levelBounds = {};
    public static final int[] entranceCoords = {};

    public static void setBlockAndMetadata(World world, int x, int y, int z, int blockID, int metadata){
        world.setBlock(x, y, z, blockID, metadata, 3);

    }

    // child classes are going to override this function
    public static boolean generate(World world, int generationMethod, int baseX, int baseY, int baseZ){
        return false;
    }

    // this method returns the base Y-level it generates at. If it isn't
    // possible to generate here, the method returns 0.
    public static int canGenerateHereAndClear(World world, int generationMethod, int[] entranceCoords, int minX, int minY, int minZ, int maxX, int maxY, int maxZ){

        if(generationMethod != generateItem && flatWorld(world, minX, minZ)) return 0;// disable
                                                                                      // worldgen
                                                                                      // on
                                                                                      // flatworlds.

        if(generationMethod == generateUnderground) {
            // underground levels have to collide with caves to be allowed to
            // generate
            boolean caveFound = false;
            for(int i = 0; i < entranceCoords.length - 2; i += 3) { // cycle
                                                                    // until no
                                                                    // 3 ints
                                                                    // are
                                                                    // available
                                                                    // anymore
                if(world.getBlockId(minX + entranceCoords[i], minY + entranceCoords[i + 1], minZ + entranceCoords[i + 2]) == 0) caveFound = true; // when
                                                                                                                                                  // an
                                                                                                                                                  // entrance
                                                                                                                                                  // is
                                                                                                                                                  // colliding
                                                                                                                                                  // with
                                                                                                                                                  // air,
                                                                                                                                                  // a
                                                                                                                                                  // cave
                                                                                                                                                  // is
                                                                                                                                                  // found!
            }
            if(!caveFound) return 0;
        } else if(generationMethod == generateSurface) {
            // surface levels need a flat surface to generate on.
            int yOffset = maxY - minY; // store the height of the level.
            minY = getFlatLandLevel(world, minX, minZ, maxX, maxZ);
            if(minY < 5) return 0;
            maxY = minY + yOffset;
        }

        // Check if the potential level is going to collide with other levels
        if(SokobanUtils.isCollidingWithLevel(world, minX, minY, minZ, maxX, maxY, maxZ)) return 0;

        // when the generation code has passed all the requirements, clear the
        // level
        for(int i = minX; i <= maxX; i++) {
            for(int j = minY; j <= maxY; j++) {
                for(int k = minZ; k <= maxZ; k++) {
                    setBlockAndMetadata(world, i, j, k, 0, 0); // Clear the
                                                               // level first
                }
            }
        }
        return minY;
    }

    private static boolean flatWorld(World world, int baseX, int baseZ){
        for(int i = 0; i < 100; i++) { // check 100 blocks between level 10 and
                                       // 20, if they arent stone or netherrack,
                                       // we are on a flatworld
            Random rand = new Random();
            int randX = baseX + rand.nextInt(50);
            int randY = 10 + rand.nextInt(10);
            int randZ = baseZ + rand.nextInt(50);
            int blockID = world.getBlockId(randX, randY, randZ);
            if(blockID == Block.stone.blockID || blockID == Block.netherrack.blockID) return false;
        }
        return true;
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
                    if(world.getBlockId(i, Y, j) != 0 && world.getBlockId(i, Y, j) != Block.tallGrass.blockID) currentLevel++; // increase
                                                                                                                               // the
                                                                                                                               // counter
                                                                                                                               // when
                                                                                                                               // it
                                                                                                                               // finds
                                                                                                                               // a
                                                                                                                               // block.
                    if(world.getBlockId(i, Y, j) == Block.waterStill.blockID) return 0;
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
                    if(item.itemID == SokobanMod.ItemLevelGeneratorTutorial.itemID) item.setItemDamage(rand.nextInt(SokobanMod.EASY_LEVEL_AMOUNT) + 1000);
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
