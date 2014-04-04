package mullak99.mullak99sMod.items;

import java.util.List;
import mullak99.mullak99sMod.mullak99;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class BatteryEnder extends Item {

	public BatteryEnder(int id) {
		super(id);
		
	}
	
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
    {
    par3List.add("Using the power of the End");
    }

}
