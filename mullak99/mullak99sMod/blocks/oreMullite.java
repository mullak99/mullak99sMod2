package mullak99.mullak99sMod.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class oreMullite extends Block {

	public oreMullite(int id, Material material) {
		super(id, material);
		
	}
	
	public int idDropped(int par1, Random par2Random, int par3) {
		return mullak99.mullak99sMod.mullak99.mullite.itemID;
	}
	public int quantityDropped(Random random) {
		return 1;
	}

}
