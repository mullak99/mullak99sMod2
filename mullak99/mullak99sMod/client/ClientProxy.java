package mullak99.mullak99sMod.client;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.ThreadDownloadImageData;
import net.minecraft.client.renderer.texture.TextureObject;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.common.MinecraftForge;
import mullak99.mullak99sMod.CommonProxy;
import mullak99.mullak99sMod.mullak99;
import mullak99.mullak99sMod.mullakUtil;
import mullak99.mullak99sMod.registerMullak99Sounds;
import mullak99.mullak99sMod.feature.AlphaTreeBonemeal;
import mullak99.mullak99sMod.gui.MCraftingGUIHandler;
import mullak99.mullak99sMod.mobs.EntitySheepOverride;
import mullak99.mullak99sMod.mobs.ProNinjaGamerMob;
import mullak99.mullak99sMod.mobs.RenderMullak99Mob;
import mullak99.mullak99sMod.mobs.RenderProNinjaGamerMob;
import mullak99.mullak99sMod.mobs.RenderThundercoyoteMob;
import mullak99.mullak99sMod.mobs.mullak99EntityPlayer;
import mullak99.mullak99sMod.mobs.mullak99Mob;
import mullak99.mullak99sMod.mobs.ThundercoyoteMob;
import mullak99.mullakCore.mullakCore;

public class ClientProxy extends CommonProxy
{
    
	@Override
    public void init(FMLInitializationEvent event)
    {
        
    }
	
    public void registerRenderInformation()
    {
    	
		MinecraftForge.EVENT_BUS.register(new registerMullak99Sounds());
		MinecraftForge.EVENT_BUS.register(new mullakCore());
		MinecraftForge.EVENT_BUS.register(new mullakUtil());
		RenderingRegistry.registerEntityRenderingHandler(mullak99Mob.class, new RenderMullak99Mob(new ModelBiped(), 0.5F, 0));
		RenderingRegistry.registerEntityRenderingHandler(ThundercoyoteMob.class, new RenderThundercoyoteMob(new ModelBiped(), 0.5F, 0));
		RenderingRegistry.registerEntityRenderingHandler(ProNinjaGamerMob.class, new RenderProNinjaGamerMob(new ModelBiped(), 0.5F, 0));
		
    }
 
    @Override
    public int addArmor(String armor)
    {
        return RenderingRegistry.addNewArmourRendererPrefix(armor);
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
            
            FMLLog.fine("[mullak99's Mod] Done: Loaded Capes Sucsessfully");
        }
        catch (Exception e)
        {
            FMLLog.severe("[mullak99's Mod] Error: while setting up mullak99's Mod capes");
            e.printStackTrace();
        }

       
    }

}