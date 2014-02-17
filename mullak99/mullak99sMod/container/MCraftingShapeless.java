package mullak99.mullak99sMod.container;

import java.awt.Dimension;
import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;

import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.world.World;

public class MCraftingShapeless implements IRecipe
{
/** Is the ItemStack that you get when craft the recipe. */
private final ItemStack recipeOutput;

/** Is a List of ItemStack that composes the recipe. */
public final ArrayList recipeItems;

public MCraftingShapeless(ItemStack par1ItemStack, ArrayList var3)
{
this.recipeOutput = par1ItemStack;
this.recipeItems = var3;
}

public ItemStack getRecipeOutput()
{
return this.recipeOutput;
}

/**
* Used to check if a recipe matches current crafting inventory
*/
public boolean matches(InventoryCrafting par1InventoryCrafting, World par2World)
{
ArrayList arraylist = new ArrayList();

for (int i = 0; i < 5; ++i)
{
for (int j = 0; j < 3; ++j)
{
ItemStack itemstack = par1InventoryCrafting.getStackInRowAndColumn(j, i);

if (itemstack != null)
{
boolean flag = false;
Iterator iterator = arraylist.iterator();

while (iterator.hasNext())
{
ItemStack itemstack1 = (ItemStack)iterator.next();

if (itemstack.itemID == itemstack1.itemID && (itemstack1.getItemDamage() == 32767 || itemstack.getItemDamage() == itemstack1.getItemDamage()))
{
flag = true;
arraylist.remove(itemstack1);
break;
}
}

if (!flag)
{
return false;
}
}
}
}

return arraylist.isEmpty();
}

/**
* Returns an Item that is the result of this recipe
*/
public ItemStack getCraftingResult(InventoryCrafting par1InventoryCrafting)
{
return this.recipeOutput.copy();
}

@Override
public int getRecipeSize() {
	return this.recipeItems.size();
}

}