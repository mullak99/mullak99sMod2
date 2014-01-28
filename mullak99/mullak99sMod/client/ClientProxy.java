package mullak99.mullak99sMod.client;

import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraftforge.client.MinecraftForgeClient;
import mullak99.mullak99sMod.CommonProxy;
import mullak99.mullak99sMod.mullak99;

public class ClientProxy extends CommonProxy
{
    @Override
    public void registerRenderInformation()
    {
        
    }
 
    @Override
    public int addArmor(String armor)
    {
        return RenderingRegistry.addNewArmourRendererPrefix(armor);
    }
}