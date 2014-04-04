package mullak99.mullak99sMod.fluid;

import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

public class bloodFluid extends Fluid {

    public bloodFluid() {
            super("blood");
            this.setDensity(10);
            this.setViscosity(2500);
            FluidRegistry.registerFluid(this);
     }
}