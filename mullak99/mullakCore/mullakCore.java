package mullak99.mullakCore;

import mullak99.mullak99sMod.mullak99;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod (modid="mullak99Core", name="mullak99 Core", version="Alpha 0.0.1")
@NetworkMod (clientSideRequired=true, serverSideRequired=false)


public class mullakCore {

	
	static int randomWithRange(int min, int max)
	{
	   int range = (max - min) + 1;     
	   return (int)(Math.random() * range) + min;
	}
	
	@EventHandler
	public void PreInit (FMLPreInitializationEvent event) {
	
	}
	
	@EventHandler
	public void load (FMLInitializationEvent event) {
		
		MinecraftForge.EVENT_BUS.register(new EntitySheepOverride(null));
	}
	
	@EventHandler
	public void postInit (FMLPostInitializationEvent event) {
		
	}
	
}
