package calclavia.api.resonantinduction.mechanical;

import java.util.List;

import net.minecraft.entity.Entity;

/**
 * An interface applied to the tile entity of a conveyor belt
 * 
 * @Author DarkGuardsman
 */
public interface IBelt
{
	/**
	 * Used to get a list of entities the belt exerts an effect upon.
	 * 
	 * @return list of entities in the belts are of effect
	 */
	public List<Entity> getAffectedEntities();

	/**
	 * Adds and entity to the ignore list so its not moved has to be done every 20 ticks
	 * 
	 * @param entity
	 */
	public void ignoreEntity(Entity entity);
}
