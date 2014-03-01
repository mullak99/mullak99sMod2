package mullak99.mullak99sMod.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import mullak99.mullak99sMod.mullak99;

public class MCraftingTable extends Block {

	@SideOnly(Side.CLIENT)
	private Icon MCraftingIconTop;
	@SideOnly(Side.CLIENT)
	private Icon MCraftingIconFront;
	@SideOnly(Side.CLIENT)
	private Icon MCraftingIconBottom;
	
	public MCraftingTable(int par1)
	{
		super(par1, Material.iron);
	}
	
	@SideOnly(Side.CLIENT)
	public Icon getIcon(int par1, int par2)
	{
		return par1 == 1 ? this.MCraftingIconTop : (par1 == 0 ? this.MCraftingIconBottom : (par1 != 2 && par1 != 4 ? this.blockIcon : this.MCraftingIconFront));
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
	{
		this.blockIcon = par1IconRegister.registerIcon("mullak99:MCrafting_Front");
		this.MCraftingIconTop = par1IconRegister.registerIcon("mullak99:MCrafting_Top");
		this.MCraftingIconFront = par1IconRegister.registerIcon("mullak99:MCrafting_Front");
		this.MCraftingIconBottom = par1IconRegister.registerIcon("mullak99:MCrafting");
	}
	
	public boolean onBlockActivated(World var1, int var2, int var3, int var4, EntityPlayer player, int var6, float var7, float var8, float var9)
	{
		if (!player.isSneaking())
	{
			player.openGui(mullak99.instance, 1, var1, var2, var3, var4);
			return true;
		}
		else
		{
			return false;
		}
		
	}
}