package mullak99.mullak99sMod;

import java.io.File;

import mullak99.Addons.nuclear.NAutil;
import mullak99.Addons.nuclear.armor.hazmatSuit;
import mullak99.Addons.nuclear.blocks.oreUranium;
import mullak99.Addons.nuclear.items.UraniumItem;
import mullak99.mullak99sMod.armor.alphaArmor;
import mullak99.mullak99sMod.armor.bronzeArmor;
import mullak99.mullak99sMod.armor.mulliteArmor;
import mullak99.mullak99sMod.armor.roxiteArmor;
import mullak99.mullak99sMod.armor.steelArmor;
import mullak99.mullak99sMod.blocks.MCraftingTable;
import mullak99.mullak99sMod.blocks.MTNT;
import mullak99.mullak99sMod.blocks.Stairs;
import mullak99.mullak99sMod.blocks.alphaGrass;
import mullak99.mullak99sMod.blocks.alphaLeaves;
import mullak99.mullak99sMod.blocks.alphaSapling;
import mullak99.mullak99sMod.blocks.alphaStone;
import mullak99.mullak99sMod.blocks.bloodLiquid;
import mullak99.mullak99sMod.blocks.clearGlass;
import mullak99.mullak99sMod.blocks.clearGlassPane;
import mullak99.mullak99sMod.blocks.genericBlock;
import mullak99.mullak99sMod.blocks.marble;
import mullak99.mullak99sMod.blocks.marbleBrickSlab;
import mullak99.mullak99sMod.blocks.marbleCobbleSlab;
import mullak99.mullak99sMod.blocks.marbleSlab;
import mullak99.mullak99sMod.blocks.oreAlpha;
import mullak99.mullak99sMod.blocks.oreBauxite;
import mullak99.mullak99sMod.blocks.oreEndite;
import mullak99.mullak99sMod.blocks.oreMullite;
import mullak99.mullak99sMod.blocks.oreRoxite;
import mullak99.mullak99sMod.blocks.oreSulfur;
import mullak99.mullak99sMod.event.mullak99TreeBonemealEvent;
import mullak99.mullak99sMod.fluid.bloodFluid;
import mullak99.mullak99sMod.handler.BucketHandler;
import mullak99.mullak99sMod.handler.MCraftingGUIHandler;
import mullak99.mullak99sMod.handler.PlayerHandler;
import mullak99.mullak99sMod.handler.localHandler;
import mullak99.mullak99sMod.items.Battery;
import mullak99.mullak99sMod.items.BatteryEmpty;
import mullak99.mullak99sMod.items.BatteryEnder;
import mullak99.mullak99sMod.items.Hammer;
import mullak99.mullak99sMod.items.Paxel;
import mullak99.mullak99sMod.items.PaxelEE;
import mullak99.mullak99sMod.items.ThorsHammer;
import mullak99.mullak99sMod.items.axeMullite;
import mullak99.mullak99sMod.items.blood;
import mullak99.mullak99sMod.items.bloodBucket;
import mullak99.mullak99sMod.items.bucketChocMilk;
import mullak99.mullak99sMod.items.enchantedMelon;
import mullak99.mullak99sMod.items.endite;
import mullak99.mullak99sMod.items.essenceAlpha;
import mullak99.mullak99sMod.items.essenceExtractor;
import mullak99.mullak99sMod.items.genericItem;
import mullak99.mullak99sMod.items.hoeMullite;
import mullak99.mullak99sMod.items.mortarPestle;
import mullak99.mullak99sMod.items.pickaxeMullite;
import mullak99.mullak99sMod.items.portableCrafting;
import mullak99.mullak99sMod.items.shovelMullite;
import mullak99.mullak99sMod.items.stickUranium;
import mullak99.mullak99sMod.items.swordMullite;
import mullak99.mullak99sMod.items.swordMulliteDE;
import mullak99.mullak99sMod.items.swordMulliteEE;
import mullak99.mullak99sMod.items.swordMulliteUr;
import mullak99.mullak99sMod.mobs.EntityTweaks;
import mullak99.mullak99sMod.mobs.ProNinjaGamerMob;
import mullak99.mullak99sMod.mobs.ThundercoyoteMob;
import mullak99.mullak99sMod.mobs.lucozade_wallerMob;
import mullak99.mullak99sMod.mobs.mullak99Mob;
import mullak99.mullakCore.CapeCore;
import mullak99.mullakCore.ItemAlphaFood;
import mullak99.mullakCore.mullakCore;
import net.minecraft.block.Block;
import net.minecraft.block.BlockHalfSlab;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ThreadDownloadImageData;
import net.minecraft.client.renderer.texture.TextureObject;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemSlab;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.AchievementPage;
import net.minecraftforge.common.ChestGenHooks;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidContainerRegistry;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.oredict.OreDictionary;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@Mod (modid="mullak99's Mod 2", name="mullak99's Mod 2", version="", dependencies="required-after:mullakCore")
@NetworkMod (clientSideRequired=true, serverSideRequired=false)

public class mullak99 {
	
	@Instance ("mullak99's Mod 2")
	public static mullak99 instance;
	
	//Dimension ID
	public static int alphaID = 14;
	
    //Items
    public static Item mullite;
    public static Item roxite;
    public static Item ingotCopper;
    public static Item ingotSteel;
    public static Item ingotTin;
    public static Item dustAlpha;
    public static Item mortarPestle;
    public static Item mortarPestleReinf;
    public static Item dustMullite;
    public static Item dustRoxite;
    public static Item dustCoal;
    public static Item dustCharcoal;
    public static Item dustBronze;
    public static Item dustCopper;
    public static Item dustTin;
    public static Item ingotBronze;
    public static Item redstoneBattery;
    public static Item aluminiumRaw;
    public static Item ingotAluminium;
    public static Item dustAluminium;
    public static Item bauxite;
    public static Item blood;
    public static Item mullak99Spawn;
    public static Item ThundercoyoteSpawn;
    public static Item ingotAlpha;
    public static Item foamFinger;
    public static Item Chain;
    public static Item IronTippedArrow;
    public static Item BatteryEmpty;
    public static Item BatteryEnder;
    public static Item bloodBucket;
    public static Item debugTool;
    public static Item sulfur;
    
    public static Item ingotSteelRaw;
    public static Item ingotWroughtIron;
    public static Item grate;
    public static Item portableCrafting;
    
    public static Item endite;
    
    public static Item ingotSilver;
    public static Item dustSilver;
    
    public static Item ingotUru;
    
    //Food
    public static Item enchantedMelon;
    public static Item muttonRaw;
    public static Item muttonCooked;
    public static Item fleshCooked;
    public static Item alphaPorkchopRaw;
    public static Item alphaPorkchopCooked;
    
    //Drink
    public static Item bucketChocMilk;
    public static Item essenceAlpha;
    
    //Tools
    public static Item pickaxeMullite;
    public static Item shovelMullite;
    public static Item swordMullite;
    public static Item axeMullite;
    public static Item hoeMullite;
    public static Item swordMulliteDE;
    public static Item paxelMullite;
    public static Item paxelMulliteEE;
    public static Item swordMulliteEE;
    public static Item swordMulliteEEUr;
    
    public static Item pickaxeRoxite;
    public static Item shovelRoxite;
    public static Item swordRoxite;
    public static Item axeRoxite;
    public static Item hoeRoxite;
    public static Item swordRoxiteDE;
    public static Item paxelRoxite;
    public static Item paxelRoxiteEE;
    public static Item swordRoxiteEE;
    
    public static Item pickaxeBedrock;
    public static Item shovelBedrock;
    public static Item swordBedrock;
    public static Item axeBedrock;
    
    public static Item pickaxeBronze;
    public static Item shovelBronze;
    public static Item swordBronze;
    public static Item axeBronze;
    public static Item hoeBronze;
    public static Item paxelBronze;
    
    public static Item pickaxeSteel;
    public static Item shovelSteel;
    public static Item swordSteel;
    public static Item axeSteel;
    public static Item hoeSteel;
    public static Item paxelSteel;
    
    public static Item pickaxeAlpha;
    public static Item shovelAlpha;
    public static Item swordAlpha;
    public static Item axeAlpha;
    public static Item hoeAlpha;
    public static Item paxelAlpha;
    
    public static Item paxelIron;
    public static Item paxelDiamond;
    
    public static Item steelHammer;
    public static Item essenceExtractor;
    public static Item mulliteBow;
    
    public static Item thorsHammer;
    
    public static Item enditeHammer;
    
    //Armor
    public static Item helmetMullite;
    public static Item chestMullite;
    public static Item legsMullite;
    public static Item bootsMullite;
    
    public static Item helmetRoxite;
    public static Item chestRoxite;
    public static Item legsRoxite;
    public static Item bootsRoxite;
    
    public static Item helmetBronze;
    public static Item chestBronze;
    public static Item legsBronze;
    public static Item bootsBronze;
    
    public static Item helmetSteel;
    public static Item chestSteel;
    public static Item legsSteel;
    public static Item bootsSteel;
    
    public static Item helmetAlpha;
    public static Item chestAlpha;
    public static Item legsAlpha;
    public static Item bootsAlpha;
    
    //Blocks
    public static Block oreMullite;
    public static Block blockMullite;
    public static Block oreRoxite;
    public static Block blockRoxite;
    public static Block oreCopper;
    public static Block blockCopper;
    public static Block oreTin;
    public static Block blockTin;
    public static Block oreEndite;
    public static Block blockEndite;
    public static Block clearGlass;
    public static Block thinClearGlass;
    public static Block oreAlpha;
    public static Block alphaCobble;
    public static Block alphaStone;
    public static Block blockAlpha;
    public static Block blockBronze;
    public static Block alphaFurnaceIdle;
    public static Block alphaFurnaceBurning;
    public static alphaLeaves alphaLeaves;
    public static Block alphaGrass;
    public static Block alphaSapling;
    public static Block MCraftingTable;
    public static Block oreBauxite;
    public static Block blockAluminium;
    public static Block alphaPortal;
    public static Block marble;
    public static Block marbleCobble;
    public static Block marbleBrick;
    public static Block marbleStair;
    public static Block marbleCobbleStair;
    public static Block marbleBrickStair;
    public static Block marbleSlab;
    public static Block marbleCobbleSlab;
    public static Block marbleBrickSlab;
    public static Block marbleSlabDouble;
    public static Block marbleCobbleSlabDouble;
    public static Block marbleBrickSlabDouble;
    public static Block bloodLiquid;
    public static Block enditeLiquid;
    public static Block MTNT;
    public static Block oreSilver;
    public static Block blockSilver;
    public static Block oreSulfur;
    public static Block oreNetherSulfur;
    
    public static Block blockUru;
    
    //Fluid
    public static Fluid bloodFluid;
    public static Fluid enditeFluid;
    
    //Config
	    public static boolean TorchPlacement;
	    public static boolean EnderBatteryCrafting;
	    public static boolean ModSpawnEggs;
	    public static boolean WillMTNTExplode;
	    public static boolean SaddleRecipe;
	    public static boolean VanillaSpawnEggs;
	    public static boolean UraniumEffects;
	    
	    public static boolean ShortHand;
	    public static boolean JoinMsg;
	    
	    public static boolean CopperGen;
	    public static boolean TinGen;
	    public static boolean MulliteGen;
	    public static boolean RoxiteGen;
	    public static boolean AlphaGen;
	    public static boolean BauxiteGen;
	    public static boolean MarbleGen;
	    public static boolean EnditeGen;
	    public static boolean SilverGen;
	    public static boolean SulfurGen;
	    
	    public static boolean NetherSulfurGen;
	    
	    public static int MTNTExplode;
	    
	    public static int mulliteID;
	    public static int roxiteID;
	    public static int ingotCopperID;
	    public static int ingotSteelID;
	    public static int ingotTinID;
	    public static int dustAlphaID;
	    public static int mortarPestleID;
	    public static int mortarPestleReinfID;
	    public static int dustMulliteID;
	    public static int dustRoxiteID;
	    public static int dustCoalID;
	    public static int dustCharcoalID;
	    public static int dustBronzeID;
	    public static int dustCopperID;
	    public static int dustTinID;
	    public static int ingotBronzeID;
	    public static int redstoneBatteryID;
	    public static int aluminiumRawID;
	    public static int ingotAluminiumID;
	    public static int dustAluminiumID;
	    public static int bauxiteID;
	    public static int bloodID;
	    public static int mullak99SpawnID;
	    public static int ThundercoyoteSpawnID;
	    public static int ingotAlphaID;
	    public static int foamFingerID;
	    public static int ChainID;
	    public static int IronTippedArrowID;
	    public static int ingotSteelRawID;
	    public static int ingotWroughtIronID;
	    public static int grateID;
	    public static int portableCraftingID;
	    public static int enchantedMelonID;
	    public static int muttonRawID;
	    public static int muttonCookedID;
	    public static int fleshCookedID;
	    public static int alphaPorkchopRawID;
	    public static int alphaPorkchopCookedID;
	    public static int bucketChocMilkID;
	    public static int essenceAlphaID;
	    public static int pickaxeMulliteID;
	    public static int shovelMulliteID;
	    public static int swordMulliteID;
	    public static int axeMulliteID;
	    public static int hoeMulliteID;
	    public static int swordMulliteDEID;
	    public static int paxelMulliteID;
	    public static int pickaxeRoxiteID;
	    public static int shovelRoxiteID;
	    public static int swordRoxiteID;
	    public static int axeRoxiteID;
	    public static int hoeRoxiteID;
	    public static int swordRoxiteDEID;
	    public static int paxelRoxiteID;
	    public static int pickaxeBedrockID;
	    public static int shovelBedrockID;
	    public static int swordBedrockID;
	    public static int axeBedrockID;
	    public static int pickaxeBronzeID;
	    public static int shovelBronzeID;
	    public static int swordBronzeID;
	    public static int axeBronzeID;
	    public static int hoeBronzeID;
	    public static int paxelBronzeID;
	    public static int pickaxeSteelID;
	    public static int shovelSteelID;
	    public static int swordSteelID;
	    public static int axeSteelID;
	    public static int hoeSteelID;
	    public static int paxelSteelID;
	    public static int pickaxeAlphaID;
	    public static int shovelAlphaID;
	    public static int swordAlphaID;
	    public static int axeAlphaID;
	    public static int hoeAlphaID;
	    public static int paxelAlphaID;
	    public static int paxelIronID;
	    public static int paxelDiamondID;
	    public static int steelHammerID;
	    public static int essenceExtractorID;
	    public static int mulliteBowID;
	    public static int helmetMulliteID;
	    public static int chestMulliteID;
	    public static int legsMulliteID;
	    public static int bootsMulliteID;
	    public static int helmetRoxiteID;
	    public static int chestRoxiteID;
	    public static int legsRoxiteID;
	    public static int bootsRoxiteID;
	    public static int helmetBronzeID;
	    public static int chestBronzeID;
	    public static int legsBronzeID;
	    public static int bootsBronzeID;
	    public static int helmetSteelID;
	    public static int chestSteelID;
	    public static int legsSteelID;
	    public static int bootsSteelID;
	    public static int helmetAlphaID;
	    public static int chestAlphaID;
	    public static int legsAlphaID;
	    public static int bootsAlphaID;
	    public static int oreMulliteID;
	    public static int blockMulliteID;
	    public static int oreRoxiteID;
	    public static int blockRoxiteID;
	    public static int oreCopperID;
	    public static int blockCopperID;
	    public static int oreTinID;
	    public static int blockTinID;
	    public static int clearGlassID;
	    public static int thinClearGlassID;
	    public static int oreAlphaID;
	    public static int alphaCobbleID;
	    public static int alphaStoneID;
	    public static int blockAlphaID;
	    public static int blockBronzeID;
	    public static int alphaFurnaceIdleID;
	    public static int alphaFurnaceBurningID;
	    public static int alphaLeavesID;
	    public static int alphaGrassID;
	    public static int alphaSaplingID;
	    public static int MCraftingTableID;
	    public static int oreBauxiteID;
	    public static int blockAluminiumID;
	    public static int alphaPortalID;
	    public static int marbleID;
	    public static int marbleCobbleID;
	    public static int marbleBrickID;
	    public static int marbleStairID;
	    public static int marbleCobbleStairID;
	    public static int marbleBrickStairID;
	    public static int marbleSlabID;
	    public static int marbleCobbleSlabID;
	    public static int marbleBrickSlabID;
	    public static int marbleSlabDoubleID;
	    public static int marbleCobbleSlabDoubleID;
	    public static int marbleBrickSlabDoubleID;
	    public static int BatteryEmptyID;
	    public static int BatteryEnderID;
	    public static int bloodLiquidID;
	    public static int bloodBucketID;
	    public static int MTNTID;
	    public static int portalAlphaID;
	    public static int enditeID;
	    public static int enditeLiquidID;
	    public static int oreEnditeID;
	    public static int blockEnditeID;
	    public static int swordMulliteEEID;
	    public static int swordRoxiteEEID;
	    public static int paxelMulliteEEID;
	    public static int paxelRoxiteEEID;
	    public static int debugToolID;
	    public static int oreSilverID;
	    public static int blockSilverID;
	    public static int ingotSilverID;
	    public static int dustSilverID;
	    public static int sulfurID;
	    public static int oreSulfurID;
	    public static int oreNetherSulfurID;
	    public static int swordMulliteEEUrID;
	    public static int stickUraniumID;
	    public static int thorsHammerID;
	    public static int blockUruID;
	    public static int ingotUruID;
	    public static int enditeHammerID;
	    
    

	
	//Enum Tool Material
	public static EnumToolMaterial mulliteTools = EnumHelper.addToolMaterial("Mullite", 4, 2500, 10.0F, 5.0F, 20);
	public static EnumToolMaterial mulliteToolsDE = EnumHelper.addToolMaterial("MulliteDE", 4, 3000, 12.0F, 7.0F, 22);
	public static EnumToolMaterial mulliteToolsEE = EnumHelper.addToolMaterial("MulliteEE", 5, 5000, 20.0F, 9.0F, 29);
	public static EnumToolMaterial bronzeTools = EnumHelper.addToolMaterial("Bronze", 2, 300, 6.0F, 2.0F, 14);
	public static EnumToolMaterial steelTools = EnumHelper.addToolMaterial("Steel", 2, 500, 7.5F, 3.0F, 15);
	public static EnumToolMaterial alphaTools = EnumHelper.addToolMaterial("Alpha", 3, 512, 8.5F, 2.5F, 16);
	public static EnumToolMaterial bedrockTools = EnumHelper.addToolMaterial("Bedrock", 10, -1, 99999999999999999999999999999999999999.9F, 999999999, 999999999);
	public static EnumToolMaterial foamFingerTool = EnumHelper.addToolMaterial("Foam", 2, 100, 6.0F, 2.0F, 1);
	public static EnumToolMaterial silverTools = EnumHelper.addToolMaterial("Silver", 2, 300, 7.5F, 3.5F, 14);
	public static EnumToolMaterial stickTools = EnumHelper.addToolMaterial("Stick", 1, 200, 1.0F, 1.0F, 1);
	public static EnumToolMaterial hammerSteel = EnumHelper.addToolMaterial("SteelHammer", 3, 100, 2.0F, 2.0F, 5);
	public static EnumToolMaterial hammerEndite = EnumHelper.addToolMaterial("EnditeHammer", 5, 250, 5.0F, 5.0F, 10);
	public static EnumToolMaterial hammerThor = EnumHelper.addToolMaterial("ThorsHammer", 5, -1, 7.5F, 50.0F, 10);
	
	//Enum Armor Material
	public static EnumArmorMaterial mulliteArmor = EnumHelper.addArmorMaterial("Mullite", 40, new int[]{5, 8, 6, 5}, 25);
	public static EnumArmorMaterial mulliteArmorEE = EnumHelper.addArmorMaterial("MulliteEE", 45, new int[]{7, 10, 8, 7}, 29);
	public static EnumArmorMaterial bronzeArmor = EnumHelper.addArmorMaterial("Bronze", 15, new int[]{2, 6, 5, 2}, 9);
	public static EnumArmorMaterial steelArmor = EnumHelper.addArmorMaterial("Steel", 15, new int[]{3, 7, 6, 3}, 9);
	public static EnumArmorMaterial alphaArmor = EnumHelper.addArmorMaterial("Alpha", 20, new int[]{4, 7, 6, 4}, 12);
	
	
	public static AchievementPage mullak99sMod = new AchievementPage("mullak99's Mod 2");
	
		
	//Biome's
	//public static final BiomeGenBase alphaBiome = new alphaBiomeGen(alphaID);
	
	@EventHandler
	public void PreInit (FMLPreInitializationEvent event) {

		
		System.out.println(mullak99Util.mullak99sMod2String + "Loaded!");
		
		
		Configuration config = new Configuration(new File(event.getModConfigurationDirectory().getAbsolutePath() + File.separator + "mullak99" + File.separator + mullak99Util.ModID + ".mullak99cfg"));

		try {
	        config.load();
	
	        TorchPlacement = config.get(Configuration.CATEGORY_GENERAL, "Right clicking with Paxel places torch", true).getBoolean(false);
	        EnderBatteryCrafting = config.get(Configuration.CATEGORY_GENERAL, "Ender Battery recipe", true).getBoolean(false);
	        ModSpawnEggs = config.get(Configuration.CATEGORY_GENERAL, "mullak99, Thundercoyote and Pro_Ninja_Gamer spawn eggs recipe", true).getBoolean(false);
	        MTNTExplode = config.get(Configuration.CATEGORY_GENERAL, "Mullite TNT Explosion Size", 100).getInt();
	        WillMTNTExplode = config.get(Configuration.CATEGORY_GENERAL, "Will Mullite TNT Explode", true).getBoolean(false);
	        SaddleRecipe = config.get(Configuration.CATEGORY_GENERAL, "Is the Saddle recipe enabled", true).getBoolean(false);
	        VanillaSpawnEggs = config.get(Configuration.CATEGORY_GENERAL, "Vanilla spawn eggs recipe", true).getBoolean(false);
	        
	        ShortHand = config.get(Configuration.CATEGORY_GENERAL, "Shorter Version Number on game join", false).getBoolean(false);
	        JoinMsg = config.get(Configuration.CATEGORY_GENERAL, "Show message on game join", true).getBoolean(false);
	        
	        CopperGen = config.get(Configuration.CATEGORY_GENERAL, "Copper Ore Generation", true).getBoolean(false);
	        TinGen = config.get(Configuration.CATEGORY_GENERAL, "Tin Ore Generation", true).getBoolean(false);
	        MulliteGen = config.get(Configuration.CATEGORY_GENERAL, "Mullite Ore Generation", true).getBoolean(false);
	        RoxiteGen = config.get(Configuration.CATEGORY_GENERAL, "Roxite Ore Generation", true).getBoolean(false);
	        AlphaGen = config.get(Configuration.CATEGORY_GENERAL, "Nostalgia Ore Generation", true).getBoolean(false);
	        BauxiteGen = config.get(Configuration.CATEGORY_GENERAL, "Bauxite Ore Generation", true).getBoolean(false);
	        MarbleGen = config.get(Configuration.CATEGORY_GENERAL, "Marble Generation", true).getBoolean(false);
	        EnditeGen = config.get(Configuration.CATEGORY_GENERAL, "Endite Ore Generation", true).getBoolean(false);
	        SilverGen = config.get(Configuration.CATEGORY_GENERAL, "Silver Ore Generation", true).getBoolean(false);
	        SulfurGen = config.get(Configuration.CATEGORY_GENERAL, "Sulfur Ore Generation", true).getBoolean(false);
	        
	        NetherSulfurGen = config.get(Configuration.CATEGORY_GENERAL, "Nether Sulfur Ore Generation", true).getBoolean(false);
	        
	        mulliteID = config.get(Configuration.CATEGORY_ITEM, "Mullite", 4097).getInt();
		    roxiteID = config.get(Configuration.CATEGORY_ITEM, "Roxite", 4098).getInt();
		    ingotCopperID = config.get(Configuration.CATEGORY_ITEM, "Copper Ingot", 4099).getInt();
		    ingotSteelID = config.get(Configuration.CATEGORY_ITEM, "Steel Ingot", 4100).getInt();
		    ingotTinID = config.get(Configuration.CATEGORY_ITEM, "Tin Ingot", 4101).getInt();
		    dustAlphaID = config.get(Configuration.CATEGORY_ITEM, "Nostalgia Dust", 4102).getInt();
		    mortarPestleID = config.get(Configuration.CATEGORY_ITEM, "Mortar and Pestle", 4103).getInt();
		    mortarPestleReinfID = config.get(Configuration.CATEGORY_ITEM, "Reinforced Mortar and Pestle", 4104).getInt();
		    dustMulliteID = config.get(Configuration.CATEGORY_ITEM, "Mullite Dust", 4105).getInt();
		    dustRoxiteID = config.get(Configuration.CATEGORY_ITEM, "Roxite Dust", 4106).getInt();
		    dustCoalID = config.get(Configuration.CATEGORY_ITEM, "Coal Dust", 4107).getInt();
		    dustCharcoalID = config.get(Configuration.CATEGORY_ITEM, "Charcoal Dust", 4108).getInt();
		    dustBronzeID = config.get(Configuration.CATEGORY_ITEM, "Bronze Dust", 4109).getInt();
		    dustCopperID = config.get(Configuration.CATEGORY_ITEM, "Copper Dust", 4110).getInt();
		    dustTinID = config.get(Configuration.CATEGORY_ITEM, "Tin Dust", 4111).getInt();
		    ingotBronzeID = config.get(Configuration.CATEGORY_ITEM, "Bronze Ingot", 4112).getInt();
		    redstoneBatteryID = config.get(Configuration.CATEGORY_ITEM, "Redstone Battery", 4113).getInt();
		    aluminiumRawID = config.get(Configuration.CATEGORY_ITEM, "Aluminium Oxide", 4114).getInt();
		    ingotAluminiumID = config.get(Configuration.CATEGORY_ITEM, "Aluminium Ingot", 4115).getInt();
		    dustAluminiumID = config.get(Configuration.CATEGORY_ITEM, "Aluminium Dust", 4116).getInt();
		    bauxiteID = config.get(Configuration.CATEGORY_ITEM, "Bauxite", 4117).getInt();
		    bloodID = config.get(Configuration.CATEGORY_ITEM, "Blood", 4118).getInt();
		    mullak99SpawnID = config.get(Configuration.CATEGORY_ITEM, "Summon mullak99 (Not Implemented)", 4119).getInt();
		    ThundercoyoteSpawnID = config.get(Configuration.CATEGORY_ITEM, "Summon Thundercoyote (Not Implemented)", 4120).getInt();
		    ingotAlphaID = config.get(Configuration.CATEGORY_ITEM, "Nostalgia Ingot", 4121).getInt();
		    foamFingerID = config.get(Configuration.CATEGORY_ITEM, "Foam Finger (Not Implemented)", 4122).getInt();
		    ChainID = config.get(Configuration.CATEGORY_ITEM, "Chain", 4123).getInt();
		    IronTippedArrowID = config.get(Configuration.CATEGORY_ITEM, "Steel Arrow (Not Implemented)", 4124).getInt();
		    ingotSteelRawID = config.get(Configuration.CATEGORY_ITEM, "Raw Steel Ingot", 4125).getInt();
		    ingotWroughtIronID = config.get(Configuration.CATEGORY_ITEM, "Wrought Iron Ingot (Not Implemented)", 4126).getInt();
		    grateID = config.get(Configuration.CATEGORY_ITEM, "Grate", 4127).getInt();
		    portableCraftingID = config.get(Configuration.CATEGORY_ITEM, "Portable Crafting Table", 4128).getInt();
		    enchantedMelonID = config.get(Configuration.CATEGORY_ITEM, "Michael Melon", 4129).getInt();
		    muttonRawID = config.get(Configuration.CATEGORY_ITEM, "Raw Mutton", 4130).getInt();
		    muttonCookedID = config.get(Configuration.CATEGORY_ITEM, "Cooked Mutton", 4131).getInt();
		    fleshCookedID = config.get(Configuration.CATEGORY_ITEM, "Cooked Zombie Flesh", 4132).getInt();
		    alphaPorkchopRawID = config.get(Configuration.CATEGORY_ITEM, "Raw Nostalgia Porkchop", 4133).getInt();
		    alphaPorkchopCookedID = config.get(Configuration.CATEGORY_ITEM, "Cooked Nostalgia Porkchop", 4134).getInt();
		    bucketChocMilkID = config.get(Configuration.CATEGORY_ITEM, "Chocolate Milk", 4135).getInt();
		    essenceAlphaID = config.get(Configuration.CATEGORY_ITEM, "Essence of Nostalgia", 4136).getInt();
		    pickaxeMulliteID = config.get(Configuration.CATEGORY_ITEM, "Mullite Pickaxe", 4137).getInt();
		    shovelMulliteID = config.get(Configuration.CATEGORY_ITEM, "Mullite Shovel", 4138).getInt();
		    swordMulliteID = config.get(Configuration.CATEGORY_ITEM, "Mullite Sword", 4139).getInt();
		    axeMulliteID = config.get(Configuration.CATEGORY_ITEM, "Mullite Axe", 4140).getInt();
		    hoeMulliteID = config.get(Configuration.CATEGORY_ITEM, "Mullite Hoe", 4141).getInt();
		    swordMulliteDEID = config.get(Configuration.CATEGORY_ITEM, "Mullite Sword (Diamond-Edged)", 4142).getInt();
		    paxelMulliteID = config.get(Configuration.CATEGORY_ITEM, "Mullite Paxel", 4143).getInt();
		    pickaxeRoxiteID = config.get(Configuration.CATEGORY_ITEM, "Roxite Pickaxe", 4144).getInt();
		    shovelRoxiteID = config.get(Configuration.CATEGORY_ITEM, "Roxite Shovel", 4145).getInt();
		    swordRoxiteID = config.get(Configuration.CATEGORY_ITEM, "Roxite Sword", 4146).getInt();
		    axeRoxiteID = config.get(Configuration.CATEGORY_ITEM, "Roxite Axe", 4147).getInt();
		    hoeRoxiteID = config.get(Configuration.CATEGORY_ITEM, "Roxite Hoe", 4148).getInt();
		    swordRoxiteDEID = config.get(Configuration.CATEGORY_ITEM, "Roxite Sword (Diamond-Edged)", 4149).getInt();
		    paxelRoxiteID = config.get(Configuration.CATEGORY_ITEM, "Roxite Paxel", 4150).getInt();
		    pickaxeBedrockID = config.get(Configuration.CATEGORY_ITEM, "Bedrock Pickaxe", 4151).getInt();
		    shovelBedrockID = config.get(Configuration.CATEGORY_ITEM, "Bedrock Shovel", 4152).getInt();
		    swordBedrockID = config.get(Configuration.CATEGORY_ITEM, "Bedrock Sword", 4153).getInt();
		    axeBedrockID = config.get(Configuration.CATEGORY_ITEM, "Bedrock Axe", 4154).getInt();
		    pickaxeBronzeID = config.get(Configuration.CATEGORY_ITEM, "Bronze Pickaxe", 4155).getInt();
		    shovelBronzeID = config.get(Configuration.CATEGORY_ITEM, "Bronze Shovel", 4166).getInt();
		    swordBronzeID = config.get(Configuration.CATEGORY_ITEM, "Bronze Sword", 4167).getInt();
		    axeBronzeID = config.get(Configuration.CATEGORY_ITEM, "Bronze Axe", 4168).getInt();
		    hoeBronzeID = config.get(Configuration.CATEGORY_ITEM, "Bronze Hoe", 4169).getInt();
		    paxelBronzeID = config.get(Configuration.CATEGORY_ITEM, "Bronze Paxel", 4170).getInt();
		    pickaxeSteelID = config.get(Configuration.CATEGORY_ITEM, "Steel Pickaxe", 4171).getInt();
		    shovelSteelID = config.get(Configuration.CATEGORY_ITEM, "Steel Shovel", 4172).getInt();
		    swordSteelID = config.get(Configuration.CATEGORY_ITEM, "Steel Sword", 4173).getInt();
		    axeSteelID = config.get(Configuration.CATEGORY_ITEM, "Steel Axe", 4174).getInt();
		    hoeSteelID = config.get(Configuration.CATEGORY_ITEM, "Steel Hoe", 4175).getInt();
		    paxelSteelID = config.get(Configuration.CATEGORY_ITEM, "Steel Paxel", 4176).getInt();
		    pickaxeAlphaID = config.get(Configuration.CATEGORY_ITEM, "Nostalgia Pickaxe", 4177).getInt();
		    shovelAlphaID = config.get(Configuration.CATEGORY_ITEM, "Nostalgia Shovel", 4178).getInt();
		    swordAlphaID = config.get(Configuration.CATEGORY_ITEM, "Nostalgia Sword", 4179).getInt();
		    axeAlphaID = config.get(Configuration.CATEGORY_ITEM, "Nostalgia Axe", 4180).getInt();
		    hoeAlphaID = config.get(Configuration.CATEGORY_ITEM, "Nostalgia Hoe", 4181).getInt();
		    paxelAlphaID = config.get(Configuration.CATEGORY_ITEM, "Nostalgia Paxel", 4182).getInt();
		    paxelIronID = config.get(Configuration.CATEGORY_ITEM, "Iron Paxel", 4183).getInt();
		    paxelDiamondID = config.get(Configuration.CATEGORY_ITEM, "Diamond Paxel", 4184).getInt();
		    steelHammerID = config.get(Configuration.CATEGORY_ITEM, "Steel Hammer", 4185).getInt();
		    essenceExtractorID = config.get(Configuration.CATEGORY_ITEM, "Essence Extractor", 4186).getInt();
		    mulliteBowID = config.get(Configuration.CATEGORY_ITEM, "Mullite Bow (Not Implemented)", 4187).getInt();
		    helmetMulliteID = config.get(Configuration.CATEGORY_ITEM, "Mullite Helmet", 4188).getInt();
		    chestMulliteID = config.get(Configuration.CATEGORY_ITEM, "Mullite Chestplate", 4189).getInt();
		    legsMulliteID = config.get(Configuration.CATEGORY_ITEM, "Mullite Leggings", 4190).getInt();
		    bootsMulliteID = config.get(Configuration.CATEGORY_ITEM, "Mullite Boots", 4191).getInt();
		    helmetRoxiteID = config.get(Configuration.CATEGORY_ITEM, "Roxite Helmet", 4192).getInt();
		    chestRoxiteID = config.get(Configuration.CATEGORY_ITEM, "Roxite Chestplate", 4193).getInt();
		    legsRoxiteID = config.get(Configuration.CATEGORY_ITEM, "Roxite Leggings", 4194).getInt();
		    bootsRoxiteID = config.get(Configuration.CATEGORY_ITEM, "Roxite Boots", 4195).getInt();
		    helmetBronzeID = config.get(Configuration.CATEGORY_ITEM, "Bronze Helmet", 4196).getInt();
		    chestBronzeID = config.get(Configuration.CATEGORY_ITEM, "Bronze Chestplate", 4197).getInt();
		    legsBronzeID = config.get(Configuration.CATEGORY_ITEM, "Bronze Leggings", 4198).getInt();
		    bootsBronzeID = config.get(Configuration.CATEGORY_ITEM, "Bronze Boots", 4199).getInt();
		    helmetSteelID = config.get(Configuration.CATEGORY_ITEM, "Steel Helmet", 4200).getInt();
		    chestSteelID = config.get(Configuration.CATEGORY_ITEM, "Steel Chestplate", 4201).getInt();
		    legsSteelID = config.get(Configuration.CATEGORY_ITEM, "Steel Leggings", 4202).getInt();
		    bootsSteelID = config.get(Configuration.CATEGORY_ITEM, "Steel Boots", 4203).getInt();
		    helmetAlphaID = config.get(Configuration.CATEGORY_ITEM, "Nostalgia Helmet", 4204).getInt();
		    chestAlphaID = config.get(Configuration.CATEGORY_ITEM, "Nostalgia Chestplate", 4205).getInt();
		    legsAlphaID = config.get(Configuration.CATEGORY_ITEM, "Nostalgia Leggings", 4206).getInt();
		    bootsAlphaID = config.get(Configuration.CATEGORY_ITEM, "Nostalgia Boots", 4207).getInt();
	        oreMulliteID = config.get(Configuration.CATEGORY_BLOCK, "Mullite Ore", 500).getInt();
	        blockMulliteID = config.get(Configuration.CATEGORY_BLOCK, "Mullite Block", 501).getInt();
	        oreRoxiteID = config.get(Configuration.CATEGORY_BLOCK, "Roxite Ore", 502).getInt();
	        blockRoxiteID = config.get(Configuration.CATEGORY_BLOCK, "Roxite Block", 503).getInt();
	        oreCopperID = config.get(Configuration.CATEGORY_BLOCK, "Copper Ore", 504).getInt();
		    blockCopperID = config.get(Configuration.CATEGORY_BLOCK, "Bopper Block", 505).getInt();
		    oreTinID = config.get(Configuration.CATEGORY_BLOCK, "Tin Ore", 506).getInt();
		    blockTinID = config.get(Configuration.CATEGORY_BLOCK, "Tin Block", 507).getInt();
		    clearGlassID = config.get(Configuration.CATEGORY_BLOCK, "Clear Glass", 508).getInt();
		    thinClearGlassID = config.get(Configuration.CATEGORY_BLOCK, "Clear Glass Pane", 509).getInt();
		    oreAlphaID = config.get(Configuration.CATEGORY_BLOCK, "Nostalgia Ore", 510).getInt();
		    alphaCobbleID = config.get(Configuration.CATEGORY_BLOCK, "Nostalgia Cobblestone", 511).getInt();
		    alphaStoneID = config.get(Configuration.CATEGORY_BLOCK, "Nostalgia Stone", 512).getInt();
		    blockAlphaID = config.get(Configuration.CATEGORY_BLOCK, "Nostalgia Block", 513).getInt();
		    alphaLeavesID = config.get(Configuration.CATEGORY_BLOCK, "Nostalgia Leaves", 514).getInt();
		    alphaGrassID = config.get(Configuration.CATEGORY_BLOCK, "Nostalgia Grass", 515).getInt();
		    alphaSaplingID = config.get(Configuration.CATEGORY_BLOCK, "Nostalgia Sapling", 516).getInt();
		    blockBronzeID = config.get(Configuration.CATEGORY_BLOCK, "Bronze Block", 517).getInt();
		    MCraftingTableID = config.get(Configuration.CATEGORY_BLOCK, "Advanced Crafting Table", 518).getInt();
		    oreBauxiteID = config.get(Configuration.CATEGORY_BLOCK, "Bauxite Ore", 519).getInt();
		    blockAluminiumID = config.get(Configuration.CATEGORY_BLOCK, "Aluminium Block", 520).getInt();
		    marbleID = config.get(Configuration.CATEGORY_BLOCK, "Marble", 521).getInt();
		    marbleCobbleID = config.get(Configuration.CATEGORY_BLOCK, "Marble Cobblestone", 522).getInt();
		    marbleBrickID = config.get(Configuration.CATEGORY_BLOCK, "Marble Bricks", 523).getInt();
		    marbleStairID = config.get(Configuration.CATEGORY_BLOCK, "Marble Stairs", 524).getInt();
		    marbleCobbleStairID = config.get(Configuration.CATEGORY_BLOCK, "Marble Cobblestone Stairs", 525).getInt();
		    marbleBrickStairID = config.get(Configuration.CATEGORY_BLOCK, "Marble Bricks Stairs", 526).getInt();
		    marbleSlabID = config.get(Configuration.CATEGORY_BLOCK, "Marble Slab", 527).getInt();
		    marbleCobbleSlabID = config.get(Configuration.CATEGORY_BLOCK, "Marble Cobblestone Slab", 528).getInt();
		    marbleBrickSlabID = config.get(Configuration.CATEGORY_BLOCK, "Marble Bricks Slab", 529).getInt();
		    marbleSlabDoubleID = config.get(Configuration.CATEGORY_BLOCK, "Marble Double Slab", 530).getInt();
		    marbleCobbleSlabDoubleID = config.get(Configuration.CATEGORY_BLOCK, "Marble Cobblestone Double Slab", 531).getInt();
		    marbleBrickSlabDoubleID = config.get(Configuration.CATEGORY_BLOCK, "Marble Brick Double Slab", 532).getInt();
		    BatteryEmptyID = config.get(Configuration.CATEGORY_ITEM, "Battery Empty", 533).getInt();
		    BatteryEnderID = config.get(Configuration.CATEGORY_ITEM, "Ender Battery", 534).getInt();
		    bloodBucketID = config.get(Configuration.CATEGORY_ITEM, "Bucket of Blood", 535).getInt();
		    bloodLiquidID = config.get(Configuration.CATEGORY_BLOCK, "Blood", 536).getInt();
		    MTNTID = config.get(Configuration.CATEGORY_BLOCK, "Mullite TNT", 537).getInt();
		    portalAlphaID = config.get(Configuration.CATEGORY_BLOCK, "Nostalgia Portal", 538).getInt();
		    oreEnditeID = config.get(Configuration.CATEGORY_BLOCK, "Endite Ore", 539).getInt();
		    blockEnditeID = config.get(Configuration.CATEGORY_BLOCK, "Endite Block", 540).getInt();
		    oreSilverID = config.get(Configuration.CATEGORY_BLOCK, "Silver Ore", 541).getInt();
		    blockSilverID = config.get(Configuration.CATEGORY_BLOCK, "Silver Block", 542).getInt();
		    oreSulfurID = config.get(Configuration.CATEGORY_BLOCK, "Sulfur Ore", 543).getInt();
		    oreNetherSulfurID = config.get(Configuration.CATEGORY_BLOCK, "Nether Sulfur Ore", 544).getInt();
		    blockUruID = config.get(Configuration.CATEGORY_BLOCK, "Uru Block", 546).getInt();
		    
		    
		    swordMulliteEEID = config.get(Configuration.CATEGORY_ITEM, "Mullite Sword (Endite-Edged)", 4210).getInt();
		    swordRoxiteEEID = config.get(Configuration.CATEGORY_ITEM, "Roxite Sword (Endite-Edged)", 4211).getInt();
		    paxelMulliteEEID = config.get(Configuration.CATEGORY_ITEM, "Mullite Paxel (Endite-Edged)", 4212).getInt();
		    paxelRoxiteEEID = config.get(Configuration.CATEGORY_ITEM, "Roxite Paxel (Endite-Edged)", 4213).getInt();
		    debugToolID = config.get(Configuration.CATEGORY_ITEM, "Debug Tool", 4214).getInt();
		    ingotSilverID = config.get(Configuration.CATEGORY_ITEM, "Silver Ingot", 4215).getInt();
		    dustSilverID = config.get(Configuration.CATEGORY_ITEM, "Silver Dust", 4216).getInt();
		    sulfurID = config.get(Configuration.CATEGORY_ITEM, "Sulfur", 4217).getInt();
		    swordMulliteEEUrID = config.get(Configuration.CATEGORY_ITEM, "Mullite Sword (Endite-Edged && Uranium-Edged)", 4224).getInt();
		    thorsHammerID = config.get(Configuration.CATEGORY_ITEM, "Thor's Hammer", 4226).getInt();
		    ingotUruID = config.get(Configuration.CATEGORY_ITEM, "Uru Ingot", 4227).getInt();
		    enditeHammerID = config.get(Configuration.CATEGORY_ITEM, "Endite Hammer", 4228).getInt();
		    
		    
		    
		}
		    
		catch(Exception e) {
			System.out.println(mullak99Util.mullak99sMod2String + "Failed to load config!");
		}
			
		finally {
			if (config.hasChanged()) {
				config.save();
			}
			else {
				
			}
		}
	        
		NetworkRegistry.instance().registerGuiHandler(mullak99.instance, (IGuiHandler) new MCraftingGUIHandler());
		mullakCore.registerEntity(mullak99Mob.class, "mullak99", 0x000FF00, 0x000000);
		mullakCore.registerEntity(ThundercoyoteMob.class, "Thundercoyote", 0x7F7F7F, 0x000000);
		mullakCore.registerEntity(ProNinjaGamerMob.class, "Pro_Ninja_Gamer", 0x6600CC, 0x000000);
		mullakCore.registerEntity(lucozade_wallerMob.class, "lucozade_waller", 0xFFAE00, 0x0011FF);
		
		
		
		AchievementPage.registerAchievementPage(mullak99sMod);
		
		
	}
		
		
	
						
			
	@SidedProxy (clientSide="mullak99.mullak99sMod.client.ClientProxy", serverSide="mullak99.mullak99sMod.CommonProxy")
	public static CommonProxy proxy;
	
	@SideOnly(Side.CLIENT)
	public static void addDevCapes() {

		String capeURL = mullak99Util.DevCapePicURL;
		String getArrayFromUrl = mullak99Util.DevCapeTXTURL;
		String[] devs = CapeCore.getArrayFromUrl(getArrayFromUrl);
		

		ThreadDownloadImageData image = new ThreadDownloadImageData(capeURL, null, null);

		for (String username : devs) {

		Minecraft.getMinecraft().renderEngine.loadTexture(new ResourceLocation("cloaks/" + username), (TextureObject) image);
		}
		}
	@SideOnly(Side.CLIENT)
	public static void addTesterCapes() {

		String capeURL = mullak99Util.TesterCapePicURL;
		String getArrayFromUrl = mullak99Util.TesterCapeTXTURL;
		String[] devs = CapeCore.getArrayFromUrl(getArrayFromUrl);
		

		ThreadDownloadImageData image = new ThreadDownloadImageData(capeURL, null, null);

		for (String username : devs) {

		Minecraft.getMinecraft().renderEngine.loadTexture(new ResourceLocation("cloaks/" + username), (TextureObject) image);
		}
		}
	@SideOnly(Side.CLIENT)
	public static void addYoutuberCapes() {

		String capeURL = mullak99Util.YoutuberCapePicURL;
		String getArrayFromUrl = mullak99Util.YoutuberCapeTXTURL;
		String[] devs = CapeCore.getArrayFromUrl(getArrayFromUrl);
		

		ThreadDownloadImageData image = new ThreadDownloadImageData(capeURL, null, null);

		for (String username : devs) {

		Minecraft.getMinecraft().renderEngine.loadTexture(new ResourceLocation("cloaks/" + username), (TextureObject) image);
		}
		}
	@SideOnly(Side.CLIENT)
	public static void addDonatorCapes1() {

		String capeURL = mullak99Util.DonatorCape1PicURL;
		String getArrayFromUrl = mullak99Util.DonatorCape1TXTURL;
		String[] devs = CapeCore.getArrayFromUrl(getArrayFromUrl);
		

		ThreadDownloadImageData image = new ThreadDownloadImageData(capeURL, null, null);

		for (String username : devs) {

		Minecraft.getMinecraft().renderEngine.loadTexture(new ResourceLocation("cloaks/" + username), (TextureObject) image);
		}
		}
	@SideOnly(Side.CLIENT)
	public static void addDonatorCapes2() {

		String capeURL = mullak99Util.DonatorCape2PicURL;
		String getArrayFromUrl = mullak99Util.DonatorCape2TXTURL;
		String[] devs = CapeCore.getArrayFromUrl(getArrayFromUrl);
		

		ThreadDownloadImageData image = new ThreadDownloadImageData(capeURL, null, null);

		for (String username : devs) {

		Minecraft.getMinecraft().renderEngine.loadTexture(new ResourceLocation("cloaks/" + username), (TextureObject) image);
		}
		}
	@SideOnly(Side.CLIENT)
	public static void addDonatorCapes3() {

		String capeURL = mullak99Util.DonatorCape3PicURL;
		String getArrayFromUrl = mullak99Util.DonatorCape3TXTURL;
		String[] devs = CapeCore.getArrayFromUrl(getArrayFromUrl);
		

		ThreadDownloadImageData image = new ThreadDownloadImageData(capeURL, null, null);

		for (String username : devs) {

		Minecraft.getMinecraft().renderEngine.loadTexture(new ResourceLocation("cloaks/" + username), (TextureObject) image);
		}
		}
	
	@SideOnly(Side.CLIENT)
	public static void addMelonCape() {

		String capeURL = mullak99Util.MelonCapePicURL;
		String getArrayFromUrl = mullak99Util.MelonCapeTXTURL;
		String[] devs = CapeCore.getArrayFromUrl(getArrayFromUrl);
		

		ThreadDownloadImageData image = new ThreadDownloadImageData(capeURL, null, null);

		for (String username : devs) {

		Minecraft.getMinecraft().renderEngine.loadTexture(new ResourceLocation("cloaks/" + username), (TextureObject) image);
		}
		}

	@EventHandler
	public void load (FMLInitializationEvent event) {
		
		
		
		proxy.setupCapes();
		
		//Items
		mullite = new genericItem(mulliteID).setMaxStackSize(64).setCreativeTab(mullak99CT.tabMullak99sModI).setTextureName("mullak99:Mullite").setUnlocalizedName("mullak99:mullite");
		roxite = new genericItem(roxiteID).setMaxStackSize(64).setCreativeTab(mullak99CT.tabMullak99sModI).setTextureName("mullak99:Roxite").setUnlocalizedName("mullak99:roxite");
		ingotCopper = new genericItem(ingotCopperID).setMaxStackSize(64).setCreativeTab(mullak99CT.tabMullak99sModI).setTextureName("mullak99:ingotCopper").setUnlocalizedName("mullak99:ingotCopper");
		ingotSteel = new genericItem(ingotSteelID).setMaxStackSize(64).setCreativeTab(mullak99CT.tabMullak99sModI).setTextureName("mullak99:ingotSteel").setUnlocalizedName("mullak99:ingotSteel");
		ingotTin = new genericItem(ingotTinID).setMaxStackSize(64).setCreativeTab(mullak99CT.tabMullak99sModI).setTextureName("mullak99:ingotTin").setUnlocalizedName("mullak99:ingotTin");
		dustAlpha = new genericItem(dustAlphaID).setMaxStackSize(64).setCreativeTab(mullak99CT.tabMullak99sModI).setTextureName("mullak99:dustAlpha").setUnlocalizedName("mullak99:dustAlpha");
		dustMullite = new genericItem(dustMulliteID).setMaxStackSize(64).setCreativeTab(mullak99CT.tabMullak99sModI).setTextureName("mullak99:dustMullite").setUnlocalizedName("mullak99:mulliteDust");
		dustRoxite = new genericItem(dustRoxiteID).setMaxStackSize(64).setCreativeTab(mullak99CT.tabMullak99sModI).setTextureName("mullak99:dustRoxite").setUnlocalizedName("rmullak99:oxiteDust");
		dustCoal = new genericItem(dustCoalID).setMaxStackSize(64).setCreativeTab(mullak99CT.tabMullak99sModI).setTextureName("mullak99:dustCoal").setUnlocalizedName("mullak99:coalDust");
		dustCharcoal = new genericItem(dustCharcoalID).setMaxStackSize(64).setCreativeTab(mullak99CT.tabMullak99sModI).setTextureName("mullak99:dustCoal").setUnlocalizedName("mullak99:charcoalDust");
		dustBronze = new genericItem(dustBronzeID).setMaxStackSize(64).setCreativeTab(mullak99CT.tabMullak99sModI).setTextureName("mullak99:dustBronze").setUnlocalizedName("mullak99:bronzeDust");
		dustCopper = new genericItem(dustCopperID).setMaxStackSize(64).setCreativeTab(mullak99CT.tabMullak99sModI).setTextureName("mullak99:dustCopper").setUnlocalizedName("mullak99:copperDust");
		dustTin = new genericItem(dustTinID).setMaxStackSize(64).setCreativeTab(mullak99CT.tabMullak99sModI).setTextureName("mullak99:dustTin").setUnlocalizedName("mullak99:tinDust");
		ingotBronze = new genericItem(ingotBronzeID).setMaxStackSize(64).setCreativeTab(mullak99CT.tabMullak99sModI).setTextureName("mullak99:ingotBronze").setUnlocalizedName("mullak99:ingotBronze");
		endite = new endite(enditeID).setMaxStackSize(64).setCreativeTab(mullak99CT.tabMullak99sModI).setTextureName("mullak99:endite").setUnlocalizedName("mullak99:endite");
		
		sulfur = new genericItem(sulfurID).setMaxStackSize(64).setCreativeTab(mullak99CT.tabMullak99sModI).setTextureName("mullak99:sulfur").setUnlocalizedName("mullak99:sulfur");
		
		aluminiumRaw = new genericItem(aluminiumRawID).setMaxStackSize(64).setCreativeTab(mullak99CT.tabMullak99sModI).setTextureName("mullak99:aluminiumOxide").setUnlocalizedName("mullak99:aluminiumOxide");
		ingotAluminium = new genericItem(ingotAluminiumID).setMaxStackSize(64).setCreativeTab(mullak99CT.tabMullak99sModI).setTextureName("mullak99:ingotAluminium").setUnlocalizedName("mullak99:ingotAluminium");
		
		bauxite = new genericItem(bauxiteID).setMaxStackSize(64).setCreativeTab(mullak99CT.tabMullak99sModI).setTextureName("mullak99:bauxite").setUnlocalizedName("mullak99:bauxite");
		dustAluminium = new genericItem(dustAluminiumID).setMaxStackSize(64).setCreativeTab(mullak99CT.tabMullak99sModI).setTextureName("mullak99:dustAluminium").setUnlocalizedName("mullak99:dustAluminium");
		
		ingotSteelRaw = new genericItem(ingotSteelRawID).setMaxStackSize(64).setCreativeTab(mullak99CT.tabMullak99sModI).setTextureName("mullak99:ingotSteelRaw").setUnlocalizedName("mullak99:ingotSteelRaw");
		
		redstoneBattery = new Battery(redstoneBatteryID).setMaxStackSize(1).setContainerItem(BatteryEmpty).setCreativeTab(mullak99CT.tabMullak99sModI).setTextureName("mullak99:redstoneBattery").setUnlocalizedName("mullak99:redstoneBattery");
		
		grate = new genericItem(grateID).setMaxStackSize(64).setCreativeTab(mullak99CT.tabMullak99sModI).setTextureName("mullak99:grate").setUnlocalizedName("mullak99:grate");
		
		ingotAlpha = new genericItem(ingotAlphaID).setMaxStackSize(64).setCreativeTab(mullak99CT.tabMullak99sModI).setTextureName("mullak99:ingotAlpha").setUnlocalizedName("mullak99:ingotAlpha");
		Chain = new genericItem(ChainID).setMaxStackSize(64).setCreativeTab(mullak99CT.tabMullak99sModI).setTextureName("mullak99:Chain").setUnlocalizedName("mullak99:Chain");
		
		BatteryEmpty = new BatteryEmpty(BatteryEmptyID).setMaxStackSize(16).setCreativeTab(mullak99CT.tabMullak99sModI).setTextureName("mullak99:emptyBattery").setUnlocalizedName("mullak99:emptyBattery");
		BatteryEnder = new BatteryEnder(BatteryEnderID).setMaxStackSize(1).setCreativeTab(mullak99CT.tabMullak99sModI).setTextureName("mullak99:enderBattery").setUnlocalizedName("mullak99:enderBattery");
		bloodBucket = new bloodBucket(bloodBucketID, bloodLiquidID).setMaxStackSize(1).setContainerItem(Item.bucketEmpty).setCreativeTab(mullak99CT.tabMullak99sModWIP).setTextureName("mullak99:bloodBucket").setUnlocalizedName("mullak99:bloodBucket");
		
		ingotSilver = new genericItem(ingotSilverID).setMaxStackSize(64).setCreativeTab(mullak99CT.tabMullak99sModI).setTextureName("mullak99:ingotSilver").setUnlocalizedName("mullak99:ingotSilver");
		dustSilver = new genericItem(dustSilverID).setMaxStackSize(64).setCreativeTab(mullak99CT.tabMullak99sModI).setTextureName("mullak99:dustSilver").setUnlocalizedName("mullak99:dustSilver");
		
		
		ingotUru = new genericItem(ingotUruID).setMaxStackSize(64).setCreativeTab(mullak99CT.tabMullak99sModI).setTextureName("mullak99:ingotUru").setUnlocalizedName("mullak99:ingotUru");
		
		//foamFinger = new swordMullite(1038, foamFingerTool).setMaxStackSize(64).setCreativeTab(mullak99CT.tabMullak99sModI).setTextureName("mullak99:foamFinger").setUnlocalizedName("mullak99:foamFinger");
			
			//Food
			enchantedMelon = new enchantedMelon(enchantedMelonID, 20, 1.2F, false).setAlwaysEdible().setPotionEffect(Potion.regeneration.id, 2400, 16, 1.0F).setPotionEffect(Potion.resistance.id, 2400, 16, 1.0F).setPotionEffect(Potion.fireResistance.id, 2400, 16, 1.0F).setCreativeTab(mullak99CT.tabMullak99sModFood).setUnlocalizedName("mullak99:enchantedMelon").setTextureName("melon");
			muttonRaw = (new ItemFood(muttonRawID, 3, 0.3F, true)).setCreativeTab(mullak99CT.tabMullak99sModFood).setUnlocalizedName("mullak99:muttonRaw").setTextureName("mullak99:muttonRaw");
			muttonCooked = (new ItemFood(muttonCookedID, 8, 0.8F, true)).setCreativeTab(mullak99CT.tabMullak99sModFood).setUnlocalizedName("mullak99:muttonCooked").setTextureName("mullak99:muttonCooked");
			fleshCooked = (new ItemFood(fleshCookedID, 6, 0.4F, true)).setCreativeTab(mullak99CT.tabMullak99sModFood).setUnlocalizedName("mullak99:fleshCooked").setTextureName("mullak99:fleshCooked");
			alphaPorkchopRaw = (new ItemAlphaFood(alphaPorkchopRawID, 3, 0.3F, true)).setCreativeTab(mullak99CT.tabMullak99sModFood).setUnlocalizedName("mullak99:alphaPorkchopRaw").setTextureName("mullak99:alphaPorkchopRaw");
			alphaPorkchopCooked = (new ItemAlphaFood(alphaPorkchopCookedID, 8, 0.8F, true)).setCreativeTab(mullak99CT.tabMullak99sModFood).setUnlocalizedName("mullak99:alphaPorkchopCooked").setTextureName("mullak99:alphaPorkchopCooked");
		
			//Drink
			bucketChocMilk = new bucketChocMilk(bucketChocMilkID).setUnlocalizedName("bucketChocMilk").setCreativeTab(mullak99CT.tabMullak99sModFood).setTextureName("mullak99:bucketChocMilk");
			blood = new blood(bloodID).setMaxStackSize(64).setCreativeTab(mullak99CT.tabMullak99sModFood).setTextureName("mullak99:blood").setUnlocalizedName("mullak99:blood");
			essenceAlpha = new essenceAlpha(essenceAlphaID).setMaxStackSize(64).setCreativeTab(mullak99CT.tabMullak99sModFood).setTextureName("mullak99:essenceAlpha").setUnlocalizedName("mullak99:essenceAlpha");
			
			//Tools
			pickaxeMullite = new pickaxeMullite(pickaxeMulliteID, mulliteTools).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:pickaxeMullite").setUnlocalizedName("mullak99:pickaxeMullite");
			shovelMullite = new shovelMullite(shovelMulliteID, mulliteTools).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:shovelMullite").setUnlocalizedName("mullak99:shovelMullite");
			swordMullite = new swordMullite(swordMulliteID, mulliteTools).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:swordMullite").setUnlocalizedName("mullak99:swordMullite");
			axeMullite = new axeMullite(axeMulliteID, mulliteTools).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:axeMullite").setUnlocalizedName("mullak99:axeMullite");
			hoeMullite = new hoeMullite(hoeMulliteID, mulliteTools).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:hoeMullite").setUnlocalizedName("mullak99:hoeMullite");
			swordMulliteDE = new swordMulliteDE(swordMulliteDEID, mulliteToolsDE).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:swordMulliteDE").setUnlocalizedName("mullak99:swordMulliteDE");
			swordMulliteEE = new swordMulliteEE(swordMulliteEEID, mulliteToolsEE).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:swordMulliteEE").setUnlocalizedName("mullak99:swordMulliteEE");
			swordMulliteEEUr = new swordMulliteUr(swordMulliteEEUrID, mulliteToolsEE).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:swordMulliteEEUr").setUnlocalizedName("mullak99:swordMulliteEEUr");
			
			pickaxeRoxite = new pickaxeMullite(pickaxeRoxiteID, mulliteTools).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:pickaxeRoxite").setUnlocalizedName("mullak99:pickaxeRoxite");
			shovelRoxite = new shovelMullite(shovelRoxiteID, mulliteTools).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:shovelRoxite").setUnlocalizedName("mullak99:shovelRoxite");
			swordRoxite = new swordMullite(swordRoxiteID, mulliteTools).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:swordRoxite").setUnlocalizedName("mullak99:swordRoxite");
			axeRoxite = new axeMullite(axeRoxiteID, mulliteTools).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:axeRoxite").setUnlocalizedName("mullak99:axeRoxite");
			hoeRoxite = new hoeMullite(hoeRoxiteID, mulliteTools).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:hoeRoxite").setUnlocalizedName("mullak99:hoeRoxite");
			swordRoxiteDE = new swordMulliteDE(swordRoxiteDEID, mulliteToolsDE).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:swordRoxiteDE").setUnlocalizedName("mullak99:swordRoxiteDE");
			swordRoxiteEE = new swordMulliteEE(swordRoxiteEEID, mulliteToolsEE).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:swordRoxiteEE").setUnlocalizedName("mullak99:swordRoxiteEE");
			
			pickaxeBronze = new pickaxeMullite(pickaxeBronzeID, bronzeTools).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:pickaxeBronze").setUnlocalizedName("mullak99:pickaxeBronze");
			shovelBronze = new shovelMullite(shovelBronzeID, bronzeTools).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:shovelBronze").setUnlocalizedName("mullak99:shovelBronze");
			swordBronze = new swordMullite(swordBronzeID, bronzeTools).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:swordBronze").setUnlocalizedName("mullak99:swordBronze");
			axeBronze = new axeMullite(axeBronzeID, bronzeTools).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:axeBronze").setUnlocalizedName("mullak99:axeBronze");
			hoeBronze = new hoeMullite(hoeBronzeID, bronzeTools).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:hoeBronze").setUnlocalizedName("mullak99:hoeBronze");
			
			pickaxeSteel = new pickaxeMullite(pickaxeSteelID, steelTools).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:pickaxeSteel").setUnlocalizedName("mullak99:pickaxeSteel");
			shovelSteel = new shovelMullite(shovelSteelID, steelTools).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:shovelSteel").setUnlocalizedName("mullak99:shovelSteel");
			swordSteel = new swordMullite(swordSteelID, steelTools).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:swordSteel").setUnlocalizedName("mullak99:swordSteel");
			axeSteel = new axeMullite(axeSteelID, steelTools).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:axeSteel").setUnlocalizedName("mullak99:axeSteel");
			hoeSteel = new hoeMullite(hoeSteelID, steelTools).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:hoeSteel").setUnlocalizedName("mullak99:hoeSteel");
			
			pickaxeAlpha = new pickaxeMullite(pickaxeAlphaID, alphaTools).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:pickaxeAlpha").setUnlocalizedName("mullak99:pickaxeAlpha");
			shovelAlpha = new shovelMullite(shovelAlphaID, alphaTools).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:shovelAlpha").setUnlocalizedName("mullak99:shovelAlpha");
			swordAlpha = new swordMullite(swordAlphaID, alphaTools).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:swordAlpha").setUnlocalizedName("mullak99:swordAlpha");
			axeAlpha = new axeMullite(axeAlphaID, alphaTools).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:axeAlpha").setUnlocalizedName("mullak99:axeAlpha");
			hoeAlpha = new hoeMullite(hoeAlphaID, alphaTools).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:hoeAlpha").setUnlocalizedName("mullak99:hoeAlpha");
			
			pickaxeBedrock = new pickaxeMullite(pickaxeBedrockID, bedrockTools).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:pickaxeBedrock").setUnlocalizedName("mullak99:pickaxeBedrock");
			shovelBedrock = new shovelMullite(shovelBedrockID, bedrockTools).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:shovelBedrock").setUnlocalizedName("mullak99:shovelBedrock");
			swordBedrock = new swordMullite(swordBedrockID, bedrockTools).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:swordBedrock").setUnlocalizedName("mullak99:swordBedrock");
			axeBedrock = new axeMullite(axeBedrockID, bedrockTools).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:axeBedrock").setUnlocalizedName("mullak99:axeBedrock");
			
			paxelIron = new Paxel(paxelIronID, EnumToolMaterial.IRON).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:paxelIron").setUnlocalizedName("mullak99:paxelIron");
			paxelDiamond = new Paxel(paxelDiamondID, EnumToolMaterial.EMERALD).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:paxelDiamond").setUnlocalizedName("mullak99:paxelDiamond");
			paxelMullite = new Paxel(paxelMulliteID, mulliteTools).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:paxelMullite").setUnlocalizedName("mullak99:paxelMullite");
			paxelRoxite = new Paxel(paxelRoxiteID, mulliteTools).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:paxelRoxite").setUnlocalizedName("mullak99:paxelRoxite");
			paxelBronze = new Paxel(paxelBronzeID, bronzeTools).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:paxelBronze").setUnlocalizedName("mullak99:paxelBronze");
			paxelSteel = new Paxel(paxelSteelID, steelTools).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:paxelSteel").setUnlocalizedName("mullak99:paxelSteel");
			paxelAlpha = new Paxel(paxelAlphaID, alphaTools).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:paxelAlpha").setUnlocalizedName("mullak99:paxelAlpha");
			
			paxelMulliteEE = new PaxelEE(paxelMulliteEEID, mulliteToolsEE).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:paxelMulliteEE").setUnlocalizedName("mullak99:paxelMulliteEE");
			paxelRoxiteEE = new PaxelEE(paxelRoxiteEEID, mulliteToolsEE).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:paxelRoxiteEE").setUnlocalizedName("mullak99:paxelRoxiteEE");
			
			portableCrafting = new portableCrafting(portableCraftingID).setMaxStackSize(64).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:portableCrafting").setUnlocalizedName("mullak99:portableCrafting");
			
			
			
			thorsHammer = new ThorsHammer(thorsHammerID, hammerThor, 4).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:thorsHammer").setUnlocalizedName("mullak99:thorsHammer");
			enditeHammer = new Hammer(enditeHammerID, hammerEndite).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:enditeHammer").setUnlocalizedName("mullak99:enditeHammer");
			
			//debugTool = new debugTool(debugToolID).setMaxStackSize(1).setCreativeTab(mullak99CT.tabMullak99sModWIP).setTextureName("mullak99:debugTool").setUnlocalizedName("mullak99:debugTool"); 
			
			//alphaPortal = new alphaPortal(4500).setUnlocalizedName("mullak99:alphaPortal");
			
			mortarPestle = new mortarPestle(mortarPestleID).setMaxStackSize(1).setMaxDamage(64).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:mortarPestle").setUnlocalizedName("mullak99:mortarPestle");
			mortarPestleReinf = new mortarPestle(mortarPestleReinfID).setMaxStackSize(1).setMaxDamage(1024).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:mortarPestleReinf").setUnlocalizedName("mullak99:mortarPestleReinf");
			steelHammer = new Hammer(steelHammerID, hammerSteel).setMaxStackSize(1).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:steelHammer").setUnlocalizedName("mullak99:steelHammer");
			essenceExtractor = new essenceExtractor(essenceExtractorID, mullakCore.nullTool).setMaxStackSize(1).setMaxDamage(64).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:essenceExtractor").setUnlocalizedName("mullak99:essenceExtractor");
			
			//Armor

			int renderMulliteArmor = proxy.addArmor("mulliteArmor");
			int renderRoxiteArmor = proxy.addArmor("roxiteArmor");
			int renderBronzeArmor = proxy.addArmor("bronzeArmor");
			int renderSteelArmor = proxy.addArmor("steelArmor");
			int renderAlphaArmor = proxy.addArmor("alphaArmor");
			
			
			helmetMullite = new mulliteArmor(helmetMulliteID, mulliteArmor, renderMulliteArmor, 0).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:helmetMullite").setUnlocalizedName("mullak99:helmetMullite");
			chestMullite = new mulliteArmor(chestMulliteID, mulliteArmor, renderMulliteArmor, 1).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:chestMullite").setUnlocalizedName("mullak99:chestMullite");
			legsMullite = new mulliteArmor(legsMulliteID, mulliteArmor, renderMulliteArmor, 2).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:legsMullite").setUnlocalizedName("mullak99:legsMullite");
			bootsMullite = new mulliteArmor(bootsMulliteID, mulliteArmor, renderMulliteArmor, 3).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:bootsMullite").setUnlocalizedName("mullak99:bootsMullite");
			
			helmetRoxite = new roxiteArmor(helmetRoxiteID, mulliteArmor, renderRoxiteArmor, 0).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:helmetRoxite").setUnlocalizedName("mullak99:helmetRoxite");
			chestRoxite = new roxiteArmor(chestRoxiteID, mulliteArmor, renderRoxiteArmor, 1).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:chestRoxite").setUnlocalizedName("mullak99:chestRoxite");
			legsRoxite = new roxiteArmor(legsRoxiteID, mulliteArmor, renderRoxiteArmor, 2).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:legsRoxite").setUnlocalizedName("mullak99:legsRoxite");
			bootsRoxite = new roxiteArmor(bootsRoxiteID, mulliteArmor, renderRoxiteArmor, 3).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:bootsRoxite").setUnlocalizedName("mullak99:bootsRoxite");
			
			helmetBronze = new bronzeArmor(helmetBronzeID, bronzeArmor, renderBronzeArmor, 0).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:helmetBronze").setUnlocalizedName("mullak99:helmetBronze");
			chestBronze = new bronzeArmor(chestBronzeID, bronzeArmor, renderBronzeArmor, 1).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:chestBronze").setUnlocalizedName("mullak99:chestBronze");
			legsBronze = new bronzeArmor(legsBronzeID, bronzeArmor, renderBronzeArmor, 2).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:legsBronze").setUnlocalizedName("mullak99:legsBronze");
			bootsBronze = new bronzeArmor(bootsBronzeID, bronzeArmor, renderBronzeArmor, 3).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:bootsBronze").setUnlocalizedName("mullak99:bootsBronze");
			
			helmetSteel = new steelArmor(helmetSteelID, steelArmor, renderSteelArmor, 0).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:helmetSteel").setUnlocalizedName("mullak99:helmetSteel");
			chestSteel = new steelArmor(chestSteelID, steelArmor, renderSteelArmor, 1).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:chestSteel").setUnlocalizedName("mullak99:chestSteel");
			legsSteel = new steelArmor(legsSteelID, steelArmor, renderSteelArmor, 2).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:legsSteel").setUnlocalizedName("mullak99:legsSteel");
			bootsSteel = new steelArmor(bootsSteelID, steelArmor, renderSteelArmor, 3).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:bootsSteel").setUnlocalizedName("mullak99:bootsSteel");
			
			helmetAlpha = new alphaArmor(helmetAlphaID, alphaArmor, renderAlphaArmor, 0).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:helmetAlpha").setUnlocalizedName("mullak99:helmetAlpha");
			chestAlpha = new alphaArmor(chestAlphaID, alphaArmor, renderAlphaArmor, 1).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:chestAlpha").setUnlocalizedName("mullak99:chestAlpha");
			legsAlpha = new alphaArmor(legsAlphaID, alphaArmor, renderAlphaArmor, 2).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:legsAlpha").setUnlocalizedName("mullak99:legsAlpha");
			bootsAlpha = new alphaArmor(bootsAlphaID, alphaArmor, renderAlphaArmor, 3).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:bootsAlpha").setUnlocalizedName("mullak99:bootsAlpha");
			
			
		//Blocks
		oreMullite = new oreMullite(oreMulliteID, Material.rock).setHardness(4.0F).setStepSound(Block.soundStoneFootstep).setCreativeTab(mullak99CT.tabMullak99sModB).setTextureName("mullak99:oreMullite").setUnlocalizedName("mullak99:oreMullite");
		blockMullite = new genericBlock(blockMulliteID, Material.iron).setHardness(5.0F).setStepSound(Block.soundMetalFootstep).setCreativeTab(mullak99CT.tabMullak99sModB).setTextureName("mullak99:blockMullite").setUnlocalizedName("mullak99:blockMullite");
		
		oreRoxite = new oreRoxite(oreRoxiteID, Material.rock).setHardness(4.0F).setStepSound(Block.soundStoneFootstep).setCreativeTab(mullak99CT.tabMullak99sModB).setTextureName("mullak99:oreRoxite").setUnlocalizedName("mullak99:oreRoxite");
		blockRoxite = new genericBlock(blockRoxiteID, Material.iron).setHardness(5.0F).setStepSound(Block.soundMetalFootstep).setCreativeTab(mullak99CT.tabMullak99sModB).setTextureName("mullak99:blockRoxite").setUnlocalizedName("mullak99:blockRoxite");
		
		oreCopper = new genericBlock(oreCopperID, Material.rock).setHardness(3.0F).setStepSound(Block.soundStoneFootstep).setCreativeTab(mullak99CT.tabMullak99sModB).setTextureName("mullak99:oreCopper").setUnlocalizedName("mullak99:oreCopper");
		blockCopper = new genericBlock(blockCopperID, Material.iron).setHardness(4.0F).setStepSound(Block.soundMetalFootstep).setCreativeTab(mullak99CT.tabMullak99sModB).setTextureName("mullak99:blockCopper").setUnlocalizedName("mullak99:blockCopper");
		
		oreTin = new genericBlock(oreTinID, Material.rock).setHardness(3.0F).setStepSound(Block.soundStoneFootstep).setCreativeTab(mullak99CT.tabMullak99sModB).setTextureName("mullak99:oreTin").setUnlocalizedName("mullak99:oreTin");
		blockTin = new genericBlock(blockTinID, Material.iron).setHardness(4.0F).setStepSound(Block.soundMetalFootstep).setCreativeTab(mullak99CT.tabMullak99sModB).setTextureName("mullak99:blockTin").setUnlocalizedName("mullak99:blockTin");
		
		oreBauxite = new oreBauxite(oreBauxiteID, Material.rock).setHardness(3.0F).setStepSound(Block.soundStoneFootstep).setCreativeTab(mullak99CT.tabMullak99sModB).setTextureName("mullak99:oreBauxite").setUnlocalizedName("mullak99:oreBauxite");
		blockAluminium = new genericBlock(blockAluminiumID, Material.iron).setHardness(4.0F).setStepSound(Block.soundMetalFootstep).setCreativeTab(mullak99CT.tabMullak99sModB).setTextureName("mullak99:blockAluminium").setUnlocalizedName("mullak99:blockAluminium");
		
		oreEndite = new oreEndite(oreEnditeID, Material.rock).setHardness(5.5F).setStepSound(Block.soundStoneFootstep).setCreativeTab(mullak99CT.tabMullak99sModB).setTextureName("mullak99:oreEndite").setUnlocalizedName("mullak99:oreEndite");
		blockEndite = new genericBlock(blockEnditeID, Material.iron).setHardness(6.5F).setStepSound(Block.soundMetalFootstep).setCreativeTab(mullak99CT.tabMullak99sModB).setTextureName("mullak99:blockEndite").setUnlocalizedName("mullak99:blockEndite");
		
		blockBronze = new genericBlock(blockBronzeID, Material.iron).setHardness(4.0F).setStepSound(Block.soundMetalFootstep).setCreativeTab(mullak99CT.tabMullak99sModB).setTextureName("mullak99:blockBronze").setUnlocalizedName("blockBronze");
		clearGlass = new clearGlass(clearGlassID, Material.glass, false).setHardness(0.3F).setStepSound(Block.soundGlassFootstep).setCreativeTab(mullak99CT.tabMullak99sModB).setUnlocalizedName("mullak99:clearGlass").setTextureName("mullak99:clearGlass");
		thinClearGlass = new clearGlassPane(thinClearGlassID, "mullak99:clearGlass", "mullak99:clearGlass_pane_top", Material.glass, false).setHardness(0.3F).setStepSound(Block.soundGlassFootstep).setUnlocalizedName("mullak99:thinClearGlass");
		MCraftingTable = new MCraftingTable(MCraftingTableID).setHardness(3.0F).setStepSound(Block.soundMetalFootstep).setCreativeTab(mullak99CT.tabMullak99sModB).setTextureName("mullak99:MCrafting").setUnlocalizedName("mullak99:MTable");
		
		blockAlpha = new genericBlock(blockAlphaID, Material.iron).setHardness(4.0F).setStepSound(Block.soundMetalFootstep).setCreativeTab(mullak99CT.tabMullak99sModB).setTextureName("mullak99:blockAlpha").setUnlocalizedName("mullak99:blockAlpha");
		
		oreAlpha = new oreAlpha(oreAlphaID, Material.rock).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundStoneFootstep).setCreativeTab(mullak99CT.tabMullak99sModB).setTextureName("mullak99:oreAlpha").setUnlocalizedName("mullak99:oreAlpha");
		alphaCobble = new genericBlock(alphaCobbleID, Material.rock).setHardness(2.0F).setStepSound(Block.soundStoneFootstep).setResistance(10.0F).setCreativeTab(mullak99CT.tabMullak99sModB).setTextureName("mullak99:alphaCobble").setUnlocalizedName("mullak99:alphaCobble");
		alphaStone = new alphaStone(alphaStoneID, Material.rock).setHardness(1.5F).setStepSound(Block.soundStoneFootstep).setResistance(10.0F).setCreativeTab(mullak99CT.tabMullak99sModWIP).setTextureName("stone").setUnlocalizedName("mullak99:alphaStone");
	    alphaLeaves = (alphaLeaves)(new alphaLeaves(alphaLeavesID)).setHardness(0.2F).setLightOpacity(1).setStepSound(Block.soundGrassFootstep).setUnlocalizedName("mullak99:alphaLeaves").setTextureName("mullak99:leaves");
	    alphaGrass = new alphaGrass(alphaGrassID).setHardness(0.2F).setCreativeTab(mullak99CT.tabMullak99sModB).setStepSound(Block.soundGrassFootstep).setUnlocalizedName("mullak99:alphaGrass");
	    alphaSapling = new alphaSapling(alphaSaplingID).setHardness(0.0F).setCreativeTab(mullak99CT.tabMullak99sModB).setStepSound(Block.soundGrassFootstep).setUnlocalizedName("mullak99:alphaSapling").setTextureName("mullak99:alphaSapling");
	    
	    marble = new marble(marbleID, Material.rock).setHardness(1.5F).setStepSound(Block.soundStoneFootstep).setCreativeTab(mullak99CT.tabMullak99sModB).setTextureName("mullak99:marble").setUnlocalizedName("mullak99:marble");
	    marbleCobble = new genericBlock(marbleCobbleID, Material.rock).setHardness(2.0F).setStepSound(Block.soundStoneFootstep).setCreativeTab(mullak99CT.tabMullak99sModB).setTextureName("mullak99:marbleCobble").setUnlocalizedName("mullak99:marbleCobble");
	    marbleBrick = new genericBlock(marbleBrickID, Material.rock).setHardness(2.0F).setStepSound(Block.soundStoneFootstep).setCreativeTab(mullak99CT.tabMullak99sModB).setTextureName("mullak99:marbleBrick").setUnlocalizedName("mullak99:marbleBrick");
	   
	    marbleStair = new Stairs(marbleStairID, marble, 0).setHardness(1.5F).setStepSound(Block.soundStoneFootstep).setCreativeTab(mullak99CT.tabMullak99sModB).setUnlocalizedName("mullak99:marbleStair");
	    marbleCobbleStair = new Stairs(marbleCobbleStairID, marbleCobble, 0).setHardness(2.0F).setStepSound(Block.soundStoneFootstep).setCreativeTab(mullak99CT.tabMullak99sModB).setUnlocalizedName("mullak99:marbleCobbleStair");
	    marbleBrickStair = new Stairs(marbleBrickStairID, marbleBrick, 0).setHardness(2.0F).setStepSound(Block.soundStoneFootstep).setCreativeTab(mullak99CT.tabMullak99sModB).setUnlocalizedName("mullak99:marbleBrickStair");
	   
	    marbleSlab = new marbleSlab(marbleSlabID, false, Material.rock).setHardness(1.5F).setStepSound(Block.soundStoneFootstep).setCreativeTab(mullak99CT.tabMullak99sModB).setUnlocalizedName("mullak99:marbleSlab");
	    marbleCobbleSlab = new marbleCobbleSlab(marbleCobbleSlabID, false, Material.rock).setHardness(2.0F).setStepSound(Block.soundStoneFootstep).setCreativeTab(mullak99CT.tabMullak99sModB).setUnlocalizedName("mullak99:marbleCobbleSlab");
	    marbleBrickSlab = new marbleBrickSlab(marbleBrickSlabID, false, Material.rock).setHardness(2.0F).setStepSound(Block.soundStoneFootstep).setCreativeTab(mullak99CT.tabMullak99sModB).setUnlocalizedName("mullak99:marbleBrickSlab");
	   
	    marbleSlabDouble = new marbleSlab(marbleSlabDoubleID, true, Material.rock).setHardness(1.5F).setStepSound(Block.soundStoneFootstep).setCreativeTab(null).setUnlocalizedName("mullak99:marbleSlabDouble");
	    marbleCobbleSlabDouble = new marbleCobbleSlab(marbleCobbleSlabDoubleID, true, Material.rock).setHardness(2.0F).setStepSound(Block.soundStoneFootstep).setCreativeTab(null).setUnlocalizedName("mullak99:marbleCobbleSlabDouble");
	    marbleBrickSlabDouble = new marbleBrickSlab(marbleBrickSlabDoubleID, true, Material.rock).setHardness(2.0F).setStepSound(Block.soundStoneFootstep).setCreativeTab(null).setUnlocalizedName("mullak99:marbleBrickSlabDouble");
	   
	    oreSilver = new genericBlock(oreSilverID, Material.rock).setHardness(3.5F).setStepSound(Block.soundStoneFootstep).setCreativeTab(mullak99CT.tabMullak99sModB).setTextureName("mullak99:oreSilver").setUnlocalizedName("mullak99:oreSilver");
		blockSilver = new genericBlock(blockSilverID, Material.iron).setHardness(4.5F).setStepSound(Block.soundMetalFootstep).setCreativeTab(mullak99CT.tabMullak99sModB).setTextureName("mullak99:blockSilver").setUnlocalizedName("mullak99:blockSilver");
	    
		oreSulfur = new oreSulfur(oreSulfurID, Material.rock).setHardness(2.5F).setStepSound(Block.soundStoneFootstep).setCreativeTab(mullak99CT.tabMullak99sModB).setTextureName("mullak99:oreSulfur").setUnlocalizedName("mullak99:oreSulfur");
		oreNetherSulfur = new genericBlock(oreNetherSulfurID, Material.rock).setHardness(3.5F).setStepSound(Block.soundStoneFootstep).setCreativeTab(mullak99CT.tabMullak99sModB).setTextureName("mullak99:oreNetherSulfur").setUnlocalizedName("mullak99:oreNetherSulfur");
		
		blockUru = new genericBlock(blockUruID, Material.iron).setHardness(50.0F).setResistance(1000.0F).setStepSound(Block.soundMetalFootstep).setCreativeTab(mullak99CT.tabMullak99sModB).setTextureName("mullak99:blockUru").setUnlocalizedName("mullak99:blockUru");
		
	    //alphaPortal = (portalAlpha)new portalAlpha(alphaPortalID).setCreativeTab(mullak99CT.tabMullak99sModWIP).setUnlocalizedName("mullak99:alphaPortal").setTextureName("portal");
	   
	    Fluid bloodFluid = new bloodFluid();
	   
	    bloodLiquid = new bloodLiquid(bloodLiquidID, bloodFluid, Material.water).setDensity(2000).setCreativeTab(mullak99CT.tabMullak99sModWIP).setUnlocalizedName("mullak99:bloodLiquid");
	   
	    MTNT = new MTNT(MTNTID).setHardness(5.0F).setStepSound(Block.soundMetalFootstep).setCreativeTab(mullak99CT.tabMullak99sModB).setUnlocalizedName("mullak99:MTNT");
	   
		//Creative Tabs
		LanguageRegistry.instance().addStringLocalization("itemGroup.mullak99sModI", "en_US", mullak99Util.ModID + " | Items");
		LanguageRegistry.instance().addStringLocalization("itemGroup.mullak99sModB", "en_US", mullak99Util.ModID + " | Blocks");
		LanguageRegistry.instance().addStringLocalization("itemGroup.mullak99sModWP", "en_US", mullak99Util.ModID + " | Tools");
		LanguageRegistry.instance().addStringLocalization("itemGroup.mullak99sModWIP", "en_US", mullak99Util.ModID + " | WIP");
		LanguageRegistry.instance().addStringLocalization("itemGroup.mullak99sModFood", "en_US", mullak99Util.ModID + " | Food/Drink");
		
		//Mobs
		LanguageRegistry.instance().addStringLocalization("entity.mullak99.name", "en_US", "mullak99");
		LanguageRegistry.instance().addStringLocalization("entity.Thundercoyote.name", "en_US", "Thundercoyote");
		LanguageRegistry.instance().addStringLocalization("entity.Pro_Ninja_Gamer.name", "en_US", "Pro_Ninja_Gamer");
		LanguageRegistry.instance().addStringLocalization("entity.lucozade_waller.name", "en_US", "lucozade_waller");
		
		//Items
		mullakCore.InitialiseItem(mullite, "Mullite");
		mullakCore.InitialiseItem(roxite, "Roxite");
		mullakCore.InitialiseItem(ingotCopper, "Copper Ingot");
		mullakCore.InitialiseItem(ingotSteel, "Steel Ingot");
		mullakCore.InitialiseItem(ingotTin, "Tin Ingot");
		mullakCore.InitialiseItem(dustAlpha, "Dust of Nostalgia");
		mullakCore.InitialiseItem(mortarPestle, "Mortar and Pestle");
		mullakCore.InitialiseItem(mortarPestleReinf, "Reinforced Mortar and Pestle");
		mullakCore.InitialiseItem(dustMullite, "Mullite Dust");
		mullakCore.InitialiseItem(dustRoxite, "Roxite Dust");
		mullakCore.InitialiseItem(dustCoal, "Coal Dust");
		mullakCore.InitialiseItem(dustCharcoal, "Charcoal Dust");
		mullakCore.InitialiseItem(dustBronze, "Bronze Dust");
		mullakCore.InitialiseItem(dustCopper, "Copper Dust");
		mullakCore.InitialiseItem(dustTin, "Tin Dust");
		mullakCore.InitialiseItem(ingotBronze, "Bronze Ingot");
		mullakCore.InitialiseItem(ingotAlpha, "Nostalgia Ingot");
		
		mullakCore.InitialiseItem(ingotSilver, "Silver Ingot");
		mullakCore.InitialiseItem(dustSilver, "Silver Dust");
		
		mullakCore.InitialiseItem(endite, "Endite");
		
		mullakCore.InitialiseItem(aluminiumRaw, "Aluminium Oxide");
		mullakCore.InitialiseItem(ingotAluminium, "Aluminium Ingot");
		
		mullakCore.InitialiseItem(redstoneBattery, "Redstone Battery");
		mullakCore.InitialiseItem(BatteryEmpty, "Empty Battery");
		mullakCore.InitialiseItem(BatteryEnder, "Ender Battery");
		
		
		mullakCore.InitialiseItem(bauxite, "Bauxite");
		mullakCore.InitialiseItem(dustAluminium, "Aluminium Dust");
		mullakCore.InitialiseItem(ingotSteelRaw, "Raw Steel Ingot");
		
		mullakCore.InitialiseItem(sulfur, "Sulfur");
		
		mullakCore.InitialiseItem(grate, "Grate");
		mullakCore.InitialiseItem(essenceExtractor, "Essence Extractor");
		mullakCore.InitialiseItem(portableCrafting, "Portable Crafting Table");
		
		
		//mullakCore.InitializedItem(foamFinger, "Foam Finger");
		
		mullakCore.InitialiseItem(Chain, "Chain");
		
		mullakCore.InitialiseItem(ingotUru, "Uru Ingot");
		
			//Food
			mullakCore.InitialiseItem(enchantedMelon, "Michael Melon");
			mullakCore.InitialiseItem(muttonRaw, "Raw Mutton");
			mullakCore.InitialiseItem(muttonCooked, "Cooked Mutton");
			mullakCore.InitialiseItem(fleshCooked, "Cooked Zombie Flesh");
			
			mullakCore.InitialiseItem(alphaPorkchopRaw, "Raw Nostalgia Porkchop");
			mullakCore.InitialiseItem(alphaPorkchopCooked, "Cooked Nostalgia Porkchop");
			
			
			//Drink
			mullakCore.InitialiseItem(bucketChocMilk, "Chocolate Milk");
			mullakCore.InitialiseItem(blood, "Blood");
			mullakCore.InitialiseItem(essenceAlpha, "Essence of Nostalgia");
		
			//Tools
			mullakCore.InitialiseItem(pickaxeMullite, "Mullite Pickaxe");
			mullakCore.InitialiseItem(shovelMullite, "Mullite Shovel");
			mullakCore.InitialiseItem(swordMullite, "Mullite Sword");
			mullakCore.InitialiseItem(axeMullite, "Mullite Axe");
			mullakCore.InitialiseItem(hoeMullite, "Mullite Hoe");
			mullakCore.InitialiseItem(swordMulliteDE, "Mullite Sword");
			mullakCore.InitialiseItem(swordMulliteEE, "Mullite Sword");
			mullakCore.InitialiseItem(swordMulliteEEUr, "Mullite Sword");
			
			mullakCore.InitialiseItem(pickaxeRoxite, "Roxite Pickaxe");
			mullakCore.InitialiseItem(shovelRoxite, "Roxite Shovel");
			mullakCore.InitialiseItem(swordRoxite, "Roxite Sword");
			mullakCore.InitialiseItem(axeRoxite, "Roxite Axe");
			mullakCore.InitialiseItem(hoeRoxite, "Roxite Hoe");
			mullakCore.InitialiseItem(swordRoxiteDE, "Roxite Sword");
			mullakCore.InitialiseItem(swordRoxiteEE, "Roxite Sword");
			
			mullakCore.InitialiseItem(pickaxeBronze, "Bronze Pickaxe");
			mullakCore.InitialiseItem(shovelBronze, "Bronze Shovel");
			mullakCore.InitialiseItem(swordBronze, "Bronze Sword");
			mullakCore.InitialiseItem(axeBronze, "Bronze Axe");
			mullakCore.InitialiseItem(hoeBronze, "Bronze Hoe");
			
			mullakCore.InitialiseItem(pickaxeSteel, "Steel Pickaxe");
			mullakCore.InitialiseItem(shovelSteel, "Steel Shovel");
			mullakCore.InitialiseItem(swordSteel, "Steel Sword");
			mullakCore.InitialiseItem(axeSteel, "Steel Axe");
			mullakCore.InitialiseItem(hoeSteel, "Steel Hoe");
			
			mullakCore.InitialiseItem(pickaxeAlpha, "Nostalgia Pickaxe");
			mullakCore.InitialiseItem(shovelAlpha, "Nostalgia Shovel");
			mullakCore.InitialiseItem(swordAlpha, "Nostalgia Sword");
			mullakCore.InitialiseItem(axeAlpha, "Nostalgia Axe");
			mullakCore.InitialiseItem(hoeAlpha, "Nostalgia Hoe");
			
			mullakCore.InitialiseItem(pickaxeBedrock, "Bedrock Pickaxe");
			mullakCore.InitialiseItem(shovelBedrock, "Bedrock Shovel");
			mullakCore.InitialiseItem(swordBedrock, "Bedrock Sword");
			mullakCore.InitialiseItem(axeBedrock, "Bedrock Axe");
			
			mullakCore.InitialiseItem(paxelIron, "Iron Paxel");
			mullakCore.InitialiseItem(paxelDiamond, "Diamond Paxel");
		
			
			mullakCore.RegisterPaxel(paxelIron, 2, "Iron Paxel");
			mullakCore.RegisterPaxel(paxelBronze, 2, "Bronze Paxel");
			mullakCore.RegisterPaxel(paxelSteel, 2, "Steel Paxel");
			mullakCore.RegisterPaxel(paxelDiamond, 3, "Diamond Paxel");
			mullakCore.RegisterPaxel(paxelMullite, 4, "Mullite Paxel");
			mullakCore.RegisterPaxel(paxelRoxite, 4, "Roxite Paxel");
			mullakCore.RegisterPaxel(paxelAlpha, 3, "Nostalgia Paxel");
			mullakCore.RegisterPaxel(paxelMulliteEE, 5, "Mullite Paxel");
			mullakCore.RegisterPaxel(paxelRoxiteEE, 5, "Roxite Paxel");
			mullakCore.RegisterPaxel(steelHammer, 2, "Steel Hammer");
			mullakCore.RegisterPaxel(enditeHammer, 5, "Endite Hammer");
			mullakCore.RegisterPaxel(thorsHammer, 5, "Thor's Hammer");
			
			
			//Armor
			mullakCore.InitialiseItem(helmetMullite, "Mullite Helmet");
			mullakCore.InitialiseItem(chestMullite, "Mullite Chestplate");
			mullakCore.InitialiseItem(legsMullite, "Mullite Leggings");
			mullakCore.InitialiseItem(bootsMullite, "Mullite Boots");
			
			mullakCore.InitialiseItem(helmetRoxite, "Roxite Helmet");
			mullakCore.InitialiseItem(chestRoxite, "Roxite Chestplate");
			mullakCore.InitialiseItem(legsRoxite, "Roxite Leggings");
			mullakCore.InitialiseItem(bootsRoxite, "Roxite Boots");
			
			mullakCore.InitialiseItem(helmetBronze, "Bronze Helmet");
			mullakCore.InitialiseItem(chestBronze, "Bronze Chestplate");
			mullakCore.InitialiseItem(legsBronze, "Bronze Leggings");
			mullakCore.InitialiseItem(bootsBronze, "Bronze Boots");
			
			mullakCore.InitialiseItem(helmetSteel, "Steel Helmet");
			mullakCore.InitialiseItem(chestSteel, "Steel Chestplate");
			mullakCore.InitialiseItem(legsSteel, "Steel Leggings");
			mullakCore.InitialiseItem(bootsSteel, "Steel Boots");
			
			mullakCore.InitialiseItem(helmetAlpha, "Nostalgia Helmet");
			mullakCore.InitialiseItem(chestAlpha, "Nostalgia Chestplate");
			mullakCore.InitialiseItem(legsAlpha, "Nostalgia Leggings");
			mullakCore.InitialiseItem(bootsAlpha, "Nostalgia Boots");
			
			mullakCore.InitialiseItem(bloodBucket, "Bucket of Blood");
			
			//Container Items and Catalysts
			
			BatteryEmpty.setContainerItem(BatteryEmpty);
			BatteryEnder.setContainerItem(BatteryEnder);
			
			
			//Events
			
			MinecraftForge.EVENT_BUS.register(new EntityTweaks(null));
			MinecraftForge.EVENT_BUS.register(new mullak99TreeBonemealEvent());
			MinecraftForge.EVENT_BUS.register(new mullakCore());
			MinecraftForge.EVENT_BUS.register(new BucketHandler());
			NetworkRegistry.instance().registerConnectionHandler(new PlayerHandler());
			
			

			
			
			//World Gen
			ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(mullak99.blood.itemID, 0, 1, 2, 7));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(mullak99.blood.itemID, 0, 1, 2, 4));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(mullak99.blood.itemID, 0, 1, 2, 4));
			ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).addItem(new WeightedRandomChestContent(mullak99.blood.itemID, 0, 1, 2, 4));
			ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(mullak99.blood.itemID, 0, 1, 2, 4));
			ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(mullak99.blood.itemID, 0, 1, 2, 1));
			ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(new WeightedRandomChestContent(mullak99.blood.itemID, 0, 0, 1, 2));
			
		
		//Blocks
			
		mullakCore.InitialiseBlock(oreMullite, "oreMullite", "Mullite Ore", "pickaxe", 3);
		
		mullakCore.InitialiseBlock(blockMullite, "blockMullite", "Mullite Block", "pickaxe", 3);
		
		mullakCore.InitialiseBlock(oreRoxite, "oreRoxite", "Roxite Ore", "pickaxe", 3);
		
		mullakCore.InitialiseBlock(blockRoxite, "blockRoxite", "Roxite Block", "pickaxe", 3);
		
		mullakCore.InitialiseBlock(oreCopper, "oreCopper", "Copper Ore", "pickaxe", 1);
		
		mullakCore.InitialiseBlock(blockCopper, "blockCopper", "Copper Block", "pickaxe", 1);
		
		mullakCore.InitialiseBlock(oreTin, "oreTin", "Tin Ore", "pickaxe", 1);
		
		mullakCore.InitialiseBlock(blockTin, "blockTin", "Tin Block", "pickaxe", 1);
		
		mullakCore.InitialiseBlock(clearGlass, "clearGlass", "Clear Glass", null, 0);
		
		mullakCore.InitialiseBlock(thinClearGlass, "thinClearGlass", "Clear Glass Pane", null, 0);
		
		mullakCore.InitialiseBlock(alphaCobble, "alphaCobble", "Nostalgia Cobblestone", "pickaxe", 0);
		
		mullakCore.InitialiseBlock(alphaStone, "alphaStone", "Nostalgia Stone", "pickaxe", 0);
		
		mullakCore.InitialiseBlock(oreAlpha, "oreAlpha", "Nostalgia Ore", "pickaxe", 2);
		
		mullakCore.InitialiseBlock(blockBronze, "blockBronze", "Bronze Block", "pickaxe", 1);
		
		mullakCore.InitialiseBlock(alphaLeaves, "alphaLeaves", "Nostalgia Leaves", null, 0);
		
		mullakCore.InitialiseBlock(alphaGrass, "alphaGrass", "Nostalgia Grass", null, 0);
		
		mullakCore.InitialiseBlock(alphaSapling, "alphaSapling", "Nostalgia Sapling", null, 0);
		
		mullakCore.InitialiseBlock(MCraftingTable, "MCraftingTable", "Advanced Crafting Table", "pickaxe", 2);
		
		mullakCore.InitialiseBlock(oreBauxite, "oreBauxite", "Bauxite Ore", "pickaxe", 2);
		
		mullakCore.InitialiseBlock(blockAluminium, "blockAluminium", "Aluminium Block", "pickaxe", 2);
		
		mullakCore.InitialiseBlock(blockAlpha, "blockAlpha", "Nostalgia Block", "pickaxe", 2);
		
		mullakCore.InitialiseBlock(marble, "marble", "Marble", "pickaxe", 0);
		
		mullakCore.InitialiseBlock(marbleCobble, "marbleCobble", "Marble Cobblestone", "pickaxe", 0);

		mullakCore.InitialiseBlock(marbleBrick, "marbleBrick", "Marble Bricks", "pickaxe", 0);
		
		mullakCore.InitialiseBlock(marbleStair, "marbleStair", "Marble Stairs", "pickaxe", 0);
		
		mullakCore.InitialiseBlock(marbleCobbleStair, "marbleCobbleStair", "Marble Cobblestone Stairs", "pickaxe", 0);

		mullakCore.InitialiseBlock(marbleBrickStair, "marbleBrickStair", "Marble Bricks Stairs", "pickaxe", 0);
		
		mullakCore.InitialiseBlock(marbleSlab, "marbleSlab", "Marble Slab", "pickaxe", 0);
		
		mullakCore.InitialiseBlock(marbleCobbleSlab, "marbleCobbleSlab", "Marble Cobblestone Slab", "pickaxe", 0);

		mullakCore.InitialiseBlock(marbleBrickSlab, "marbleBrickSlab", "Marble Bricks Slab", "pickaxe", 0);
		
		mullakCore.InitialiseBlock(marbleSlabDouble, "marbleSlabDouble", "Marble Double Slab", "pickaxe", 0);
		
		mullakCore.InitialiseBlock(marbleCobbleSlabDouble, "marbleCobbleSlabDouble", "Marble Cobblestone Double Slab", "pickaxe", 0);

		mullakCore.InitialiseBlock(marbleBrickSlabDouble, "marbleBrickSlabDouble", "Marble Bricks Double Slab", "pickaxe", 0);
		
		mullakCore.InitialiseBlock(bloodLiquid, "bloodLiquid", "Blood", null, 0);
		
		mullakCore.InitialiseBlock(oreSilver, "oreSilver", "Silver Ore", "pickaxe", 1);
		
		mullakCore.InitialiseBlock(blockSilver, "blockSilver", "Silver Block", "pickaxe", 1);
		
		mullakCore.InitialiseBlock(MTNT, "MTNT", "Mullite TNT", "pickaxe", 3);
		
		mullakCore.InitialiseBlock(oreEndite, "oreEndite", "Endite Ore", "pickaxe", 4);
		mullakCore.InitialiseBlock(blockEndite, "blockEndite", "Endite Block", "pickaxe", 4);
		
		mullakCore.InitialiseBlock(oreSulfur, "oreSulfur", "Sulfur Ore", "pickaxe", 2);
		
		mullakCore.InitialiseBlock(oreNetherSulfur, "oreNetherSulfur", "Nether Sulfur Ore", "pickaxe", 2);
		
		mullakCore.InitialiseBlock(blockUru, "blockUru", "Uru Block", "pickaxe", 5);
		
		
		
		//Recipes
		mullak99Crafting.Recipes();
		
		
		
		//Handlers
		
		GameRegistry.registerFuelHandler(new mullak99FuelHandler());
		GameRegistry.registerCraftingHandler(new localHandler());
		
		//Fluid
		FluidContainerRegistry.registerFluidContainer(FluidRegistry.getFluidStack("blood", FluidContainerRegistry.BUCKET_VOLUME), new ItemStack(bloodBucket), new ItemStack(Item.bucketEmpty));
		FluidContainerRegistry.registerFluidContainer(FluidRegistry.getFluidStack("blood", FluidContainerRegistry.BUCKET_VOLUME), new ItemStack(blood), new ItemStack(Item.glassBottle));
		
		
		//World Gen
		GameRegistry.registerWorldGenerator(new mullak99WorldGenerator());
		
		//Ore Dictionary
		OreDictionary.registerOre("ingotCopper", new ItemStack(ingotCopper));
		OreDictionary.registerOre("oreCopper", new ItemStack(oreCopper));
		OreDictionary.registerOre("ingotTin", new ItemStack(ingotTin));
		OreDictionary.registerOre("oreTin", new ItemStack(oreTin));
		OreDictionary.registerOre("ingotSteel", new ItemStack(ingotSteel));
		OreDictionary.registerOre("ingotBronze", new ItemStack(dustBronze));
		OreDictionary.registerOre("dustCopper", new ItemStack(dustCopper));
		OreDictionary.registerOre("dustTin", new ItemStack(dustTin));
		OreDictionary.registerOre("dustBronze", new ItemStack(dustBronze));
		OreDictionary.registerOre("ingotAluminium", new ItemStack(ingotAluminium));
		OreDictionary.registerOre("ingotAluminum", new ItemStack(ingotAluminium));
		OreDictionary.registerOre("oreBauxite", new ItemStack(oreBauxite));
		OreDictionary.registerOre("oreAluminium", new ItemStack(oreBauxite));
		OreDictionary.registerOre("dustAluminium", new ItemStack(dustAluminium));
		OreDictionary.registerOre("dustAluminum", new ItemStack(dustAluminium));
		OreDictionary.registerOre("oreSilver", new ItemStack(oreSilver));
		OreDictionary.registerOre("ingotSilver", new ItemStack(ingotSilver));
		OreDictionary.registerOre("dustSilver", new ItemStack(dustSilver));
		OreDictionary.registerOre("dustsulfur", new ItemStack(sulfur));
		OreDictionary.registerOre("sulfur", new ItemStack(sulfur));
		OreDictionary.registerOre("oreSulfur", new ItemStack(oreSulfur));
		OreDictionary.registerOre("oreNetherSulfur", new ItemStack(oreNetherSulfur));
		OreDictionary.registerOre("liquidBlood", new ItemStack(bloodLiquid));
		OreDictionary.registerOre("blockCobble", new ItemStack(alphaCobble));
		
		
		//Render Register
		proxy.registerRenderInformation();
		
		proxy.registerSound();
		
		
		
		//DIM
		//DimensionManager.registerProviderType(alphaID, WorldProviderMullak99.class, true);
		//DimensionManager.registerDimension(alphaID, alphaID);
		
		//mullakCore.addChatMSG(mullak99Util.OldModVersionWarning);
		//System.out.println(mullak99Util.OldModVersionWarning);

	}
	
	@EventHandler
	public void postInit (FMLPostInitializationEvent event) {
		
		
		Item.itemsList[marbleSlab.blockID] = (new ItemSlab(marbleSlab.blockID - 256, (BlockHalfSlab) marbleSlab, (BlockHalfSlab) marbleSlabDouble, false));
		Item.itemsList[marbleCobbleSlab.blockID] = (new ItemSlab(marbleCobbleSlab.blockID - 256, (BlockHalfSlab) marbleCobbleSlab, (BlockHalfSlab) marbleCobbleSlabDouble, false));
		Item.itemsList[marbleBrickSlab.blockID] = (new ItemSlab(marbleBrickSlab.blockID - 256, (BlockHalfSlab) marbleBrickSlab, (BlockHalfSlab) marbleBrickSlabDouble, false));
		
		Item.itemsList[marbleSlabDouble.blockID] = (new ItemSlab(marbleSlabDouble.blockID - 256, (BlockHalfSlab) marbleSlab, (BlockHalfSlab) marbleSlabDouble, true));
		Item.itemsList[marbleCobbleSlabDouble.blockID] = (new ItemSlab(marbleCobbleSlabDouble.blockID - 256, (BlockHalfSlab) marbleCobbleSlab, (BlockHalfSlab) marbleCobbleSlabDouble, true));
		Item.itemsList[marbleBrickSlabDouble.blockID] = (new ItemSlab(marbleBrickSlabDouble.blockID - 256, (BlockHalfSlab) marbleBrickSlab, (BlockHalfSlab) marbleBrickSlabDouble, true));
		
		
		//Is mullakCore loaded
		mullak99Util.CoreLoaded();

	}

}