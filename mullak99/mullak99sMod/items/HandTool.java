package mullak99.mullak99sMod.items;

import net.minecraft.block.Block;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemTool;



public class HandTool extends ItemTool {

	
	public static final Block[] blocksEffectiveAgainst = new Block[] {};
	
	public HandTool (int par1, EnumToolMaterial par2EnumToolMaterial)
	{
		super(par1, 0.0F, par2EnumToolMaterial, blocksEffectiveAgainst);
		
	}

}
