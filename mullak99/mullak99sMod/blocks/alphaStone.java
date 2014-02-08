package mullak99.mullak99sMod.blocks;

import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

public class alphaStone extends Block {

	public alphaStone(int id, Material material) {
		super(id, material);
	
		
		
		
	}
	
	public int idDropped(int par1, Random par2Random, int par3) {
		return mullak99.mullak99sMod.mullak99.alphaCobble.blockID;
	}
	public int quantityDropped(Random random) {
		return 1;
	}
	
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
    {
    par3List.add("Unused until Alpha Dimention is created");
    }
}