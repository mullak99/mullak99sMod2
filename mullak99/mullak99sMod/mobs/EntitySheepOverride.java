package mullak99.mullak99sMod.mobs;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.item.Item;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import mullak99.mullak99sMod.mullak99;
import mullak99.mullakCore.mullakCore;

public class EntitySheepOverride extends Entity{
	
	public EntitySheepOverride(World par1World) {
		super(par1World);
		// TODO Auto-generated constructor stub
	}

	public static double rand;
	
	@ForgeSubscribe
	public void LivingDropsEvent(LivingDropsEvent event)
	{
		if(this.isBurning())
            {
                this.dropItem(mullak99.muttonCooked.itemID, mullakCore.randomWithRange(1, 2));
            }
		else if(!this.isBurning()) {
			if(event.entityLiving instanceof EntitySheep)
			{
				event.entityLiving.dropItem(mullak99.muttonRaw.itemID, mullakCore.randomWithRange(1, 2));
			}
		}
	}




	@Override
	protected void entityInit() {
		// TODO Auto-generated method stub
		
	}




	@Override
	protected void readEntityFromNBT(NBTTagCompound nbttagcompound) {
		// TODO Auto-generated method stub
		
	}




	@Override
	protected void writeEntityToNBT(NBTTagCompound nbttagcompound) {
		// TODO Auto-generated method stub
		
	}
}
