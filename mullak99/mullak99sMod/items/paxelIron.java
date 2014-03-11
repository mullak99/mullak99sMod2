package mullak99.mullak99sMod.items;

import mullak99.mullakCore.ToolPaxel;
import mullak99.mullak99sMod.mullak99;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemPickaxe;

public class paxelIron extends ToolPaxel {

	public paxelIron(int par1, EnumToolMaterial par2EnumToolMaterial) {
		super(par1, par2EnumToolMaterial, 2);
		
	}

	/*@Override
	public boolean canHarvestBlock(Block par1Block)
	{
		return par1Block == Block.obsidian || par1Block == mullak99.oreMullite || par1Block == mullak99.oreRoxite || par1Block == mullak99.blockMullite || par1Block == mullak99.blockRoxite ? this.toolMaterial.getHarvestLevel() >= 3 : (par1Block != Block.workbench && par1Block != Block.fence && par1Block != Block.fenceGate ? (par1Block != Block.oreEmerald && par1Block != Block.blockEmerald ? (par1Block != Block.blockGold && par1Block != Block.oreGold ? (par1Block != Block.blockIron && par1Block != Block.oreIron ? (par1Block != Block.blockLapis && par1Block != Block.oreLapis ? (par1Block != Block.oreRedstone && par1Block != Block.oreRedstoneGlowing ? (par1Block.blockMaterial == Material.rock ? true : (par1Block.blockMaterial == Material.iron ? true : par1Block.blockMaterial == Material.anvil)) : this.toolMaterial.getHarvestLevel() >= 2) : this.toolMaterial.getHarvestLevel() >= 1) : this.toolMaterial.getHarvestLevel() >= 1) : this.toolMaterial.getHarvestLevel() >= 2) : this.toolMaterial.getHarvestLevel() >= 2) : this.toolMaterial.getHarvestLevel() >= 2);
	}*/

}
