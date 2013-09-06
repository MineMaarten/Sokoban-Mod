package sokobanMod.client;

import net.minecraftforge.client.event.sound.SoundLoadEvent;
import net.minecraftforge.event.ForgeSubscribe;

/**
 * Sokoban Mod
 * @author MineMaarten
 * www.minemaarten.com
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */

public class SoundHandlerSokoban{

    @ForgeSubscribe
    public void onSound(SoundLoadEvent event){
        try {
            event.manager.soundPoolSounds.addSound("sokobanmod:lockSound.ogg");
            event.manager.soundPoolSounds.addSound("sokobanmod:movingBox.ogg");
            event.manager.soundPoolSounds.addSound("sokobanmod:air.ogg");
            event.manager.soundPoolSounds.addSound("sokobanmod:vaporize.ogg");

        } catch(Exception e) {
            System.err.println("Failed to register one or more sounds.");
        }

    }
}
