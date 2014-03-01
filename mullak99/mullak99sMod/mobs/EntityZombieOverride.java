package mullak99.mullak99sMod.mobs;

import mullak99.mullak99sMod.mullak99;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class EntityZombieOverride extends EntityZombie {

	public EntityZombieOverride(World par1World) {
		super(par1World);
		// TODO Auto-generated constructor stub
	}
	
	/**
     * Returns the item ID for the item the mob drops on death.
     */
	@Override
    protected int getDropItemId()
    {
		return this.isBurning() ? mullak99.fleshCooked.itemID : Item.rottenFlesh.itemID;
        
    }

}
