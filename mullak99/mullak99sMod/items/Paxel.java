package mullak99.mullak99sMod.items;

import mullak99.mullakCore.ToolPaxel;
import mullak99.mullak99sMod.mullak99;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class Paxel extends ToolPaxel {

	public Paxel(int par1, EnumToolMaterial par2EnumToolMaterial) {
		super(par1, par2EnumToolMaterial, 2);
		this.canRepair = true;
		
	}

	@Override
	public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10)
    {
    	int ItemToConsume = Block.torchWood.blockID;
    	boolean flag = par2EntityPlayer.capabilities.isCreativeMode;
    	boolean hasItemInInventory = flag || par2EntityPlayer.inventory.hasItem(ItemToConsume);
    	
    	if(mullak99.TorchPlacement && hasItemInInventory)
    	{
	        int i1 = par3World.getBlockId(par4, par5, par6);

	        if (i1 == Block.snow.blockID && (par3World.getBlockMetadata(par4, par5, par6) & 7) < 1)
	        {
	            par7 = 1;
	        }
	        else if (i1 != Block.vine.blockID && i1 != Block.tallGrass.blockID && i1 != Block.deadBush.blockID
	                && (Block.blocksList[i1] == null || !Block.blocksList[i1].isBlockReplaceable(par3World, par4, par5, par6)))
	        {
	            if (par7 == 0)
	            {
	                --par5;
	            }

	            if (par7 == 1)
	            {
	                ++par5;
	            }

	            if (par7 == 2)
	            {
	                --par6;
	            }

	            if (par7 == 3)
	            {
	                ++par6;
	            }

	            if (par7 == 4)
	            {
	                --par4;
	            }

	            if (par7 == 5)
	            {
	                ++par4;
	            }
	        }

	        if (par1ItemStack.stackSize == 0)
	        {
	            return false;
	        }
	        else if (!par2EntityPlayer.canPlayerEdit(par4, par5, par6, par7, par1ItemStack))
	        {
	            return false;
	        }
	        else if (par5 == 255 && Block.blocksList[ItemToConsume].blockMaterial.isSolid())
	        {
	            return false;
	        }
	        else if (par3World.canPlaceEntityOnSide(ItemToConsume, par4, par5, par6, false, par7, par2EntityPlayer, par1ItemStack))
	        {
	            Block block = Block.blocksList[ItemToConsume];
	            int j1 = this.getMetadata(par1ItemStack.getItemDamage());
	            int k1 = Block.blocksList[ItemToConsume].onBlockPlaced(par3World, par4, par5, par6, par7, par8, par9, par10, j1);

	            if (placeBlockAt(par1ItemStack, par2EntityPlayer, par3World, par4, par5, par6, par7, par8, par9, par10, k1))
	            {
	                par3World.playSoundEffect((double)((float)par4 + 0.5F), (double)((float)par5 + 0.5F), (double)((float)par6 + 0.5F), block.stepSound.getPlaceSound(), (block.stepSound.getVolume() + 1.0F) / 2.0F, block.stepSound.getPitch() * 0.8F);
	                if (!flag)
	                {
	                    par2EntityPlayer.inventory.consumeInventoryItem(ItemToConsume);
	                }
	            }

	            return true;
	        }
	        else
	        {
	            return false;
	        }
    	}else{
    		return false;
    	}
    }
}
