package mullak99.mullak99sMod.mobs;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;


public class RenderMullak99Mob extends RenderBiped {

	public static ResourceLocation texture = new ResourceLocation("mullak99:textures/mob/mullak99.png");
	
	public RenderMullak99Mob(ModelBiped par1, float par2, float par3)
    {
        super(par1, par2);
        this.modelBipedMain = par1;
        this.field_77070_b = par3;
        this.func_82421_b();
	}
	
	
	@SuppressWarnings(value = { "RenderMullak99Mob" })
	public void RenderMullak99Mob(mullak99Mob par1, double par2, double par4, double par6, float par8, float par9)
	{
	super.doRenderLiving(par1, par2, par4, par6, par8, par9);
	}

	public void doRenderLiving(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9)
	{
	this.RenderMullak99Mob((mullak99Mob)par1EntityLiving, par2, par4, par6, par8, par9);
	}

	public void doMullak99Mob(mullak99Mob var1, double var2, double var4, double var6, float var8, float var9)
	{
	this.RenderMullak99Mob((mullak99Mob)var1, var2, var4, var6, var8, var9);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
	return texture;
	}
	
}
