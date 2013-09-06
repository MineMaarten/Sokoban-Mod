package sokobanMod.common;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
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

public class BlockVaporizingBlock extends Block{

    public BlockVaporizingBlock(int par1, Material par3Material){
        super(par1, par3Material);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister){
        blockIcon = par1IconRegister.registerIcon("sokobanMod:BlockRedstoneRemover");
    }

    @Override
    public void onNeighborBlockChange(World world, int x, int y, int z, int blockID){
        if(blockID != 0 && world.isBlockIndirectlyGettingPowered(x, y, z) && world.getIndirectPowerLevelTo(x, y - 1, z, 0) > 0) {
            vaporateNeigbours(world, x, y, z);
        }
    }

    @Override
    public void updateTick(World world, int x, int y, int z, Random rand){
        vaporateNeigbours(world, x, y, z);
    }

    private void vaporateNeigbours(World world, int x, int y, int z){
        int neighbourX = x;
        int neighbourY = y;
        int neighbourZ = z;

        world.setBlock(x, y, z, 0);
        world.playSoundEffect(x, y, z, "sokobanmod:vaporize", 0.2F, 1.0F);

        spawnParticle("explode", x + 0.5D, y + 0.5D, z + 0.5D, 0.0D, 0.0D, 0.0D);
        for(int neighbour = 0; neighbour <= 5; neighbour++) {
            switch(neighbour){
                case 0:
                    neighbourX = x - 1;
                    break;
                case 1:
                    neighbourX = x + 1;
                    break;
                case 2:
                    neighbourX = x;
                    neighbourY = y - 1;
                    break;
                case 3:
                    neighbourY = y + 1;
                    break;
                case 4:
                    neighbourY = y;
                    neighbourZ = z - 1;
                    break;
                case 5:
                    neighbourZ = z + 1;
            }
            world.scheduleBlockUpdate(neighbourX, neighbourY, neighbourZ, blockID, 2);
        }
    }

    private void spawnParticle(String string, double g, double h, double i, double d, double e, double f){
        PacketDispatcher.sendPacketToAllPlayers(PacketHandlerSokoban.spawnParticle(string, g, h, i, d, e, f));
    }

}
