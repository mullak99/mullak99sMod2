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
import mullak99.mullak99sMod.registerMullak99Sounds;
import mullak99.mullak99sMod.mobs.RenderMullak99Mob;
import mullak99.mullak99sMod.mobs.mullak99Mob;

public class ClientProxy extends CommonProxy
{
    
	@Override
    public void init(FMLInitializationEvent event)
    {
        ClientProxy.setupCapes();
    }
	
	public static Map<String, String> capeMap = new HashMap<String, String>();
	
	
	
    public void registerRenderInformation()
    {
    	
		RenderingRegistry.registerEntityRenderingHandler(mullak99Mob.class, new RenderMullak99Mob(new ModelBiped(), 0.4F, 0));
		MinecraftForge.EVENT_BUS.register(new registerMullak99Sounds());
    }
 
    @Override
    public int addArmor(String armor)
    {
        return RenderingRegistry.addNewArmourRendererPrefix(armor);
    }
    
	
	public static void setupCapes()
    {
        try
        {
            ClientProxy.updateCapeList();
        }
        catch (Exception e)
        {
            FMLLog.severe("Error while setting up mullak99's Mod donor capes");
            e.printStackTrace();
        }

       
    }

    private static void updateCapeList() throws Exception
    {
        int timeout = 10000;
        URL capeListUrl = new URL("https://raw.github.com/mullak99/mullak99sMod2/master/capes.txt");
        URLConnection connection = capeListUrl.openConnection();
        connection.setConnectTimeout(timeout);
        connection.setReadTimeout(timeout);
        InputStream stream = connection.getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(stream));

        String line;
        while ((line = reader.readLine()) != null)
        {
            if (line.contains(":"))
            {
                int splitLocation = line.indexOf(":");
                String username = line.substring(0, splitLocation);
                String capeUrl = "https://raw.github.com/mullak99/mullak99sMod2/master/capes" + line.substring(splitLocation + 1) + ".png";
                ClientProxy.capeMap.put(username, capeUrl);
            }
        }
    }
}