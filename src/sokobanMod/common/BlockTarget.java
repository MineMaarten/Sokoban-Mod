package sokobanMod.common;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

/**
 * Sokoban Mod
 * @author MineMaarten
 * www.minemaarten.com
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */

public class BlockTarget extends Block{
    @SideOnly(Side.CLIENT)
    private IIcon[] texture;

    public BlockTarget(Material par3Material){
        super(par3Material);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister par1IconRegister){
        texture = new IIcon[2];
        texture[0] = par1IconRegister.registerIcon("sokobanMod:BlockTarget0");
        texture[1] = par1IconRegister.registerIcon("sokobanMod:BlockTarget1");
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(Item par1, CreativeTabs par2CreativeTabs, List par3List){
        par3List.add(new ItemStack(SokobanMod.BlockTarget, 1, 0));
        par3List.add(new ItemStack(SokobanMod.BlockTarget, 1, 2));
    }

    public int getMetadata(int meta){
        return meta;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta){
        return texture[meta % 2]; // protection against out of bounds exception
    }

    @Override
    public void onNeighborBlockChange(World world, int x, int y, int z, Block block){
        boolean shouldPowerRedstone = true;
        if(world.getBlockMetadata(x, y, z) < 2) {
            ArrayList<int[]> connectedTargets = new ArrayList<int[]>();
            connectedTargets = getAccessoryTiles(connectedTargets, world, x, y, z);
            for(int i = 0; i < connectedTargets.size(); i++) {
                int[] coord = connectedTargets.get(i);
                if(!isConnectedToBox(world, coord[0], coord[1], coord[2])) {
                    shouldPowerRedstone = false;
                    break;
                }
            }
        } else {
            shouldPowerRedstone = isConnectedToBox(world, x, y, z);
        }

        if(world.getBlockMetadata(x, y, z) % 2 == 0 && !shouldPowerRedstone || world.getBlockMetadata(x, y, z) % 2 == 1 && shouldPowerRedstone) return;
        if(world.getBlockMetadata(x, y, z) % 2 == 0 && shouldPowerRedstone) {
            world.playSoundEffect(x, y, z, "sokobanmod:lockSound", 1.0F, 1.0F);
        } else if(world.getBlockMetadata(x, y, z) % 2 == 1 && !shouldPowerRedstone) {
            world.playSoundEffect(x, y, z, "sokobanmod:lockSound", 1.0F, 0.8F);
        }
        if(world.getBlockMetadata(x, y, z) < 2) {
            world.setBlockMetadataWithNotify(x, y, z, shouldPowerRedstone ? 1 : 0, 3);
        } else {
            world.setBlockMetadataWithNotify(x, y, z, shouldPowerRedstone ? 3 : 2, 3);
        }
        updateNeighbours(world, x, y, z);
    }

    public boolean isConnectedToBox(World world, int x, int y, int z){
        if(world.getBlock(x + 1, y, z) == SokobanMod.BlockTargetBox) return true;
        if(world.getBlock(x - 1, y, z) == SokobanMod.BlockTargetBox) return true;
        if(world.getBlock(x, y + 1, z) == SokobanMod.BlockTargetBox) return true;
        if(world.getBlock(x, y - 1, z) == SokobanMod.BlockTargetBox) return true;
        if(world.getBlock(x, y, z + 1) == SokobanMod.BlockTargetBox) return true;
        if(world.getBlock(x, y, z - 1) == SokobanMod.BlockTargetBox) return true;
        return false;
    }

    public ArrayList<int[]> getAccessoryTiles(ArrayList<int[]> list, World world, int x, int y, int z){
        for(int i = x - 1; i <= x + 1; i++) {
            if(world.getBlock(i, y, z) == blockIcon && world.getBlockMetadata(i, y, z) < 2 && !listContainsCoord(list, i, y, z)) {
                int[] coord = {i, y, z};
                list.add(coord);
                list = getAccessoryTiles(list, world, i, y, z);
            }
        }
        for(int i = z - 1; i <= z + 1; i++) {
            if(world.getBlock(x, y, i) == blockIcon && world.getBlockMetadata(x, y, i) < 2 && !listContainsCoord(list, x, y, i)) {
                int[] coord = {x, y, i};
                list.add(coord);
                list = getAccessoryTiles(list, world, x, y, i);
            }
        }
        for(int i = y - 1; i <= y + 1; i++) {
            if(world.getBlock(x, i, z) == blockIcon && world.getBlockMetadata(x, i, z) < 2 && !listContainsCoord(list, x, i, z)) {
                int[] coord = {x, i, z};
                list.add(coord);
                list = getAccessoryTiles(list, world, x, i, z);
            }
        }
        return list;
    }

    private boolean listContainsCoord(ArrayList<int[]> list, int x, int y, int z){
        for(int i = 0; i < list.size(); i++) {
            int[] coord = list.get(i);
            if(coord[0] == x && coord[1] == y && coord[2] == z) return true;
        }
        return false;
    }

    /**
     * Returns true if the block is emitting indirect/weak redstone power on the
     * specified side. If isBlockNormalCube returns true, standard redstone
     * propagation rules will apply instead and this will not be called. Args:
     * World, X, Y, Z, side. Note that the side is reversed - eg it is 1 (up)
     * when checking the bottom of the block.
     */
    @Override
    public int isProvidingWeakPower(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5){
        int var6 = par1IBlockAccess.getBlockMetadata(par2, par3, par4);
        return var6 % 2 == 1 ? 15 : 0;
    }

    /**
     * Returns true if the block is emitting direct/strong redstone power on the
     * specified side. Args: World, X, Y, Z, side. Note that the side is
     * reversed - eg it is 1 (up) when checking the bottom of the block.
     */

    @Override
    public int isProvidingStrongPower(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5){
        return 0;
    }

    /**
     * Can this block provide power. Only wire currently seems to have this
     * change based on its state.
     */
    @Override
    public boolean canProvidePower(){
        return true;
    }

    private void updateNeighbours(World par1World, int par2, int par3, int par4){
        par1World.notifyBlocksOfNeighborChange(par2, par3 - 1, par4, this);
        par1World.notifyBlocksOfNeighborChange(par2, par3 + 1, par4, this);
        par1World.notifyBlocksOfNeighborChange(par2 - 1, par3, par4, this);
        par1World.notifyBlocksOfNeighborChange(par2 + 1, par3, par4, this);
        par1World.notifyBlocksOfNeighborChange(par2, par3, par4 - 1, this);
        par1World.notifyBlocksOfNeighborChange(par2, par3, par4 + 1, this);
    }

    @Override
    public int damageDropped(int meta){
        return meta;
    }

}
