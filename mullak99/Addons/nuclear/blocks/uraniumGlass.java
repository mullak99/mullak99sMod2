package mullak99.Addons.nuclear.blocks;

import java.util.Random;

import mullak99.Addons.nuclear.NATabs;
import mullak99.Addons.nuclear.NuclearAddon;
import mullak99.mullak99sMod.mullak99;
import mullak99.mullak99sMod.mullak99CT;
import net.minecraft.block.BlockBreakable;
import net.minecraft.block.material.Material;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class uraniumGlass extends BlockBreakable
{
    public uraniumGlass(int par1, Material par2Material, boolean par3)
    {
        super(par1, "mullak99_nuclear:glassUranium", par2Material, par3);
        this.setCreativeTab(NATabs.tabMullak99sNuclear);
    }

    /**
     * Returns the quantity of items to drop on block destruction.
     */
    public int quantityDropped(Random par1Random)
    {
        return 1;
    }
    public int idDropped(int par1, Random par2Random, int par3)
    {
        return NuclearAddon.glassUranium.blockID;
    }
    @SideOnly(Side.CLIENT)

    /**
     * Returns which pass should this block be rendered on. 0 for solids and 1 for alpha
     */
    public int getRenderBlockPass()
    {
        return 1;
    }

    /**
     * Is this block (a) opaque and (b) a full 1m cube?  This determines whether or not to render the shared face of two
     * adjacent blocks and also whether the player can attach torches, redstone wire, etc to this block.
     */
    public boolean isOpaqueCube()
    {
        return false;
    }

    /**
     * If this block doesn't render as an ordinary block it will return False (examples: signs, buttons, stairs, etc)
     */
    public boolean renderAsNormalBlock()
    {
        return false;
    }

    /**
     * Return true if a player with Silk Touch can harvest this block directly, and not its normal drops.
     */
    protected boolean canSilkHarvest()
    {
        return true;
    }
}
