package mullak99.mullakCore;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;

public class IWeight {
	
	public int WeightModifier;
	
	public int weight = 0;
	
	public static void IWeight(int weight) {}

	private void IWeightCore(int weight) {
		
		if(weight == 1) {
			
			WeightModifier = 1;
		}
		if(weight >= 2) {
			WeightModifier = 1 * weight;
		}
		else {
			WeightModifier = 0;
		}
		
		return;
	}
	
	
	
	private float WeightModifierWorkout(EntityPlayer player) {
		
		player.getFoodStats().setFoodSaturationLevel(-WeightModifier);
		return WeightModifier;
	}
}
