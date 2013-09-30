package sokobanMod.common.gen.hard;

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
 * @author MineMaarten, level designed by Emiiitje
 * www.minemaarten.com
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */

public class HardLevel1Gen implements ISokobanLevel{
    private static final int[] levelBounds = {19, 12, 15};
    private static final int[] entranceCoords = {10, 10, 15, 10, 11, 15, 11, 10, 15, 11, 11, 15, 16, 1, 15, 16, 2, 15, 16, 3, 15, 17, 1, 15, 17, 2, 15, 17, 3, 15, 0, 10, 5, 19, 10, 5, 0, 10, 6, 19, 10, 6, 0, 11, 5, 19, 11, 5, 0, 11, 6, 19, 11, 6};
    public static final ItemStack[] staticInventoryContents_5_6_12 = new ItemStack[]{new ItemStack(264, 2, 0), //
    new ItemStack(266, 1, 0), //
    new ItemStack(400, 1, 0), //
    new ItemStack(367, 4, 0), //
    new ItemStack(352, 4, 0)};
    public static final WeightedRandomChestContent[] randomInventoryContents_5_6_12;

    static {
        randomInventoryContents_5_6_12 = new WeightedRandomChestContent[16];
        for(int i = 0; i < 16; i++) {
            randomInventoryContents_5_6_12[i] = new WeightedRandomChestContent(Item.dyePowder.itemID, i, 5, 15, 10);
        }
    }

    @Override
    public int getLevelNumber(){
        return 3000;
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
        return "Colours";
    }

    @Override
    public String getAuthorName(){
        return "Emiiitje";
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

        //base blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 0, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 0, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 0, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 0, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 0, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 0, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 0, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 0, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 0, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 0, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 0, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 0, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 0, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 0, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 0, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 0, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 1, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 1, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 1, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 1, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 1, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 1, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 1, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 1, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 1, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 1, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 1, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 1, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 1, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 1, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 1, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 1, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 2, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 2, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 2, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 2, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 2, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 2, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 2, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 2, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 2, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 2, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 2, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 2, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 2, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 2, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 2, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 2, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 3, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 3, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 3, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 3, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 3, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 3, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 3, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 3, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 3, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 3, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 3, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 3, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 3, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 3, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 3, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 3, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 4, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 4, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 4, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 4, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 4, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 4, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 4, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 4, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 4, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 4, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 4, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 4, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 4, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 4, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 4, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 4, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 5, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 5, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 5, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 5, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 5, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 5, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 5, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 5, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 5, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 5, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 5, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 5, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 5, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 5, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 5, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 5, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 6, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 6, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 6, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 6, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 6, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 6, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 6, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 6, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 6, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 6, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 6, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 6, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 6, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 6, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 6, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 6, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 7, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 7, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 7, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 7, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 7, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 7, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 7, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 7, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 7, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 7, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 7, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 7, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 7, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 7, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 7, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 7, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 8, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 8, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 8, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 8, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 8, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 8, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 8, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 8, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 8, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 8, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 8, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 8, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 8, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 8, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 8, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 8, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 9, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 9, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 9, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 9, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 9, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 9, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 9, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 9, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 9, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 9, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 9, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 9, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 9, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 9, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 9, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 9, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 10, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 10, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 10, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 10, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 10, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 10, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 10, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 10, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 10, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 10, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 10, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 10, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 10, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 10, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 11, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 11, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 11, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 11, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 11, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 11, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 11, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 11, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 11, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 11, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 11, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 11, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 11, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 11, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 12, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 12, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 12, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 12, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 12, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 12, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 12, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 12, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 12, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 12, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 12, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 12, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 12, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 12, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 12, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 12, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 0, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 0, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 0, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 0, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 0, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 0, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 0, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 0, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 0, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 0, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 0, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 0, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 0, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 0, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 0, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 0, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 1, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 1, baseZ + 4, SokobanMod.BlockUnbreakableLamps.blockID, 7); //tile.Unbreakable Lamp Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 1, baseZ + 9, SokobanMod.BlockUnbreakableLamps.blockID, 7); //tile.Unbreakable Lamp Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 1, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 2, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 2, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 3, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 3, baseZ + 1, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 3, baseZ + 4, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 3, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 4, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 4, baseZ + 2, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 4, baseZ + 5, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 4, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 5, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 5, baseZ + 3, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 5, baseZ + 6, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 5, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 6, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 6, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 6, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 6, baseZ + 3, SokobanMod.BlockVaporizingBlock.blockID, 0); //tile.Vaporizing Block
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 6, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 6, baseZ + 7, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 6, baseZ + 8, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 6, baseZ + 10, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 6, baseZ + 11, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 6, baseZ + 12, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 6, baseZ + 13, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 6, baseZ + 14, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 6, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 7, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 7, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 7, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 7, baseZ + 3, SokobanMod.BlockUnbreakableLamps.blockID, 7); //tile.Unbreakable Lamp Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 7, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 7, baseZ + 9, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 7, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 8, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 8, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 8, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 8, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 8, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 8, baseZ + 8, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 8, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 9, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 9, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 9, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 9, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 9, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 9, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 9, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 9, baseZ + 7, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 9, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 10, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 10, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 10, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 10, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 11, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 11, baseZ + 4, SokobanMod.BlockUnbreakableLamps.blockID, 7); //tile.Unbreakable Lamp Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 11, baseZ + 7, SokobanMod.BlockUnbreakableLamps.blockID, 7); //tile.Unbreakable Lamp Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 11, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 12, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 12, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 12, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 12, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 12, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 12, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 12, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 12, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 12, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 12, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 12, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 12, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 12, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 12, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 12, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 12, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 0, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 0, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 0, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 0, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 0, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 0, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 0, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 0, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 0, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 0, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 0, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 0, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 0, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 0, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 0, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 0, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 1, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 1, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 2, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 2, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 3, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 3, baseZ + 1, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 3, baseZ + 3, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 3, baseZ + 4, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 3, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 4, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 4, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 4, baseZ + 10, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 4, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 5, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 5, baseZ + 3, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 5, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 5, baseZ + 9, SokobanMod.BlockRedstoneRemover.blockID, 5); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 5, baseZ + 11, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 5, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 6, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 6, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 6, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 6, baseZ + 3, SokobanMod.BlockVaporizingBlock.blockID, 0); //tile.Vaporizing Block
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 6, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 6, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 6, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 6, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 6, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 6, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 6, baseZ + 14, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 6, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 7, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 7, baseZ + 1, SokobanMod.BlockUnbreakableLamps.blockID, 7); //tile.Unbreakable Lamp Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 7, baseZ + 2, SokobanMod.BlockUnbreakableLamps.blockID, 7); //tile.Unbreakable Lamp Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 7, baseZ + 3, SokobanMod.BlockVaporizingBlock.blockID, 0); //tile.Vaporizing Block
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 7, baseZ + 4, SokobanMod.BlockUnbreakableLamps.blockID, 7); //tile.Unbreakable Lamp Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 7, baseZ + 5, SokobanMod.BlockUnbreakableLamps.blockID, 7); //tile.Unbreakable Lamp Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 7, baseZ + 6, SokobanMod.BlockUnbreakableLamps.blockID, 7); //tile.Unbreakable Lamp Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 7, baseZ + 7, SokobanMod.BlockUnbreakableLamps.blockID, 7); //tile.Unbreakable Lamp Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 7, baseZ + 8, SokobanMod.BlockUnbreakableLamps.blockID, 7); //tile.Unbreakable Lamp Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 7, baseZ + 9, SokobanMod.BlockUnbreakableLamps.blockID, 7); //tile.Unbreakable Lamp Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 7, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 8, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 8, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 8, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 8, baseZ + 3, SokobanMod.BlockVaporizingBlock.blockID, 0); //tile.Vaporizing Block
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 8, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 8, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 8, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 8, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 8, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 8, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 8, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 9, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 9, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 9, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 9, baseZ + 3, SokobanMod.BlockUnbreakableLamps.blockID, 5); //tile.Unbreakable Lamp Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 9, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 9, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 9, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 9, baseZ + 7, SokobanMod.BlockRedstoneRemover.blockID, 5); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 9, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 9, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 9, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 10, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 10, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 10, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 10, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 10, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 10, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 10, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 10, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 10, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 10, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 11, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 11, baseZ + 1, SokobanMod.BlockUnbreakableLamps.blockID, 7); //tile.Unbreakable Lamp Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 11, baseZ + 2, SokobanMod.BlockUnbreakableLamps.blockID, 7); //tile.Unbreakable Lamp Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 11, baseZ + 3, SokobanMod.BlockUnbreakableLamps.blockID, 7); //tile.Unbreakable Lamp Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 11, baseZ + 4, SokobanMod.BlockUnbreakableLamps.blockID, 7); //tile.Unbreakable Lamp Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 11, baseZ + 7, SokobanMod.BlockUnbreakableLamps.blockID, 7); //tile.Unbreakable Lamp Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 11, baseZ + 8, SokobanMod.BlockUnbreakableLamps.blockID, 7); //tile.Unbreakable Lamp Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 11, baseZ + 9, SokobanMod.BlockUnbreakableLamps.blockID, 7); //tile.Unbreakable Lamp Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 11, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 11, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 12, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 12, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 12, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 12, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 12, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 12, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 12, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 12, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 12, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 12, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 12, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 12, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 12, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 12, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 12, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 12, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 0, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 0, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 0, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 0, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 0, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 0, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 0, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 0, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 0, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 0, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 0, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 0, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 0, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 0, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 0, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 0, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 1, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 1, baseZ + 14, SokobanMod.BlockUnbreakableLamps.blockID, 7); //tile.Unbreakable Lamp Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 1, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 2, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 2, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 3, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 3, baseZ + 1, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 3, baseZ + 8, Block.stone.blockID, 0); //tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 3, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 4, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 4, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 4, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 4, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 5, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 5, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 5, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 5, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 5, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 5, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 5, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 5, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 5, baseZ + 8, SokobanMod.BlockTarget.blockID, 0); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 5, baseZ + 9, SokobanMod.BlockTarget.blockID, 0); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 5, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 5, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 6, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 6, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 6, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 6, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 6, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 7, baseZ + 0, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 7, baseZ + 10, SokobanMod.BlockUnbreakableLamps.blockID, 7); //tile.Unbreakable Lamp Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 7, baseZ + 11, SokobanMod.BlockUnbreakableLamps.blockID, 7); //tile.Unbreakable Lamp Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 7, baseZ + 12, SokobanMod.BlockUnbreakableLamps.blockID, 7); //tile.Unbreakable Lamp Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 7, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 7, baseZ + 14, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 7, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 8, baseZ + 0, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 8, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 8, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 8, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 8, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 8, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 9, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 9, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 9, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 9, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 9, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 9, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 9, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 9, baseZ + 7, SokobanMod.BlockUnbreakableLamps.blockID, 0); //tile.Unbreakable Lamp Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 9, baseZ + 8, SokobanMod.BlockUnbreakableLamps.blockID, 0); //tile.Unbreakable Lamp Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 9, baseZ + 9, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 9, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 9, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 9, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 9, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 9, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 10, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 10, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 10, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 10, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 10, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 10, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 11, baseZ + 0, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 11, baseZ + 10, SokobanMod.BlockUnbreakableLamps.blockID, 7); //tile.Unbreakable Lamp Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 11, baseZ + 11, SokobanMod.BlockUnbreakableLamps.blockID, 7); //tile.Unbreakable Lamp Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 11, baseZ + 12, SokobanMod.BlockUnbreakableLamps.blockID, 7); //tile.Unbreakable Lamp Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 11, baseZ + 13, SokobanMod.BlockUnbreakableLamps.blockID, 7); //tile.Unbreakable Lamp Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 11, baseZ + 14, SokobanMod.BlockUnbreakableLamps.blockID, 7); //tile.Unbreakable Lamp Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 11, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 12, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 12, baseZ + 1, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 12, baseZ + 2, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 12, baseZ + 3, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 12, baseZ + 4, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 12, baseZ + 5, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 12, baseZ + 6, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 12, baseZ + 7, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 12, baseZ + 8, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 12, baseZ + 9, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 12, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 12, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 12, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 12, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 12, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 12, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 0, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 0, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 0, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 0, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 0, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 0, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 0, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 0, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 0, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 0, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 0, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 0, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 0, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 0, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 0, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 0, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 1, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 1, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 2, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 2, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 3, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 3, baseZ + 1, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 3, baseZ + 2, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 3, baseZ + 3, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 3, baseZ + 4, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 3, baseZ + 8, Block.stone.blockID, 0); //tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 3, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 3, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 3, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 3, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 4, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 4, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 4, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 4, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 4, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 4, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 4, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 4, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 5, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 5, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 5, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 5, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 5, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 5, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 5, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 5, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 5, baseZ + 8, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 5, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 5, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 5, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 5, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 5, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 6, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 6, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 6, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 7, baseZ + 0, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 7, baseZ + 13, SokobanMod.BlockUnbreakableLamps.blockID, 7); //tile.Unbreakable Lamp Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 7, baseZ + 14, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 7, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 8, baseZ + 0, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 8, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 8, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 9, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 9, baseZ + 1, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 9, baseZ + 2, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 9, baseZ + 3, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 9, baseZ + 4, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 9, baseZ + 5, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 9, baseZ + 6, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 9, baseZ + 7, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 9, baseZ + 8, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 9, baseZ + 9, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 9, baseZ + 10, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 9, baseZ + 11, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 9, baseZ + 12, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 9, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 9, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 10, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 10, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 10, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 10, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 11, baseZ + 0, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 11, baseZ + 15, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 12, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 12, baseZ + 1, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 12, baseZ + 2, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 12, baseZ + 3, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 12, baseZ + 4, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 12, baseZ + 5, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 12, baseZ + 6, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 12, baseZ + 7, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 12, baseZ + 8, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 12, baseZ + 9, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 12, baseZ + 10, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 12, baseZ + 11, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 12, baseZ + 12, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 12, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 12, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 12, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 0, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 0, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 0, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 0, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 0, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 0, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 0, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 0, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 0, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 0, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 0, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 0, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 0, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 0, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 0, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 0, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 1, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 1, baseZ + 1, SokobanMod.BlockUnbreakableLamps.blockID, 7); //tile.Unbreakable Lamp Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 1, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 2, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 2, baseZ + 4, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 2, baseZ + 9, Block.stone.blockID, 0); //tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 2, baseZ + 10, Block.stone.blockID, 0); //tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 2, baseZ + 11, Block.stone.blockID, 0); //tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 2, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 3, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 3, baseZ + 1, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 3, baseZ + 8, Block.stone.blockID, 0); //tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 3, baseZ + 12, Block.stone.blockID, 0); //tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 3, baseZ + 13, Block.stone.blockID, 0); //tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 3, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 4, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 4, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 4, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 4, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 5, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 5, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 5, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 5, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 5, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 5, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 5, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 5, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 5, baseZ + 8, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 5, baseZ + 9, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 5, baseZ + 10, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 5, baseZ + 11, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 5, baseZ + 12, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 5, baseZ + 13, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 5, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 6, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 6, baseZ + 12, SokobanMod.BlockLootGenerator.blockID, 0); //tile.Loot Generator
        if(world.getBlockTileEntity(baseX + 5, baseY + 6, baseZ + 12) instanceof TileEntityLootGenerator) {
            TileEntityLootGenerator teLg = (TileEntityLootGenerator)world.getBlockTileEntity(baseX + 5, baseY + 6, baseZ + 12);
            LevelGenBase.setLootGeneratorContents(teLg, staticInventoryContents_5_6_12, randomInventoryContents_5_6_12);
        }
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 6, baseZ + 13, SokobanMod.BlockRedstoneRemover.blockID, 2); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 6, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 7, baseZ + 0, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 7, baseZ + 13, SokobanMod.BlockUnbreakableLamps.blockID, 7); //tile.Unbreakable Lamp Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 7, baseZ + 14, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 7, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 8, baseZ + 0, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 8, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 8, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 9, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 9, baseZ + 1, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 9, baseZ + 2, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 9, baseZ + 3, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 9, baseZ + 4, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 9, baseZ + 5, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 9, baseZ + 6, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 9, baseZ + 7, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 9, baseZ + 8, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 9, baseZ + 9, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 9, baseZ + 10, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 9, baseZ + 11, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 9, baseZ + 12, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 9, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 9, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 10, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 10, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 10, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 10, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 11, baseZ + 0, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 11, baseZ + 15, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 12, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 12, baseZ + 1, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 12, baseZ + 2, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 12, baseZ + 3, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 12, baseZ + 4, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 12, baseZ + 5, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 12, baseZ + 6, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 12, baseZ + 7, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 12, baseZ + 8, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 12, baseZ + 9, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 12, baseZ + 10, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 12, baseZ + 11, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 12, baseZ + 12, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 12, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 12, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 12, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 0, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 0, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 0, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 0, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 0, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 0, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 0, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 0, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 0, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 0, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 0, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 0, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 0, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 0, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 0, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 0, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 1, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 1, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 2, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 2, baseZ + 4, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 2, baseZ + 13, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 2, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 3, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 3, baseZ + 1, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 3, baseZ + 2, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 3, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 3, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 3, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 3, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 4, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 4, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 4, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 4, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 4, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 4, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 4, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 4, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 5, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 5, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 5, baseZ + 2, SokobanMod.BlockTarget.blockID, 3); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 5, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 5, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 5, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 5, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 5, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 5, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 5, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 5, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 5, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 5, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 5, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 6, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 6, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 6, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 6, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 6, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 6, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 7, baseZ + 0, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 7, baseZ + 13, SokobanMod.BlockUnbreakableLamps.blockID, 7); //tile.Unbreakable Lamp Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 7, baseZ + 14, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 7, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 8, baseZ + 0, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 8, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 8, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 9, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 9, baseZ + 1, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 9, baseZ + 2, SokobanMod.BlockUnbreakableLamps.blockID, 5); //tile.Unbreakable Lamp Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 9, baseZ + 3, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 9, baseZ + 4, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 9, baseZ + 5, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 9, baseZ + 6, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 9, baseZ + 7, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 9, baseZ + 8, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 9, baseZ + 9, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 9, baseZ + 10, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 9, baseZ + 11, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 9, baseZ + 12, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 9, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 9, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 10, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 10, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 10, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 10, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 11, baseZ + 0, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 11, baseZ + 15, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 12, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 12, baseZ + 1, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 12, baseZ + 2, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 12, baseZ + 3, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 12, baseZ + 4, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 12, baseZ + 5, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 12, baseZ + 6, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 12, baseZ + 7, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 12, baseZ + 8, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 12, baseZ + 9, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 12, baseZ + 10, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 12, baseZ + 11, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 12, baseZ + 12, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 12, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 12, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 12, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 0, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 0, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 0, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 0, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 0, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 0, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 0, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 0, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 0, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 0, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 0, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 0, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 0, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 0, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 0, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 0, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 1, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 1, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 2, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 2, baseZ + 2, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 2, baseZ + 7, SokobanMod.BlockUnbreakableLamps.blockID, 7); //tile.Unbreakable Lamp Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 2, baseZ + 13, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 2, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 3, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 3, baseZ + 1, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 3, baseZ + 5, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 3, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 4, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 4, baseZ + 10, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 4, baseZ + 11, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 4, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 5, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 5, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 5, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 5, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 5, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 5, baseZ + 5, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 5, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 5, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 5, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 5, baseZ + 9, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 5, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 6, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 6, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 6, baseZ + 5, SokobanMod.BlockVaporizingBlock.blockID, 0); //tile.Vaporizing Block
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 6, baseZ + 6, SokobanMod.BlockVaporizingBlock.blockID, 0); //tile.Vaporizing Block
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 6, baseZ + 7, SokobanMod.BlockVaporizingBlock.blockID, 0); //tile.Vaporizing Block
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 6, baseZ + 8, SokobanMod.BlockVaporizingBlock.blockID, 0); //tile.Vaporizing Block
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 6, baseZ + 9, SokobanMod.BlockVaporizingBlock.blockID, 0); //tile.Vaporizing Block
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 6, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 6, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 6, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 6, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 6, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 7, baseZ + 0, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 7, baseZ + 10, SokobanMod.BlockUnbreakableLamps.blockID, 7); //tile.Unbreakable Lamp Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 7, baseZ + 11, SokobanMod.BlockUnbreakableLamps.blockID, 7); //tile.Unbreakable Lamp Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 7, baseZ + 12, SokobanMod.BlockUnbreakableLamps.blockID, 7); //tile.Unbreakable Lamp Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 7, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 7, baseZ + 14, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 7, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 8, baseZ + 0, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 8, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 8, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 8, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 8, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 8, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 9, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 9, baseZ + 1, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 9, baseZ + 2, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 9, baseZ + 3, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 9, baseZ + 4, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 9, baseZ + 5, SokobanMod.BlockUnbreakableLamps.blockID, 3); //tile.Unbreakable Lamp Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 9, baseZ + 6, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 9, baseZ + 7, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 9, baseZ + 8, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 9, baseZ + 9, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 9, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 9, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 9, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 9, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 9, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 10, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 10, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 10, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 10, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 10, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 10, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 11, baseZ + 0, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 11, baseZ + 10, SokobanMod.BlockUnbreakableLamps.blockID, 7); //tile.Unbreakable Lamp Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 11, baseZ + 11, SokobanMod.BlockUnbreakableLamps.blockID, 7); //tile.Unbreakable Lamp Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 11, baseZ + 12, SokobanMod.BlockUnbreakableLamps.blockID, 7); //tile.Unbreakable Lamp Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 11, baseZ + 13, SokobanMod.BlockUnbreakableLamps.blockID, 7); //tile.Unbreakable Lamp Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 11, baseZ + 14, SokobanMod.BlockUnbreakableLamps.blockID, 7); //tile.Unbreakable Lamp Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 11, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 12, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 12, baseZ + 1, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 12, baseZ + 2, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 12, baseZ + 3, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 12, baseZ + 4, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 12, baseZ + 5, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 12, baseZ + 6, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 12, baseZ + 7, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 12, baseZ + 8, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 12, baseZ + 9, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 12, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 12, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 12, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 12, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 12, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 12, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 0, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 0, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 0, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 0, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 0, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 0, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 0, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 0, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 0, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 0, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 0, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 0, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 0, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 0, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 0, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 0, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 1, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 1, baseZ + 4, SokobanMod.BlockUnbreakableLamps.blockID, 7); //tile.Unbreakable Lamp Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 1, baseZ + 14, SokobanMod.BlockUnbreakableLamps.blockID, 7); //tile.Unbreakable Lamp Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 1, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 2, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 2, baseZ + 2, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 2, baseZ + 4, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 2, baseZ + 5, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 2, baseZ + 7, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 2, baseZ + 8, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 2, baseZ + 9, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 2, baseZ + 10, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 2, baseZ + 11, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 2, baseZ + 12, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 2, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 3, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 3, baseZ + 1, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 3, baseZ + 7, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 3, baseZ + 13, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 3, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 4, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 4, baseZ + 11, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 4, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 5, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 5, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 5, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 5, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 5, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 5, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 5, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 5, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 5, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 5, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 5, baseZ + 12, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 5, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 6, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 6, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 6, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 6, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 6, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 7, baseZ + 0, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 7, baseZ + 10, SokobanMod.BlockUnbreakableLamps.blockID, 7); //tile.Unbreakable Lamp Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 7, baseZ + 14, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 7, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 8, baseZ + 0, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 8, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 8, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 9, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 9, baseZ + 1, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 9, baseZ + 2, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 9, baseZ + 3, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 9, baseZ + 4, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 9, baseZ + 5, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 9, baseZ + 6, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 9, baseZ + 7, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 9, baseZ + 8, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 9, baseZ + 9, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 9, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 9, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 10, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 10, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 10, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 11, baseZ + 0, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 11, baseZ + 10, SokobanMod.BlockUnbreakableLamps.blockID, 7); //tile.Unbreakable Lamp Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 11, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 12, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 12, baseZ + 1, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 12, baseZ + 2, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 12, baseZ + 3, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 12, baseZ + 4, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 12, baseZ + 5, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 12, baseZ + 6, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 12, baseZ + 7, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 12, baseZ + 8, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 12, baseZ + 9, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 12, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 12, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 12, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 12, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 12, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 12, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 0, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 0, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 0, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 0, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 0, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 0, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 0, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 0, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 0, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 0, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 0, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 0, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 0, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 0, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 0, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 0, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 1, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 1, baseZ + 10, SokobanMod.BlockUnbreakableLamps.blockID, 7); //tile.Unbreakable Lamp Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 1, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 2, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 2, baseZ + 2, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 2, baseZ + 7, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 2, baseZ + 13, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 2, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 3, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 3, baseZ + 1, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 3, baseZ + 4, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 3, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 4, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 4, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 5, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 5, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 5, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 5, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 5, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 5, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 5, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 5, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 5, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 5, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 5, baseZ + 12, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 5, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 6, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 6, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 6, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 7, baseZ + 0, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 7, baseZ + 10, SokobanMod.BlockUnbreakableLamps.blockID, 7); //tile.Unbreakable Lamp Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 7, baseZ + 14, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 7, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 8, baseZ + 0, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 8, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 8, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 9, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 9, baseZ + 1, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 9, baseZ + 2, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 9, baseZ + 3, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 9, baseZ + 4, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 9, baseZ + 5, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 9, baseZ + 6, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 9, baseZ + 7, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 9, baseZ + 8, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 9, baseZ + 9, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 9, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 9, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 10, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 10, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 10, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 10, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 10, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 10, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 10, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 11, baseZ + 0, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 11, baseZ + 10, SokobanMod.BlockUnbreakableLamps.blockID, 7); //tile.Unbreakable Lamp Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 11, baseZ + 11, SokobanMod.BlockUnbreakableLamps.blockID, 7); //tile.Unbreakable Lamp Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 11, baseZ + 12, SokobanMod.BlockUnbreakableLamps.blockID, 7); //tile.Unbreakable Lamp Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 11, baseZ + 13, SokobanMod.BlockUnbreakableLamps.blockID, 7); //tile.Unbreakable Lamp Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 11, baseZ + 14, SokobanMod.BlockUnbreakableLamps.blockID, 7); //tile.Unbreakable Lamp Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 11, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 12, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 12, baseZ + 1, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 12, baseZ + 2, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 12, baseZ + 3, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 12, baseZ + 4, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 12, baseZ + 5, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 12, baseZ + 6, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 12, baseZ + 7, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 12, baseZ + 8, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 12, baseZ + 9, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 12, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 12, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 12, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 12, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 12, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 12, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 0, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 0, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 0, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 0, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 0, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 0, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 0, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 0, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 0, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 0, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 0, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 0, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 0, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 0, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 0, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 0, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 1, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 1, baseZ + 12, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 1, baseZ + 13, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 1, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 2, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 2, baseZ + 2, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 2, baseZ + 3, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 2, baseZ + 4, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 2, baseZ + 5, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 2, baseZ + 6, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 2, baseZ + 7, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 2, baseZ + 9, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 2, baseZ + 10, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 2, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 3, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 3, baseZ + 1, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 3, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 4, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 4, baseZ + 7, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 4, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 4, baseZ + 13, Block.stone.blockID, 0); //tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 4, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 5, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 5, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 5, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 5, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 5, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 5, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 5, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 5, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 5, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 5, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 5, baseZ + 10, SokobanMod.BlockRedstoneRemover.blockID, 2); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 5, baseZ + 11, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 5, baseZ + 12, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 5, baseZ + 13, 33, 0); //tile.pistonBase
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 5, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 6, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 6, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 6, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 6, baseZ + 10, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 6, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 7, baseZ + 0, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 7, baseZ + 6, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 7, baseZ + 8, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 7, baseZ + 10, SokobanMod.BlockUnbreakableLamps.blockID, 7); //tile.Unbreakable Lamp Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 7, baseZ + 14, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 7, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 8, baseZ + 0, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 8, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 8, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 8, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 8, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 9, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 9, baseZ + 1, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 9, baseZ + 2, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 9, baseZ + 3, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 9, baseZ + 4, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 9, baseZ + 5, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 9, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 9, baseZ + 7, SokobanMod.BlockUnbreakableLamps.blockID, 3); //tile.Unbreakable Lamp Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 9, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 9, baseZ + 9, SokobanMod.BlockUnbreakableLamps.blockID, 4); //tile.Unbreakable Lamp Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 9, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 9, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 9, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 9, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 9, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 9, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 10, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 11, baseZ + 0, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 12, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 12, baseZ + 1, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 12, baseZ + 2, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 12, baseZ + 3, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 12, baseZ + 4, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 12, baseZ + 5, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 12, baseZ + 6, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 12, baseZ + 7, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 12, baseZ + 8, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 12, baseZ + 9, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 12, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 12, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 12, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 12, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 12, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 12, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 0, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 0, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 0, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 0, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 0, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 0, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 0, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 0, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 0, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 0, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 0, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 0, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 0, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 0, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 0, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 0, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 1, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 1, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 1, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 2, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 2, baseZ + 6, SokobanMod.BlockUnbreakableLamps.blockID, 7); //tile.Unbreakable Lamp Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 2, baseZ + 9, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 2, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 2, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 3, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 3, baseZ + 1, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 3, baseZ + 7, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 3, baseZ + 8, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 3, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 3, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 4, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 4, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 4, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 5, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 5, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 5, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 5, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 5, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 5, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 5, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 5, baseZ + 7, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 5, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 5, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 5, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 5, baseZ + 12, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 5, baseZ + 13, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 5, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 6, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 6, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 6, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 6, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 6, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 6, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 6, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 6, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 7, baseZ + 0, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 7, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 7, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 7, baseZ + 6, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 7, baseZ + 8, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 7, baseZ + 10, SokobanMod.BlockUnbreakableLamps.blockID, 7); //tile.Unbreakable Lamp Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 7, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 7, baseZ + 14, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 7, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 8, baseZ + 0, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 8, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 8, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 8, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 8, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 8, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 8, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 9, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 9, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 9, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 9, baseZ + 3, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 9, baseZ + 4, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 9, baseZ + 5, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 9, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 9, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 9, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 9, baseZ + 9, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 9, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 9, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 9, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 9, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 9, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 9, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 10, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 11, baseZ + 0, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 12, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 12, baseZ + 1, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 12, baseZ + 2, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 12, baseZ + 3, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 12, baseZ + 4, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 12, baseZ + 5, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 12, baseZ + 6, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 12, baseZ + 7, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 12, baseZ + 8, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 12, baseZ + 9, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 12, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 12, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 12, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 12, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 12, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 12, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 0, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 0, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 0, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 0, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 0, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 0, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 0, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 0, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 0, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 0, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 0, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 0, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 0, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 0, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 0, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 0, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 1, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 1, baseZ + 1, SokobanMod.BlockUnbreakableLamps.blockID, 7); //tile.Unbreakable Lamp Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 1, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 1, baseZ + 11, Block.stone.blockID, 0); //tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 1, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 1, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 2, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 2, baseZ + 9, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 2, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 2, baseZ + 11, Block.stone.blockID, 0); //tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 2, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 2, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 3, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 3, baseZ + 1, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 3, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 3, baseZ + 11, Block.stone.blockID, 0); //tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 3, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 3, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 4, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 4, baseZ + 7, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 4, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 4, baseZ + 11, Block.stone.blockID, 0); //tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 4, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 4, baseZ + 13, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 4, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 5, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 5, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 5, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 5, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 5, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 5, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 5, baseZ + 7, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 5, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 5, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 5, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 5, baseZ + 11, Block.stone.blockID, 0); //tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 5, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 5, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 6, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 6, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 6, baseZ + 2, SokobanMod.BlockUnbreakableLamps.blockID, 4); //tile.Unbreakable Lamp Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 6, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 6, baseZ + 11, Block.stone.blockID, 0); //tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 6, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 6, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 7, baseZ + 0, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 7, baseZ + 6, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 7, baseZ + 7, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 7, baseZ + 8, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 7, baseZ + 10, SokobanMod.BlockUnbreakableLamps.blockID, 7); //tile.Unbreakable Lamp Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 7, baseZ + 11, Block.stone.blockID, 0); //tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 7, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 7, baseZ + 14, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 7, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 8, baseZ + 0, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 8, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 8, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 8, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 8, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 8, baseZ + 11, Block.stone.blockID, 0); //tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 8, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 8, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 9, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 9, baseZ + 2, SokobanMod.BlockUnbreakableLamps.blockID, 4); //tile.Unbreakable Lamp Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 9, baseZ + 3, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 9, baseZ + 4, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 9, baseZ + 5, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 9, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 9, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 9, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 9, baseZ + 9, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 9, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 9, baseZ + 11, Block.stone.blockID, 0); //tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 9, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 9, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 10, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 10, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 10, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 10, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 10, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 10, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 10, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 11, baseZ + 0, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 11, baseZ + 10, SokobanMod.BlockUnbreakableLamps.blockID, 7); //tile.Unbreakable Lamp Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 11, baseZ + 11, SokobanMod.BlockUnbreakableLamps.blockID, 7); //tile.Unbreakable Lamp Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 11, baseZ + 12, SokobanMod.BlockUnbreakableLamps.blockID, 7); //tile.Unbreakable Lamp Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 11, baseZ + 13, SokobanMod.BlockUnbreakableLamps.blockID, 7); //tile.Unbreakable Lamp Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 11, baseZ + 14, SokobanMod.BlockUnbreakableLamps.blockID, 7); //tile.Unbreakable Lamp Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 11, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 12, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 12, baseZ + 1, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 12, baseZ + 2, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 12, baseZ + 3, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 12, baseZ + 4, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 12, baseZ + 5, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 12, baseZ + 6, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 12, baseZ + 7, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 12, baseZ + 8, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 12, baseZ + 9, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 12, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 12, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 12, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 12, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 12, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 12, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 0, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 0, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 0, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 0, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 0, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 0, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 0, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 0, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 0, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 0, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 0, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 0, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 0, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 0, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 0, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 0, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 1, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 1, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 1, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 1, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 2, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 2, baseZ + 9, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 2, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 2, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 2, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 3, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 3, baseZ + 1, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 3, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 3, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 3, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 4, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 4, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 4, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 4, baseZ + 13, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 4, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 5, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 5, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 5, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 5, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 5, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 5, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 5, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 5, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 5, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 5, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 5, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 5, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 5, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 6, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 6, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 6, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 6, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 6, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 6, baseZ + 14, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 6, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 7, baseZ + 0, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 7, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 7, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 7, baseZ + 10, SokobanMod.BlockUnbreakableLamps.blockID, 7); //tile.Unbreakable Lamp Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 7, baseZ + 12, SokobanMod.BlockUnbreakableLamps.blockID, 7); //tile.Unbreakable Lamp Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 7, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 8, baseZ + 0, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 8, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 8, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 8, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 9, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 9, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 9, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 9, baseZ + 3, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 9, baseZ + 4, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 9, baseZ + 5, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 9, baseZ + 6, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 9, baseZ + 7, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 9, baseZ + 8, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 9, baseZ + 9, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 9, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 9, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 9, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 10, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 10, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 10, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 11, baseZ + 0, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 11, baseZ + 12, SokobanMod.BlockUnbreakableLamps.blockID, 7); //tile.Unbreakable Lamp Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 11, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 12, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 12, baseZ + 1, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 12, baseZ + 2, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 12, baseZ + 3, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 12, baseZ + 4, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 12, baseZ + 5, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 12, baseZ + 6, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 12, baseZ + 7, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 12, baseZ + 8, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 12, baseZ + 9, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 12, baseZ + 10, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 12, baseZ + 11, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 12, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 12, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 12, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 12, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 0, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 0, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 0, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 0, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 0, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 0, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 0, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 0, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 0, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 0, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 0, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 0, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 0, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 0, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 0, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 0, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 1, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 1, baseZ + 7, SokobanMod.BlockUnbreakableLamps.blockID, 7); //tile.Unbreakable Lamp Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 1, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 1, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 1, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 2, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 2, baseZ + 7, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 2, baseZ + 8, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 2, baseZ + 9, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 2, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 2, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 2, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 3, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 3, baseZ + 1, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 3, baseZ + 7, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 3, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 3, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 4, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 4, baseZ + 11, SokobanMod.BlockUnbreakableLamps.blockID, 0); //tile.Unbreakable Lamp Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 4, baseZ + 13, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 4, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 5, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 5, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 5, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 5, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 5, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 5, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 5, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 5, baseZ + 7, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 5, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 5, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 5, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 5, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 6, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 6, baseZ + 5, SokobanMod.BlockVaporizingBlock.blockID, 0); //tile.Vaporizing Block
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 6, baseZ + 6, SokobanMod.BlockVaporizingBlock.blockID, 0); //tile.Vaporizing Block
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 6, baseZ + 7, SokobanMod.BlockVaporizingBlock.blockID, 0); //tile.Vaporizing Block
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 6, baseZ + 8, SokobanMod.BlockVaporizingBlock.blockID, 0); //tile.Vaporizing Block
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 6, baseZ + 9, SokobanMod.BlockVaporizingBlock.blockID, 0); //tile.Vaporizing Block
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 6, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 6, baseZ + 11, SokobanMod.BlockUnbreakableLamps.blockID, 5); //tile.Unbreakable Lamp Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 6, baseZ + 14, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 6, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 7, baseZ + 0, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 7, baseZ + 10, SokobanMod.BlockUnbreakableLamps.blockID, 7); //tile.Unbreakable Lamp Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 7, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 7, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 8, baseZ + 0, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 8, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 8, baseZ + 11, SokobanMod.BlockUnbreakableLamps.blockID, 3); //tile.Unbreakable Lamp Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 8, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 9, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 9, baseZ + 1, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 9, baseZ + 2, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 9, baseZ + 3, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 9, baseZ + 4, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 9, baseZ + 5, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 9, baseZ + 6, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 9, baseZ + 7, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 9, baseZ + 8, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 9, baseZ + 9, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 9, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 9, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 9, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 10, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 10, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 10, baseZ + 11, SokobanMod.BlockUnbreakableLamps.blockID, 4); //tile.Unbreakable Lamp Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 10, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 11, baseZ + 0, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 11, baseZ + 10, SokobanMod.BlockUnbreakableLamps.blockID, 7); //tile.Unbreakable Lamp Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 11, baseZ + 11, SokobanMod.BlockUnbreakableLamps.blockID, 7); //tile.Unbreakable Lamp Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 11, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 12, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 12, baseZ + 1, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 12, baseZ + 2, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 12, baseZ + 3, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 12, baseZ + 4, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 12, baseZ + 5, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 12, baseZ + 6, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 12, baseZ + 7, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 12, baseZ + 8, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 12, baseZ + 9, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 12, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 12, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 12, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 12, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 12, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 12, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 0, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 0, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 0, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 0, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 0, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 0, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 0, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 0, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 0, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 0, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 0, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 0, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 0, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 0, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 0, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 0, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 1, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 1, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 1, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 1, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 1, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 1, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 2, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 2, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 2, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 2, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 2, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 2, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 3, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 3, baseZ + 1, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 3, baseZ + 4, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 3, baseZ + 5, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 3, baseZ + 6, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 3, baseZ + 7, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 3, baseZ + 8, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 3, baseZ + 9, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 3, baseZ + 10, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 3, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 3, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 3, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 3, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 3, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 4, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 4, baseZ + 11, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 4, baseZ + 12, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 4, baseZ + 13, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 4, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 5, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 5, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 5, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 5, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 5, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 5, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 5, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 5, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 5, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 5, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 5, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 6, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 6, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 6, baseZ + 14, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 6, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 7, baseZ + 0, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 7, baseZ + 10, SokobanMod.BlockUnbreakableLamps.blockID, 7); //tile.Unbreakable Lamp Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 7, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 8, baseZ + 0, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 8, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 8, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 9, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 9, baseZ + 1, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 9, baseZ + 2, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 9, baseZ + 3, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 9, baseZ + 4, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 9, baseZ + 5, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 9, baseZ + 6, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 9, baseZ + 7, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 9, baseZ + 8, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 9, baseZ + 9, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 9, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 9, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 10, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 10, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 10, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 11, baseZ + 0, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 11, baseZ + 10, SokobanMod.BlockUnbreakableLamps.blockID, 7); //tile.Unbreakable Lamp Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 11, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 12, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 12, baseZ + 1, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 12, baseZ + 2, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 12, baseZ + 3, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 12, baseZ + 4, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 12, baseZ + 5, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 12, baseZ + 6, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 12, baseZ + 7, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 12, baseZ + 8, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 12, baseZ + 9, SokobanMod.BlockUnbreakableGlasses.blockID, 0); //tile.Unbreakable Glass Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 12, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 12, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 12, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 12, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 12, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 12, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 0, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 0, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 0, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 0, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 0, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 0, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 0, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 0, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 0, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 0, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 0, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 0, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 0, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 0, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 0, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 0, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 1, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 1, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 2, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 2, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 3, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 3, baseZ + 1, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 3, baseZ + 4, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 3, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 4, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 4, baseZ + 11, SokobanMod.BlockUnbreakableLamps.blockID, 4); //tile.Unbreakable Lamp Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 4, baseZ + 12, SokobanMod.BlockUnbreakableLamps.blockID, 3); //tile.Unbreakable Lamp Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 4, baseZ + 13, SokobanMod.BlockUnbreakableLamps.blockID, 5); //tile.Unbreakable Lamp Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 4, baseZ + 14, SokobanMod.BlockUnbreakableLamps.blockID, 0); //tile.Unbreakable Lamp Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 4, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 5, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 5, baseZ + 4, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 5, baseZ + 5, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 5, baseZ + 6, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 5, baseZ + 7, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 5, baseZ + 8, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 5, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 6, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 6, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 6, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 6, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 6, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 6, baseZ + 5, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 6, baseZ + 6, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 6, baseZ + 7, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 6, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 6, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 6, baseZ + 14, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 6, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 7, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 7, baseZ + 1, SokobanMod.BlockUnbreakableLamps.blockID, 7); //tile.Unbreakable Lamp Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 7, baseZ + 2, SokobanMod.BlockUnbreakableLamps.blockID, 7); //tile.Unbreakable Lamp Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 7, baseZ + 3, SokobanMod.BlockUnbreakableLamps.blockID, 7); //tile.Unbreakable Lamp Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 7, baseZ + 5, SokobanMod.BlockUnbreakableLamps.blockID, 15); //tile.Unbreakable Lamp Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 7, baseZ + 6, SokobanMod.BlockUnbreakableLamps.blockID, 15); //tile.Unbreakable Lamp Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 7, baseZ + 7, SokobanMod.BlockUnbreakableLamps.blockID, 15); //tile.Unbreakable Lamp Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 7, baseZ + 8, SokobanMod.BlockUnbreakableLamps.blockID, 7); //tile.Unbreakable Lamp Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 7, baseZ + 9, SokobanMod.BlockUnbreakableLamps.blockID, 7); //tile.Unbreakable Lamp Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 7, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 8, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 8, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 8, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 8, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 8, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 8, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 8, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 8, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 8, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 8, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 8, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 9, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 9, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 9, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 9, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 9, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 9, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 9, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 9, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 9, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 9, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 9, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 10, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 10, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 10, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 10, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 10, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 10, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 10, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 10, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 10, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 11, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 11, baseZ + 1, SokobanMod.BlockUnbreakableLamps.blockID, 7); //tile.Unbreakable Lamp Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 11, baseZ + 2, SokobanMod.BlockUnbreakableLamps.blockID, 7); //tile.Unbreakable Lamp Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 11, baseZ + 3, SokobanMod.BlockUnbreakableLamps.blockID, 7); //tile.Unbreakable Lamp Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 11, baseZ + 4, SokobanMod.BlockUnbreakableLamps.blockID, 7); //tile.Unbreakable Lamp Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 11, baseZ + 7, SokobanMod.BlockUnbreakableLamps.blockID, 7); //tile.Unbreakable Lamp Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 11, baseZ + 8, SokobanMod.BlockUnbreakableLamps.blockID, 7); //tile.Unbreakable Lamp Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 11, baseZ + 9, SokobanMod.BlockUnbreakableLamps.blockID, 7); //tile.Unbreakable Lamp Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 11, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 12, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 12, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 12, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 12, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 12, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 12, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 12, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 12, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 12, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 12, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 12, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 12, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 12, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 12, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 12, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 12, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 0, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 0, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 0, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 0, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 0, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 0, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 0, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 0, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 0, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 0, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 0, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 0, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 0, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 0, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 0, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 0, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 1, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 1, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 2, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 2, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 3, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 3, baseZ + 1, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 3, baseZ + 4, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 3, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 4, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 4, baseZ + 5, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 4, baseZ + 11, SokobanMod.BlockUnbreakableLamps.blockID, 4); //tile.Unbreakable Lamp Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 4, baseZ + 12, SokobanMod.BlockUnbreakableLamps.blockID, 3); //tile.Unbreakable Lamp Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 4, baseZ + 13, SokobanMod.BlockUnbreakableLamps.blockID, 5); //tile.Unbreakable Lamp Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 4, baseZ + 14, SokobanMod.BlockUnbreakableLamps.blockID, 0); //tile.Unbreakable Lamp Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 4, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 5, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 5, baseZ + 6, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 5, baseZ + 8, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 5, baseZ + 9, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 5, baseZ + 10, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 5, baseZ + 11, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 5, baseZ + 12, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 5, baseZ + 13, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 5, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 6, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 6, baseZ + 7, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 6, baseZ + 14, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 6, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 7, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 7, baseZ + 4, SokobanMod.BlockUnbreakableLamps.blockID, 4); //tile.Unbreakable Lamp Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 7, baseZ + 5, SokobanMod.BlockUnbreakableLamps.blockID, 3); //tile.Unbreakable Lamp Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 7, baseZ + 6, SokobanMod.BlockUnbreakableLamps.blockID, 5); //tile.Unbreakable Lamp Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 7, baseZ + 7, SokobanMod.BlockUnbreakableLamps.blockID, 0); //tile.Unbreakable Lamp Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 7, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 8, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 8, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 9, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 9, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 9, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 9, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 10, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 10, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 10, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 10, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 11, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 11, baseZ + 4, SokobanMod.BlockUnbreakableLamps.blockID, 7); //tile.Unbreakable Lamp Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 11, baseZ + 7, SokobanMod.BlockUnbreakableLamps.blockID, 7); //tile.Unbreakable Lamp Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 11, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 12, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 12, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 12, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 12, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 12, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 12, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 12, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 12, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 12, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 12, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 12, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 12, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 12, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 12, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 12, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 12, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 18, baseY + 0, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 18, baseY + 0, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 18, baseY + 0, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 18, baseY + 0, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 18, baseY + 0, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 18, baseY + 0, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 18, baseY + 0, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 18, baseY + 0, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 18, baseY + 0, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 18, baseY + 0, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 18, baseY + 0, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 18, baseY + 0, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 18, baseY + 0, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 18, baseY + 0, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 18, baseY + 0, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 18, baseY + 0, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 18, baseY + 1, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 18, baseY + 1, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 18, baseY + 1, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 18, baseY + 1, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 18, baseY + 1, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 18, baseY + 1, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 18, baseY + 2, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 18, baseY + 2, baseZ + 2, SokobanMod.BlockUnbreakableLamps.blockID, 7); //tile.Unbreakable Lamp Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 18, baseY + 2, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 18, baseY + 2, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 18, baseY + 2, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 18, baseY + 2, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 18, baseY + 2, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 18, baseY + 3, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 18, baseY + 3, baseZ + 4, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 18, baseY + 3, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 18, baseY + 3, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 18, baseY + 3, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 18, baseY + 3, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 18, baseY + 3, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 18, baseY + 4, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 18, baseY + 4, baseZ + 1, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 18, baseY + 4, baseZ + 5, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 18, baseY + 4, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 18, baseY + 5, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 18, baseY + 5, baseZ + 2, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 18, baseY + 5, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 18, baseY + 6, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 18, baseY + 6, baseZ + 3, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 18, baseY + 6, baseZ + 4, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 18, baseY + 6, baseZ + 5, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 18, baseY + 6, baseZ + 6, Block.bedrock.blockID, 0); //tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 18, baseY + 6, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 18, baseY + 7, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 18, baseY + 7, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 18, baseY + 8, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 18, baseY + 8, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 18, baseY + 9, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 18, baseY + 9, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 18, baseY + 9, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 18, baseY + 9, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 18, baseY + 10, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 18, baseY + 10, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 18, baseY + 10, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 18, baseY + 10, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 18, baseY + 11, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 18, baseY + 11, baseZ + 4, SokobanMod.BlockUnbreakableLamps.blockID, 7); //tile.Unbreakable Lamp Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 18, baseY + 11, baseZ + 7, SokobanMod.BlockUnbreakableLamps.blockID, 7); //tile.Unbreakable Lamp Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 18, baseY + 11, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 18, baseY + 12, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 18, baseY + 12, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 18, baseY + 12, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 18, baseY + 12, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 18, baseY + 12, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 18, baseY + 12, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 18, baseY + 12, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 18, baseY + 12, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 18, baseY + 12, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 18, baseY + 12, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 18, baseY + 12, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 18, baseY + 12, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 18, baseY + 12, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 18, baseY + 12, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 18, baseY + 12, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 18, baseY + 12, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 0, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 0, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 0, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 0, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 0, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 0, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 0, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 0, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 0, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 0, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 0, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 0, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 0, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 0, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 0, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 0, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 1, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 1, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 1, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 1, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 1, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 1, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 1, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 1, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 1, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 1, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 1, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 1, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 1, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 1, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 1, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 1, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 2, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 2, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 2, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 2, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 2, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 2, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 2, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 2, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 2, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 2, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 2, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 2, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 2, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 2, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 2, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 2, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 3, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 3, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 3, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 3, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 3, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 3, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 3, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 3, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 3, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 3, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 3, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 3, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 3, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 3, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 3, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 3, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 4, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 4, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 4, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 4, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 4, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 4, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 4, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 4, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 4, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 4, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 4, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 4, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 4, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 4, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 4, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 4, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 5, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 5, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 5, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 5, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 5, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 5, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 5, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 5, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 5, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 5, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 5, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 5, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 5, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 5, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 5, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 5, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 6, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 6, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 6, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 6, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 6, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 6, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 6, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 6, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 6, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 6, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 6, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 6, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 6, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 6, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 6, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 6, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 7, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 7, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 7, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 7, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 7, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 7, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 7, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 7, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 7, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 7, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 7, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 7, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 7, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 7, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 7, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 7, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 8, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 8, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 8, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 8, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 8, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 8, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 8, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 8, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 8, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 8, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 8, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 8, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 8, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 8, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 8, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 8, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 9, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 9, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 9, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 9, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 9, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 9, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 9, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 9, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 9, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 9, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 9, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 9, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 9, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 9, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 9, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 9, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 10, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 10, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 10, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 10, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 10, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 10, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 10, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 10, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 10, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 10, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 10, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 10, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 10, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 10, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 11, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 11, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 11, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 11, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 11, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 11, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 11, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 11, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 11, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 11, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 11, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 11, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 11, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 11, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 12, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 12, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 12, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 12, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 12, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 12, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 12, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 12, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 12, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 12, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 12, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 12, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 12, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 12, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 12, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 19, baseY + 12, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks

        //Instable blocks (like torches, levers, signs)
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 4, baseZ + 1, Block.redstoneWire.blockID, 0); //tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 4, baseZ + 4, Block.redstoneWire.blockID, 0); //tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 5, baseZ + 2, Block.redstoneWire.blockID, 0); //tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 5, baseZ + 5, Block.redstoneWire.blockID, 0); //tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 6, baseZ + 6, Block.redstoneWire.blockID, 0); //tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 7, baseZ + 7, Block.redstoneWire.blockID, 0); //tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 7, baseZ + 8, Block.redstoneRepeaterIdle.blockID, 2); //tile.diode
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 7, baseZ + 10, Block.redstoneWire.blockID, 0); //tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 7, baseZ + 11, Block.redstoneWire.blockID, 0); //tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 7, baseZ + 12, Block.redstoneWire.blockID, 0); //tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 7, baseZ + 13, Block.redstoneWire.blockID, 0); //tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 7, baseZ + 14, Block.redstoneWire.blockID, 0); //tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 8, baseZ + 9, Block.redstoneWire.blockID, 0); //tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 9, baseZ + 8, Block.redstoneWire.blockID, 0); //tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 4, baseZ + 1, Block.redstoneWire.blockID, 0); //tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 4, baseZ + 3, Block.redstoneWire.blockID, 0); //tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 4, baseZ + 4, Block.redstoneWire.blockID, 0); //tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 5, baseZ + 10, Block.redstoneWire.blockID, 0); //tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 6, baseZ + 11, Block.redstoneWire.blockID, 0); //tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 7, baseZ + 14, Block.redstoneWire.blockID, 0); //tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 4, baseZ + 1, Block.redstoneWire.blockID, 0); //tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 4, baseZ + 8, Block.redstoneWire.blockID, 0); //tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 8, baseZ + 14, Block.redstoneWire.blockID, 0); //tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 10, baseZ + 7, SokobanMod.BlockTargetBox.blockID, 0); //tile.Target Box
        if(world.getBlockTileEntity(baseX + 3, baseY + 10, baseZ + 7) instanceof TileEntityTargetBox) {
            TileEntityTargetBox teTb = (TileEntityTargetBox)world.getBlockTileEntity(baseX + 3, baseY + 10, baseZ + 7);
            teTb.setLevelBounds(baseX, baseY, baseZ, baseX + 19, baseY + 12, baseZ + 15);
            teTb.levelDropped = getLevelNumber();
        }
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 4, baseZ + 1, Block.redstoneWire.blockID, 0); //tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 4, baseZ + 2, Block.redstoneWire.blockID, 0); //tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 4, baseZ + 3, Block.redstoneWire.blockID, 0); //tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 4, baseZ + 4, Block.torchRedstoneIdle.blockID, 5); //tile.notGate
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 4, baseZ + 8, Block.redstoneWire.blockID, 0); //tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 8, baseZ + 14, Block.redstoneWire.blockID, 0); //tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 3, baseZ + 4, Block.redstoneWire.blockID, 14); //tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 3, baseZ + 9, Block.torchRedstoneActive.blockID, 3); //tile.notGate
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 3, baseZ + 10, Block.redstoneWire.blockID, 15); //tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 3, baseZ + 11, Block.redstoneWire.blockID, 14); //tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 4, baseZ + 1, Block.redstoneWire.blockID, 0); //tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 4, baseZ + 8, Block.redstoneWire.blockID, 0); //tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 4, baseZ + 12, Block.torchRedstoneIdle.blockID, 5); //tile.notGate
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 4, baseZ + 13, Block.torchRedstoneIdle.blockID, 5); //tile.notGate
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 8, baseZ + 14, Block.redstoneWire.blockID, 0); //tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 3, baseZ + 3, Block.torchRedstoneIdle.blockID, 3); //tile.notGate
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 3, baseZ + 4, Block.redstoneWire.blockID, 15); //tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 3, baseZ + 13, Block.redstoneWire.blockID, 15); //tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 4, baseZ + 1, Block.redstoneRepeaterIdle.blockID, 13); //tile.diode
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 4, baseZ + 2, Block.redstoneWire.blockID, 15); //tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 6, baseZ + 2, SokobanMod.BlockTargetBox.blockID, 0); //tile.Target Box
        if(world.getBlockTileEntity(baseX + 6, baseY + 6, baseZ + 2) instanceof TileEntityTargetBox) {
            TileEntityTargetBox teTb = (TileEntityTargetBox)world.getBlockTileEntity(baseX + 6, baseY + 6, baseZ + 2);
            teTb.setLevelBounds(baseX, baseY, baseZ, baseX + 19, baseY + 12, baseZ + 15);
            teTb.levelDropped = getLevelNumber();
        }
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 8, baseZ + 14, Block.redstoneWire.blockID, 0); //tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 3, baseZ + 2, Block.redstoneRepeaterActive.blockID, 1); //tile.diode
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 3, baseZ + 4, Block.torchRedstoneActive.blockID, 4); //tile.notGate
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 3, baseZ + 13, Block.torchRedstoneActive.blockID, 2); //tile.notGate
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 4, baseZ + 1, Block.redstoneWire.blockID, 0); //tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 4, baseZ + 5, Block.redstoneWire.blockID, 0); //tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 5, baseZ + 10, Block.redstoneRepeaterIdle.blockID, 0); //tile.diode
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 5, baseZ + 11, Block.redstoneWire.blockID, 0); //tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 8, baseZ + 14, Block.redstoneWire.blockID, 0); //tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 3, baseZ + 2, Block.redstoneWire.blockID, 15); //tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 3, baseZ + 4, Block.redstoneWire.blockID, 15); //tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 3, baseZ + 5, Block.redstoneRepeaterIdle.blockID, 3); //tile.diode
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 3, baseZ + 8, Block.torchRedstoneIdle.blockID, 3); //tile.notGate
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 3, baseZ + 9, Block.redstoneWire.blockID, 0); //tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 3, baseZ + 10, Block.redstoneWire.blockID, 0); //tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 3, baseZ + 11, Block.redstoneWire.blockID, 0); //tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 3, baseZ + 12, Block.redstoneWire.blockID, 0); //tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 4, baseZ + 1, Block.redstoneRepeaterIdle.blockID, 13); //tile.diode
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 5, baseZ + 11, Block.redstoneWire.blockID, 0); //tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 6, baseZ + 12, Block.redstoneWire.blockID, 0); //tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 8, baseZ + 14, Block.redstoneWire.blockID, 0); //tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 3, baseZ + 2, Block.redstoneWire.blockID, 14); //tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 3, baseZ + 5, Block.torchRedstoneIdle.blockID, 3); //tile.notGate
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 3, baseZ + 7, Block.redstoneWire.blockID, 7); //tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 3, baseZ + 13, Block.redstoneWire.blockID, 0); //tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 4, baseZ + 1, Block.redstoneRepeaterIdle.blockID, 13); //tile.diode
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 6, baseZ + 12, Block.redstoneWire.blockID, 0); //tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 8, baseZ + 14, Block.redstoneRepeaterIdle.blockID, 1); //tile.diode
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 2, baseZ + 11, Block.torchRedstoneIdle.blockID, 3); //tile.notGate
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 2, baseZ + 12, Block.redstoneWire.blockID, 0); //tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 2, baseZ + 13, Block.redstoneWire.blockID, 0); //tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 3, baseZ + 2, Block.redstoneWire.blockID, 13); //tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 3, baseZ + 3, Block.redstoneWire.blockID, 12); //tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 3, baseZ + 4, Block.redstoneWire.blockID, 11); //tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 3, baseZ + 5, Block.redstoneWire.blockID, 10); //tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 3, baseZ + 6, Block.redstoneWire.blockID, 9); //tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 3, baseZ + 7, Block.redstoneWire.blockID, 8); //tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 3, baseZ + 9, Block.redstoneWire.blockID, 15); //tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 3, baseZ + 10, Block.redstoneWire.blockID, 14); //tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 4, baseZ + 1, Block.redstoneRepeaterIdle.blockID, 13); //tile.diode
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 6, baseZ + 7, SokobanMod.BlockTargetBox.blockID, 0); //tile.Target Box
        if(world.getBlockTileEntity(baseX + 10, baseY + 6, baseZ + 7) instanceof TileEntityTargetBox) {
            TileEntityTargetBox teTb = (TileEntityTargetBox)world.getBlockTileEntity(baseX + 10, baseY + 6, baseZ + 7);
            teTb.setLevelBounds(baseX, baseY, baseZ, baseX + 19, baseY + 12, baseZ + 15);
            teTb.levelDropped = getLevelNumber();
        }
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 6, baseZ + 11, Block.redstoneWire.blockID, 0); //tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 6, baseZ + 12, Block.redstoneWire.blockID, 0); //tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 8, baseZ + 14, Block.redstoneWire.blockID, 0); //tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 3, baseZ + 9, Block.torchRedstoneActive.blockID, 3); //tile.notGate
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 4, baseZ + 1, Block.redstoneWire.blockID, 0); //tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 4, baseZ + 7, Block.redstoneWire.blockID, 0); //tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 4, baseZ + 8, Block.redstoneWire.blockID, 0); //tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 6, baseZ + 12, Block.redstoneWire.blockID, 0); //tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 6, baseZ + 13, Block.redstoneWire.blockID, 0); //tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 8, baseZ + 14, Block.redstoneWire.blockID, 0); //tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 3, baseZ + 9, Block.redstoneWire.blockID, 15); //tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 4, baseZ + 1, Block.redstoneWire.blockID, 0); //tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 5, baseZ + 13, Block.redstoneWire.blockID, 0); //tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 7, baseZ + 2, SokobanMod.BlockTargetBox.blockID, 0); //tile.Target Box
        if(world.getBlockTileEntity(baseX + 12, baseY + 7, baseZ + 2) instanceof TileEntityTargetBox) {
            TileEntityTargetBox teTb = (TileEntityTargetBox)world.getBlockTileEntity(baseX + 12, baseY + 7, baseZ + 2);
            teTb.setLevelBounds(baseX, baseY, baseZ, baseX + 19, baseY + 12, baseZ + 15);
            teTb.levelDropped = getLevelNumber();
        }
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 8, baseZ + 14, Block.redstoneWire.blockID, 0); //tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 10, baseZ + 1, Block.signWall.blockID, 3); //tile.sign
        if(world.getBlockTileEntity(baseX + 12, baseY + 10, baseZ + 1) instanceof TileEntitySign) {
            TileEntitySign tes = (TileEntitySign)world.getBlockTileEntity(baseX + 12, baseY + 10, baseZ + 1);
            tes.signText[0] = "Hard Level";
            tes.signText[1] = "#1";
            tes.signText[2] = "Colours";
            tes.signText[3] = "SSP";
        }
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 1, baseZ + 11, Block.ladder.blockID, 5); //tile.ladder
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 2, baseZ + 11, Block.ladder.blockID, 5); //tile.ladder
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 3, baseZ + 9, Block.redstoneWire.blockID, 14); //tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 3, baseZ + 11, Block.ladder.blockID, 5); //tile.ladder
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 4, baseZ + 1, Block.redstoneWire.blockID, 0); //tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 4, baseZ + 11, Block.ladder.blockID, 5); //tile.ladder
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 5, baseZ + 11, Block.ladder.blockID, 5); //tile.ladder
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 5, baseZ + 13, Block.redstoneWire.blockID, 0); //tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 6, baseZ + 11, Block.ladder.blockID, 5); //tile.ladder
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 7, baseZ + 11, Block.ladder.blockID, 5); //tile.ladder
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 7, baseZ + 14, Block.redstoneWire.blockID, 0); //tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 8, baseZ + 11, Block.ladder.blockID, 5); //tile.ladder
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 9, baseZ + 11, Block.ladder.blockID, 5); //tile.ladder
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 3, baseZ + 8, Block.redstoneWire.blockID, 12); //tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 3, baseZ + 9, Block.redstoneWire.blockID, 13); //tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 4, baseZ + 1, Block.redstoneWire.blockID, 0); //tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 4, baseZ + 7, Block.torchRedstoneIdle.blockID, 5); //tile.notGate
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 5, baseZ + 13, Block.redstoneWire.blockID, 0); //tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 7, baseZ + 14, Block.redstoneWire.blockID, 0); //tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 4, baseZ + 1, Block.redstoneWire.blockID, 0); //tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 4, baseZ + 4, Block.redstoneWire.blockID, 0); //tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 4, baseZ + 5, Block.redstoneWire.blockID, 0); //tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 4, baseZ + 6, Block.redstoneWire.blockID, 0); //tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 4, baseZ + 7, Block.redstoneRepeaterIdle.blockID, 12); //tile.diode
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 4, baseZ + 8, Block.redstoneRepeaterIdle.blockID, 12); //tile.diode
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 4, baseZ + 9, Block.redstoneRepeaterIdle.blockID, 12); //tile.diode
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 4, baseZ + 10, Block.redstoneWire.blockID, 0); //tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 5, baseZ + 11, Block.redstoneWire.blockID, 0); //tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 5, baseZ + 12, Block.redstoneWire.blockID, 0); //tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 5, baseZ + 13, Block.redstoneWire.blockID, 0); //tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 7, baseZ + 14, Block.redstoneWire.blockID, 0); //tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 4, baseZ + 1, Block.redstoneWire.blockID, 0); //tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 4, baseZ + 4, Block.redstoneWire.blockID, 0); //tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 7, baseZ + 14, Block.redstoneWire.blockID, 0); //tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 2, baseZ + 11, Block.signWall.blockID, 3); //tile.sign
        if(world.getBlockTileEntity(baseX + 17, baseY + 2, baseZ + 11) instanceof TileEntitySign) {
            TileEntitySign tes = (TileEntitySign)world.getBlockTileEntity(baseX + 17, baseY + 2, baseZ + 11);
            tes.signText[0] = "Hard Level";
            tes.signText[1] = "#1";
            tes.signText[2] = "Colours";
            tes.signText[3] = "SSP";
        }
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 4, baseZ + 1, Block.redstoneWire.blockID, 0); //tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 4, baseZ + 4, Block.redstoneWire.blockID, 0); //tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 5, baseZ + 5, Block.redstoneRepeaterIdle.blockID, 15); //tile.diode
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 6, baseZ + 6, Block.redstoneRepeaterIdle.blockID, 3); //tile.diode
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 6, baseZ + 8, Block.redstoneRepeaterIdle.blockID, 0); //tile.diode
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 6, baseZ + 9, Block.redstoneWire.blockID, 0); //tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 6, baseZ + 10, Block.redstoneWire.blockID, 0); //tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 6, baseZ + 11, Block.redstoneWire.blockID, 0); //tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 6, baseZ + 12, Block.redstoneWire.blockID, 0); //tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 6, baseZ + 13, Block.redstoneWire.blockID, 0); //tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 7, baseZ + 14, Block.redstoneWire.blockID, 0); //tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 18, baseY + 4, baseZ + 4, Block.redstoneWire.blockID, 0); //tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 18, baseY + 5, baseZ + 1, Block.redstoneWire.blockID, 0); //tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 18, baseY + 5, baseZ + 5, Block.redstoneWire.blockID, 0); //tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 18, baseY + 6, baseZ + 2, Block.redstoneWire.blockID, 0); //tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 18, baseY + 7, baseZ + 3, Block.redstoneWire.blockID, 0); //tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 18, baseY + 7, baseZ + 4, Block.redstoneWire.blockID, 0); //tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 18, baseY + 7, baseZ + 5, Block.redstoneWire.blockID, 0); //tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 18, baseY + 7, baseZ + 6, Block.redstoneWire.blockID, 0); //tile.redstoneDust
        return true;
    }
}