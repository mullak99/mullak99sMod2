package mullak99.mullakCore;

import net.minecraft.block.Block;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumHelper;


public class HandTool extends ItemTool {

	
	public static EnumToolMaterial nullTool = EnumHelper.addToolMaterial("Null", 1, 1, 1.0F, 1, 1);

	public static final Block[] blocksEffectiveAgainst = new Block[] {};

	public HandTool (int par1, EnumToolMaterial par2EnumToolMaterial)
	{
		super(par1, 0.0F, par2EnumToolMaterial, blocksEffectiveAgainst);
		this.setMaxStackSize(1);

	}
	
	@Override
    public boolean hitEntity(ItemStack par1ItemStack, EntityLivingBase par2EntityLivingBase, EntityLivingBase par3EntityLivingBase)
    {
        return true;
    }

	@Override
    public boolean onBlockDestroyed(ItemStack par1ItemStack, World par2World, int par3, int par4, int par5, int par6, EntityLivingBase par7EntityLivingBase)
    {
        return true;
    }

}