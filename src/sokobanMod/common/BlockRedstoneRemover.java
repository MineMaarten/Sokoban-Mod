package sokobanMod.common;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.PacketDispatcher;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

/**
 * Sokoban Mod
 * @author MineMaarten
 * www.minemaarten.com
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */

public class BlockRedstoneRemover extends Block{
    @SideOnly(Side.CLIENT)
    private Icon[] texture;

    public BlockRedstoneRemover(int par1, Material par3Material){
        super(par1, par3Material);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void registerIcons(IconRegister par1IconRegister){
        texture = new Icon[2];
        texture[0] = par1IconRegister.registerIcon("sokobanMod:BlockRedstoneRemover");
        texture[1] = par1IconRegister.registerIcon("sokobanMod:BlockConcrete");
    }

    @SideOnly(Side.CLIENT)
    @Override
    public Icon getIcon(int side, int meta){
        if(meta == side && side >= 2 && meta >= 2) return texture[0];
        if(meta != side && side < 2 && meta < 2) return texture[0];
        return texture[1]; // on the other 5 sides display the concrete texture.
    }

    @Override
    public void onBlockPlacedBy(World par1World, int par2, int par3, int par4, EntityLivingBase par5EntityLiving, ItemStack iStack){
        int var6 = determineOrientation(par1World, par2, par3, par4, (EntityPlayer)par5EntityLiving);
        par1World.setBlockMetadataWithNotify(par2, par3, par4, var6, 3);
    }

    public static int determineOrientation(World par0World, int par1, int par2, int par3, EntityPlayer par4EntityPlayer){
        if(MathHelper.abs((float)par4EntityPlayer.posX - par1) < 2.0F && MathHelper.abs((float)par4EntityPlayer.posZ - par3) < 2.0F) {
            double var5 = par4EntityPlayer.posY + 1.82D - par4EntityPlayer.yOffset;
            if(var5 - par2 > 2.0D) {
                return 0;
            }
            if(par2 - var5 > 0.0D) {
                return 1;
            }
        }
        int var7 = MathHelper.floor_double(par4EntityPlayer.rotationYaw * 4.0F / 360.0F + 0.5D) & 3;
        return var7 == 0 ? 2 : var7 == 1 ? 5 : var7 == 2 ? 3 : var7 == 3 ? 4 : 0;
    }

    @Override
    public void onNeighborBlockChange(World world, int x, int y, int z, int blockID){
        if(blockID != 0 && world.isBlockIndirectlyGettingPowered(x, y, z)) {
            int meta = world.getBlockMetadata(x, y, z);
            switch(meta){
                case 0:
                    y++;
                    break;
                case 1:
                    y--;
                    break;
                case 2:
                    z--;
                    break;
                case 3:
                    z++;
                    break;
                case 4:
                    x--;
                    break;
                case 5:
                    x++;
                    break;
            }

            if(world.getBlockId(x, y, z) == SokobanMod.BlockTargetBox.blockID) return;
            world.setBlock(x, y, z, 0);
            world.playSoundEffect(x, y, z, "sokobanmod:air", 0.2F, 1.0F);
            Random rand = new Random();
            double spreading = 0.5D;
            for(int i = 0; i < 10; i++) {
                spawnParticle("explode", x + 0.5D, y + 0.5D, z + 0.5D, (rand.nextDouble() - 0.5D) * spreading, (rand.nextDouble() - 0.5D) * spreading, (rand.nextDouble() - 0.5D) * spreading);
            }
        }
    }

    private void spawnParticle(String string, double g, double h, double i, double d, double e, double f){
        PacketDispatcher.sendPacketToAllPlayers(PacketHandlerSokoban.spawnParticle(string, g, h, i, d, e, f));
    }

}
