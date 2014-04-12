package sokobanMod.common;

import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.world.World;
import sokobanMod.common.network.PacketGiveLevelAchievement;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

/**
 * Sokoban Mod
 * @author MineMaarten
 * www.minemaarten.com
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */

public class EntityAchievementOrb extends EntityXPOrb{

    public EntityAchievementOrb(World par1World, double x, double y, double z, int achievementNumber){
        super(par1World, x, y, z, achievementNumber);
    }

    public EntityAchievementOrb(World par1World){
        super(par1World);
    }

    @Override
    public void onCollideWithPlayer(EntityPlayer player){
        if(!worldObj.isRemote) {
            // player.addStat(AchievementHandler.getAchieveFromLevel(getXpValue()), 1);
        	SokobanMod.packetPipeline.sendTo(new PacketGiveLevelAchievement(getXpValue()), (EntityPlayerMP) player);

            playSound("random.orb", 0.1F, 0.5F * ((rand.nextFloat() - rand.nextFloat()) * 0.7F + 1.8F));
            player.onItemPickup(this, 1);
            setDead();
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public int getTextureByXP(){
        return 3;
    }

}
