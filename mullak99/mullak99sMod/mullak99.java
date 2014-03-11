package mullak99.mullak99sMod;

import mullak99.mullak99sMod.armor.alphaArmor;
import mullak99.mullak99sMod.armor.bronzeArmor;
import mullak99.mullak99sMod.armor.mulliteArmor;
import mullak99.mullak99sMod.armor.roxiteArmor;
import mullak99.mullak99sMod.armor.steelArmor;
import mullak99.mullak99sMod.blocks.MCraftingTable;
import mullak99.mullak99sMod.blocks.Stairs;
import mullak99.mullak99sMod.blocks.alphaFurnace;
import mullak99.mullak99sMod.blocks.alphaGrass;
import mullak99.mullak99sMod.blocks.alphaLeaves;
import mullak99.mullak99sMod.blocks.alphaSapling;
import mullak99.mullak99sMod.blocks.alphaStone;
import mullak99.mullak99sMod.blocks.clearGlass;
import mullak99.mullak99sMod.blocks.clearGlassPane;
import mullak99.mullak99sMod.blocks.genericBlock;
import mullak99.mullak99sMod.blocks.marble;
import mullak99.mullak99sMod.blocks.marbleBrickSlab;
import mullak99.mullak99sMod.blocks.marbleCobbleSlab;
import mullak99.mullak99sMod.blocks.marbleSlab;
import mullak99.mullak99sMod.blocks.oreAlpha;
import mullak99.mullak99sMod.blocks.oreBauxite;
import mullak99.mullak99sMod.blocks.oreCopper;
import mullak99.mullak99sMod.blocks.oreMullite;
import mullak99.mullak99sMod.blocks.oreRoxite;
import mullak99.mullak99sMod.blocks.oreTin;
import mullak99.mullak99sMod.container.MCraftingManager;
import mullak99.mullak99sMod.event.mullak99TreeBonemealEvent;
import mullak99.mullak99sMod.handler.MCraftingGUIHandler;
import mullak99.mullak99sMod.handler.localHandler;
import mullak99.mullak99sMod.items.Battery;
import mullak99.mullak99sMod.items.Dust;
import mullak99.mullak99sMod.items.axeMullite;
import mullak99.mullak99sMod.items.blood;
import mullak99.mullak99sMod.items.bucketChocMilk;
import mullak99.mullak99sMod.items.chain;
import mullak99.mullak99sMod.items.enchantedMelon;
import mullak99.mullak99sMod.items.essenceAlpha;
import mullak99.mullak99sMod.items.grate;
import mullak99.mullak99sMod.items.hoeMullite;
import mullak99.mullak99sMod.items.ingotAlpha;
import mullak99.mullak99sMod.items.ingotAluminium;
import mullak99.mullak99sMod.items.ingotCopper;
import mullak99.mullak99sMod.items.ingotSteel;
import mullak99.mullak99sMod.items.ingotTin;
import mullak99.mullak99sMod.items.mortarPestle;
import mullak99.mullak99sMod.items.mullite;
import mullak99.mullak99sMod.items.paxelBronze;
import mullak99.mullak99sMod.items.paxelDiamond;
import mullak99.mullak99sMod.items.paxelIron;
import mullak99.mullak99sMod.items.paxelMGem;
import mullak99.mullak99sMod.items.paxelSteel;
import mullak99.mullak99sMod.items.pickaxeMullite;
import mullak99.mullak99sMod.items.portableCrafting;
import mullak99.mullak99sMod.items.roxite;
import mullak99.mullak99sMod.items.shovelMullite;
import mullak99.mullak99sMod.items.swordMullite;
import mullak99.mullak99sMod.items.swordMulliteDE;
import mullak99.mullak99sMod.mobs.EntitySheepOverride;
import mullak99.mullak99sMod.mobs.EntityZombieOverride;
import mullak99.mullak99sMod.mobs.ProNinjaGamerMob;
import mullak99.mullak99sMod.mobs.ThundercoyoteMob;
import mullak99.mullak99sMod.mobs.mullak99Mob;
import mullak99.mullakCore.CapeCore;
import mullak99.mullakCore.HandTool;
import mullak99.mullakCore.mullakCore;
import net.minecraft.block.Block;
import net.minecraft.block.BlockHalfSlab;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ThreadDownloadImageData;
import net.minecraft.client.renderer.texture.TextureObject;
import net.minecraft.creativetab.CreativeTabs;
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
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.oredict.OreDictionary;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Loader;
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

@Mod (modid="mullak99's Mod", name="mullak99's Mod", version="", dependencies="after:mullakCore")
@NetworkMod (clientSideRequired=true, serverSideRequired=false)

public class mullak99 {
	
	@Instance ("mullak99's Mod")
	public static mullak99 instance;
	
	//Dimension ID
	public static int alphaID = 2;
	
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
    
    public static Item ingotSteelRaw;
    public static Item ingotWroughtIron;
    public static Item grate;
    public static Item portableCrafting;
    
    //Food
    public static Item enchantedMelon;
    public static Item muttonRaw;
    public static Item muttonCooked;
    public static Item fleshCooked;
    
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
    
    public static Item pickaxeRoxite;
    public static Item shovelRoxite;
    public static Item swordRoxite;
    public static Item axeRoxite;
    public static Item hoeRoxite;
    public static Item swordRoxiteDE;
    public static Item paxelRoxite;
    
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
    

	
	//Enum Tool Material
	public static EnumToolMaterial mulliteTools = EnumHelper.addToolMaterial("Mullite", 4, 2500, 10.0F, 5.0F, 20);
	public static EnumToolMaterial mulliteToolsDE = EnumHelper.addToolMaterial("MulliteDE", 4, 3000, 12.0F, 7.0F, 22);
	public static EnumToolMaterial bronzeTools = EnumHelper.addToolMaterial("Bronze", 2, 300, 6.0F, 2.0F, 14);
	public static EnumToolMaterial steelTools = EnumHelper.addToolMaterial("Steel", 2, 500, 7.5F, 3.0F, 15);
	public static EnumToolMaterial alphaTools = EnumHelper.addToolMaterial("Alpha", 3, 512, 8.5F, 2.5F, 16);
	public static EnumToolMaterial bedrockTools = EnumHelper.addToolMaterial("Bedrock", 10, -1, 99999999999999999999999999999999999999.9F, 999999999, 999999999);
	public static EnumToolMaterial foamFingerTool = EnumHelper.addToolMaterial("Foam", 2, 100, 6.0F, 2.0F, 1);
	
	
	//Enum Armor Material
	public static EnumArmorMaterial mulliteArmor = EnumHelper.addArmorMaterial("Mullite", 40, new int[]{5, 8, 6, 5}, 25);
	public static EnumArmorMaterial bronzeArmor = EnumHelper.addArmorMaterial("Bronze", 15, new int[]{2, 6, 5, 2}, 9);
	public static EnumArmorMaterial steelArmor = EnumHelper.addArmorMaterial("Steel", 15, new int[]{3, 7, 6, 3}, 9);
	public static EnumArmorMaterial alphaArmor = EnumHelper.addArmorMaterial("Alpha", 20, new int[]{4, 7, 6, 4}, 12);
	
	
	public static AchievementPage mullak99sMod = new AchievementPage("mullak99's Mod 2");
	
		
	//Biome's
	//public static final BiomeGenBase alphaBiome = new alphaBiomeGen(alphaID);
	
	@EventHandler
	public void PreInit (FMLPreInitializationEvent event) {

		
		NetworkRegistry.instance().registerGuiHandler(mullak99.instance, (IGuiHandler) new MCraftingGUIHandler());
		mullakCore.registerEntity(mullak99Mob.class, "mullak99", 0x000FF00, 0x000000);
		mullakCore.registerEntity(ThundercoyoteMob.class, "Thundercoyote", 0x7F7F7F, 0x000000);
		mullakCore.registerEntity(ProNinjaGamerMob.class, "Pro_Ninja_Gamer", 0x6600CC, 0x000000);
		
		
		
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
		mullite = new mullite(1000).setMaxStackSize(64).setCreativeTab(mullak99CT.tabMullak99sModI).setTextureName("mullak99:Mullite").setUnlocalizedName("mullak99:mullite");
		roxite = new roxite(1001).setMaxStackSize(64).setCreativeTab(mullak99CT.tabMullak99sModI).setTextureName("mullak99:Roxite").setUnlocalizedName("mullak99:roxite");
		ingotCopper = new ingotCopper(1002).setMaxStackSize(64).setCreativeTab(mullak99CT.tabMullak99sModI).setTextureName("mullak99:ingotCopper").setUnlocalizedName("mullak99:ingotCopper");
		ingotSteel = new ingotSteel(1003).setMaxStackSize(64).setCreativeTab(mullak99CT.tabMullak99sModI).setTextureName("mullak99:ingotSteel").setUnlocalizedName("mullak99:ingotSteel");
		ingotTin = new ingotTin(1004).setMaxStackSize(64).setCreativeTab(mullak99CT.tabMullak99sModI).setTextureName("mullak99:ingotTin").setUnlocalizedName("mullak99:ingotTin");
		dustAlpha = new Dust(900).setMaxStackSize(64).setCreativeTab(mullak99CT.tabMullak99sModI).setTextureName("mullak99:dustAlpha").setUnlocalizedName("mullak99:dustAlpha");
		dustMullite = new Dust(1010).setMaxStackSize(64).setCreativeTab(mullak99CT.tabMullak99sModI).setTextureName("mullak99:dustMullite").setUnlocalizedName("mullak99:mulliteDust");
		dustRoxite = new Dust(1011).setMaxStackSize(64).setCreativeTab(mullak99CT.tabMullak99sModI).setTextureName("mullak99:dustRoxite").setUnlocalizedName("rmullak99:oxiteDust");
		dustCoal = new Dust(1012).setMaxStackSize(64).setCreativeTab(mullak99CT.tabMullak99sModI).setTextureName("mullak99:dustCoal").setUnlocalizedName("mullak99:coalDust");
		dustCharcoal = new Dust(1013).setMaxStackSize(64).setCreativeTab(mullak99CT.tabMullak99sModI).setTextureName("mullak99:dustCoal").setUnlocalizedName("mullak99:charcoalDust");
		dustBronze = new Dust(1014).setMaxStackSize(64).setCreativeTab(mullak99CT.tabMullak99sModI).setTextureName("mullak99:dustBronze").setUnlocalizedName("mullak99:bronzeDust");
		dustCopper = new Dust(1015).setMaxStackSize(64).setCreativeTab(mullak99CT.tabMullak99sModI).setTextureName("mullak99:dustCopper").setUnlocalizedName("mullak99:copperDust");
		dustTin = new Dust(1016).setMaxStackSize(64).setCreativeTab(mullak99CT.tabMullak99sModI).setTextureName("mullak99:dustTin").setUnlocalizedName("mullak99:tinDust");
		ingotBronze = new ingotSteel(1017).setMaxStackSize(64).setCreativeTab(mullak99CT.tabMullak99sModI).setTextureName("mullak99:ingotBronze").setUnlocalizedName("mullak99:ingotBronze");
		
		aluminiumRaw = new ingotAluminium(1018).setMaxStackSize(64).setCreativeTab(mullak99CT.tabMullak99sModI).setTextureName("mullak99:aluminiumOxide").setUnlocalizedName("mullak99:aluminiumOxide");
		ingotAluminium = new ingotAluminium(1019).setMaxStackSize(64).setCreativeTab(mullak99CT.tabMullak99sModI).setTextureName("mullak99:ingotAluminium").setUnlocalizedName("mullak99:ingotAluminium");
		
		bauxite = new Dust(1020).setMaxStackSize(64).setCreativeTab(mullak99CT.tabMullak99sModI).setTextureName("mullak99:bauxite").setUnlocalizedName("mullak99:bauxite");
		dustAluminium = new Dust(1021).setMaxStackSize(64).setCreativeTab(mullak99CT.tabMullak99sModI).setTextureName("mullak99:dustAluminium").setUnlocalizedName("mullak99:dustAluminium");
		
		ingotSteelRaw = new ingotSteel(1022).setMaxStackSize(64).setCreativeTab(mullak99CT.tabMullak99sModI).setTextureName("mullak99:ingotSteelRaw").setUnlocalizedName("mullak99:ingotSteelRaw");
		
		redstoneBattery = new Battery(1032).setMaxStackSize(1).setMaxDamage(10).setCreativeTab(mullak99CT.tabMullak99sModI).setTextureName("mullak99:redstoneBattery").setUnlocalizedName("mullak99:redstoneBattery");
		
		grate = new grate(1035).setMaxStackSize(64).setCreativeTab(mullak99CT.tabMullak99sModI).setTextureName("mullak99:grate").setUnlocalizedName("mullak99:grate");
		
		ingotAlpha = new ingotAlpha(1040).setMaxStackSize(64).setCreativeTab(mullak99CT.tabMullak99sModI).setTextureName("mullak99:ingotAlpha").setUnlocalizedName("mullak99:ingotAlpha");
		Chain = new chain(1041).setMaxStackSize(64).setCreativeTab(mullak99CT.tabMullak99sModI).setTextureName("mullak99:Chain").setUnlocalizedName("mullak99:Chain");
		//foamFinger = new swordMullite(1038, foamFingerTool).setMaxStackSize(64).setCreativeTab(mullak99CT.tabMullak99sModI).setTextureName("mullak99:foamFinger").setUnlocalizedName("mullak99:foamFinger");
			
			//Food
			enchantedMelon = new enchantedMelon(1030, 20, 1.2F, false).setAlwaysEdible().setPotionEffect(Potion.regeneration.id, 2400, 16, 1.0F).setPotionEffect(Potion.resistance.id, 2400, 16, 1.0F).setPotionEffect(Potion.fireResistance.id, 2400, 16, 1.0F).setCreativeTab(mullak99CT.tabMullak99sModFood).setUnlocalizedName("mullak99:enchantedMelon").setTextureName("melon");
			muttonRaw = (new ItemFood(1033, 3, 0.3F, true)).setCreativeTab(mullak99CT.tabMullak99sModFood).setUnlocalizedName("mullak99:muttonRaw").setTextureName("mullak99:muttonRaw");
			muttonCooked = (new ItemFood(1034, 8, 0.8F, true)).setCreativeTab(mullak99CT.tabMullak99sModFood).setUnlocalizedName("mullak99:muttonCooked").setTextureName("mullak99:muttonCooked");
			fleshCooked = (new ItemFood(1037, 6, 0.4F, true)).setCreativeTab(mullak99CT.tabMullak99sModFood).setUnlocalizedName("mullak99:fleshCooked").setTextureName("mullak99:fleshCooked");
		
			//Drink
			bucketChocMilk = new bucketChocMilk(1031).setUnlocalizedName("bucketChocMilk").setCreativeTab(mullak99CT.tabMullak99sModFood).setTextureName("mullak99:bucketChocMilk");
			blood = new blood(1036).setMaxStackSize(64).setCreativeTab(mullak99CT.tabMullak99sModFood).setTextureName("mullak99:blood").setUnlocalizedName("mullak99:blood");
			essenceAlpha = new essenceAlpha(1042).setMaxStackSize(64).setCreativeTab(mullak99CT.tabMullak99sModFood).setTextureName("mullak99:essenceAlpha").setUnlocalizedName("mullak99:essenceAlpha");
			
			//Tools
			pickaxeMullite = new pickaxeMullite(1500, mulliteTools).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:pickaxeMullite").setUnlocalizedName("mullak99:pickaxeMullite");
			shovelMullite = new shovelMullite(1501, mulliteTools).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:shovelMullite").setUnlocalizedName("mullak99:shovelMullite");
			swordMullite = new swordMullite(1502, mulliteTools).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:swordMullite").setUnlocalizedName("mullak99:swordMullite");
			axeMullite = new axeMullite(1503, mulliteTools).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:axeMullite").setUnlocalizedName("mullak99:axeMullite");
			hoeMullite = new hoeMullite(1504, mulliteTools).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:hoeMullite").setUnlocalizedName("mullak99:hoeMullite");
			swordMulliteDE = new swordMulliteDE(1505, mulliteToolsDE).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:swordMulliteDE").setUnlocalizedName("mullak99:swordMulliteDE");
			
			pickaxeRoxite = new pickaxeMullite(2500, mulliteTools).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:pickaxeRoxite").setUnlocalizedName("mullak99:pickaxeRoxite");
			shovelRoxite = new shovelMullite(2501, mulliteTools).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:shovelRoxite").setUnlocalizedName("mullak99:shovelRoxite");
			swordRoxite = new swordMullite(2502, mulliteTools).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:swordRoxite").setUnlocalizedName("mullak99:swordRoxite");
			axeRoxite = new axeMullite(2503, mulliteTools).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:axeRoxite").setUnlocalizedName("mullak99:axeRoxite");
			hoeRoxite = new hoeMullite(2504, mulliteTools).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:hoeRoxite").setUnlocalizedName("mullak99:hoeRoxite");
			swordRoxiteDE = new swordMulliteDE(2505, mulliteToolsDE).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:swordRoxiteDE").setUnlocalizedName("mullak99:swordRoxiteDE");
			
			pickaxeBronze = new pickaxeMullite(3500, bronzeTools).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:pickaxeBronze").setUnlocalizedName("mullak99:pickaxeBronze");
			shovelBronze = new shovelMullite(3501, bronzeTools).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:shovelBronze").setUnlocalizedName("mullak99:shovelBronze");
			swordBronze = new swordMullite(3502, bronzeTools).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:swordBronze").setUnlocalizedName("mullak99:swordBronze");
			axeBronze = new axeMullite(3503, bronzeTools).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:axeBronze").setUnlocalizedName("mullak99:axeBronze");
			hoeBronze = new hoeMullite(3504, bronzeTools).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:hoeBronze").setUnlocalizedName("mullak99:hoeBronze");
			
			pickaxeSteel = new pickaxeMullite(3505, steelTools).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:pickaxeSteel").setUnlocalizedName("mullak99:pickaxeSteel");
			shovelSteel = new shovelMullite(3506, steelTools).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:shovelSteel").setUnlocalizedName("mullak99:shovelSteel");
			swordSteel = new swordMullite(3507, steelTools).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:swordSteel").setUnlocalizedName("mullak99:swordSteel");
			axeSteel = new axeMullite(3508, steelTools).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:axeSteel").setUnlocalizedName("mullak99:axeSteel");
			hoeSteel = new hoeMullite(3509, steelTools).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:hoeSteel").setUnlocalizedName("mullak99:hoeSteel");
			
			pickaxeAlpha = new pickaxeMullite(3510, alphaTools).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:pickaxeAlpha").setUnlocalizedName("mullak99:pickaxeAlpha");
			shovelAlpha = new shovelMullite(3511, alphaTools).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:shovelAlpha").setUnlocalizedName("mullak99:shovelAlpha");
			swordAlpha = new swordMullite(3512, alphaTools).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:swordAlpha").setUnlocalizedName("mullak99:swordAlpha");
			axeAlpha = new axeMullite(3513, alphaTools).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:axeAlpha").setUnlocalizedName("mullak99:axeAlpha");
			hoeAlpha = new hoeMullite(3514, alphaTools).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:hoeAlpha").setUnlocalizedName("mullak99:hoeAlpha");
			
			pickaxeBedrock = new pickaxeMullite(4000, bedrockTools).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:pickaxeBedrock").setUnlocalizedName("mullak99:pickaxeBedrock");
			shovelBedrock = new shovelMullite(4001, bedrockTools).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:shovelBedrock").setUnlocalizedName("mullak99:shovelBedrock");
			swordBedrock = new swordMullite(4002, bedrockTools).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:swordBedrock").setUnlocalizedName("mullak99:swordBedrock");
			axeBedrock = new axeMullite(4003, bedrockTools).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:axeBedrock").setUnlocalizedName("mullak99:axeBedrock");
			
			paxelIron = new paxelIron(4004, EnumToolMaterial.IRON).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:paxelIron").setUnlocalizedName("mullak99:paxelIron");
			paxelDiamond = new paxelDiamond(4005, EnumToolMaterial.EMERALD).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:paxelDiamond").setUnlocalizedName("mullak99:paxelDiamond");
			paxelMullite = new paxelMGem(4006, mulliteTools).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:paxelMullite").setUnlocalizedName("mullak99:paxelMullite");
			paxelRoxite = new paxelMGem(4007, mulliteTools).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:paxelRoxite").setUnlocalizedName("mullak99:paxelRoxite");
			paxelBronze = new paxelBronze(4008, bronzeTools).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:paxelBronze").setUnlocalizedName("mullak99:paxelBronze");
			paxelSteel = new paxelSteel(4009, steelTools).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:paxelSteel").setUnlocalizedName("mullak99:paxelSteel");
			paxelAlpha = new paxelSteel(4010, alphaTools).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:paxelAlpha").setUnlocalizedName("mullak99:paxelAlpha");
			
			portableCrafting = new portableCrafting(1009).setMaxStackSize(64).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:portableCrafting").setUnlocalizedName("mullak99:portableCrafting");
			
			//alphaPortal = new alphaPortal(4500).setUnlocalizedName("mullak99:alphaPortal");
			
			mortarPestle = new mortarPestle(1005).setMaxStackSize(1).setMaxDamage(64).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:mortarPestle").setUnlocalizedName("mullak99:mortarPestle");
			mortarPestleReinf = new mortarPestle(1006).setMaxStackSize(1).setMaxDamage(1024).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:mortarPestleReinf").setUnlocalizedName("mullak99:mortarPestleReinf");
			steelHammer = new HandTool(1007, mullakCore.nullTool).setMaxStackSize(1).setMaxDamage(16).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:steelHammer").setUnlocalizedName("mullak99:steelHammer");
			essenceExtractor = new HandTool(1008, mullakCore.nullTool).setMaxStackSize(1).setMaxDamage(64).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:essenceExtractor").setUnlocalizedName("mullak99:essenceExtractor");
			
			//Armor
			
			
			int renderMulliteArmor = proxy.addArmor("mulliteArmor");
			int renderRoxiteArmor = proxy.addArmor("roxiteArmor");
			int renderBronzeArmor = proxy.addArmor("bronzeArmor");
			int renderSteelArmor = proxy.addArmor("steelArmor");
			int renderAlphaArmor = proxy.addArmor("alphaArmor");
			
			
			helmetMullite = new mulliteArmor(1600, mulliteArmor, renderMulliteArmor, 0).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:helmetMullite").setUnlocalizedName("mullak99:helmetMullite");
			chestMullite = new mulliteArmor(1601, mulliteArmor, renderMulliteArmor, 1).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:chestMullite").setUnlocalizedName("mullak99:chestMullite");
			legsMullite = new mulliteArmor(1602, mulliteArmor, renderMulliteArmor, 2).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:legsMullite").setUnlocalizedName("mullak99:legsMullite");
			bootsMullite = new mulliteArmor(1603, mulliteArmor, renderMulliteArmor, 3).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:bootsMullite").setUnlocalizedName("mullak99:bootsMullite");
			
			helmetRoxite = new roxiteArmor(1610, mulliteArmor, renderRoxiteArmor, 0).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:helmetRoxite").setUnlocalizedName("mullak99:helmetRoxite");
			chestRoxite = new roxiteArmor(1611, mulliteArmor, renderRoxiteArmor, 1).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:chestRoxite").setUnlocalizedName("mullak99:chestRoxite");
			legsRoxite = new roxiteArmor(1612, mulliteArmor, renderRoxiteArmor, 2).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:legsRoxite").setUnlocalizedName("mullak99:legsRoxite");
			bootsRoxite = new roxiteArmor(1613, mulliteArmor, renderRoxiteArmor, 3).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:bootsRoxite").setUnlocalizedName("mullak99:bootsRoxite");
			
			helmetBronze = new bronzeArmor(1620, bronzeArmor, renderBronzeArmor, 0).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:helmetBronze").setUnlocalizedName("mullak99:helmetBronze");
			chestBronze = new bronzeArmor(1621, bronzeArmor, renderBronzeArmor, 1).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:chestBronze").setUnlocalizedName("mullak99:chestBronze");
			legsBronze = new bronzeArmor(1622, bronzeArmor, renderBronzeArmor, 2).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:legsBronze").setUnlocalizedName("mullak99:legsBronze");
			bootsBronze = new bronzeArmor(1623, bronzeArmor, renderBronzeArmor, 3).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:bootsBronze").setUnlocalizedName("mullak99:bootsBronze");
			
			helmetSteel = new steelArmor(1624, steelArmor, renderSteelArmor, 0).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:helmetSteel").setUnlocalizedName("mullak99:helmetSteel");
			chestSteel = new steelArmor(1625, steelArmor, renderSteelArmor, 1).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:chestSteel").setUnlocalizedName("mullak99:chestSteel");
			legsSteel = new steelArmor(1626, steelArmor, renderSteelArmor, 2).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:legsSteel").setUnlocalizedName("mullak99:legsSteel");
			bootsSteel = new steelArmor(1627, steelArmor, renderSteelArmor, 3).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:bootsSteel").setUnlocalizedName("mullak99:bootsSteel");
			
			helmetAlpha = new alphaArmor(1628, alphaArmor, renderAlphaArmor, 0).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:helmetAlpha").setUnlocalizedName("mullak99:helmetAlpha");
			chestAlpha = new alphaArmor(1629, alphaArmor, renderAlphaArmor, 1).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:chestAlpha").setUnlocalizedName("mullak99:chestAlpha");
			legsAlpha = new alphaArmor(1630, alphaArmor, renderAlphaArmor, 2).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:legsAlpha").setUnlocalizedName("mullak99:legsAlpha");
			bootsAlpha = new alphaArmor(1631, alphaArmor, renderAlphaArmor, 3).setCreativeTab(mullak99CT.tabMullak99sModWP).setTextureName("mullak99:bootsAlpha").setUnlocalizedName("mullak99:bootsAlpha");
			
		//Blocks
		oreMullite = new oreMullite(500, Material.rock).setHardness(4.0F).setStepSound(Block.soundStoneFootstep).setCreativeTab(mullak99CT.tabMullak99sModB).setTextureName("mullak99:oreMullite").setUnlocalizedName("mullak99:oreMullite");
		blockMullite = new genericBlock(501, Material.iron).setHardness(5.0F).setStepSound(Block.soundMetalFootstep).setCreativeTab(mullak99CT.tabMullak99sModB).setTextureName("mullak99:blockMullite").setUnlocalizedName("mullak99:blockMullite");
		
		oreRoxite = new oreRoxite(502, Material.rock).setHardness(4.0F).setStepSound(Block.soundStoneFootstep).setCreativeTab(mullak99CT.tabMullak99sModB).setTextureName("mullak99:oreRoxite").setUnlocalizedName("mullak99:oreRoxite");
		blockRoxite = new genericBlock(503, Material.iron).setHardness(5.0F).setStepSound(Block.soundMetalFootstep).setCreativeTab(mullak99CT.tabMullak99sModB).setTextureName("mullak99:blockRoxite").setUnlocalizedName("mullak99:blockRoxite");
		
		oreCopper = new oreCopper(504, Material.rock).setHardness(3.0F).setStepSound(Block.soundStoneFootstep).setCreativeTab(mullak99CT.tabMullak99sModB).setTextureName("mullak99:oreCopper").setUnlocalizedName("mullak99:oreCopper");
		blockCopper = new genericBlock(505, Material.iron).setHardness(4.0F).setStepSound(Block.soundMetalFootstep).setCreativeTab(mullak99CT.tabMullak99sModB).setTextureName("mullak99:blockCopper").setUnlocalizedName("mullak99:blockCopper");
		
		oreTin = new oreTin(506, Material.rock).setHardness(3.0F).setStepSound(Block.soundStoneFootstep).setCreativeTab(mullak99CT.tabMullak99sModB).setTextureName("mullak99:oreTin").setUnlocalizedName("mullak99:oreTin");
		blockTin = new genericBlock(507, Material.iron).setHardness(4.0F).setStepSound(Block.soundMetalFootstep).setCreativeTab(mullak99CT.tabMullak99sModB).setTextureName("mullak99:blockTin").setUnlocalizedName("mullak99:blockTin");
		
		oreBauxite = new oreBauxite(514, Material.rock).setHardness(3.0F).setStepSound(Block.soundStoneFootstep).setCreativeTab(mullak99CT.tabMullak99sModB).setTextureName("mullak99:oreBauxite").setUnlocalizedName("mullak99:oreBauxite");
		blockAluminium = new genericBlock(515, Material.iron).setHardness(4.0F).setStepSound(Block.soundMetalFootstep).setCreativeTab(mullak99CT.tabMullak99sModB).setTextureName("mullak99:blockAluminium").setUnlocalizedName("mullak99:blockAluminium");
		
		
		blockBronze = new genericBlock(510, Material.iron).setHardness(4.0F).setStepSound(Block.soundMetalFootstep).setCreativeTab(mullak99CT.tabMullak99sModB).setTextureName("mullak99:blockBronze").setUnlocalizedName("blockBronze");
		clearGlass = new clearGlass(511, Material.glass, false).setHardness(0.3F).setStepSound(Block.soundGlassFootstep).setCreativeTab(mullak99CT.tabMullak99sModB).setUnlocalizedName("mullak99:clearGlass").setTextureName("mullak99:clearGlass");
		thinClearGlass = new clearGlassPane(512, "mullak99:clearGlass", "mullak99:clearGlass_pane_top", Material.glass, false).setHardness(0.3F).setStepSound(Block.soundGlassFootstep).setUnlocalizedName("mullak99:thinClearGlass");
		MCraftingTable = new MCraftingTable(513).setHardness(3.0F).setStepSound(Block.soundMetalFootstep).setCreativeTab(mullak99CT.tabMullak99sModB).setTextureName("mullak99:MCrafting").setUnlocalizedName("mullak99:MTable");
		
		blockAlpha = new genericBlock(520, Material.iron).setHardness(4.0F).setStepSound(Block.soundMetalFootstep).setCreativeTab(mullak99CT.tabMullak99sModB).setTextureName("mullak99:blockAlpha").setUnlocalizedName("mullak99:blockAlpha");
		
		oreAlpha = new oreAlpha(508, Material.rock).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundStoneFootstep).setCreativeTab(mullak99CT.tabMullak99sModB).setTextureName("mullak99:oreAlpha").setUnlocalizedName("mullak99:oreAlpha");
		alphaCobble = new genericBlock(910, Material.rock).setHardness(2.0F).setStepSound(Block.soundStoneFootstep).setResistance(10.0F).setCreativeTab(mullak99CT.tabMullak99sModB).setTextureName("mullak99:alphaCobble").setUnlocalizedName("mullak99:alphaCobble");
		alphaStone = new alphaStone(911, Material.rock).setHardness(1.5F).setStepSound(Block.soundStoneFootstep).setResistance(10.0F).setCreativeTab(mullak99CT.tabMullak99sModWIP).setTextureName("stone").setUnlocalizedName("mullak99:alphaStone");
		alphaFurnaceIdle = new alphaFurnace(912, false).setHardness(3.5F).setStepSound(Block.soundStoneFootstep).setCreativeTab(mullak99CT.tabMullak99sModWIP).setUnlocalizedName("mullak99:alphaFurnace").setCreativeTab(CreativeTabs.tabDecorations);
	    alphaFurnaceBurning = new alphaFurnace(913, true).setHardness(3.5F).setStepSound(Block.soundStoneFootstep).setLightValue(0.875F).setUnlocalizedName("mullak99:alphaFurnace");
	    alphaLeaves = (alphaLeaves)(new alphaLeaves(914)).setHardness(0.2F).setLightOpacity(1).setStepSound(Block.soundGrassFootstep).setUnlocalizedName("mullak99:alphaLeaves").setTextureName("mullak99:leaves");
	    alphaGrass = new alphaGrass(915).setHardness(0.2F).setCreativeTab(mullak99CT.tabMullak99sModB).setStepSound(Block.soundGrassFootstep).setUnlocalizedName("mullak99:alphaGrass");
	    alphaSapling = new alphaSapling(916).setHardness(0.0F).setCreativeTab(mullak99CT.tabMullak99sModB).setStepSound(Block.soundGrassFootstep).setUnlocalizedName("mullak99:alphaSapling").setTextureName("mullak99:alphaSapling");
	    
	   marble = new marble(516, Material.rock).setHardness(1.5F).setStepSound(Block.soundStoneFootstep).setCreativeTab(mullak99CT.tabMullak99sModB).setTextureName("mullak99:marble").setUnlocalizedName("mullak99:marble");
	   marbleCobble = new genericBlock(517, Material.rock).setHardness(2.0F).setStepSound(Block.soundStoneFootstep).setCreativeTab(mullak99CT.tabMullak99sModB).setTextureName("mullak99:marbleCobble").setUnlocalizedName("mullak99:marbleCobble");
	   marbleBrick = new genericBlock(518, Material.rock).setHardness(2.0F).setStepSound(Block.soundStoneFootstep).setCreativeTab(mullak99CT.tabMullak99sModB).setTextureName("mullak99:marbleBrick").setUnlocalizedName("mullak99:marbleBrick");
	   
	   marbleStair = new Stairs(521, marble, 0).setHardness(1.5F).setStepSound(Block.soundStoneFootstep).setCreativeTab(mullak99CT.tabMullak99sModB).setUnlocalizedName("mullak99:marbleStair");
	   marbleCobbleStair = new Stairs(522, marbleCobble, 0).setHardness(2.0F).setStepSound(Block.soundStoneFootstep).setCreativeTab(mullak99CT.tabMullak99sModB).setUnlocalizedName("mullak99:marbleCobbleStair");
	   marbleBrickStair = new Stairs(523, marbleBrick, 0).setHardness(2.0F).setStepSound(Block.soundStoneFootstep).setCreativeTab(mullak99CT.tabMullak99sModB).setUnlocalizedName("mullak99:marbleBrickStair");
	   
	   marbleSlab = new marbleSlab(524, false, Material.rock).setHardness(1.5F).setStepSound(Block.soundStoneFootstep).setCreativeTab(mullak99CT.tabMullak99sModB).setUnlocalizedName("mullak99:marbleSlab");
	   marbleCobbleSlab = new marbleCobbleSlab(525, false, Material.rock).setHardness(2.0F).setStepSound(Block.soundStoneFootstep).setCreativeTab(mullak99CT.tabMullak99sModB).setUnlocalizedName("mullak99:marbleCobbleSlab");
	   marbleBrickSlab = new marbleBrickSlab(526, false, Material.rock).setHardness(2.0F).setStepSound(Block.soundStoneFootstep).setCreativeTab(mullak99CT.tabMullak99sModB).setUnlocalizedName("mullak99:marbleBrickSlab");
	   
	   marbleSlabDouble = new marbleSlab(527, true, Material.rock).setHardness(1.5F).setStepSound(Block.soundStoneFootstep).setCreativeTab(null).setUnlocalizedName("mullak99:marbleSlabDouble");
	   marbleCobbleSlabDouble = new marbleCobbleSlab(528, true, Material.rock).setHardness(2.0F).setStepSound(Block.soundStoneFootstep).setCreativeTab(null).setUnlocalizedName("mullak99:marbleCobbleSlabDouble");
	   marbleBrickSlabDouble = new marbleBrickSlab(529, true, Material.rock).setHardness(2.0F).setStepSound(Block.soundStoneFootstep).setCreativeTab(null).setUnlocalizedName("mullak99:marbleBrickSlabDouble");
	   
	   
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
		
		mullakCore.InitialiseItem(aluminiumRaw, "Aluminium Oxide");
		mullakCore.InitialiseItem(ingotAluminium, "Aluminium Ingot");
		
		mullakCore.InitialiseItem(redstoneBattery, "Redstone Battery");
		
		mullakCore.InitialiseItem(steelHammer, "Steel Hammer");
		
		mullakCore.InitialiseItem(bauxite, "Bauxite");
		mullakCore.InitialiseItem(dustAluminium, "Aluminium Dust");
		mullakCore.InitialiseItem(ingotSteelRaw, "Raw Steel Ingot");
		
		mullakCore.InitialiseItem(grate, "Grate");
		mullakCore.InitialiseItem(essenceExtractor, "Essence Extractor");
		mullakCore.InitialiseItem(portableCrafting, "Portable Crafting Table");
		
		//mullakCore.InitializedItem(foamFinger, "Foam Finger");
		
		mullakCore.InitialiseItem(Chain, "Chain");
		
			//Food
			mullakCore.InitialiseItem(enchantedMelon, "Michael Melon");
			mullakCore.InitialiseItem(muttonRaw, "Raw Mutton");
			mullakCore.InitialiseItem(muttonCooked, "Cooked Mutton");
			mullakCore.InitialiseItem(fleshCooked, "Cooked Zombie Flesh");
			
			
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
			mullakCore.InitialiseItem(paxelMullite, "Mullite Paxel");
			
			mullakCore.InitialiseItem(pickaxeRoxite, "Roxite Pickaxe");
			mullakCore.InitialiseItem(shovelRoxite, "Roxite Shovel");
			mullakCore.InitialiseItem(swordRoxite, "Roxite Sword");
			mullakCore.InitialiseItem(axeRoxite, "Roxite Axe");
			mullakCore.InitialiseItem(hoeRoxite, "Roxite Hoe");
			mullakCore.InitialiseItem(swordRoxiteDE, "Roxite Sword");
			mullakCore.InitialiseItem(paxelRoxite, "Roxite Paxel");
			
			mullakCore.InitialiseItem(pickaxeBronze, "Bronze Pickaxe");
			mullakCore.InitialiseItem(shovelBronze, "Bronze Shovel");
			mullakCore.InitialiseItem(swordBronze, "Bronze Sword");
			mullakCore.InitialiseItem(axeBronze, "Bronze Axe");
			mullakCore.InitialiseItem(hoeBronze, "Bronze Hoe");
			mullakCore.InitialiseItem(paxelBronze, "Bronze Paxel");
			
			mullakCore.InitialiseItem(pickaxeSteel, "Steel Pickaxe");
			mullakCore.InitialiseItem(shovelSteel, "Steel Shovel");
			mullakCore.InitialiseItem(swordSteel, "Steel Sword");
			mullakCore.InitialiseItem(axeSteel, "Steel Axe");
			mullakCore.InitialiseItem(hoeSteel, "Steel Hoe");
			mullakCore.InitialiseItem(paxelSteel, "Steel Paxel");
			
			mullakCore.InitialiseItem(pickaxeAlpha, "Nostalgia Pickaxe");
			mullakCore.InitialiseItem(shovelAlpha, "Nostalgia Shovel");
			mullakCore.InitialiseItem(swordAlpha, "Nostalgia Sword");
			mullakCore.InitialiseItem(axeAlpha, "Nostalgia Axe");
			mullakCore.InitialiseItem(hoeAlpha, "Nostalgia Hoe");
			mullakCore.InitialiseItem(paxelAlpha, "Nostalgia Paxel");
			
			mullakCore.InitialiseItem(pickaxeBedrock, "Bedrock Pickaxe");
			mullakCore.InitialiseItem(shovelBedrock, "Bedrock Shovel");
			mullakCore.InitialiseItem(swordBedrock, "Bedrock Sword");
			mullakCore.InitialiseItem(axeBedrock, "Bedrock Axe");
			
			mullakCore.InitialiseItem(paxelIron, "Iron Paxel");
			mullakCore.InitialiseItem(paxelDiamond, "Diamond Paxel");
			
			MinecraftForge.setToolClass(paxelIron, "pickaxe", 2);
			MinecraftForge.setToolClass(paxelBronze, "pickaxe", 2);
			MinecraftForge.setToolClass(paxelSteel, "pickaxe", 2);
			MinecraftForge.setToolClass(paxelDiamond, "pickaxe", 3);
			MinecraftForge.setToolClass(paxelMullite, "pickaxe", 4);
			MinecraftForge.setToolClass(paxelRoxite, "pickaxe", 4);
			MinecraftForge.setToolClass(paxelAlpha, "pickaxe", 3);
			
			
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
			
			//Catalyst
			
			
			//Events
			
			MinecraftForge.EVENT_BUS.register(new EntitySheepOverride(null));
			MinecraftForge.EVENT_BUS.register(new EntityZombieOverride(null));
			MinecraftForge.EVENT_BUS.register(new mullak99TreeBonemealEvent());
			MinecraftForge.EVENT_BUS.register(new mullakCore());
			
			
			//World Gen
			ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(mullak99.blood.itemID, 0, 2, 10, 30));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(mullak99.blood.itemID, 0, 2, 5, 25));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(mullak99.blood.itemID, 0, 2, 5, 25));
			ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).addItem(new WeightedRandomChestContent(mullak99.blood.itemID, 0, 2, 3, 10));
			ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(mullak99.blood.itemID, 0, 2, 3, 10));
			ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(mullak99.blood.itemID, 0, 2, 5, 15));
			ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(new WeightedRandomChestContent(mullak99.blood.itemID, 0, 1, 3, 20));
			
		
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
		
		
		
		//Recipes
		mullak99Crafting.Recipes();
		
		
		
		//Handlers
		
		GameRegistry.registerFuelHandler(new mullak99FuelHandler());
		GameRegistry.registerCraftingHandler(new localHandler());
		
		
		//Container Item
		
		
		
		
		
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
		
		//Render Register
		proxy.registerRenderInformation();
		
		
		
		/*//DIM
		DimensionManager.registerProviderType(DimID, WorldProviderMullak99.class, true);
		DimensionManager.registerDimension(DimID, DimID);*/
		

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