package mullak99.mullak99sMod.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;

public class bootsMullite extends ItemArmor {

	public bootsMullite(int par1, EnumArmorMaterial par2EnumArmorMaterial,
			int par3, int par4) {
		super(par1, par2EnumArmorMaterial, par3, par4);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public void registerIcons(IconRegister reg) {
		this.itemIcon = reg.registerIcon("mullak99:bootsMullite");
	}


}
