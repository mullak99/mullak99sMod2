package mullak99.mullak99sMod.items;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumHelper;
import mullak99.mullakCore.HandTool;

public class Hammer extends ItemTool {


	public static final Block[] blocksEffectiveAgainst = new Block[] {Block.grass, Block.dirt, Block.stone, Block.cobblestone, Block.sand, Block.gravel, Block.grass};

	public Hammer (int par1, EnumToolMaterial par2EnumToolMaterial)
	{
		super(par1, 0.0F, par2EnumToolMaterial, blocksEffectiveAgainst);
		this.setMaxStackSize(1);

	}
	
	@Override
    public boolean canHarvestBlock(Block par1Block)
    {
        return par1Block == Block.stone && par1Block == Block.cobblestone && par1Block == Block.sand && par1Block == Block.gravel && par1Block == Block.grass && par1Block == Block.dirt;
    }
	
	@Override
    public float getStrVsBlock(ItemStack par1ItemStack, Block par2Block)
    {
        return par2Block != null && (par2Block.blockMaterial == Material.iron || par2Block.blockMaterial == Material.anvil || par2Block.blockMaterial == Material.rock) ? this.efficiencyOnProperMaterial : super.getStrVsBlock(par1ItemStack, par2Block);
    }
	
	

}

	

