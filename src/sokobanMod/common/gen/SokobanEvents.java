package sokobanMod.common.gen;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class SokobanEvents{

    @SubscribeEvent
    public void onHeaderAddition(CustomGenerationHeaderEvent event){
        String header = "sokoban";
        for(int x = event.minX; x <= event.maxX; x++) {
            for(int y = event.minY; y <= event.maxY; y++) {
                for(int z = event.minZ; z <= event.maxZ; z++) {
                    int matchingAxis = 0;
                    if(x == event.minX || x == event.maxX) matchingAxis++;
                    if(y == event.minY || y == event.maxY) matchingAxis++;
                    if(z == event.minZ || z == event.maxZ) matchingAxis++;
                    if(matchingAxis > 1 && event.world.isAirBlock(x, y, z)) {
                        header += "," + (x - event.minX) + "," + (y - event.minY) + "," + (z - event.minZ);

                    }
                }
            }
        }
        event.headerEntries.add(header);
    }

    //TODO protect against other invokes from not this mod
    @SubscribeEvent
    public void onHeaderGeneration(CustomGenerationGenerateEvent event){
        for(String header : event.headerEntries) {
            if(header.startsWith("sokoban")) {
                String[] entranceCoords = header.split(",");
                for(int i = 1; i < entranceCoords.length - 2; i += 3) {
                    int x = Integer.parseInt(entranceCoords[i]) + event.minX;
                    int y = Integer.parseInt(entranceCoords[i + 1]) + event.minY;
                    int z = Integer.parseInt(entranceCoords[i + 2]) + event.minZ;
                    if(event.world.isAirBlock(x, y, z)) {
                        return;//return, allow generation.
                    }
                }
                event.isCanceled = true;//disallow generation.
                return;
            }
        }
    }
}
