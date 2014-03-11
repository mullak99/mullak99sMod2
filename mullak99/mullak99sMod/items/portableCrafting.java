package mullak99.mullak99sMod.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import mullak99.mullak99sMod.mullak99;

public class portableCrafting extends Item {

	public portableCrafting(int id) {
		super(id);
		
	}
	
	@Override
	public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer entityPlayer, World world, int x, int y, int z, int par7, float par8, float par9, float par10) {

		entityPlayer.displayGUIWorkbench(x, y, z);
		return false;
		 
	}

}
