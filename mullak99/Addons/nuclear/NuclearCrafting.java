package mullak99.Addons.nuclear;

import mullak99.mullak99sMod.mullak99;
import mullak99.mullak99sMod.container.MCraftingManager;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

public class NuclearCrafting {
	
	public static void Recipes () {

		//Items
		
		GameRegistry.addRecipe(new ItemStack(NuclearAddon.cakeUranium), "UUU", "UUU", "UUU",
				'U', NuclearAddon.rawUranium);
		
		GameRegistry.addRecipe(new ItemStack(NuclearAddon.stickUranium), "-", "U",
				'-', Item.stick, 'U', NuclearAddon.cakeUranium);
		
		
		//Blocks
		
		GameRegistry.addRecipe(new ItemStack(NuclearAddon.glassUranium, 8), "GGG", "GUG", "GGG",
				'G', mullak99.clearGlass, 'U', NuclearAddon.cakeUranium);
		
		
		//Essence Extractor
		
		
		
		
		
		//Mortar and Pestle
		
		
		//Reinforced Mortar and Pestle
		
		
		//Food
		
		
		//Drink
		
		
		
		//Tools
		
		
		
	
		//Crafting | MCrafting
		
		
			
		//Repair | MCrafting
		
		
		
		//Ender Battery
		
		
		
		//Smelting
		GameRegistry.addSmelting(NuclearAddon.oreUranium.blockID, new ItemStack(NuclearAddon.rawUranium, 2, 0), 0F);
		
	}

}
