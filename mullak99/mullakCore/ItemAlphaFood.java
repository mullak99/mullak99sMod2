package mullak99.mullakCore;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemAlphaFood extends ItemFood
	{
	    /** Number of ticks to run while 'EnumAction'ing until result. */
	    public final int itemUseDuration;

	    /** The amount this food item heals the player. */
	    private final int healAmount;
	    private final float saturationModifier;

	    /** Whether wolves like this food (true for raw and cooked porkchop). */
	    private final boolean isWolfsFavoriteMeat;

	    /**
	     * If this field is true, the food can be consumed even if the player don't need to eat.
	     */
	    private boolean alwaysEdible;

	    /**
	     * represents the potion effect that will occurr upon eating this food. Set by setPotionEffect
	     */
	    private int potionId;

	    /** set by setPotionEffect */
	    private int potionDuration;

	    /** set by setPotionEffect */
	    private int potionAmplifier;

	    /** probably of the set potion effect occurring */
	    private float potionEffectProbability;

	    public ItemAlphaFood(int par1, int par2, float par3, boolean par4)
	    {
	        super(par1, par2, par4);
	        this.itemUseDuration = 0;
	        this.healAmount = par2;
	        this.isWolfsFavoriteMeat = par4;
	        this.saturationModifier = par3;
	        this.setCreativeTab(CreativeTabs.tabFood);
	    }

	    public ItemAlphaFood(int par1, int par2, boolean par3)
	    {
	        this(par1, par2, 0.6F, par3);
	    }

	    public ItemStack onEaten(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	    {
	        --par1ItemStack.stackSize;
	        par3EntityPlayer.getFoodStats().addStats(this);
	        this.onFoodEaten(par1ItemStack, par2World, par3EntityPlayer);
	        return par1ItemStack;
	    }

	    protected void onFoodEaten(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	    {
	        if (!par2World.isRemote && this.potionId > 0 && par2World.rand.nextFloat() < this.potionEffectProbability)
	        {
	            par3EntityPlayer.addPotionEffect(new PotionEffect(this.potionId, this.potionDuration * 20, this.potionAmplifier));
	        }
	    }

	    /**
	     * How long it takes to use or consume an item
	     */
	    public int getMaxItemUseDuration(ItemStack par1ItemStack)
	    {
	        return 1;
	    }

	    /**
	     * returns the action that specifies what animation to play when the items is being used
	     */
	    public EnumAction getItemUseAction(ItemStack par1ItemStack)
	    {
	        return EnumAction.none;
	    }

	    /**
	     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
	     */
	    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	    {
	        if (par3EntityPlayer.canEat(this.alwaysEdible))
	        {
	            par3EntityPlayer.setItemInUse(par1ItemStack, this.getMaxItemUseDuration(par1ItemStack));
	        }

	        return par1ItemStack;
	    }

	    public int getHealAmount()
	    {
	        return this.healAmount;
	    }

	    /**
	     * gets the saturationModifier of the ItemFood
	     */
	    public float getSaturationModifier()
	    {
	        return this.saturationModifier;
	    }

	    /**
	     * Whether wolves like this food (true for raw and cooked porkchop).
	     */
	    public boolean isWolfsFavoriteMeat()
	    {
	        return this.isWolfsFavoriteMeat;
	    }

	    /**
	     * sets a potion effect on the item. Args: int potionId, int duration (will be multiplied by 20), int amplifier,
	     * float probability of effect happening
	     */
	    public ItemAlphaFood setPotionEffect(int par1, int par2, int par3, float par4)
	    {
	        this.potionId = par1;
	        this.potionDuration = par2;
	        this.potionAmplifier = par3;
	        this.potionEffectProbability = par4;
	        return this;
	    }

	    /**
	     * Set the field 'alwaysEdible' to true, and make the food edible even if the player don't need to eat.
	     */
	    public ItemAlphaFood setAlwaysEdible()
	    {
	        this.alwaysEdible = true;
	        return this;
	    }
	

}
