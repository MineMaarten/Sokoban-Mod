package sokobanMod.common.network;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.world.World;
import sokobanMod.common.Constants;
import cpw.mods.fml.common.network.NetworkRegistry;

/**
* MineChess
* @author MineMaarten
* www.minemaarten.com
* @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
*/

//MineMaarten Question: What is this class for? I do not see you using it...

public abstract class LocationIntPacket extends AbstractPacket{

    protected int x, y, z;

    public LocationIntPacket(){}

    public LocationIntPacket(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public void encodeInto(ChannelHandlerContext ctx, ByteBuf buffer){
        buffer.writeInt(x);
        buffer.writeInt(y);
        buffer.writeInt(z);
    }

    @Override
    public void decodeInto(ChannelHandlerContext ctx, ByteBuf buffer){
        x = buffer.readInt();
        y = buffer.readInt();
        z = buffer.readInt();
    }

    public NetworkRegistry.TargetPoint getTargetPoint(World world){
        return getTargetPoint(world, Constants.PACKET_UPDATE_DISTANCE);
    }

    public NetworkRegistry.TargetPoint getTargetPoint(World world, double updateDistance){
        return new NetworkRegistry.TargetPoint(world.provider.dimensionId, x, y, z, updateDistance);
    }

}