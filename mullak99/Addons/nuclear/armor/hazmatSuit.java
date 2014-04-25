package mullak99.Addons.nuclear.armor;

import calclavia.api.atomicscience.IAntiPoisonArmor;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import net.minecraftforge.common.ISpecialArmor;
import mullak99.Addons.nuclear.NuclearAddon;
import mullak99.mullak99sMod.*;
import mullak99.mullakCore.IWeight;

public class hazmatSuit extends ItemArmor implements IAntiPoisonArmor {
	
	
	public hazmatSuit(int par1, EnumArmorMaterial par2EnumArmorMaterial, int par3, int par4) {
		
		super(par1, par2EnumArmorMaterial, par3, par4);
		
	}
	
	@SideOnly(Side.CLIENT)
	public String getArmorTexture(ItemStack stack, Entity entity, int slot,int layer) {
		
			if (stack.itemID == NuclearAddon.hazmatHelm.itemID || stack.itemID == NuclearAddon.hazmatChest.itemID || stack.itemID == NuclearAddon.hazmatBoots.itemID) {
				return "mullak99_Nuclear:textures/armor/hazmatSuit_1.png";
			}
			
			if (stack.itemID == NuclearAddon.hazmatLegs.itemID) {
					return "mullak99_Nuclear:textures/armor/hazmatSuit_2.png";
			} else {
				return null;
			}

	}

	@Override
	public boolean isProtectedFromPoison(ItemStack itemStack, EntityLivingBase entityLiving, String type) {
		return true;
	}

	@Override
	public void onProtectFromPoison(ItemStack itemStack, EntityLivingBase entityLiving, String type) {
		
		entityLiving.removePotionEffect(Potion.poison.getId());
		entityLiving.removePotionEffect(Potion.hunger.getId());
		entityLiving.removePotionEffect(Potion.moveSlowdown.getId());
		entityLiving.removePotionEffect(Potion.weakness.getId());
		entityLiving.removePotionEffect(Potion.digSlowdown.getId());
		
	}

	@Override
	public int getArmorType() {
		return 1;
	}
	
}