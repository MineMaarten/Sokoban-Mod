package sokobanMod.common.gen.easy;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntitySign;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraft.world.World;
import net.minecraftforge.common.ChestGenHooks;
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

public class EasyLevel1Gen implements ISokobanLevel{
    private static final int[] levelBounds = {18, 8, 22};
    private static final int[] entranceCoords = {0, 8, 0, 0, 8, 1, 0, 8, 2, 0, 8, 3, 0, 8, 4, 0, 8, 5, 0, 8, 6, 0, 8, 7, 0, 8, 8, 0, 8, 9, 0, 8, 10, 0, 8, 11, 0, 8, 12, 0, 8, 13, 0, 8, 14, 0, 8, 15, 0, 8, 16, 0, 8, 17, 0, 8, 18, 0, 8, 19, 0, 8, 20, 0, 8, 21, 1, 8, 0, 1, 8, 1, 1, 8, 2, 1, 8, 3, 1, 8, 4, 1, 8, 5, 1, 8, 6, 1, 8, 7, 1, 8, 8, 1, 8, 9, 1, 8, 10, 1, 8, 11, 1, 8, 12, 1, 8, 13, 1, 8, 14, 1, 8, 15, 1, 8, 16, 1, 8, 17, 1, 8, 18, 1, 8, 19, 1, 8, 20, 1, 8, 21, 1, 8, 22, 2, 8, 0, 2, 8, 1, 2, 8, 2, 2, 8, 3, 2, 8, 4, 2, 8, 5, 2, 8, 6, 2, 8, 7, 2, 8, 8, 2, 8, 9, 2, 8, 10, 2, 8, 11, 2, 8, 12, 2, 8, 13, 2, 8, 14, 2, 8, 15, 2, 8, 16, 2, 8, 17, 2, 8, 18, 2, 8, 19, 2, 8, 20, 2, 8, 21, 2, 8, 22, 3, 8, 0, 3, 8, 1, 3, 8, 2, 3, 8, 3, 3, 8, 4, 3, 8, 5, 3, 8, 6, 3, 8, 7, 3, 8, 8, 3, 8, 9, 3, 8, 10, 3, 8, 11, 3, 8, 12, 3, 8, 18, 3, 8, 19, 3, 8, 20, 3, 8, 21, 3, 8, 22, 4, 8, 0, 4, 8, 1, 4, 8, 2, 4, 8, 3, 4, 8, 4, 4, 8, 5, 4, 8, 6, 4, 8, 7, 4, 8, 8, 4, 8, 9, 4, 8, 10, 4, 8, 11, 4, 8, 12, 4, 8, 18, 4, 8, 19, 4, 8, 20, 4, 8, 21, 4, 8, 22, 5, 8, 0, 5, 8, 1, 5, 8, 2, 5, 8, 3, 5, 8, 4, 5, 8, 5, 5, 8, 6, 5, 8, 7, 5, 8, 8, 5, 8, 9, 5, 8, 10, 5, 8, 11, 5, 8, 12, 5, 8, 18, 5, 8, 19, 5, 8, 20, 5, 8, 21, 5, 8, 22, 6, 8, 0, 6, 8, 1, 6, 8, 2, 6, 8, 3, 6, 8, 4, 6, 8, 5, 6, 8, 6, 6, 8, 7, 6, 8, 8, 6, 8, 9, 6, 8, 10, 6, 8, 11, 6, 8, 12, 6, 8, 18, 6, 8, 19, 6, 8, 20, 6, 8, 21, 6, 8, 22, 7, 8, 0, 7, 8, 1, 7, 8, 2, 7, 8, 3, 7, 8, 4, 7, 8, 5, 7, 8, 6, 7, 8, 7, 7, 8, 8, 7, 8, 9, 7, 8, 10, 7, 8, 11, 7, 8, 12, 7, 8, 13, 7, 8, 14, 7, 8, 15, 7, 8, 16, 7, 8, 17, 7, 8, 18, 7, 8, 19, 7, 8, 20, 7, 8, 21, 7, 8, 22, 8, 8, 0, 8, 8, 1, 8, 8, 2, 8, 8, 3, 8, 8, 4, 8, 8, 5, 8, 8, 6, 8, 8, 7, 8, 8, 8, 8, 8, 9, 8, 8, 10, 8, 8, 11, 8, 8, 12, 8, 8, 13, 8, 8, 14, 8, 8, 15, 8, 8, 16, 8, 8, 17, 8, 8, 18, 8, 8, 19, 8, 8, 20, 8, 8, 21, 8, 8, 22, 9, 8, 0, 9, 8, 1, 9, 8, 2, 9, 8, 3, 9, 8, 4, 9, 8, 5, 9, 8, 6, 9, 8, 7, 9, 8, 8, 9, 8, 9, 9, 8, 10, 9, 8, 11, 9, 8, 12, 9, 8, 13, 9, 8, 14, 9, 8, 15, 9, 8, 16, 9, 8, 17, 9, 8, 18, 9, 8, 19, 9, 8, 20, 9, 8, 21, 9, 8, 22, 10, 8, 0, 10, 8, 1, 10, 8, 2, 10, 8, 3, 10, 8, 4, 10, 8, 5, 10, 8, 6, 10, 8, 7, 10, 8, 8, 10, 8, 9, 10, 8, 10, 10, 8, 11, 10, 8, 12, 10, 8, 13, 10, 8, 14, 10, 8, 15, 10, 8, 16, 10, 8, 17, 10, 8, 18, 10, 8, 19, 10, 8, 20, 10, 8, 21, 10, 8, 22, 11, 8, 0, 11, 8, 1, 11, 8, 2, 11, 8, 3, 11, 8, 4, 11, 8, 5, 11, 8, 6, 11, 8, 7, 11, 8, 8, 11, 8, 9, 11, 8, 10, 11, 8, 11, 11, 8, 12, 11, 8, 13, 11, 8, 14, 11, 8, 15, 11, 8, 16, 11, 8, 17, 11, 8, 18, 11, 8, 19, 11, 8, 20, 11, 8, 21, 11, 8, 22, 12, 8, 0, 12, 8, 1, 12, 8, 2, 12, 8, 3, 12, 8, 4, 12, 8, 5, 12, 8, 6, 12, 8, 7, 12, 8, 8, 12, 8, 9, 12, 8, 10, 12, 8, 11, 12, 8, 12, 12, 8, 13, 12, 8, 14, 12, 8, 15, 12, 8, 16, 12, 8, 17, 12, 8, 18, 12, 8, 19, 12, 8, 20, 12, 8, 21, 12, 8, 22, 13, 8, 0, 13, 8, 1, 13, 8, 2, 13, 8, 3, 13, 8, 4, 13, 8, 5, 13, 8, 6, 13, 8, 7, 13, 8, 8, 13, 8, 9, 13, 8, 10, 13, 8, 11, 13, 8, 12, 13, 8, 13, 13, 8, 14, 13, 8, 15, 13, 8, 16, 13, 8, 17, 13, 8, 18, 13, 8, 19, 13, 8, 20, 13, 8, 21, 13, 8, 22, 14, 8, 0, 14, 8, 1, 14, 8, 2, 14, 8, 3, 14, 8, 4, 14, 8, 5, 14, 8, 6, 14, 8, 7, 14, 8, 8, 14, 8, 9, 14, 8, 10, 14, 8, 11, 14, 8, 12, 14, 8, 13, 14, 8, 14, 14, 8, 15, 14, 8, 16, 14, 8, 17, 14, 8, 18, 14, 8, 19, 14, 8, 20, 14, 8, 21, 14, 8, 22, 15, 8, 0, 15, 8, 1, 15, 8, 2, 15, 8, 3, 15, 8, 4, 15, 8, 5, 15, 8, 6, 15, 8, 7, 15, 8, 8, 15, 8, 9, 15, 8, 10, 15, 8, 11, 15, 8, 12, 15, 8, 13, 15, 8, 14, 15, 8, 15, 15, 8, 16, 15, 8, 17, 15, 8, 18, 15, 8, 19, 15, 8, 20, 15, 8, 21, 15, 8, 22, 16, 8, 0, 16, 8, 1, 16, 8, 2, 16, 8, 3, 16, 8, 4, 16, 8, 5, 16, 8, 6, 16, 8, 7, 16, 8, 8, 16, 8, 9, 16, 8, 10, 16, 8, 11, 16, 8, 12, 16, 8, 13, 16, 8, 14, 16, 8, 15, 16, 8, 16, 16, 8, 17, 16, 8, 18, 16, 8, 19, 16, 8, 20, 16, 8, 21, 16, 8, 22, 17, 8, 0, 17, 8, 1, 17, 8, 2, 17, 8, 3, 17, 8, 4, 17, 8, 5, 17, 8, 6, 17, 8, 7, 17, 8, 8, 17, 8, 9, 17, 8, 10, 17, 8, 11, 17, 8, 12, 17, 8, 13, 17, 8, 14, 17, 8, 15, 17, 8, 16, 17, 8, 17, 17, 8, 18, 17, 8, 19, 17, 8, 20, 17, 8, 21, 17, 8, 22, 18, 8, 0, 18, 8, 1, 18, 8, 2, 18, 8, 3, 18, 8, 4, 18, 8, 5, 18, 8, 6, 18, 8, 7, 18, 8, 8, 18, 8, 9, 18, 8, 10, 18, 8, 11, 18, 8, 12, 18, 8, 13, 18, 8, 14, 18, 8, 15, 18, 8, 16, 18, 8, 17, 18, 8, 18, 18, 8, 19, 18, 8, 20, 18, 8, 21, 18, 8, 22, 0, 1, 0, 0, 1, 22, 0, 2, 0, 0, 2, 22, 0, 3, 0, 0, 3, 22, 0, 4, 0, 0, 4, 22, 0, 5, 0, 0, 5, 22, 0, 6, 0, 0, 6, 22, 0, 7, 0, 0, 7, 22, 1, 1, 0, 1, 1, 22, 1, 2, 0, 1, 2, 22, 1, 3, 0, 1, 3, 22, 1, 4, 0, 1, 4, 22, 1, 5, 0, 1, 5, 22, 1, 6, 0, 1, 6, 22, 1, 7, 0, 1, 7, 22, 2, 1, 0, 2, 1, 22, 2, 2, 0, 2, 2, 22, 2, 3, 0, 2, 3, 22, 2, 4, 0, 2, 4, 22, 2, 5, 0, 2, 5, 22, 2, 6, 0, 2, 6, 22, 2, 7, 0, 2, 7, 22, 3, 1, 0, 3, 1, 22, 3, 2, 0, 3, 2, 22, 3, 3, 0, 3, 3, 22, 3, 4, 0, 3, 4, 22, 3, 5, 0, 3, 5, 22, 3, 6, 0, 3, 6, 22, 3, 7, 0, 3, 7, 22, 4, 1, 0, 4, 1, 22, 4, 2, 0, 4, 2, 22, 4, 3, 0, 4, 3, 22, 4, 4, 0, 4, 4, 22, 4, 5, 0, 4, 5, 22, 4, 6, 0, 4, 6, 22, 4, 7, 0, 4, 7, 22, 5, 1, 0, 5, 1, 22, 5, 2, 0, 5, 2, 22, 5, 3, 0, 5, 3, 22, 5, 4, 0, 5, 4, 22, 5, 5, 0, 5, 5, 22, 5, 6, 0, 5, 6, 22, 5, 7, 0, 5, 7, 22, 6, 1, 0, 6, 1, 22, 6, 2, 0, 6, 2, 22, 6, 3, 0, 6, 3, 22, 6, 4, 0, 6, 4, 22, 6, 5, 0, 6, 5, 22, 6, 6, 0, 6, 6, 22, 6, 7, 0, 6, 7, 22, 7, 1, 0, 7, 1, 22, 7, 2, 0, 7, 2, 22, 7, 3, 0, 7, 3, 22, 7, 4, 0, 7, 4, 22, 7, 5, 0, 7, 5, 22, 7, 6, 0, 7, 6, 22, 7, 7, 0, 7, 7, 22, 8, 1, 0, 8, 1, 22, 8, 2, 0, 8, 2, 22, 8, 3, 0, 8, 3, 22, 8, 4, 0, 8, 4, 22, 8, 5, 0, 8, 5, 22, 8, 6, 0, 8, 6, 22, 8, 7, 0, 8, 7, 22, 9, 1, 0, 9, 1, 22, 9, 2, 0, 9, 2, 22, 9, 3, 0, 9, 3, 22, 9, 4, 0, 9, 4, 22, 9, 5, 0, 9, 5, 22, 9, 6, 0, 9, 6, 22, 9, 7, 0, 9, 7, 22, 10, 1, 0, 10, 1, 22, 10, 2, 0, 10, 2, 22, 10, 3, 0, 10, 3, 22, 10, 4, 0, 10, 4, 22, 10, 5, 0, 10, 5, 22, 10, 6, 0, 10, 6, 22, 10, 7, 0, 10, 7, 22, 11, 1, 0, 11, 1, 22, 11, 2, 0, 11, 2, 22, 11, 3, 0, 11, 3, 22, 11, 4, 0, 11, 4, 22, 11, 5, 0, 11, 5, 22, 11, 6, 0, 11, 6, 22, 11, 7, 0, 11, 7, 22, 12, 1, 0, 12, 1, 22, 12, 2, 0, 12, 2, 22, 12, 3, 0, 12, 3, 22, 12, 4, 0, 12, 4, 22, 12, 5, 0, 12, 5, 22, 12, 6, 0, 12, 6, 22, 12, 7, 0, 12, 7, 22, 13, 1, 0, 13, 1, 22, 13, 2, 0, 13, 2, 22, 13, 3, 0, 13, 3, 22, 13, 4, 0, 13, 4, 22, 13, 5, 0, 13, 5, 22, 13, 6, 0, 13, 6, 22, 13, 7, 0, 13, 7, 22, 14, 1, 0, 14, 1, 22, 14, 2, 0, 14, 2, 22, 14, 3, 0, 14, 3, 22, 14, 4, 0, 14, 4, 22, 14, 5, 0, 14, 5, 22, 14, 6, 0, 14, 6, 22, 14, 7, 0, 14, 7, 22, 15, 1, 0, 15, 1, 22, 15, 2, 0, 15, 2, 22, 15, 3, 0, 15, 3, 22, 15, 4, 0, 15, 4, 22, 15, 5, 0, 15, 5, 22, 15, 6, 0, 15, 6, 22, 15, 7, 0, 15, 7, 22, 16, 1, 0, 16, 1, 22, 16, 2, 0, 16, 2, 22, 16, 3, 0, 16, 3, 22, 16, 4, 0, 16, 4, 22, 16, 5, 0, 16, 5, 22, 16, 6, 0, 16, 6, 22, 16, 7, 0, 16, 7, 22, 17, 1, 0, 17, 1, 22, 17, 2, 0, 17, 2, 22, 17, 3, 0, 17, 3, 22, 17, 4, 0, 17, 4, 22, 17, 5, 0, 17, 5, 22, 17, 6, 0, 17, 6, 22, 17, 7, 0, 17, 7, 22, 18, 1, 0, 18, 1, 22, 18, 2, 0, 18, 2, 22, 18, 3, 0, 18, 3, 22, 18, 4, 0, 18, 4, 22, 18, 5, 0, 18, 5, 22, 18, 6, 0, 18, 6, 22, 18, 7, 0, 18, 7, 22, 0, 1, 1, 18, 1, 1, 0, 1, 2, 18, 1, 2, 0, 1, 3, 18, 1, 3, 0, 1, 4, 18, 1, 4, 0, 1, 5, 18, 1, 5, 0, 1, 6, 18, 1, 6, 0, 1, 7, 18, 1, 7, 0, 1, 8, 18, 1, 8, 0, 1, 9, 18, 1, 9, 0, 1, 10, 18, 1, 10, 0, 1, 11, 18, 1, 11, 0, 1, 12, 18, 1, 12, 0, 1, 13, 18, 1, 13, 0, 1, 14, 18, 1, 14, 0, 1, 15, 18, 1, 15, 0, 1, 16, 18, 1, 16, 0, 1, 17, 18, 1, 17, 0, 1, 18, 18, 1, 18, 0, 1, 19, 18, 1, 19, 0, 1, 20, 18, 1, 20, 0, 1, 21, 18, 1, 21, 0, 2, 1, 18, 2, 1, 0, 2, 2, 18, 2, 2, 0, 2, 3, 18, 2, 3, 0, 2, 4, 18, 2, 4, 0, 2, 5, 18, 2, 5, 0, 2, 6, 18, 2, 6, 0, 2, 7, 18, 2, 7, 0, 2, 8, 18, 2, 8, 0, 2, 9, 18, 2, 9, 0, 2, 10, 18, 2, 10, 0, 2, 11, 18, 2, 11, 0, 2, 12, 18, 2, 12, 0, 2, 13, 18, 2, 13, 0, 2, 14, 18, 2, 14, 0, 2, 15, 18, 2, 15, 0, 2, 16, 18, 2, 16, 0, 2, 17, 18, 2, 17, 0, 2, 18, 18, 2, 18, 0, 2, 19, 18, 2, 19, 0, 2, 20, 18, 2, 20, 0, 2, 21, 18, 2, 21, 0, 3, 1, 18, 3, 1, 0, 3, 2, 18, 3, 2, 0, 3, 3, 18, 3, 3, 0, 3, 4, 18, 3, 4, 0, 3, 5, 18, 3, 5, 0, 3, 6, 18, 3, 6, 0, 3, 7, 18, 3, 7, 0, 3, 8, 18, 3, 8, 0, 3, 9, 18, 3, 9, 0, 3, 10, 18, 3, 10, 0, 3, 11, 18, 3, 11, 0, 3, 12, 18, 3, 12, 0, 3, 13, 18, 3, 13, 0, 3, 14, 18, 3, 14, 0, 3, 15, 18, 3, 15, 0, 3, 16, 18, 3, 16, 0, 3, 17, 18, 3, 17, 0, 3, 18, 18, 3, 18, 0, 3, 19, 18, 3, 19, 0, 3, 20, 18, 3, 20, 0, 3, 21, 18, 3, 21, 0, 4, 1, 18, 4, 1, 0, 4, 2, 18, 4, 2, 0, 4, 3, 18, 4, 3, 0, 4, 4, 18, 4, 4, 0, 4, 5, 18, 4, 5, 0, 4, 6, 18, 4, 6, 0, 4, 7, 18, 4, 7, 0, 4, 8, 18, 4, 8, 0, 4, 9, 18, 4, 9, 0, 4, 10, 18, 4, 10, 0, 4, 11, 18, 4, 11, 0, 4, 12, 18, 4, 12, 0, 4, 13, 18, 4, 13, 0, 4, 14, 18, 4, 14, 0, 4, 15, 18, 4, 15, 0, 4, 16, 18, 4, 16, 0, 4, 17, 18, 4, 17, 0, 4, 18, 18, 4, 18, 0, 4, 19, 18, 4, 19, 0, 4, 20, 18, 4, 20, 0, 4, 21, 18, 4, 21, 0, 5, 1, 18, 5, 1, 0, 5, 2, 18, 5, 2, 0, 5, 3, 18, 5, 3, 0, 5, 4, 18, 5, 4, 0, 5, 5, 18, 5, 5, 0, 5, 6, 18, 5, 6, 0, 5, 7, 18, 5, 7, 0, 5, 8, 18, 5, 8, 0, 5, 9, 18, 5, 9, 0, 5, 10, 18, 5, 10, 0, 5, 11, 18, 5, 11, 0, 5, 12, 18, 5, 12, 0, 5, 13, 18, 5, 13, 0, 5, 14, 18, 5, 14, 0, 5, 15, 18, 5, 15, 0, 5, 16, 18, 5, 16, 0, 5, 17, 18, 5, 17, 0, 5, 18, 18, 5, 18, 0, 5, 19, 18, 5, 19, 0, 5, 20, 18, 5, 20, 0, 5, 21, 18, 5, 21, 0, 6, 1, 18, 6, 1, 0, 6, 2, 18, 6, 2, 0, 6, 3, 18, 6, 3, 0, 6, 4, 18, 6, 4, 0, 6, 5, 18, 6, 5, 0, 6, 6, 18, 6, 6, 0, 6, 7, 18, 6, 7, 0, 6, 8, 18, 6, 8, 0, 6, 9, 18, 6, 9, 0, 6, 10, 18, 6, 10, 0, 6, 11, 18, 6, 11, 0, 6, 12, 18, 6, 12, 0, 6, 13, 18, 6, 13, 0, 6, 14, 18, 6, 14, 0, 6, 15, 18, 6, 15, 0, 6, 16, 18, 6, 16, 0, 6, 17, 18, 6, 17, 0, 6, 18, 18, 6, 18, 0, 6, 19, 18, 6, 19, 0, 6, 20, 18, 6, 20, 0, 6, 21, 18, 6, 21, 0, 7, 1, 18, 7, 1, 0, 7, 2, 18, 7, 2, 0, 7, 3, 18, 7, 3, 0, 7, 4, 18, 7, 4, 0, 7, 5, 18, 7, 5, 0, 7, 6, 18, 7, 6, 0, 7, 7, 18, 7, 7, 0, 7, 8, 18, 7, 8, 0, 7, 9, 18, 7, 9, 0, 7, 10, 18, 7, 10, 0, 7, 11, 18, 7, 11, 0, 7, 12, 18, 7, 12, 0, 7, 13, 18, 7, 13, 0, 7, 14, 18, 7, 14, 0, 7, 15, 18, 7, 15, 0, 7, 16, 18, 7, 16, 0, 7, 17, 18, 7, 17, 0, 7, 18, 18, 7, 18, 0, 7, 19, 18, 7, 19, 0, 7, 20, 18, 7, 20, 0, 7, 21, 18, 7, 21};
    public static final ItemStack[] staticInventoryContents_5_4_15 = new ItemStack[]{};
    public static final WeightedRandomChestContent[] randomInventoryContents_5_4_15 = ChestGenHooks.getItems(ChestGenHooks.PYRAMID_DESERT_CHEST, new Random());

    @Override
    public int getLevelNumber(){
        return 1000;
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
        return "Vaporizing Loot";
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
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 0, baseZ + 18, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 0, baseZ + 19, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 0, baseZ + 20, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 0, baseZ + 21, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 0, baseY + 0, baseZ + 22, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
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
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 0, baseZ + 18, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 0, baseZ + 19, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 0, baseZ + 20, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 0, baseZ + 21, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 0, baseZ + 22, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 1, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 1, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 1, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 1, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 1, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 1, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 1, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 1, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 1, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 1, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 1, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 1, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 1, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 1, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 1, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 1, baseZ + 16, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 1, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 1, baseZ + 18, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 1, baseZ + 19, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 1, baseZ + 20, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 1, baseY + 1, baseZ + 21, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
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
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 0, baseZ + 18, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 0, baseZ + 19, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 0, baseZ + 20, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 0, baseZ + 21, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 0, baseZ + 22, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 1, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 1, baseZ + 2, SokobanMod.BlockUnbreakableLamps.blockID, 14); // tile.Unbreakable
                                                                                                                                // Lamp
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 1, baseZ + 12, SokobanMod.BlockUnbreakableLamps.blockID, 14); // tile.Unbreakable
                                                                                                                                 // Lamp
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 1, baseZ + 20, SokobanMod.BlockUnbreakableLamps.blockID, 14); // tile.Unbreakable
                                                                                                                                 // Lamp
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 1, baseZ + 21, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 2, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 2, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 2, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 2, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
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
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 2, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 2, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 2, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 2, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 2, baseZ + 16, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 2, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 2, baseZ + 18, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 2, baseZ + 19, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 2, baseY + 2, baseZ + 20, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
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
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 0, baseZ + 18, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 0, baseZ + 19, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 0, baseZ + 20, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 0, baseZ + 21, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 0, baseZ + 22, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 1, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 1, baseZ + 21, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 2, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 2, baseZ + 20, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
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
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 3, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
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
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 3, baseZ + 18, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 3, baseZ + 19, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 4, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 4, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 4, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 4, baseZ + 16, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 4, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 5, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 5, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 5, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 5, baseZ + 16, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 5, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 6, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 6, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 6, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 6, baseZ + 16, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 6, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
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
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 8, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 8, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 8, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 8, baseZ + 16, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 3, baseY + 8, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
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
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 0, baseZ + 18, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 0, baseZ + 19, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 0, baseZ + 20, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 0, baseZ + 21, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 0, baseZ + 22, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 1, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 1, baseZ + 4, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 1, baseZ + 5, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 1, baseZ + 6, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 1, baseZ + 7, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 1, baseZ + 8, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 1, baseZ + 9, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 1, baseZ + 10, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 1, baseZ + 11, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 1, baseZ + 12, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 1, baseZ + 21, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 2, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 2, baseZ + 20, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 3, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 3, baseZ + 4, SokobanMod.BlockTarget.blockID, 2); // tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 3, baseZ + 5, SokobanMod.BlockTarget.blockID, 2); // tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 3, baseZ + 6, SokobanMod.BlockTarget.blockID, 2); // tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 3, baseZ + 7, SokobanMod.BlockTarget.blockID, 2); // tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 3, baseZ + 8, SokobanMod.BlockTarget.blockID, 2); // tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 3, baseZ + 9, SokobanMod.BlockTarget.blockID, 2); // tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 3, baseZ + 10, SokobanMod.BlockTarget.blockID, 2); // tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 3, baseZ + 11, SokobanMod.BlockTarget.blockID, 2); // tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 3, baseZ + 12, SokobanMod.BlockTarget.blockID, 2); // tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 3, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
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
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 3, baseZ + 18, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 3, baseZ + 19, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 4, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 4, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 5, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 5, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 6, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 6, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 7, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 7, baseZ + 14, SokobanMod.BlockVaporizingBlock.blockID, 0); // tile.Vaporizing
                                                                                                                               // Block
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 7, baseZ + 15, SokobanMod.BlockVaporizingBlock.blockID, 0); // tile.Vaporizing
                                                                                                                               // Block
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 7, baseZ + 16, SokobanMod.BlockVaporizingBlock.blockID, 0); // tile.Vaporizing
                                                                                                                               // Block
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 7, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 8, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 8, baseZ + 14, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Glass
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 8, baseZ + 15, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Glass
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 8, baseZ + 16, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Glass
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 8, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
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
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 0, baseZ + 18, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 0, baseZ + 19, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 0, baseZ + 20, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 0, baseZ + 21, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 0, baseZ + 22, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 1, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 1, baseZ + 3, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 1, baseZ + 4, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 1, baseZ + 5, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 1, baseZ + 6, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 1, baseZ + 7, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 1, baseZ + 8, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 1, baseZ + 9, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 1, baseZ + 10, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 1, baseZ + 11, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 1, baseZ + 12, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 1, baseZ + 15, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 1, baseZ + 21, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 2, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 2, baseZ + 18, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 2, baseZ + 20, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 3, baseZ + 3, SokobanMod.BlockTarget.blockID, 2); // tile.Target
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
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 3, baseZ + 12, SokobanMod.BlockTarget.blockID, 2); // tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 3, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 3, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 3, baseZ + 15, Block.bedrock.blockID, 0); // tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 3, baseZ + 16, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 3, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 3, baseZ + 18, SokobanMod.BlockVaporizingBlock.blockID, 0); // tile.Vaporizing
                                                                                                                               // Block
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 3, baseZ + 19, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 4, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 4, baseZ + 15, SokobanMod.BlockLootGenerator.blockID, 0); // tile.Loot
                                                                                                                             // Generator
        if(world.getBlockTileEntity(baseX + 5, baseY + 4, baseZ + 15) instanceof TileEntityLootGenerator) {
            TileEntityLootGenerator teLg = (TileEntityLootGenerator)world.getBlockTileEntity(baseX + 5, baseY + 4, baseZ + 15);
            teLg.setAchievement(getLevelNumber());
            LevelGenBase.setLootGeneratorContents(teLg, staticInventoryContents_5_4_15, randomInventoryContents_5_4_15);
        }
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 4, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 4, baseZ + 18, SokobanMod.BlockVaporizingBlock.blockID, 0); // tile.Vaporizing
                                                                                                                               // Block
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 5, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 5, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 5, baseZ + 18, SokobanMod.BlockVaporizingBlock.blockID, 0); // tile.Vaporizing
                                                                                                                               // Block
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 6, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 6, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 6, baseZ + 18, SokobanMod.BlockVaporizingBlock.blockID, 0); // tile.Vaporizing
                                                                                                                               // Block
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 7, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 7, baseZ + 14, SokobanMod.BlockVaporizingBlock.blockID, 0); // tile.Vaporizing
                                                                                                                               // Block
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 7, baseZ + 15, SokobanMod.BlockVaporizingBlock.blockID, 0); // tile.Vaporizing
                                                                                                                               // Block
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 7, baseZ + 16, SokobanMod.BlockVaporizingBlock.blockID, 0); // tile.Vaporizing
                                                                                                                               // Block
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 7, baseZ + 17, SokobanMod.BlockVaporizingBlock.blockID, 0); // tile.Vaporizing
                                                                                                                               // Block
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 7, baseZ + 18, SokobanMod.BlockVaporizingBlock.blockID, 0); // tile.Vaporizing
                                                                                                                               // Block
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 8, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 8, baseZ + 14, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Glass
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 8, baseZ + 15, 11, 0); // tile.lava
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 8, baseZ + 16, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Glass
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 8, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
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
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 0, baseZ + 15, Block.bedrock.blockID, 0); // tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 0, baseZ + 16, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 0, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 0, baseZ + 18, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 0, baseZ + 19, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 0, baseZ + 20, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 0, baseZ + 21, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 0, baseZ + 22, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 1, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 1, baseZ + 3, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 1, baseZ + 4, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 1, baseZ + 5, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 1, baseZ + 6, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 1, baseZ + 7, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 1, baseZ + 8, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 1, baseZ + 9, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 1, baseZ + 10, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 1, baseZ + 11, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 1, baseZ + 12, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 1, baseZ + 18, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 1, baseZ + 21, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 2, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 2, baseZ + 20, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 3, baseZ + 3, SokobanMod.BlockTarget.blockID, 2); // tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 3, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 3, baseZ + 5, SokobanMod.BlockTarget.blockID, 2); // tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 3, baseZ + 6, SokobanMod.BlockTarget.blockID, 2); // tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 3, baseZ + 7, SokobanMod.BlockTarget.blockID, 2); // tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 3, baseZ + 8, SokobanMod.BlockTarget.blockID, 2); // tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 3, baseZ + 9, SokobanMod.BlockTarget.blockID, 2); // tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 3, baseZ + 10, SokobanMod.BlockTarget.blockID, 2); // tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 3, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 3, baseZ + 12, SokobanMod.BlockTarget.blockID, 2); // tile.Target
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
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 3, baseZ + 18, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 3, baseZ + 19, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 4, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 4, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 5, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 5, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 6, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 6, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 7, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 7, baseZ + 14, SokobanMod.BlockVaporizingBlock.blockID, 0); // tile.Vaporizing
                                                                                                                               // Block
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 7, baseZ + 15, SokobanMod.BlockVaporizingBlock.blockID, 0); // tile.Vaporizing
                                                                                                                               // Block
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 7, baseZ + 16, SokobanMod.BlockVaporizingBlock.blockID, 0); // tile.Vaporizing
                                                                                                                               // Block
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 7, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 8, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 8, baseZ + 14, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Glass
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 8, baseZ + 15, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Glass
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 8, baseZ + 16, SokobanMod.BlockUnbreakableGlasses.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Glass
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 8, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
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
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 0, baseZ + 18, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 0, baseZ + 19, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 0, baseZ + 20, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 0, baseZ + 21, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 0, baseZ + 22, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 1, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 1, baseZ + 3, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 1, baseZ + 4, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 1, baseZ + 5, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 1, baseZ + 6, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 1, baseZ + 7, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 1, baseZ + 8, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 1, baseZ + 9, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 1, baseZ + 10, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 1, baseZ + 11, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 1, baseZ + 12, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 1, baseZ + 15, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 1, baseZ + 16, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 1, baseZ + 18, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 1, baseZ + 21, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 2, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 2, baseZ + 20, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 3, baseZ + 3, SokobanMod.BlockTarget.blockID, 2); // tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 3, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 3, baseZ + 5, SokobanMod.BlockTarget.blockID, 2); // tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 3, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 3, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 3, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 3, baseZ + 9, SokobanMod.BlockTarget.blockID, 2); // tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 3, baseZ + 10, SokobanMod.BlockTarget.blockID, 2); // tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 3, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 3, baseZ + 12, SokobanMod.BlockTarget.blockID, 2); // tile.Target
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
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 3, baseZ + 18, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 3, baseZ + 19, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
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
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 0, baseZ + 16, Block.bedrock.blockID, 0); // tile.bedrock
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 0, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 0, baseZ + 18, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 0, baseZ + 19, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 0, baseZ + 20, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 0, baseZ + 21, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 0, baseZ + 22, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 1, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 1, baseZ + 3, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 1, baseZ + 4, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 1, baseZ + 5, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 1, baseZ + 6, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 1, baseZ + 7, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 1, baseZ + 8, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 1, baseZ + 9, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 1, baseZ + 10, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 1, baseZ + 11, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 1, baseZ + 12, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 1, baseZ + 13, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 1, baseZ + 14, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 1, baseZ + 18, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 1, baseZ + 21, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 2, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 2, baseZ + 20, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 3, baseZ + 3, SokobanMod.BlockTarget.blockID, 2); // tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 3, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 3, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 3, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 3, baseZ + 7, SokobanMod.BlockTarget.blockID, 2); // tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 3, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 3, baseZ + 9, SokobanMod.BlockTarget.blockID, 2); // tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 3, baseZ + 10, SokobanMod.BlockTarget.blockID, 2); // tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 3, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 3, baseZ + 12, SokobanMod.BlockTarget.blockID, 2); // tile.Target
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
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 3, baseZ + 18, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 3, baseZ + 19, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
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
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 0, baseZ + 18, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 0, baseZ + 19, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 0, baseZ + 20, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 0, baseZ + 21, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 0, baseZ + 22, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 1, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 1, baseZ + 2, SokobanMod.BlockUnbreakableLamps.blockID, 14); // tile.Unbreakable
                                                                                                                                // Lamp
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 1, baseZ + 3, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 1, baseZ + 4, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 1, baseZ + 5, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 1, baseZ + 6, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 1, baseZ + 7, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 1, baseZ + 8, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 1, baseZ + 9, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 1, baseZ + 10, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 1, baseZ + 11, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 1, baseZ + 12, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 1, baseZ + 14, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 1, baseZ + 15, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 1, baseZ + 18, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 1, baseZ + 20, SokobanMod.BlockUnbreakableLamps.blockID, 14); // tile.Unbreakable
                                                                                                                                 // Lamp
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 1, baseZ + 21, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 2, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 2, baseZ + 20, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 3, baseZ + 3, SokobanMod.BlockTarget.blockID, 2); // tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 3, baseZ + 4, SokobanMod.BlockTarget.blockID, 2); // tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 3, baseZ + 5, SokobanMod.BlockTarget.blockID, 2); // tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 3, baseZ + 6, SokobanMod.BlockTarget.blockID, 2); // tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 3, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 3, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                // Solid
                                                                                                                                // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 3, baseZ + 9, SokobanMod.BlockTarget.blockID, 2); // tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 3, baseZ + 10, SokobanMod.BlockTarget.blockID, 2); // tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 3, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 3, baseZ + 12, SokobanMod.BlockTarget.blockID, 2); // tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 3, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 3, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 3, baseZ + 15, SokobanMod.BlockTarget.blockID, 2); // tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 3, baseZ + 16, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 3, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 3, baseZ + 18, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 3, baseZ + 19, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
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
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 0, baseZ + 18, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 0, baseZ + 19, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 0, baseZ + 20, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 0, baseZ + 21, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 0, baseZ + 22, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 1, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 1, baseZ + 3, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 1, baseZ + 4, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 1, baseZ + 5, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 1, baseZ + 6, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 1, baseZ + 7, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 1, baseZ + 8, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 1, baseZ + 9, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 1, baseZ + 10, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 1, baseZ + 11, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 1, baseZ + 12, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 1, baseZ + 14, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 1, baseZ + 18, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 1, baseZ + 21, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 2, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 2, baseZ + 20, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 3, baseZ + 3, SokobanMod.BlockTarget.blockID, 2); // tile.Target
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
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 3, baseZ + 8, SokobanMod.BlockTarget.blockID, 2); // tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 3, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 3, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 3, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 3, baseZ + 12, SokobanMod.BlockTarget.blockID, 2); // tile.Target
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
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 3, baseZ + 18, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 3, baseZ + 19, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
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
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 0, baseZ + 18, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 0, baseZ + 19, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 0, baseZ + 20, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 0, baseZ + 21, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 0, baseZ + 22, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 1, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 1, baseZ + 3, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 1, baseZ + 4, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 1, baseZ + 5, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 1, baseZ + 6, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 1, baseZ + 7, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 1, baseZ + 8, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 1, baseZ + 9, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 1, baseZ + 10, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 1, baseZ + 11, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 1, baseZ + 12, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 1, baseZ + 14, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 1, baseZ + 15, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 1, baseZ + 16, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 1, baseZ + 17, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 1, baseZ + 18, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 1, baseZ + 21, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 2, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 2, baseZ + 20, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 3, baseZ + 3, SokobanMod.BlockTarget.blockID, 2); // tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 3, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 3, baseZ + 5, SokobanMod.BlockTarget.blockID, 2); // tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 3, baseZ + 6, SokobanMod.BlockTarget.blockID, 2); // tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 3, baseZ + 7, SokobanMod.BlockTarget.blockID, 2); // tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 3, baseZ + 8, SokobanMod.BlockTarget.blockID, 2); // tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 3, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 3, baseZ + 10, SokobanMod.BlockTarget.blockID, 2); // tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 3, baseZ + 11, SokobanMod.BlockTarget.blockID, 2); // tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 3, baseZ + 12, SokobanMod.BlockTarget.blockID, 2); // tile.Target
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
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 3, baseZ + 18, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 3, baseZ + 19, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
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
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 0, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 0, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 0, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 0, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 0, baseZ + 16, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 0, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 0, baseZ + 18, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 0, baseZ + 19, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 0, baseZ + 20, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 0, baseZ + 21, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 0, baseZ + 22, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 1, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 1, baseZ + 3, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 1, baseZ + 4, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 1, baseZ + 5, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 1, baseZ + 6, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 1, baseZ + 7, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 1, baseZ + 8, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 1, baseZ + 9, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 1, baseZ + 10, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 1, baseZ + 11, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 1, baseZ + 12, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 1, baseZ + 21, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 2, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 2, baseZ + 20, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 3, baseZ + 3, SokobanMod.BlockTarget.blockID, 2); // tile.Target
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
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 3, baseZ + 8, SokobanMod.BlockTarget.blockID, 2); // tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 3, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 3, baseZ + 10, SokobanMod.BlockTarget.blockID, 2); // tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 3, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 3, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 3, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 3, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 3, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 3, baseZ + 16, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 3, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 3, baseZ + 18, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 3, baseZ + 19, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 0, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 0, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 0, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 0, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 0, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 0, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 0, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 0, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 0, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 0, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 0, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 0, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 0, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 0, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 0, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 0, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 0, baseZ + 16, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 0, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 0, baseZ + 18, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 0, baseZ + 19, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 0, baseZ + 20, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 0, baseZ + 21, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 0, baseZ + 22, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 1, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 1, baseZ + 3, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 1, baseZ + 4, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 1, baseZ + 5, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 1, baseZ + 6, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 1, baseZ + 7, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 1, baseZ + 8, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 1, baseZ + 9, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 1, baseZ + 10, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 1, baseZ + 11, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 1, baseZ + 12, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 1, baseZ + 21, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 2, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 2, baseZ + 16, SokobanMod.BlockUnbreakableLamps.blockID, 14); // tile.Unbreakable
                                                                                                                                  // Lamp
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 2, baseZ + 20, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 3, baseZ + 3, SokobanMod.BlockTarget.blockID, 2); // tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 3, baseZ + 4, SokobanMod.BlockTarget.blockID, 2); // tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 3, baseZ + 5, SokobanMod.BlockTarget.blockID, 2); // tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 3, baseZ + 6, SokobanMod.BlockTarget.blockID, 2); // tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 3, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 3, baseZ + 8, SokobanMod.BlockTarget.blockID, 2); // tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 3, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 3, baseZ + 10, SokobanMod.BlockTarget.blockID, 2); // tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 3, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 3, baseZ + 12, SokobanMod.BlockTarget.blockID, 2); // tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 3, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 3, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 3, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 3, baseZ + 16, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 3, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 3, baseZ + 18, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 3, baseZ + 19, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 0, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 0, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 0, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 0, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 0, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 0, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 0, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 0, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 0, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 0, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 0, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 0, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 0, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 0, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 0, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 0, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 0, baseZ + 16, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 0, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 0, baseZ + 18, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 0, baseZ + 19, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 0, baseZ + 20, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 0, baseZ + 21, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 0, baseZ + 22, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 1, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 1, baseZ + 3, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 1, baseZ + 4, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 1, baseZ + 5, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 1, baseZ + 6, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 1, baseZ + 7, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 1, baseZ + 8, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 1, baseZ + 9, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 1, baseZ + 10, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 1, baseZ + 11, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 1, baseZ + 12, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 1, baseZ + 21, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 2, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 2, baseZ + 20, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 3, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 3, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 3, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 3, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 3, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 3, baseZ + 8, SokobanMod.BlockTarget.blockID, 2); // tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 3, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 3, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 3, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 3, baseZ + 12, SokobanMod.BlockTarget.blockID, 2); // tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 3, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 3, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 3, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 3, baseZ + 16, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 3, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 3, baseZ + 18, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 3, baseZ + 19, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 0, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 0, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 0, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 0, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 0, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 0, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 0, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 0, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 0, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 0, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 0, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 0, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 0, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 0, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 0, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 0, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 0, baseZ + 16, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 0, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 0, baseZ + 18, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 0, baseZ + 19, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 0, baseZ + 20, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 0, baseZ + 21, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 0, baseZ + 22, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 1, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 1, baseZ + 4, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 1, baseZ + 5, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 1, baseZ + 6, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 1, baseZ + 7, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 1, baseZ + 8, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 1, baseZ + 9, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 1, baseZ + 10, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 1, baseZ + 11, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 1, baseZ + 12, Block.stone.blockID, 0); // tile.stone
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 1, baseZ + 21, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 2, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 2, baseZ + 20, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 3, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 3, baseZ + 4, SokobanMod.BlockTarget.blockID, 2); // tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 3, baseZ + 5, SokobanMod.BlockTarget.blockID, 2); // tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 3, baseZ + 6, SokobanMod.BlockTarget.blockID, 2); // tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 3, baseZ + 7, SokobanMod.BlockTarget.blockID, 2); // tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 3, baseZ + 8, SokobanMod.BlockTarget.blockID, 2); // tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 3, baseZ + 9, SokobanMod.BlockTarget.blockID, 2); // tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 3, baseZ + 10, SokobanMod.BlockTarget.blockID, 2); // tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 3, baseZ + 11, SokobanMod.BlockTarget.blockID, 2); // tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 3, baseZ + 12, SokobanMod.BlockTarget.blockID, 2); // tile.Target
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 3, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 3, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 3, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 3, baseZ + 16, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 3, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 3, baseZ + 18, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 3, baseZ + 19, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 0, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 0, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 0, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 0, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 0, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 0, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 0, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 0, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 0, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 0, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 0, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 0, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 0, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 0, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 0, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 0, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 0, baseZ + 16, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 0, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 0, baseZ + 18, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 0, baseZ + 19, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 0, baseZ + 20, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 0, baseZ + 21, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 0, baseZ + 22, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 1, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 1, baseZ + 2, SokobanMod.BlockUnbreakableLamps.blockID, 14); // tile.Unbreakable
                                                                                                                                 // Lamp
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 1, baseZ + 11, SokobanMod.BlockUnbreakableLamps.blockID, 14); // tile.Unbreakable
                                                                                                                                  // Lamp
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 1, baseZ + 20, SokobanMod.BlockUnbreakableLamps.blockID, 14); // tile.Unbreakable
                                                                                                                                  // Lamp
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 1, baseZ + 21, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 2, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 2, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 2, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 2, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 2, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 2, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 2, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 2, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 2, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 2, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 2, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 2, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 2, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 2, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 2, baseZ + 16, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 2, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 2, baseZ + 18, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 2, baseZ + 19, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 16, baseY + 2, baseZ + 20, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 0, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 0, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 0, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 0, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 0, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 0, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 0, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 0, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 0, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 0, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 0, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 0, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 0, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 0, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 0, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 0, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 0, baseZ + 16, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 0, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 0, baseZ + 18, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 0, baseZ + 19, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 0, baseZ + 20, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 0, baseZ + 21, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 0, baseZ + 22, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 1, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 1, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 1, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 1, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 1, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 1, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 1, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 1, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 1, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 1, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 1, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 1, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 1, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 1, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 1, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 1, baseZ + 16, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 1, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 1, baseZ + 18, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 1, baseZ + 19, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 1, baseZ + 20, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 17, baseY + 1, baseZ + 21, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 18, baseY + 0, baseZ + 0, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 18, baseY + 0, baseZ + 1, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 18, baseY + 0, baseZ + 2, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 18, baseY + 0, baseZ + 3, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 18, baseY + 0, baseZ + 4, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 18, baseY + 0, baseZ + 5, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 18, baseY + 0, baseZ + 6, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 18, baseY + 0, baseZ + 7, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 18, baseY + 0, baseZ + 8, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 18, baseY + 0, baseZ + 9, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                 // Solid
                                                                                                                                 // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 18, baseY + 0, baseZ + 10, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 18, baseY + 0, baseZ + 11, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 18, baseY + 0, baseZ + 12, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 18, baseY + 0, baseZ + 13, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 18, baseY + 0, baseZ + 14, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 18, baseY + 0, baseZ + 15, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 18, baseY + 0, baseZ + 16, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 18, baseY + 0, baseZ + 17, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 18, baseY + 0, baseZ + 18, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 18, baseY + 0, baseZ + 19, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 18, baseY + 0, baseZ + 20, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 18, baseY + 0, baseZ + 21, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks
        LevelGenBase.setBlockAndMetadata(world, baseX + 18, baseY + 0, baseZ + 22, SokobanMod.BlockUnbreakableSolids.blockID, 0); // tile.Unbreakable
                                                                                                                                  // Solid
                                                                                                                                  // Blocks

        // Instable blocks (like torches, levers, signs)
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 2, baseZ + 4, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 2, baseZ + 5, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 2, baseZ + 6, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 2, baseZ + 7, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 2, baseZ + 8, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 2, baseZ + 9, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 2, baseZ + 10, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 2, baseZ + 11, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 4, baseY + 2, baseZ + 12, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 2, baseZ + 3, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 2, baseZ + 4, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 2, baseZ + 5, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 2, baseZ + 6, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 2, baseZ + 7, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 2, baseZ + 8, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 2, baseZ + 9, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 2, baseZ + 10, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 2, baseZ + 11, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 2, baseZ + 12, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 5, baseY + 2, baseZ + 15, Block.torchRedstoneIdle.blockID, 5); // tile.notGate
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 1, baseZ + 15, Block.redstoneWire.blockID, 12); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 2, baseZ + 3, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 2, baseZ + 4, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 2, baseZ + 5, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 2, baseZ + 6, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 2, baseZ + 7, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 2, baseZ + 8, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 2, baseZ + 9, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 2, baseZ + 10, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 2, baseZ + 11, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 2, baseZ + 12, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 6, baseY + 2, baseZ + 18, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 2, baseZ + 3, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 2, baseZ + 4, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 2, baseZ + 5, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 2, baseZ + 6, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 2, baseZ + 7, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 2, baseZ + 8, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 2, baseZ + 9, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 2, baseZ + 10, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 2, baseZ + 11, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 2, baseZ + 12, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 2, baseZ + 15, Block.redstoneWire.blockID, 13); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 2, baseZ + 16, Block.redstoneWire.blockID, 14); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 2, baseZ + 18, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 7, baseY + 5, baseZ + 17, Block.signWall.blockID, 5); // tile.sign
        if(world.getBlockTileEntity(baseX + 7, baseY + 5, baseZ + 17) instanceof TileEntitySign) {
            TileEntitySign tes = (TileEntitySign)world.getBlockTileEntity(baseX + 7, baseY + 5, baseZ + 17);
            tes.signText[0] = "Easy Level";
            tes.signText[1] = "#1";
            tes.signText[2] = "Vaporizing Loot";
            tes.signText[3] = "SSP";
        }
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 1, baseZ + 16, Block.redstoneWire.blockID, 15); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 2, baseZ + 3, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 2, baseZ + 4, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 2, baseZ + 5, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 2, baseZ + 6, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 2, baseZ + 7, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 2, baseZ + 8, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 2, baseZ + 9, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 2, baseZ + 10, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 2, baseZ + 11, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 2, baseZ + 12, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 2, baseZ + 13, Block.redstoneRepeaterIdle.blockID, 2); // tile.diode
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 2, baseZ + 14, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 8, baseY + 2, baseZ + 18, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 1, baseZ + 16, Block.torchRedstoneActive.blockID, 3); // tile.notGate
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 2, baseZ + 3, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 2, baseZ + 4, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 2, baseZ + 5, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 2, baseZ + 6, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 2, baseZ + 7, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 2, baseZ + 8, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 2, baseZ + 9, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 2, baseZ + 10, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 2, baseZ + 11, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 2, baseZ + 12, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 2, baseZ + 14, Block.redstoneRepeaterIdle.blockID, 1); // tile.diode
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 2, baseZ + 15, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 9, baseY + 2, baseZ + 18, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 2, baseZ + 3, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 2, baseZ + 4, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 2, baseZ + 5, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 2, baseZ + 6, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 2, baseZ + 7, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 2, baseZ + 8, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 2, baseZ + 9, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 2, baseZ + 10, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 2, baseZ + 11, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 2, baseZ + 12, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 2, baseZ + 14, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 10, baseY + 2, baseZ + 18, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 2, baseZ + 3, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 2, baseZ + 4, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 2, baseZ + 5, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 2, baseZ + 6, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 2, baseZ + 7, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 2, baseZ + 8, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 2, baseZ + 9, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 2, baseZ + 10, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 2, baseZ + 11, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 2, baseZ + 12, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 2, baseZ + 14, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 2, baseZ + 15, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 2, baseZ + 16, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 2, baseZ + 17, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 11, baseY + 2, baseZ + 18, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 2, baseZ + 3, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 2, baseZ + 4, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 2, baseZ + 5, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 2, baseZ + 6, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 2, baseZ + 7, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 2, baseZ + 8, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 2, baseZ + 9, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 2, baseZ + 10, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 2, baseZ + 11, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 12, baseY + 2, baseZ + 12, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 2, baseZ + 3, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 2, baseZ + 4, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 2, baseZ + 5, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 2, baseZ + 6, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 2, baseZ + 7, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 2, baseZ + 8, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 2, baseZ + 9, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 2, baseZ + 10, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 2, baseZ + 11, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 13, baseY + 2, baseZ + 12, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 2, baseZ + 3, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 2, baseZ + 4, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 2, baseZ + 5, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 2, baseZ + 6, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 2, baseZ + 7, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 2, baseZ + 8, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 2, baseZ + 9, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 2, baseZ + 10, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 2, baseZ + 11, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 14, baseY + 2, baseZ + 12, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 2, baseZ + 4, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 2, baseZ + 5, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 2, baseZ + 6, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 2, baseZ + 7, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 2, baseZ + 8, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 2, baseZ + 9, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 2, baseZ + 10, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 2, baseZ + 11, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 2, baseZ + 12, Block.redstoneWire.blockID, 0); // tile.redstoneDust
        LevelGenBase.setBlockAndMetadata(world, baseX + 15, baseY + 4, baseZ + 3, SokobanMod.BlockTargetBox.blockID, 0); // tile.Target
                                                                                                                         // Box
        if(world.getBlockTileEntity(baseX + 15, baseY + 4, baseZ + 3) instanceof TileEntityTargetBox) {
            TileEntityTargetBox teTb = (TileEntityTargetBox)world.getBlockTileEntity(baseX + 15, baseY + 4, baseZ + 3);
            teTb.setLevelBounds(baseX, baseY, baseZ, baseX + 18, baseY + 8, baseZ + 22);
            teTb.levelDropped = getLevelNumber();
        }
        return true;
    }
}