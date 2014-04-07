package sokobanMod.common;

/*
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.INetworkManager;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.Packet250CustomPayload;
import net.minecraft.world.World;

import com.google.common.io.ByteArrayDataInput;
import com.google.common.io.ByteStreams;

import cpw.mods.fml.common.network.IPacketHandler;
import cpw.mods.fml.common.network.Player;
*/

/**
 * Sokoban Mod
 * @author MineMaarten
 * www.minemaarten.com
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */

/**
 * @deprecated
 */

/*
public class PacketHandlerSokoban implements IPacketHandler{

    private static final int spawnParticleID = 1;
    private static final int giveAchievementID = 3;

    @Override
    public void onPacketData(INetworkManager network, Packet250CustomPayload packet, Player player){
        ByteArrayDataInput dat = ByteStreams.newDataInput(packet.data);
        World world = SokobanMod.proxy.getClientWorld();
        int packetID = dat.readInt();
        switch(packetID){
            case spawnParticleID:
                String particleName = dat.readUTF();
                double spawnX = dat.readDouble();
                double spawnY = dat.readDouble();
                double spawnZ = dat.readDouble();
                double spawnMotX = dat.readDouble();
                double spawnMotY = dat.readDouble();
                double spawnMotZ = dat.readDouble();
                world.spawnParticle(particleName, spawnX, spawnY, spawnZ, spawnMotX, spawnMotY, spawnMotZ);
                break;
            case giveAchievementID:
                int achieve = dat.readInt();
                EntityPlayer entityPlayer = (EntityPlayer)player;
                entityPlayer.addStat(AchievementHandler.getAchieveFromLevel(achieve), 1);
                break;
        }
    }

    public static Packet spawnParticle(String particleName, double spawnX, double spawnY, double spawnZ, double spawnMotX, double spawnMotY, double spawnMotZ){
        // System.out.println("particle effect packet made");
        ByteArrayOutputStream bos = new ByteArrayOutputStream(140);
        DataOutputStream dos = new DataOutputStream(bos);
        try {
            dos.writeInt(spawnParticleID);
            dos.writeUTF(particleName);
            dos.writeDouble(spawnX);
            dos.writeDouble(spawnY);
            dos.writeDouble(spawnZ);
            dos.writeDouble(spawnMotX);
            dos.writeDouble(spawnMotY);
            dos.writeDouble(spawnMotZ);
        } catch(IOException e) {}
        Packet250CustomPayload pkt = new Packet250CustomPayload();
        pkt.channel = "sokoban";
        pkt.data = bos.toByteArray();
        pkt.length = bos.size();
        pkt.isChunkDataPacket = true;

        return pkt;
    }

    public static Packet giveLevelAchievement(int levelNumber){
        // System.out.println("particle effect packet made");
        ByteArrayOutputStream bos = new ByteArrayOutputStream(140);
        DataOutputStream dos = new DataOutputStream(bos);
        try {
            dos.writeInt(giveAchievementID);
            dos.writeInt(levelNumber);
        } catch(IOException e) {}
        Packet250CustomPayload pkt = new Packet250CustomPayload();
        pkt.channel = "sokoban";
        pkt.data = bos.toByteArray();
        pkt.length = bos.size();
        pkt.isChunkDataPacket = true;

        return pkt;
    }
}
*/
