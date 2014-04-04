package mullak99.mullak99sMod.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import mullak99.mullak99sMod.mullak99;
import mullak99.mullak99sMod.mullak99Util;

public class portableCrafting extends Item {

	public portableCrafting(int id) {
		super(id);
		
	}
	
	 @Override
	 public ItemStack onItemRightClick(ItemStack ItemStack, World world, EntityPlayer player)
	    {
		 if(world.isRemote) {
	        mullak99Util.setBoolean(ItemStack, mullak99Util.NBT_ITEM_CRAFTING_GUI_OPEN, true);
		 	player.openGui(mullak99.instance, mullak99Util.PortableCrafting, player.worldObj, (int) player.posX, (int) player.posY, (int) player.posZ);
		 }
		 return ItemStack;
	    }

}
