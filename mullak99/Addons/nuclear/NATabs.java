package mullak99.Addons.nuclear;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class NATabs {

	public static CreativeTabs tabMullak99sNuclear = new CreativeTabs("mullak99sModNuclear") {
		public ItemStack getIconItemStack() {
			return new ItemStack(NuclearAddon.cakeUranium);	
		}
	};
}
