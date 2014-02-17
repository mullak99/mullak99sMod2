package mullak99.mullakCore;

import mullak99.mullak99sMod.mullak99;
import mullak99.mullak99sMod.mobs.EntitySheepOverride;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod (modid="mullak99Core", name="mullak99 Core", version="Alpha 0.0.2", dependencies="before:*")
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
