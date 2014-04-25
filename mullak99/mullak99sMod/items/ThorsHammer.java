package mullak99.mullak99sMod.items;

import mullak99.mullakCore.HandTool;
import mullak99.mullakCore.ToolPaxel;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumMovingObjectType;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class ThorsHammer extends Hammer
{
	public ThorsHammer(int par1, EnumToolMaterial par2EnumToolMaterial, int DurabilityModifier) {
		super(par1, par2EnumToolMaterial);
		this.setMaxDamage(par2EnumToolMaterial.getMaxUses() * DurabilityModifier);
		this.canRepair = false;
	}
	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entityplayer)
        {
			if(itemstack.getItemDamage() >= 0) {
	                float f = 1.0F;
	                float f1 = entityplayer.prevRotationPitch + (entityplayer.rotationPitch - entityplayer.prevRotationPitch) * f;
	                float f2 = entityplayer.prevRotationYaw + (entityplayer.rotationYaw - entityplayer.prevRotationYaw) * f;
	                double d = entityplayer.prevPosX + (entityplayer.posX - entityplayer.prevPosX) * (double)f;
	                double d1 = (entityplayer.prevPosY + (entityplayer.posY - entityplayer.prevPosY) * (double)f + 1.6200000000000001D) - (double)entityplayer.yOffset;
	                double d2 = entityplayer.prevPosZ + (entityplayer.posZ - entityplayer.prevPosZ) * (double)f;
	                Vec3 vec3d = Vec3.createVectorHelper(d, d1, d2);
	                float f3 = MathHelper.cos(-f2 * 0.01745329F - 3.141593F);
	                float f4 = MathHelper.sin(-f2 * 0.01745329F - 3.141593F);
	                float f5 = -MathHelper.cos(-f1 * 0.01745329F);
	                float f6 = MathHelper.sin(-f1 * 0.01745329F);
	                float f7 = f4 * f5;
	                float f8 = f6;
	                float f9 = f3 * f5;
	                double d3 = 5000D;
	                Vec3 vec3d1 = vec3d.addVector((double)f7 * d3, (double)f8 * d3, (double)f9 * d3);
	                MovingObjectPosition movingobjectposition = world.rayTraceBlocks_do_do(vec3d, vec3d1, false, true);
	                
	                if (movingobjectposition == null)
	                {
	                	return itemstack;
	                }
	                if (movingobjectposition.typeOfHit == EnumMovingObjectType.TILE)
	                {
	                	int i = movingobjectposition.blockX;
	                    int j = movingobjectposition.blockY;
	                    int k = movingobjectposition.blockZ;
	                    world.spawnEntityInWorld(new EntityLightningBolt(world, i, j, k));
	                }
	                itemstack.damageItem(4, entityplayer);
			}
                return itemstack;
        }
	
	@Override
	public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10)
    {
		return true;
    }
}