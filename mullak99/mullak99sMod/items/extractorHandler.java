package mullak99.mullak99sMod.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.ICraftingHandler;
import mullak99.mullak99sMod.mullak99;

public class extractorHandler implements ICraftingHandler {

	@Override
	public void onCrafting(EntityPlayer player, ItemStack item, IInventory craftMatrix) {
		for(int i = 0; i < craftMatrix.getSizeInventory(); i++) {
			
			if(craftMatrix.getStackInSlot(i) != null) {
				ItemStack j = craftMatrix.getStackInSlot(i);
				
				if(j.getItem() != null && j.getItem() == mullak99.essenceExtractor) {
					ItemStack k = new ItemStack(mullak99.essenceExtractor, 2, (j.getItemDamage() + 1));
					
					if(k.getItemDamage() >= k.getMaxDamage()) {
						k.stackSize--;
					}
					
					craftMatrix.setInventorySlotContents(i, k);
				}
			}
		}
	}	

	@Override
	public void onSmelting(EntityPlayer player, ItemStack item) {
		
		
	}

}
