package mullak99.Addons.nuclear.blocks;

import java.util.Random;

import mullak99.Addons.nuclear.NuclearAddon;
import mullak99.mullak99sMod.mullak99;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class oreUranium extends Block {
	
	public oreUranium(int id, Material material) {
		super(id, material);
		
	}
	
	public int idDropped(int par1, Random par2Random, int par3) {
		return NuclearAddon.rawUranium.itemID;
	}
	public int quantityDropped(Random random) {
		return 2;
	}

}
