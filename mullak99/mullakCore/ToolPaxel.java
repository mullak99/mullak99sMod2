package mullak99.mullakCore;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.world.World;

public class ToolPaxel extends ItemTool {
	
	public int torchID = Block.torchWood.blockID;
	
	
	/** an array of the blocks this pickaxe is effective against */
	public static final Block[] blocksEffectiveAgainst = new Block[] {Block.planks, Block.bookShelf, Block.wood, Block.chest, Block.stoneDoubleSlab, Block.stoneSingleSlab, Block.pumpkin, Block.pumpkinLantern, Block.grass, Block.dirt, Block.sand, Block.gravel, Block.snow, Block.blockSnow, Block.blockClay, Block.tilledField, Block.slowSand, Block.mycelium, Block.cobblestone, Block.stoneDoubleSlab, Block.stoneSingleSlab, Block.stone, Block.sandStone, Block.cobblestoneMossy, Block.oreIron, Block.blockIron, Block.oreCoal, Block.blockGold, Block.oreGold, Block.oreDiamond, Block.blockDiamond, Block.ice, Block.netherrack, Block.oreLapis, Block.blockLapis, Block.oreRedstone, Block.oreRedstoneGlowing, Block.rail, Block.railDetector, Block.railPowered, Block.railActivator};
	
	
	public ToolPaxel (int par1, EnumToolMaterial par2EnumToolMaterial, int DurabilityModifier)
	{
		super(par1, 2.0F, par2EnumToolMaterial, blocksEffectiveAgainst);
		this.setMaxDamage(par2EnumToolMaterial.getMaxUses() * DurabilityModifier);
		this.setMaxStackSize(1);
		this.setCreativeTab(CreativeTabs.tabTools);
		
	}

	
	public boolean canHarvestBlock(Block par1Block)
	{
		return null != null;
	}
	
	public float getStrVsBlock(ItemStack par1ItemStack, Block par2Block)
	{
		return par2Block != null && (par2Block.blockMaterial == Material.iron || par2Block.blockMaterial == Material.wood || par2Block.blockMaterial == Material.web || par2Block.blockMaterial == Material.anvil || par2Block.blockMaterial == Material.rock) ? this.efficiencyOnProperMaterial : super.getStrVsBlock(par1ItemStack, par2Block);
	}
	
	public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10)
    {
    	int ItemToConsume = Block.torchWood.blockID;
    	boolean flag = par2EntityPlayer.capabilities.isCreativeMode;
    	boolean hasTorchInInventory = flag || par2EntityPlayer.inventory.hasItem(ItemToConsume);
    	
    	if(hasTorchInInventory)
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
	        else if (par5 == 255 && Block.blocksList[this.torchID].blockMaterial.isSolid())
	        {
	            return false;
	        }
	        else if (par3World.canPlaceEntityOnSide(this.torchID, par4, par5, par6, false, par7, par2EntityPlayer, par1ItemStack))
	        {
	            Block block = Block.blocksList[this.torchID];
	            int j1 = this.getMetadata(par1ItemStack.getItemDamage());
	            int k1 = Block.blocksList[this.torchID].onBlockPlaced(par3World, par4, par5, par6, par7, par8, par9, par10, j1);

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
    
    /**
     * Called to actually place the block, after the location is determined
     * and all permission checks have been made.
     *
     * @param stack The item stack that was used to place the block. This can be changed inside the method.
     * @param player The player who is placing the block. Can be null if the block is not being placed by a player.
     * @param side The side the player (or machine) right-clicked on.
     */
    public boolean placeBlockAt(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ, int metadata)
    {
       if (!world.setBlock(x, y, z, this.torchID, metadata, 3))
       {
           return false;
       }

       if (world.getBlockId(x, y, z) == this.torchID)
       {
           Block.blocksList[this.torchID].onBlockPlacedBy(world, x, y, z, player, stack);
           Block.blocksList[this.torchID].onPostBlockPlaced(world, x, y, z, metadata);
       }

       return true;
    }

}
