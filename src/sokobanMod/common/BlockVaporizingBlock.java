package sokobanMod.common;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import sokobanMod.common.network.PacketPlaySound;
import sokobanMod.common.network.PacketSpawnParticle;

/**
 * Sokoban Mod
 * @author MineMaarten
 * www.minemaarten.com
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */

public class BlockVaporizingBlock extends Block{

    public BlockVaporizingBlock(Material par3Material){
        super(par3Material);
        setBlockTextureName(Constants.MOD_ID + ":" + "BlockRedstoneRemover");
    }

    @Override
    public void onNeighborBlockChange(World world, int x, int y, int z, Block block){
        if(block != Blocks.air && world.isBlockIndirectlyGettingPowered(x, y, z) && world.getIndirectPowerLevelTo(x, y - 1, z, 0) > 0) {
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

        world.setBlock(x, y, z, Blocks.air);
        // TODO (I am getting an error here telling me that "world" is not a valid TargetPoint)
        // SokobanMod.packetPipeline.sendToAllAround(new PacketPlaySound("sokobanmod:vaporize", x, y, z, 0.2F, 1.0F, true), world);
        
        /**
         * @deprecated
         */
        // world.playSoundEffect(x, y, z, "sokobanmod:vaporize", 0.2F, 1.0F);

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
            // TODO (this might be incorrect)
            world.scheduleBlockUpdate(neighbourX, neighbourY, neighbourZ, world.getBlock(x, y, z), 2);
        }
    }

    private void spawnParticle(String string, double g, double h, double i, double d, double e, double f){
    	SokobanMod.packetPipeline.sendToAll(new PacketSpawnParticle(string, g, h, i, d, e, f));
    }

}
