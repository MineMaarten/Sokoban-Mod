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
import sokobanMod.common.gen.ISokobanLevel;
import sokobanMod.common.gen.LevelGenBase;

/**
 * Sokoban Mod
 * @author MineMaarten
 * www.minemaarten.com
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */

public class EasyLevel2Gen implements ISokobanLevel{
    private static final int[] levelBounds = {12, 9, 11};
    private static final int[] entranceCoords = {5, 6, 0, 5, 6, 11, 5, 7, 0, 5, 7, 11, 5, 8, 0, 5, 8, 11, 6, 6, 0, 6, 6, 11, 6, 7, 0, 6, 7, 11, 6, 8, 0, 6, 8, 11, 7, 6, 0, 7, 6, 11, 7, 7, 0, 7, 7, 11, 7, 8, 0, 7, 8, 11, 12, 1, 9, 12, 2, 9, 0, 6, 5, 12, 6, 5, 0, 6, 6, 12, 6, 6, 0, 7, 5, 12, 7, 5, 0, 7, 6, 12, 7, 6, 0, 8, 5, 12, 8, 5, 0, 8, 6, 12, 8, 6};
    public static final ItemStack[] staticInventoryContents_6_6_2 = new ItemStack[]{new ItemStack(Item.diamond.itemID, 1, 0)};
    public static final WeightedRandomChestContent[] randomInventoryContents_6_6_2 = new WeightedRandomChestContent[]{new WeightedRandomChestContent(Item.carrot.itemID, 0, 2, 5, 50), new WeightedRandomChestContent(Block.glass.blockID, 0, 2, 5, 50), new WeightedRandomChestContent(Item.eyeOfEnder.itemID, 0, 1, 1, 20), new WeightedRandomChestContent(Item.spiderEye.itemID, 0, 1, 3, 20), new WeightedRandomChestContent(Item.goldenCarrot.itemID, 0, 1, 1, 10), new WeightedRandomChestContent(Item.potion.itemID, 8270, 1, 1, 10)};

    @Override
    public int getLevelNumber(){
        return 1001;
    }

    @Override
    public int[] getLevelBounds(){
        return levelBounds;
    }

    @Override
    public int[] getEntranceCoords(){
        return entranceCoords;
    }

    @Override
    public String getLevelName(){
        return "Overview";
    }

    @Override
    public String getAuthorName(){
        return "";
    }

    @Override
    public boolean canGenerateOnSurface(){
        return true;
    }

    @Override
    public boolean canGenerateUnderground(){
        return true;
    }

    @Override
    public boolean generate(World world, ISokobanLevel.EnumGenerationMethod generationMethod, int baseX, int baseY, int baseZ){

        // base blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 0, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 0, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 0, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 0, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 0, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 0, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 0, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 0, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 0, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 0, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 0, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 0, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 1, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 1, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 1, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 1, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 1, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 1, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 1, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 1, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 1, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 1, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 1, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 1, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 2, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 2, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 2, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 2, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 2, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 2, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 2, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 2, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 2, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 2, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 2, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 2, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 3, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 3, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 3, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 3, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 3, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 3, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 3, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 3, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 3, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 3, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 3, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 3, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 4, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 4, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 4, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 4, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 4, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 4, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 4, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 4, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 4, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 4, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 4, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 4, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 5, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 5, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 5, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 5, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 5, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 5, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 5, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 5, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 5, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 5, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 5, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 5, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 6, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 6, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 6, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 6, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 6, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 6, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 6, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 6, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 6, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 6, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 7, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 7, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 7, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 7, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 7, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 7, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 7, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 7, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 7, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 7, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 8, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 8, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 8, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 8, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 8, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 8, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 8, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 8, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 8, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 8, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 9, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 9, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 9, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 9, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 9, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 9, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 9, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 9, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 9, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 9, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 9, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 9, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 0, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 0, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 0, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 0, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 0, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 0, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 0, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 0, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 0, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 0, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 0, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 0, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 1, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 1, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 2, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 2, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 2, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 2, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 2, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 2, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 2, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 2, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 2, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 2, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 2, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 2, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 3, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 3, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 3, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 3, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 3, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 3, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 3, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 3, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 3, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 4, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 4, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 4, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 4, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 4, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 4, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 4, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 4, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 4, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 5, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 5, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 5, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 5, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 5, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 5, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 5, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 5, baseZ + 7, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Glass
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 5, baseZ + 8, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Glass
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 5, baseZ + 9, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Glass
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 5, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 5, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 6, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 6, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 7, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 7, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 8, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 8, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 9, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 9, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 9, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 9, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 9, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 9, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 9, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 9, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 9, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 9, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 9, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 9, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 0, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 0, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 0, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 0, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 0, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 0, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 0, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 0, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 0, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 0, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 0, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 0, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 1, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 1, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 2, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 2, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 2, baseZ + 2, SokobanMod.BlockTarget.blockID, 0); // tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 2, baseZ + 3, SokobanMod.BlockTarget.blockID, 0); // tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 2, baseZ + 4, SokobanMod.BlockTarget.blockID, 0); // tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 2, baseZ + 5, SokobanMod.BlockTarget.blockID, 0); // tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 2, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 2, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 2, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 2, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 2, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 2, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 3, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 3, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 3, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 3, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 4, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 4, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 4, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 4, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 5, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 5, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 5, baseZ + 2, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Glass
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 5, baseZ + 3, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Glass
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 5, baseZ + 4, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Glass
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 5, baseZ + 5, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Glass
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 5, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 5, baseZ + 7, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Glass
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 5, baseZ + 8, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Glass
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 5, baseZ + 9, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Glass
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 5, baseZ + 10, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Glass
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 5, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 6, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 6, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 7, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 7, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 8, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 8, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 9, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 9, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 9, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 9, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 9, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 9, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 9, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 9, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 9, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 9, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 9, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 9, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 0, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 0, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 0, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 0, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 0, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 0, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 0, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 0, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 0, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 0, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 0, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 0, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 1, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 1, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 2, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 2, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 2, baseZ + 2, SokobanMod.BlockTarget.blockID, 0); // tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 2, baseZ + 3, SokobanMod.BlockTarget.blockID, 0); // tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 2, baseZ + 4, SokobanMod.BlockTarget.blockID, 0); // tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 2, baseZ + 5, SokobanMod.BlockTarget.blockID, 0); // tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 2, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 2, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 2, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 2, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 2, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 2, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 3, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 3, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 3, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 4, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 4, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 4, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 5, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 5, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 5, baseZ + 2, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Glass
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 5, baseZ + 3, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Glass
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 5, baseZ + 4, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Glass
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 5, baseZ + 5, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Glass
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 5, baseZ + 6, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Glass
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 5, baseZ + 7, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Glass
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 5, baseZ + 8, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Glass
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 5, baseZ + 9, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Glass
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 5, baseZ + 10, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Glass
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 5, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 6, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 6, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 7, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 7, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 8, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 8, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 9, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 9, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 9, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 9, baseZ + 3, SokobanMod.BlockUnbreakableLamps.blockID, 0); // tile.Unbreakable
                                                                                                                               // Lamp
                                                                                                                               // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 9, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 9, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 9, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 9, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 9, baseZ + 8, SokobanMod.BlockUnbreakableLamps.blockID, 0); // tile.Unbreakable
                                                                                                                               // Lamp
                                                                                                                               // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 9, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 9, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 9, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 0, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 0, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 0, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 0, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 0, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 0, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 0, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 0, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 0, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 0, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 0, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 0, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 1, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 1, baseZ + 1, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 1, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 2, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 2, baseZ + 2, SokobanMod.BlockTarget.blockID, 0); // tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 2, baseZ + 3, SokobanMod.BlockTarget.blockID, 0); // tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 2, baseZ + 4, SokobanMod.BlockTarget.blockID, 0); // tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 2, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 2, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 2, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 2, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 2, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 2, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 2, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 3, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 3, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 3, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 3, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 3, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 4, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 4, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 4, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 4, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 4, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 5, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 5, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 5, baseZ + 2, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Glass
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 5, baseZ + 3, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Glass
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 5, baseZ + 4, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Glass
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 5, baseZ + 5, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Glass
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 5, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 5, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 5, baseZ + 8, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Glass
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 5, baseZ + 9, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Glass
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 5, baseZ + 10, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Glass
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 5, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 6, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 6, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 7, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 7, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 8, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 8, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 9, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 9, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 9, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 9, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 9, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 9, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 9, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 9, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 9, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 9, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 9, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 9, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 0, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 0, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 0, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 0, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 0, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 0, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 0, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 0, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 0, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 0, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 0, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 0, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 1, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 1, baseZ + 1, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 1, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 2, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 2, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 2, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 2, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 2, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 2, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 2, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 2, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 2, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 2, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 2, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 3, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 3, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 3, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 3, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 3, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 3, baseZ + 6, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 3, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 3, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 3, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 3, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 4, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 4, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 4, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 4, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 4, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 4, baseZ + 6, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 4, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 4, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 4, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 4, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 5, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 5, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 5, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 5, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 5, baseZ + 4, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Glass
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 5, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 5, baseZ + 6, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 5, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 5, baseZ + 8, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Glass
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 5, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 5, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 5, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 9, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 9, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 9, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 9, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 9, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 9, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 9, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 9, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 9, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 9, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 9, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 9, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 0, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 0, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 0, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 0, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 0, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 0, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 0, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 0, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 0, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 0, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 0, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 0, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 1, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 1, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 2, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 2, baseZ + 1, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 2, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 2, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 2, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 2, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 2, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 2, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 2, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 2, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 2, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 2, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 3, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 3, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 3, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 3, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 3, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 3, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 3, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 3, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 4, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 4, baseZ + 1, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 4, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 4, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 4, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 4, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 4, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 4, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 5, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 5, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 5, baseZ + 2, Block.bedrock.blockID, 0); // tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 5, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 5, baseZ + 4, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Glass
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 5, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 5, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 5, baseZ + 8, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Glass
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 5, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 5, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 5, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 6, baseZ + 2, SokobanMod.BlockLootGenerator.blockID, 0); // tile.Loot
                                                                                                                            // Generator
        if(world.getBlockTileEntity(baseX + 6, baseY + 6, baseZ + 2) instanceof TileEntityLootGenerator) {
            TileEntityLootGenerator teLg = (TileEntityLootGenerator)world.getBlockTileEntity(baseX + 6, baseY + 6, baseZ + 2);
            teLg.setAchievement(getLevelNumber());
            LevelGenBase.setLootGeneratorContents(teLg, staticInventoryContents_6_6_2, randomInventoryContents_6_6_2);
        }
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 9, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 9, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 9, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 9, baseZ + 3, SokobanMod.BlockUnbreakableLamps.blockID, 0); // tile.Unbreakable
                                                                                                                               // Lamp
                                                                                                                               // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 9, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 9, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 9, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 9, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 9, baseZ + 8, SokobanMod.BlockUnbreakableLamps.blockID, 0); // tile.Unbreakable
                                                                                                                               // Lamp
                                                                                                                               // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 9, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 9, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 9, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 0, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 0, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 0, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 0, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 0, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 0, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 0, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 0, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 0, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 0, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 0, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 0, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 1, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 1, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 2, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 2, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 2, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 2, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 2, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 2, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 2, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 2, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 2, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 2, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 2, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 2, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 3, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 3, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 3, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 3, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 3, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 3, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 3, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 4, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 4, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 4, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 4, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 4, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 4, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 4, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 5, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 5, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 5, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 5, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 5, baseZ + 4, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Glass
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 5, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 5, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 5, baseZ + 7, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Glass
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 5, baseZ + 8, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Glass
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 5, baseZ + 9, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Glass
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 5, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 5, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 9, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 9, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 9, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 9, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 9, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 9, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 9, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 9, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 9, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 9, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 9, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 9, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 0, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 0, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 0, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 0, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 0, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 0, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 0, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 0, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 0, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 0, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 0, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 0, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 1, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 1, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 2, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 2, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 2, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 2, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 2, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 2, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 2, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 2, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 2, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 2, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 2, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 2, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 3, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 3, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 3, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 3, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 3, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 4, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 4, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 4, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 4, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 4, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 5, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 5, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 5, baseZ + 2, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Glass
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 5, baseZ + 3, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Glass
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 5, baseZ + 4, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Glass
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 5, baseZ + 5, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Glass
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 5, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 5, baseZ + 7, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Glass
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 5, baseZ + 8, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Glass
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 5, baseZ + 9, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Glass
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 5, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 5, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 6, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 6, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 7, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 7, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 8, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 8, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 9, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 9, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 9, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 9, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 9, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 9, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 9, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 9, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 9, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 9, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 9, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 9, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 0, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 0, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 0, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 0, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 0, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 0, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 0, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 0, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 0, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 0, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 0, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 0, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 1, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 1, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 1, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 1, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 1, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 2, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 2, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 2, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 2, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 2, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 2, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 2, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 2, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 2, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 2, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 2, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 2, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 3, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 3, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 3, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 3, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 3, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 4, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 4, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 4, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 4, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 4, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 5, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 5, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 5, baseZ + 2, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Glass
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 5, baseZ + 3, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Glass
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 5, baseZ + 4, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Glass
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 5, baseZ + 5, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Glass
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 5, baseZ + 6, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Glass
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 5, baseZ + 7, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Glass
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 5, baseZ + 8, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Glass
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 5, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 5, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 5, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 6, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 6, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 7, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 7, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 8, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 8, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 9, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 9, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 9, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 9, baseZ + 3, SokobanMod.BlockUnbreakableLamps.blockID, 0); // tile.Unbreakable
                                                                                                                               // Lamp
                                                                                                                               // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 9, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 9, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 9, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 9, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 9, baseZ + 8, SokobanMod.BlockUnbreakableLamps.blockID, 0); // tile.Unbreakable
                                                                                                                               // Lamp
                                                                                                                               // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 9, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 9, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 9, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 0, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 0, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 0, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 0, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 0, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 0, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 0, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 0, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 0, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 0, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 0, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 0, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 1, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 1, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 1, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 1, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 1, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 2, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 2, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 2, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 2, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 2, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 2, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 2, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 2, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 2, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 2, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 2, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 3, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 3, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 3, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 3, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 4, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 4, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 4, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 4, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 5, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 5, baseZ + 1, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Glass
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 5, baseZ + 2, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Glass
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 5, baseZ + 3, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Glass
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 5, baseZ + 4, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Glass
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 5, baseZ + 5, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Glass
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 5, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 5, baseZ + 7, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Glass
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 5, baseZ + 8, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Glass
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 5, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 5, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 5, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 6, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 6, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 7, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 7, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 8, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 8, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 9, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 9, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 9, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 9, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 9, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 9, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 9, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 9, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 9, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 9, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 9, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 9, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 0, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 0, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 0, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 0, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 0, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 0, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 0, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 0, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 0, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 0, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 0, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 0, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 1, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 1, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 1, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 1, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 2, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 2, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 2, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 2, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 2, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 2, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 2, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 2, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 2, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 2, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 2, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 3, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 3, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 3, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 3, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 4, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 4, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 4, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 4, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 5, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 5, baseZ + 1, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Glass
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 5, baseZ + 2, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Glass
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 5, baseZ + 3, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Glass
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 5, baseZ + 4, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Glass
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 5, baseZ + 5, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Glass
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 5, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 5, baseZ + 7, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Glass
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 5, baseZ + 8, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Glass
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 5, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 5, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 5, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 6, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 6, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 7, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 7, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 8, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 8, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 9, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 9, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 9, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 9, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 9, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 9, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 9, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 9, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 9, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 9, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 9, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 9, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 0, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 0, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 0, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 0, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 0, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 0, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 0, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 0, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 0, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 0, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 0, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 0, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 1, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 1, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 1, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 1, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 1, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 1, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 1, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 1, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 1, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 1, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 1, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 2, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 2, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 2, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 2, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 2, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 2, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 2, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 2, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 2, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 2, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 2, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 3, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 3, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 3, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 3, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 3, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 3, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 3, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 3, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 3, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 3, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 3, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 3, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 4, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 4, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 4, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 4, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 4, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 4, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 4, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 4, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 4, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 4, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 4, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 4, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 5, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 5, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 5, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 5, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 5, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 5, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 5, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 5, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 5, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 5, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 5, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 5, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 6, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 6, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 6, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 6, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 6, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 6, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 6, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 6, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 6, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 6, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 7, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 7, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 7, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 7, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 7, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 7, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 7, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 7, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 7, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 7, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 8, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 8, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 8, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 8, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 8, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 8, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 8, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 8, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 8, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 8, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 9, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 9, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 9, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 9, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 9, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 9, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 9, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 9, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 9, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 9, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 9, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 9, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks

        // Instable blocks (like torches, levers, signs)
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 3, baseZ + 9, SokobanMod.BlockTargetBox.blockID, 0); // tile.Target
                                                                                                                        // Box
        if(world.getBlockTileEntity(baseX + 2, baseY + 3, baseZ + 9) instanceof TileEntityTargetBox) {
            TileEntityTargetBox teTb = (TileEntityTargetBox)world.getBlockTileEntity(baseX + 2, baseY + 3, baseZ + 9);
            teTb.setLevelBounds(baseX, baseY, baseZ, baseX + 12, baseY + 9, baseZ + 11);
            teTb.levelDropped = getLevelNumber();
        }
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 3, baseZ + 6, SokobanMod.BlockTargetBox.blockID, 0); // tile.Target
                                                                                                                        // Box
        if(world.getBlockTileEntity(baseX + 3, baseY + 3, baseZ + 6) instanceof TileEntityTargetBox) {
            TileEntityTargetBox teTb = (TileEntityTargetBox)world.getBlockTileEntity(baseX + 3, baseY + 3, baseZ + 6);
            teTb.setLevelBounds(baseX, baseY, baseZ, baseX + 12, baseY + 9, baseZ + 11);
            teTb.levelDropped = getLevelNumber();
        }
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 3, baseZ + 9, SokobanMod.BlockTargetBox.blockID, 0); // tile.Target
                                                                                                                        // Box
        if(world.getBlockTileEntity(baseX + 3, baseY + 3, baseZ + 9) instanceof TileEntityTargetBox) {
            TileEntityTargetBox teTb = (TileEntityTargetBox)world.getBlockTileEntity(baseX + 3, baseY + 3, baseZ + 9);
            teTb.setLevelBounds(baseX, baseY, baseZ, baseX + 12, baseY + 9, baseZ + 11);
            teTb.levelDropped = getLevelNumber();
        }
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 2, baseZ + 1, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 2, baseZ + 1, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 3, baseZ + 1, Block.torchRedstoneActive.blockID, 5); // tile.notGate
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 3, baseZ + 4, SokobanMod.BlockTargetBox.blockID, 0); // tile.Target
                                                                                                                        // Box
        if(world.getBlockTileEntity(baseX + 6, baseY + 3, baseZ + 4) instanceof TileEntityTargetBox) {
            TileEntityTargetBox teTb = (TileEntityTargetBox)world.getBlockTileEntity(baseX + 6, baseY + 3, baseZ + 4);
            teTb.setLevelBounds(baseX, baseY, baseZ, baseX + 12, baseY + 9, baseZ + 11);
            teTb.levelDropped = getLevelNumber();
        }
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 3, baseZ + 6, Block.ladder.blockID, 5); // tile.ladder
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 4, baseZ + 2, Block.torchRedstoneIdle.blockID, 3); // tile.notGate
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 4, baseZ + 6, Block.ladder.blockID, 5); // tile.ladder
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 5, baseZ + 6, Block.ladder.blockID, 5); // tile.ladder
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 3, baseZ + 8, SokobanMod.BlockTargetBox.blockID, 0); // tile.Target
                                                                                                                        // Box
        if(world.getBlockTileEntity(baseX + 7, baseY + 3, baseZ + 8) instanceof TileEntityTargetBox) {
            TileEntityTargetBox teTb = (TileEntityTargetBox)world.getBlockTileEntity(baseX + 7, baseY + 3, baseZ + 8);
            teTb.setLevelBounds(baseX, baseY, baseZ, baseX + 12, baseY + 9, baseZ + 11);
            teTb.levelDropped = getLevelNumber();
        }
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 3, baseZ + 4, SokobanMod.BlockTargetBox.blockID, 0); // tile.Target
                                                                                                                        // Box
        if(world.getBlockTileEntity(baseX + 8, baseY + 3, baseZ + 4) instanceof TileEntityTargetBox) {
            TileEntityTargetBox teTb = (TileEntityTargetBox)world.getBlockTileEntity(baseX + 8, baseY + 3, baseZ + 4);
            teTb.setLevelBounds(baseX, baseY, baseZ, baseX + 12, baseY + 9, baseZ + 11);
            teTb.levelDropped = getLevelNumber();
        }
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 3, baseZ + 2, SokobanMod.BlockTargetBox.blockID, 0); // tile.Target
                                                                                                                        // Box
        if(world.getBlockTileEntity(baseX + 9, baseY + 3, baseZ + 2) instanceof TileEntityTargetBox) {
            TileEntityTargetBox teTb = (TileEntityTargetBox)world.getBlockTileEntity(baseX + 9, baseY + 3, baseZ + 2);
            teTb.setLevelBounds(baseX, baseY, baseZ, baseX + 12, baseY + 9, baseZ + 11);
            teTb.levelDropped = getLevelNumber();
        }
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 3, baseZ + 7, SokobanMod.BlockTargetBox.blockID, 0); // tile.Target
                                                                                                                        // Box
        if(world.getBlockTileEntity(baseX + 9, baseY + 3, baseZ + 7) instanceof TileEntityTargetBox) {
            TileEntityTargetBox teTb = (TileEntityTargetBox)world.getBlockTileEntity(baseX + 9, baseY + 3, baseZ + 7);
            teTb.setLevelBounds(baseX, baseY, baseZ, baseX + 12, baseY + 9, baseZ + 11);
            teTb.levelDropped = getLevelNumber();
        }
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 3, baseZ + 2, SokobanMod.BlockTargetBox.blockID, 0); // tile.Target
                                                                                                                         // Box
        if(world.getBlockTileEntity(baseX + 10, baseY + 3, baseZ + 2) instanceof TileEntityTargetBox) {
            TileEntityTargetBox teTb = (TileEntityTargetBox)world.getBlockTileEntity(baseX + 10, baseY + 3, baseZ + 2);
            teTb.setLevelBounds(baseX, baseY, baseZ, baseX + 12, baseY + 9, baseZ + 11);
            teTb.levelDropped = getLevelNumber();
        }
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 3, baseZ + 4, SokobanMod.BlockTargetBox.blockID, 0); // tile.Target
                                                                                                                         // Box
        if(world.getBlockTileEntity(baseX + 10, baseY + 3, baseZ + 4) instanceof TileEntityTargetBox) {
            TileEntityTargetBox teTb = (TileEntityTargetBox)world.getBlockTileEntity(baseX + 10, baseY + 3, baseZ + 4);
            teTb.setLevelBounds(baseX, baseY, baseZ, baseX + 12, baseY + 9, baseZ + 11);
            teTb.levelDropped = getLevelNumber();
        }
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 3, baseZ + 5, SokobanMod.BlockTargetBox.blockID, 0); // tile.Target
                                                                                                                         // Box
        if(world.getBlockTileEntity(baseX + 10, baseY + 3, baseZ + 5) instanceof TileEntityTargetBox) {
            TileEntityTargetBox teTb = (TileEntityTargetBox)world.getBlockTileEntity(baseX + 10, baseY + 3, baseZ + 5);
            teTb.setLevelBounds(baseX, baseY, baseZ, baseX + 12, baseY + 9, baseZ + 11);
            teTb.levelDropped = getLevelNumber();
        }
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 3, baseZ + 9, Block.signWall.blockID, 5); // tile.sign
        if(world.getBlockTileEntity(baseX + 10, baseY + 3, baseZ + 9) instanceof TileEntitySign) {
            TileEntitySign tes = (TileEntitySign)world.getBlockTileEntity(baseX + 10, baseY + 3, baseZ + 9);
            tes.signText[0] = "Easy Level";
            tes.signText[1] = "#2";
            tes.signText[2] = "Overview";
            tes.signText[3] = "SSP/SMP";
        }
        return true;
    }
}