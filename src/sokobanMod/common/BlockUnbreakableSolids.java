package sokobanMod.common;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

/**
 * Sokoban Mod
 * @author MineMaarten
 * www.minemaarten.com
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */

public class BlockUnbreakableSolids extends Block{
    @SideOnly(Side.CLIENT)
    private IIcon[] texture;

    public BlockUnbreakableSolids(Material par3Material){
        super(par3Material);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister par1IconRegister){
        texture = new IIcon[1];
        for(int i = 0; i < 1; i++)
            //room for expansion.
            texture[i] = par1IconRegister.registerIcon("sokobanMod:BlockConcrete");
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(Item par1, CreativeTabs par2CreativeTabs, List par3List){
        for(int var4 = 0; var4 < 1; ++var4) {
            par3List.add(new ItemStack(SokobanMod.BlockUnbreakableSolids, 1, var4));
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta){
        return texture[meta < 1 ? meta : 0];
    }

    @Override
    public int damageDropped(int meta){
        return meta;
    }

}
