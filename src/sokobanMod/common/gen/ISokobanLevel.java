package sokobanMod.common.gen;

import net.minecraft.world.World;

public interface ISokobanLevel{

    /**
     * Enum used to indicate how the level is being generated:
     * ITEM: From an Level Generator.
     * SURFACE: By the WorldGenerator, on the surface.
     * UNDERGROUND: By the WorldGenerator, underground.
     */
    enum EnumGenerationMethod{
        ITEM, SURFACE, UNDERGROUND
    }

    /**
     * Gets the level number of the level. These numbers are zero-based (Level #1 returns 0);
     * Tutorial, Easy, Medium and Hard levels each have different 'prefixes'.
     * tutorial: 0000 - 0999
     * easy    : 1000 - 1999
     * medium  : 2000 - 2999
     * hard    : 3000 - 3999
     * So for a hard level #3 this method should return 3002
     * @return
     */
    public int getLevelNumber();

    /**
     * Returns the level boundaries (used in rendering the level wire frame).
     * @return an int[] array of 3 elements, indicating the x,y,z size
     */
    public int[] getLevelBounds();

    /**
     * Returns the entrances of the level, used in spawning the level, so the entrances connect to a cave.
     * @return an int[] array of a multiple of 3 elements, each pair of 3 elements indicates that that coordinate connects to the outside of the level.
     */
    public int[] getEntranceCoords();

    /**
     * @return the level name, which is displayed on the generator item tooltip.
     */
    public String getLevelName();

    /**
     * @return the author of the level, which is displayed on the generator item tooltip.
     */
    public String getAuthorName();

    /**
     * The returns of the following two methods determine if the level can be generated on the surface or underground.
     * @return true if they can be generated.
     */
    public boolean canGenerateOnSurface();

    public boolean canGenerateUnderground();

    /**
     * Actually generates the level.
     * @param world
     * @param generationMethod
     *      0 = generated from an Level Generator (item).
     *      1 = generated for underground.
     *      2 = generated for on the surface.
     * @param baseX
     * @param baseY
     * @param baseZ
     * @return true when successfully generated (uses the Level Generator item depending on the return).
     */
    public boolean generate(World world, EnumGenerationMethod generationMethod, int baseX, int baseY, int baseZ);
}
