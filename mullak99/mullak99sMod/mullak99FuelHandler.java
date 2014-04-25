package mullak99.mullak99sMod;

import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.IFuelHandler;

public class mullak99FuelHandler implements IFuelHandler {

		public int getBurnTime(ItemStack fuel) {
			if(fuel.itemID == mullak99.dustCoal.itemID) {
				return 1600;
			
			}
			
			if(fuel.itemID == mullak99.dustCharcoal.itemID) {
				return 1600;
				
				}
			
			if(fuel.itemID == mullak99.redstoneBattery.itemID) {
				return 3200;
				
				}
			
			if(fuel.itemID == mullak99.BatteryEnder.itemID) {
				return 10;
				
				}
			
			if(fuel.itemID == mullak99.alphaSapling.blockID) {
				return 100;
				
				}
			if(fuel.itemID == mullak99.sulfur.itemID) {
				return 1600;
			
			}
			
			else
			return 0;

		}
}