package mullak99.mullak99sMod;

import java.util.logging.Level;

import mullak99.mullak99sMod.blocks.*;
import mullak99.mullak99sMod.items.*;
import mullak99.mullak99sMod.armor.*;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.Property;
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
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.item.crafting.CraftingManager;

@Mod (modid="mullak99's Mod", name="mullak99's Mod", version="0.0.1")
@NetworkMod (clientSideRequired=true, serverSideRequired=false)

public class mullak99 {
	
	
    //Items
    public static Item mullite;
    public static Item roxite;
    public static Item ingotCopper;
    public static Item ingotSteel;
    public static Item ingotTin;
    public static Item alphaDust;
    public static Item mortarPestle;
    public static Item mortarPestleReinf;
    public static Item mulliteDust;
    public static Item roxiteDust;
    public static Item coalDust;
    public static Item charcoalDust;
    
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
    
    //Armor
    public static Item helmetMullite;
    public static Item chestMullite;
    public static Item legsMullite;
    public static Item bootsMullite;
    public static Item helmetRoxite;
    public static Item chestRoxite;
    public static Item legsRoxite;
    public static Item bootsRoxite;
    
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
    public static Block blockAlpha;
	
	
	@Instance ("mullak99's Mod")
	public static mullak99 instance;
	
	//Enum Tool Material
	public static EnumToolMaterial mulliteTools = EnumHelper.addToolMaterial("Mullite", 3, 2500, 10.0F, 4, 20);
	public static EnumToolMaterial mulliteToolsDE = EnumHelper.addToolMaterial("MulliteDE", 3, 3000, 12.0F, 6, 22);
	
	//Enum Armor Material
	public static EnumArmorMaterial mulliteArmor = EnumHelper.addArmorMaterial("Mullite", 40, new int[]{5, 11, 8, 5}, 25);
	
	//Creative Tabs
	public static CreativeTabs tabMullak99sMod = new CreativeTabs("mullak99sMod") {
		public ItemStack getIconItemStack() {
			return new ItemStack(mullite);
			
		}
	};
	
	@EventHandler
	public void PreInit (FMLPreInitializationEvent event) {

	}
	@SidedProxy (clientSide="mullak99.mullak99sMod.client.ClientProxy", serverSide="mullak99.mullak99sMod.CommonProxy")
	public static CommonProxy proxy;
	


	@EventHandler
	public void load (FMLInitializationEvent event) {
		
		
		
		//Items
		mullite = new mullite(1000).setMaxStackSize(64).setCreativeTab(tabMullak99sMod).setTextureName("mullak99:Mullite").setUnlocalizedName("mullite");
		roxite = new roxite(1001).setMaxStackSize(64).setCreativeTab(tabMullak99sMod).setTextureName("mullak99:Roxite").setUnlocalizedName("roxite");
		ingotCopper = new ingotCopper(1002).setMaxStackSize(64).setCreativeTab(tabMullak99sMod).setTextureName("mullak99:ingotCopper").setUnlocalizedName("ingotCopper");
		ingotSteel = new ingotSteel(1003).setMaxStackSize(64).setCreativeTab(tabMullak99sMod).setTextureName("mullak99:ingotSteel").setUnlocalizedName("ingotSteel");
		ingotTin = new ingotTin(1004).setMaxStackSize(64).setCreativeTab(tabMullak99sMod).setTextureName("mullak99:ingotTin").setUnlocalizedName("ingotTin");
		alphaDust = new alphaDust(900).setMaxStackSize(64).setCreativeTab(tabMullak99sMod).setTextureName("mullak99:alphaDust").setUnlocalizedName("alphaDust");
		mortarPestle = new mortarPestle(1005).setMaxStackSize(1).setMaxDamage(16).setCreativeTab(tabMullak99sMod).setTextureName("mullak99:mortarPestle").setUnlocalizedName("mortarPestle");
		mortarPestleReinf = new mortarPestle(1006).setMaxStackSize(1).setMaxDamage(64).setCreativeTab(tabMullak99sMod).setTextureName("mullak99:mortarPestleReinf").setUnlocalizedName("mortarPestleReinf");
		mulliteDust = new Dust(1010).setMaxStackSize(64).setCreativeTab(tabMullak99sMod).setTextureName("mullak99:dustMullite").setUnlocalizedName("mulliteDust");
		roxiteDust = new Dust(1011).setMaxStackSize(64).setCreativeTab(tabMullak99sMod).setTextureName("mullak99:dustRoxite").setUnlocalizedName("roxiteDust");
		coalDust = new Dust(1012).setMaxStackSize(64).setCreativeTab(tabMullak99sMod).setTextureName("mullak99:dustCoal").setUnlocalizedName("coalDust");
		charcoalDust = new Dust(1013).setMaxStackSize(64).setCreativeTab(tabMullak99sMod).setTextureName("mullak99:dustCoal").setUnlocalizedName("charcoalDust");
			
			//Tools
			pickaxeMullite = new pickaxeMullite(1500, mulliteTools).setCreativeTab(tabMullak99sMod).setTextureName("mullak99:pickaxeMullite").setUnlocalizedName("pickaxeMullite");
			shovelMullite = new shovelMullite(1501, mulliteTools).setCreativeTab(tabMullak99sMod).setTextureName("mullak99:shovelMullite").setUnlocalizedName("shovelMullite");
			swordMullite = new swordMullite(1502, mulliteTools).setCreativeTab(tabMullak99sMod).setTextureName("mullak99:swordMullite").setUnlocalizedName("swordMullite");
			axeMullite = new axeMullite(1503, mulliteTools).setCreativeTab(tabMullak99sMod).setTextureName("mullak99:axeMullite").setUnlocalizedName("axeMullite");
			hoeMullite = new hoeMullite(1504, mulliteTools).setCreativeTab(tabMullak99sMod).setTextureName("mullak99:hoeMullite").setUnlocalizedName("hoeMullite");
			swordMulliteDE = new swordMulliteDE(1505, mulliteToolsDE).setCreativeTab(tabMullak99sMod).setTextureName("mullak99:swordMulliteDE").setUnlocalizedName("swordMulliteDE");
			
			pickaxeRoxite = new pickaxeMullite(2500, mulliteTools).setCreativeTab(tabMullak99sMod).setTextureName("mullak99:pickaxeRoxite").setUnlocalizedName("pickaxeRoxite");
			shovelRoxite = new shovelMullite(2501, mulliteTools).setCreativeTab(tabMullak99sMod).setTextureName("mullak99:shovelRoxite").setUnlocalizedName("shovelRoxite");
			swordRoxite = new swordMullite(2502, mulliteTools).setCreativeTab(tabMullak99sMod).setTextureName("mullak99:swordRoxite").setUnlocalizedName("swordRoxite");
			axeRoxite = new axeMullite(2503, mulliteTools).setCreativeTab(tabMullak99sMod).setTextureName("mullak99:axeRoxite").setUnlocalizedName("axeRoxite");
			hoeRoxite = new hoeMullite(2504, mulliteTools).setCreativeTab(tabMullak99sMod).setTextureName("mullak99:hoeRoxite").setUnlocalizedName("hoeRoxite");
			swordRoxiteDE = new swordMulliteDE(2505, mulliteToolsDE).setCreativeTab(tabMullak99sMod).setTextureName("mullak99:swordRoxiteDE").setUnlocalizedName("swordRoxiteDE");
			
			//Armor
			
			RenderingRegistry.addNewArmourRendererPrefix("mulliteArmor");
			RenderingRegistry.addNewArmourRendererPrefix("roxiteArmor");
			
			helmetMullite = new mulliteArmor(1600, mulliteArmor, 5, 0).setCreativeTab(tabMullak99sMod).setTextureName("mullak99:helmetMullite").setUnlocalizedName("helmetMullite");
			chestMullite = new mulliteArmor(1601, mulliteArmor, 5, 1).setCreativeTab(tabMullak99sMod).setTextureName("mullak99:chestMullite").setUnlocalizedName("chestMullite");
			legsMullite = new mulliteArmor(1602, mulliteArmor, 5, 2).setCreativeTab(tabMullak99sMod).setTextureName("mullak99:legsMullite").setUnlocalizedName("legsMullite");
			bootsMullite = new mulliteArmor(1603, mulliteArmor, 5, 3).setCreativeTab(tabMullak99sMod).setTextureName("mullak99:bootsMullite").setUnlocalizedName("bootsMullite");
			
			helmetRoxite = new roxiteArmor(1610, mulliteArmor, 5, 0).setCreativeTab(tabMullak99sMod).setTextureName("mullak99:helmetRoxite").setUnlocalizedName("helmetRoxite");
			chestRoxite = new roxiteArmor(1611, mulliteArmor, 5, 1).setCreativeTab(tabMullak99sMod).setTextureName("mullak99:chestRoxite").setUnlocalizedName("chestRoxite");
			legsRoxite = new roxiteArmor(1612, mulliteArmor, 5, 2).setCreativeTab(tabMullak99sMod).setTextureName("mullak99:legsRoxite").setUnlocalizedName("legsRoxite");
			bootsRoxite = new roxiteArmor(1613, mulliteArmor,5, 3).setCreativeTab(tabMullak99sMod).setTextureName("mullak99:bootsRoxite").setUnlocalizedName("bootsRoxite");
			
		//Blocks
		oreMullite = new oreMullite(500, Material.rock).setHardness(4.0F).setStepSound(Block.soundStoneFootstep).setCreativeTab(tabMullak99sMod).setTextureName("mullak99:oreMullite").setUnlocalizedName("oreMullite");
		blockMullite = new genericBlock(501, Material.iron).setHardness(5.0F).setStepSound(Block.soundMetalFootstep).setCreativeTab(tabMullak99sMod).setTextureName("mullak99:blockMullite").setUnlocalizedName("blockMullite");
		
		oreRoxite = new oreMullite(502, Material.rock).setHardness(4.0F).setStepSound(Block.soundStoneFootstep).setCreativeTab(tabMullak99sMod).setTextureName("mullak99:oreRoxite").setUnlocalizedName("oreRoxite");
		blockRoxite = new genericBlock(503, Material.iron).setHardness(5.0F).setStepSound(Block.soundMetalFootstep).setCreativeTab(tabMullak99sMod).setTextureName("mullak99:blockRoxite").setUnlocalizedName("blockRoxite");
		
		oreCopper = new oreCopper(504, Material.rock).setHardness(3.0F).setStepSound(Block.soundStoneFootstep).setCreativeTab(tabMullak99sMod).setTextureName("mullak99:oreCopper").setUnlocalizedName("oreCopper");
		blockCopper = new genericBlock(505, Material.iron).setHardness(4.0F).setStepSound(Block.soundMetalFootstep).setCreativeTab(tabMullak99sMod).setTextureName("mullak99:blockCopper").setUnlocalizedName("blockCopper");
		
		oreTin = new oreTin(506, Material.rock).setHardness(3.0F).setStepSound(Block.soundStoneFootstep).setCreativeTab(tabMullak99sMod).setTextureName("mullak99:oreTin").setUnlocalizedName("oreTin");
		blockTin = new genericBlock(507, Material.iron).setHardness(4.0F).setStepSound(Block.soundMetalFootstep).setCreativeTab(tabMullak99sMod).setTextureName("mullak99:blockTin").setUnlocalizedName("blockTin");
		
		oreAlpha = new oreAlpha(508, Material.rock).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundStoneFootstep).setCreativeTab(tabMullak99sMod).setTextureName("mullak99:oreAlpha").setUnlocalizedName("oreAlpha");
		alphaCobble = new genericBlock(910, Material.rock).setHardness(2.0F).setStepSound(Block.soundStoneFootstep).setResistance(10.0F).setCreativeTab(tabMullak99sMod).setTextureName("mullak99:alphaCobble").setUnlocalizedName("alphaCobble");
		
		
		//Creative Tabs
		LanguageRegistry.instance().addStringLocalization("itemGroup.mullak99sMod", "en_US", "mullak99's Mod");
		
		//Items
		LanguageRegistry.addName(mullite, "Mullite");
		LanguageRegistry.addName(roxite, "Roxite");
		LanguageRegistry.addName(ingotCopper, "Copper Ingot");
		LanguageRegistry.addName(ingotSteel, "Steel Ingot");
		LanguageRegistry.addName(ingotTin, "Tin Ingot");
		LanguageRegistry.addName(alphaDust, "Dust of Nostalgia");
		LanguageRegistry.addName(mortarPestle, "Mortar and Pestle");
		LanguageRegistry.addName(mortarPestleReinf, "Reinforced Mortar and Pestle");
		LanguageRegistry.addName(mulliteDust, "Mullite Dust");
		LanguageRegistry.addName(roxiteDust, "Roxite Dust");
		LanguageRegistry.addName(coalDust, "Coal Dust");
		LanguageRegistry.addName(charcoalDust, "Charcoal Dust");
		
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
			
			//Armor
			LanguageRegistry.addName(helmetMullite, "Mullite Helmet");
			LanguageRegistry.addName(chestMullite, "Mullite Chestplate");
			LanguageRegistry.addName(legsMullite, "Mullite Leggings");
			LanguageRegistry.addName(bootsMullite, "Mullite Boots");
			
			LanguageRegistry.addName(helmetRoxite, "Roxite Helmet");
			LanguageRegistry.addName(chestRoxite, "Roxite Chestplate");
			LanguageRegistry.addName(legsRoxite, "Roxite Leggings");
			LanguageRegistry.addName(bootsRoxite, "Roxite Boots");
			
		
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
		
		GameRegistry.registerBlock(oreAlpha, "oreAlpha");
		LanguageRegistry.addName(oreAlpha, "Nostalgia Ore");
		MinecraftForge.setBlockHarvestLevel(oreAlpha, "pickaxe", 2);
		
		
		
		//Crafting Handler
		GameRegistry.registerCraftingHandler(new mortarPestleHandler());
		
		//Container Item
		
		
		
		//Crafting
		
			//Blocks
			GameRegistry.addRecipe(new ItemStack(blockMullite), "MMM", "MMM", "MMM",
					'M', mullite);
			GameRegistry.addShapelessRecipe(new ItemStack(mullite, 9), blockMullite);
		
			GameRegistry.addRecipe(new ItemStack(blockCopper), "CCC", "CCC", "CCC",
					'C', ingotCopper);
			GameRegistry.addShapelessRecipe(new ItemStack(ingotCopper, 9), blockCopper);
		
			GameRegistry.addRecipe(new ItemStack(blockCopper), "TTT", "TTT", "TTT",
					'T', ingotTin);
			GameRegistry.addShapelessRecipe(new ItemStack(ingotTin, 9), blockTin);
			
			
			//Items
			
			
			GameRegistry.addRecipe(new ItemStack(alphaCobble, 8), "CCC", "CDC", "CCC",
					'C', Block.cobblestone, 'D', alphaDust);
			
			GameRegistry.addRecipe(new ItemStack(mortarPestle), " I ", "S S", " S ",
					'S', Block.stone, 'I', Item.ingotIron);
			
			GameRegistry.addRecipe(new ItemStack(mortarPestleReinf), " S ", "O O", " O ",
					'O', Block.obsidian, 'S', ingotSteel);
			
			
			GameRegistry.addShapelessRecipe(new ItemStack(ingotSteel), coalDust, coalDust, Item.ingotIron);
			GameRegistry.addShapelessRecipe(new ItemStack(ingotSteel), charcoalDust, charcoalDust, Item.ingotIron);
			GameRegistry.addShapelessRecipe(new ItemStack(ingotSteel), coalDust, charcoalDust, Item.ingotIron);
			
			
			//Mortar and Pestle
			GameRegistry.addShapelessRecipe(new ItemStack(mulliteDust), mullite, (new ItemStack(mortarPestle, 1, 32767)));
			GameRegistry.addShapelessRecipe(new ItemStack(mulliteDust, 2), oreMullite, (new ItemStack(mortarPestle, 1, 32767)));
			
			GameRegistry.addShapelessRecipe(new ItemStack(roxiteDust), roxite, (new ItemStack(mortarPestle, 1, 32767)));
			GameRegistry.addShapelessRecipe(new ItemStack(roxiteDust, 2), oreRoxite, (new ItemStack(mortarPestle, 1, 32767)));
			
			
			GameRegistry.addShapelessRecipe(new ItemStack(coalDust), Item.coal, (new ItemStack(mortarPestle, 1, 32767)));
			GameRegistry.addShapelessRecipe(new ItemStack(coalDust, 2), Block.oreCoal, (new ItemStack(mortarPestle, 1, 32767)));
			GameRegistry.addShapelessRecipe(new ItemStack(charcoalDust), Item.coal, (new ItemStack(mortarPestle, 1, 32767)));
			
			GameRegistry.addShapelessRecipe(new ItemStack(alphaDust, 16), oreAlpha, (new ItemStack(mortarPestle, 1, 32767)));
			
			GameRegistry.addShapelessRecipe(new ItemStack(Block.cobblestone), alphaCobble, (new ItemStack(mortarPestle, 1, 32767)));
			
			//Reinforced Mortar and Pestle
			GameRegistry.addShapelessRecipe(new ItemStack(mulliteDust), mullite, (new ItemStack(mortarPestleReinf, 1, 32767)));
			GameRegistry.addShapelessRecipe(new ItemStack(mulliteDust, 2), oreMullite, (new ItemStack(mortarPestleReinf, 1, 32767)));
			
			GameRegistry.addShapelessRecipe(new ItemStack(roxiteDust), roxite, (new ItemStack(mortarPestleReinf, 1, 32767)));
			GameRegistry.addShapelessRecipe(new ItemStack(roxiteDust, 2), oreRoxite, (new ItemStack(mortarPestleReinf, 1, 32767)));
			
			
			GameRegistry.addShapelessRecipe(new ItemStack(coalDust), Item.coal, (new ItemStack(mortarPestleReinf, 1, 32767)));
			GameRegistry.addShapelessRecipe(new ItemStack(coalDust, 2), Block.oreCoal, (new ItemStack(mortarPestleReinf, 1, 32767)));
			GameRegistry.addShapelessRecipe(new ItemStack(charcoalDust), Item.coal, (new ItemStack(mortarPestleReinf, 1, 32767)));
			
			GameRegistry.addShapelessRecipe(new ItemStack(alphaDust, 16), oreAlpha, (new ItemStack(mortarPestleReinf, 1, 32767)));
			
			GameRegistry.addShapelessRecipe(new ItemStack(Block.cobblestone), alphaCobble, (new ItemStack(mortarPestleReinf, 1, 32767)));
			
			
			//Tools
			GameRegistry.addRecipe(new ItemStack(pickaxeMullite), "MMM", " S ", " S ",
					'M', mullite, 'S', Item.stick);
			GameRegistry.addRecipe(new ItemStack(shovelMullite), " M ", " S ", " S ",
					'M', mullite, 'S', Item.stick);
			GameRegistry.addRecipe(new ItemStack(swordMullite), " M ", " M ", " S ",
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
			
			GameRegistry.addRecipe(new ItemStack(blockMullite), "MMM", "MMM", "MMM",
					'M', mullite);
			GameRegistry.addShapelessRecipe(new ItemStack(mullite, 9), blockMullite);
		
			GameRegistry.addRecipe(new ItemStack(blockCopper), "CCC", "CCC", "CCC",
					'C', ingotCopper);
			GameRegistry.addShapelessRecipe(new ItemStack(ingotCopper, 9), blockCopper);
		
			GameRegistry.addRecipe(new ItemStack(blockCopper), "TTT", "TTT", "TTT",
					'T', ingotTin);
			GameRegistry.addShapelessRecipe(new ItemStack(ingotTin, 9), blockTin);
			
			
			GameRegistry.addRecipe(new ItemStack(pickaxeRoxite), "RRR", " S ", " S ",
					'R', roxite, 'S', Item.stick);
			GameRegistry.addRecipe(new ItemStack(shovelRoxite), " R ", " S ", " S ",
					'R', roxite, 'S', Item.stick);
			GameRegistry.addRecipe(new ItemStack(swordRoxite), " R ", " R ", " S ",
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
			
	
		
		//Smelting
		GameRegistry.addSmelting(oreMullite.blockID, new ItemStack(mullite), 0.1F);
		GameRegistry.addSmelting(oreRoxite.blockID, new ItemStack(roxite), 0.1F);
		GameRegistry.addSmelting(oreCopper.blockID, new ItemStack(ingotCopper), 0.1F);
		GameRegistry.addSmelting(oreTin.blockID, new ItemStack(ingotTin), 0.1F);
		
		GameRegistry.addSmelting(alphaCobble.blockID, new ItemStack(Block.stone), 0F);
		
		//World Gen
		GameRegistry.registerWorldGenerator(new mullak99WorldGenerator());
	}
	
	@EventHandler
	public void postInit (FMLPostInitializationEvent event) {
		
	}
	

	
}
