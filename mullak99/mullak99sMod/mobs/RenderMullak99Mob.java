package mullak99.mullak99sMod.mobs;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;


public class RenderMullak99Mob extends RenderBiped {

	public static ResourceLocation texture = new ResourceLocation("mullak99:textures/mob/mullak99.png");
	
	public RenderMullak99Mob(ModelBiped modelBiped, float par2, float par3)
    {
        super(modelBiped, par2);
        this.modelBipedMain = modelBiped;
        this.field_77070_b = par3;
        this.func_82421_b();
	}
	
	
	public void Rendermullak99Mob(mullak99Mob par1, double par2, double par4, double par6, float par8, float par9)
	{
	super.doRenderLiving(par1, par2, par4, par6, par8, par9);
	}

	public void doRenderLiving(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9)
	{
	this.Rendermullak99Mob((mullak99Mob)par1EntityLiving, par2, par4, par6, par8, par9);
	}

	public void domullak99Mob(mullak99Mob var1, double var2, double var4, double var6, float var8, float var9)
	{
	this.Rendermullak99Mob((mullak99Mob)var1, var2, var4, var6, var8, var9);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
	return texture;
	}
	
	protected void renderLabel(mullak99Mob mullak99EntityLiving, double par2, double par4, double par6)
	{
	int distanceToEntity = 32;
	this.renderLivingLabel(mullak99EntityLiving, mullak99EntityLiving.getDisplayName(), par2, par4, par6, distanceToEntity);
	par4 += (double)((float)this.getFontRendererFromRenderManager().FONT_HEIGHT * 1.15F * par6);
	}

	protected void passSpecialRender(EntityLivingBase par1EntityLiving, double par2, double par4, double par6)
	{
	this.renderLabel((mullak99Mob)par1EntityLiving, par2, par4, par6);
	}
	
}
