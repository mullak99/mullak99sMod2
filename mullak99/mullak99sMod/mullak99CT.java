package mullak99.mullak99sMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class mullak99CT {

	public static CreativeTabs tabMullak99sModI = new CreativeTabs("mullak99sModI") {
		public ItemStack getIconItemStack() {
			return new ItemStack(mullak99.mullite);	
		}
	};
	
	public static CreativeTabs tabMullak99sModB = new CreativeTabs("mullak99sModB") {
		public ItemStack getIconItemStack() {
			return new ItemStack(mullak99.blockMullite);	
		}
	};
	
	public static CreativeTabs tabMullak99sModWP = new CreativeTabs("mullak99sModWP") {
		public ItemStack getIconItemStack() {
			return new ItemStack(mullak99.swordMulliteDE);	
		}
	};
	
	public static CreativeTabs tabMullak99sModWIP = new CreativeTabs("mullak99sModWIP") {
		public ItemStack getIconItemStack() {
			return new ItemStack(mullak99.roxite);	
		}
	};
	public static CreativeTabs tabMullak99sModFood = new CreativeTabs("mullak99sModFood") {
		public ItemStack getIconItemStack() {
			return new ItemStack(mullak99.muttonCooked);	
		}
	};
}
