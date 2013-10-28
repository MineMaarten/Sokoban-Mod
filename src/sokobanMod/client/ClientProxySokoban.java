package sokobanMod.client;

import net.minecraft.client.renderer.entity.RenderFallingSand;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import sokobanMod.common.CommonProxySokoban;
import sokobanMod.common.EntityAchievementOrb;
import sokobanMod.common.EntityFallingTargetBox;
import sokobanMod.common.EntityMovingTargetBox;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.client.registry.RenderingRegistry;

/**
 * Sokoban Mod
 * @author MineMaarten
 * www.minemaarten.com
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */

public class ClientProxySokoban extends CommonProxySokoban{

    @Override
    public void registerRenders(){
        RenderingRegistry.registerEntityRenderingHandler(EntityFallingTargetBox.class, new RenderFallingSand());
        RenderingRegistry.registerEntityRenderingHandler(EntityMovingTargetBox.class, new RenderFallingSand());
        RenderingRegistry.registerEntityRenderingHandler(EntityAchievementOrb.class, new RenderAchievementOrb());

        MinecraftForge.EVENT_BUS.register(new HandlerLevelPreviewRenderer());
    }

    @Override
    public World getClientWorld(){
        return FMLClientHandler.instance().getClient().theWorld;
    }

    @Override
    public void registerSoundHandler(){
        MinecraftForge.EVENT_BUS.register(new SoundHandlerSokoban());
    }
}
