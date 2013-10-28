package sokobanMod.common.gen.medium;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntitySign;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraft.world.World;
import sokobanMod.common.SokobanMod;
import sokobanMod.common.TileEntityLootGenerator;
import sokobanMod.common.TileEntityTargetBox;
import sokobanMod.common.gen.ISokobanLevel;
import sokobanMod.common.gen.LevelGenBase;

public class MediumLevel1Gen implements ISokobanLevel{
    private static final int[] levelBounds = {17, 4, 17};
    private static final int[] entranceCoords = {2, 4, 2, 2, 4, 3, 2, 4, 4, 2, 4, 5, 2, 4, 6, 2, 4, 7, 2, 4, 8, 2, 4, 9, 2, 4, 10, 2, 4, 11, 2, 4, 12, 2, 4, 13, 2, 4, 14, 2, 4, 15, 3, 4, 2, 3, 4, 3, 3, 4, 4, 3, 4, 5, 3, 4, 6, 3, 4, 7, 3, 4, 8, 3, 4, 9, 3, 4, 10, 3, 4, 11, 3, 4, 12, 3, 4, 13, 3, 4, 14, 3, 4, 15, 4, 4, 2, 4, 4, 3, 4, 4, 4, 4, 4, 5, 4, 4, 6, 4, 4, 7, 4, 4, 8, 4, 4, 9, 4, 4, 10, 4, 4, 11, 4, 4, 12, 4, 4, 13, 4, 4, 14, 4, 4, 15, 5, 4, 2, 5, 4, 3, 5, 4, 4, 5, 4, 5, 5, 4, 6, 5, 4, 7, 5, 4, 8, 5, 4, 9, 5, 4, 10, 5, 4, 11, 5, 4, 12, 5, 4, 13, 5, 4, 14, 5, 4, 15, 6, 4, 2, 6, 4, 3, 6, 4, 4, 6, 4, 5, 6, 4, 6, 6, 4, 7, 6, 4, 8, 6, 4, 9, 6, 4, 10, 6, 4, 11, 6, 4, 12, 6, 4, 13, 6, 4, 14, 6, 4, 15, 7, 4, 2, 7, 4, 3, 7, 4, 4, 7, 4, 5, 7, 4, 6, 7, 4, 7, 7, 4, 8, 7, 4, 9, 7, 4, 10, 7, 4, 11, 7, 4, 12, 7, 4, 13, 7, 4, 14, 7, 4, 15, 8, 4, 2, 8, 4, 3, 8, 4, 4, 8, 4, 5, 8, 4, 6, 8, 4, 7, 8, 4, 8, 8, 4, 9, 8, 4, 10, 8, 4, 11, 8, 4, 12, 8, 4, 13, 8, 4, 14, 8, 4, 15, 9, 4, 2, 9, 4, 3, 9, 4, 4, 9, 4, 5, 9, 4, 6, 9, 4, 7, 9, 4, 8, 9, 4, 9, 9, 4, 10, 9, 4, 11, 9, 4, 12, 9, 4, 13, 9, 4, 14, 9, 4, 15, 10, 4, 2, 10, 4, 3, 10, 4, 4, 10, 4, 5, 10, 4, 6, 10, 4, 7, 10, 4, 8, 10, 4, 9, 10, 4, 10, 10, 4, 11, 10, 4, 12, 10, 4, 13, 10, 4, 14, 10, 4, 15, 11, 4, 2, 11, 4, 3, 11, 4, 4, 11, 4, 5, 11, 4, 6, 11, 4, 7, 11, 4, 8, 11, 4, 9, 11, 4, 10, 11, 4, 11, 11, 4, 12, 11, 4, 13, 11, 4, 14, 11, 4, 15, 12, 4, 2, 12, 4, 3, 12, 4, 4, 12, 4, 5, 12, 4, 6, 12, 4, 7, 12, 4, 8, 12, 4, 9, 12, 4, 10, 12, 4, 11, 12, 4, 12, 12, 4, 13, 12, 4, 14, 12, 4, 15, 13, 4, 2, 13, 4, 3, 13, 4, 4, 13, 4, 5, 13, 4, 6, 13, 4, 7, 13, 4, 8, 13, 4, 9, 13, 4, 10, 13, 4, 11, 13, 4, 12, 13, 4, 13, 13, 4, 14, 13, 4, 15, 14, 4, 2, 14, 4, 3, 14, 4, 4, 14, 4, 5, 14, 4, 6, 14, 4, 7, 14, 4, 8, 14, 4, 9, 14, 4, 10, 14, 4, 11, 14, 4, 12, 14, 4, 13, 14, 4, 14, 14, 4, 15, 15, 4, 2, 15, 4, 3, 15, 4, 4, 15, 4, 5, 15, 4, 6, 15, 4, 7, 15, 4, 8, 15, 4, 9, 15, 4, 10, 15, 4, 11, 15, 4, 12, 15, 4, 13, 15, 4, 14, 15, 4, 15, 0, 1, 0, 0, 2, 0, 0, 3, 0, 1, 1, 0, 1, 2, 0, 1, 3, 0, 2, 1, 0, 2, 1, 17, 2, 2, 0, 2, 2, 17, 2, 3, 0, 2, 3, 17, 3, 1, 0, 3, 1, 17, 3, 2, 0, 3, 2, 17, 3, 3, 0, 3, 3, 17, 4, 1, 0, 4, 1, 17, 4, 2, 0, 4, 2, 17, 4, 3, 0, 4, 3, 17, 5, 1, 0, 5, 1, 17, 5, 2, 0, 5, 2, 17, 5, 3, 0, 5, 3, 17, 6, 1, 0, 6, 1, 17, 6, 2, 0, 6, 2, 17, 6, 3, 0, 6, 3, 17, 7, 1, 0, 7, 1, 17, 7, 2, 0, 7, 2, 17, 7, 3, 0, 7, 3, 17, 8, 1, 0, 8, 1, 17, 8, 2, 0, 8, 2, 17, 8, 3, 0, 8, 3, 17, 9, 1, 0, 9, 1, 17, 9, 2, 0, 9, 2, 17, 9, 3, 0, 9, 3, 17, 10, 1, 0, 10, 1, 17, 10, 2, 0, 10, 2, 17, 10, 3, 0, 10, 3, 17, 11, 1, 0, 11, 1, 17, 11, 2, 0, 11, 2, 17, 11, 3, 0, 11, 3, 17, 12, 1, 0, 12, 1, 17, 12, 2, 0, 12, 2, 17, 12, 3, 0, 12, 3, 17, 13, 1, 0, 13, 1, 17, 13, 2, 0, 13, 2, 17, 13, 3, 0, 13, 3, 17, 14, 1, 0, 14, 1, 17, 14, 2, 0, 14, 2, 17, 14, 3, 17, 15, 1, 0, 15, 1, 17, 15, 2, 0, 15, 2, 17, 15, 3, 17, 16, 1, 0, 16, 1, 17, 16, 2, 0, 16, 2, 17, 16, 3, 0, 16, 3, 17, 17, 1, 0, 17, 1, 17, 17, 2, 0, 17, 2, 17, 17, 3, 0, 17, 3, 17, 0, 1, 1, 17, 1, 1, 0, 1, 2, 17, 1, 2, 0, 1, 3, 17, 1, 3, 0, 1, 4, 17, 1, 4, 0, 1, 5, 17, 1, 5, 0, 1, 6, 17, 1, 6, 0, 1, 7, 17, 1, 7, 0, 1, 8, 17, 1, 8, 0, 1, 9, 17, 1, 9, 0, 1, 10, 17, 1, 10, 0, 1, 11, 17, 1, 11, 0, 1, 12, 17, 1, 12, 0, 1, 13, 17, 1, 13, 0, 1, 14, 17, 1, 14, 0, 1, 15, 17, 1, 15, 0, 1, 16, 17, 1, 16, 0, 2, 1, 17, 2, 1, 0, 2, 2, 17, 2, 2, 0, 2, 3, 17, 2, 3, 0, 2, 4, 17, 2, 4, 0, 2, 5, 17, 2, 5, 0, 2, 6, 17, 2, 6, 0, 2, 7, 17, 2, 7, 0, 2, 8, 17, 2, 8, 0, 2, 9, 17, 2, 9, 0, 2, 10, 17, 2, 10, 0, 2, 11, 17, 2, 11, 0, 2, 12, 17, 2, 12, 0, 2, 13, 17, 2, 13, 0, 2, 14, 17, 2, 14, 0, 2, 15, 17, 2, 15, 0, 2, 16, 17, 2, 16, 0, 3, 1, 17, 3, 1, 0, 3, 2, 0, 3, 3, 0, 3, 4, 0, 3, 5, 17, 3, 5, 0, 3, 6, 17, 3, 6, 0, 3, 7, 17, 3, 7, 0, 3, 8, 17, 3, 8, 0, 3, 9, 17, 3, 9, 0, 3, 10, 17, 3, 10, 0, 3, 11, 17, 3, 11, 0, 3, 12, 17, 3, 12, 0, 3, 13, 17, 3, 13, 0, 3, 14, 17, 3, 14, 0, 3, 15, 17, 3, 15, 17, 3, 16};
    public static final ItemStack[] staticInventoryContents_1_3_17 = new ItemStack[]{new ItemStack(SokobanMod.ItemLevelGeneratorTutorial.itemID, 1, 0), //
    new ItemStack(SokobanMod.ItemLevelGeneratorTutorial.itemID, 1, 0)};
    public static final WeightedRandomChestContent[] randomInventoryContents_1_3_17 = new WeightedRandomChestContent[]{/*new WeightedRandomChestContent(Item.stick.itemID, 0, 1, 3, 10)*/};

    @Override
    public int getLevelNumber(){
        return 2000;
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
        return "Functions";
    }

    @Override
    public String getAuthorName(){
        return "patar15";
    }

    @Override
    public boolean canGenerateOnSurface(){
        return true;
    }

    @Override
    public boolean canGenerateUnderground(){
        return false;
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
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 0, baseZ + 16, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 0, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 1, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 2, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 3, baseZ + 16, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 3, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
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
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 4, baseZ + 16, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 4, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 0, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 0, baseZ + 1, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 0, baseZ + 2, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 0, baseZ + 3, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 0, baseZ + 4, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 0, baseZ + 5, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 0, baseZ + 6, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 0, baseZ + 7, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 0, baseZ + 8, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 0, baseZ + 9, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 0, baseZ + 10, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 0, baseZ + 11, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 0, baseZ + 12, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 0, baseZ + 13, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 0, baseZ + 14, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 0, baseZ + 15, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 0, baseZ + 16, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 0, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 1, baseZ + 1, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 1, baseZ + 2, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 1, baseZ + 3, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 1, baseZ + 4, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 1, baseZ + 5, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 1, baseZ + 6, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 1, baseZ + 7, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 1, baseZ + 8, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 1, baseZ + 9, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 1, baseZ + 10, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 1, baseZ + 11, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 1, baseZ + 12, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 1, baseZ + 13, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 1, baseZ + 14, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 1, baseZ + 15, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 1, baseZ + 16, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 1, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 2, baseZ + 17, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 3, baseZ + 17, SokobanMod.BlockLootGenerator.blockID, 0); //tile.Loot Generator
        if(world.getBlockTileEntity(baseX + 1, baseY + 3, baseZ + 17) instanceof TileEntityLootGenerator) {
            TileEntityLootGenerator teLg = (TileEntityLootGenerator)world.getBlockTileEntity(baseX + 1, baseY + 3, baseZ + 17);
            teLg.setAchievement(getLevelNumber());
            LevelGenBase.setLootGeneratorContents(teLg, staticInventoryContents_1_3_17, randomInventoryContents_1_3_17);
        }
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 4, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 4, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 0, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 0, baseZ + 1, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 0, baseZ + 2, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 0, baseZ + 3, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 0, baseZ + 4, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 0, baseZ + 5, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 0, baseZ + 6, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 0, baseZ + 7, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 0, baseZ + 8, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 0, baseZ + 9, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 0, baseZ + 10, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 0, baseZ + 11, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 0, baseZ + 12, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 0, baseZ + 13, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 0, baseZ + 14, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 0, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 0, baseZ + 16, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 0, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 1, baseZ + 1, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 1, baseZ + 2, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 1, baseZ + 3, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 1, baseZ + 4, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 1, baseZ + 5, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 1, baseZ + 6, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 1, baseZ + 7, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 1, baseZ + 8, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 1, baseZ + 9, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 1, baseZ + 10, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 1, baseZ + 11, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 1, baseZ + 12, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 1, baseZ + 13, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 1, baseZ + 14, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 1, baseZ + 15, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 1, baseZ + 16, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 4, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 4, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 0, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 0, baseZ + 1, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 0, baseZ + 2, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 0, baseZ + 3, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 0, baseZ + 4, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 0, baseZ + 5, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 0, baseZ + 6, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 0, baseZ + 7, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 0, baseZ + 8, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 0, baseZ + 9, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 0, baseZ + 10, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 0, baseZ + 11, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 0, baseZ + 12, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 0, baseZ + 13, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 0, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 0, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 0, baseZ + 16, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 0, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 1, baseZ + 1, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 1, baseZ + 2, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 1, baseZ + 3, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 1, baseZ + 4, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 1, baseZ + 5, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 1, baseZ + 6, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 1, baseZ + 7, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 1, baseZ + 8, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 1, baseZ + 9, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 1, baseZ + 10, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 1, baseZ + 11, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 1, baseZ + 12, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 1, baseZ + 13, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 1, baseZ + 14, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 1, baseZ + 15, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 1, baseZ + 16, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 4, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 4, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 0, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 0, baseZ + 1, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 0, baseZ + 2, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 0, baseZ + 3, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 0, baseZ + 4, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 0, baseZ + 5, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 0, baseZ + 6, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 0, baseZ + 7, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 0, baseZ + 8, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 0, baseZ + 9, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 0, baseZ + 10, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 0, baseZ + 11, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 0, baseZ + 12, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 0, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 0, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 0, baseZ + 15, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 0, baseZ + 16, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 0, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 1, baseZ + 1, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 1, baseZ + 2, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 1, baseZ + 3, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 1, baseZ + 4, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 1, baseZ + 5, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 1, baseZ + 6, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 1, baseZ + 7, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 1, baseZ + 8, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 1, baseZ + 9, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 1, baseZ + 10, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 1, baseZ + 11, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 1, baseZ + 12, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 1, baseZ + 13, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 1, baseZ + 14, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 1, baseZ + 15, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 1, baseZ + 16, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 4, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 4, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 0, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 0, baseZ + 1, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 0, baseZ + 2, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 0, baseZ + 3, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 0, baseZ + 4, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 0, baseZ + 5, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 0, baseZ + 6, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 0, baseZ + 7, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 0, baseZ + 8, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 0, baseZ + 9, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 0, baseZ + 10, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 0, baseZ + 11, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 0, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 0, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 0, baseZ + 14, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 0, baseZ + 15, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 0, baseZ + 16, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 0, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 1, baseZ + 1, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 1, baseZ + 2, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 1, baseZ + 3, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 1, baseZ + 4, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 1, baseZ + 5, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 1, baseZ + 6, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 1, baseZ + 7, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 1, baseZ + 8, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 1, baseZ + 9, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 1, baseZ + 10, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 1, baseZ + 11, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 1, baseZ + 12, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 1, baseZ + 13, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 1, baseZ + 14, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 1, baseZ + 15, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 1, baseZ + 16, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 4, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 4, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 0, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 0, baseZ + 1, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 0, baseZ + 2, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 0, baseZ + 3, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 0, baseZ + 4, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 0, baseZ + 5, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 0, baseZ + 6, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 0, baseZ + 7, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 0, baseZ + 8, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 0, baseZ + 9, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 0, baseZ + 10, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 0, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 0, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 0, baseZ + 13, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 0, baseZ + 14, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 0, baseZ + 15, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 0, baseZ + 16, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 0, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 1, baseZ + 1, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 1, baseZ + 2, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 1, baseZ + 3, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 1, baseZ + 4, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 1, baseZ + 5, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 1, baseZ + 6, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 1, baseZ + 7, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 1, baseZ + 8, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 1, baseZ + 9, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 1, baseZ + 10, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 1, baseZ + 11, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 1, baseZ + 12, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 1, baseZ + 13, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 1, baseZ + 14, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 1, baseZ + 15, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 1, baseZ + 16, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 4, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 4, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 0, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 0, baseZ + 1, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 0, baseZ + 2, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 0, baseZ + 3, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 0, baseZ + 4, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 0, baseZ + 5, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 0, baseZ + 6, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 0, baseZ + 7, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 0, baseZ + 8, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 0, baseZ + 9, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 0, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 0, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 0, baseZ + 12, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 0, baseZ + 13, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 0, baseZ + 14, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 0, baseZ + 15, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 0, baseZ + 16, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 0, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 1, baseZ + 1, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 1, baseZ + 2, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 1, baseZ + 3, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 1, baseZ + 4, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 1, baseZ + 5, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 1, baseZ + 6, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 1, baseZ + 7, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 1, baseZ + 8, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 1, baseZ + 9, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 1, baseZ + 10, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 1, baseZ + 11, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 1, baseZ + 12, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 1, baseZ + 13, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 1, baseZ + 14, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 1, baseZ + 15, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 1, baseZ + 16, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 4, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 4, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 0, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 0, baseZ + 1, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 0, baseZ + 2, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 0, baseZ + 3, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 0, baseZ + 4, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 0, baseZ + 5, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 0, baseZ + 6, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 0, baseZ + 7, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 0, baseZ + 8, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 0, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 0, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 0, baseZ + 11, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 0, baseZ + 12, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 0, baseZ + 13, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 0, baseZ + 14, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 0, baseZ + 15, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 0, baseZ + 16, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 0, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 1, baseZ + 1, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 1, baseZ + 2, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 1, baseZ + 3, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 1, baseZ + 4, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 1, baseZ + 5, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 1, baseZ + 6, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 1, baseZ + 7, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 1, baseZ + 8, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 1, baseZ + 9, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 1, baseZ + 10, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 1, baseZ + 11, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 1, baseZ + 12, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 1, baseZ + 13, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 1, baseZ + 14, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 1, baseZ + 15, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 1, baseZ + 16, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 4, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 4, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 0, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 0, baseZ + 1, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 0, baseZ + 2, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 0, baseZ + 3, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 0, baseZ + 4, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 0, baseZ + 5, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 0, baseZ + 6, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 0, baseZ + 7, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 0, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 0, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 0, baseZ + 10, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 0, baseZ + 11, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 0, baseZ + 12, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 0, baseZ + 13, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 0, baseZ + 14, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 0, baseZ + 15, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 0, baseZ + 16, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 0, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 1, baseZ + 1, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 1, baseZ + 2, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 1, baseZ + 3, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 1, baseZ + 4, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 1, baseZ + 5, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 1, baseZ + 6, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 1, baseZ + 7, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 1, baseZ + 8, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 1, baseZ + 9, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 1, baseZ + 10, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 1, baseZ + 11, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 1, baseZ + 12, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 1, baseZ + 13, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 1, baseZ + 14, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 1, baseZ + 15, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 1, baseZ + 16, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 4, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 4, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 0, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 0, baseZ + 1, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 0, baseZ + 2, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 0, baseZ + 3, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 0, baseZ + 4, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 0, baseZ + 5, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 0, baseZ + 6, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 0, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 0, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 0, baseZ + 9, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 0, baseZ + 10, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 0, baseZ + 11, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 0, baseZ + 12, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 0, baseZ + 13, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 0, baseZ + 14, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 0, baseZ + 15, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 0, baseZ + 16, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 0, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 1, baseZ + 1, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 1, baseZ + 2, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 1, baseZ + 3, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 1, baseZ + 4, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 1, baseZ + 5, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 1, baseZ + 6, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 1, baseZ + 7, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 1, baseZ + 8, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 1, baseZ + 9, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 1, baseZ + 10, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 1, baseZ + 11, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 1, baseZ + 12, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 1, baseZ + 13, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 1, baseZ + 14, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 1, baseZ + 15, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 1, baseZ + 16, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 4, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 4, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 0, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 0, baseZ + 1, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 0, baseZ + 2, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 0, baseZ + 3, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 0, baseZ + 4, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 0, baseZ + 5, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 0, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 0, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 0, baseZ + 8, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 0, baseZ + 9, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 0, baseZ + 10, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 0, baseZ + 11, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 0, baseZ + 12, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 0, baseZ + 13, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 0, baseZ + 14, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 0, baseZ + 15, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 0, baseZ + 16, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 0, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 1, baseZ + 1, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 1, baseZ + 2, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 1, baseZ + 3, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 1, baseZ + 4, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 1, baseZ + 5, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 1, baseZ + 6, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 1, baseZ + 7, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 1, baseZ + 8, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 1, baseZ + 9, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 1, baseZ + 10, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 1, baseZ + 11, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 1, baseZ + 12, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 1, baseZ + 13, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 1, baseZ + 14, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 1, baseZ + 15, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 1, baseZ + 16, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 4, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 4, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 0, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 0, baseZ + 1, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 0, baseZ + 2, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 0, baseZ + 3, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 0, baseZ + 4, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 0, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 0, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 0, baseZ + 7, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 0, baseZ + 8, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 0, baseZ + 9, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 0, baseZ + 10, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 0, baseZ + 11, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 0, baseZ + 12, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 0, baseZ + 13, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 0, baseZ + 14, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 0, baseZ + 15, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 0, baseZ + 16, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 0, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 1, baseZ + 1, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 1, baseZ + 2, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 1, baseZ + 3, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 1, baseZ + 4, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 1, baseZ + 5, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 1, baseZ + 6, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 1, baseZ + 7, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 1, baseZ + 8, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 1, baseZ + 9, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 1, baseZ + 10, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 1, baseZ + 11, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 1, baseZ + 12, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 1, baseZ + 13, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 1, baseZ + 14, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 1, baseZ + 15, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 1, baseZ + 16, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 4, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 4, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 0, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 0, baseZ + 1, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 0, baseZ + 2, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 0, baseZ + 3, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 0, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 0, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 0, baseZ + 6, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 0, baseZ + 7, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 0, baseZ + 8, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 0, baseZ + 9, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 0, baseZ + 10, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 0, baseZ + 11, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 0, baseZ + 12, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 0, baseZ + 13, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 0, baseZ + 14, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 0, baseZ + 15, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 0, baseZ + 16, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 0, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 1, baseZ + 1, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 1, baseZ + 2, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 1, baseZ + 3, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 1, baseZ + 4, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 1, baseZ + 5, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 1, baseZ + 6, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 1, baseZ + 7, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 1, baseZ + 8, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 1, baseZ + 9, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 1, baseZ + 10, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 1, baseZ + 11, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 1, baseZ + 12, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 1, baseZ + 13, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 1, baseZ + 14, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 1, baseZ + 15, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 1, baseZ + 16, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 4, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 4, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 0, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 0, baseZ + 1, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 0, baseZ + 2, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 0, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 0, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 0, baseZ + 5, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 0, baseZ + 6, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 0, baseZ + 7, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 0, baseZ + 8, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 0, baseZ + 9, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 0, baseZ + 10, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 0, baseZ + 11, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 0, baseZ + 12, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 0, baseZ + 13, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 0, baseZ + 14, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 0, baseZ + 15, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 0, baseZ + 16, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 0, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 1, baseZ + 1, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 1, baseZ + 2, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 1, baseZ + 3, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 1, baseZ + 4, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 1, baseZ + 5, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 1, baseZ + 6, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 1, baseZ + 7, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 1, baseZ + 8, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 1, baseZ + 9, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 1, baseZ + 10, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 1, baseZ + 11, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 1, baseZ + 12, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 1, baseZ + 13, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 1, baseZ + 14, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 1, baseZ + 15, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 1, baseZ + 16, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 3, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 4, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 4, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 0, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 0, baseZ + 1, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 0, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 0, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 0, baseZ + 4, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 0, baseZ + 5, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 0, baseZ + 6, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 0, baseZ + 7, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 0, baseZ + 8, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 0, baseZ + 9, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 0, baseZ + 10, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 0, baseZ + 11, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 0, baseZ + 12, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 0, baseZ + 13, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 0, baseZ + 14, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 0, baseZ + 15, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 0, baseZ + 16, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 0, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 1, baseZ + 1, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 1, baseZ + 2, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 1, baseZ + 3, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 1, baseZ + 4, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 1, baseZ + 5, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 1, baseZ + 6, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 1, baseZ + 7, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 1, baseZ + 8, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 1, baseZ + 9, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 1, baseZ + 10, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 1, baseZ + 11, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 1, baseZ + 12, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 1, baseZ + 13, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 1, baseZ + 14, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 1, baseZ + 15, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 1, baseZ + 16, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 3, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 4, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 4, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 0, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 0, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 0, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 0, baseZ + 3, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 0, baseZ + 4, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 0, baseZ + 5, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 0, baseZ + 6, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 0, baseZ + 7, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 0, baseZ + 8, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 0, baseZ + 9, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 0, baseZ + 10, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 0, baseZ + 11, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 0, baseZ + 12, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 0, baseZ + 13, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 0, baseZ + 14, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 0, baseZ + 15, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 0, baseZ + 16, SokobanMod.BlockRedstoneRemover.blockID, 0); //tile.Redstone Remover
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 0, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 1, baseZ + 1, SokobanMod.BlockTarget.blockID, 3); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 1, baseZ + 2, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 1, baseZ + 3, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 1, baseZ + 4, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 1, baseZ + 5, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 1, baseZ + 6, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 1, baseZ + 7, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 1, baseZ + 8, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 1, baseZ + 9, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 1, baseZ + 10, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 1, baseZ + 11, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 1, baseZ + 12, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 1, baseZ + 13, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 1, baseZ + 14, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 1, baseZ + 15, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 1, baseZ + 16, SokobanMod.BlockTarget.blockID, 2); //tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 4, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 4, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
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
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 0, baseZ + 16, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 0, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 3, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 3, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 3, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 4, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 4, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 4, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 4, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 4, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 4, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 4, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 4, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 4, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 4, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 4, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 4, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 4, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 4, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 4, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 4, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 4, baseZ + 16, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 4, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); //tile.Unbreakable Solid Blocks

        //Instable blocks (like torches, levers, signs)
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 3, baseZ + 16, Block.signWall.blockID, 5); //tile.sign
        if(world.getBlockTileEntity(baseX + 1, baseY + 3, baseZ + 16) instanceof TileEntitySign) {
            TileEntitySign tes = (TileEntitySign)world.getBlockTileEntity(baseX + 1, baseY + 3, baseZ + 16);
            tes.signText[0] = "your";
            tes.signText[1] = "goal";
            tes.signText[2] = "";
            tes.signText[3] = "";
        }
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 4, baseZ + 1, Block.signWall.blockID, 3); //tile.sign
        if(world.getBlockTileEntity(baseX + 1, baseY + 4, baseZ + 1) instanceof TileEntitySign) {
            TileEntitySign tes = (TileEntitySign)world.getBlockTileEntity(baseX + 1, baseY + 4, baseZ + 1);
            tes.signText[0] = "15";
            tes.signText[1] = "";
            tes.signText[2] = "";
            tes.signText[3] = "";
        }
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 4, baseZ + 2, Block.signWall.blockID, 5); //tile.sign
        if(world.getBlockTileEntity(baseX + 1, baseY + 4, baseZ + 2) instanceof TileEntitySign) {
            TileEntitySign tes = (TileEntitySign)world.getBlockTileEntity(baseX + 1, baseY + 4, baseZ + 2);
            tes.signText[0] = "1";
            tes.signText[1] = "";
            tes.signText[2] = "";
            tes.signText[3] = "";
        }
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 4, baseZ + 3, Block.signWall.blockID, 5); //tile.sign
        if(world.getBlockTileEntity(baseX + 1, baseY + 4, baseZ + 3) instanceof TileEntitySign) {
            TileEntitySign tes = (TileEntitySign)world.getBlockTileEntity(baseX + 1, baseY + 4, baseZ + 3);
            tes.signText[0] = "2";
            tes.signText[1] = "";
            tes.signText[2] = "";
            tes.signText[3] = "";
        }
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 4, baseZ + 4, Block.signWall.blockID, 5); //tile.sign
        if(world.getBlockTileEntity(baseX + 1, baseY + 4, baseZ + 4) instanceof TileEntitySign) {
            TileEntitySign tes = (TileEntitySign)world.getBlockTileEntity(baseX + 1, baseY + 4, baseZ + 4);
            tes.signText[0] = "3";
            tes.signText[1] = "";
            tes.signText[2] = "";
            tes.signText[3] = "";
        }
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 4, baseZ + 5, Block.signWall.blockID, 5); //tile.sign
        if(world.getBlockTileEntity(baseX + 1, baseY + 4, baseZ + 5) instanceof TileEntitySign) {
            TileEntitySign tes = (TileEntitySign)world.getBlockTileEntity(baseX + 1, baseY + 4, baseZ + 5);
            tes.signText[0] = "4";
            tes.signText[1] = "";
            tes.signText[2] = "";
            tes.signText[3] = "";
        }
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 4, baseZ + 6, Block.signWall.blockID, 5); //tile.sign
        if(world.getBlockTileEntity(baseX + 1, baseY + 4, baseZ + 6) instanceof TileEntitySign) {
            TileEntitySign tes = (TileEntitySign)world.getBlockTileEntity(baseX + 1, baseY + 4, baseZ + 6);
            tes.signText[0] = "5";
            tes.signText[1] = "";
            tes.signText[2] = "";
            tes.signText[3] = "";
        }
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 4, baseZ + 7, Block.signWall.blockID, 5); //tile.sign
        if(world.getBlockTileEntity(baseX + 1, baseY + 4, baseZ + 7) instanceof TileEntitySign) {
            TileEntitySign tes = (TileEntitySign)world.getBlockTileEntity(baseX + 1, baseY + 4, baseZ + 7);
            tes.signText[0] = "6";
            tes.signText[1] = "";
            tes.signText[2] = "";
            tes.signText[3] = "";
        }
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 4, baseZ + 8, Block.signWall.blockID, 5); //tile.sign
        if(world.getBlockTileEntity(baseX + 1, baseY + 4, baseZ + 8) instanceof TileEntitySign) {
            TileEntitySign tes = (TileEntitySign)world.getBlockTileEntity(baseX + 1, baseY + 4, baseZ + 8);
            tes.signText[0] = "7";
            tes.signText[1] = "";
            tes.signText[2] = "";
            tes.signText[3] = "";
        }
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 4, baseZ + 9, Block.signWall.blockID, 5); //tile.sign
        if(world.getBlockTileEntity(baseX + 1, baseY + 4, baseZ + 9) instanceof TileEntitySign) {
            TileEntitySign tes = (TileEntitySign)world.getBlockTileEntity(baseX + 1, baseY + 4, baseZ + 9);
            tes.signText[0] = "8";
            tes.signText[1] = "";
            tes.signText[2] = "";
            tes.signText[3] = "";
        }
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 4, baseZ + 10, Block.signWall.blockID, 5); //tile.sign
        if(world.getBlockTileEntity(baseX + 1, baseY + 4, baseZ + 10) instanceof TileEntitySign) {
            TileEntitySign tes = (TileEntitySign)world.getBlockTileEntity(baseX + 1, baseY + 4, baseZ + 10);
            tes.signText[0] = "9";
            tes.signText[1] = "";
            tes.signText[2] = "";
            tes.signText[3] = "";
        }
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 4, baseZ + 11, Block.signWall.blockID, 5); //tile.sign
        if(world.getBlockTileEntity(baseX + 1, baseY + 4, baseZ + 11) instanceof TileEntitySign) {
            TileEntitySign tes = (TileEntitySign)world.getBlockTileEntity(baseX + 1, baseY + 4, baseZ + 11);
            tes.signText[0] = "10";
            tes.signText[1] = "";
            tes.signText[2] = "";
            tes.signText[3] = "";
        }
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 4, baseZ + 12, Block.signWall.blockID, 5); //tile.sign
        if(world.getBlockTileEntity(baseX + 1, baseY + 4, baseZ + 12) instanceof TileEntitySign) {
            TileEntitySign tes = (TileEntitySign)world.getBlockTileEntity(baseX + 1, baseY + 4, baseZ + 12);
            tes.signText[0] = "11";
            tes.signText[1] = "";
            tes.signText[2] = "";
            tes.signText[3] = "";
        }
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 4, baseZ + 13, Block.signWall.blockID, 5); //tile.sign
        if(world.getBlockTileEntity(baseX + 1, baseY + 4, baseZ + 13) instanceof TileEntitySign) {
            TileEntitySign tes = (TileEntitySign)world.getBlockTileEntity(baseX + 1, baseY + 4, baseZ + 13);
            tes.signText[0] = "12";
            tes.signText[1] = "";
            tes.signText[2] = "";
            tes.signText[3] = "";
        }
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 4, baseZ + 14, Block.signWall.blockID, 5); //tile.sign
        if(world.getBlockTileEntity(baseX + 1, baseY + 4, baseZ + 14) instanceof TileEntitySign) {
            TileEntitySign tes = (TileEntitySign)world.getBlockTileEntity(baseX + 1, baseY + 4, baseZ + 14);
            tes.signText[0] = "13";
            tes.signText[1] = "";
            tes.signText[2] = "";
            tes.signText[3] = "";
        }
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 4, baseZ + 15, Block.signWall.blockID, 5); //tile.sign
        if(world.getBlockTileEntity(baseX + 1, baseY + 4, baseZ + 15) instanceof TileEntitySign) {
            TileEntitySign tes = (TileEntitySign)world.getBlockTileEntity(baseX + 1, baseY + 4, baseZ + 15);
            tes.signText[0] = "14";
            tes.signText[1] = "";
            tes.signText[2] = "";
            tes.signText[3] = "";
        }
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 4, baseZ + 16, Block.signWall.blockID, 5); //tile.sign
        if(world.getBlockTileEntity(baseX + 1, baseY + 4, baseZ + 16) instanceof TileEntitySign) {
            TileEntitySign tes = (TileEntitySign)world.getBlockTileEntity(baseX + 1, baseY + 4, baseZ + 16);
            tes.signText[0] = "15";
            tes.signText[1] = "";
            tes.signText[2] = "";
            tes.signText[3] = "";
        }
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 4, baseZ + 1, Block.signWall.blockID, 3); //tile.sign
        if(world.getBlockTileEntity(baseX + 2, baseY + 4, baseZ + 1) instanceof TileEntitySign) {
            TileEntitySign tes = (TileEntitySign)world.getBlockTileEntity(baseX + 2, baseY + 4, baseZ + 1);
            tes.signText[0] = "14";
            tes.signText[1] = "";
            tes.signText[2] = "";
            tes.signText[3] = "";
        }
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 4, baseZ + 16, Block.signWall.blockID, 2); //tile.sign
        if(world.getBlockTileEntity(baseX + 2, baseY + 4, baseZ + 16) instanceof TileEntitySign) {
            TileEntitySign tes = (TileEntitySign)world.getBlockTileEntity(baseX + 2, baseY + 4, baseZ + 16);
            tes.signText[0] = "14";
            tes.signText[1] = "";
            tes.signText[2] = "";
            tes.signText[3] = "";
        }
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 4, baseZ + 1, Block.signWall.blockID, 3); //tile.sign
        if(world.getBlockTileEntity(baseX + 3, baseY + 4, baseZ + 1) instanceof TileEntitySign) {
            TileEntitySign tes = (TileEntitySign)world.getBlockTileEntity(baseX + 3, baseY + 4, baseZ + 1);
            tes.signText[0] = "13";
            tes.signText[1] = "";
            tes.signText[2] = "";
            tes.signText[3] = "";
        }
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 4, baseZ + 16, Block.signWall.blockID, 2); //tile.sign
        if(world.getBlockTileEntity(baseX + 3, baseY + 4, baseZ + 16) instanceof TileEntitySign) {
            TileEntitySign tes = (TileEntitySign)world.getBlockTileEntity(baseX + 3, baseY + 4, baseZ + 16);
            tes.signText[0] = "13";
            tes.signText[1] = "";
            tes.signText[2] = "";
            tes.signText[3] = "";
        }
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 4, baseZ + 1, Block.signWall.blockID, 3); //tile.sign
        if(world.getBlockTileEntity(baseX + 4, baseY + 4, baseZ + 1) instanceof TileEntitySign) {
            TileEntitySign tes = (TileEntitySign)world.getBlockTileEntity(baseX + 4, baseY + 4, baseZ + 1);
            tes.signText[0] = "12";
            tes.signText[1] = "";
            tes.signText[2] = "";
            tes.signText[3] = "";
        }
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 4, baseZ + 16, Block.signWall.blockID, 2); //tile.sign
        if(world.getBlockTileEntity(baseX + 4, baseY + 4, baseZ + 16) instanceof TileEntitySign) {
            TileEntitySign tes = (TileEntitySign)world.getBlockTileEntity(baseX + 4, baseY + 4, baseZ + 16);
            tes.signText[0] = "12";
            tes.signText[1] = "";
            tes.signText[2] = "";
            tes.signText[3] = "";
        }
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 4, baseZ + 1, Block.signWall.blockID, 3); //tile.sign
        if(world.getBlockTileEntity(baseX + 5, baseY + 4, baseZ + 1) instanceof TileEntitySign) {
            TileEntitySign tes = (TileEntitySign)world.getBlockTileEntity(baseX + 5, baseY + 4, baseZ + 1);
            tes.signText[0] = "11";
            tes.signText[1] = "";
            tes.signText[2] = "";
            tes.signText[3] = "";
        }
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 4, baseZ + 16, Block.signWall.blockID, 2); //tile.sign
        if(world.getBlockTileEntity(baseX + 5, baseY + 4, baseZ + 16) instanceof TileEntitySign) {
            TileEntitySign tes = (TileEntitySign)world.getBlockTileEntity(baseX + 5, baseY + 4, baseZ + 16);
            tes.signText[0] = "11";
            tes.signText[1] = "";
            tes.signText[2] = "";
            tes.signText[3] = "";
        }
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 4, baseZ + 1, Block.signWall.blockID, 3); //tile.sign
        if(world.getBlockTileEntity(baseX + 6, baseY + 4, baseZ + 1) instanceof TileEntitySign) {
            TileEntitySign tes = (TileEntitySign)world.getBlockTileEntity(baseX + 6, baseY + 4, baseZ + 1);
            tes.signText[0] = "10";
            tes.signText[1] = "";
            tes.signText[2] = "";
            tes.signText[3] = "";
        }
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 4, baseZ + 16, Block.signWall.blockID, 2); //tile.sign
        if(world.getBlockTileEntity(baseX + 6, baseY + 4, baseZ + 16) instanceof TileEntitySign) {
            TileEntitySign tes = (TileEntitySign)world.getBlockTileEntity(baseX + 6, baseY + 4, baseZ + 16);
            tes.signText[0] = "10";
            tes.signText[1] = "";
            tes.signText[2] = "";
            tes.signText[3] = "";
        }
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 4, baseZ + 1, Block.signWall.blockID, 3); //tile.sign
        if(world.getBlockTileEntity(baseX + 7, baseY + 4, baseZ + 1) instanceof TileEntitySign) {
            TileEntitySign tes = (TileEntitySign)world.getBlockTileEntity(baseX + 7, baseY + 4, baseZ + 1);
            tes.signText[0] = "9";
            tes.signText[1] = "";
            tes.signText[2] = "";
            tes.signText[3] = "";
        }
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 4, baseZ + 16, Block.signWall.blockID, 2); //tile.sign
        if(world.getBlockTileEntity(baseX + 7, baseY + 4, baseZ + 16) instanceof TileEntitySign) {
            TileEntitySign tes = (TileEntitySign)world.getBlockTileEntity(baseX + 7, baseY + 4, baseZ + 16);
            tes.signText[0] = "9";
            tes.signText[1] = "";
            tes.signText[2] = "";
            tes.signText[3] = "";
        }
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 4, baseZ + 1, Block.signWall.blockID, 3); //tile.sign
        if(world.getBlockTileEntity(baseX + 8, baseY + 4, baseZ + 1) instanceof TileEntitySign) {
            TileEntitySign tes = (TileEntitySign)world.getBlockTileEntity(baseX + 8, baseY + 4, baseZ + 1);
            tes.signText[0] = "8";
            tes.signText[1] = "";
            tes.signText[2] = "";
            tes.signText[3] = "";
        }
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 4, baseZ + 16, Block.signWall.blockID, 2); //tile.sign
        if(world.getBlockTileEntity(baseX + 8, baseY + 4, baseZ + 16) instanceof TileEntitySign) {
            TileEntitySign tes = (TileEntitySign)world.getBlockTileEntity(baseX + 8, baseY + 4, baseZ + 16);
            tes.signText[0] = "8";
            tes.signText[1] = "";
            tes.signText[2] = "";
            tes.signText[3] = "";
        }
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 4, baseZ + 1, Block.signWall.blockID, 3); //tile.sign
        if(world.getBlockTileEntity(baseX + 9, baseY + 4, baseZ + 1) instanceof TileEntitySign) {
            TileEntitySign tes = (TileEntitySign)world.getBlockTileEntity(baseX + 9, baseY + 4, baseZ + 1);
            tes.signText[0] = "7";
            tes.signText[1] = "";
            tes.signText[2] = "";
            tes.signText[3] = "";
        }
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 4, baseZ + 16, Block.signWall.blockID, 2); //tile.sign
        if(world.getBlockTileEntity(baseX + 9, baseY + 4, baseZ + 16) instanceof TileEntitySign) {
            TileEntitySign tes = (TileEntitySign)world.getBlockTileEntity(baseX + 9, baseY + 4, baseZ + 16);
            tes.signText[0] = "7";
            tes.signText[1] = "";
            tes.signText[2] = "";
            tes.signText[3] = "";
        }
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 4, baseZ + 1, Block.signWall.blockID, 3); //tile.sign
        if(world.getBlockTileEntity(baseX + 10, baseY + 4, baseZ + 1) instanceof TileEntitySign) {
            TileEntitySign tes = (TileEntitySign)world.getBlockTileEntity(baseX + 10, baseY + 4, baseZ + 1);
            tes.signText[0] = "6";
            tes.signText[1] = "";
            tes.signText[2] = "";
            tes.signText[3] = "";
        }
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 4, baseZ + 16, Block.signWall.blockID, 2); //tile.sign
        if(world.getBlockTileEntity(baseX + 10, baseY + 4, baseZ + 16) instanceof TileEntitySign) {
            TileEntitySign tes = (TileEntitySign)world.getBlockTileEntity(baseX + 10, baseY + 4, baseZ + 16);
            tes.signText[0] = "6";
            tes.signText[1] = "";
            tes.signText[2] = "";
            tes.signText[3] = "";
        }
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 4, baseZ + 1, Block.signWall.blockID, 3); //tile.sign
        if(world.getBlockTileEntity(baseX + 11, baseY + 4, baseZ + 1) instanceof TileEntitySign) {
            TileEntitySign tes = (TileEntitySign)world.getBlockTileEntity(baseX + 11, baseY + 4, baseZ + 1);
            tes.signText[0] = "5";
            tes.signText[1] = "";
            tes.signText[2] = "";
            tes.signText[3] = "";
        }
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 4, baseZ + 16, Block.signWall.blockID, 2); //tile.sign
        if(world.getBlockTileEntity(baseX + 11, baseY + 4, baseZ + 16) instanceof TileEntitySign) {
            TileEntitySign tes = (TileEntitySign)world.getBlockTileEntity(baseX + 11, baseY + 4, baseZ + 16);
            tes.signText[0] = "5";
            tes.signText[1] = "";
            tes.signText[2] = "";
            tes.signText[3] = "";
        }
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 4, baseZ + 1, Block.signWall.blockID, 3); //tile.sign
        if(world.getBlockTileEntity(baseX + 12, baseY + 4, baseZ + 1) instanceof TileEntitySign) {
            TileEntitySign tes = (TileEntitySign)world.getBlockTileEntity(baseX + 12, baseY + 4, baseZ + 1);
            tes.signText[0] = "4";
            tes.signText[1] = "";
            tes.signText[2] = "";
            tes.signText[3] = "";
        }
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 4, baseZ + 16, Block.signWall.blockID, 2); //tile.sign
        if(world.getBlockTileEntity(baseX + 12, baseY + 4, baseZ + 16) instanceof TileEntitySign) {
            TileEntitySign tes = (TileEntitySign)world.getBlockTileEntity(baseX + 12, baseY + 4, baseZ + 16);
            tes.signText[0] = "4";
            tes.signText[1] = "";
            tes.signText[2] = "";
            tes.signText[3] = "";
        }
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 4, baseZ + 1, Block.signWall.blockID, 3); //tile.sign
        if(world.getBlockTileEntity(baseX + 13, baseY + 4, baseZ + 1) instanceof TileEntitySign) {
            TileEntitySign tes = (TileEntitySign)world.getBlockTileEntity(baseX + 13, baseY + 4, baseZ + 1);
            tes.signText[0] = "3";
            tes.signText[1] = "";
            tes.signText[2] = "";
            tes.signText[3] = "";
        }
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 4, baseZ + 16, Block.signWall.blockID, 2); //tile.sign
        if(world.getBlockTileEntity(baseX + 13, baseY + 4, baseZ + 16) instanceof TileEntitySign) {
            TileEntitySign tes = (TileEntitySign)world.getBlockTileEntity(baseX + 13, baseY + 4, baseZ + 16);
            tes.signText[0] = "3";
            tes.signText[1] = "";
            tes.signText[2] = "";
            tes.signText[3] = "";
        }
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 3, baseZ + 1, Block.signWall.blockID, 3); //tile.sign
        if(world.getBlockTileEntity(baseX + 14, baseY + 3, baseZ + 1) instanceof TileEntitySign) {
            TileEntitySign tes = (TileEntitySign)world.getBlockTileEntity(baseX + 14, baseY + 3, baseZ + 1);
            tes.signText[0] = "";
            tes.signText[1] = "Y";
            tes.signText[2] = "<----";
            tes.signText[3] = "";
        }
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 4, baseZ + 1, Block.signWall.blockID, 3); //tile.sign
        if(world.getBlockTileEntity(baseX + 14, baseY + 4, baseZ + 1) instanceof TileEntitySign) {
            TileEntitySign tes = (TileEntitySign)world.getBlockTileEntity(baseX + 14, baseY + 4, baseZ + 1);
            tes.signText[0] = "2";
            tes.signText[1] = "";
            tes.signText[2] = "";
            tes.signText[3] = "";
        }
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 4, baseZ + 16, Block.signWall.blockID, 2); //tile.sign
        if(world.getBlockTileEntity(baseX + 14, baseY + 4, baseZ + 16) instanceof TileEntitySign) {
            TileEntitySign tes = (TileEntitySign)world.getBlockTileEntity(baseX + 14, baseY + 4, baseZ + 16);
            tes.signText[0] = "2";
            tes.signText[1] = "";
            tes.signText[2] = "";
            tes.signText[3] = "";
        }
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 3, baseZ + 1, Block.signWall.blockID, 3); //tile.sign
        if(world.getBlockTileEntity(baseX + 15, baseY + 3, baseZ + 1) instanceof TileEntitySign) {
            TileEntitySign tes = (TileEntitySign)world.getBlockTileEntity(baseX + 15, baseY + 3, baseZ + 1);
            tes.signText[0] = "Medium Level";
            tes.signText[1] = "#1";
            tes.signText[2] = "Functions";
            tes.signText[3] = "SSP";
        }
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 4, baseZ + 1, Block.signWall.blockID, 3); //tile.sign
        if(world.getBlockTileEntity(baseX + 15, baseY + 4, baseZ + 1) instanceof TileEntitySign) {
            TileEntitySign tes = (TileEntitySign)world.getBlockTileEntity(baseX + 15, baseY + 4, baseZ + 1);
            tes.signText[0] = "1";
            tes.signText[1] = "";
            tes.signText[2] = "";
            tes.signText[3] = "";
        }
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 4, baseZ + 16, Block.signWall.blockID, 2); //tile.sign
        if(world.getBlockTileEntity(baseX + 15, baseY + 4, baseZ + 16) instanceof TileEntitySign) {
            TileEntitySign tes = (TileEntitySign)world.getBlockTileEntity(baseX + 15, baseY + 4, baseZ + 16);
            tes.signText[0] = "1";
            tes.signText[1] = "";
            tes.signText[2] = "";
            tes.signText[3] = "";
        }
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 2, baseZ + 1, SokobanMod.BlockTargetBox.blockID, 0); //tile.Target Box
        if(world.getBlockTileEntity(baseX + 16, baseY + 2, baseZ + 1) instanceof TileEntityTargetBox) {
            TileEntityTargetBox teTb = (TileEntityTargetBox)world.getBlockTileEntity(baseX + 16, baseY + 2, baseZ + 1);
            teTb.setLevelBounds(baseX, baseY, baseZ, baseX + 17, baseY + 4, baseZ + 17);
            teTb.levelDropped = getLevelNumber();
        }
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 3, baseZ + 2, Block.signWall.blockID, 4); //tile.sign
        if(world.getBlockTileEntity(baseX + 16, baseY + 3, baseZ + 2) instanceof TileEntitySign) {
            TileEntitySign tes = (TileEntitySign)world.getBlockTileEntity(baseX + 16, baseY + 3, baseZ + 2);
            tes.signText[0] = "Use these";
            tes.signText[1] = "equations";
            tes.signText[2] = "to solve this";
            tes.signText[3] = "puzzle";
        }
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 3, baseZ + 3, Block.signWall.blockID, 4); //tile.sign
        if(world.getBlockTileEntity(baseX + 16, baseY + 3, baseZ + 3) instanceof TileEntitySign) {
            TileEntitySign tes = (TileEntitySign)world.getBlockTileEntity(baseX + 16, baseY + 3, baseZ + 3);
            tes.signText[0] = "y=1x+0";
            tes.signText[1] = "";
            tes.signText[2] = "y=1x+1";
            tes.signText[3] = "";
        }
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 3, baseZ + 4, Block.signWall.blockID, 4); //tile.sign
        if(world.getBlockTileEntity(baseX + 16, baseY + 3, baseZ + 4) instanceof TileEntitySign) {
            TileEntitySign tes = (TileEntitySign)world.getBlockTileEntity(baseX + 16, baseY + 3, baseZ + 4);
            tes.signText[0] = "";
            tes.signText[1] = "X";
            tes.signText[2] = "---->";
            tes.signText[3] = "";
        }
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 4, baseZ + 1, Block.signWall.blockID, 4); //tile.sign
        if(world.getBlockTileEntity(baseX + 16, baseY + 4, baseZ + 1) instanceof TileEntitySign) {
            TileEntitySign tes = (TileEntitySign)world.getBlockTileEntity(baseX + 16, baseY + 4, baseZ + 1);
            tes.signText[0] = "0";
            tes.signText[1] = "";
            tes.signText[2] = "";
            tes.signText[3] = "";
        }
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 4, baseZ + 2, Block.signWall.blockID, 4); //tile.sign
        if(world.getBlockTileEntity(baseX + 16, baseY + 4, baseZ + 2) instanceof TileEntitySign) {
            TileEntitySign tes = (TileEntitySign)world.getBlockTileEntity(baseX + 16, baseY + 4, baseZ + 2);
            tes.signText[0] = "1";
            tes.signText[1] = "";
            tes.signText[2] = "";
            tes.signText[3] = "";
        }
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 4, baseZ + 3, Block.signWall.blockID, 4); //tile.sign
        if(world.getBlockTileEntity(baseX + 16, baseY + 4, baseZ + 3) instanceof TileEntitySign) {
            TileEntitySign tes = (TileEntitySign)world.getBlockTileEntity(baseX + 16, baseY + 4, baseZ + 3);
            tes.signText[0] = "2";
            tes.signText[1] = "";
            tes.signText[2] = "";
            tes.signText[3] = "";
        }
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 4, baseZ + 4, Block.signWall.blockID, 4); //tile.sign
        if(world.getBlockTileEntity(baseX + 16, baseY + 4, baseZ + 4) instanceof TileEntitySign) {
            TileEntitySign tes = (TileEntitySign)world.getBlockTileEntity(baseX + 16, baseY + 4, baseZ + 4);
            tes.signText[0] = "3";
            tes.signText[1] = "";
            tes.signText[2] = "";
            tes.signText[3] = "";
        }
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 4, baseZ + 5, Block.signWall.blockID, 4); //tile.sign
        if(world.getBlockTileEntity(baseX + 16, baseY + 4, baseZ + 5) instanceof TileEntitySign) {
            TileEntitySign tes = (TileEntitySign)world.getBlockTileEntity(baseX + 16, baseY + 4, baseZ + 5);
            tes.signText[0] = "4";
            tes.signText[1] = "";
            tes.signText[2] = "";
            tes.signText[3] = "";
        }
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 4, baseZ + 6, Block.signWall.blockID, 4); //tile.sign
        if(world.getBlockTileEntity(baseX + 16, baseY + 4, baseZ + 6) instanceof TileEntitySign) {
            TileEntitySign tes = (TileEntitySign)world.getBlockTileEntity(baseX + 16, baseY + 4, baseZ + 6);
            tes.signText[0] = "5";
            tes.signText[1] = "";
            tes.signText[2] = "";
            tes.signText[3] = "";
        }
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 4, baseZ + 7, Block.signWall.blockID, 4); //tile.sign
        if(world.getBlockTileEntity(baseX + 16, baseY + 4, baseZ + 7) instanceof TileEntitySign) {
            TileEntitySign tes = (TileEntitySign)world.getBlockTileEntity(baseX + 16, baseY + 4, baseZ + 7);
            tes.signText[0] = "6";
            tes.signText[1] = "";
            tes.signText[2] = "";
            tes.signText[3] = "";
        }
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 4, baseZ + 8, Block.signWall.blockID, 4); //tile.sign
        if(world.getBlockTileEntity(baseX + 16, baseY + 4, baseZ + 8) instanceof TileEntitySign) {
            TileEntitySign tes = (TileEntitySign)world.getBlockTileEntity(baseX + 16, baseY + 4, baseZ + 8);
            tes.signText[0] = "7";
            tes.signText[1] = "";
            tes.signText[2] = "";
            tes.signText[3] = "";
        }
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 4, baseZ + 9, Block.signWall.blockID, 4); //tile.sign
        if(world.getBlockTileEntity(baseX + 16, baseY + 4, baseZ + 9) instanceof TileEntitySign) {
            TileEntitySign tes = (TileEntitySign)world.getBlockTileEntity(baseX + 16, baseY + 4, baseZ + 9);
            tes.signText[0] = "8";
            tes.signText[1] = "";
            tes.signText[2] = "";
            tes.signText[3] = "";
        }
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 4, baseZ + 10, Block.signWall.blockID, 4); //tile.sign
        if(world.getBlockTileEntity(baseX + 16, baseY + 4, baseZ + 10) instanceof TileEntitySign) {
            TileEntitySign tes = (TileEntitySign)world.getBlockTileEntity(baseX + 16, baseY + 4, baseZ + 10);
            tes.signText[0] = "9";
            tes.signText[1] = "";
            tes.signText[2] = "";
            tes.signText[3] = "";
        }
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 4, baseZ + 11, Block.signWall.blockID, 4); //tile.sign
        if(world.getBlockTileEntity(baseX + 16, baseY + 4, baseZ + 11) instanceof TileEntitySign) {
            TileEntitySign tes = (TileEntitySign)world.getBlockTileEntity(baseX + 16, baseY + 4, baseZ + 11);
            tes.signText[0] = "10";
            tes.signText[1] = "";
            tes.signText[2] = "";
            tes.signText[3] = "";
        }
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 4, baseZ + 12, Block.signWall.blockID, 4); //tile.sign
        if(world.getBlockTileEntity(baseX + 16, baseY + 4, baseZ + 12) instanceof TileEntitySign) {
            TileEntitySign tes = (TileEntitySign)world.getBlockTileEntity(baseX + 16, baseY + 4, baseZ + 12);
            tes.signText[0] = "11";
            tes.signText[1] = "";
            tes.signText[2] = "";
            tes.signText[3] = "";
        }
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 4, baseZ + 13, Block.signWall.blockID, 4); //tile.sign
        if(world.getBlockTileEntity(baseX + 16, baseY + 4, baseZ + 13) instanceof TileEntitySign) {
            TileEntitySign tes = (TileEntitySign)world.getBlockTileEntity(baseX + 16, baseY + 4, baseZ + 13);
            tes.signText[0] = "12";
            tes.signText[1] = "";
            tes.signText[2] = "";
            tes.signText[3] = "";
        }
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 4, baseZ + 14, Block.signWall.blockID, 4); //tile.sign
        if(world.getBlockTileEntity(baseX + 16, baseY + 4, baseZ + 14) instanceof TileEntitySign) {
            TileEntitySign tes = (TileEntitySign)world.getBlockTileEntity(baseX + 16, baseY + 4, baseZ + 14);
            tes.signText[0] = "13";
            tes.signText[1] = "";
            tes.signText[2] = "";
            tes.signText[3] = "";
        }
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 4, baseZ + 15, Block.signWall.blockID, 4); //tile.sign
        if(world.getBlockTileEntity(baseX + 16, baseY + 4, baseZ + 15) instanceof TileEntitySign) {
            TileEntitySign tes = (TileEntitySign)world.getBlockTileEntity(baseX + 16, baseY + 4, baseZ + 15);
            tes.signText[0] = "14";
            tes.signText[1] = "";
            tes.signText[2] = "";
            tes.signText[3] = "";
        }
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 4, baseZ + 16, Block.signWall.blockID, 2); //tile.sign
        if(world.getBlockTileEntity(baseX + 16, baseY + 4, baseZ + 16) instanceof TileEntitySign) {
            TileEntitySign tes = (TileEntitySign)world.getBlockTileEntity(baseX + 16, baseY + 4, baseZ + 16);
            tes.signText[0] = "0";
            tes.signText[1] = "";
            tes.signText[2] = "";
            tes.signText[3] = "";
        }
        return true;
    }
}