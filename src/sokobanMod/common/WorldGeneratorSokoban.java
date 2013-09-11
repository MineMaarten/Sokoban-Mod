package sokobanMod.common;

import java.util.Random;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.ChunkProviderFlat;
import sokobanMod.common.gen.levelGenBase;
import sokobanMod.common.gen.easy.easyLevel1Gen;
import sokobanMod.common.gen.easy.easyLevel2Gen;
import sokobanMod.common.gen.easy.easyLevel3Gen;
import sokobanMod.common.gen.easy.easyLevel4Gen;
import sokobanMod.common.gen.easy.easyLevel5Gen;
import sokobanMod.common.gen.easy.easyLevel6Gen;
import sokobanMod.common.gen.hard.hardLevel1Gen;
import sokobanMod.common.gen.tutorial.tutorialLevel1Gen;
import sokobanMod.common.gen.tutorial.tutorialLevel2Gen;
import sokobanMod.common.gen.tutorial.tutorialLevel3Gen;
import sokobanMod.common.gen.tutorial.tutorialLevel4Gen;
import sokobanMod.common.gen.tutorial.tutorialLevel5Gen;
import sokobanMod.common.gen.tutorial.tutorialLevel6Gen;
import cpw.mods.fml.common.IWorldGenerator;

/**
 * Sokoban Mod
 * @author MineMaarten
 * www.minemaarten.com
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */

public class WorldGeneratorSokoban implements IWorldGenerator{

    // 1 based, level 1 = level 1
    private static final int[] surfaceLevel = new int[]{1001, 1002, 1005, 3001};
    private static final int[] undergroundLevel = new int[]{1002, 1003, 1004, 1005, 3001};

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider){
        if(!(chunkGenerator instanceof ChunkProviderFlat)) { //don't generate on flatworlds
            switch(world.provider.dimensionId){
                case 0:
                    generateSurface(world, random, chunkX * 16, chunkZ * 16);
                    break;
                case -1:
                    generateNether(world, random, chunkX * 16, chunkZ * 16);
                    break;
                case 1:
                    generateEnd(world, random, chunkX * 16, chunkZ * 16);
            }
        }
    }

    private void generateEnd(World world, Random rand, int i, int j){

    }

    private void generateNether(World world, Random rand, int i, int j){

    }

    private void generateSurface(World world, Random rand, int i, int j){
        if(SokobanMod.CONFIG_SURFACE_GENERATION_CHANCE != 0 && rand.nextInt(SokobanMod.CONFIG_SURFACE_GENERATION_CHANCE) == 0) {
            for(int k = 0; k < 10; k++) {
                int baseX = i + rand.nextInt(20);
                int baseY = 10 + rand.nextInt(40);
                int baseZ = j + rand.nextInt(20);
                if(generateSokobanLevel(world, levelGenBase.generateSurface, (EntityPlayer)null, baseX, baseY, baseZ, surfaceLevel[rand.nextInt(surfaceLevel.length)])) break;
            }

        }
        if(SokobanMod.CONFIG_UNDERGROUND_GENERATION_CHANCE != 0 && rand.nextInt(SokobanMod.CONFIG_UNDERGROUND_GENERATION_CHANCE) == 0) {
            for(int k = 0; k < 10; k++) {
                int baseX = i + rand.nextInt(20);
                int baseY = 10 + rand.nextInt(40);
                int baseZ = j + rand.nextInt(20);
                if(generateSokobanLevel(world, levelGenBase.generateUnderground, (EntityPlayer)null, baseX, baseY, baseZ, undergroundLevel[rand.nextInt(undergroundLevel.length)])) break;
            }

        }
    }

    public boolean generateSokobanLevel(World world, int generationMethod, EntityPlayer player, int baseX, int baseY, int baseZ, int levelNumber){

        switch(levelNumber){
        // tutorial levels
            case 1:
                if(tutorialLevel1Gen.generate(world, generationMethod, baseX, baseY, baseZ)) return true;
                break;
            case 2:
                if(tutorialLevel2Gen.generate(world, generationMethod, baseX, baseY, baseZ)) return true;
                break;
            case 3:
                if(tutorialLevel3Gen.generate(world, generationMethod, baseX, baseY, baseZ)) return true;
                break;
            case 4:
                if(tutorialLevel4Gen.generate(world, generationMethod, baseX, baseY, baseZ)) return true;
                break;
            case 5:
                if(tutorialLevel5Gen.generate(world, generationMethod, baseX, baseY, baseZ)) return true;
                break;
            case 6:
                if(tutorialLevel6Gen.generate(world, generationMethod, baseX, baseY, baseZ)) return true;
                break;

            // easy levels
            case 1001:
                if(easyLevel1Gen.generate(world, generationMethod, baseX, baseY, baseZ)) return true;
                break;
            case 1002:
                if(easyLevel2Gen.generate(world, generationMethod, baseX, baseY, baseZ)) return true;
                break;
            case 1003:
                if(easyLevel3Gen.generate(world, generationMethod, baseX, baseY, baseZ)) return true;
                break;
            case 1004:
                if(easyLevel4Gen.generate(world, generationMethod, baseX, baseY, baseZ)) return true;
                break;
            case 1005:
                if(easyLevel5Gen.generate(world, generationMethod, baseX, baseY, baseZ)) return true;
                break;
            case 1006:
                if(easyLevel6Gen.generate(world, generationMethod, baseX, baseY, baseZ)) return true;
                break;

            // hard levels
            case 3001:
                if(hardLevel1Gen.generate(world, generationMethod, baseX, baseY, baseZ)) return true;
                break;
            default:
                if(player != null) player.addChatMessage("This level hasn't been implemented yet!");
                return false;
        }

        if(player != null) player.addChatMessage("You can't generate the level here: An other level is occupying this location!");
        return false;
    }

    // orientation values
    // 0 : Z+
    // 1 : X-
    // 2 : Z-
    // 3 : X+

}
