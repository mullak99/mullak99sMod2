package mullak99.mullak99sMod.items;

import net.minecraft.item.ItemBucket;
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
	
}
