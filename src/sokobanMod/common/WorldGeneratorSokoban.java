package sokobanMod.common;

import java.util.Random;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.ChunkProviderFlat;
import sokobanMod.common.gen.ISokobanLevel;
import sokobanMod.common.gen.LevelGenBase;
import cpw.mods.fml.common.IWorldGenerator;

/**
 * Sokoban Mod
 * @author MineMaarten
 * www.minemaarten.com
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */

public class WorldGeneratorSokoban implements IWorldGenerator{

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
                int levelNumber = LevelRegistrator.getRandomSurfaceLevel(rand);
                int baseX = i + rand.nextInt(20);
                int baseZ = j + rand.nextInt(20);
                if(generateSokobanLevel(world, ISokobanLevel.EnumGenerationMethod.SURFACE, (EntityPlayer)null, baseX, 0, baseZ, levelNumber)) break;
            }

        }
        if(SokobanMod.CONFIG_UNDERGROUND_GENERATION_CHANCE != 0 && rand.nextInt(SokobanMod.CONFIG_UNDERGROUND_GENERATION_CHANCE) == 0) {
            for(int k = 0; k < 10; k++) {
                int levelNumber = LevelRegistrator.getRandomUndergroundLevel(rand);
                int baseX = i + rand.nextInt(20);
                int baseY = 10 + rand.nextInt(40);
                int baseZ = j + rand.nextInt(20);
                if(generateSokobanLevel(world, ISokobanLevel.EnumGenerationMethod.UNDERGROUND, (EntityPlayer)null, baseX, baseY, baseZ, levelNumber)) break;
            }

        }
    }

    public boolean generateSokobanLevel(World world, ISokobanLevel.EnumGenerationMethod generationMethod, EntityPlayer player, int baseX, int baseY, int baseZ, int levelNumber){
        baseY = LevelGenBase.canGenerateHereAndClear(world, levelNumber, generationMethod, baseX, baseY, baseZ);
        if(baseY != 0) {
            if(LevelRegistrator.generateLevel(levelNumber, world, generationMethod, baseX, baseY, baseZ)) {
                return true;
            }
        }
        if(player != null) player.addChatMessage(EnumChatFormatting.RED + "You can't generate the level here: An other level is occupying this location!");
        return false;
    }
}
