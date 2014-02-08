package mullak99.mullak99sMod;

import java.util.logging.Level;
import mullak99.mullak99sMod.blocks.*;
import mullak99.mullak99sMod.client.ClientProxy;
import mullak99.mullak99sMod.items.*;
import mullak99.mullak99sMod.mobs.RenderMullak99Mob;
import mullak99.mullak99sMod.mobs.mullak99Mob;
import mullak99.mullak99sMod.armor.*;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFurnace;
import net.minecraft.block.BlockGrass;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.StepSound;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityEggInfo;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAppleGold;
import net.minecraft.item.ItemBucketMilk;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.Property;
import net.minecraftforge.oredict.OreDictionary;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.StringUtils;
import net.minecraft.world.biome.BiomeGenBase;

@Mod (modid="mullak99's Mod", name="mullak99's Mod", version="")
@NetworkMod (clientSideRequired=true, serverSideRequired=false)

public class mullak99 {
	
	
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
    
    //Food
    public static Item enchantedMelon;
    
    //Item
    public static Item bucketChocMilk;
    
    //Tools
    public static Item pickaxeMullite;
    public static Item shovelMullite;
    public static Item swordMullite;
    public static Item axeMullite;
    public static Item hoeMullite;
    public static Item swordMulliteDE;
    public static Item pickaxeRoxite;
    public static Item shovelRoxite;
    public static Item swordRoxite;
    public static Item axeRoxite;
    public static Item hoeRoxite;
    public static Item swordRoxiteDE;
    
    public static Item pickaxeBedrock;
    public static Item shovelBedrock;
    public static Item swordBedrock;
    public static Item axeBedrock;
    
    public static Item pickaxeBronze;
    public static Item shovelBronze;
    public static Item swordBronze;
    public static Item axeBronze;
    public static Item hoeBronze;
    
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
    
    
    //Blocks
    public static Block oreMullite;
    public static Block blockMullite;
    public static Block oreRoxite;
    public static Block blockRoxite;
    public static Block oreCopper;
    public static Block blockCopper;
    public static Block oreTin;
    public static Block blockTin;
    public static Block oreAlpha;
    public static Block alphaCobble;
    public static Block alphaStone;
    public static Block blockAlpha;
    public static Block blockBronze;
    public static Block alphaFurnaceIdle;
    public static Block alphaFurnaceBurning;
    public static alphaLeaves alphaLeaves;
    public static Block alphaGrass;
    
    
	
	@Instance ("mullak99's Mod")
	public static mullak99 instance;
	
	//Enum Tool Material
	public static EnumToolMaterial mulliteTools = EnumHelper.addToolMaterial("Mullite", 3, 2500, 10.0F, 4, 20);
	public static EnumToolMaterial mulliteToolsDE = EnumHelper.addToolMaterial("MulliteDE", 3, 3000, 12.0F, 6, 22);
	public static EnumToolMaterial bronzeTools = EnumHelper.addToolMaterial("Bronze", 2, 300, 6.0F, 2.0F, 14);
	public static EnumToolMaterial bedrockTools = EnumHelper.addToolMaterial("Bedrock", 10, -1, 99999999999999999999999999999999999999.9F, 999999999, 999999999);
	
	//Enum Armor Material
	public static EnumArmorMaterial mulliteArmor = EnumHelper.addArmorMaterial("Mullite", 40, new int[]{4, 8, 6, 4}, 25);
	public static EnumArmorMaterial bronzeArmor = EnumHelper.addArmorMaterial("Bronze", 15, new int[]{2, 6, 5, 2}, 9);
	
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
	
	//DIM ID
	
		/*public static int DimID = 10;
		
		
	//Biomes
		public static final BiomeGenBase AlphaBiome = new AlphaBiome(10);*/
	
	@EventHandler
	public void PreInit (FMLPreInitializationEvent event) {

		
		
		registerEntity(mullak99Mob.class, "mullak99", 0x000FF00, 0x000000);
		LanguageRegistry.instance().addStringLocalization("entity.mullak99.name", "mullak99");
		
	}
		
		public void registerEntity(Class<? extends Entity> entityClass, String entityName, int bkEggColor, int fgEggColor) {
			int id = EntityRegistry.findGlobalUniqueEntityId();

			EntityRegistry.registerGlobalEntityID(entityClass, entityName, id);
			EntityList.entityEggs.put(Integer.valueOf(id), new EntityEggInfo(id, bkEggColor, fgEggColor));
			}

			public void addSpawn(Class<? extends EntityLiving> entityClass, int spawnProb, int min, int max, BiomeGenBase[] biomes) {
			if (spawnProb > 0) {
			EntityRegistry.addSpawn(entityClass, spawnProb, min, max, EnumCreatureType.creature, biomes);
			}
	}
			
	@SidedProxy (clientSide="mullak99.mullak99sMod.client.ClientProxy", serverSide="mullak99.mullak99sMod.CommonProxy")
	public static CommonProxy proxy;
	


	@EventHandler
	public void load (FMLInitializationEvent event) {
		
		
		
		//Items
		mullite = new mullite(1000).setMaxStackSize(64).setCreativeTab(tabMullak99sModI).setTextureName("mullak99:Mullite").setUnlocalizedName("mullite");
		roxite = new roxite(1001).setMaxStackSize(64).setCreativeTab(tabMullak99sModI).setTextureName("mullak99:Roxite").setUnlocalizedName("roxite");
		ingotCopper = new ingotCopper(1002).setMaxStackSize(64).setCreativeTab(tabMullak99sModI).setTextureName("mullak99:ingotCopper").setUnlocalizedName("ingotCopper");
		ingotSteel = new ingotSteel(1003).setMaxStackSize(64).setCreativeTab(tabMullak99sModI).setTextureName("mullak99:ingotSteel").setUnlocalizedName("ingotSteel");
		ingotTin = new ingotTin(1004).setMaxStackSize(64).setCreativeTab(tabMullak99sModI).setTextureName("mullak99:ingotTin").setUnlocalizedName("ingotTin");
		dustAlpha = new alphaDust(900).setMaxStackSize(64).setCreativeTab(tabMullak99sModI).setTextureName("mullak99:alphaDust").setUnlocalizedName("alphaDust");
		mortarPestle = new mortarPestle(1005).setMaxStackSize(1).setMaxDamage(64).setCreativeTab(tabMullak99sModI).setTextureName("mullak99:mortarPestle").setUnlocalizedName("mortarPestle");
		mortarPestleReinf = new mortarPestle(1006).setMaxStackSize(1).setMaxDamage(1024).setCreativeTab(tabMullak99sModI).setTextureName("mullak99:mortarPestleReinf").setUnlocalizedName("mortarPestleReinf");
		dustMullite = new Dust(1010).setMaxStackSize(64).setCreativeTab(tabMullak99sModI).setTextureName("mullak99:dustMullite").setUnlocalizedName("mulliteDust");
		dustRoxite = new Dust(1011).setMaxStackSize(64).setCreativeTab(tabMullak99sModI).setTextureName("mullak99:dustRoxite").setUnlocalizedName("roxiteDust");
		dustCoal = new Dust(1012).setMaxStackSize(64).setCreativeTab(tabMullak99sModI).setTextureName("mullak99:dustCoal").setUnlocalizedName("coalDust");
		dustCharcoal = new Dust(1013).setMaxStackSize(64).setCreativeTab(tabMullak99sModI).setTextureName("mullak99:dustCoal").setUnlocalizedName("charcoalDust");
		dustBronze = new Dust(1014).setMaxStackSize(64).setCreativeTab(tabMullak99sModI).setTextureName("mullak99:dustBronze").setUnlocalizedName("bronzeDust");
		dustCopper = new Dust(1015).setMaxStackSize(64).setCreativeTab(tabMullak99sModI).setTextureName("mullak99:dustCopper").setUnlocalizedName("copperDust");
		dustTin = new Dust(1016).setMaxStackSize(64).setCreativeTab(tabMullak99sModI).setTextureName("mullak99:dustTin").setUnlocalizedName("tinDust");
		ingotBronze = new ingotSteel(1017).setMaxStackSize(64).setCreativeTab(tabMullak99sModI).setTextureName("mullak99:ingotBronze").setUnlocalizedName("ingotBronze");
		
		
		redstoneBattery = new Battery(1032).setMaxStackSize(1).setMaxDamage(10).setCreativeTab(tabMullak99sModI).setTextureName("mullak99:redstoneBattery").setUnlocalizedName("redstoneBattery");
			
			//Food
			enchantedMelon = new enchantedMelon(1030, 20, 1.2F, false).setAlwaysEdible().setPotionEffect(Potion.regeneration.id, 2400, 16, 1.0F).setPotionEffect(Potion.resistance.id, 2400, 16, 1.0F).setPotionEffect(Potion.fireResistance.id, 2400, 16, 1.0F).setCreativeTab(tabMullak99sModWIP).setUnlocalizedName("enchantedMelon").setTextureName("melon");
		
			//Drink
			bucketChocMilk = new bucketChocMilk(1031).setUnlocalizedName("bucketChocMilk").setCreativeTab(tabMullak99sModWIP).setContainerItem(Item.bucketEmpty).setTextureName("mullak99:bucketChocMilk");
		
			
			//Tools
			pickaxeMullite = new pickaxeMullite(1500, mulliteTools).setCreativeTab(tabMullak99sModWP).setTextureName("mullak99:pickaxeMullite").setUnlocalizedName("pickaxeMullite");
			shovelMullite = new shovelMullite(1501, mulliteTools).setCreativeTab(tabMullak99sModWP).setTextureName("mullak99:shovelMullite").setUnlocalizedName("shovelMullite");
			swordMullite = new swordMullite(1502, mulliteTools).setCreativeTab(tabMullak99sModWP).setTextureName("mullak99:swordMullite").setUnlocalizedName("swordMullite");
			axeMullite = new axeMullite(1503, mulliteTools).setCreativeTab(tabMullak99sModWP).setTextureName("mullak99:axeMullite").setUnlocalizedName("axeMullite");
			hoeMullite = new hoeMullite(1504, mulliteTools).setCreativeTab(tabMullak99sModWP).setTextureName("mullak99:hoeMullite").setUnlocalizedName("hoeMullite");
			swordMulliteDE = new swordMulliteDE(1505, mulliteToolsDE).setCreativeTab(tabMullak99sModWP).setTextureName("mullak99:swordMulliteDE").setUnlocalizedName("swordMulliteDE");
			
			pickaxeRoxite = new pickaxeMullite(2500, mulliteTools).setCreativeTab(tabMullak99sModWP).setTextureName("mullak99:pickaxeRoxite").setUnlocalizedName("pickaxeRoxite");
			shovelRoxite = new shovelMullite(2501, mulliteTools).setCreativeTab(tabMullak99sModWP).setTextureName("mullak99:shovelRoxite").setUnlocalizedName("shovelRoxite");
			swordRoxite = new swordMullite(2502, mulliteTools).setCreativeTab(tabMullak99sModWP).setTextureName("mullak99:swordRoxite").setUnlocalizedName("swordRoxite");
			axeRoxite = new axeMullite(2503, mulliteTools).setCreativeTab(tabMullak99sModWP).setTextureName("mullak99:axeRoxite").setUnlocalizedName("axeRoxite");
			hoeRoxite = new hoeMullite(2504, mulliteTools).setCreativeTab(tabMullak99sModWP).setTextureName("mullak99:hoeRoxite").setUnlocalizedName("hoeRoxite");
			swordRoxiteDE = new swordMulliteDE(2505, mulliteToolsDE).setCreativeTab(tabMullak99sModWP).setTextureName("mullak99:swordRoxiteDE").setUnlocalizedName("swordRoxiteDE");
			
			pickaxeBronze = new pickaxeMullite(3500, bronzeTools).setCreativeTab(tabMullak99sModWP).setTextureName("mullak99:pickaxeBronze").setUnlocalizedName("pickaxeBronze");
			shovelBronze = new shovelMullite(3501, bronzeTools).setCreativeTab(tabMullak99sModWP).setTextureName("mullak99:shovelBronze").setUnlocalizedName("shovelBronze");
			swordBronze = new swordMullite(3502, bronzeTools).setCreativeTab(tabMullak99sModWP).setTextureName("mullak99:swordBronze").setUnlocalizedName("swordBronze");
			axeBronze = new axeMullite(3503, bronzeTools).setCreativeTab(tabMullak99sModWP).setTextureName("mullak99:axeBronze").setUnlocalizedName("axeBronze");
			hoeBronze = new hoeMullite(3504, bronzeTools).setCreativeTab(tabMullak99sModWP).setTextureName("mullak99:hoeBronze").setUnlocalizedName("hoeBronze");
			
			pickaxeBedrock = new pickaxeMullite(4000, bedrockTools).setCreativeTab(tabMullak99sModWP).setTextureName("mullak99:pickaxeBedrock").setUnlocalizedName("pickaxeBedrock");
			shovelBedrock = new shovelMullite(4001, bedrockTools).setCreativeTab(tabMullak99sModWP).setTextureName("mullak99:shovelBedrock").setUnlocalizedName("shovelBedrock");
			swordBedrock = new swordMullite(4002, bedrockTools).setCreativeTab(tabMullak99sModWP).setTextureName("mullak99:swordBedrock").setUnlocalizedName("sworBedrock");
			axeBedrock = new axeMullite(4003, bedrockTools).setCreativeTab(tabMullak99sModWP).setTextureName("mullak99:axeBedrock").setUnlocalizedName("axeBedrock");
			
			//Armor
			
			
			int renderMulliteArmor = proxy.addArmor("mulliteArmor");
			int renderRoxiteArmor = proxy.addArmor("roxiteArmor");
			int renderBronzeArmor = proxy.addArmor("bronzeArmor");
			
			
			helmetMullite = new mulliteArmor(1600, mulliteArmor, renderMulliteArmor, 0).setCreativeTab(tabMullak99sModWP).setTextureName("mullak99:helmetMullite").setUnlocalizedName("helmetMullite");
			chestMullite = new mulliteArmor(1601, mulliteArmor, renderMulliteArmor, 1).setCreativeTab(tabMullak99sModWP).setTextureName("mullak99:chestMullite").setUnlocalizedName("chestMullite");
			legsMullite = new mulliteArmor(1602, mulliteArmor, renderMulliteArmor, 2).setCreativeTab(tabMullak99sModWP).setTextureName("mullak99:legsMullite").setUnlocalizedName("legsMullite");
			bootsMullite = new mulliteArmor(1603, mulliteArmor, renderMulliteArmor, 3).setCreativeTab(tabMullak99sModWP).setTextureName("mullak99:bootsMullite").setUnlocalizedName("bootsMullite");
			
			helmetRoxite = new roxiteArmor(1610, mulliteArmor, renderRoxiteArmor, 0).setCreativeTab(tabMullak99sModWP).setTextureName("mullak99:helmetRoxite").setUnlocalizedName("helmetRoxite");
			chestRoxite = new roxiteArmor(1611, mulliteArmor, renderRoxiteArmor, 1).setCreativeTab(tabMullak99sModWP).setTextureName("mullak99:chestRoxite").setUnlocalizedName("chestRoxite");
			legsRoxite = new roxiteArmor(1612, mulliteArmor, renderRoxiteArmor, 2).setCreativeTab(tabMullak99sModWP).setTextureName("mullak99:legsRoxite").setUnlocalizedName("legsRoxite");
			bootsRoxite = new roxiteArmor(1613, mulliteArmor, renderRoxiteArmor, 3).setCreativeTab(tabMullak99sModWP).setTextureName("mullak99:bootsRoxite").setUnlocalizedName("bootsRoxite");
			
			helmetBronze = new bronzeArmor(1620, bronzeArmor, renderBronzeArmor, 0).setCreativeTab(tabMullak99sModWP).setTextureName("mullak99:helmetBronze").setUnlocalizedName("helmetBronze");
			chestBronze = new bronzeArmor(1621, bronzeArmor, renderBronzeArmor, 1).setCreativeTab(tabMullak99sModWP).setTextureName("mullak99:chestBronze").setUnlocalizedName("chestBronze");
			legsBronze = new bronzeArmor(1622, bronzeArmor, renderBronzeArmor, 2).setCreativeTab(tabMullak99sModWP).setTextureName("mullak99:legsBronze").setUnlocalizedName("legsBronze");
			bootsBronze = new bronzeArmor(1623, bronzeArmor, renderBronzeArmor, 3).setCreativeTab(tabMullak99sModWP).setTextureName("mullak99:bootsBronze").setUnlocalizedName("bootsBronze");
			
		//Blocks
		oreMullite = new oreMullite(500, Material.rock).setHardness(4.0F).setStepSound(Block.soundStoneFootstep).setCreativeTab(tabMullak99sModB).setTextureName("mullak99:oreMullite").setUnlocalizedName("oreMullite");
		blockMullite = new genericBlock(501, Material.iron).setHardness(5.0F).setStepSound(Block.soundMetalFootstep).setCreativeTab(tabMullak99sModB).setTextureName("mullak99:blockMullite").setUnlocalizedName("blockMullite");
		
		oreRoxite = new oreRoxite(502, Material.rock).setHardness(4.0F).setStepSound(Block.soundStoneFootstep).setCreativeTab(tabMullak99sModB).setTextureName("mullak99:oreRoxite").setUnlocalizedName("oreRoxite");
		blockRoxite = new genericBlock(503, Material.iron).setHardness(5.0F).setStepSound(Block.soundMetalFootstep).setCreativeTab(tabMullak99sModB).setTextureName("mullak99:blockRoxite").setUnlocalizedName("blockRoxite");
		
		oreCopper = new oreCopper(504, Material.rock).setHardness(3.0F).setStepSound(Block.soundStoneFootstep).setCreativeTab(tabMullak99sModB).setTextureName("mullak99:oreCopper").setUnlocalizedName("oreCopper");
		blockCopper = new genericBlock(505, Material.iron).setHardness(4.0F).setStepSound(Block.soundMetalFootstep).setCreativeTab(tabMullak99sModB).setTextureName("mullak99:blockCopper").setUnlocalizedName("blockCopper");
		
		oreTin = new oreTin(506, Material.rock).setHardness(3.0F).setStepSound(Block.soundStoneFootstep).setCreativeTab(tabMullak99sModB).setTextureName("mullak99:oreTin").setUnlocalizedName("oreTin");
		blockTin = new genericBlock(507, Material.iron).setHardness(4.0F).setStepSound(Block.soundMetalFootstep).setCreativeTab(tabMullak99sModB).setTextureName("mullak99:blockTin").setUnlocalizedName("blockTin");
		
		blockBronze = new genericBlock(510, Material.iron).setHardness(4.0F).setStepSound(Block.soundMetalFootstep).setCreativeTab(tabMullak99sModB).setTextureName("mullak99:blockBronze").setUnlocalizedName("blockBronze");
		
		oreAlpha = new oreAlpha(508, Material.rock).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundStoneFootstep).setCreativeTab(tabMullak99sModB).setTextureName("mullak99:oreAlpha").setUnlocalizedName("oreAlpha");
		alphaCobble = new genericBlock(910, Material.rock).setHardness(2.0F).setStepSound(Block.soundStoneFootstep).setResistance(10.0F).setCreativeTab(tabMullak99sModB).setTextureName("mullak99:alphaCobble").setUnlocalizedName("alphaCobble");
		alphaStone = new alphaStone(911, Material.rock).setHardness(1.5F).setStepSound(Block.soundStoneFootstep).setResistance(10.0F).setCreativeTab(tabMullak99sModWIP).setTextureName("stone").setUnlocalizedName("alphaStone");
		alphaFurnaceIdle = new alphaFurnace(912, false).setHardness(3.5F).setStepSound(Block.soundStoneFootstep).setCreativeTab(tabMullak99sModWIP).setUnlocalizedName("alphaFurnace").setCreativeTab(CreativeTabs.tabDecorations);
	    alphaFurnaceBurning = new alphaFurnace(913, true).setHardness(3.5F).setStepSound(Block.soundStoneFootstep).setLightValue(0.875F).setUnlocalizedName("alphaFurnace");
	    alphaLeaves = (alphaLeaves)(new alphaLeaves(914)).setHardness(0.2F).setLightOpacity(1).setStepSound(Block.soundGrassFootstep).setUnlocalizedName("alphaLeaves").setTextureName("mullak99:leaves");
	    alphaGrass = new alphaGrass(915).setHardness(0.2F).setStepSound(Block.soundGrassFootstep).setUnlocalizedName("alphaGrass");
	    
		//Creative Tabs
		LanguageRegistry.instance().addStringLocalization("itemGroup.mullak99sModI", "en_US", "mullak99's Mod Items");
		LanguageRegistry.instance().addStringLocalization("itemGroup.mullak99sModB", "en_US", "mullak99's Mod Blocks");
		LanguageRegistry.instance().addStringLocalization("itemGroup.mullak99sModWP", "en_US", "mullak99's Mod Weaponry");
		LanguageRegistry.instance().addStringLocalization("itemGroup.mullak99sModWIP", "en_US", "mullak99's Mod WIP");
		
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
		
		LanguageRegistry.addName(redstoneBattery, "Redstone Battery");
		
			//Food
			LanguageRegistry.addName(enchantedMelon, "Michael Melon");
			
			//Drink
			LanguageRegistry.addName(bucketChocMilk, "Chocolate Milk");
		
			//Tools
			LanguageRegistry.addName(pickaxeMullite, "Mullite Pickaxe");
			LanguageRegistry.addName(shovelMullite, "Mullite Shovel");
			LanguageRegistry.addName(swordMullite, "Mullite Sword");
			LanguageRegistry.addName(axeMullite, "Mullite Axe");
			LanguageRegistry.addName(hoeMullite, "Mullite Hoe");
			LanguageRegistry.addName(swordMulliteDE, "Mullite Sword");
			
			LanguageRegistry.addName(pickaxeRoxite, "Roxite Pickaxe");
			LanguageRegistry.addName(shovelRoxite, "Roxite Shovel");
			LanguageRegistry.addName(swordRoxite, "Roxite Sword");
			LanguageRegistry.addName(axeRoxite, "Roxite Axe");
			LanguageRegistry.addName(hoeRoxite, "Roxite Hoe");
			LanguageRegistry.addName(swordRoxiteDE, "Roxite Sword");
			
			LanguageRegistry.addName(pickaxeBronze, "Bronze Pickaxe");
			LanguageRegistry.addName(shovelBronze, "Bronze Shovel");
			LanguageRegistry.addName(swordBronze, "Bronze Sword");
			LanguageRegistry.addName(axeBronze, "Bronze Axe");
			LanguageRegistry.addName(hoeBronze, "Bronze Hoe");
			
			
			LanguageRegistry.addName(pickaxeBedrock, "Bedrock Pickaxe");
			LanguageRegistry.addName(shovelBedrock, "Bedrock Shovel");
			LanguageRegistry.addName(swordBedrock, "Bedrock Sword");
			LanguageRegistry.addName(axeBedrock, "Bedrock Axe");
			
			
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
			
			//Mob
			
			
			EntityRegistry.registerModEntity(mullak99Mob.class, "mullak99", 5, this, 10, 10, true);


			LanguageRegistry.instance().addStringLocalization("entity.mullak99Mob.name", "mullak99");
			
		
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
		
		
		
		
		//Handler
		
		GameRegistry.registerFuelHandler(new mullak99FuelHandler());
		
		GameRegistry.registerCraftingHandler(new mortarPestleHandler());
		GameRegistry.registerCraftingHandler(new batteryHandler());
		
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
		
			GameRegistry.addRecipe(new ItemStack(blockTin), "TTT", "TTT", "TTT",
					'T', ingotTin);
			GameRegistry.addShapelessRecipe(new ItemStack(ingotTin, 9), blockTin);
			
			GameRegistry.addRecipe(new ItemStack(alphaCobble, 8), "CCC", "CDC", "CCC",
					'C', Block.cobblestone, 'D', dustAlpha);
			
			GameRegistry.addRecipe(new ItemStack(alphaStone, 8), "SSS", "SDS", "SSS",
					'S', Block.stone, 'D', dustAlpha);
			
			GameRegistry.addRecipe(new ItemStack(alphaGrass, 8), "GGG", "GDG", "GGG",
					'G', Block.grass, 'D', dustAlpha);
			
			GameRegistry.addRecipe(new ItemStack(alphaLeaves, 8), "LLL", "LDL", "LLL",
					'L', Block.leaves, 'D', dustAlpha);
			
			GameRegistry.addShapelessRecipe(new ItemStack(Block.grass), Block.dirt, (new ItemStack(Item.dyePowder, 2, 15)));
			
			/*GameRegistry.addRecipe(new ItemStack(alphaFurnaceIdle), "CCC", "C C", "CCC",
					'C', alphaCobble);
			*/
			
			
			//Items
			
			
			GameRegistry.addRecipe(new ItemStack(mortarPestle), " I ", "S S", " S ",
					'S', Block.stone, 'I', Item.ingotIron);
			
			GameRegistry.addRecipe(new ItemStack(mortarPestleReinf), " S ", "O O", " O ",
					'O', Block.obsidian, 'S', ingotSteel);
			
			GameRegistry.addShapelessRecipe(new ItemStack(dustBronze, 4), dustTin, dustCopper, dustCopper, dustCopper);
			
			
			GameRegistry.addShapelessRecipe(new ItemStack(ingotSteel), dustCoal, dustCoal, Item.ingotIron);
			GameRegistry.addShapelessRecipe(new ItemStack(ingotSteel), dustCharcoal, dustCharcoal, Item.ingotIron);
			GameRegistry.addShapelessRecipe(new ItemStack(ingotSteel), dustCoal, dustCharcoal, Item.ingotIron);
			
			GameRegistry.addRecipe(new ItemStack(redstoneBattery), " C ", "TRT", "TCT",
					'C', ingotCopper, 'T', ingotTin, 'R', Item.redstone);
			
			
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
			
			//Food
			GameRegistry.addRecipe(new ItemStack(enchantedMelon), "DAG", "AMA", "GAD",
					'M', Item.melon, 'A', (new ItemStack(Item.appleGold, 1, 1)), 'D', Block.blockDiamond, 'G', Block.blockGold);
			
			//Drink
			/*GameRegistry.addShapelessRecipe(new ItemStack(bucketChocMilk), Item.bucketMilk, (new ItemStack(Item.dyePowder, 1, 3)));*/
			
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
	
			

		//Smelting
		GameRegistry.addSmelting(oreMullite.blockID, new ItemStack(mullite), 0.1F);
		GameRegistry.addSmelting(oreRoxite.blockID, new ItemStack(roxite), 0.1F);
		GameRegistry.addSmelting(oreCopper.blockID, new ItemStack(ingotCopper), 0.1F);
		GameRegistry.addSmelting(oreTin.blockID, new ItemStack(ingotTin), 0.1F);
		
		GameRegistry.addSmelting(alphaCobble.blockID, new ItemStack(Block.stone), 0F);
		
		GameRegistry.addSmelting(dustMullite.itemID, new ItemStack(mullite), 0F);
		GameRegistry.addSmelting(dustRoxite.itemID, new ItemStack(roxite), 0F);
		GameRegistry.addSmelting(dustCopper.itemID, new ItemStack(ingotCopper), 0F);
		GameRegistry.addSmelting(dustTin.itemID, new ItemStack(ingotTin), 0F);
		GameRegistry.addSmelting(dustBronze.itemID, new ItemStack(ingotBronze), 0F);
		GameRegistry.addSmelting(dustCoal.itemID, new ItemStack(Item.coal), 0F);
		GameRegistry.addSmelting(dustCharcoal.itemID, new ItemStack(Item.coal, 1, 1), 0F);
		
		
		//World Gen
		GameRegistry.registerWorldGenerator(new mullak99WorldGenerator());
		
		//Ore Dictionary
		OreDictionary.registerOre("ingotCopper", new ItemStack(ingotCopper));
		OreDictionary.registerOre("ingotTin", new ItemStack(ingotTin));
		OreDictionary.registerOre("ingotSteel", new ItemStack(ingotSteel));
		OreDictionary.registerOre("ingotBronze", new ItemStack(dustBronze));
		OreDictionary.registerOre("dustCopper", new ItemStack(dustCopper));
		OreDictionary.registerOre("dustTin", new ItemStack(dustTin));
		OreDictionary.registerOre("dustBronze", new ItemStack(dustBronze));
		
		
		//Render Register
		proxy.registerRenderInformation();
		
		
		/*//DIM
		DimensionManager.registerProviderType(DimID, WorldProviderMullak99.class, true);
		DimensionManager.registerDimension(DimID, DimID);*/
		
		

	}
	
	@EventHandler
	public void postInit (FMLPostInitializationEvent event) {
		
	}
	

	
}
