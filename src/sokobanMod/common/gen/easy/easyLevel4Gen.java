package sokobanMod.common.gen.easy;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntitySign;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraft.world.World;
import sokobanMod.common.SokobanMod;
import sokobanMod.common.TileEntityLootGenerator;
import sokobanMod.common.TileEntityTargetBox;
import sokobanMod.common.gen.levelGenBase;

/**
 * Sokoban Mod
 * @author MineMaarten, level designed by Simon Q
 * www.minemaarten.com
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */

public class easyLevel4Gen{
    public static final int levelNumber = 1003;
    public static final int[] levelBounds = {9, 9, 9};
    public static final int[] entranceCoords = {7, 1, 9, 7, 2, 9, 7, 3, 9, 7, 4, 9, 8, 2, 9, 8, 3, 9, 8, 4, 9, 8, 5, 9, 9, 3, 9, 9, 4, 9, 9, 5, 9, 9, 6, 9, 9, 4, 8, 9, 5, 7, 9, 5, 8, 9, 6, 6, 9, 6, 7, 9, 6, 8, 9, 7, 6, 9, 7, 7, 9, 7, 8};
    public static final ItemStack[] staticInventoryContents_3_6_8 = new ItemStack[]{};
    public static final WeightedRandomChestContent[] randomInventoryContents_3_6_8 = new WeightedRandomChestContent[]{new WeightedRandomChestContent(Item.stick.itemID, 0, 1, 3, 50), new WeightedRandomChestContent(Block.planks.blockID, 0, 1, 3, 50), new WeightedRandomChestContent(Block.workbench.blockID, 0, 1, 3, 30), new WeightedRandomChestContent(Block.chest.blockID, 0, 1, 2, 100), new WeightedRandomChestContent(SokobanMod.ItemLevelGeneratorTutorial.itemID, 0, 1, 1, 50), new WeightedRandomChestContent(Item.helmetChain.itemID, 0, 1, 1, 10), new WeightedRandomChestContent(Item.plateChain.itemID, 0, 1, 1, 10), new WeightedRandomChestContent(Item.bootsChain.itemID, 0, 1, 1, 10), new WeightedRandomChestContent(Item.legsChain.itemID, 0, 1, 1, 10)};

    public static boolean generate(World world, int generationMethod, int baseX, int baseY, int baseZ){

        int flatY = levelGenBase.canGenerateHereAndClear(world, generationMethod, entranceCoords, baseX, baseY, baseZ, baseX + 9, baseY + 9, baseZ + 9);
        if(flatY == 0) return false;
        if(generationMethod == levelGenBase.generateSurface) baseY = flatY;

        // base blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 0, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 0, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 0, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 0, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 0, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 0, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 0, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 0, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 0, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 0, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 1, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 1, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 1, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 1, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 1, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 1, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 1, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 1, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 1, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 1, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 2, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 2, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 2, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 2, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 2, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 2, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 2, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 2, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 2, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 2, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 3, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 3, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 3, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 3, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 3, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 3, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 3, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 3, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 3, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 3, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 4, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 4, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 4, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 4, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 4, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 4, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 4, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 4, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 4, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 4, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 5, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 5, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 5, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 5, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 5, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 5, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 5, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 5, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 5, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 5, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 6, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 6, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 6, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 6, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 6, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 6, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 6, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 6, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 6, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 6, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 7, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 7, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 7, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 7, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 7, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 7, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 7, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 7, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 7, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 7, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 8, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 8, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 8, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 8, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 8, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 8, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 8, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 8, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 8, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 8, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 9, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 9, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 9, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 9, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 9, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 9, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 9, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 9, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 9, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 9, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 0, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 0, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 0, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 0, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 0, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 0, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 0, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 0, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 0, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 0, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 1, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 1, baseZ + 2, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Glass
                                                                                                                                 // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 1, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 2, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 2, baseZ + 2, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Glass
                                                                                                                                 // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 2, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 3, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 3, baseZ + 2, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Glass
                                                                                                                                 // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 3, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 4, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 4, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 4, baseZ + 2, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Glass
                                                                                                                                 // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 4, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 5, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 5, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 5, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 5, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 5, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 5, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 5, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 5, baseZ + 8, SokobanMod.BlockTarget.blockID, 0); // tile.Target
        levelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 5, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 6, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 6, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 7, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 7, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 8, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 8, baseZ + 9, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Glass
                                                                                                                                 // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 9, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 9, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 9, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 9, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 9, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 9, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 9, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 9, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 9, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 9, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 0, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 0, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 0, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 0, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 0, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 0, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 0, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 0, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 0, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 0, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 1, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 1, baseZ + 2, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Glass
                                                                                                                                 // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 1, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 2, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 2, baseZ + 2, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Glass
                                                                                                                                 // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 2, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 3, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 3, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 3, baseZ + 2, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Glass
                                                                                                                                 // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 3, baseZ + 5, Block.stone.blockID, 0); // tile.stone
        levelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 3, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 4, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 4, baseZ + 2, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Glass
                                                                                                                                 // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 4, baseZ + 6, Block.stone.blockID, 0); // tile.stone
        levelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 4, baseZ + 8, Block.stone.blockID, 0); // tile.stone
        levelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 4, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 5, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 5, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 5, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 5, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 5, baseZ + 7, Block.bedrock.blockID, 0); // tile.bedrock
        levelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 5, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 6, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 6, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 6, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 6, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 6, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 6, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 6, baseZ + 7, SokobanMod.BlockVaporizingBlock.blockID, 0); // tile.Vaporizing
                                                                                                                              // Block
        levelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 6, baseZ + 8, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Glass
                                                                                                                                 // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 6, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 7, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 7, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 7, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 7, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 7, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 7, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 7, baseZ + 7, SokobanMod.BlockVaporizingBlock.blockID, 0); // tile.Vaporizing
                                                                                                                              // Block
        levelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 7, baseZ + 8, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Glass
                                                                                                                                 // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 7, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 8, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 8, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 8, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 8, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 8, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 8, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 8, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 8, baseZ + 8, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Glass
                                                                                                                                 // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 8, baseZ + 9, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Glass
                                                                                                                                 // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 9, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 9, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 9, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 9, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 9, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 9, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 9, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 9, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 9, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 9, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 0, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 0, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 0, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 0, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 0, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 0, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 0, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 0, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 0, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 0, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 1, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 1, baseZ + 2, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Glass
                                                                                                                                 // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 1, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 2, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 2, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 2, baseZ + 2, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Glass
                                                                                                                                 // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 2, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 3, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 3, baseZ + 2, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Glass
                                                                                                                                 // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 3, baseZ + 5, Block.stone.blockID, 0); // tile.stone
        levelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 3, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 4, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 4, baseZ + 2, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Glass
                                                                                                                                 // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 4, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 5, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 5, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 5, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 5, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 5, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 5, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 5, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 5, baseZ + 8, Block.bedrock.blockID, 0); // tile.bedrock
        levelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 5, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 6, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 6, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 6, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 6, baseZ + 6, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Glass
                                                                                                                                 // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 6, baseZ + 8, SokobanMod.BlockLootGenerator.blockID, 0); // tile.Loot
                                                                                                                            // Generator
        if(world.getBlockTileEntity(baseX + 3, baseY + 6, baseZ + 8) instanceof TileEntityLootGenerator) {
            TileEntityLootGenerator teLg = (TileEntityLootGenerator)world.getBlockTileEntity(baseX + 3, baseY + 6, baseZ + 8);
            levelGenBase.setLootGeneratorContents(teLg, staticInventoryContents_3_6_8, randomInventoryContents_3_6_8);
        }
        levelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 6, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 7, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 7, baseZ + 1, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Glass
                                                                                                                                 // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 7, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 7, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 7, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 8, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 8, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 8, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 8, baseZ + 4, SokobanMod.BlockUnbreakableLamps.blockID, 3); // tile.Unbreakable
                                                                                                                               // Lamp
                                                                                                                               // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 8, baseZ + 6, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Glass
                                                                                                                                 // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 8, baseZ + 9, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Glass
                                                                                                                                 // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 9, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 9, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 9, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 9, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 9, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 9, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 9, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 9, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 9, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 9, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 0, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 0, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 0, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 0, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 0, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 0, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 0, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 0, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 0, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 0, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 1, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 1, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 1, baseZ + 2, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Glass
                                                                                                                                 // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 1, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 2, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 2, baseZ + 2, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Glass
                                                                                                                                 // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 2, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 3, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 3, baseZ + 2, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Glass
                                                                                                                                 // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 3, baseZ + 5, Block.stone.blockID, 0); // tile.stone
        levelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 3, baseZ + 6, Block.stone.blockID, 0); // tile.stone
        levelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 3, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 4, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 4, baseZ + 2, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Glass
                                                                                                                                 // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 4, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 5, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 5, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 5, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 5, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 5, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 5, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 5, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 5, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 5, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 5, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 6, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 6, baseZ + 6, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Glass
                                                                                                                                 // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 6, baseZ + 7, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Glass
                                                                                                                                 // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 6, baseZ + 8, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Glass
                                                                                                                                 // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 6, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 7, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 7, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 8, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 8, baseZ + 1, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Glass
                                                                                                                                 // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 8, baseZ + 2, SokobanMod.BlockUnbreakableLamps.blockID, 3); // tile.Unbreakable
                                                                                                                               // Lamp
                                                                                                                               // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 8, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 8, baseZ + 6, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Glass
                                                                                                                                 // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 8, baseZ + 7, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Glass
                                                                                                                                 // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 8, baseZ + 8, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Glass
                                                                                                                                 // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 8, baseZ + 9, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Glass
                                                                                                                                 // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 9, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 9, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 9, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 9, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 9, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 9, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 9, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 9, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 9, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 9, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 0, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 0, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 0, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 0, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 0, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 0, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 0, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 0, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 0, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 0, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 1, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 1, baseZ + 2, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Glass
                                                                                                                                 // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 1, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 1, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 2, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 2, baseZ + 2, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Glass
                                                                                                                                 // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 2, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 2, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 3, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 3, baseZ + 2, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Glass
                                                                                                                                 // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 3, baseZ + 6, Block.stone.blockID, 0); // tile.stone
        levelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 3, baseZ + 7, Block.stone.blockID, 0); // tile.stone
        levelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 3, baseZ + 8, Block.stone.blockID, 0); // tile.stone
        levelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 3, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 4, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 4, baseZ + 2, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Glass
                                                                                                                                 // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 4, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 5, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 5, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 5, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 5, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 5, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 5, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 5, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 5, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 5, baseZ + 8, SokobanMod.BlockTarget.blockID, 0); // tile.Target
        levelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 5, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 6, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 6, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 6, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 6, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 7, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 7, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 7, baseZ + 4, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Glass
                                                                                                                                 // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 7, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 7, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 8, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 8, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 8, baseZ + 4, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Glass
                                                                                                                                 // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 8, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 8, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 8, baseZ + 9, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Glass
                                                                                                                                 // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 9, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 9, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 9, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 9, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 9, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 9, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 9, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 9, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 9, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 9, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 0, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 0, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 0, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 0, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 0, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 0, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 0, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 0, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 0, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 0, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 1, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 1, baseZ + 2, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Glass
                                                                                                                                 // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 1, baseZ + 3, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Glass
                                                                                                                                 // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 1, baseZ + 4, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Glass
                                                                                                                                 // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 1, baseZ + 5, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Glass
                                                                                                                                 // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 1, baseZ + 6, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Glass
                                                                                                                                 // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 1, baseZ + 7, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Glass
                                                                                                                                 // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 1, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 1, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 2, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 2, baseZ + 2, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Glass
                                                                                                                                 // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 2, baseZ + 3, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Glass
                                                                                                                                 // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 2, baseZ + 4, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Glass
                                                                                                                                 // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 2, baseZ + 5, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Glass
                                                                                                                                 // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 2, baseZ + 6, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Glass
                                                                                                                                 // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 2, baseZ + 7, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Glass
                                                                                                                                 // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 2, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 2, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 3, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 3, baseZ + 2, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Glass
                                                                                                                                 // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 3, baseZ + 3, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Glass
                                                                                                                                 // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 3, baseZ + 4, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Glass
                                                                                                                                 // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 3, baseZ + 5, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Glass
                                                                                                                                 // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 3, baseZ + 6, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Glass
                                                                                                                                 // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 3, baseZ + 7, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Glass
                                                                                                                                 // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 3, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 3, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 4, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 4, baseZ + 2, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Glass
                                                                                                                                 // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 4, baseZ + 3, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Glass
                                                                                                                                 // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 4, baseZ + 4, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Glass
                                                                                                                                 // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 4, baseZ + 5, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Glass
                                                                                                                                 // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 4, baseZ + 6, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Glass
                                                                                                                                 // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 4, baseZ + 7, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Glass
                                                                                                                                 // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 4, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 4, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 5, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 5, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 5, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 5, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 5, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 5, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 5, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 5, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 5, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 5, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 6, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 6, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 6, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 6, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 7, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 7, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 7, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 7, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 8, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 8, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 8, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 8, baseZ + 9, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Glass
                                                                                                                                 // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 9, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 9, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 9, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 9, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 9, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 9, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 9, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 9, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 9, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 9, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 0, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 0, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 0, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 0, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 0, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 0, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 0, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 0, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 0, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 0, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 1, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 1, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 2, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 2, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 3, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 3, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 4, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 4, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 5, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 5, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 5, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 5, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 5, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 5, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 5, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 5, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 5, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 5, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 6, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 6, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 6, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 6, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 6, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 7, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 7, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 7, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 7, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 7, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 8, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 8, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 8, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 8, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 8, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 8, baseZ + 9, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Glass
                                                                                                                                 // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 9, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 9, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 9, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 9, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 9, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 9, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 9, baseZ + 6, SokobanMod.BlockUnbreakableLamps.blockID, 3); // tile.Unbreakable
                                                                                                                               // Lamp
                                                                                                                               // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 9, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 9, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 9, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 0, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 0, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 0, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 0, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 0, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 0, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 0, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 0, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 0, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 0, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 1, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 1, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 1, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 1, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 1, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 2, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 2, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 2, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 2, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 3, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 3, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 3, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 3, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 4, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 4, baseZ + 1, SokobanMod.BlockUnbreakableLamps.blockID, 3); // tile.Unbreakable
                                                                                                                               // Lamp
                                                                                                                               // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 4, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 4, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 4, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 5, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 5, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 5, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 5, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 5, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 5, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 6, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 6, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 6, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 6, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 7, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 7, baseZ + 5, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Glass
                                                                                                                                 // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 7, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 7, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 7, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 8, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 8, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 8, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 8, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 8, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 8, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 9, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 9, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 9, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 9, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 9, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 9, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 9, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 9, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 9, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 9, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 0, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 0, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 0, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 0, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 0, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 0, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 0, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 0, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 0, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 0, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 1, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 1, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 1, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 1, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 1, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 1, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 1, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 1, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 1, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 1, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 2, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 2, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 2, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 2, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 2, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 2, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 2, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 2, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 2, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 2, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 3, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 3, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 3, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 3, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 3, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 3, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 3, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 3, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 3, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 4, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 4, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 4, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 4, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 4, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 4, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 4, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 4, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 5, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 5, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 5, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 5, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 5, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 5, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 5, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 6, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 6, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 6, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 6, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 6, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 6, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 7, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 7, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 7, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 7, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 7, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 7, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 7, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 8, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 8, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 8, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 8, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 8, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 8, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 8, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 8, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 8, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 8, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 9, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 9, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 9, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 9, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 9, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 9, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 9, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 9, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 9, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        levelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 9, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 1); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks

        // Instable blocks (like torches, levers, signs)
        levelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 6, baseZ + 6, SokobanMod.BlockTargetBox.blockID, 0); // tile.Target
                                                                                                                        // Box
        if(world.getBlockTileEntity(baseX + 1, baseY + 6, baseZ + 6) instanceof TileEntityTargetBox) {
            TileEntityTargetBox teTb = (TileEntityTargetBox)world.getBlockTileEntity(baseX + 1, baseY + 6, baseZ + 6);
            teTb.setLevelBounds(baseX, baseY, baseZ, baseX + 9, baseY + 9, baseZ + 9);
            teTb.levelDropped = levelNumber;
        }
        levelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 4, baseZ + 5, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        levelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 5, baseZ + 6, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        levelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 5, baseZ + 8, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        levelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 4, baseZ + 5, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        levelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 4, baseZ + 5, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        levelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 4, baseZ + 6, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        levelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 6, baseZ + 4, SokobanMod.BlockTargetBox.blockID, 0); // tile.Target
                                                                                                                        // Box
        if(world.getBlockTileEntity(baseX + 4, baseY + 6, baseZ + 4) instanceof TileEntityTargetBox) {
            TileEntityTargetBox teTb = (TileEntityTargetBox)world.getBlockTileEntity(baseX + 4, baseY + 6, baseZ + 4);
            teTb.setLevelBounds(baseX, baseY, baseZ, baseX + 9, baseY + 9, baseZ + 9);
            teTb.levelDropped = levelNumber;
        }
        levelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 4, baseZ + 6, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        levelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 4, baseZ + 7, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        levelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 4, baseZ + 8, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        levelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 7, baseZ + 6, Block.signWall.blockID, 5); // tile.sign
        if(world.getBlockTileEntity(baseX + 6, baseY + 7, baseZ + 6) instanceof TileEntitySign) {
            TileEntitySign tes = (TileEntitySign)world.getBlockTileEntity(baseX + 6, baseY + 7, baseZ + 6);
            tes.signText[0] = "Easy Level";
            tes.signText[1] = "#4";
            tes.signText[2] = "Warehouse";
            tes.signText[3] = "SSP";
        }
        return true;
    }
}