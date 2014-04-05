package sokobanMod.common.network;

import sokobanMod.common.AchievementHandler;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;

public class PacketGiveLevelAchievement extends AbstractPacket
{
	private int levelNumber;
	
	public PacketGiveLevelAchievement() {}
	
	public PacketGiveLevelAchievement(int levelNumber)
	{
		this.levelNumber = levelNumber;
	}
	@Override
	public void encodeInto(ChannelHandlerContext ctx, ByteBuf buffer)
	{
		buffer.writeInt(levelNumber);
	}

	@Override
	public void decodeInto(ChannelHandlerContext ctx, ByteBuf buffer)
	{
		levelNumber = buffer.readInt();
	}

	@Override
	public void handleClientSide(EntityPlayer player)
	{
		player.addStat(AchievementHandler.getAchieveFromLevel(levelNumber), 1);
	}

	@Override
	public void handleServerSide(EntityPlayer player)
	{
		
	}
	
}
