package sokobanMod.common;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

/**
 * Sokoban Mod
 * @author MineMaarten
 * www.minemaarten.com
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */

public class BlockLootGenerator extends BlockContainer{

    public BlockLootGenerator(int par1, Material par3Material){
        super(par1, par3Material);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister){
        blockIcon = par1IconRegister.registerIcon("sokobanMod:BlockLootGenerator");
    }

    @Override
    public TileEntity createNewTileEntity(World par1World){
        return new TileEntityLootGenerator();
    }

    @Override
    public void onNeighborBlockChange(World world, int x, int y, int z, int blockID){
        if(blockID != 0 && world.isBlockIndirectlyGettingPowered(x, y, z) && getBottomInputStrength(world, x, y, z) > 0) {
            TileEntity te = world.getBlockTileEntity(x, y, z);
            world.setBlock(x, y, z, 0);
            if(te != null && te instanceof TileEntityLootGenerator) {
                TileEntityLootGenerator teLg = (TileEntityLootGenerator)te;
                teLg.giveLoot(world);
            }
        }
    }

    protected int getBottomInputStrength(World world, int x, int y, int z){
        return world.getIndirectPowerLevelTo(x, y - 1, z, 0);
    }

    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float par7, float par8, float par9){
        ItemStack playerStack = player.inventory.getCurrentItem();
        if(playerStack != null) {// if the player currently is holding something
            TileEntity te = world.getBlockTileEntity(x, y, z);
            if(te != null && te instanceof TileEntityLootGenerator) {
                TileEntityLootGenerator teLg = (TileEntityLootGenerator)te;
                teLg.addLoot(playerStack.copy());
            }
            playerStack.stackSize = 0; // remove the stack.
            return true;
        }
        return false;
    }

}
