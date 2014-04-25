package mullak99.mullak99sMod.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBucket;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class bloodBucket extends ItemBucket {

	private int liquidID;
	
	public bloodBucket(int itemID, int liquidID) {
		super(itemID, liquidID);
		
		this.liquidID = liquidID;
	}
	
	@Override
	public boolean tryPlaceContainedLiquid(World world, int x, int y, int z) {
		if(liquidID <= 0) {
			return false;
		}else if(!world.isAirBlock(x, y, z) && world.getBlockMaterial(x, y, z).isSolid()){
			return false;
		}else {
			world.setBlock(x, y, z, liquidID, 0, 3);
			return true;
		}
		
	}
	public ItemStack onEaten(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
        if (!par3EntityPlayer.capabilities.isCreativeMode)
        {
            --par1ItemStack.stackSize;
        }

        if (!par2World.isRemote)
        {
            par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.heal.id, 1, 9));
        }

        return par1ItemStack.stackSize <= 0 ? new ItemStack(Item.bucketEmpty) : par1ItemStack;
    }
    

    /**
     * How long it takes to use or consume an item
     */
    public int getMaxItemUseDuration(ItemStack par1ItemStack)
    {
        return 64;
    }
    

    /**
     * returns the action that specifies what animation to play when the items is being used
     */
    public EnumAction getItemUseAction(ItemStack par1ItemStack)
    {
        return EnumAction.drink;
    }
	
}
