package sokobanMod.common;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.item.ItemStack;
import net.minecraft.stats.Achievement;
import net.minecraft.stats.AchievementList;
import net.minecraftforge.common.AchievementPage;
import sokobanMod.common.gen.ISokobanLevel;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class AchievementHandler{

    public static List<Achievement> achieveList = new ArrayList<Achievement>();
    private static final int MAX_ACHIEVES_PER_ROW = 4;
    private static final int ACHIEVEMENT_ID_OFFSET = 2531;

    public static void init(){
        int tutorialCount = 0, easyCount = 0, mediumCount = 0, hardCount = 0;
        Achievement lastTutorialAchieve = null;

        for(ISokobanLevel level : LevelRegistrator.sokobanLevels) {
            int levelCount;
            Achievement parentAchieve = null;
            if(level.getLevelNumber() < 1000) {
                levelCount = tutorialCount++;
                parentAchieve = lastTutorialAchieve;
            } else if(level.getLevelNumber() < 2000) levelCount = easyCount++;
            else if(level.getLevelNumber() < 3000) levelCount = mediumCount++;
            else levelCount = hardCount;

            int achieveY = levelCount / MAX_ACHIEVES_PER_ROW - 2;
            int achieveX = level.getLevelNumber() / 1000 * (MAX_ACHIEVES_PER_ROW + 1) - 6;
            if(achieveY % 2 == 0) {//when the achieves go from left to right
                achieveX += levelCount % MAX_ACHIEVES_PER_ROW;
            } else {
                achieveX += MAX_ACHIEVES_PER_ROW - 1 - levelCount % MAX_ACHIEVES_PER_ROW;
            }
            
            //TODO (Achievement IDs are now strings) - EC
            
            Achievement achieve = new Achievement(level.getLevelNumber() + "" + ACHIEVEMENT_ID_OFFSET, "level" + level.getLevelNumber(), achieveX, achieveY, SokobanMod.ItemLevelGeneratorTutorial, parentAchieve).initIndependentStat().registerStat();
            achieveList.add(achieve);
            if(level.getLevelNumber() < 1000) lastTutorialAchieve = achieve;
            addAchievementName("level" + level.getLevelNumber(), level.getLevelName());
            addAchievementDesc("level" + level.getLevelNumber(), "Complete " + SokobanMod.ItemLevelGeneratorTutorial.getItemStackDisplayName(new ItemStack(SokobanMod.ItemLevelGeneratorTutorial, 1, level.getLevelNumber())).replace(" Generator", "") + ".");
        }

        AchievementPage.registerAchievementPage(new AchievementPage("Sokoban", achieveList.toArray(new Achievement[achieveList.size()])));
    }

    private static void addAchievementName(String ach, String name){
        LanguageRegistry.instance().addStringLocalization("achievement." + ach, "en_US", name);
    }

    private static void addAchievementDesc(String ach, String desc){
        LanguageRegistry.instance().addStringLocalization("achievement." + ach + ".desc", "en_US", desc);
    }

    // (Made this a string by adding { + "" }, probably incorrect/not-what-you-want)
    
    public static Achievement getAchieveFromLevel(int level){
        for(Achievement achieve : (List<Achievement>)AchievementList.achievementList) {
            if(achieve.statId == level + 5242880 + "" + ACHIEVEMENT_ID_OFFSET) {
                return achieve;
            }
        }
        return null;
    }
}
