package mullak99.mullak99sMod.container;

import java.util.Comparator;

import net.minecraft.item.crafting.IRecipe;

public class RecipeSorterMCrafting implements Comparator {

final MCraftingManager BigCraftingManager;

RecipeSorterMCrafting(MCraftingManager par1BigCraftingManager)
{
this.BigCraftingManager = par1BigCraftingManager;
}

public int compareRecipes(IRecipe par1IRecipe, IRecipe par2IRecipe)
{
return par1IRecipe instanceof MCraftingShapeless && par2IRecipe instanceof MCraftingShaped ? 1 : (par2IRecipe instanceof MCraftingShapeless && par1IRecipe instanceof MCraftingShaped ? -1 : (par2IRecipe.getRecipeSize() < par1IRecipe.getRecipeSize() ? -1 : (par2IRecipe.getRecipeSize() > par1IRecipe.getRecipeSize() ? 1 : 0)));
}

public int compare(Object par1Obj, Object par2Obj)
{
return this.compareRecipes((IRecipe)par1Obj, (IRecipe)par2Obj);
}
}