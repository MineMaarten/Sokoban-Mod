package sokobanMod.common;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;
import sokobanMod.common.gen.ISokobanLevel;

public class LevelRegistrator{
    public static List<ISokobanLevel> sokobanLevels = new ArrayList<ISokobanLevel>();

    static {
        /* sokobanLevels.add(new TutorialLevel1Gen());
         sokobanLevels.add(new TutorialLevel2Gen());
         sokobanLevels.add(new TutorialLevel3Gen());
         sokobanLevels.add(new TutorialLevel4Gen());
         sokobanLevels.add(new TutorialLevel5Gen());
         sokobanLevels.add(new TutorialLevel6Gen());

         sokobanLevels.add(new EasyLevel1Gen());
         sokobanLevels.add(new EasyLevel2Gen());
         sokobanLevels.add(new EasyLevel3Gen());
         sokobanLevels.add(new EasyLevel4Gen());
         sokobanLevels.add(new EasyLevel5Gen());
         sokobanLevels.add(new EasyLevel6Gen());

         sokobanLevels.add(new MediumLevel1Gen());

         sokobanLevels.add(new HardLevel1Gen());*/
    }

    public static int[] getLevelBounds(int level){
        for(ISokobanLevel sokobanLevel : sokobanLevels) {
            if(sokobanLevel.getLevelNumber() == level) return sokobanLevel.getLevelBounds();
        }
        return new int[3];
    }

    public static int[] getLevelEntrances(int level){
        for(ISokobanLevel sokobanLevel : sokobanLevels) {
            if(sokobanLevel.getLevelNumber() == level) return sokobanLevel.getEntranceCoords();
        }
        return new int[0];
    }

    public static boolean generateLevel(int level, World world, ISokobanLevel.EnumGenerationMethod generationMethod, int baseX, int baseY, int baseZ){
        for(ISokobanLevel sokobanLevel : sokobanLevels) {
            if(sokobanLevel.getLevelNumber() == level) return sokobanLevel.generate(world, generationMethod, baseX, baseY, baseZ);
        }
        return false;
    }

    public static int getRandomSurfaceLevel(Random rand){
        while(true) {
            int levelIndex = rand.nextInt(sokobanLevels.size());
            if(sokobanLevels.get(levelIndex).canGenerateOnSurface()) return sokobanLevels.get(levelIndex).getLevelNumber();
        }
    }

    public static int getRandomUndergroundLevel(Random rand){
        while(true) {
            int levelIndex = rand.nextInt(sokobanLevels.size());
            if(sokobanLevels.get(levelIndex).canGenerateUnderground()) return sokobanLevels.get(levelIndex).getLevelNumber();
        }
    }

    public static int getRandomNonTutorialLevel(Random rand){
        while(true) {
            int levelIndex = rand.nextInt(sokobanLevels.size());
            if(sokobanLevels.get(levelIndex).getLevelNumber() >= 1000) return sokobanLevels.get(levelIndex).getLevelNumber();
        }
    }

    public static String getLevelName(int levelNumber){
        for(ISokobanLevel sokobanLevel : sokobanLevels) {
            if(sokobanLevel.getLevelNumber() == levelNumber) return sokobanLevel.getLevelName();
        }
        return EnumChatFormatting.RED + "-Not Implemented Yet-";
    }

    public static String getAuthorName(int levelNumber){
        for(ISokobanLevel sokobanLevel : sokobanLevels) {
            if(sokobanLevel.getLevelNumber() == levelNumber) return sokobanLevel.getAuthorName();
        }
        return "";
    }
}
