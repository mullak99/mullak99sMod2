package mullak99.mullakCore;

import mullak99.mullak99sMod.mullak99;
import mullak99.mullak99sMod.mobs.EntitySheepOverride;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityEggInfo;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.world.biome.BiomeGenBase;
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

@Mod (modid="mullak99Core", name="mullakCore", version="Alpha 0.0.3", dependencies="before:*")
@NetworkMod (clientSideRequired=true, serverSideRequired=false)


public class mullakCore {

	
	public static int randomWithRange(int min, int max)
	{
	   int range = (max - min) + 1;     
	   return (int)(Math.random() * range) + min;
	}
	
	public static void isModLoadedReturnError(String modid) {
		if (Loader.isModLoaded(modid)) {
			FMLLog.fine("[mullakCore] Sucess: Found " + modid + "!");
		}
		
		else {
			FMLLog.severe("[mullakCore] Error: Couldnt find " + modid + "!");
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
	
	public static EnumToolMaterial nullTool = EnumHelper.addToolMaterial("Null", 1, 1, 1.0F, 1, 1);
	
	@EventHandler
	public void PreInit (FMLPreInitializationEvent event) {
	
	}
	
	@EventHandler
	public void load (FMLInitializationEvent event) {
		
		
	}
	
	@EventHandler
	public void postInit (FMLPostInitializationEvent event) {
		
	}
	
}
