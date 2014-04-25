package mullak99.mullak99sMod.client;

import mullak99.mullak99sMod.CommonProxy;
import mullak99.mullak99sMod.mullak99;
import mullak99.mullak99sMod.registerMullak99Sounds;
import mullak99.mullak99sMod.mobs.ProNinjaGamerMob;
import mullak99.mullak99sMod.mobs.RenderLucozade_wallerMob;
import mullak99.mullak99sMod.mobs.RenderMullak99Mob;
import mullak99.mullak99sMod.mobs.RenderProNinjaGamerMob;
import mullak99.mullak99sMod.mobs.RenderThundercoyoteMob;
import mullak99.mullak99sMod.mobs.ThundercoyoteMob;
import mullak99.mullak99sMod.mobs.lucozade_wallerMob;
import mullak99.mullak99sMod.mobs.mullak99Mob;
import mullak99.mullakCore.CapeCore;
import net.minecraft.client.model.ModelBiped;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import mullak99.mullak99sMod.mullak99Util;

public class ClientProxy extends CommonProxy
{
    
	@Override
    public void init(FMLInitializationEvent event)
    {
        
    }
	
    public void registerRenderInformation()
    {
    	
		MinecraftForge.EVENT_BUS.register(new CapeCore());
		RenderingRegistry.registerEntityRenderingHandler(mullak99Mob.class, new RenderMullak99Mob(new ModelBiped(), 0.5F, 0));
		RenderingRegistry.registerEntityRenderingHandler(lucozade_wallerMob.class, new RenderLucozade_wallerMob(new ModelBiped(), 0.5F, 0));
		RenderingRegistry.registerEntityRenderingHandler(ThundercoyoteMob.class, new RenderThundercoyoteMob(new ModelBiped(), 0.5F, 0));
		RenderingRegistry.registerEntityRenderingHandler(ProNinjaGamerMob.class, new RenderProNinjaGamerMob(new ModelBiped(), 0.5F, 0));
		
    }
 
    @Override
    public int addArmor(String armor)
    {
        return RenderingRegistry.addNewArmourRendererPrefix(armor);
    }
    
    @Override
	public void registerSound() {
		MinecraftForge.EVENT_BUS.register(new registerMullak99Sounds());
	}
    
	
	public void setupCapes()
    {
        try
        {
            mullak99.addDevCapes();
            mullak99.addTesterCapes();
            mullak99.addYoutuberCapes();
            mullak99.addDonatorCapes1();
            mullak99.addDonatorCapes2();
            mullak99.addDonatorCapes3();
            mullak99.addMelonCape();
            
            System.out.println("[mullak99's Mod 2] Done: Loaded Capes sucsessfully!");
        }
        catch (Exception e)
        {
        	System.out.println("[mullak99's Mod 2] Error: while setting up mullak99's Mod 2 capes!");
            e.printStackTrace();
        }

       
    }

}