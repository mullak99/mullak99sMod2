package mullak99.mullakCore.Base;

import java.util.Random;

import mullak99.mullak99sMod.mullak99;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class CoreOre extends Block {

	private static int dropped;
	private static int quantityDropped;
	
	public CoreOre(int id, int dropped, int quantityDropped, Material material) {
		super(id, material);
		
	}
	
	public int idDropped(int par1, Random par2Random, int par3) {
		return dropped;
	}
	public int quantityDropped(Random random) {
		return quantityDropped;
	}

}
