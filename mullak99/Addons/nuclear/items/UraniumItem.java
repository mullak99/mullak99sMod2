package mullak99.Addons.nuclear.items;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import mullak99.Addons.nuclear.NuclearAddon;
import mullak99.mullak99sMod.mullak99;

public class UraniumItem extends Item {

	public UraniumItem(int par1) {
		super(par1);
	}
	
	
	public void onUpdate(ItemStack itemstack, World world, Entity entity, int par4, boolean par5)
	{
		if(NuclearAddon.UraniumEffects) {
			
			if (!world.isRemote)
			{
				EntityPlayer player = (EntityPlayer) entity;
				
				if (entity instanceof EntityPlayer)
					{
						player.addPotionEffect((new PotionEffect(Potion.poison.getId(), 2000, 5)));
						player.addPotionEffect((new PotionEffect(Potion.hunger.getId(), 2000, 5)));
						player.addPotionEffect((new PotionEffect(Potion.moveSlowdown.getId(), 2000, 3)));
						player.addPotionEffect((new PotionEffect(Potion.weakness.getId(), 2000, 2)));
						player.addPotionEffect((new PotionEffect(Potion.digSlowdown.getId(), 2000, 2)));
					}
					else
					{
						
					}
			}
		}else {
			return;
		}
		
		
	}
	
}
