package sokobanMod.common;

import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.PacketDispatcher;
import cpw.mods.fml.common.network.Player;

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

    private int getLevelDifficulty(){
        return getXpValue() / 1000;
    }

    private int getLevelNr(){
        return getXpValue() % 1000;
    }

    @Override
    public void onCollideWithPlayer(EntityPlayer player){
        if(!worldObj.isRemote) {

            switch(getLevelDifficulty()){
                case 0:
                    player.addStat(SokobanMod.achieveTutorial[getLevelNr()], 1);
            }

            PacketDispatcher.sendPacketToPlayer(PacketHandlerSokoban.giveAchievement(getXpValue()), (Player)player);

            playSound("random.orb", 0.1F, 0.5F * ((rand.nextFloat() - rand.nextFloat()) * 0.7F + 1.8F));
            player.onItemPickup(this, 1);
            setDead();
        }
    }

}
