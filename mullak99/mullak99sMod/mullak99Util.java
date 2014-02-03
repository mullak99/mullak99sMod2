package mullak99.mullak99sMod;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import mullak99.mullak99sMod.client.ClientProxy;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.renderer.ThreadDownloadImageData;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.client.renderer.texture.TextureObject;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatMessageComponent;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StringUtils;
import net.minecraft.world.World;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.client.multiplayer.NetClientHandler;
import net.minecraft.client.renderer.IImageBuffer;
import net.minecraft.client.renderer.ThreadDownloadImageData;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.entity.player.EnumStatus;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.util.DamageSource;
import net.minecraft.util.Icon;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Session;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class mullak99Util extends EntityClientPlayerMP {
	
	
	public mullak99Util(Minecraft par1Minecraft, World par2World,
			Session par3Session, NetClientHandler par4NetClientHandler) {
		super(par1Minecraft, par2World, par3Session, par4NetClientHandler);
		
	}

	private ResourceLocation mullak99sModCape;
    private ThreadDownloadImageData mullak99sModCapeImageData;
	
	@Override
    protected void setupCustomSkin()
    {
        super.setupCustomSkin();

        this.mullak99sModCape = AbstractClientPlayer.getLocationCape(this.username);
        this.mullak99sModCapeImageData = mullak99Util.getImageData(this.mullak99sModCape, mullak99Util.getCapeURL(this.username), null, null);
        
    }

	public static String getCapeURL(String par0Str)
    {
        return ClientProxy.capeMap.get(par0Str);
    }

    private static ThreadDownloadImageData getImageData(ResourceLocation par0ResourceLocation, String par1Str, ResourceLocation par2ResourceLocation, IImageBuffer par3IImageBuffer)
    {
        TextureManager texturemanager = Minecraft.getMinecraft().getTextureManager();

        ThreadDownloadImageData object = new ThreadDownloadImageData(par1Str, par2ResourceLocation, par3IImageBuffer);
        texturemanager.loadTexture(par0ResourceLocation, object);

        return object;
    }

    @Override
    public ResourceLocation getLocationCape()
    {
        if (!this.getTextureCape().isTextureUploaded())
        {
            return super.getLocationCape();
        }

        return this.mullak99sModCape;
    }

    @Override
    public ThreadDownloadImageData getTextureCape()
    {
        if (!this.mullak99sModCapeImageData.isTextureUploaded())
        {
            return super.getTextureCape();
        }

        return this.mullak99sModCapeImageData;
    }
}