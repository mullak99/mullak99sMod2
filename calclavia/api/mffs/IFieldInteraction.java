package calclavia.api.mffs;

import java.util.Set;

import calclavia.api.mffs.modules.IModule;
import calclavia.api.mffs.modules.IModuleAcceptor;
import calclavia.api.mffs.modules.IProjectorMode;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.ForgeDirection;
import universalelectricity.api.vector.Vector3;

public interface IFieldInteraction extends IModuleAcceptor, IActivatable
{
	/**
	 * Gets the mode of the projector, mainly the shape and size of it.
	 */
	public IProjectorMode getMode();

	public ItemStack getModeStack();

	/**
	 * Gets the slot IDs based on the direction given.
	 */
	public int[] getSlotsBasedOnDirection(ForgeDirection direction);

	/**
	 * Gets the unspecified, direction-unspecific module slots on the left side of the GUI.
	 */
	public int[] getModuleSlots();

	/**
	 * @param module - The module instance.
	 * @param direction - The direction facing.
	 * @return Gets the amount of modules based on the side.
	 */
	public int getSidedModuleCount(IModule module, ForgeDirection... direction);

	/**
	 * Transformation information functions. Returns CACHED information unless the cache is cleared.
	 * Note that these are all RELATIVE to the projector's position.
	 */
	public Vector3 getTranslation();

	public Vector3 getPositiveScale();

	public Vector3 getNegativeScale();

	public int getRotationYaw();

	public int getRotationPitch();

	/**
	 * * @return Gets all the absolute block coordinates that are occupying the force field.
	 */
	public Set<Vector3> getCalculatedField();

	/**
	 * Gets the absolute interior points of the projector. This might cause lag so call sparingly.
	 * 
	 * @return
	 */
	public Set<Vector3> getInteriorPoints();

	/**
	 * Force field calculation flags.
	 */
	public void setCalculating(boolean bool);

	public void setCalculated(boolean bool);

	/**
	 * @return Gets the facing direction. Always returns the front side of the block.
	 */
	public ForgeDirection getDirection();
}
