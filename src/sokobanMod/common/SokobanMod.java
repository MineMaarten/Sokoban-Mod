package sokobanMod.common;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;
import sokobanMod.common.network.PacketPipeline;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Sokoban Mod
 * @author MineMaarten
 * www.minemaarten.com
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */

// TODO increase version
@Mod(modid = Constants.MOD_ID, name = "Sokoban Mod", version = "1.0.8")
public class SokobanMod{

    @SidedProxy(clientSide = "sokobanMod.client.ClientProxySokoban", serverSide = "sokobanMod.common.CommonProxySokoban")
    public static CommonProxySokoban proxy;

    @Instance(Constants.MOD_ID)
    public static SokobanMod instance = new SokobanMod();

    private final static String[] SUBNAMES = {"White", "Orange", "Magenta", "LightBlue", "Yellow", "LightGreen", "Pink", "DarkGrey", "LightGrey", "Cyan", "Purple", "Blue", "Brown", "Green", "Red", "Black"};

    public static Block BlockUnbreakableSolids;
    public static Block BlockUnbreakableGlasses;
    public static Block BlockUnbreakableLamps;
    public static Block BlockTargetBox;
    public static Block BlockTarget;
    public static Block BlockLootGenerator;
    public static Block BlockRedstoneRemover;
    public static Block BlockVaporizingBlock;

    public static Item ItemLevelConverter;
    public static Item ItemLevelGeneratorTutorial;

    //   public static WorldGeneratorSokoban worldGenerator;

    public static int CONFIG_SURFACE_GENERATION_CHANCE;
    public static int CONFIG_UNDERGROUND_GENERATION_CHANCE;

    int BlockUnbreakableSolidsID;
    int BlockUnbreakableGlassesID;
    int BlockUnbreakableLampsID;
    int BlockTargetBoxID;
    int BlockTargetID;
    int BlockLootGeneratorID;
    int BlockRedstoneRemoverID;
    int BlockVaporizingBlockID;

    int ItemLevelConverterID;
    int ItemLevelGeneratorTutorialID;

    /** Updated PacketHandler from Forge wiki tutorial: http://www.minecraftforge.net/wiki/Netty_Packet_Handling */
    public static final PacketPipeline packetPipeline = new PacketPipeline();

    @EventHandler
    public void PreInit(FMLPreInitializationEvent event){
        Configuration config = new Configuration(event.getSuggestedConfigurationFile());
        config.load();

        // block ID's
        //descrepet
        // BlockUnbreakableSolidsID = config.getBlock("Unbreakable Solids ID", 600).getInt();
        // BlockUnbreakableGlassesID = config.getBlock("Unbreakable Glasses ID", 599).getInt();
        // BlockUnbreakableLampsID = config.getBlock("Unbreakable Lamps ID", 598).getInt();
        // BlockTargetBoxID = config.getBlock("Target Box ID", 601).getInt();
        // BlockTargetID = config.getBlock("Target ID", 602).getInt();
        // BlockLootGeneratorID = config.getBlock("Loot Generator ID", 603).getInt();
        // BlockRedstoneRemoverID = config.getBlock("Redstone Remover ID", 604).getInt();
        // BlockVaporizingBlockID = config.getBlock("Vaporizing Block ID", 605).getInt();

        // general

        Property PropertySurfaceChance = config.get(Configuration.CATEGORY_GENERAL, "Surface Generation Chance", 80);
        PropertySurfaceChance.comment = "The chance of sokoban levels to be generated at the surface. The number says 1 in how many chunks should I try to generate? For example, default it is 1 in 80 chunks. 0 to disable any spawn at all.";
        CONFIG_SURFACE_GENERATION_CHANCE = PropertySurfaceChance.getInt();

        Property PropertyUndergroundChance = config.get(Configuration.CATEGORY_GENERAL, "Underground Generation Chance", 40);
        PropertyUndergroundChance.comment = "The chance of sokoban levels to be generated under the ground. The number says 1 in how many chunks should I try to generate? For example, default it is 1 in 40 chunks. 0 to disable any spawn at all.";
        CONFIG_UNDERGROUND_GENERATION_CHANCE = PropertyUndergroundChance.getInt();

        // item ID's
        //@deprecated
        // I have no experience with Configuration files, so I will leave this to you
        // ItemLevelConverterID = config.getItem("Level Converter ID", 5100).getInt();
        // ItemLevelGeneratorTutorialID = config.getItem("Level Generator Tutorial ID", 5101).getInt();

        config.save();// save the configuration file

        CreativeTabSokobanMod tabSokobanMod = new CreativeTabSokobanMod("tabSokobanMod");
        CreativeTabSokobanModLevels tabSokobanModLevels = new CreativeTabSokobanModLevels("tabSokobanModLevels");
        BlockUnbreakableSolids = new BlockUnbreakableSolids(Material.glass).setBlockName("Unbreakable Solid Blocks").setBlockUnbreakable().setResistance(6000000.0F).setCreativeTab(tabSokobanMod);
        BlockUnbreakableGlasses = new BlockUnbreakableGlasses(Material.glass).setBlockName("Unbreakable Glass Blocks").setBlockUnbreakable().setResistance(6000000.0F).setCreativeTab(tabSokobanMod);
        BlockUnbreakableLamps = new BlockUnbreakableLamps(Material.glass).setBlockName("Unbreakable Lamp Blocks").setBlockUnbreakable().setResistance(6000000.0F).setLightLevel(0.9375F).setCreativeTab(tabSokobanMod);

        BlockTargetBox = new BlockTargetBox(Material.glass).setBlockName("Target Box").setHardness(1.0F).setResistance(6000000.0F).setCreativeTab(tabSokobanMod);
        BlockTarget = new BlockTarget(Material.glass).setBlockName("Target").setBlockUnbreakable().setResistance(6000000.0F).setCreativeTab(tabSokobanMod);// .setRequiresSelfNotify()
        BlockLootGenerator = new BlockLootGenerator(Material.glass).setBlockName("Loot Generator").setBlockUnbreakable().setResistance(6000000.0F).setCreativeTab(tabSokobanMod);
        BlockRedstoneRemover = new BlockRedstoneRemover(Material.glass).setBlockName("Redstone Remover").setBlockUnbreakable().setResistance(6000000.0F).setCreativeTab(tabSokobanMod);
        BlockVaporizingBlock = new BlockVaporizingBlock(Material.glass).setBlockName("Vaporizing Block").setBlockUnbreakable().setResistance(6000000.0F).setCreativeTab(tabSokobanMod);

        FMLCommonHandler.instance().bus().register(BlockTargetBox);

        // I tired right now and just trying to get this class finished... but I am confused at this section -EliteCreature
        // Item.itemsList[BlockUnbreakableSolidsID] = new ItemBlockUnbreakableSolids(BlockUnbreakableSolidsID - 256).setUnlocalizedName("Unbreakable Solid Blocks");
        // Item.itemsList[BlockUnbreakableGlassesID] = new ItemBlockUnbreakableGlasses(BlockUnbreakableGlassesID - 256).setUnlocalizedName("Unbreakable Glass Blocks");
        // Item.itemsList[BlockUnbreakableLampsID] = new ItemBlockUnbreakableLamps(BlockUnbreakableLampsID - 256).setUnlocalizedName("Unbreakable Lamp Blocks");
        // Item.itemsList[BlockTargetID] = new ItemBlockTarget(BlockTargetID - 256).setUnlocalizedName("Target Blocks");

        ItemLevelConverter = new ItemLevelConverter().setUnlocalizedName("Level Converter").setCreativeTab(tabSokobanMod);
        ItemLevelGeneratorTutorial = new ItemLevelGeneratorTutorial().setUnlocalizedName("Level Generator Tutorial").setCreativeTab(tabSokobanModLevels);

        AchievementHandler.init();
        gameRegisters();

        proxy.registerSoundHandler();

    }

    @EventHandler
    public void load(FMLInitializationEvent event){

        // languageRegisters();

        // EntityRegistry.registerGlobalEntityID(EntityFallingTargetBox.class, "Falling Target Box", EntityRegistry.findGlobalUniqueEntityId());
        // EntityRegistry.registerGlobalEntityID(EntityMovingTargetBox.class, "Moving Target Box", EntityRegistry.findGlobalUniqueEntityId());
        // EntityRegistry.registerGlobalEntityID(EntityAchievementOrb.class, "Achievement Orb", EntityRegistry.findGlobalUniqueEntityId());
        EntityRegistry.registerModEntity(EntityAchievementOrb.class, "Achievement Orb", 0, this, 200, 1, true);
        proxy.registerRenders();
        packetPipeline.initialise();
    }

    @EventHandler
    public void modsLoaded(FMLPostInitializationEvent event){
        packetPipeline.postInitialise();
    }

    public void gameRegisters(){

        // new blocks
        GameRegistry.registerBlock(BlockUnbreakableSolids, ItemBlockUnbreakableSolids.class, "unbreakableSolids", Constants.MOD_ID);
        GameRegistry.registerBlock(BlockUnbreakableGlasses, ItemBlockUnbreakableGlasses.class, "unbreakableGlasses", Constants.MOD_ID);
        GameRegistry.registerBlock(BlockUnbreakableLamps, ItemBlockUnbreakableLamps.class, "unbreakableLamps", Constants.MOD_ID);
        GameRegistry.registerBlock(BlockTargetBox, ItemBlock.class, "targetBox", Constants.MOD_ID);
        GameRegistry.registerBlock(BlockTarget, ItemBlockTarget.class, "target", Constants.MOD_ID);
        GameRegistry.registerBlock(BlockLootGenerator, ItemBlock.class, "lootGenerator", Constants.MOD_ID);
        GameRegistry.registerBlock(BlockRedstoneRemover, ItemBlock.class, "redstoneRemover", Constants.MOD_ID);
        GameRegistry.registerBlock(BlockVaporizingBlock, ItemBlock.class, "vaporizingBlock", Constants.MOD_ID);

        // new items
        GameRegistry.registerItem(ItemLevelConverter, "levelConverter", Constants.MOD_ID);
        GameRegistry.registerItem(ItemLevelGeneratorTutorial, "levelGeneratorTutorial", Constants.MOD_ID);

        // crafting recipes
        GameRegistry.addRecipe(new ItemStack(SokobanMod.ItemLevelGeneratorTutorial, 1, 0), "srs", "rgr", "srs", 's', Blocks.stonebrick, 'r', Items.redstone, 'g', Items.gold_ingot);
        GameRegistry.addRecipe(new ItemStack(SokobanMod.ItemLevelGeneratorTutorial, 1, 0), "rsr", "sgs", "rsr", 's', Blocks.stonebrick, 'r', Items.redstone, 'g', Items.gold_ingot);

        // tile entities
        GameRegistry.registerTileEntity(sokobanMod.common.TileEntityLootGenerator.class, "tileEntityLootGenerator");
        GameRegistry.registerTileEntity(sokobanMod.common.TileEntityTargetBox.class, "tileEntityTargetBox");

        // worldgenerators
        //      worldGenerator = new WorldGeneratorSokoban();

        //note: you might want to change '1' to a larger number (apparently larger numbers mean
        //      lower priority, but I have no idea what the standard is currently -EliteCreature
        //       GameRegistry.registerWorldGenerator(worldGenerator, 1);
    }

    //I added an en_US.lang file in resources/assets/sokobanmod/lang -EliteCreature

    /**
     * @deprecated
     * 
     public void languageRegisters(){
        LanguageRegistry.addName(new ItemStack(BlockUnbreakableSolids, 1, 0), "Concrete Stone");
        LanguageRegistry.addName(new ItemStack(BlockUnbreakableGlasses, 1, 0), "Concrete Glass");
        LanguageRegistry.addName(new ItemStack(BlockUnbreakableGlasses, 1, 1), "Air Block");

        for(int i = 0; i < 16; i++) {
            LanguageRegistry.addName(new ItemStack(BlockUnbreakableLamps, 1, i), "Indestructible " + SUBNAMES[i] + " Lamp");
        }

        for(ISokobanLevel level : LevelRegistrator.sokobanLevels) {
            int levelNumber = level.getLevelNumber();
            if(levelNumber < 1000) {
                LanguageRegistry.addName(new ItemStack(ItemLevelGeneratorTutorial, 1, levelNumber), "Tutorial Level #" + (levelNumber + 1) + " Generator");
            } else if(levelNumber < 2000) {
                LanguageRegistry.addName(new ItemStack(ItemLevelGeneratorTutorial, 1, levelNumber), "Easy Level #" + (levelNumber % 1000 + 1) + " Generator");
            } else if(levelNumber < 3000) {
                LanguageRegistry.addName(new ItemStack(ItemLevelGeneratorTutorial, 1, levelNumber), "Medium Level #" + (levelNumber % 1000 + 1) + " Generator");
            } else {
                LanguageRegistry.addName(new ItemStack(ItemLevelGeneratorTutorial, 1, levelNumber), "Hard Level #" + (levelNumber % 1000 + 1) + " Generator");
            }
        }

        LanguageRegistry.addName(BlockTargetBox, "Target Box");
        LanguageRegistry.addName(new ItemStack(BlockTarget, 1, 0), "Target");
        LanguageRegistry.addName(new ItemStack(BlockTarget, 1, 2), "Connected Target");
        LanguageRegistry.addName(BlockLootGenerator, "Loot Generator");
        LanguageRegistry.addName(BlockRedstoneRemover, "Redstone Remover");
        LanguageRegistry.addName(BlockVaporizingBlock, "Vaporizing Block");

        LanguageRegistry.addName(ItemLevelConverter, "Level Converter");

        LanguageRegistry.instance().addStringLocalization("itemGroup.tabSokobanMod", "en_US", "Sokoban");
        LanguageRegistry.instance().addStringLocalization("itemGroup.tabSokobanModLevels", "en_US", "Sokoban Levels");
     * 
     */

    /*
     * this.addAchievementName("achieveT1", "The Basics");
     * this.addAchievementName("achieveT2", "Double Trouble");
     * this.addAchievementName("achieveT3", "Doors");
     * this.addAchievementName("achieveT4", "The Other Side Of The Door");
     * //this.addAchievementName("achieveT1", "The Basics"); for(int i = 1;
     * i < levelAmount; i++){ this.addAchievementDesc("achieveT" + i,
     * "Complete Tutorial Level #" + i + "."); }
     */

}
