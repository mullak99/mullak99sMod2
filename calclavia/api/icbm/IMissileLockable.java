package calclavia.api.icbm;

import universalelectricity.api.vector.Vector3;

/** Implement this to your entity if you want antiballistic missiles to be able to lock onto it.
 * 
 * @author Calclavia */
@Deprecated //Replaced by ITarget
public interface IMissileLockable
{
    /** Can this entity be locked on by a missile?
     * 
     * @return True if so. */
    public boolean canLock(IMissile missile);

    /** Gets the predicted position of this entity after a specified amount of ticks.
     * 
     * @param ticks - The amount of time.
     * @return The predicted Vector, or if not predictable, the current position. */
    public Vector3 getPredictedPosition(int ticks);
}
