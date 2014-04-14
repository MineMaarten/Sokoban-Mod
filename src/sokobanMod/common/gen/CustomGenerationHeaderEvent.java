package sokobanMod.common.gen;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.world.World;
import cpw.mods.fml.common.eventhandler.Event;

public class CustomGenerationHeaderEvent extends Event{

    public List<String> headerEntries;
    public final World world;
    public final int minX, minY, minZ, maxX, maxY, maxZ;

    public CustomGenerationHeaderEvent(World world, int minX, int minY, int minZ, int maxX, int maxY, int maxZ){
        this.world = world;
        this.minX = minX;
        this.minY = minY;
        this.minZ = minZ;
        this.maxX = maxX;
        this.maxY = maxY;
        this.maxZ = maxZ;
        headerEntries = new ArrayList<String>();
    }
}
