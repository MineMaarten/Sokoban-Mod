package sokobanMod.common;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;
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
        world.setBlock(x, y, z, Blocks.air);
        world.playSoundEffect(x, y, z, "sokobanmod:vaporize", 0.2F, 1.0F);
        spawnParticle("explode", x + 0.5D, y + 0.5D, z + 0.5D, 0.0D, 0.0D, 0.0D);
        for(ForgeDirection dir : ForgeDirection.VALID_DIRECTIONS) {
            world.scheduleBlockUpdate(x + dir.offsetX, y + dir.offsetY, z + dir.offsetZ, this, 2);
        }
    }

    private void spawnParticle(String string, double g, double h, double i, double d, double e, double f){
        SokobanMod.packetPipeline.sendToAll(new PacketSpawnParticle(string, g, h, i, d, e, f));
    }

}
