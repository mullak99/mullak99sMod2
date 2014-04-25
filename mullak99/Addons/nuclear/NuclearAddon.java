package mullak99.Addons.nuclear;

import java.io.File;

import mullak99.Addons.nuclear.armor.hazmatSuit;
import mullak99.Addons.nuclear.blocks.oreUranium;
import mullak99.Addons.nuclear.blocks.uraniumGlass;
import mullak99.Addons.nuclear.items.UraniumItem;
import mullak99.mullak99sMod.CommonProxy;
import mullak99.mullak99sMod.mullak99;
import mullak99.mullak99sMod.mullak99CT;
import mullak99.mullak99sMod.mullak99Util;
import mullak99.mullak99sMod.items.stickUranium;
import mullak99.mullakCore.mullakCore;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.oredict.OreDictionary;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod (modid="mullak99's Nuclear", name="mullak99's Nuclear", version="Alpha 0.0.1", dependencies="required-after:mullakCore;required-after:mullak99's Mod 2")
@NetworkMod (clientSideRequired=true, serverSideRequired=false)

public class NuclearAddon {
	
	@Instance ("mullak99's Nuclear")
	public static NuclearAddon instance;
	
	public static Item hazmatHelm;
	public static Item hazmatChest;
	public static Item hazmatLegs;
	public static Item hazmatBoots;
	public static Item rawUranium;
	public static Item cakeUranium;
	public static Item stickUranium;
	
	public static Block oreUranium;
	public static Block glassUranium;
	
	public static boolean UraniumEffects;
	public static boolean UraniumGen;
	
	public static int hazmatHelmID;
	public static int hazmatChestID;
	public static int hazmatLegsID;
	public static int hazmatBootsID;
    public static int rawUraniumID;
    public static int cakeUraniumID;
    public static int stickUraniumID;
    
    public static int oreUraniumID;
    public static int glassUraniumID;
	
	@EventHandler
	public void PreInit (FMLPreInitializationEvent event) {
	
		
		
		Configuration config = new Configuration(new File(event.getModConfigurationDirectory().getAbsolutePath() + File.separator + "mullak99" + File.separator + NAutil.ModID + ".mullak99cfg"));
		
		try {
	        config.load();
	
	        UraniumGen = config.get(Configuration.CATEGORY_GENERAL, "Uranium Ore Generation", true).getBoolean(false);
	        
	        UraniumEffects = config.get(Configuration.CATEGORY_GENERAL, "Uranium Negative Effects (Poison) [CANNOT PREVENT POISON]", false).getBoolean(false);
	        
	        rawUraniumID = config.get(Configuration.CATEGORY_ITEM, "Raw Uranium", 4218).getInt();
		    cakeUraniumID = config.get(Configuration.CATEGORY_ITEM, "Uranium Cake", 4219).getInt();
	        hazmatHelmID = config.get(Configuration.CATEGORY_ITEM, "Hazmat Suit Mask", 4220).getInt();
	        hazmatChestID = config.get(Configuration.CATEGORY_ITEM, "Hazmat Suit Body", 4221).getInt();
	        hazmatLegsID = config.get(Configuration.CATEGORY_ITEM, "Hazmat Suit Legs", 4222).getInt();
	        hazmatBootsID = config.get(Configuration.CATEGORY_ITEM, "Hazmat Suit Boots", 4223).getInt();
	        stickUraniumID = config.get(Configuration.CATEGORY_ITEM, "Uranium Stick", 4225).getInt();
	        
	        oreUraniumID = config.get(Configuration.CATEGORY_BLOCK, "Uranium Ore", 545).getInt();
	        glassUraniumID = config.get(Configuration.CATEGORY_BLOCK, "Uranium Glass", 600).getInt();
		    
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
		
	}
	
	@SidedProxy (clientSide="mullak99.mullak99sMod.client.ClientProxy", serverSide="mullak99.mullak99sMod.CommonProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public void Init (FMLInitializationEvent event) {
		
		rawUranium = new UraniumItem(rawUraniumID).setMaxStackSize(64).setCreativeTab(NATabs.tabMullak99sNuclear).setTextureName("mullak99_nuclear:rawUranium").setUnlocalizedName("mullak99_nuclear:rawUranium");
		cakeUranium = new UraniumItem(cakeUraniumID).setMaxStackSize(64).setCreativeTab(NATabs.tabMullak99sNuclear).setTextureName("mullak99_nuclear:cakeUranium").setUnlocalizedName("mullak99_nuclear:cakeUranium");
		
		int renderHazmatSuit = proxy.addArmor("hazmatSuit");
		
		hazmatHelm = new hazmatSuit(hazmatHelmID, EnumArmorMaterial.IRON, renderHazmatSuit, 0).setCreativeTab(NATabs.tabMullak99sNuclear).setTextureName("mullak99_nuclear:hazmatMask").setUnlocalizedName("mullak99_nuclear:hazmatMask");
		hazmatChest = new hazmatSuit(hazmatChestID, EnumArmorMaterial.IRON, renderHazmatSuit, 1).setCreativeTab(NATabs.tabMullak99sNuclear).setTextureName("mullak99_nuclear:hazmatBody").setUnlocalizedName("mullak99_nuclear:hazmatBody");
		hazmatLegs = new hazmatSuit(hazmatLegsID, EnumArmorMaterial.IRON, renderHazmatSuit, 2).setCreativeTab(NATabs.tabMullak99sNuclear).setTextureName("mullak99_nuclear:hazmatLegs").setUnlocalizedName("mullak99_nuclear:hazmatLegs");
		hazmatBoots = new hazmatSuit(hazmatBootsID, EnumArmorMaterial.IRON, renderHazmatSuit, 3).setCreativeTab(NATabs.tabMullak99sNuclear).setTextureName("mullak99_nuclear:hazmatBoots").setUnlocalizedName("mullak99_nuclear:hazmatBoots");
		
		stickUranium = new stickUranium(stickUraniumID, mullak99.stickTools).setCreativeTab(NATabs.tabMullak99sNuclear).setTextureName("mullak99_nuclear:stickUranium").setUnlocalizedName("mullak99_nuclear:stickUranium");
		
		oreUranium = new oreUranium(oreUraniumID, Material.rock).setHardness(3.5F).setStepSound(Block.soundStoneFootstep).setCreativeTab(NATabs.tabMullak99sNuclear).setTextureName("mullak99_nuclear:oreUranium").setUnlocalizedName("mullak99_nuclear:oreUranium");
		glassUranium = new uraniumGlass(glassUraniumID, Material.glass, false).setHardness(0.6F).setStepSound(Block.soundGlassFootstep).setCreativeTab(NATabs.tabMullak99sNuclear).setUnlocalizedName("mullak99_nuclear:glassUranium").setTextureName("mullak99_nuclear:glassUranium");
		
		//Creative Tabs
		LanguageRegistry.instance().addStringLocalization("itemGroup.mullak99sModNuclear", "en_US", NAutil.ModID);
		
		
		mullakCore.InitialiseItem(rawUranium, "Raw Uranium");
		mullakCore.InitialiseItem(cakeUranium, "Uranium Cake");
		
		mullakCore.InitialiseItem(stickUranium, "Stick");
		
		mullakCore.InitialiseItem(hazmatHelm, "Hazmat Suit Mask");
		mullakCore.InitialiseItem(hazmatChest, "Hazmat Suit Body");
		mullakCore.InitialiseItem(hazmatLegs, "Hazmat Suit Legs");
		mullakCore.InitialiseItem(hazmatBoots, "Hazmat Suit Boots");
		
		
		mullakCore.InitialiseBlock(oreUranium, "oreUranium", "Uranium Ore", "pickaxe", 2);
		mullakCore.InitialiseBlock(glassUranium, "glassUranium", "Uranium Glass", null, 0);
		
		
		
		
		//Ore Dictionary
		
		OreDictionary.registerOre("oreUranium", new ItemStack(oreUranium));
		OreDictionary.registerOre("Uranium", new ItemStack(rawUranium));
		OreDictionary.registerOre("ingotUranium", new ItemStack(cakeUranium));
		
		
		NuclearCrafting.Recipes();
	}
	
	@EventHandler
	public void postInit (FMLPostInitializationEvent event) {
		
	}
    
}
