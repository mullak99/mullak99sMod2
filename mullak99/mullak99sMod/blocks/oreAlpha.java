package mullak99.mullak99sMod.blocks;

import java.util.Random;

import mullak99.mullak99sMod.mullak99;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class oreAlpha extends Block {
	
	public oreAlpha(int id, Material material) {
		super(id, material);
		
	}
	
	public int idDropped(int par1, Random par2Random, int par3) {
		return mullak99.dustAlpha.itemID;
	}
	public int quantityDropped(Random random) {
		return 8;
	}

}
