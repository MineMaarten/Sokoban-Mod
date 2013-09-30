package sokobanMod.common.gen.tutorial;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.tileentity.TileEntitySign;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraft.world.World;
import sokobanMod.common.SokobanMod;
import sokobanMod.common.TileEntityTargetBox;
import sokobanMod.common.gen.ISokobanLevel;
import sokobanMod.common.gen.LevelGenBase;

/**
 * Sokoban Mod
 * @author MineMaarten
 * www.minemaarten.com
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */

public class TutorialLevel6Gen implements ISokobanLevel{
    private static final int[] levelBounds = {11, 7, 17};
    private static final int[] entranceCoords = {0, 1, 7, 0, 1, 8, 0, 1, 9, 0, 2, 7, 0, 2, 8, 0, 2, 9};
    public static final ItemStack[] staticInventoryContents_1_4_8 = new ItemStack[]{new ItemStack(Item.ingotGold.itemID, 4, 0), //
    new ItemStack(SokobanMod.ItemLevelGeneratorTutorial.itemID, 1, 6)};
    public static final WeightedRandomChestContent[] randomInventoryContents_1_4_8 = new WeightedRandomChestContent[]{};

    @Override
    public int getLevelNumber(){
        return 5;
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
        return "Vaporizers";
    }

    @Override
    public String getAuthorName(){
        return "";
    }

    @Override
    public boolean canGenerateOnSurface(){
        return false;
    }

    @Override
    public boolean canGenerateUnderground(){
        return false;
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
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 0, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 0, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 0, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 0, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 0, baseZ + 16, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 0, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
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
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 1, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 1, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 1, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 1, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 1, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 1, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 1, baseZ + 16, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 1, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
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
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 2, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 2, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 2, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 2, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 2, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 2, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 2, baseZ + 16, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 2, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
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
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 3, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 3, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 3, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 3, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 3, baseZ + 16, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 3, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
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
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 4, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 4, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 4, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 4, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 4, baseZ + 16, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 4, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
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
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 5, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 5, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 5, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 5, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 5, baseZ + 16, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 5, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
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
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 6, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 6, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
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
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 6, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 6, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 6, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 6, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 6, baseZ + 16, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 6, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
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
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 7, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 7, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
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
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 7, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 7, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 7, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 7, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 7, baseZ + 16, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 7, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
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
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 0, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 0, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 0, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 0, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 0, baseZ + 16, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 0, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 1, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 1, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 1, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 1, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 2, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 2, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 2, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 2, baseZ + 12, Block.bedrock.blockID, 0); // tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 2, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
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
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 3, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 3, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 3, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 3, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 3, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 3, baseZ + 12, SokobanMod.BlockLootGenerator.blockID, 0); // tile.Loot
                                                                                                                             // Generator
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 3, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 3, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 3, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 3, baseZ + 16, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 3, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 4, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 4, baseZ + 1, SokobanMod.BlockUnbreakableLamps.blockID, 14); // tile.Unbreakable
                                                                                                                                // Lamp
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 4, baseZ + 2, SokobanMod.BlockUnbreakableLamps.blockID, 14); // tile.Unbreakable
                                                                                                                                // Lamp
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 4, baseZ + 3, SokobanMod.BlockUnbreakableLamps.blockID, 14); // tile.Unbreakable
                                                                                                                                // Lamp
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 4, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 4, baseZ + 5, SokobanMod.BlockUnbreakableLamps.blockID, 4); // tile.Unbreakable
                                                                                                                               // Lamp
                                                                                                                               // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 4, baseZ + 8, Block.chest.blockID, 5); // tile.chest
        if(world.getBlockTileEntity(baseX + 1, baseY + 4, baseZ + 8) instanceof TileEntityChest) {
            TileEntityChest teC = (TileEntityChest)world.getBlockTileEntity(baseX + 1, baseY + 4, baseZ + 8);
            LevelGenBase.setChestContents(teC, staticInventoryContents_1_4_8, randomInventoryContents_1_4_8);
        }
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 4, baseZ + 11, SokobanMod.BlockUnbreakableLamps.blockID, 4); // tile.Unbreakable
                                                                                                                                // Lamp
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 4, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 4, baseZ + 13, SokobanMod.BlockUnbreakableLamps.blockID, 1); // tile.Unbreakable
                                                                                                                                // Lamp
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 4, baseZ + 14, SokobanMod.BlockUnbreakableLamps.blockID, 1); // tile.Unbreakable
                                                                                                                                // Lamp
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 4, baseZ + 15, SokobanMod.BlockUnbreakableLamps.blockID, 1); // tile.Unbreakable
                                                                                                                                // Lamp
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 4, baseZ + 16, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 4, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 5, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 5, baseZ + 1, SokobanMod.BlockUnbreakableLamps.blockID, 14); // tile.Unbreakable
                                                                                                                                // Lamp
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 5, baseZ + 2, SokobanMod.BlockUnbreakableLamps.blockID, 14); // tile.Unbreakable
                                                                                                                                // Lamp
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 5, baseZ + 3, SokobanMod.BlockUnbreakableLamps.blockID, 14); // tile.Unbreakable
                                                                                                                                // Lamp
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 5, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 5, baseZ + 5, SokobanMod.BlockUnbreakableLamps.blockID, 4); // tile.Unbreakable
                                                                                                                               // Lamp
                                                                                                                               // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 5, baseZ + 11, SokobanMod.BlockUnbreakableLamps.blockID, 4); // tile.Unbreakable
                                                                                                                                // Lamp
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 5, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 5, baseZ + 13, SokobanMod.BlockUnbreakableLamps.blockID, 1); // tile.Unbreakable
                                                                                                                                // Lamp
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 5, baseZ + 14, SokobanMod.BlockUnbreakableLamps.blockID, 1); // tile.Unbreakable
                                                                                                                                // Lamp
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 5, baseZ + 15, SokobanMod.BlockUnbreakableLamps.blockID, 1); // tile.Unbreakable
                                                                                                                                // Lamp
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 5, baseZ + 16, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 5, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 6, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 6, baseZ + 1, SokobanMod.BlockUnbreakableLamps.blockID, 14); // tile.Unbreakable
                                                                                                                                // Lamp
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 6, baseZ + 2, SokobanMod.BlockUnbreakableLamps.blockID, 14); // tile.Unbreakable
                                                                                                                                // Lamp
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 6, baseZ + 3, SokobanMod.BlockUnbreakableLamps.blockID, 14); // tile.Unbreakable
                                                                                                                                // Lamp
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 6, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 6, baseZ + 5, SokobanMod.BlockUnbreakableLamps.blockID, 4); // tile.Unbreakable
                                                                                                                               // Lamp
                                                                                                                               // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 6, baseZ + 11, SokobanMod.BlockUnbreakableLamps.blockID, 4); // tile.Unbreakable
                                                                                                                                // Lamp
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 6, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 6, baseZ + 13, SokobanMod.BlockUnbreakableLamps.blockID, 1); // tile.Unbreakable
                                                                                                                                // Lamp
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 6, baseZ + 14, SokobanMod.BlockUnbreakableLamps.blockID, 1); // tile.Unbreakable
                                                                                                                                // Lamp
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 6, baseZ + 15, SokobanMod.BlockUnbreakableLamps.blockID, 1); // tile.Unbreakable
                                                                                                                                // Lamp
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 6, baseZ + 16, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 6, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 7, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 7, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 7, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 7, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 7, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 7, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 7, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 7, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 7, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 7, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 7, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 7, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 7, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 7, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 7, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 7, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 7, baseZ + 16, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 7, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
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
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 0, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 0, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 0, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 0, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 0, baseZ + 16, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 0, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 1, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 1, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 1, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 1, baseZ + 12, Block.bedrock.blockID, 0); // tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 1, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 2, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 2, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 2, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 2, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 3, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 3, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 3, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 3, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 3, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 3, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 3, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 3, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 3, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 3, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 3, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 3, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 3, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 3, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 3, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 3, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 3, baseZ + 16, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 3, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 4, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 4, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 4, baseZ + 5, SokobanMod.BlockUnbreakableLamps.blockID, 4); // tile.Unbreakable
                                                                                                                               // Lamp
                                                                                                                               // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 4, baseZ + 11, SokobanMod.BlockUnbreakableLamps.blockID, 4); // tile.Unbreakable
                                                                                                                                // Lamp
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 4, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 4, baseZ + 16, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 4, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 5, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 5, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 5, baseZ + 5, SokobanMod.BlockUnbreakableLamps.blockID, 4); // tile.Unbreakable
                                                                                                                               // Lamp
                                                                                                                               // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 5, baseZ + 11, SokobanMod.BlockUnbreakableLamps.blockID, 4); // tile.Unbreakable
                                                                                                                                // Lamp
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 5, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 5, baseZ + 16, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 5, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 6, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 6, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 6, baseZ + 5, SokobanMod.BlockUnbreakableLamps.blockID, 4); // tile.Unbreakable
                                                                                                                               // Lamp
                                                                                                                               // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 6, baseZ + 11, SokobanMod.BlockUnbreakableLamps.blockID, 4); // tile.Unbreakable
                                                                                                                                // Lamp
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 6, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 6, baseZ + 16, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 6, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 7, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 7, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 7, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 7, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 7, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 7, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 7, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 7, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 7, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 7, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 7, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 7, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 7, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 7, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 7, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 7, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 7, baseZ + 16, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 7, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
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
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 0, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 0, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 0, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 0, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 0, baseZ + 16, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 0, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 1, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 1, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 1, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 1, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 1, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 1, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 1, baseZ + 12, Block.bedrock.blockID, 0); // tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 1, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 2, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 2, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 2, baseZ + 7, SokobanMod.BlockUnbreakableLamps.blockID, 3); // tile.Unbreakable
                                                                                                                               // Lamp
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
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 2, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 3, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 3, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 3, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 3, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 3, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 3, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 3, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 3, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 3, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 3, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 3, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 3, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 3, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 3, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 3, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 3, baseZ + 16, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 3, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 4, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 4, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 4, baseZ + 5, SokobanMod.BlockUnbreakableLamps.blockID, 4); // tile.Unbreakable
                                                                                                                               // Lamp
                                                                                                                               // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 4, baseZ + 11, SokobanMod.BlockUnbreakableLamps.blockID, 4); // tile.Unbreakable
                                                                                                                                // Lamp
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 4, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 4, baseZ + 16, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 4, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 5, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 5, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 5, baseZ + 5, SokobanMod.BlockUnbreakableLamps.blockID, 4); // tile.Unbreakable
                                                                                                                               // Lamp
                                                                                                                               // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 5, baseZ + 11, SokobanMod.BlockUnbreakableLamps.blockID, 4); // tile.Unbreakable
                                                                                                                                // Lamp
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 5, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 5, baseZ + 16, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 5, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 6, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 6, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 6, baseZ + 5, SokobanMod.BlockUnbreakableLamps.blockID, 4); // tile.Unbreakable
                                                                                                                               // Lamp
                                                                                                                               // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 6, baseZ + 11, SokobanMod.BlockUnbreakableLamps.blockID, 4); // tile.Unbreakable
                                                                                                                                // Lamp
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 6, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 6, baseZ + 16, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 6, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 7, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 7, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 7, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 7, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 7, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 7, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 7, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 7, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 7, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 7, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 7, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 7, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 7, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 7, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 7, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 7, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 7, baseZ + 16, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 7, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
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
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 0, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 0, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 0, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 0, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 0, baseZ + 16, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 0, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 1, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 1, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 1, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 1, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 2, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 2, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 2, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 2, baseZ + 11, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 2, baseZ + 12, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 2, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 3, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 3, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 3, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 3, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 3, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 3, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 3, baseZ + 6, Block.bedrock.blockID, 0); // tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 3, baseZ + 7, Block.bedrock.blockID, 0); // tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 3, baseZ + 8, Block.bedrock.blockID, 0); // tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 3, baseZ + 9, Block.bedrock.blockID, 0); // tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 3, baseZ + 10, Block.bedrock.blockID, 0); // tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 3, baseZ + 13, SokobanMod.BlockTarget.blockID, 2); // tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 3, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 3, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 3, baseZ + 16, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 3, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 4, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 4, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 4, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 4, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 4, baseZ + 6, SokobanMod.BlockVaporizingBlock.blockID, 0); // tile.Vaporizing
                                                                                                                              // Block
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 4, baseZ + 7, SokobanMod.BlockVaporizingBlock.blockID, 0); // tile.Vaporizing
                                                                                                                              // Block
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 4, baseZ + 8, SokobanMod.BlockVaporizingBlock.blockID, 0); // tile.Vaporizing
                                                                                                                              // Block
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 4, baseZ + 9, SokobanMod.BlockVaporizingBlock.blockID, 0); // tile.Vaporizing
                                                                                                                              // Block
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 4, baseZ + 10, SokobanMod.BlockVaporizingBlock.blockID, 0); // tile.Vaporizing
                                                                                                                               // Block
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 4, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 4, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 4, baseZ + 16, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 4, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 5, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 5, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 5, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 5, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 5, baseZ + 6, SokobanMod.BlockVaporizingBlock.blockID, 0); // tile.Vaporizing
                                                                                                                              // Block
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 5, baseZ + 7, SokobanMod.BlockVaporizingBlock.blockID, 0); // tile.Vaporizing
                                                                                                                              // Block
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 5, baseZ + 8, SokobanMod.BlockVaporizingBlock.blockID, 0); // tile.Vaporizing
                                                                                                                              // Block
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 5, baseZ + 9, SokobanMod.BlockVaporizingBlock.blockID, 0); // tile.Vaporizing
                                                                                                                              // Block
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 5, baseZ + 10, SokobanMod.BlockVaporizingBlock.blockID, 0); // tile.Vaporizing
                                                                                                                               // Block
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 5, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 5, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 5, baseZ + 16, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 5, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 6, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 6, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 6, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 6, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 6, baseZ + 6, SokobanMod.BlockVaporizingBlock.blockID, 0); // tile.Vaporizing
                                                                                                                              // Block
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 6, baseZ + 7, SokobanMod.BlockVaporizingBlock.blockID, 0); // tile.Vaporizing
                                                                                                                              // Block
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 6, baseZ + 8, SokobanMod.BlockVaporizingBlock.blockID, 0); // tile.Vaporizing
                                                                                                                              // Block
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 6, baseZ + 9, SokobanMod.BlockVaporizingBlock.blockID, 0); // tile.Vaporizing
                                                                                                                              // Block
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 6, baseZ + 10, SokobanMod.BlockVaporizingBlock.blockID, 0); // tile.Vaporizing
                                                                                                                               // Block
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 6, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 6, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 6, baseZ + 16, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 6, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 7, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 7, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 7, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 7, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 7, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 7, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 7, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 7, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 7, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 7, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 7, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 7, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 7, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 7, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 7, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 7, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 7, baseZ + 16, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 7, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
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
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 0, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 0, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 0, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 0, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 0, baseZ + 16, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 0, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 1, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 1, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 1, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 1, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 2, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 2, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 2, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 2, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
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
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 3, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 3, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 3, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 3, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 3, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
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
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 3, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 3, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 3, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 3, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 3, baseZ + 16, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 3, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 4, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 4, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 4, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 4, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 4, baseZ + 16, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 4, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 5, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 5, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 5, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 5, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 5, baseZ + 16, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 5, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 6, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 6, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 6, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 6, baseZ + 5, SokobanMod.BlockUnbreakableLamps.blockID, 5); // tile.Unbreakable
                                                                                                                               // Lamp
                                                                                                                               // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 6, baseZ + 11, SokobanMod.BlockUnbreakableLamps.blockID, 5); // tile.Unbreakable
                                                                                                                                // Lamp
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 6, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 6, baseZ + 16, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 6, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 7, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 7, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 7, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 7, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 7, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 7, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 7, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 7, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 7, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 7, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 7, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 7, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 7, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 7, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 7, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 7, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 7, baseZ + 16, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 7, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
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
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 0, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 0, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 0, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 0, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 0, baseZ + 16, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 0, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 1, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 1, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 1, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 1, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 2, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 2, baseZ + 4, SokobanMod.BlockUnbreakableLamps.blockID, 3); // tile.Unbreakable
                                                                                                                               // Lamp
                                                                                                                               // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 2, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 2, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 3, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 3, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 3, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 3, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 3, baseZ + 4, Block.bedrock.blockID, 0); // tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 3, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 3, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
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
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 3, baseZ + 12, Block.bedrock.blockID, 0); // tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 3, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 3, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 3, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 3, baseZ + 16, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 3, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 4, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 4, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 4, baseZ + 4, SokobanMod.BlockVaporizingBlock.blockID, 0); // tile.Vaporizing
                                                                                                                              // Block
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 4, baseZ + 12, SokobanMod.BlockVaporizingBlock.blockID, 0); // tile.Vaporizing
                                                                                                                               // Block
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 4, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 4, baseZ + 16, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 4, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 5, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 5, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 5, baseZ + 4, SokobanMod.BlockVaporizingBlock.blockID, 0); // tile.Vaporizing
                                                                                                                              // Block
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 5, baseZ + 12, SokobanMod.BlockVaporizingBlock.blockID, 0); // tile.Vaporizing
                                                                                                                               // Block
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 5, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 5, baseZ + 16, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 5, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 6, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 6, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 6, baseZ + 4, SokobanMod.BlockVaporizingBlock.blockID, 0); // tile.Vaporizing
                                                                                                                              // Block
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 6, baseZ + 5, SokobanMod.BlockVaporizingBlock.blockID, 0); // tile.Vaporizing
                                                                                                                              // Block
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 6, baseZ + 6, SokobanMod.BlockVaporizingBlock.blockID, 0); // tile.Vaporizing
                                                                                                                              // Block
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 6, baseZ + 7, SokobanMod.BlockVaporizingBlock.blockID, 0); // tile.Vaporizing
                                                                                                                              // Block
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 6, baseZ + 8, SokobanMod.BlockVaporizingBlock.blockID, 0); // tile.Vaporizing
                                                                                                                              // Block
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 6, baseZ + 9, SokobanMod.BlockVaporizingBlock.blockID, 0); // tile.Vaporizing
                                                                                                                              // Block
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 6, baseZ + 10, SokobanMod.BlockVaporizingBlock.blockID, 0); // tile.Vaporizing
                                                                                                                               // Block
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 6, baseZ + 11, SokobanMod.BlockVaporizingBlock.blockID, 0); // tile.Vaporizing
                                                                                                                               // Block
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 6, baseZ + 12, SokobanMod.BlockVaporizingBlock.blockID, 0); // tile.Vaporizing
                                                                                                                               // Block
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 6, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 6, baseZ + 16, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 6, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 7, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 7, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 7, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 7, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 7, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 7, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 7, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 7, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 7, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 7, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 7, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 7, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 7, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 7, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 7, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 7, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 7, baseZ + 16, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 7, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
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
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 0, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 0, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 0, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 0, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 0, baseZ + 16, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 0, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 1, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 1, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 1, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 1, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 1, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 2, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 2, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 2, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 2, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
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
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 3, baseZ + 4, Block.bedrock.blockID, 0); // tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 3, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 3, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 3, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 3, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 3, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 3, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 3, baseZ + 12, Block.bedrock.blockID, 0); // tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 3, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 3, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 3, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 3, baseZ + 16, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 3, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 4, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 4, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 4, baseZ + 4, SokobanMod.BlockVaporizingBlock.blockID, 0); // tile.Vaporizing
                                                                                                                              // Block
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 4, baseZ + 12, SokobanMod.BlockVaporizingBlock.blockID, 0); // tile.Vaporizing
                                                                                                                               // Block
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 4, baseZ + 16, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 4, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 5, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 5, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 5, baseZ + 4, SokobanMod.BlockVaporizingBlock.blockID, 0); // tile.Vaporizing
                                                                                                                              // Block
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 5, baseZ + 12, SokobanMod.BlockVaporizingBlock.blockID, 0); // tile.Vaporizing
                                                                                                                               // Block
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 5, baseZ + 16, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 5, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 6, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 6, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 6, baseZ + 4, SokobanMod.BlockVaporizingBlock.blockID, 0); // tile.Vaporizing
                                                                                                                              // Block
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 6, baseZ + 12, SokobanMod.BlockVaporizingBlock.blockID, 0); // tile.Vaporizing
                                                                                                                               // Block
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 6, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 6, baseZ + 16, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 6, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 7, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 7, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 7, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 7, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 7, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 7, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 7, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 7, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 7, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 7, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 7, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 7, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 7, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 7, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 7, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 7, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 7, baseZ + 16, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 7, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
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
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 0, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 0, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 0, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 0, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 0, baseZ + 16, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 0, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 1, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 1, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 1, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 1, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 2, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 2, baseZ + 6, SokobanMod.BlockUnbreakableLamps.blockID, 3); // tile.Unbreakable
                                                                                                                               // Lamp
                                                                                                                               // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 2, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 2, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 3, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 3, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 3, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 3, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 3, baseZ + 4, Block.bedrock.blockID, 0); // tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 3, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 3, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 3, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 3, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 3, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 3, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 3, baseZ + 12, Block.bedrock.blockID, 0); // tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 3, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 3, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 3, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 3, baseZ + 16, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 3, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 4, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 4, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 4, baseZ + 4, SokobanMod.BlockVaporizingBlock.blockID, 0); // tile.Vaporizing
                                                                                                                              // Block
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 4, baseZ + 12, SokobanMod.BlockVaporizingBlock.blockID, 0); // tile.Vaporizing
                                                                                                                               // Block
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 4, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 4, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 5, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 5, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 5, baseZ + 4, SokobanMod.BlockVaporizingBlock.blockID, 0); // tile.Vaporizing
                                                                                                                              // Block
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 5, baseZ + 12, SokobanMod.BlockVaporizingBlock.blockID, 0); // tile.Vaporizing
                                                                                                                               // Block
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 5, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 5, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 6, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 6, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 6, baseZ + 4, SokobanMod.BlockVaporizingBlock.blockID, 0); // tile.Vaporizing
                                                                                                                              // Block
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 6, baseZ + 12, SokobanMod.BlockVaporizingBlock.blockID, 0); // tile.Vaporizing
                                                                                                                               // Block
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 6, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 6, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 7, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 7, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 7, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 7, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 7, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 7, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 7, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 7, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 7, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 7, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 7, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 7, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 7, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 7, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 7, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 7, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 7, baseZ + 16, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 7, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
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
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 0, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 0, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 0, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 0, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 0, baseZ + 16, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 0, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 1, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 1, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 1, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 1, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 1, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 2, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
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
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 2, baseZ + 12, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 2, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 3, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 3, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 3, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 3, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 3, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 3, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 3, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 3, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 3, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
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
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 3, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 3, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 3, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 3, baseZ + 16, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 3, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 4, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 4, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 4, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 4, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 4, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 5, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 5, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 5, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 5, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 5, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 6, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 6, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 6, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 6, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 6, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 7, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 7, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 7, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 7, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 7, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 7, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 7, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 7, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 7, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 7, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 7, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 7, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 7, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 7, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 7, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 7, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 7, baseZ + 16, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 7, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
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
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 0, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 0, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 0, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 0, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 0, baseZ + 16, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 0, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 1, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 1, baseZ + 8, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 1, baseZ + 9, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 1, baseZ + 10, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 1, baseZ + 11, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 1, baseZ + 12, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 1, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 2, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 2, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 3, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 3, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 3, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 3, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 3, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 3, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 3, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 3, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 3, baseZ + 8, Block.bedrock.blockID, 0); // tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 3, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 3, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 3, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 3, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 3, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 3, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 3, baseZ + 16, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 3, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 4, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 4, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 4, baseZ + 2, SokobanMod.BlockUnbreakableLamps.blockID, 14); // tile.Unbreakable
                                                                                                                                 // Lamp
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 4, baseZ + 3, SokobanMod.BlockUnbreakableLamps.blockID, 14); // tile.Unbreakable
                                                                                                                                 // Lamp
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 4, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 4, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 4, baseZ + 13, SokobanMod.BlockUnbreakableLamps.blockID, 1); // tile.Unbreakable
                                                                                                                                 // Lamp
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 4, baseZ + 14, SokobanMod.BlockUnbreakableLamps.blockID, 1); // tile.Unbreakable
                                                                                                                                 // Lamp
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 4, baseZ + 15, SokobanMod.BlockUnbreakableLamps.blockID, 1); // tile.Unbreakable
                                                                                                                                 // Lamp
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 4, baseZ + 16, SokobanMod.BlockUnbreakableLamps.blockID, 1); // tile.Unbreakable
                                                                                                                                 // Lamp
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 4, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 5, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 5, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 5, baseZ + 2, SokobanMod.BlockUnbreakableLamps.blockID, 14); // tile.Unbreakable
                                                                                                                                 // Lamp
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 5, baseZ + 3, SokobanMod.BlockUnbreakableLamps.blockID, 14); // tile.Unbreakable
                                                                                                                                 // Lamp
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 5, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 5, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 5, baseZ + 13, SokobanMod.BlockUnbreakableLamps.blockID, 1); // tile.Unbreakable
                                                                                                                                 // Lamp
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 5, baseZ + 14, SokobanMod.BlockUnbreakableLamps.blockID, 1); // tile.Unbreakable
                                                                                                                                 // Lamp
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 5, baseZ + 15, SokobanMod.BlockUnbreakableLamps.blockID, 1); // tile.Unbreakable
                                                                                                                                 // Lamp
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 5, baseZ + 16, SokobanMod.BlockUnbreakableLamps.blockID, 1); // tile.Unbreakable
                                                                                                                                 // Lamp
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 5, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 6, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 6, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 6, baseZ + 2, SokobanMod.BlockUnbreakableLamps.blockID, 14); // tile.Unbreakable
                                                                                                                                 // Lamp
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 6, baseZ + 3, SokobanMod.BlockUnbreakableLamps.blockID, 14); // tile.Unbreakable
                                                                                                                                 // Lamp
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 6, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 6, baseZ + 5, SokobanMod.BlockUnbreakableLamps.blockID, 5); // tile.Unbreakable
                                                                                                                                // Lamp
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 6, baseZ + 11, SokobanMod.BlockUnbreakableLamps.blockID, 5); // tile.Unbreakable
                                                                                                                                 // Lamp
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 6, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 6, baseZ + 13, SokobanMod.BlockUnbreakableLamps.blockID, 1); // tile.Unbreakable
                                                                                                                                 // Lamp
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 6, baseZ + 14, SokobanMod.BlockUnbreakableLamps.blockID, 1); // tile.Unbreakable
                                                                                                                                 // Lamp
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 6, baseZ + 15, SokobanMod.BlockUnbreakableLamps.blockID, 1); // tile.Unbreakable
                                                                                                                                 // Lamp
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 6, baseZ + 16, SokobanMod.BlockUnbreakableLamps.blockID, 1); // tile.Unbreakable
                                                                                                                                 // Lamp
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 6, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 7, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 7, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 7, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 7, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 7, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 7, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 7, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 7, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 7, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 7, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 7, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 7, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 7, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 7, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 7, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 7, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 7, baseZ + 16, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 7, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
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
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 0, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 0, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 0, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 0, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 0, baseZ + 16, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 0, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 1, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 1, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 1, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 1, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 1, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 1, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 1, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 1, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 1, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 1, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 1, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 1, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 1, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 1, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 1, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 1, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 1, baseZ + 16, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 1, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
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
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 2, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 2, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 2, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 2, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 2, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 2, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 2, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 2, baseZ + 16, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 2, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 3, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 3, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 3, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 3, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 3, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 3, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 3, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 3, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 3, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 3, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 3, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 3, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 3, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 3, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 3, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 3, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 3, baseZ + 16, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 3, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 4, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 4, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 4, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 4, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 4, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 4, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 4, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 4, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 4, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 4, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 4, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 4, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 4, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 4, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 4, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 4, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 4, baseZ + 16, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 4, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 5, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 5, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 5, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 5, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 5, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 5, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 5, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 5, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 5, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
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
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 5, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 5, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 5, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 5, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 5, baseZ + 16, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 5, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 6, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 6, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 6, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 6, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 6, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 6, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 6, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 6, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 6, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 6, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 6, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 6, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 6, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 6, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 6, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 6, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 6, baseZ + 16, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 6, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 7, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 7, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 7, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 7, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 7, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 7, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 7, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 7, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 7, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 7, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 7, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 7, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 7, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 7, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 7, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 7, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 7, baseZ + 16, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 7, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks

        // Instable blocks (like torches, levers, signs)
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 2, baseZ + 12, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 2, baseZ + 12, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 3, baseZ + 11, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 3, baseZ + 12, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 5, baseZ + 8, Block.signWall.blockID, 5); // tile.sign
        if(world.getBlockTileEntity(baseX + 5, baseY + 5, baseZ + 8) instanceof TileEntitySign) {
            TileEntitySign tes = (TileEntitySign)world.getBlockTileEntity(baseX + 5, baseY + 5, baseZ + 8);
            tes.signText[0] = "Tutorial Level";
            tes.signText[1] = "#6";
            tes.signText[2] = "Vaporizers";
            tes.signText[3] = "SSP";
        }
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 4, baseZ + 2, SokobanMod.BlockTargetBox.blockID, 0); // tile.Target
                                                                                                                        // Box
        if(world.getBlockTileEntity(baseX + 8, baseY + 4, baseZ + 2) instanceof TileEntityTargetBox) {
            TileEntityTargetBox teTb = (TileEntityTargetBox)world.getBlockTileEntity(baseX + 8, baseY + 4, baseZ + 2);
            teTb.setLevelBounds(baseX, baseY, baseZ, baseX + 11, baseY + 7, baseZ + 17);
            teTb.levelDropped = getLevelNumber();
        }
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 3, baseZ + 12, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 2, baseZ + 8, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 2, baseZ + 9, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 2, baseZ + 10, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 2, baseZ + 11, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 2, baseZ + 12, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 4, baseZ + 8, Block.pressurePlateStone.blockID, 0); // tile.pressurePlate
        return true;
    }
}