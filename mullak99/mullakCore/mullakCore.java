package mullak99.mullakCore;

import java.io.File;

import mullak99.Addons.nuclear.NAutil;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityEggInfo;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod (modid="mullakCore", name="mullakCore", version="Alpha 0.1.0 Pre-Release 2")
@NetworkMod (clientSideRequired=true, serverSideRequired=false)


public class mullakCore {

	
	public static int randomWithRange(int min, int max)
	{
	   int range = (max - min) + 1;     
	   return (int)(Math.random() * range) + min;
	}
	
	public static void isModLoadedReturnError(String modid) {
		if (Loader.isModLoaded(modid)) {
			FMLLog.fine(CoreUtil.mullakCoreString + "Sucess: Found " + modid + "!");
		}
		
		else {
			FMLLog.severe(CoreUtil.mullakCoreString + "Error: Couldnt find " + modid + "!");
			System.exit(1);
		}
	}
	

	public static void registerEntity(Class<? extends Entity> entityClass, String entityName, int bkEggColor, int fgEggColor) {
		int id = EntityRegistry.findGlobalUniqueEntityId();

		EntityRegistry.registerGlobalEntityID(entityClass, entityName, id);
		EntityList.entityEggs.put(Integer.valueOf(id), new EntityEggInfo(id, bkEggColor, fgEggColor));
		}

	public void addSpawn(Class<? extends EntityLiving> entityClass, int spawnProb, int min, int max, BiomeGenBase[] biomes) {
		if (spawnProb > 0) {
		EntityRegistry.addSpawn(entityClass, spawnProb, min, max, EnumCreatureType.creature, biomes);
		}
	}
		
	
	public static void InitialiseBlock(Block block, String registerBlockName, String BlockNameIG, String Tool, int harvestLevel) {
		
		GameRegistry.registerBlock(block, registerBlockName);
		LanguageRegistry.addName(block, BlockNameIG);
		MinecraftForge.setBlockHarvestLevel(block, Tool, harvestLevel);
	}
	
	public static void InitialiseItem(Item item, String ItemNameIG) {
	
		LanguageRegistry.addName(item, ItemNameIG);
	}
	
	public static void addChatMSG(String message) {
		Minecraft.getMinecraft().thePlayer.addChatMessage(message);
	}
	
	public static void RegisterPaxel(Item paxel, int harvestLevel, String PaxelName) {
		MinecraftForge.setToolClass(paxel, "pickaxe", harvestLevel);
		LanguageRegistry.addName(paxel, PaxelName);
	}

	

	
	public static EnumToolMaterial nullTool = EnumHelper.addToolMaterial("Null", 1, 1, 1.0F, 1, 1);
	
	
	public static boolean SuperHardModeCore;
	
	
	@EventHandler
	public void PreInit (FMLPreInitializationEvent event) {
	
		
		System.out.println(CoreUtil.mullakCoreString + "Loaded " + CoreVersionInfo.LongVersion);
		
		Configuration config = new Configuration(new File(event.getModConfigurationDirectory().getAbsolutePath() + File.separator + "mullak99" + File.separator + CoreUtil.ModID + ".mullak99cfg"));

		try {
			config.load();
	
			SuperHardModeCore = config.get(Configuration.CATEGORY_GENERAL, "Super Hard Mode (Mobs and Player tweaks)", false).getBoolean(false);
		}
		
		catch(Exception e) {
			System.out.println(CoreUtil.mullakCoreString + "Failed to load config!");
		}
			
		finally {
			if (config.hasChanged()) {
				config.save();
			}
			else {
				return;
			}
		}	

	}
	
	@EventHandler
	public void load (FMLInitializationEvent event) {
		
		if(SuperHardModeCore) {
			System.out.println(CoreUtil.mullakCoreString + "Super Hardmode is still in developement!");
		} else {
			return;
		}
		
	}
	
	@EventHandler
	public void postInit (FMLPostInitializationEvent event) {
		
	}
		
}
