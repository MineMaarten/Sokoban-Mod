package sokobanMod.common;

import java.util.Random;

import net.minecraft.block.BlockFalling;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

/**
 * Sokoban Mod
 * @author MineMaarten
 * www.minemaarten.com
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */

public class BlockTargetBox extends BlockFalling implements ITileEntityProvider{

    // public static boolean fallInstantly = false;

	@SideOnly(Side.CLIENT)
	protected IIcon blockIcon;
	
    public BlockTargetBox(Material material){
        super(material);
        setHardness(0.0F);
        setBlockTextureName("sokobanMod:BlockTargetBox");
    }

    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float par7, float par8, float par9){
        int targetX = x;
        int targetY = y;
        int targetZ = z;
        switch(side){
            case 0:
                return false;// we can't move the box up
            case 1:
                return false;// or down.
            case 2:
                targetZ++;
                break;
            case 3:
                targetZ--;
                break;
            case 4:
                targetX++;
                break;
            case 5:
                targetX--;
        }
        if(world.isAirBlock(targetX, targetY, targetZ) && !world.isRemote) {
            world.playSoundEffect(x, y, z, "sokobanmod:movingBox", 1.0F, 1.0F);
            TileEntity TE = world.getTileEntity(x, y, z);
            if(TE instanceof TileEntityTargetBox) {
                TileEntityTargetBox tbTE = (TileEntityTargetBox)TE;
                EntityTargetBox movingBox = new EntityTargetBox(world, x + 0.5D, y + 0.5D, z + 0.5D, side, tbTE.minX, tbTE.minY, tbTE.minZ, tbTE.maxX, tbTE.maxY, tbTE.maxZ, tbTE.levelDropped);
                world.spawnEntityInWorld(movingBox);
            }
            world.setBlock(x, y, z, Blocks.air);
            return true;
        }
        return false;
    }

    // Forge function
    @Override
    public boolean removedByPlayer(World world, EntityPlayer player, int x, int y, int z){
        Random rand = new Random();
        TileEntity TE = world.getTileEntity(x, y, z);
        if(TE instanceof TileEntityTargetBox) {
            TileEntityTargetBox boxTE = (TileEntityTargetBox)TE;

            //only drop a level generator when the level isn't solved yet (which is the case when there's no loot generator left.
            boolean lootGeneratorFound = SokobanUtils.removeLevel(world, boxTE.minX, boxTE.minY, boxTE.minZ, boxTE.maxX, boxTE.maxY, boxTE.maxZ, rand);
            if(lootGeneratorFound) dropBlockAsItem(world, x, y, z, new ItemStack(SokobanMod.ItemLevelGeneratorTutorial, 1, boxTE.levelDropped));
        }
        return super.removedByPlayer(world, player, x, y, z);
    }

    @Override
    public int quantityDropped(Random rand){
        return 0;
    }

    @Override
    public TileEntity createNewTileEntity(World var1, int var2){
        return new TileEntityTargetBox();
    }

    // SAND CODE removed and now implements ITileEntityProvider
}
