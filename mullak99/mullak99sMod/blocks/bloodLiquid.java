package mullak99.mullak99sMod.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class bloodLiquid extends BlockFluidClassic {

	public bloodLiquid(int id, Fluid fluid, Material material) {
		super(id, fluid, material);
	}

	@SideOnly(Side.CLIENT)
    protected Icon stillIcon;
    @SideOnly(Side.CLIENT)
    protected Icon flowingIcon;
    

	
	@Override
    public Icon getIcon(int side, int meta) {
            return (side == 0 || side == 1)? stillIcon : flowingIcon;
    }
    
    @SideOnly(Side.CLIENT)
    @Override
    public void registerIcons(IconRegister register) {
            stillIcon = register.registerIcon("mullak99:bloodStill");
            flowingIcon = register.registerIcon("mullak99:bloodFlow");
    }
    


}
