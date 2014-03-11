package mullak99.mullak99sMod.blocks;

import java.util.Random;

import mullak99.mullak99sMod.mullak99;
import net.minecraft.block.BlockHalfSlab;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.EntityLiving;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class marbleCobbleSlab extends BlockHalfSlab {

	public marbleCobbleSlab(int par1, boolean par2, Material par3Material) {
		super(par1, par2, par3Material);
		useNeighborBrightness[this.blockID] = true;
	}

	@Override
	public String getFullSlabName(int id) {
		if (id < 0) {
		id = 0;
		}
		return super.getUnlocalizedName();
		}

	public void registerIcons(IconRegister reg) {
		this.blockIcon = reg.registerIcon("mullak99:marbleCobble");
		}

		public int idDropped(int id, Random ran, int meta) {
		return mullak99.marbleCobbleSlab.blockID;

		}
		
		public void onBlockPlacedBy(World world, int x, int y, int z, EntityLiving player) {
				if (world.getBlockId(x, y - 1, z) == mullak99.marbleCobbleSlab.blockID) {
				world.setBlock(x, y, z, 0);
				world.setBlock(x, y - 1, z, mullak99.marbleCobbleSlabDouble.blockID);
				}

				if (world.getBlockId(x, y + 1, z) == mullak99.marbleCobbleSlab.blockID) {
				world.setBlock(x, y, z, 0);
				world.setBlock(x, y + 1, z, mullak99.marbleCobbleSlabDouble.blockID);
				}
				}
		
		protected ItemStack createStackedBlock(int id) {
			return new ItemStack(mullak99.marbleCobbleSlab, 2, id & 7);
			}
		
		public int idPicked(World par1World, int par2, int par3, int par4) {
			return isBlockSingleSlab(this.blockID) ? this.blockID : (this.blockID == mullak99.marbleCobbleSlabDouble.blockID ? mullak99.marbleCobbleSlab.blockID : mullak99.marbleCobbleSlab.blockID);
			}
		
		public static boolean isBlockSingleSlab(int par0) {
			return par0 == mullak99.marbleCobbleSlab.blockID;
			}
}
