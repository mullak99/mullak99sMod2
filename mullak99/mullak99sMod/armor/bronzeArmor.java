package mullak99.mullak99sMod.armor;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import mullak99.mullak99sMod.*;


public class bronzeArmor extends ItemArmor {
	
	
	public bronzeArmor(int par1, EnumArmorMaterial par2EnumArmorMaterial, int par3, int par4) {
		
		super(par1, par2EnumArmorMaterial, par3, par4);
		
	}
	
	@SideOnly(Side.CLIENT)
	public String getArmorTexture(ItemStack stack, Entity entity, int slot,int layer) {
		
			if (stack.itemID == mullak99.helmetBronze.itemID || stack.itemID == mullak99.chestBronze.itemID || stack.itemID == mullak99.bootsBronze.itemID) {
				return "mullak99:textures/armor/bronzeArmor_1.png";
			}
			
			if (stack.itemID == mullak99.legsBronze.itemID) {
					return "mullak99:textures/armor/bronzeArmor_2.png";
			} else {
				return null;
			}

	}
}