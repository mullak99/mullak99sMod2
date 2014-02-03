package mullak99.mullak99sMod.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class enchantedMelon extends ItemFood
{
    public enchantedMelon(int par1, int par2, float par3, boolean par4)
    {
        super(par1, par2, par3, par4);
        this.setHasSubtypes(true);
    }

    @SideOnly(Side.CLIENT)
    public boolean hasEffect(ItemStack par1ItemStack)
    {
        return par1ItemStack.getItemDamage() < 1;
    }

    @SideOnly(Side.CLIENT)

    /**
     * Return an item rarity from EnumRarity
     */
    public EnumRarity getRarity(ItemStack par1ItemStack)
    {
        return par1ItemStack.getItemDamage() == 0 ? EnumRarity.rare : EnumRarity.epic;
    }

    protected void onFoodEaten(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
        if (!par2World.isRemote)
        {
            par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.regeneration.id, 4800, 2));
            par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.resistance.id, 24000, 1));
            par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 24000, 1));
            par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 6000, 1));
            par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 6000, 1));
        }

        else
        {
            super.onFoodEaten(par1ItemStack, par2World, par3EntityPlayer);
        }
    }
    
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
    {
    par3List.add("Reference to a friend :)");
    par3List.add("");
    par3List.add("MELON");
    }

}
