package sokobanMod.common.gen;

import java.util.List;

import net.minecraft.world.World;

public class CustomGenerationGenerateEvent extends CustomGenerationHeaderEvent{
    public boolean isCanceled = false;

    public CustomGenerationGenerateEvent(World world, int minX, int minY, int minZ, int maxX, int maxY, int maxZ,
            List<String> headerEntries){
        super(world, minX, minY, minZ, maxX, maxY, maxZ);
        this.headerEntries = headerEntries;
    }
}
