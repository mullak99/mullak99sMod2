package mullak99.mullak99sMod.handler;

import mullak99.mullak99sMod.mullak99;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import cpw.mods.fml.common.ICraftingHandler;

public class localHandler implements ICraftingHandler {

	@Override
	public void onCrafting(EntityPlayer player, ItemStack item, IInventory craftMatrix) {
		
	for(int i = 0; i < craftMatrix.getSizeInventory(); i++) {
				
				if(craftMatrix.getStackInSlot(i) != null) {
					ItemStack j = craftMatrix.getStackInSlot(i);
					
					if(j.getItem() != null && j.getItem() == mullak99.mortarPestle) {
						ItemStack k = new ItemStack(mullak99.mortarPestle, 2, (j.getItemDamage() + 1));
						
						if(k.getItemDamage() >= k.getMaxDamage()) {
							k.stackSize--;
						}
						
						craftMatrix.setInventorySlotContents(i, k);
					}
				}
				
				if(craftMatrix.getStackInSlot(i) != null) {
					ItemStack j = craftMatrix.getStackInSlot(i);
					
					if(j.getItem() != null && j.getItem() == mullak99.mortarPestleReinf) {
						ItemStack k = new ItemStack(mullak99.mortarPestleReinf, 2, (j.getItemDamage() + 1));
						
						if(k.getItemDamage() >= k.getMaxDamage()) {
							k.stackSize--;
						}
						
						craftMatrix.setInventorySlotContents(i, k);
					}
				}
				
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
				
				if(craftMatrix.getStackInSlot(i) != null) {
					ItemStack j = craftMatrix.getStackInSlot(i);
					
					if(j.getItem() != null && j.getItem() == mullak99.steelHammer) {
						ItemStack k = new ItemStack(mullak99.steelHammer, 2, (j.getItemDamage() + 1));
						
						if(k.getItemDamage() >= k.getMaxDamage()) {
							k.stackSize--;
						}
						
						craftMatrix.setInventorySlotContents(i, k);
					}
				}
				if(craftMatrix.getStackInSlot(i) != null) {
					ItemStack j = craftMatrix.getStackInSlot(i);
					
					if(j.getItem() != null && j.getItem() == mullak99.enditeHammer) {
						ItemStack k = new ItemStack(mullak99.enditeHammer, 2, (j.getItemDamage() + 1));
						
						if(k.getItemDamage() >= k.getMaxDamage()) {
							k.stackSize--;
						}
						
						craftMatrix.setInventorySlotContents(i, k);
					}
				}
				
				/*if(craftMatrix.getStackInSlot(i) != null) {
					ItemStack j = craftMatrix.getStackInSlotOnClosing(i);
					
					if(j.getItem() != null && j.getItem() == Item.bucketEmpty) {
						ItemStack k = new ItemStack(Item.bucketEmpty, 2, (j.getItemDamage() + 1));
						
						if(j.getItem() == Item.bucketEmpty && !(j.getItem() != Item.bucketEmpty)) {
							j.stackSize--;
						}
						else {
							j.equals(i);
						}
						
						//craftMatrix.setInventorySlotContents(i, k);
					}

				}*/
				
			}
	}

	@Override
	public void onSmelting(EntityPlayer player, ItemStack item) {

	}
	
	

}
