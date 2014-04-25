package mullak99.mullak99sMod.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.world.World;

public class endite extends Item {

	public endite(int par1) {
		super(par1);
	}
	
	
	public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10) {
        if(par1ItemStack.getItemDamage() == 3) {

        	par2EntityPlayer.addChatMessage("An unknown force teleported you");
                ChunkCoordinates coordinates = par2EntityPlayer.getBedLocation(0);

                coordinates = par3World.getSpawnPoint();

                par2EntityPlayer.setPosition((double) coordinates.posX + 0.5D, (double) coordinates.posY + 3, (double) coordinates.posZ + 0.5D);

        }

        return false;
}

}
