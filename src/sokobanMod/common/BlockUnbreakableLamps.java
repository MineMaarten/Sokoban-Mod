package sokobanMod.common;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

/**
 * Sokoban Mod
 * @author MineMaarten
 * www.minemaarten.com
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */

public class BlockUnbreakableLamps extends Block{
    @SideOnly(Side.CLIENT)
    private Icon[] texture;

    public BlockUnbreakableLamps(int par1, Material par3Material){
        super(par1, par3Material);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister){
        texture = new Icon[16];
        for(int i = 0; i < 16; i++)
            texture[i] = par1IconRegister.registerIcon("sokobanMod:BlockConcreteLamp" + i);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(int par1, CreativeTabs par2CreativeTabs, List par3List){
        for(int var4 = 0; var4 < 16; ++var4) {
            par3List.add(new ItemStack(blockID, 1, var4));
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public Icon getIcon(int side, int meta){
        return texture[meta];
    }

    @Override
    public int damageDropped(int meta){
        return meta;
    }

}
