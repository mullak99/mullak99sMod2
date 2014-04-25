package mullak99.mullak99sMod.items;

import java.util.List;

import mullak99.mullakCore.HandTool;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

public class stickUranium extends HandTool {

	
	public stickUranium(int par1, EnumToolMaterial par2EnumToolMaterial) {
		super(par1, par2EnumToolMaterial);
		this.canRepair = true;
	}
	
	@Override
	public boolean hitEntity(ItemStack par1ItemStack, EntityLivingBase par2EntityLivingBase, EntityLivingBase par3EntityLivingBase)
	        { 
	                par1ItemStack.damageItem(1, par2EntityLivingBase);
	                par2EntityLivingBase.addPotionEffect((new PotionEffect(Potion.poison.getId(), 2000, 5)));
	                par2EntityLivingBase.addPotionEffect((new PotionEffect(Potion.hunger.getId(), 2000, 5)));
	                par2EntityLivingBase.addPotionEffect((new PotionEffect(Potion.moveSlowdown.getId(), 2000, 3)));
	                par2EntityLivingBase.addPotionEffect((new PotionEffect(Potion.weakness.getId(), 2000, 2)));
	                return true;
	        }
	
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
    {
    par3List.add("Uranium-Tipped");
    }

}
