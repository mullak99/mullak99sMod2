package mullak99.mullak99sMod;

import mullak99.mullak99sMod.armor.alphaArmor;
import mullak99.mullak99sMod.armor.bronzeArmor;
import mullak99.mullak99sMod.armor.mulliteArmor;
import mullak99.mullak99sMod.armor.roxiteArmor;
import mullak99.mullak99sMod.armor.steelArmor;
import mullak99.mullak99sMod.blocks.MCraftingTable;
import mullak99.mullak99sMod.blocks.alphaFurnace;
import mullak99.mullak99sMod.blocks.alphaGrass;
import mullak99.mullak99sMod.blocks.alphaLeaves;
import mullak99.mullak99sMod.blocks.alphaSapling;
import mullak99.mullak99sMod.blocks.alphaStone;
import mullak99.mullak99sMod.blocks.clearGlass;
import mullak99.mullak99sMod.blocks.clearGlassPane;
import mullak99.mullak99sMod.blocks.genericBlock;
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
import mullak99.mullak99sMod.items.alphaDust;
import mullak99.mullak99sMod.items.axeMullite;
import mullak99.mullak99sMod.items.blood;
import mullak99.mullak99sMod.items.bucketChocMilk;
import mullak99.mullak99sMod.items.enchantedMelon;
import mullak99.mullak99sMod.items.grate;
import mullak99.mullak99sMod.items.hoeMullite;
import mullak99.mullak99sMod.items.ingotAlpha;
import mullak99.mullak99sMod.items.ingotAluminium;
import mullak99.mullak99sMod.items.ingotCopper;
import mullak99.mullak99sMod.items.ingotSteel;
import mullak99.mullak99sMod.items.ingotTin;
import mullak99.mullak99sMod.items.ingotWroughtIron;
import mullak99.mullak99sMod.items.mortarPestle;
import mullak99.mullak99sMod.items.mullite;
import mullak99.mullak99sMod.items.paxelBronze;
import mullak99.mullak99sMod.items.paxelDiamond;
import mullak99.mullak99sMod.items.paxelIron;
import mullak99.mullak99sMod.items.paxelMGem;
import mullak99.mullak99sMod.items.paxelSteel;
import mullak99.mullak99sMod.items.pickaxeMullite;
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
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ThreadDownloadImageData;
import net.minecraft.client.renderer.texture.TextureObject;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.stats.Achievement;
import net.minecraft.stats.AchievementList;
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
    
    //Food
    public static Item enchantedMelon;
    public static Item muttonRaw;
    public static Item muttonCooked;
    public static Item fleshCooked;
    
    //Drink
    public static Item bucketChocMilk;
    
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
    

	
	//Enum Tool Material
	public static EnumToolMaterial mulliteTools = EnumHelper.addToolMaterial("Mullite", 3, 2500, 10.0F, 10.0F, 20);
	public static EnumToolMaterial mullitePaxel = EnumHelper.addToolMaterial("MullitePaxel", 3, 5000, 10.0F, 4, 20);
	public static EnumToolMaterial mulliteToolsDE = EnumHelper.addToolMaterial("MulliteDE", 3, 3000, 12.0F, 6, 22);
	public static EnumToolMaterial bronzeTools = EnumHelper.addToolMaterial("Bronze", 2, 300, 6.0F, 2.0F, 14);
	public static EnumToolMaterial bronzePaxel = EnumHelper.addToolMaterial("BronzePaxel", 2, 600, 6.0F, 2.0F, 14);
	public static EnumToolMaterial steelTools = EnumHelper.addToolMaterial("Steel", 2, 500, 7.5F, 3.0F, 15);
	public static EnumToolMaterial steelPaxel = EnumHelper.addToolMaterial("SteelPaxel", 2, 1000, 7.5F, 3.0F, 15);
	public static EnumToolMaterial alphaTools = EnumHelper.addToolMaterial("Alpha", 3, 512, 8.5F, 2.5F, 16);
	public static EnumToolMaterial alphaPaxel = EnumHelper.addToolMaterial("AlphaPaxel", 3, 1024, 8.5F, 2.5F, 16);
	public static EnumToolMaterial bedrockTools = EnumHelper.addToolMaterial("Bedrock", 10, -1, 99999999999999999999999999999999999999.9F, 999999999, 999999999);
	public static EnumToolMaterial foamFingerTool = EnumHelper.addToolMaterial("Foam", 2, 100, 6.0F, 2.0F, 1);
	
	public static EnumToolMaterial ironPaxel = EnumHelper.addToolMaterial("IronPaxel",2, 550, 6.0F, 2.0F, 14);
	public static EnumToolMaterial diamondPaxel = EnumHelper.addToolMaterial("DiamondPaxel", 3, 2561, 8.0F, 3.0F, 10);
	
	//Enum Armor Material
	public static EnumArmorMaterial mulliteArmor = EnumHelper.addArmorMaterial("Mullite", 40, new int[]{5, 8, 6, 5}, 25);
	public static EnumArmorMaterial bronzeArmor = EnumHelper.addArmorMaterial("Bronze", 15, new int[]{2, 6, 5, 2}, 9);
	public static EnumArmorMaterial steelArmor = EnumHelper.addArmorMaterial("Steel", 15, new int[]{3, 7, 6, 3}, 9);
	public static EnumArmorMaterial alphaArmor = EnumHelper.addArmorMaterial("Alpha", 20, new int[]{4, 7, 6, 4}, 12);
	
	//Creative Tabs
	public static CreativeTabs tabMullak99sModI = new CreativeTabs("mullak99sModI") {
		public ItemStack getIconItemStack() {
			return new ItemStack(mullite);	
		}
	};
	
	public static CreativeTabs tabMullak99sModB = new CreativeTabs("mullak99sModB") {
		public ItemStack getIconItemStack() {
			return new ItemStack(blockMullite);	
		}
	};
	
	public static CreativeTabs tabMullak99sModWP = new CreativeTabs("mullak99sModWP") {
		public ItemStack getIconItemStack() {
			return new ItemStack(swordMulliteDE);	
		}
	};
	
	public static CreativeTabs tabMullak99sModWIP = new CreativeTabs("mullak99sModWIP") {
		public ItemStack getIconItemStack() {
			return new ItemStack(roxite);	
		}
	};
	public static CreativeTabs tabMullak99sModFood = new CreativeTabs("mullak99sModFood") {
		public ItemStack getIconItemStack() {
			return new ItemStack(muttonCooked);	
		}
	};
	
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

		String capeURL = "https://raw2.github.com/mullak99/mullak99sMod2/master/capes/DevCape/DevCape.png";
		String getArrayFromUrl = "https://raw2.github.com/mullak99/mullak99sMod2/master/capes/DevCape/DevCapes.txt";
		String[] devs = CapeCore.getArrayFromUrl(getArrayFromUrl);
		

		ThreadDownloadImageData image = new ThreadDownloadImageData(capeURL, null, null);

		for (String username : devs) {

		Minecraft.getMinecraft().renderEngine.loadTexture(new ResourceLocation("cloaks/" + username), (TextureObject) image);
		}
		}
	@SideOnly(Side.CLIENT)
	public static void addTesterCapes() {

		String capeURL = "https://raw2.github.com/mullak99/mullak99sMod2/master/capes/TesterCape/TesterCape.png";
		String getArrayFromUrl = "https://raw2.github.com/mullak99/mullak99sMod2/master/capes/TesterCape/TesterCapes.txt";
		String[] devs = CapeCore.getArrayFromUrl(getArrayFromUrl);
		

		ThreadDownloadImageData image = new ThreadDownloadImageData(capeURL, null, null);

		for (String username : devs) {

		Minecraft.getMinecraft().renderEngine.loadTexture(new ResourceLocation("cloaks/" + username), (TextureObject) image);
		}
		}
	@SideOnly(Side.CLIENT)
	public static void addYoutuberCapes() {

		String capeURL = "https://raw2.github.com/mullak99/mullak99sMod2/master/capes/YoutuberCape/YoutuberCape.png";
		String getArrayFromUrl = "https://raw2.github.com/mullak99/mullak99sMod2/master/capes/YoutuberCape/YoutuberCapes.txt";
		String[] devs = CapeCore.getArrayFromUrl(getArrayFromUrl);
		

		ThreadDownloadImageData image = new ThreadDownloadImageData(capeURL, null, null);

		for (String username : devs) {

		Minecraft.getMinecraft().renderEngine.loadTexture(new ResourceLocation("cloaks/" + username), (TextureObject) image);
		}
		}
	@SideOnly(Side.CLIENT)
	public static void addDonatorCapes1() {

		String capeURL = "https://raw2.github.com/mullak99/mullak99sMod2/master/capes/DonatorCape1/DonatorCape1.png";
		String getArrayFromUrl = "https://raw2.github.com/mullak99/mullak99sMod2/master/capes/DonatorCape1/DonatorCape1.txt";
		String[] devs = CapeCore.getArrayFromUrl(getArrayFromUrl);
		

		ThreadDownloadImageData image = new ThreadDownloadImageData(capeURL, null, null);

		for (String username : devs) {

		Minecraft.getMinecraft().renderEngine.loadTexture(new ResourceLocation("cloaks/" + username), (TextureObject) image);
		}
		}
	@SideOnly(Side.CLIENT)
	public static void addDonatorCapes2() {

		String capeURL = "https://raw2.github.com/mullak99/mullak99sMod2/master/capes/DonatorCape1/DonatorCape2.png";
		String getArrayFromUrl = "https://raw2.github.com/mullak99/mullak99sMod2/master/capes/DonatorCape1/DonatorCape2.txt";
		String[] devs = CapeCore.getArrayFromUrl(getArrayFromUrl);
		

		ThreadDownloadImageData image = new ThreadDownloadImageData(capeURL, null, null);

		for (String username : devs) {

		Minecraft.getMinecraft().renderEngine.loadTexture(new ResourceLocation("cloaks/" + username), (TextureObject) image);
		}
		}
	@SideOnly(Side.CLIENT)
	public static void addDonatorCapes3() {

		String capeURL = "https://raw2.github.com/mullak99/mullak99sMod2/master/capes/DonatorCape1/DonatorCape3.png";
		String getArrayFromUrl = "https://raw2.github.com/mullak99/mullak99sMod2/master/capes/DonatorCape1/DonatorCape3.txt";
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
		mullite = new mullite(1000).setMaxStackSize(64).setCreativeTab(tabMullak99sModI).setTextureName("mullak99:Mullite").setUnlocalizedName("mullak99:mullite");
		roxite = new roxite(1001).setMaxStackSize(64).setCreativeTab(tabMullak99sModI).setTextureName("mullak99:Roxite").setUnlocalizedName("mullak99:roxite");
		ingotCopper = new ingotCopper(1002).setMaxStackSize(64).setCreativeTab(tabMullak99sModI).setTextureName("mullak99:ingotCopper").setUnlocalizedName("mullak99:ingotCopper");
		ingotSteel = new ingotSteel(1003).setMaxStackSize(64).setCreativeTab(tabMullak99sModI).setTextureName("mullak99:ingotSteel").setUnlocalizedName("mullak99:ingotSteel");
		ingotTin = new ingotTin(1004).setMaxStackSize(64).setCreativeTab(tabMullak99sModI).setTextureName("mullak99:ingotTin").setUnlocalizedName("mullak99:ingotTin");
		dustAlpha = new alphaDust(900).setMaxStackSize(64).setCreativeTab(tabMullak99sModI).setTextureName("mullak99:alphaDust").setUnlocalizedName("mullak99:alphaDust");
		dustMullite = new Dust(1010).setMaxStackSize(64).setCreativeTab(tabMullak99sModI).setTextureName("mullak99:dustMullite").setUnlocalizedName("mullak99:mulliteDust");
		dustRoxite = new Dust(1011).setMaxStackSize(64).setCreativeTab(tabMullak99sModI).setTextureName("mullak99:dustRoxite").setUnlocalizedName("rmullak99:oxiteDust");
		dustCoal = new Dust(1012).setMaxStackSize(64).setCreativeTab(tabMullak99sModI).setTextureName("mullak99:dustCoal").setUnlocalizedName("mullak99:coalDust");
		dustCharcoal = new Dust(1013).setMaxStackSize(64).setCreativeTab(tabMullak99sModI).setTextureName("mullak99:dustCoal").setUnlocalizedName("mullak99:charcoalDust");
		dustBronze = new Dust(1014).setMaxStackSize(64).setCreativeTab(tabMullak99sModI).setTextureName("mullak99:dustBronze").setUnlocalizedName("mullak99:bronzeDust");
		dustCopper = new Dust(1015).setMaxStackSize(64).setCreativeTab(tabMullak99sModI).setTextureName("mullak99:dustCopper").setUnlocalizedName("mullak99:copperDust");
		dustTin = new Dust(1016).setMaxStackSize(64).setCreativeTab(tabMullak99sModI).setTextureName("mullak99:dustTin").setUnlocalizedName("mullak99:tinDust");
		ingotBronze = new ingotSteel(1017).setMaxStackSize(64).setCreativeTab(tabMullak99sModI).setTextureName("mullak99:ingotBronze").setUnlocalizedName("mullak99:ingotBronze");
		
		aluminiumRaw = new ingotAluminium(1018).setMaxStackSize(64).setCreativeTab(tabMullak99sModI).setTextureName("mullak99:aluminiumOxide").setUnlocalizedName("mullak99:aluminiumOxide");
		ingotAluminium = new ingotAluminium(1019).setMaxStackSize(64).setCreativeTab(tabMullak99sModI).setTextureName("mullak99:ingotAluminium").setUnlocalizedName("mullak99:ingotAluminium");
		
		bauxite = new Dust(1020).setMaxStackSize(64).setCreativeTab(tabMullak99sModI).setTextureName("mullak99:bauxite").setUnlocalizedName("mullak99:bauxite");
		dustAluminium = new Dust(1021).setMaxStackSize(64).setCreativeTab(tabMullak99sModI).setTextureName("mullak99:dustAluminium").setUnlocalizedName("mullak99:dustAluminium");
		
		ingotSteelRaw = new ingotSteel(1022).setMaxStackSize(64).setCreativeTab(tabMullak99sModI).setTextureName("mullak99:ingotSteelRaw").setUnlocalizedName("mullak99:ingotSteelRaw");
		
		redstoneBattery = new Battery(1032).setMaxStackSize(1).setMaxDamage(10).setCreativeTab(tabMullak99sModI).setTextureName("mullak99:redstoneBattery").setUnlocalizedName("mullak99:redstoneBattery");
		
		grate = new grate(1035).setMaxStackSize(64).setCreativeTab(tabMullak99sModI).setTextureName("mullak99:grate").setUnlocalizedName("mullak99:grate");
		
		ingotAlpha = new ingotAlpha(1040).setMaxStackSize(64).setCreativeTab(tabMullak99sModI).setTextureName("mullak99:ingotAlpha").setUnlocalizedName("mullak99:ingotAlpha");
		Chain = new ingotWroughtIron(1041).setMaxStackSize(64).setCreativeTab(tabMullak99sModI).setTextureName("mullak99:Chain").setUnlocalizedName("mullak99:Chain");
		//foamFinger = new swordMullite(1038, foamFingerTool).setMaxStackSize(64).setCreativeTab(tabMullak99sModI).setTextureName("mullak99:foamFinger").setUnlocalizedName("mullak99:foamFinger");
			
			//Food
			enchantedMelon = new enchantedMelon(1030, 20, 1.2F, false).setAlwaysEdible().setPotionEffect(Potion.regeneration.id, 2400, 16, 1.0F).setPotionEffect(Potion.resistance.id, 2400, 16, 1.0F).setPotionEffect(Potion.fireResistance.id, 2400, 16, 1.0F).setCreativeTab(tabMullak99sModFood).setUnlocalizedName("mullak99:enchantedMelon").setTextureName("melon");
			muttonRaw = (new ItemFood(1033, 3, 0.3F, true)).setCreativeTab(tabMullak99sModFood).setUnlocalizedName("mullak99:muttonRaw").setTextureName("mullak99:muttonRaw");
			muttonCooked = (new ItemFood(1034, 8, 0.8F, true)).setCreativeTab(tabMullak99sModFood).setUnlocalizedName("mullak99:muttonCooked").setTextureName("mullak99:muttonCooked");
			fleshCooked = (new ItemFood(1037, 6, 0.4F, true)).setCreativeTab(tabMullak99sModFood).setUnlocalizedName("mullak99:fleshCooked").setTextureName("mullak99:fleshCooked");
		
			//Drink
			bucketChocMilk = new bucketChocMilk(1031).setUnlocalizedName("bucketChocMilk").setCreativeTab(tabMullak99sModFood).setContainerItem(Item.bucketEmpty).setTextureName("mullak99:bucketChocMilk");
			blood = new blood(1036).setMaxStackSize(64).setCreativeTab(tabMullak99sModWIP).setTextureName("mullak99:blood").setUnlocalizedName("mullak99:blood");
			
			//Tools
			pickaxeMullite = new pickaxeMullite(1500, mulliteTools).setCreativeTab(tabMullak99sModWP).setTextureName("mullak99:pickaxeMullite").setUnlocalizedName("mullak99:pickaxeMullite");
			shovelMullite = new shovelMullite(1501, mulliteTools).setCreativeTab(tabMullak99sModWP).setTextureName("mullak99:shovelMullite").setUnlocalizedName("mullak99:shovelMullite");
			swordMullite = new swordMullite(1502, mulliteTools).setCreativeTab(tabMullak99sModWP).setTextureName("mullak99:swordMullite").setUnlocalizedName("mullak99:swordMullite");
			axeMullite = new axeMullite(1503, mulliteTools).setCreativeTab(tabMullak99sModWP).setTextureName("mullak99:axeMullite").setUnlocalizedName("mullak99:axeMullite");
			hoeMullite = new hoeMullite(1504, mulliteTools).setCreativeTab(tabMullak99sModWP).setTextureName("mullak99:hoeMullite").setUnlocalizedName("mullak99:hoeMullite");
			swordMulliteDE = new swordMulliteDE(1505, mulliteToolsDE).setCreativeTab(tabMullak99sModWP).setTextureName("mullak99:swordMulliteDE").setUnlocalizedName("mullak99:swordMulliteDE");
			
			pickaxeRoxite = new pickaxeMullite(2500, mulliteTools).setCreativeTab(tabMullak99sModWP).setTextureName("mullak99:pickaxeRoxite").setUnlocalizedName("mullak99:pickaxeRoxite");
			shovelRoxite = new shovelMullite(2501, mulliteTools).setCreativeTab(tabMullak99sModWP).setTextureName("mullak99:shovelRoxite").setUnlocalizedName("mullak99:shovelRoxite");
			swordRoxite = new swordMullite(2502, mulliteTools).setCreativeTab(tabMullak99sModWP).setTextureName("mullak99:swordRoxite").setUnlocalizedName("mullak99:swordRoxite");
			axeRoxite = new axeMullite(2503, mulliteTools).setCreativeTab(tabMullak99sModWP).setTextureName("mullak99:axeRoxite").setUnlocalizedName("mullak99:axeRoxite");
			hoeRoxite = new hoeMullite(2504, mulliteTools).setCreativeTab(tabMullak99sModWP).setTextureName("mullak99:hoeRoxite").setUnlocalizedName("mullak99:hoeRoxite");
			swordRoxiteDE = new swordMulliteDE(2505, mulliteToolsDE).setCreativeTab(tabMullak99sModWP).setTextureName("mullak99:swordRoxiteDE").setUnlocalizedName("mullak99:swordRoxiteDE");
			
			pickaxeBronze = new pickaxeMullite(3500, bronzeTools).setCreativeTab(tabMullak99sModWP).setTextureName("mullak99:pickaxeBronze").setUnlocalizedName("mullak99:pickaxeBronze");
			shovelBronze = new shovelMullite(3501, bronzeTools).setCreativeTab(tabMullak99sModWP).setTextureName("mullak99:shovelBronze").setUnlocalizedName("mullak99:shovelBronze");
			swordBronze = new swordMullite(3502, bronzeTools).setCreativeTab(tabMullak99sModWP).setTextureName("mullak99:swordBronze").setUnlocalizedName("mullak99:swordBronze");
			axeBronze = new axeMullite(3503, bronzeTools).setCreativeTab(tabMullak99sModWP).setTextureName("mullak99:axeBronze").setUnlocalizedName("mullak99:axeBronze");
			hoeBronze = new hoeMullite(3504, bronzeTools).setCreativeTab(tabMullak99sModWP).setTextureName("mullak99:hoeBronze").setUnlocalizedName("mullak99:hoeBronze");
			
			pickaxeSteel = new pickaxeMullite(3505, steelTools).setCreativeTab(tabMullak99sModWP).setTextureName("mullak99:pickaxeSteel").setUnlocalizedName("mullak99:pickaxeSteel");
			shovelSteel = new shovelMullite(3506, steelTools).setCreativeTab(tabMullak99sModWP).setTextureName("mullak99:shovelSteel").setUnlocalizedName("mullak99:shovelSteel");
			swordSteel = new swordMullite(3507, steelTools).setCreativeTab(tabMullak99sModWP).setTextureName("mullak99:swordSteel").setUnlocalizedName("mullak99:swordSteel");
			axeSteel = new axeMullite(3508, steelTools).setCreativeTab(tabMullak99sModWP).setTextureName("mullak99:axeSteel").setUnlocalizedName("mullak99:axeSteel");
			hoeSteel = new hoeMullite(3509, steelTools).setCreativeTab(tabMullak99sModWP).setTextureName("mullak99:hoeSteel").setUnlocalizedName("mullak99:hoeSteel");
			
			pickaxeAlpha = new pickaxeMullite(3510, alphaTools).setCreativeTab(tabMullak99sModWP).setTextureName("mullak99:pickaxeAlpha").setUnlocalizedName("mullak99:pickaxeAlpha");
			shovelAlpha = new shovelMullite(3511, alphaTools).setCreativeTab(tabMullak99sModWP).setTextureName("mullak99:shovelAlpha").setUnlocalizedName("mullak99:shovelAlpha");
			swordAlpha = new swordMullite(3512, alphaTools).setCreativeTab(tabMullak99sModWP).setTextureName("mullak99:swordAlpha").setUnlocalizedName("mullak99:swordAlpha");
			axeAlpha = new axeMullite(3513, alphaTools).setCreativeTab(tabMullak99sModWP).setTextureName("mullak99:axeAlpha").setUnlocalizedName("mullak99:axeAlpha");
			hoeAlpha = new hoeMullite(3514, alphaTools).setCreativeTab(tabMullak99sModWP).setTextureName("mullak99:hoeAlpha").setUnlocalizedName("mullak99:hoeAlpha");
			
			pickaxeBedrock = new pickaxeMullite(4000, bedrockTools).setCreativeTab(tabMullak99sModWP).setTextureName("mullak99:pickaxeBedrock").setUnlocalizedName("mullak99:pickaxeBedrock");
			shovelBedrock = new shovelMullite(4001, bedrockTools).setCreativeTab(tabMullak99sModWP).setTextureName("mullak99:shovelBedrock").setUnlocalizedName("mullak99:shovelBedrock");
			swordBedrock = new swordMullite(4002, bedrockTools).setCreativeTab(tabMullak99sModWP).setTextureName("mullak99:swordBedrock").setUnlocalizedName("mullak99:swordBedrock");
			axeBedrock = new axeMullite(4003, bedrockTools).setCreativeTab(tabMullak99sModWP).setTextureName("mullak99:axeBedrock").setUnlocalizedName("mullak99:axeBedrock");
			
			paxelIron = new paxelIron(4004, ironPaxel).setCreativeTab(tabMullak99sModWP).setTextureName("mullak99:paxelIron").setUnlocalizedName("mullak99:paxelIron");
			paxelDiamond = new paxelDiamond(4005, diamondPaxel).setCreativeTab(tabMullak99sModWP).setTextureName("mullak99:paxelDiamond").setUnlocalizedName("mullak99:paxelDiamond");
			paxelMullite = new paxelMGem(4006, mullitePaxel).setCreativeTab(tabMullak99sModWP).setTextureName("mullak99:paxelMullite").setUnlocalizedName("mullak99:paxelMullite");
			paxelRoxite = new paxelMGem(4007, mullitePaxel).setCreativeTab(tabMullak99sModWP).setTextureName("mullak99:paxelRoxite").setUnlocalizedName("mullak99:paxelRoxite");
			paxelBronze = new paxelBronze(4008, bronzePaxel).setCreativeTab(tabMullak99sModWP).setTextureName("mullak99:paxelBronze").setUnlocalizedName("mullak99:paxelBronze");
			paxelSteel = new paxelSteel(4009, steelPaxel).setCreativeTab(tabMullak99sModWP).setTextureName("mullak99:paxelSteel").setUnlocalizedName("mullak99:paxelSteel");
			paxelAlpha = new paxelSteel(4010, alphaPaxel).setCreativeTab(tabMullak99sModWP).setTextureName("mullak99:paxelAlpha").setUnlocalizedName("mullak99:paxelAlpha");
			
			//alphaPortal = new alphaPortal(4500).setUnlocalizedName("mullak99:alphaPortal");
			
			mortarPestle = new mortarPestle(1005).setMaxStackSize(1).setMaxDamage(64).setCreativeTab(tabMullak99sModWP).setTextureName("mullak99:mortarPestle").setUnlocalizedName("mullak99:mortarPestle");
			mortarPestleReinf = new mortarPestle(1006).setMaxStackSize(1).setMaxDamage(1024).setCreativeTab(tabMullak99sModWP).setTextureName("mullak99:mortarPestleReinf").setUnlocalizedName("mullak99:mortarPestleReinf");
			steelHammer = new HandTool(1007, mullakCore.nullTool).setMaxStackSize(1).setMaxDamage(16).setCreativeTab(tabMullak99sModWP).setTextureName("mullak99:steelHammer").setUnlocalizedName("mullak99:steelHammer");
			essenceExtractor = new HandTool(1008, mullakCore.nullTool).setMaxStackSize(1).setMaxDamage(64).setCreativeTab(tabMullak99sModWP).setTextureName("mullak99:essenceExtractor").setUnlocalizedName("mullak99:essenceExtractor");
			
			//Armor
			
			
			int renderMulliteArmor = proxy.addArmor("mulliteArmor");
			int renderRoxiteArmor = proxy.addArmor("roxiteArmor");
			int renderBronzeArmor = proxy.addArmor("bronzeArmor");
			int renderSteelArmor = proxy.addArmor("steelArmor");
			int renderAlphaArmor = proxy.addArmor("alphaArmor");
			
			
			helmetMullite = new mulliteArmor(1600, mulliteArmor, renderMulliteArmor, 0).setCreativeTab(tabMullak99sModWP).setTextureName("mullak99:helmetMullite").setUnlocalizedName("mullak99:helmetMullite");
			chestMullite = new mulliteArmor(1601, mulliteArmor, renderMulliteArmor, 1).setCreativeTab(tabMullak99sModWP).setTextureName("mullak99:chestMullite").setUnlocalizedName("mullak99:chestMullite");
			legsMullite = new mulliteArmor(1602, mulliteArmor, renderMulliteArmor, 2).setCreativeTab(tabMullak99sModWP).setTextureName("mullak99:legsMullite").setUnlocalizedName("mullak99:legsMullite");
			bootsMullite = new mulliteArmor(1603, mulliteArmor, renderMulliteArmor, 3).setCreativeTab(tabMullak99sModWP).setTextureName("mullak99:bootsMullite").setUnlocalizedName("mullak99:bootsMullite");
			
			helmetRoxite = new roxiteArmor(1610, mulliteArmor, renderRoxiteArmor, 0).setCreativeTab(tabMullak99sModWP).setTextureName("mullak99:helmetRoxite").setUnlocalizedName("mullak99:helmetRoxite");
			chestRoxite = new roxiteArmor(1611, mulliteArmor, renderRoxiteArmor, 1).setCreativeTab(tabMullak99sModWP).setTextureName("mullak99:chestRoxite").setUnlocalizedName("mullak99:chestRoxite");
			legsRoxite = new roxiteArmor(1612, mulliteArmor, renderRoxiteArmor, 2).setCreativeTab(tabMullak99sModWP).setTextureName("mullak99:legsRoxite").setUnlocalizedName("mullak99:legsRoxite");
			bootsRoxite = new roxiteArmor(1613, mulliteArmor, renderRoxiteArmor, 3).setCreativeTab(tabMullak99sModWP).setTextureName("mullak99:bootsRoxite").setUnlocalizedName("mullak99:bootsRoxite");
			
			helmetBronze = new bronzeArmor(1620, bronzeArmor, renderBronzeArmor, 0).setCreativeTab(tabMullak99sModWP).setTextureName("mullak99:helmetBronze").setUnlocalizedName("mullak99:helmetBronze");
			chestBronze = new bronzeArmor(1621, bronzeArmor, renderBronzeArmor, 1).setCreativeTab(tabMullak99sModWP).setTextureName("mullak99:chestBronze").setUnlocalizedName("mullak99:chestBronze");
			legsBronze = new bronzeArmor(1622, bronzeArmor, renderBronzeArmor, 2).setCreativeTab(tabMullak99sModWP).setTextureName("mullak99:legsBronze").setUnlocalizedName("mullak99:legsBronze");
			bootsBronze = new bronzeArmor(1623, bronzeArmor, renderBronzeArmor, 3).setCreativeTab(tabMullak99sModWP).setTextureName("mullak99:bootsBronze").setUnlocalizedName("mullak99:bootsBronze");
			
			helmetSteel = new steelArmor(1624, steelArmor, renderSteelArmor, 0).setCreativeTab(tabMullak99sModWP).setTextureName("mullak99:helmetSteel").setUnlocalizedName("mullak99:helmetSteel");
			chestSteel = new steelArmor(1625, steelArmor, renderSteelArmor, 1).setCreativeTab(tabMullak99sModWP).setTextureName("mullak99:chestSteel").setUnlocalizedName("mullak99:chestSteel");
			legsSteel = new steelArmor(1626, steelArmor, renderSteelArmor, 2).setCreativeTab(tabMullak99sModWP).setTextureName("mullak99:legsSteel").setUnlocalizedName("mullak99:legsSteel");
			bootsSteel = new steelArmor(1627, steelArmor, renderSteelArmor, 3).setCreativeTab(tabMullak99sModWP).setTextureName("mullak99:bootsSteel").setUnlocalizedName("mullak99:bootsSteel");
			
			helmetAlpha = new alphaArmor(1628, alphaArmor, renderAlphaArmor, 0).setCreativeTab(tabMullak99sModWP).setTextureName("mullak99:helmetAlpha").setUnlocalizedName("mullak99:helmetAlpha");
			chestAlpha = new alphaArmor(1629, alphaArmor, renderAlphaArmor, 1).setCreativeTab(tabMullak99sModWP).setTextureName("mullak99:chestAlpha").setUnlocalizedName("mullak99:chestAlpha");
			legsAlpha = new alphaArmor(1630, alphaArmor, renderAlphaArmor, 2).setCreativeTab(tabMullak99sModWP).setTextureName("mullak99:legsAlpha").setUnlocalizedName("mullak99:legsAlpha");
			bootsAlpha = new alphaArmor(1631, alphaArmor, renderAlphaArmor, 3).setCreativeTab(tabMullak99sModWP).setTextureName("mullak99:bootsAlpha").setUnlocalizedName("mullak99:bootsAlpha");
			
		//Blocks
		oreMullite = new oreMullite(500, Material.rock).setHardness(4.0F).setStepSound(Block.soundStoneFootstep).setCreativeTab(tabMullak99sModB).setTextureName("mullak99:oreMullite").setUnlocalizedName("mullak99:oreMullite");
		blockMullite = new genericBlock(501, Material.iron).setHardness(5.0F).setStepSound(Block.soundMetalFootstep).setCreativeTab(tabMullak99sModB).setTextureName("mullak99:blockMullite").setUnlocalizedName("mullak99:blockMullite");
		
		oreRoxite = new oreRoxite(502, Material.rock).setHardness(4.0F).setStepSound(Block.soundStoneFootstep).setCreativeTab(tabMullak99sModB).setTextureName("mullak99:oreRoxite").setUnlocalizedName("mullak99:oreRoxite");
		blockRoxite = new genericBlock(503, Material.iron).setHardness(5.0F).setStepSound(Block.soundMetalFootstep).setCreativeTab(tabMullak99sModB).setTextureName("mullak99:blockRoxite").setUnlocalizedName("mullak99:blockRoxite");
		
		oreCopper = new oreCopper(504, Material.rock).setHardness(3.0F).setStepSound(Block.soundStoneFootstep).setCreativeTab(tabMullak99sModB).setTextureName("mullak99:oreCopper").setUnlocalizedName("mullak99:oreCopper");
		blockCopper = new genericBlock(505, Material.iron).setHardness(4.0F).setStepSound(Block.soundMetalFootstep).setCreativeTab(tabMullak99sModB).setTextureName("mullak99:blockCopper").setUnlocalizedName("mullak99:blockCopper");
		
		oreTin = new oreTin(506, Material.rock).setHardness(3.0F).setStepSound(Block.soundStoneFootstep).setCreativeTab(tabMullak99sModB).setTextureName("mullak99:oreTin").setUnlocalizedName("mullak99:oreTin");
		blockTin = new genericBlock(507, Material.iron).setHardness(4.0F).setStepSound(Block.soundMetalFootstep).setCreativeTab(tabMullak99sModB).setTextureName("mullak99:blockTin").setUnlocalizedName("mullak99:blockTin");
		
		oreBauxite = new oreBauxite(514, Material.rock).setHardness(3.0F).setStepSound(Block.soundStoneFootstep).setCreativeTab(tabMullak99sModB).setTextureName("mullak99:oreBauxite").setUnlocalizedName("mullak99:oreBauxite");
		blockAluminium = new genericBlock(515, Material.iron).setHardness(4.0F).setStepSound(Block.soundMetalFootstep).setCreativeTab(tabMullak99sModB).setTextureName("mullak99:blockAluminium").setUnlocalizedName("mullak99:blockAluminium");
		
		
		blockBronze = new genericBlock(510, Material.iron).setHardness(4.0F).setStepSound(Block.soundMetalFootstep).setCreativeTab(tabMullak99sModB).setTextureName("mullak99:blockBronze").setUnlocalizedName("blockBronze");
		clearGlass = new clearGlass(511, Material.glass, false).setHardness(0.3F).setStepSound(Block.soundGlassFootstep).setCreativeTab(tabMullak99sModB).setUnlocalizedName("mullak99:clearGlass").setTextureName("mullak99:clearGlass");
		thinClearGlass = new clearGlassPane(512, "mullak99:clearGlass", "mullak99:clearGlass_pane_top", Material.glass, false).setHardness(0.3F).setStepSound(Block.soundGlassFootstep).setUnlocalizedName("mullak99:thinClearGlass");
		MCraftingTable = new MCraftingTable(513).setHardness(3.0F).setStepSound(Block.soundMetalFootstep).setCreativeTab(tabMullak99sModB).setTextureName("mullak99:MCrafting").setUnlocalizedName("mullak99:MTable");
		
		blockAlpha = new genericBlock(520, Material.iron).setHardness(4.0F).setStepSound(Block.soundMetalFootstep).setCreativeTab(tabMullak99sModB).setTextureName("mullak99:blockAlpha").setUnlocalizedName("mullak99:blockAlpha");
		
		oreAlpha = new oreAlpha(508, Material.rock).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundStoneFootstep).setCreativeTab(tabMullak99sModB).setTextureName("mullak99:oreAlpha").setUnlocalizedName("mullak99:oreAlpha");
		alphaCobble = new genericBlock(910, Material.rock).setHardness(2.0F).setStepSound(Block.soundStoneFootstep).setResistance(10.0F).setCreativeTab(tabMullak99sModB).setTextureName("mullak99:alphaCobble").setUnlocalizedName("mullak99:alphaCobble");
		alphaStone = new alphaStone(911, Material.rock).setHardness(1.5F).setStepSound(Block.soundStoneFootstep).setResistance(10.0F).setCreativeTab(tabMullak99sModWIP).setTextureName("stone").setUnlocalizedName("mullak99:alphaStone");
		alphaFurnaceIdle = new alphaFurnace(912, false).setHardness(3.5F).setStepSound(Block.soundStoneFootstep).setCreativeTab(tabMullak99sModWIP).setUnlocalizedName("mullak99:alphaFurnace").setCreativeTab(CreativeTabs.tabDecorations);
	    alphaFurnaceBurning = new alphaFurnace(913, true).setHardness(3.5F).setStepSound(Block.soundStoneFootstep).setLightValue(0.875F).setUnlocalizedName("mullak99:alphaFurnace");
	    alphaLeaves = (alphaLeaves)(new alphaLeaves(914)).setHardness(0.2F).setLightOpacity(1).setStepSound(Block.soundGrassFootstep).setUnlocalizedName("mullak99:alphaLeaves").setTextureName("mullak99:leaves");
	    alphaGrass = new alphaGrass(915).setHardness(0.2F).setCreativeTab(tabMullak99sModB).setStepSound(Block.soundGrassFootstep).setUnlocalizedName("mullak99:alphaGrass");
	    alphaSapling = new alphaSapling(916).setHardness(0.0F).setCreativeTab(tabMullak99sModB).setStepSound(Block.soundGrassFootstep).setUnlocalizedName("mullak99:alphaSapling").setTextureName("mullak99:alphaSapling");
	    
	    
	    
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
		LanguageRegistry.addName(mullite, "Mullite");
		LanguageRegistry.addName(roxite, "Roxite");
		LanguageRegistry.addName(ingotCopper, "Copper Ingot");
		LanguageRegistry.addName(ingotSteel, "Steel Ingot");
		LanguageRegistry.addName(ingotTin, "Tin Ingot");
		LanguageRegistry.addName(dustAlpha, "Dust of Nostalgia");
		LanguageRegistry.addName(mortarPestle, "Mortar and Pestle");
		LanguageRegistry.addName(mortarPestleReinf, "Reinforced Mortar and Pestle");
		LanguageRegistry.addName(dustMullite, "Mullite Dust");
		LanguageRegistry.addName(dustRoxite, "Roxite Dust");
		LanguageRegistry.addName(dustCoal, "Coal Dust");
		LanguageRegistry.addName(dustCharcoal, "Charcoal Dust");
		LanguageRegistry.addName(dustBronze, "Bronze Dust");
		LanguageRegistry.addName(dustCopper, "Copper Dust");
		LanguageRegistry.addName(dustTin, "Tin Dust");
		LanguageRegistry.addName(ingotBronze, "Bronze Ingot");
		LanguageRegistry.addName(ingotAlpha, "Nostalgia Ingot");
		
		LanguageRegistry.addName(aluminiumRaw, "Aluminium Oxide");
		LanguageRegistry.addName(ingotAluminium, "Aluminium Ingot");
		
		LanguageRegistry.addName(redstoneBattery, "Redstone Battery");
		
		LanguageRegistry.addName(steelHammer, "Steel Hammer");
		
		LanguageRegistry.addName(bauxite, "Bauxite");
		LanguageRegistry.addName(dustAluminium, "Aluminium Dust");
		LanguageRegistry.addName(ingotSteelRaw, "Raw Steel Ingot");
		
		LanguageRegistry.addName(grate, "Grate");
		LanguageRegistry.addName(essenceExtractor, "Essence Extractor");
		
		//LanguageRegistry.addName(foamFinger, "Foam Finger");
		
		LanguageRegistry.addName(Chain, "Chain");
		
			//Food
			LanguageRegistry.addName(enchantedMelon, "Michael Melon");
			LanguageRegistry.addName(muttonRaw, "Raw Mutton");
			LanguageRegistry.addName(muttonCooked, "Cooked Mutton");
			LanguageRegistry.addName(fleshCooked, "Cooked Zombie Flesh");
			
			
			//Drink
			LanguageRegistry.addName(bucketChocMilk, "Chocolate Milk");
			LanguageRegistry.addName(blood, "Blood");
		
			//Tools
			LanguageRegistry.addName(pickaxeMullite, "Mullite Pickaxe");
			LanguageRegistry.addName(shovelMullite, "Mullite Shovel");
			LanguageRegistry.addName(swordMullite, "Mullite Sword");
			LanguageRegistry.addName(axeMullite, "Mullite Axe");
			LanguageRegistry.addName(hoeMullite, "Mullite Hoe");
			LanguageRegistry.addName(swordMulliteDE, "Mullite Sword");
			LanguageRegistry.addName(paxelMullite, "Mullite Paxel");
			
			LanguageRegistry.addName(pickaxeRoxite, "Roxite Pickaxe");
			LanguageRegistry.addName(shovelRoxite, "Roxite Shovel");
			LanguageRegistry.addName(swordRoxite, "Roxite Sword");
			LanguageRegistry.addName(axeRoxite, "Roxite Axe");
			LanguageRegistry.addName(hoeRoxite, "Roxite Hoe");
			LanguageRegistry.addName(swordRoxiteDE, "Roxite Sword");
			LanguageRegistry.addName(paxelRoxite, "Roxite Paxel");
			
			LanguageRegistry.addName(pickaxeBronze, "Bronze Pickaxe");
			LanguageRegistry.addName(shovelBronze, "Bronze Shovel");
			LanguageRegistry.addName(swordBronze, "Bronze Sword");
			LanguageRegistry.addName(axeBronze, "Bronze Axe");
			LanguageRegistry.addName(hoeBronze, "Bronze Hoe");
			LanguageRegistry.addName(paxelBronze, "Bronze Paxel");
			
			LanguageRegistry.addName(pickaxeSteel, "Steel Pickaxe");
			LanguageRegistry.addName(shovelSteel, "Steel Shovel");
			LanguageRegistry.addName(swordSteel, "Steel Sword");
			LanguageRegistry.addName(axeSteel, "Steel Axe");
			LanguageRegistry.addName(hoeSteel, "Steel Hoe");
			LanguageRegistry.addName(paxelSteel, "Steel Paxel");
			
			LanguageRegistry.addName(pickaxeAlpha, "Nostalgia Pickaxe");
			LanguageRegistry.addName(shovelAlpha, "Nostalgia Shovel");
			LanguageRegistry.addName(swordAlpha, "Nostalgia Sword");
			LanguageRegistry.addName(axeAlpha, "Nostalgia Axe");
			LanguageRegistry.addName(hoeAlpha, "Nostalgia Hoe");
			LanguageRegistry.addName(paxelAlpha, "Nostalgia Paxel");
			
			LanguageRegistry.addName(pickaxeBedrock, "Bedrock Pickaxe");
			LanguageRegistry.addName(shovelBedrock, "Bedrock Shovel");
			LanguageRegistry.addName(swordBedrock, "Bedrock Sword");
			LanguageRegistry.addName(axeBedrock, "Bedrock Axe");
			
			LanguageRegistry.addName(paxelIron, "Iron Paxel");
			LanguageRegistry.addName(paxelDiamond, "Diamond Paxel");
			
			
			//Armor
			LanguageRegistry.addName(helmetMullite, "Mullite Helmet");
			LanguageRegistry.addName(chestMullite, "Mullite Chestplate");
			LanguageRegistry.addName(legsMullite, "Mullite Leggings");
			LanguageRegistry.addName(bootsMullite, "Mullite Boots");
			
			LanguageRegistry.addName(helmetRoxite, "Roxite Helmet");
			LanguageRegistry.addName(chestRoxite, "Roxite Chestplate");
			LanguageRegistry.addName(legsRoxite, "Roxite Leggings");
			LanguageRegistry.addName(bootsRoxite, "Roxite Boots");
			
			LanguageRegistry.addName(helmetBronze, "Bronze Helmet");
			LanguageRegistry.addName(chestBronze, "Bronze Chestplate");
			LanguageRegistry.addName(legsBronze, "Bronze Leggings");
			LanguageRegistry.addName(bootsBronze, "Bronze Boots");
			
			LanguageRegistry.addName(helmetSteel, "Steel Helmet");
			LanguageRegistry.addName(chestSteel, "Steel Chestplate");
			LanguageRegistry.addName(legsSteel, "Steel Leggings");
			LanguageRegistry.addName(bootsSteel, "Steel Boots");
			
			LanguageRegistry.addName(helmetAlpha, "Nostalgia Helmet");
			LanguageRegistry.addName(chestAlpha, "Nostalgia Chestplate");
			LanguageRegistry.addName(legsAlpha, "Nostalgia Leggings");
			LanguageRegistry.addName(bootsAlpha, "Nostalgia Boots");
			
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
			ChestGenHooks.getInfo(ChestGenHooks.BONUS_CHEST).addItem(new WeightedRandomChestContent(mullak99.blood.itemID, 0, 1, 1, 10));
			
		
		//Blocks
		GameRegistry.registerBlock(oreMullite, "oreMullite");
		LanguageRegistry.addName(oreMullite, "Mullite Ore");
		MinecraftForge.setBlockHarvestLevel(oreMullite, "pickaxe", 3);
		
		GameRegistry.registerBlock(blockMullite, "blockMullite");
		LanguageRegistry.addName(blockMullite, "Mullite Block");
		MinecraftForge.setBlockHarvestLevel(blockMullite, "pickaxe", 3);
		
		GameRegistry.registerBlock(oreRoxite, "oreRoxite");
		LanguageRegistry.addName(oreRoxite, "Roxite Ore");
		MinecraftForge.setBlockHarvestLevel(oreRoxite, "pickaxe", 3);
		
		GameRegistry.registerBlock(blockRoxite, "blockRoxite");
		LanguageRegistry.addName(blockRoxite, "Roxite Block");
		MinecraftForge.setBlockHarvestLevel(blockRoxite, "pickaxe", 3);
		
		GameRegistry.registerBlock(oreCopper, "oreCopper");
		LanguageRegistry.addName(oreCopper, "Copper Ore");
		MinecraftForge.setBlockHarvestLevel(oreCopper, "pickaxe", 1);
		
		GameRegistry.registerBlock(blockCopper, "blockCopper");
		LanguageRegistry.addName(blockCopper, "Copper Block");
		MinecraftForge.setBlockHarvestLevel(blockCopper, "pickaxe", 1);
		
		GameRegistry.registerBlock(oreTin, "oreTin");
		LanguageRegistry.addName(oreTin, "Tin Ore");
		MinecraftForge.setBlockHarvestLevel(oreTin, "pickaxe", 1);
		
		GameRegistry.registerBlock(blockTin, "blockTin");
		LanguageRegistry.addName(blockTin, "Tin Block");
		MinecraftForge.setBlockHarvestLevel(blockTin, "pickaxe", 1);
		
		GameRegistry.registerBlock(clearGlass, "clearGlass");
		LanguageRegistry.addName(clearGlass, "Clear Glass");
		
		GameRegistry.registerBlock(thinClearGlass, "thinClearGlass");
		LanguageRegistry.addName(thinClearGlass, "Clear Glass Pane");
		
		GameRegistry.registerBlock(alphaCobble, "alphaCobble");
		LanguageRegistry.addName(alphaCobble, "Nostalgia Cobblestone");
		MinecraftForge.setBlockHarvestLevel(alphaCobble, "pickaxe", 0);
		
		GameRegistry.registerBlock(alphaStone, "alphaStone");
		LanguageRegistry.addName(alphaStone, "Nostalgia Stone");
		MinecraftForge.setBlockHarvestLevel(alphaStone, "pickaxe", 0);
		
		GameRegistry.registerBlock(oreAlpha, "oreAlpha");
		LanguageRegistry.addName(oreAlpha, "Nostalgia Ore");
		MinecraftForge.setBlockHarvestLevel(oreAlpha, "pickaxe", 2);
		
		GameRegistry.registerBlock(blockBronze, "blockBronze");
		LanguageRegistry.addName(blockBronze, "Bronze Block");
		MinecraftForge.setBlockHarvestLevel(blockBronze, "pickaxe", 1);
		
		GameRegistry.registerBlock(alphaFurnaceIdle, "alphaFurnaceIdle");
		LanguageRegistry.addName(alphaFurnaceIdle, "Nostalgia Furnace");
		MinecraftForge.setBlockHarvestLevel(alphaFurnaceIdle, "pickaxe", 0);
		
		GameRegistry.registerBlock(alphaFurnaceBurning, "alphaFurnaceBurning");
		LanguageRegistry.addName(alphaFurnaceBurning, "Nostalgia Furnace");
		MinecraftForge.setBlockHarvestLevel(alphaFurnaceBurning, "pickaxe", 0);
		
		GameRegistry.registerBlock(alphaLeaves, "alphaLeaves");
		LanguageRegistry.addName(alphaLeaves, "Nostalgia Leaves");
		
		GameRegistry.registerBlock(alphaGrass, "alphaGrass");
		LanguageRegistry.addName(alphaGrass, "Nostalgia Grass");
		
		GameRegistry.registerBlock(alphaSapling, "alphaSapling");
		LanguageRegistry.addName(alphaSapling, "Nostalgia Sapling");
		
		GameRegistry.registerBlock(MCraftingTable, "MCraftingTable");
		LanguageRegistry.addName(MCraftingTable, "Advanced Crafting Table");
		MinecraftForge.setBlockHarvestLevel(MCraftingTable, "pickaxe", 2);
		
		GameRegistry.registerBlock(oreBauxite, "oreBauxite");
		LanguageRegistry.addName(oreBauxite, "Bauxite Ore");
		MinecraftForge.setBlockHarvestLevel(oreBauxite, "pickaxe", 1);
		
		GameRegistry.registerBlock(blockAluminium, "blockAluminium");
		LanguageRegistry.addName(blockAluminium, "Aluminium Block");
		MinecraftForge.setBlockHarvestLevel(blockAluminium, "pickaxe", 1);
		
		GameRegistry.registerBlock(blockAlpha, "blockAlpha");
		LanguageRegistry.addName(blockAlpha, "Nostalgia Block");
		MinecraftForge.setBlockHarvestLevel(blockAlpha, "pickaxe", 2);
		
		
		
		
		//Handlers
		
		GameRegistry.registerFuelHandler(new mullak99FuelHandler());
		GameRegistry.registerCraftingHandler(new localHandler());
		
		
		//Container Item
		
		
		
		//Crafting
		
			//Blocks
			GameRegistry.addRecipe(new ItemStack(blockMullite), "MMM", "MMM", "MMM",
					'M', mullite);
			GameRegistry.addShapelessRecipe(new ItemStack(mullite, 9), blockMullite);
		
			GameRegistry.addRecipe(new ItemStack(blockCopper), "CCC", "CCC", "CCC",
					'C', ingotCopper);
			GameRegistry.addShapelessRecipe(new ItemStack(ingotCopper, 9), blockCopper);
		
			GameRegistry.addRecipe(new ItemStack(blockTin), "TTT", "TTT", "TTT",
					'T', ingotTin);
			GameRegistry.addShapelessRecipe(new ItemStack(ingotTin, 9), blockTin);
			
			GameRegistry.addRecipe(new ItemStack(blockBronze), "BBB", "BBB", "BBB",
					'B', ingotBronze);
			GameRegistry.addShapelessRecipe(new ItemStack(ingotBronze, 9), blockBronze);
			
			GameRegistry.addRecipe(new ItemStack(blockMullite), "MMM", "MMM", "MMM",
					'M', mullite);
			GameRegistry.addShapelessRecipe(new ItemStack(mullite, 9), blockMullite);
		
			GameRegistry.addRecipe(new ItemStack(blockCopper), "CCC", "CCC", "CCC",
					'C', ingotCopper);
			GameRegistry.addShapelessRecipe(new ItemStack(ingotCopper, 9), blockCopper);
		
			GameRegistry.addRecipe(new ItemStack(thinClearGlass, 16), "GGG", "GGG",
					'G', clearGlass);
			GameRegistry.addShapelessRecipe(new ItemStack(ingotTin, 9), blockTin);
			
			GameRegistry.addRecipe(new ItemStack(alphaCobble, 8), "CCC", "CDC", "CCC",
					'C', Block.cobblestone, 'D', dustAlpha);
			
			GameRegistry.addRecipe(new ItemStack(alphaStone, 8), "SSS", "SDS", "SSS",
					'S', Block.stone, 'D', dustAlpha);
			
			GameRegistry.addRecipe(new ItemStack(alphaGrass, 8), "GGG", "GDG", "GGG",
					'G', Block.grass, 'D', dustAlpha);
			
			GameRegistry.addRecipe(new ItemStack(alphaSapling, 8), "SSS", "SDS", "SSS",
					'S', Block.sapling, 'D', dustAlpha);
			
			GameRegistry.addShapelessRecipe(new ItemStack(Block.grass), Block.dirt, (new ItemStack(Item.dyePowder, 2, 15)));
			
			GameRegistry.addRecipe(new ItemStack(blockAluminium), "AAA", "AAA", "AAA",
					'A', ingotAluminium);
			GameRegistry.addShapelessRecipe(new ItemStack(ingotAluminium, 9), blockAluminium);
			
			GameRegistry.addRecipe(new ItemStack(MCraftingTable), "AGA", "GCG", "AGA",
					'G', Item.ingotGold, 'C', Block.workbench, 'A', ingotAluminium);
			
			GameRegistry.addRecipe(new ItemStack(blockAlpha), "AAA", "AAA", "AAA",
					'A', ingotAlpha);
			GameRegistry.addShapelessRecipe(new ItemStack(ingotAlpha, 9), blockAlpha);
			
			
			//Items
			
			
			GameRegistry.addRecipe(new ItemStack(mortarPestle), " I ", "S S", " S ",
					'S', Block.stone, 'I', Item.ingotIron);
			
			GameRegistry.addRecipe(new ItemStack(mortarPestleReinf), " S ", "O O", " O ",
					'O', Block.obsidian, 'S', ingotSteel);
			
			GameRegistry.addRecipe(new ItemStack(grate, 4), "CAC", "ASA", "CAC",
					'C', dustCopper, 'A', dustAluminium, 'S', ingotSteel);
			
			
			GameRegistry.addRecipe(new ItemStack(Chain, 6, 0), "I", "I",
					'I', Item.ingotIron);
			
			GameRegistry.addShapelessRecipe(new ItemStack(dustBronze, 4), dustTin, dustCopper, dustCopper, dustCopper);
			
			GameRegistry.addShapelessRecipe(new ItemStack(ingotSteelRaw), dustCoal, dustCoal, Item.ingotIron);
			GameRegistry.addShapelessRecipe(new ItemStack(ingotSteelRaw), dustCharcoal, dustCharcoal, Item.ingotIron);
			GameRegistry.addShapelessRecipe(new ItemStack(ingotSteelRaw), dustCoal, dustCharcoal, Item.ingotIron);
			
			
			//Essence Extractor
			
			GameRegistry.addRecipe(new ItemStack(dustAlpha), "SSS", "SES", "SSS",
					'S', alphaSapling, 'E', (new ItemStack(essenceExtractor, 1, 32767)));
			
			GameRegistry.addRecipe(new ItemStack(dustAlpha), "SSS", "SES", "SSS",
					'S', alphaStone, 'E', (new ItemStack(essenceExtractor, 1, 32767)));
			
			GameRegistry.addRecipe(new ItemStack(dustAlpha), "CCC", "CEC", "CCC",
					'C', alphaCobble, 'E', (new ItemStack(essenceExtractor, 1, 32767)));
			
			GameRegistry.addRecipe(new ItemStack(dustAlpha), "GGG", "GEG", "GGG",
					'G', alphaGrass, 'E', (new ItemStack(essenceExtractor, 1, 32767)));
			
			GameRegistry.addRecipe(new ItemStack(dustAlpha), "SSS", "SES", "SSS",
					'S', alphaSapling, 'E', (new ItemStack(essenceExtractor, 1, 32767)));
			
			GameRegistry.addRecipe(new ItemStack(dustAlpha), "IE",
					'I', ingotAlpha, 'E', (new ItemStack(essenceExtractor, 1, 32767)));
			
			GameRegistry.addRecipe(new ItemStack(dustAlpha), "EI",
					'I', ingotAlpha, 'E', (new ItemStack(essenceExtractor, 1, 32767)));
			
			GameRegistry.addRecipe(new ItemStack(dustAlpha, 9), "BE",
					'B', blockAlpha, 'E', (new ItemStack(essenceExtractor, 1, 32767)));
			
			GameRegistry.addRecipe(new ItemStack(dustAlpha, 9), "EB",
					'B', blockAlpha, 'E', (new ItemStack(essenceExtractor, 1, 32767)));
			
			
			
			//Mortar and Pestle
			
			GameRegistry.addShapelessRecipe(new ItemStack(dustCoal), Item.coal, (new ItemStack(mortarPestle, 1, 32767)));
			GameRegistry.addShapelessRecipe(new ItemStack(dustCoal, 2), Block.oreCoal, (new ItemStack(mortarPestle, 1, 32767)));
			GameRegistry.addShapelessRecipe(new ItemStack(dustCharcoal), (new ItemStack(Item.coal, 1, 1)), (new ItemStack(mortarPestle, 1, 32767)));
			
			GameRegistry.addShapelessRecipe(new ItemStack(dustAlpha, 16), oreAlpha, (new ItemStack(mortarPestle, 1, 32767)));
			
			GameRegistry.addShapelessRecipe(new ItemStack(dustCopper), ingotCopper, (new ItemStack(mortarPestle, 1, 32767)));
			GameRegistry.addShapelessRecipe(new ItemStack(dustCopper, 2), oreCopper, (new ItemStack(mortarPestle, 1, 32767)));
			
			GameRegistry.addShapelessRecipe(new ItemStack(dustTin), ingotTin, (new ItemStack(mortarPestle, 1, 32767)));
			GameRegistry.addShapelessRecipe(new ItemStack(dustTin, 2), oreTin, (new ItemStack(mortarPestle, 1, 32767)));
			
			GameRegistry.addShapelessRecipe(new ItemStack(dustBronze), ingotBronze, (new ItemStack(mortarPestle, 1, 32767)));
			
			GameRegistry.addShapelessRecipe(new ItemStack(Block.cobblestone), alphaCobble, (new ItemStack(mortarPestle, 1, 32767)));
			
			GameRegistry.addShapelessRecipe(new ItemStack(bauxite, 2), oreBauxite, (new ItemStack(mortarPestle, 1, 32767)));
			
			GameRegistry.addShapelessRecipe(new ItemStack(dustAluminium), ingotAluminium, (new ItemStack(mortarPestle, 1, 32767)));
			
			//Reinforced Mortar and Pestle
			GameRegistry.addShapelessRecipe(new ItemStack(dustMullite), mullite, (new ItemStack(mortarPestleReinf, 1, 32767)));
			GameRegistry.addShapelessRecipe(new ItemStack(dustMullite, 2), oreMullite, (new ItemStack(mortarPestleReinf, 1, 32767)));
			
			GameRegistry.addShapelessRecipe(new ItemStack(dustMullite), roxite, (new ItemStack(mortarPestleReinf, 1, 32767)));
			GameRegistry.addShapelessRecipe(new ItemStack(dustMullite, 2), oreRoxite, (new ItemStack(mortarPestleReinf, 1, 32767)));
			
			
			GameRegistry.addShapelessRecipe(new ItemStack(dustCoal), Item.coal, (new ItemStack(mortarPestleReinf, 1, 32767)));
			GameRegistry.addShapelessRecipe(new ItemStack(dustCoal, 2), Block.oreCoal, (new ItemStack(mortarPestleReinf, 1, 32767)));
			GameRegistry.addShapelessRecipe(new ItemStack(dustCharcoal), (new ItemStack(Item.coal, 1, 1)), (new ItemStack(mortarPestleReinf, 1, 32767)));
			
			GameRegistry.addShapelessRecipe(new ItemStack(dustAlpha, 16), oreAlpha, (new ItemStack(mortarPestleReinf, 1, 32767)));
			
			GameRegistry.addShapelessRecipe(new ItemStack(dustCopper), ingotCopper, (new ItemStack(mortarPestleReinf, 1, 32767)));
			GameRegistry.addShapelessRecipe(new ItemStack(dustCopper, 2), oreCopper, (new ItemStack(mortarPestleReinf, 1, 32767)));
			
			GameRegistry.addShapelessRecipe(new ItemStack(dustTin), ingotTin, (new ItemStack(mortarPestleReinf, 1, 32767)));
			GameRegistry.addShapelessRecipe(new ItemStack(dustTin, 2), oreTin, (new ItemStack(mortarPestleReinf, 1, 32767)));
			
			GameRegistry.addShapelessRecipe(new ItemStack(dustBronze), ingotBronze, (new ItemStack(mortarPestleReinf, 1, 32767)));
			
			GameRegistry.addShapelessRecipe(new ItemStack(bauxite, 2), oreBauxite, (new ItemStack(mortarPestleReinf, 1, 32767)));
			
			GameRegistry.addShapelessRecipe(new ItemStack(dustAluminium), ingotAluminium, (new ItemStack(mortarPestleReinf, 1, 32767)));
			
			//Food
			GameRegistry.addRecipe(new ItemStack(enchantedMelon), "DAG", "AMA", "GAD",
					'M', Item.melon, 'A', (new ItemStack(Item.appleGold, 1, 1)), 'D', Block.blockDiamond, 'G', Block.blockGold);
			
			//Drink
			GameRegistry.addShapelessRecipe(new ItemStack(bucketChocMilk), Item.bucketMilk, (new ItemStack(Item.dyePowder, 1, 3)));
			
			//Tools
			GameRegistry.addRecipe(new ItemStack(pickaxeMullite), "MMM", " S ", " S ",
					'M', mullite, 'S', Item.stick);
			GameRegistry.addRecipe(new ItemStack(shovelMullite), "M", "S", "S",
					'M', mullite, 'S', Item.stick);
			GameRegistry.addRecipe(new ItemStack(swordMullite), "M", "M", "S",
					'M', mullite, 'S', Item.stick);
			GameRegistry.addRecipe(new ItemStack(axeMullite), "MM ", "MS ", " S ",
					'M', mullite, 'S', Item.stick);
			GameRegistry.addRecipe(new ItemStack(axeMullite), " MM", " SM", " S ",
					'M', mullite, 'S', Item.stick);
			GameRegistry.addRecipe(new ItemStack(hoeMullite), "MM ", " S ", " S ",
					'M', mullite, 'S', Item.stick);
			GameRegistry.addRecipe(new ItemStack(hoeMullite), " MM", " S ", " S ",
					'M', mullite, 'S', Item.stick);
			GameRegistry.addShapelessRecipe(new ItemStack(swordMulliteDE), swordMullite, Item.diamond);
			
			
			GameRegistry.addRecipe(new ItemStack(pickaxeRoxite), "RRR", " S ", " S ",
					'R', roxite, 'S', Item.stick);
			GameRegistry.addRecipe(new ItemStack(shovelRoxite), "R", "S", "S",
					'R', roxite, 'S', Item.stick);
			GameRegistry.addRecipe(new ItemStack(swordRoxite), "R", "R", "S",
					'R', roxite, 'S', Item.stick);
			GameRegistry.addRecipe(new ItemStack(axeRoxite), "RR ", "RS ", " S ",
					'R', roxite, 'S', Item.stick);
			GameRegistry.addRecipe(new ItemStack(axeRoxite), " RR", " SR", " S ",
					'R', roxite, 'S', Item.stick);
			GameRegistry.addRecipe(new ItemStack(hoeRoxite), "RR ", " S ", " S ",
					'R', roxite, 'S', Item.stick);
			GameRegistry.addRecipe(new ItemStack(hoeRoxite), " RR", " S ", " S ",
					'R', roxite, 'S', Item.stick);
			GameRegistry.addShapelessRecipe(new ItemStack(swordRoxiteDE), swordRoxite, Item.diamond);
			
			
			GameRegistry.addRecipe(new ItemStack(pickaxeBronze), "BBB", " S ", " S ",
					'B', ingotBronze, 'S', Item.stick);
			GameRegistry.addRecipe(new ItemStack(shovelBronze), "B", "S", "S",
					'B', ingotBronze, 'S', Item.stick);
			GameRegistry.addRecipe(new ItemStack(swordBronze), "B", "B", "S",
					'B', ingotBronze, 'S', Item.stick);
			GameRegistry.addRecipe(new ItemStack(axeBronze), "BB ", "BS ", " S ",
					'B', ingotBronze, 'S', Item.stick);
			GameRegistry.addRecipe(new ItemStack(axeBronze), " BB", " SB", " S ",
					'B', ingotBronze, 'S', Item.stick);
			GameRegistry.addRecipe(new ItemStack(hoeBronze), "BB ", " S ", " S ",
					'B', ingotBronze, 'S', Item.stick);
			GameRegistry.addRecipe(new ItemStack(hoeBronze), " BB", " S ", " S ",
					'B', ingotBronze, 'S', Item.stick);
			
			GameRegistry.addRecipe(new ItemStack(pickaxeSteel), "---", " S ", " S ",
					'-', ingotSteel, 'S', Item.stick);
			GameRegistry.addRecipe(new ItemStack(shovelSteel), "-", "S", "S",
					'-', ingotSteel, 'S', Item.stick);
			GameRegistry.addRecipe(new ItemStack(swordSteel), "-", "-", "S",
					'-', ingotSteel, 'S', Item.stick);
			GameRegistry.addRecipe(new ItemStack(axeSteel), "-- ", "-S ", " S ",
					'-', ingotSteel, 'S', Item.stick);
			GameRegistry.addRecipe(new ItemStack(axeSteel), " --", " S-", " S ",
					'-', ingotSteel, 'S', Item.stick);
			GameRegistry.addRecipe(new ItemStack(hoeSteel), "-- ", " S ", " S ",
					'-', ingotSteel, 'S', Item.stick);
			GameRegistry.addRecipe(new ItemStack(hoeSteel), " --", " S ", " S ",
					'-', ingotSteel, 'S', Item.stick);
			
			GameRegistry.addRecipe(new ItemStack(pickaxeAlpha), "AAA", " S ", " S ",
					'A', ingotAlpha, 'S', Item.stick);
			GameRegistry.addRecipe(new ItemStack(shovelAlpha), "A", "S", "S",
					'A', ingotAlpha, 'S', Item.stick);
			GameRegistry.addRecipe(new ItemStack(swordAlpha), "A", "A", "S",
					'A', ingotAlpha, 'S', Item.stick);
			GameRegistry.addRecipe(new ItemStack(axeAlpha), "AA ", "AS ", " S ",
					'A', ingotAlpha, 'S', Item.stick);
			GameRegistry.addRecipe(new ItemStack(axeAlpha), " AA", " SA", " S ",
					'A', ingotAlpha, 'S', Item.stick);
			GameRegistry.addRecipe(new ItemStack(hoeAlpha), "AA ", " S ", " S ",
					'A', ingotAlpha, 'S', Item.stick);
			GameRegistry.addRecipe(new ItemStack(hoeAlpha), " AA", " S ", " S ",
					'A', ingotAlpha, 'S', Item.stick);
			
			GameRegistry.addRecipe(new ItemStack(steelHammer), "-", "S",
					'-', ingotSteel, 'S', Item.stick);
			
			GameRegistry.addRecipe(new ItemStack(essenceExtractor), "-", "S",
					'-', grate, 'S', Item.stick);
			
			
			//Armor
			
			GameRegistry.addRecipe(new ItemStack(helmetMullite), "MMM", "M M",
					'M', mullite);
			GameRegistry.addRecipe(new ItemStack(chestMullite), "M M", "MMM", "MMM",
					'M', mullite);
			GameRegistry.addRecipe(new ItemStack(legsMullite), "MMM", "M M", "M M",
					'M', mullite);
			GameRegistry.addRecipe(new ItemStack(bootsMullite), "M M", "M M",
					'M', mullite);
			
			GameRegistry.addRecipe(new ItemStack(helmetRoxite), "RRR", "R R",
					'R', roxite);
			GameRegistry.addRecipe(new ItemStack(chestRoxite), "R R", "RRR", "RRR",
					'R', roxite);
			GameRegistry.addRecipe(new ItemStack(legsRoxite), "RRR", "R R", "R R",
					'R', roxite);
			GameRegistry.addRecipe(new ItemStack(bootsRoxite), "R R", "R R",
					'R', roxite);
			
			GameRegistry.addRecipe(new ItemStack(helmetBronze), "BBB", "B B",
					'B', ingotBronze);
			GameRegistry.addRecipe(new ItemStack(chestBronze), "B B", "BBB", "BBB",
					'B', ingotBronze);
			GameRegistry.addRecipe(new ItemStack(legsBronze), "BBB", "B B", "B B",
					'B', ingotBronze);
			GameRegistry.addRecipe(new ItemStack(bootsBronze), "B B", "B B",
					'B', ingotBronze);
			
			GameRegistry.addRecipe(new ItemStack(helmetSteel), "SSS", "S S",
					'S', ingotSteel);
			GameRegistry.addRecipe(new ItemStack(chestSteel), "S S", "SSS", "SSS",
					'S', ingotSteel);
			GameRegistry.addRecipe(new ItemStack(legsSteel), "SSS", "S S", "S S",
					'S', ingotSteel);
			GameRegistry.addRecipe(new ItemStack(bootsSteel), "S S", "S S",
					'S', ingotSteel);
			
			GameRegistry.addRecipe(new ItemStack(helmetAlpha), "AAA", "A A",
					'A', ingotAlpha);
			GameRegistry.addRecipe(new ItemStack(chestAlpha), "A A", "AAA", "AAA",
					'A', ingotAlpha);
			GameRegistry.addRecipe(new ItemStack(legsAlpha), "AAA", "A A", "A A",
					'A', ingotAlpha);
			GameRegistry.addRecipe(new ItemStack(bootsAlpha), "A A", "A A",
					'A', ingotAlpha);
			
			GameRegistry.addRecipe(new ItemStack(Item.helmetChain), "CCC", "C C",
					'C', Chain);
			GameRegistry.addRecipe(new ItemStack(Item.plateChain), "C C", "CCC", "CCC",
					'C', Chain);
			GameRegistry.addRecipe(new ItemStack(Item.legsChain), "CCC", "C C", "C C",
					'C', Chain);
			GameRegistry.addRecipe(new ItemStack(Item.bootsChain), "C C", "C C",
					'C', Chain);
			

			
			
			//Crafting | MCrafting
			
			MCraftingManager.getInstance().addShapedRecipe(new ItemStack(redstoneBattery), new Object[] {" C ", "ARA", "ARA", "ARA", "ACA", 'C', ingotCopper, 'A', ingotAluminium, 'R', Item.redstone});

			MCraftingManager.getInstance().addShapedRecipe(new ItemStack(Item.monsterPlacer, 1, 3), new Object[] {"BBB", "B-B", "BMB", "B-B", "BBB", 'M', mullite, 'B', blood, '-', Item.bone});
			MCraftingManager.getInstance().addShapedRecipe(new ItemStack(Item.monsterPlacer, 1, 4), new Object[] {"BBB", "B-B", "BSB", "B-B", "BBB", 'S', Item.sign, 'B', blood, '-', Item.bone});
			MCraftingManager.getInstance().addShapedRecipe(new ItemStack(Item.monsterPlacer, 1, 5), new Object[] {"BBB", "B-B", "BCB", "B-B", "BBB", 'C', Item.cookie, 'B', blood, '-', Item.bone});
			
			
			MCraftingManager.getInstance().addShapedRecipe(new ItemStack(paxelIron), new Object[] {" - ", "---", "---", " S ", " S ", '-', Item.ingotIron, 'S', Item.stick});
			MCraftingManager.getInstance().addShapedRecipe(new ItemStack(paxelSteel), new Object[] {" - ", "---", "---", " S ", " S ", '-', ingotSteel, 'S', Item.stick});
			MCraftingManager.getInstance().addShapedRecipe(new ItemStack(paxelDiamond), new Object[] {" - ", "---", "---", " S ", " S ", '-', Item.diamond, 'S', Item.stick});
			MCraftingManager.getInstance().addShapedRecipe(new ItemStack(paxelMullite), new Object[] {" - ", "---", "---", " S ", " S ", '-', mullite, 'S', Item.stick});
			MCraftingManager.getInstance().addShapedRecipe(new ItemStack(paxelRoxite), new Object[] {" - ", "---", "---", " S ", " S ", '-', roxite, 'S', Item.stick});
			MCraftingManager.getInstance().addShapedRecipe(new ItemStack(paxelAlpha), new Object[] {" - ", "---", "---", " S ", " S ", '-', ingotAlpha, 'S', Item.stick});
			
			
			//Repair | MCrafting
			
			MCraftingManager.getInstance().addShapedRecipe(new ItemStack(pickaxeMullite), new Object[] {"MIM", " S ", 'M', mullite, 'I', (new ItemStack(pickaxeMullite, 1, 32767)), 'S', (new ItemStack(steelHammer, 1, 32767))});
			MCraftingManager.getInstance().addShapedRecipe(new ItemStack(shovelMullite), new Object[] {"MIM", " S ", 'M', mullite, 'I', (new ItemStack(shovelMullite, 1, 32767)), 'S', (new ItemStack(steelHammer, 1, 32767))});
			MCraftingManager.getInstance().addShapedRecipe(new ItemStack(swordMullite), new Object[] {"MIM", " S ", 'M', mullite, 'I', (new ItemStack(swordMullite, 1, 32767)), 'S', (new ItemStack(steelHammer, 1, 32767))});
			MCraftingManager.getInstance().addShapedRecipe(new ItemStack(axeMullite), new Object[] {"MIM", " S ", 'M', mullite, 'I', (new ItemStack(axeMullite, 1, 32767)), 'S', (new ItemStack(steelHammer, 1, 32767))});
			MCraftingManager.getInstance().addShapedRecipe(new ItemStack(hoeMullite), new Object[] {"MIM", " S ", 'M', mullite, 'I', (new ItemStack(hoeMullite, 1, 32767)), 'S', (new ItemStack(steelHammer, 1, 32767))});
			MCraftingManager.getInstance().addShapedRecipe(new ItemStack(swordMulliteDE), new Object[] {"MID", " S ", 'M', mullite, 'D', Item.diamond, 'I', (new ItemStack(swordMulliteDE, 1, 32767)), 'S', (new ItemStack(steelHammer, 1, 32767))});
			MCraftingManager.getInstance().addShapedRecipe(new ItemStack(swordMulliteDE), new Object[] {"DIM", " S ", 'M', mullite, 'D', Item.diamond, 'I', (new ItemStack(swordMulliteDE, 1, 32767)), 'S', (new ItemStack(steelHammer, 1, 32767))});
			MCraftingManager.getInstance().addShapedRecipe(new ItemStack(paxelMullite), new Object[] {"MIM", " S ", 'M', mullite, 'I', (new ItemStack(paxelMullite, 1, 32767)), 'S', steelHammer});
			
			
			MCraftingManager.getInstance().addShapedRecipe(new ItemStack(pickaxeRoxite), new Object[] {"RIR", " S ", 'R', roxite, 'I', (new ItemStack(pickaxeRoxite, 1, 32767)), 'S', (new ItemStack(steelHammer, 1, 32767))});
			MCraftingManager.getInstance().addShapedRecipe(new ItemStack(shovelRoxite), new Object[] {"RIR", " S ", 'R', roxite, 'I', (new ItemStack(shovelMullite, 1, 32767)), 'S', (new ItemStack(steelHammer, 1, 32767))});
			MCraftingManager.getInstance().addShapedRecipe(new ItemStack(swordRoxite), new Object[] {"RIR", " S ", 'R', roxite, 'I', (new ItemStack(swordMullite, 1, 32767)), 'S', (new ItemStack(steelHammer, 1, 32767))});
			MCraftingManager.getInstance().addShapedRecipe(new ItemStack(axeRoxite), new Object[] {"RIR", " S ", 'R', roxite, 'I', (new ItemStack(axeMullite, 1, 32767)), 'S', (new ItemStack(steelHammer, 1, 32767))});
			MCraftingManager.getInstance().addShapedRecipe(new ItemStack(hoeRoxite), new Object[] {"RIR", " S ", 'R', roxite, 'I', (new ItemStack(hoeMullite, 1, 32767)), 'S', (new ItemStack(steelHammer, 1, 32767))});
			MCraftingManager.getInstance().addShapedRecipe(new ItemStack(swordRoxiteDE), new Object[] {"RID", " S ", 'R', roxite, 'D', Item.diamond, 'I', (new ItemStack(swordMulliteDE, 1, 32767)), 'S', (new ItemStack(steelHammer, 1, 32767))});
			MCraftingManager.getInstance().addShapedRecipe(new ItemStack(swordRoxiteDE), new Object[] {"DIR", " S ", 'R', roxite, 'D', Item.diamond, 'I', (new ItemStack(swordMulliteDE, 1, 32767)), 'S', (new ItemStack(steelHammer, 1, 32767))});
			MCraftingManager.getInstance().addShapedRecipe(new ItemStack(paxelRoxite), new Object[] {"RIR", " S ", 'R', roxite, 'I', (new ItemStack(paxelRoxite, 1, 32767)), 'S', (new ItemStack(steelHammer, 1, 32767))});
			
			
			MCraftingManager.getInstance().addShapedRecipe(new ItemStack(paxelIron), new Object[] {"-I-", " S ", '-', Item.ingotIron, 'I', (new ItemStack(paxelIron, 1, 32767)), 'S', (new ItemStack(steelHammer, 1, 32767))});
			MCraftingManager.getInstance().addShapedRecipe(new ItemStack(paxelBronze), new Object[] {"-I-", " S ", '-', ingotBronze, 'I', (new ItemStack(paxelBronze, 1, 32767)), 'S', (new ItemStack(steelHammer, 1, 32767))});
			MCraftingManager.getInstance().addShapedRecipe(new ItemStack(paxelDiamond), new Object[] {"-I-", " S ", '-', Item.diamond, 'I', (new ItemStack(paxelDiamond, 1, 32767)), 'S', (new ItemStack(steelHammer, 1, 32767))});
			MCraftingManager.getInstance().addShapedRecipe(new ItemStack(paxelSteel), new Object[] {"-I-", " S ", '-', ingotSteel, 'I', (new ItemStack(paxelSteel, 1, 32767)), 'S', (new ItemStack(steelHammer, 1, 32767))});
			
			
			
			
		//Smelting
		GameRegistry.addSmelting(oreMullite.blockID, new ItemStack(mullite), 0.1F);
		GameRegistry.addSmelting(oreRoxite.blockID, new ItemStack(roxite), 0.1F);
		GameRegistry.addSmelting(oreCopper.blockID, new ItemStack(ingotCopper), 0.1F);
		GameRegistry.addSmelting(oreTin.blockID, new ItemStack(ingotTin), 0.1F);
		GameRegistry.addSmelting(muttonRaw.itemID, new ItemStack(muttonCooked), 0.1F);
		GameRegistry.addSmelting(Item.rottenFlesh.itemID, new ItemStack(fleshCooked), 0.1F);
		
		GameRegistry.addSmelting(alphaCobble.blockID, new ItemStack(mullak99.alphaStone), 0F);
		
		GameRegistry.addSmelting(dustMullite.itemID, new ItemStack(mullite), 0F);
		GameRegistry.addSmelting(dustRoxite.itemID, new ItemStack(roxite), 0F);
		GameRegistry.addSmelting(dustCopper.itemID, new ItemStack(ingotCopper), 0F);
		GameRegistry.addSmelting(dustTin.itemID, new ItemStack(ingotTin), 0F);
		GameRegistry.addSmelting(dustBronze.itemID, new ItemStack(ingotBronze), 0F);
		GameRegistry.addSmelting(dustCoal.itemID, new ItemStack(Item.coal), 0F);
		GameRegistry.addSmelting(dustCharcoal.itemID, new ItemStack(Item.coal, 1, 1), 0F);
		GameRegistry.addSmelting(Block.glass.blockID, new ItemStack(clearGlass), 0.1F);
		GameRegistry.addSmelting(Block.thinGlass.blockID, new ItemStack(thinClearGlass), 0F);
		GameRegistry.addSmelting(oreBauxite.blockID, new ItemStack(aluminiumRaw), 0.1F);
		GameRegistry.addSmelting(aluminiumRaw.itemID, new ItemStack(ingotAluminium), 0.1F);
		GameRegistry.addSmelting(dustAluminium.itemID, new ItemStack(ingotAluminium), 0.1F);
		GameRegistry.addSmelting(bauxite.itemID, new ItemStack(aluminiumRaw), 0.1F);
		GameRegistry.addSmelting(ingotSteelRaw.itemID, new ItemStack(ingotSteel), 0.1F);
		GameRegistry.addSmelting(dustAlpha.itemID,new ItemStack(ingotAlpha), 0F);
		
		
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
		
		
		//Are essential mods loaded?
		
		/* *
		 * Checks if mullakCore is installed, Gives Log message for easier debugging
		 */
		if(Loader.isModLoaded("mullakCore")) {
			FMLLog.fine("[mullak99's Mod] Sucess: mullakCore Found!");
		}
		
		else {
			FMLLog.severe("[mullak99's Mod] Error: mullakCore not found!");
			System.exit(1);
		}
		
		//Are extra mods loaded?
		
		/* *
		 * Checks if extra mods are installed
		 */
	}

}