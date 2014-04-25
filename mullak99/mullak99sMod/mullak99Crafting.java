package mullak99.mullak99sMod;

import mullak99.mullak99sMod.container.MCraftingManager;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

public class mullak99Crafting {
	
	public static void Recipes () {

		//Crafting
		
		//Blocks
		GameRegistry.addRecipe(new ItemStack(mullak99.blockMullite), "MMM", "MMM", "MMM",
				'M', mullak99.mullite);
		GameRegistry.addShapelessRecipe(new ItemStack(mullak99.mullite, 9), mullak99.blockMullite);
		
		GameRegistry.addRecipe(new ItemStack(mullak99.blockRoxite), "RRR", "RRR", "RRR",
				'R', mullak99.roxite);
		GameRegistry.addShapelessRecipe(new ItemStack(mullak99.roxite, 9), mullak99.blockRoxite);
	
		GameRegistry.addRecipe(new ItemStack(mullak99.blockCopper), "CCC", "CCC", "CCC",
				'C', mullak99.ingotCopper);
		GameRegistry.addShapelessRecipe(new ItemStack(mullak99.ingotCopper, 9), mullak99.blockCopper);
	
		GameRegistry.addRecipe(new ItemStack(mullak99.blockTin), "TTT", "TTT", "TTT",
				'T', mullak99.ingotTin);
		GameRegistry.addShapelessRecipe(new ItemStack(mullak99.ingotTin, 9), mullak99.blockTin);
		
		GameRegistry.addRecipe(new ItemStack(mullak99.blockBronze), "BBB", "BBB", "BBB",
				'B', mullak99.ingotBronze);
		GameRegistry.addShapelessRecipe(new ItemStack(mullak99.ingotBronze, 9), mullak99.blockBronze);
		
		GameRegistry.addRecipe(new ItemStack(mullak99.blockSilver), "SSS", "SSS", "SSS",
				'S', mullak99.ingotSilver);
		GameRegistry.addShapelessRecipe(new ItemStack(mullak99.ingotSilver, 9), mullak99.blockSilver);
	
		GameRegistry.addRecipe(new ItemStack(mullak99.thinClearGlass, 16), "GGG", "GGG",
				'G', mullak99.clearGlass);
		GameRegistry.addShapelessRecipe(new ItemStack(mullak99.ingotTin, 9), mullak99.blockTin);
		
		GameRegistry.addRecipe(new ItemStack(mullak99.alphaCobble, 8), "CCC", "CDC", "CCC",
				'C', Block.cobblestone, 'D', mullak99.dustAlpha);
		
		GameRegistry.addRecipe(new ItemStack(mullak99.alphaStone, 8), "SSS", "SDS", "SSS",
				'S', Block.stone, 'D', mullak99.dustAlpha);
		
		GameRegistry.addRecipe(new ItemStack(mullak99.alphaGrass, 8), "GGG", "GDG", "GGG",
				'G', Block.grass, 'D', mullak99.dustAlpha);
		
		GameRegistry.addRecipe(new ItemStack(mullak99.alphaSapling, 8), "SSS", "SDS", "SSS",
				'S', Block.sapling, 'D', mullak99.dustAlpha);
		
		GameRegistry.addShapelessRecipe(new ItemStack(Block.grass), Block.dirt, (new ItemStack(Item.dyePowder, 2, 15)));
		
		GameRegistry.addRecipe(new ItemStack(mullak99.blockAluminium), "AAA", "AAA", "AAA",
				'A', mullak99.ingotAluminium);
		GameRegistry.addShapelessRecipe(new ItemStack(mullak99.ingotAluminium, 9), mullak99.blockAluminium);
		
		GameRegistry.addRecipe(new ItemStack(mullak99.MCraftingTable), "AGA", "GCG", "AGA",
				'G', Item.ingotGold, 'C', Block.workbench, 'A', mullak99.ingotAluminium);
		
		GameRegistry.addRecipe(new ItemStack(mullak99.blockAlpha), "AAA", "AAA", "AAA",
				'A', mullak99.ingotAlpha);
		GameRegistry.addShapelessRecipe(new ItemStack(mullak99.ingotAlpha, 9), mullak99.blockAlpha);
		
		GameRegistry.addRecipe(new ItemStack(mullak99.marbleBrick, 4), "MM", "MM",
				'M', mullak99.marble);
		
		GameRegistry.addRecipe(new ItemStack(mullak99.marbleSlab, 6), "MMM",
				'M', mullak99.marble);
		
		GameRegistry.addRecipe(new ItemStack(mullak99.marbleCobbleSlab, 6), "MMM",
				'M', mullak99.marbleCobble);
		
		GameRegistry.addRecipe(new ItemStack(mullak99.marbleBrickSlab, 6), "MMM",
				'M', mullak99.marbleBrick);
		
		GameRegistry.addRecipe(new ItemStack(mullak99.marbleStair, 4), "M  ", "MM ", "MMM",
				'M', mullak99.marble);
		
		GameRegistry.addRecipe(new ItemStack(mullak99.marbleCobbleStair, 4), "M  ", "MM ", "MMM",
				'M', mullak99.marbleCobble);
		
		GameRegistry.addRecipe(new ItemStack(mullak99.marbleBrickStair, 4), "M  ", "MM ", "MMM",
				'M', mullak99.marbleBrick);
		
		GameRegistry.addRecipe(new ItemStack(mullak99.blockEndite), "EEE", "EEE", "EEE",
				'E', mullak99.endite);
		GameRegistry.addShapelessRecipe(new ItemStack(mullak99.endite, 9), mullak99.blockEndite);
		
		
		
		
		//Items
		
		
		GameRegistry.addRecipe(new ItemStack(mullak99.mortarPestle), " I ", "S S", " S ",
				'S', Block.stone, 'I', Item.ingotIron);
		
		GameRegistry.addRecipe(new ItemStack(mullak99.mortarPestleReinf), " S ", "O O", " O ",
				'O', Block.obsidian, 'S', mullak99.ingotSteel);
		
		GameRegistry.addRecipe(new ItemStack(mullak99.grate, 4), "CAC", "ASA", "CAC",
				'C', mullak99.dustCopper, 'A', mullak99.dustAluminium, 'S', mullak99.ingotSteel);
		
		
		GameRegistry.addRecipe(new ItemStack(mullak99.Chain, 6, 0), "I", "I",
				'I', Item.ingotIron);
		
		GameRegistry.addRecipe(new ItemStack(mullak99.bloodBucket), "BBB", "BIB", "BBB",
				'B', mullak99.blood, 'I', Item.bucketEmpty);
		
		
		GameRegistry.addShapelessRecipe(new ItemStack(mullak99.dustBronze, 4), mullak99.dustTin, mullak99.dustCopper, mullak99.dustCopper, mullak99.dustCopper);
		
		GameRegistry.addShapelessRecipe(new ItemStack(mullak99.ingotSteelRaw), mullak99.dustCoal, mullak99.dustCoal, Item.ingotIron);
		GameRegistry.addShapelessRecipe(new ItemStack(mullak99.ingotSteelRaw), mullak99.dustCharcoal, mullak99.dustCharcoal, Item.ingotIron);
		GameRegistry.addShapelessRecipe(new ItemStack(mullak99.ingotSteelRaw), mullak99.dustCoal, mullak99.dustCharcoal, Item.ingotIron);
		
		GameRegistry.addShapelessRecipe(new ItemStack(mullak99.redstoneBattery), mullak99.BatteryEmpty, Item.redstone, Item.redstone, Item.redstone);
		
		GameRegistry.addShapelessRecipe(new ItemStack(Item.gunpowder, 2), mullak99.dustCoal, mullak99.dustCoal, mullak99.sulfur, mullak99.sulfur);
		GameRegistry.addShapelessRecipe(new ItemStack(Item.gunpowder, 2), mullak99.dustCharcoal, mullak99.dustCharcoal, mullak99.sulfur, mullak99.sulfur);
		GameRegistry.addShapelessRecipe(new ItemStack(Item.gunpowder, 2), mullak99.dustCoal, mullak99.dustCharcoal, mullak99.sulfur, mullak99.sulfur);
		
		
		
		//Essence Extractor
		
		GameRegistry.addShapelessRecipe(new ItemStack(mullak99.dustAlpha),  mullak99.alphaSapling, (new ItemStack(mullak99.essenceExtractor, 1, 32767)));
		
		GameRegistry.addShapelessRecipe(new ItemStack(mullak99.dustAlpha), mullak99.alphaGrass, (new ItemStack(mullak99.essenceExtractor, 1, 32767)));
		
		GameRegistry.addShapelessRecipe(new ItemStack(mullak99.dustAlpha), mullak99.alphaSapling, (new ItemStack(mullak99.essenceExtractor, 1, 32767)));
	
		GameRegistry.addShapelessRecipe(new ItemStack(Item.silk, 4), (new ItemStack(Block.cloth, 1, 32767)), (new ItemStack(mullak99.essenceExtractor, 1, 32767)));
		
		
		
		//Mortar and Pestle
		
		GameRegistry.addShapelessRecipe(new ItemStack(mullak99.dustCoal), Item.coal, (new ItemStack(mullak99.mortarPestle, 1, 32767)));
		GameRegistry.addShapelessRecipe(new ItemStack(mullak99.dustCoal, 2), Block.oreCoal, (new ItemStack(mullak99.mortarPestle, 1, 32767)));
		GameRegistry.addShapelessRecipe(new ItemStack(mullak99.dustCharcoal), (new ItemStack(Item.coal, 1, 1)), (new ItemStack(mullak99.mortarPestle, 1, 32767)));
		
		GameRegistry.addShapelessRecipe(new ItemStack(mullak99.dustAlpha, 16), mullak99.oreAlpha, (new ItemStack(mullak99.mortarPestle, 1, 32767)));
		
		GameRegistry.addShapelessRecipe(new ItemStack(mullak99.dustCopper), mullak99.ingotCopper, (new ItemStack(mullak99.mortarPestle, 1, 32767)));
		GameRegistry.addShapelessRecipe(new ItemStack(mullak99.dustCopper, 2), mullak99.oreCopper, (new ItemStack(mullak99.mortarPestle, 1, 32767)));
		
		GameRegistry.addShapelessRecipe(new ItemStack(mullak99.dustTin), mullak99.ingotTin, (new ItemStack(mullak99.mortarPestle, 1, 32767)));
		GameRegistry.addShapelessRecipe(new ItemStack(mullak99.dustTin, 2), mullak99.oreTin, (new ItemStack(mullak99.mortarPestle, 1, 32767)));
		
		GameRegistry.addShapelessRecipe(new ItemStack(mullak99.dustBronze), mullak99.ingotBronze, (new ItemStack(mullak99.mortarPestle, 1, 32767)));
		
		GameRegistry.addShapelessRecipe(new ItemStack(Block.cobblestone), mullak99.alphaCobble, (new ItemStack(mullak99.mortarPestle, 1, 32767)));
		
		GameRegistry.addShapelessRecipe(new ItemStack(mullak99.bauxite, 2), mullak99.oreBauxite, (new ItemStack(mullak99.mortarPestle, 1, 32767)));
		
		GameRegistry.addShapelessRecipe(new ItemStack(mullak99.dustAluminium), mullak99.ingotAluminium, (new ItemStack(mullak99.mortarPestle, 1, 32767)));
		
		GameRegistry.addShapelessRecipe(new ItemStack(mullak99.marbleCobble), mullak99.marbleBrick, (new ItemStack(mullak99.mortarPestle, 1, 32767)));
		
		GameRegistry.addShapelessRecipe(new ItemStack(mullak99.dustAlpha), mullak99.ingotAlpha, (new ItemStack(mullak99.mortarPestle, 1, 32767)));
		
		GameRegistry.addShapelessRecipe(new ItemStack(mullak99.dustAlpha, 9), mullak99.blockAlpha, (new ItemStack(mullak99.mortarPestle, 1, 32767)));
		
		GameRegistry.addShapelessRecipe(new ItemStack(mullak99.dustAlpha), mullak99.alphaStone, (new ItemStack(mullak99.mortarPestle, 1, 32767)));
		
		GameRegistry.addShapelessRecipe(new ItemStack(mullak99.dustAlpha), mullak99.alphaCobble, (new ItemStack(mullak99.mortarPestle, 1, 32767)));
		
		GameRegistry.addShapelessRecipe(new ItemStack(mullak99.dustSilver), mullak99.ingotSilver, (new ItemStack(mullak99.mortarPestle, 1, 32767)));
		GameRegistry.addShapelessRecipe(new ItemStack(mullak99.dustSilver, 2), mullak99.oreSilver, (new ItemStack(mullak99.mortarPestle, 1, 32767)));
		
		GameRegistry.addShapelessRecipe(new ItemStack(mullak99.sulfur, 8), mullak99.oreSulfur, (new ItemStack(mullak99.mortarPestle, 1, 32767)));
		GameRegistry.addShapelessRecipe(new ItemStack(mullak99.sulfur, 16), mullak99.oreNetherSulfur, (new ItemStack(mullak99.mortarPestle, 1, 32767)));
		
		//Reinforced Mortar and Pestle
		GameRegistry.addShapelessRecipe(new ItemStack(mullak99.dustMullite), mullak99.mullite, (new ItemStack(mullak99.mortarPestleReinf, 1, 32767)));
		GameRegistry.addShapelessRecipe(new ItemStack(mullak99.dustMullite, 2), mullak99.oreMullite, (new ItemStack(mullak99.mortarPestleReinf, 1, 32767)));
		
		GameRegistry.addShapelessRecipe(new ItemStack(mullak99.dustRoxite), mullak99.roxite, (new ItemStack(mullak99.mortarPestleReinf, 1, 32767)));
		GameRegistry.addShapelessRecipe(new ItemStack(mullak99.dustRoxite, 2), mullak99.oreRoxite, (new ItemStack(mullak99.mortarPestleReinf, 1, 32767)));
		
		
		GameRegistry.addShapelessRecipe(new ItemStack(mullak99.dustCoal), Item.coal, (new ItemStack(mullak99.mortarPestleReinf, 1, 32767)));
		GameRegistry.addShapelessRecipe(new ItemStack(mullak99.dustCoal, 2), Block.oreCoal, (new ItemStack(mullak99.mortarPestleReinf, 1, 32767)));
		GameRegistry.addShapelessRecipe(new ItemStack(mullak99.dustCharcoal), (new ItemStack(Item.coal, 1, 1)), (new ItemStack(mullak99.mortarPestleReinf, 1, 32767)));
		
		GameRegistry.addShapelessRecipe(new ItemStack(mullak99.dustAlpha, 16), mullak99.oreAlpha, (new ItemStack(mullak99.mortarPestleReinf, 1, 32767)));
		
		GameRegistry.addShapelessRecipe(new ItemStack(mullak99.dustCopper), mullak99.ingotCopper, (new ItemStack(mullak99.mortarPestleReinf, 1, 32767)));
		GameRegistry.addShapelessRecipe(new ItemStack(mullak99.dustCopper, 2), mullak99.oreCopper, (new ItemStack(mullak99.mortarPestleReinf, 1, 32767)));
		
		GameRegistry.addShapelessRecipe(new ItemStack(mullak99.dustTin), mullak99.ingotTin, (new ItemStack(mullak99.mortarPestleReinf, 1, 32767)));
		GameRegistry.addShapelessRecipe(new ItemStack(mullak99.dustTin, 2), mullak99.oreTin, (new ItemStack(mullak99.mortarPestleReinf, 1, 32767)));
		
		GameRegistry.addShapelessRecipe(new ItemStack(mullak99.dustBronze), mullak99.ingotBronze, (new ItemStack(mullak99.mortarPestleReinf, 1, 32767)));
		
		GameRegistry.addShapelessRecipe(new ItemStack(mullak99.bauxite, 2), mullak99.oreBauxite, (new ItemStack(mullak99.mortarPestleReinf, 1, 32767)));
		
		GameRegistry.addShapelessRecipe(new ItemStack(mullak99.dustAluminium), mullak99.ingotAluminium, (new ItemStack(mullak99.mortarPestleReinf, 1, 32767)));
		
		GameRegistry.addShapelessRecipe(new ItemStack(mullak99.marbleCobble), mullak99.marbleBrick, (new ItemStack(mullak99.mortarPestleReinf, 1, 32767)));
		
		GameRegistry.addShapelessRecipe(new ItemStack(mullak99.dustAlpha), mullak99.ingotAlpha, (new ItemStack(mullak99.mortarPestleReinf, 1, 32767)));
		
		GameRegistry.addShapelessRecipe(new ItemStack(mullak99.dustAlpha, 9), mullak99.blockAlpha, (new ItemStack(mullak99.mortarPestleReinf, 1, 32767)));
		
		GameRegistry.addShapelessRecipe(new ItemStack(mullak99.dustAlpha), mullak99.alphaStone, (new ItemStack(mullak99.mortarPestleReinf, 1, 32767)));
		
		GameRegistry.addShapelessRecipe(new ItemStack(mullak99.dustAlpha), mullak99.alphaCobble, (new ItemStack(mullak99.mortarPestleReinf, 1, 32767)));
		
		GameRegistry.addShapelessRecipe(new ItemStack(mullak99.dustSilver), mullak99.ingotSilver, (new ItemStack(mullak99.mortarPestleReinf, 1, 32767)));
		GameRegistry.addShapelessRecipe(new ItemStack(mullak99.dustSilver, 2), mullak99.oreSilver, (new ItemStack(mullak99.mortarPestleReinf, 1, 32767)));
		
		GameRegistry.addShapelessRecipe(new ItemStack(mullak99.sulfur, 8), mullak99.oreSulfur, (new ItemStack(mullak99.mortarPestleReinf, 1, 32767)));
		GameRegistry.addShapelessRecipe(new ItemStack(mullak99.sulfur, 16), mullak99.oreNetherSulfur, (new ItemStack(mullak99.mortarPestleReinf, 1, 32767)));
		
		//Food
		GameRegistry.addRecipe(new ItemStack(mullak99.enchantedMelon), "DAG", "AMA", "GAD",
				'M', Item.melon, 'A', (new ItemStack(Item.appleGold, 1, 1)), 'D', Block.blockDiamond, 'G', Block.blockGold);
		
		//Drink
		
		//GameRegistry.addShapelessRecipe(new ItemStack(mullak99.bucketChocMilk), Item.bucketMilk, (new ItemStack(Item.dyePowder, 1, 3)));
		
		//Tools
		GameRegistry.addRecipe(new ItemStack(mullak99.pickaxeMullite), "MMM", " S ", " S ",
				'M', mullak99.mullite, 'S', Item.stick);
		GameRegistry.addRecipe(new ItemStack(mullak99.shovelMullite), "M", "S", "S",
				'M', mullak99.mullite, 'S', Item.stick);
		GameRegistry.addRecipe(new ItemStack(mullak99.swordMullite), "M", "M", "S",
				'M', mullak99.mullite, 'S', Item.stick);
		GameRegistry.addRecipe(new ItemStack(mullak99.axeMullite), "MM ", "MS ", " S ",
				'M', mullak99.mullite, 'S', Item.stick);
		GameRegistry.addRecipe(new ItemStack(mullak99.axeMullite), " MM", " SM", " S ",
				'M', mullak99.mullite, 'S', Item.stick);
		GameRegistry.addRecipe(new ItemStack(mullak99.hoeMullite), "MM ", " S ", " S ",
				'M', mullak99.mullite, 'S', Item.stick);
		GameRegistry.addRecipe(new ItemStack(mullak99.hoeMullite), " MM", " S ", " S ",
				'M', mullak99.mullite, 'S', Item.stick);
		GameRegistry.addShapelessRecipe(new ItemStack(mullak99.swordMulliteDE), mullak99.swordMullite, Item.diamond);
		GameRegistry.addShapelessRecipe(new ItemStack(mullak99.swordMulliteEE), mullak99.swordMullite, mullak99.endite, mullak99.endite, mullak99.endite);
		
		GameRegistry.addShapelessRecipe(new ItemStack(mullak99.paxelMulliteEE), mullak99.paxelMullite, mullak99.endite, mullak99.endite, mullak99.endite, mullak99.endite);
		
		
		GameRegistry.addRecipe(new ItemStack(mullak99.pickaxeRoxite), "RRR", " S ", " S ",
				'R', mullak99.roxite, 'S', Item.stick);
		GameRegistry.addRecipe(new ItemStack(mullak99.shovelRoxite), "R", "S", "S",
				'R', mullak99.roxite, 'S', Item.stick);
		GameRegistry.addRecipe(new ItemStack(mullak99.swordRoxite), "R", "R", "S",
				'R', mullak99.roxite, 'S', Item.stick);
		GameRegistry.addRecipe(new ItemStack(mullak99.axeRoxite), "RR ", "RS ", " S ",
				'R', mullak99.roxite, 'S', Item.stick);
		GameRegistry.addRecipe(new ItemStack(mullak99.axeRoxite), " RR", " SR", " S ",
				'R', mullak99.roxite, 'S', Item.stick);
		GameRegistry.addRecipe(new ItemStack(mullak99.hoeRoxite), "RR ", " S ", " S ",
				'R', mullak99.roxite, 'S', Item.stick);
		GameRegistry.addRecipe(new ItemStack(mullak99.hoeRoxite), " RR", " S ", " S ",
				'R', mullak99.roxite, 'S', Item.stick);
		GameRegistry.addShapelessRecipe(new ItemStack(mullak99.swordRoxiteDE), mullak99.swordRoxite, Item.diamond);
		GameRegistry.addShapelessRecipe(new ItemStack(mullak99.swordRoxiteEE), mullak99.swordRoxite, mullak99.endite, mullak99.endite, mullak99.endite);
		
		GameRegistry.addShapelessRecipe(new ItemStack(mullak99.paxelRoxiteEE), mullak99.paxelRoxite, mullak99.endite, mullak99.endite, mullak99.endite, mullak99.endite);
		
		
		GameRegistry.addRecipe(new ItemStack(mullak99.pickaxeBronze), "BBB", " S ", " S ",
				'B', mullak99.ingotBronze, 'S', Item.stick);
		GameRegistry.addRecipe(new ItemStack(mullak99.shovelBronze), "B", "S", "S",
				'B', mullak99.ingotBronze, 'S', Item.stick);
		GameRegistry.addRecipe(new ItemStack(mullak99.swordBronze), "B", "B", "S",
				'B', mullak99.ingotBronze, 'S', Item.stick);
		GameRegistry.addRecipe(new ItemStack(mullak99.axeBronze), "BB ", "BS ", " S ",
				'B', mullak99.ingotBronze, 'S', Item.stick);
		GameRegistry.addRecipe(new ItemStack(mullak99.axeBronze), " BB", " SB", " S ",
				'B', mullak99.ingotBronze, 'S', Item.stick);
		GameRegistry.addRecipe(new ItemStack(mullak99.hoeBronze), "BB ", " S ", " S ",
				'B', mullak99.ingotBronze, 'S', Item.stick);
		GameRegistry.addRecipe(new ItemStack(mullak99.hoeBronze), " BB", " S ", " S ",
				'B', mullak99.ingotBronze, 'S', Item.stick);
		
		GameRegistry.addRecipe(new ItemStack(mullak99.pickaxeSteel), "---", " S ", " S ",
				'-', mullak99.ingotSteel, 'S', Item.stick);
		GameRegistry.addRecipe(new ItemStack(mullak99.shovelSteel), "-", "S", "S",
				'-', mullak99.ingotSteel, 'S', Item.stick);
		GameRegistry.addRecipe(new ItemStack(mullak99.swordSteel), "-", "-", "S",
				'-', mullak99.ingotSteel, 'S', Item.stick);
		GameRegistry.addRecipe(new ItemStack(mullak99.axeSteel), "-- ", "-S ", " S ",
				'-', mullak99.ingotSteel, 'S', Item.stick);
		GameRegistry.addRecipe(new ItemStack(mullak99.axeSteel), " --", " S-", " S ",
				'-', mullak99.ingotSteel, 'S', Item.stick);
		GameRegistry.addRecipe(new ItemStack(mullak99.hoeSteel), "-- ", " S ", " S ",
				'-', mullak99.ingotSteel, 'S', Item.stick);
		GameRegistry.addRecipe(new ItemStack(mullak99.hoeSteel), " --", " S ", " S ",
				'-', mullak99.ingotSteel, 'S', Item.stick);
		
		GameRegistry.addRecipe(new ItemStack(mullak99.pickaxeAlpha), "AAA", " S ", " S ",
				'A', mullak99.ingotAlpha, 'S', Item.stick);
		GameRegistry.addRecipe(new ItemStack(mullak99.shovelAlpha), "A", "S", "S",
				'A', mullak99.ingotAlpha, 'S', Item.stick);
		GameRegistry.addRecipe(new ItemStack(mullak99.swordAlpha), "A", "A", "S",
				'A', mullak99.ingotAlpha, 'S', Item.stick);
		GameRegistry.addRecipe(new ItemStack(mullak99.axeAlpha), "AA ", "AS ", " S ",
				'A', mullak99.ingotAlpha, 'S', Item.stick);
		GameRegistry.addRecipe(new ItemStack(mullak99.axeAlpha), " AA", " SA", " S ",
				'A', mullak99.ingotAlpha, 'S', Item.stick);
		GameRegistry.addRecipe(new ItemStack(mullak99.hoeAlpha), "AA ", " S ", " S ",
				'A', mullak99.ingotAlpha, 'S', Item.stick);
		GameRegistry.addRecipe(new ItemStack(mullak99.hoeAlpha), " AA", " S ", " S ",
				'A', mullak99.ingotAlpha, 'S', Item.stick);
		
		GameRegistry.addRecipe(new ItemStack(mullak99.steelHammer), "-", "S",
				'-', mullak99.ingotSteel, 'S', Item.stick);
		
		GameRegistry.addRecipe(new ItemStack(mullak99.essenceExtractor), "-", "S",
				'-', mullak99.grate, 'S', Item.stick);

		
		GameRegistry.addRecipe(new ItemStack(mullak99.enditeHammer), new Object[] {"ESE", " S ", 
			'E', mullak99.endite, 'S', Item.blazeRod});
		
		//Armor
		
		GameRegistry.addRecipe(new ItemStack(mullak99.helmetMullite), "MMM", "M M",
				'M', mullak99.mullite);
		GameRegistry.addRecipe(new ItemStack(mullak99.chestMullite), "M M", "MMM", "MMM",
				'M', mullak99.mullite);
		GameRegistry.addRecipe(new ItemStack(mullak99.legsMullite), "MMM", "M M", "M M",
				'M', mullak99.mullite);
		GameRegistry.addRecipe(new ItemStack(mullak99.bootsMullite), "M M", "M M",
				'M', mullak99.mullite);
		
		GameRegistry.addRecipe(new ItemStack(mullak99.helmetRoxite), "RRR", "R R",
				'R', mullak99.roxite);
		GameRegistry.addRecipe(new ItemStack(mullak99.chestRoxite), "R R", "RRR", "RRR",
				'R', mullak99.roxite);
		GameRegistry.addRecipe(new ItemStack(mullak99.legsRoxite), "RRR", "R R", "R R",
				'R', mullak99.roxite);
		GameRegistry.addRecipe(new ItemStack(mullak99.bootsRoxite), "R R", "R R",
				'R', mullak99.roxite);
		
		GameRegistry.addRecipe(new ItemStack(mullak99.helmetBronze), "BBB", "B B",
				'B', mullak99.ingotBronze);
		GameRegistry.addRecipe(new ItemStack(mullak99.chestBronze), "B B", "BBB", "BBB",
				'B', mullak99.ingotBronze);
		GameRegistry.addRecipe(new ItemStack(mullak99.legsBronze), "BBB", "B B", "B B",
				'B', mullak99.ingotBronze);
		GameRegistry.addRecipe(new ItemStack(mullak99.bootsBronze), "B B", "B B",
				'B', mullak99.ingotBronze);
		
		GameRegistry.addRecipe(new ItemStack(mullak99.helmetSteel), "SSS", "S S",
				'S', mullak99.ingotSteel);
		GameRegistry.addRecipe(new ItemStack(mullak99.chestSteel), "S S", "SSS", "SSS",
				'S', mullak99.ingotSteel);
		GameRegistry.addRecipe(new ItemStack(mullak99.legsSteel), "SSS", "S S", "S S",
				'S', mullak99.ingotSteel);
		GameRegistry.addRecipe(new ItemStack(mullak99.bootsSteel), "S S", "S S",
				'S', mullak99.ingotSteel);
		
		GameRegistry.addRecipe(new ItemStack(mullak99.helmetAlpha), "AAA", "A A",
				'A', mullak99.ingotAlpha);
		GameRegistry.addRecipe(new ItemStack(mullak99.chestAlpha), "A A", "AAA", "AAA",
				'A', mullak99.ingotAlpha);
		GameRegistry.addRecipe(new ItemStack(mullak99.legsAlpha), "AAA", "A A", "A A",
				'A', mullak99.ingotAlpha);
		GameRegistry.addRecipe(new ItemStack(mullak99.bootsAlpha), "A A", "A A",
				'A', mullak99.ingotAlpha);
		
		GameRegistry.addRecipe(new ItemStack(Item.helmetChain), "CCC", "C C",
				'C', mullak99.Chain);
		GameRegistry.addRecipe(new ItemStack(Item.plateChain), "C C", "CCC", "CCC",
				'C', mullak99.Chain);
		GameRegistry.addRecipe(new ItemStack(Item.legsChain), "CCC", "C C", "C C",
				'C', mullak99.Chain);
		GameRegistry.addRecipe(new ItemStack(Item.bootsChain), "C C", "C C",
				'C', mullak99.Chain);
		
	
		//Crafting | MCrafting
		
		//MCraftingManager.getInstance().addShapedRecipe(new ItemStack(mullak99.redstoneBattery), new Object[] {" C ", "ARA", "ARA", "ARA", "ACA", 'C', mullak99.ingotCopper, 'A', mullak99.ingotAluminium, 'R', Item.redstone});
		MCraftingManager.getInstance().addShapedRecipe(new ItemStack(mullak99.BatteryEmpty), new Object[] {" C ", "A A", "A A", "A A", "ACA", 'C', mullak99.ingotCopper, 'A', mullak99.ingotAluminium});
		
		MCraftingManager.getInstance().addShapedRecipe(new ItemStack(mullak99.MTNT, 8), new Object[] {"MTM", "TTT", "TTT", "MTM", " H ", 'H', (new ItemStack(mullak99.steelHammer, 1, 32767)), 'M', mullak99.mullite, 'T', Block.tnt});
		
		MCraftingManager.getInstance().addShapedRecipe(new ItemStack(mullak99.paxelIron), new Object[] {" - ", "---", "---", " S ", " S ", '-', Item.ingotIron, 'S', Item.stick});
		MCraftingManager.getInstance().addShapedRecipe(new ItemStack(mullak99.paxelSteel), new Object[] {" - ", "---", "---", " S ", " S ", '-', mullak99.ingotSteel, 'S', Item.stick});
		MCraftingManager.getInstance().addShapedRecipe(new ItemStack(mullak99.paxelDiamond), new Object[] {" - ", "---", "---", " S ", " S ", '-', Item.diamond, 'S', Item.stick});
		MCraftingManager.getInstance().addShapedRecipe(new ItemStack(mullak99.paxelMullite), new Object[] {" - ", "---", "---", " S ", " S ", '-', mullak99.mullite, 'S', Item.stick});
		MCraftingManager.getInstance().addShapedRecipe(new ItemStack(mullak99.paxelRoxite), new Object[] {" - ", "---", "---", " S ", " S ", '-', mullak99.roxite, 'S', Item.stick});
		MCraftingManager.getInstance().addShapedRecipe(new ItemStack(mullak99.paxelAlpha), new Object[] {" - ", "---", "---", " S ", " S ", '-', mullak99.ingotAlpha, 'S', Item.stick});
		
		MCraftingManager.getInstance().addShapedRecipe(new ItemStack(mullak99.blockUru), new Object[] {"MRM", "DED", "DED", "DED", "MRM", 'M', mullak99.blockMullite, 'R', mullak99.blockRoxite, 'D', Block.blockDiamond, 'E', mullak99.blockEndite});
		MCraftingManager.getInstance().addShapedRecipe(new ItemStack(mullak99.ingotUru, 4), new Object[] {"H", "U", 'H', (new ItemStack(mullak99.enditeHammer, 1, 32767)), 'U', mullak99.blockUru});
		MCraftingManager.getInstance().addShapedRecipe(new ItemStack(mullak99.blockUru), new Object[] {"H ", "UU", "UU", 'H', (new ItemStack(mullak99.enditeHammer, 1, 32767)), 'U', mullak99.ingotUru});
		MCraftingManager.getInstance().addShapedRecipe(new ItemStack(mullak99.blockUru), new Object[] {" H", "UU", "UU", 'H', (new ItemStack(mullak99.enditeHammer, 1, 32767)), 'U', mullak99.ingotUru});
		MCraftingManager.getInstance().addShapedRecipe(new ItemStack(mullak99.blockUru), new Object[] {"UU", "UU", "H ", 'H', (new ItemStack(mullak99.enditeHammer, 1, 32767)), 'U', mullak99.ingotUru});
		MCraftingManager.getInstance().addShapedRecipe(new ItemStack(mullak99.blockUru), new Object[] {"UU", "UU", " H", 'H', (new ItemStack(mullak99.enditeHammer, 1, 32767)), 'U', mullak99.ingotUru});
		
		MCraftingManager.getInstance().addShapedRecipe(new ItemStack(mullak99.thorsHammer), new Object[] {"EME", "USU", "USU", " D ", " S ", 'E', mullak99.endite, 'M', mullak99.mullite, 'S', Item.stick, 'U', mullak99.ingotUru, 'D', Item.diamond});
		
		
		if(mullak99.SaddleRecipe) {
			MCraftingManager.getInstance().addShapedRecipe(new ItemStack(Item.saddle), new Object[] {"LLL", "SLS", "I I", " H ", 'L', Item.leather, 'S', Item.silk, 'I', mullak99.ingotSteel, 'H', (new ItemStack(mullak99.steelHammer, 1, 32767))});
		}
			
		//Repair | MCrafting
		
		MCraftingManager.getInstance().addShapedRecipe(new ItemStack(mullak99.pickaxeMullite), new Object[] {"MIM", " S ", 'M', mullak99.mullite, 'I', (new ItemStack(mullak99.pickaxeMullite, 1, 32767)), 'S', (new ItemStack(mullak99.steelHammer, 1, 32767))});
		MCraftingManager.getInstance().addShapedRecipe(new ItemStack(mullak99.shovelMullite), new Object[] {"MIM", " S ", 'M', mullak99.mullite, 'I', (new ItemStack(mullak99.shovelMullite, 1, 32767)), 'S', (new ItemStack(mullak99.steelHammer, 1, 32767))});
		MCraftingManager.getInstance().addShapedRecipe(new ItemStack(mullak99.swordMullite), new Object[] {"MIM", " S ", 'M', mullak99.mullite, 'I', (new ItemStack(mullak99.swordMullite, 1, 32767)), 'S', (new ItemStack(mullak99.steelHammer, 1, 32767))});
		MCraftingManager.getInstance().addShapedRecipe(new ItemStack(mullak99.axeMullite), new Object[] {"MIM", " S ", 'M', mullak99.mullite, 'I', (new ItemStack(mullak99.axeMullite, 1, 32767)), 'S', (new ItemStack(mullak99.steelHammer, 1, 32767))});
		MCraftingManager.getInstance().addShapedRecipe(new ItemStack(mullak99.hoeMullite), new Object[] {"MIM", " S ", 'M', mullak99.mullite, 'I', (new ItemStack(mullak99.hoeMullite, 1, 32767)), 'S', (new ItemStack(mullak99.steelHammer, 1, 32767))});
		MCraftingManager.getInstance().addShapedRecipe(new ItemStack(mullak99.swordMulliteDE), new Object[] {"MID", " S ", 'M', mullak99.mullite, 'D', Item.diamond, 'I', (new ItemStack(mullak99.swordMulliteDE, 1, 32767)), 'S', (new ItemStack(mullak99.steelHammer, 1, 32767))});
		MCraftingManager.getInstance().addShapedRecipe(new ItemStack(mullak99.swordMulliteDE), new Object[] {"DIM", " S ", 'M', mullak99.mullite, 'D', Item.diamond, 'I', (new ItemStack(mullak99.swordMulliteDE, 1, 32767)), 'S', (new ItemStack(mullak99.steelHammer, 1, 32767))});
		MCraftingManager.getInstance().addShapedRecipe(new ItemStack(mullak99.paxelMullite), new Object[] {"MIM", " S ", 'M', mullak99.mullite, 'I', (new ItemStack(mullak99.paxelMullite, 1, 32767)), 'S', mullak99.steelHammer});
		
		MCraftingManager.getInstance().addShapedRecipe(new ItemStack(mullak99.swordMulliteEE), new Object[] {"MIE", " S ", 'R', mullak99.mullite, 'E', mullak99.endite, 'I', (new ItemStack(mullak99.swordMulliteEE, 1, 32767)), 'S', (new ItemStack(mullak99.steelHammer, 1, 32767))});
		MCraftingManager.getInstance().addShapedRecipe(new ItemStack(mullak99.swordMulliteEE), new Object[] {"EIM", " S ", 'R', mullak99.mullite, 'E', mullak99.endite, 'I', (new ItemStack(mullak99.swordMulliteEE, 1, 32767)), 'S', (new ItemStack(mullak99.steelHammer, 1, 32767))});
		
		MCraftingManager.getInstance().addShapedRecipe(new ItemStack(mullak99.paxelMulliteEE), new Object[] {"EIR", " S ", 'R', mullak99.roxite, 'E', mullak99.endite, 'I', (new ItemStack(mullak99.paxelMulliteEE, 1, 32767)), 'S', (new ItemStack(mullak99.steelHammer, 1, 32767))});
		MCraftingManager.getInstance().addShapedRecipe(new ItemStack(mullak99.paxelMulliteEE), new Object[] {"RIE", " S ", 'R', mullak99.roxite, 'E', mullak99.endite, 'I', (new ItemStack(mullak99.paxelMulliteEE, 1, 32767)), 'S', (new ItemStack(mullak99.steelHammer, 1, 32767))});
		
		MCraftingManager.getInstance().addShapedRecipe(new ItemStack(mullak99.pickaxeRoxite), new Object[] {"RIR", " S ", 'R', mullak99.roxite, 'I', (new ItemStack(mullak99.pickaxeRoxite, 1, 32767)), 'S', (new ItemStack(mullak99.steelHammer, 1, 32767))});
		MCraftingManager.getInstance().addShapedRecipe(new ItemStack(mullak99.shovelRoxite), new Object[] {"RIR", " S ", 'R', mullak99.roxite, 'I', (new ItemStack(mullak99.shovelMullite, 1, 32767)), 'S', (new ItemStack(mullak99.steelHammer, 1, 32767))});
		MCraftingManager.getInstance().addShapedRecipe(new ItemStack(mullak99.swordRoxite), new Object[] {"RIR", " S ", 'R', mullak99.roxite, 'I', (new ItemStack(mullak99.swordMullite, 1, 32767)), 'S', (new ItemStack(mullak99.steelHammer, 1, 32767))});
		MCraftingManager.getInstance().addShapedRecipe(new ItemStack(mullak99.axeRoxite), new Object[] {"RIR", " S ", 'R', mullak99.roxite, 'I', (new ItemStack(mullak99.axeRoxite, 1, 32767)), 'S', (new ItemStack(mullak99.steelHammer, 1, 32767))});
		MCraftingManager.getInstance().addShapedRecipe(new ItemStack(mullak99.hoeRoxite), new Object[] {"RIR", " S ", 'R', mullak99.roxite, 'I', (new ItemStack(mullak99.hoeRoxite, 1, 32767)), 'S', (new ItemStack(mullak99.steelHammer, 1, 32767))});
		MCraftingManager.getInstance().addShapedRecipe(new ItemStack(mullak99.swordRoxiteDE), new Object[] {"RID", " S ", 'R', mullak99.roxite, 'D', Item.diamond, 'I', (new ItemStack(mullak99.swordRoxiteDE, 1, 32767)), 'S', (new ItemStack(mullak99.steelHammer, 1, 32767))});
		MCraftingManager.getInstance().addShapedRecipe(new ItemStack(mullak99.swordRoxiteDE), new Object[] {"DIR", " S ", 'R', mullak99.roxite, 'D', Item.diamond, 'I', (new ItemStack(mullak99.swordRoxiteDE, 1, 32767)), 'S', (new ItemStack(mullak99.steelHammer, 1, 32767))});
		MCraftingManager.getInstance().addShapedRecipe(new ItemStack(mullak99.paxelRoxite), new Object[] {"RIR", " S ", 'R', mullak99.roxite, 'I', (new ItemStack(mullak99.paxelRoxite, 1, 32767)), 'S', (new ItemStack(mullak99.steelHammer, 1, 32767))});
		
		MCraftingManager.getInstance().addShapedRecipe(new ItemStack(mullak99.swordRoxiteEE), new Object[] {"EIR", " S ", 'R', mullak99.roxite, 'E', mullak99.endite, 'I', (new ItemStack(mullak99.swordRoxiteEE, 1, 32767)), 'S', (new ItemStack(mullak99.steelHammer, 1, 32767))});
		MCraftingManager.getInstance().addShapedRecipe(new ItemStack(mullak99.swordRoxiteEE), new Object[] {"RIE", " S ", 'R', mullak99.roxite, 'E', mullak99.endite, 'I', (new ItemStack(mullak99.swordRoxiteEE, 1, 32767)), 'S', (new ItemStack(mullak99.steelHammer, 1, 32767))});
		
		MCraftingManager.getInstance().addShapedRecipe(new ItemStack(mullak99.paxelRoxiteEE), new Object[] {"EIR", " S ", 'R', mullak99.roxite, 'E', mullak99.endite, 'I', (new ItemStack(mullak99.paxelRoxiteEE, 1, 32767)), 'S', (new ItemStack(mullak99.steelHammer, 1, 32767))});
		MCraftingManager.getInstance().addShapedRecipe(new ItemStack(mullak99.paxelRoxiteEE), new Object[] {"RIE", " S ", 'R', mullak99.roxite, 'E', mullak99.endite, 'I', (new ItemStack(mullak99.paxelRoxiteEE, 1, 32767)), 'S', (new ItemStack(mullak99.steelHammer, 1, 32767))});
		
		MCraftingManager.getInstance().addShapedRecipe(new ItemStack(mullak99.paxelIron), new Object[] {"-I-", " S ", '-', Item.ingotIron, 'I', (new ItemStack(mullak99.paxelIron, 1, 32767)), 'S', (new ItemStack(mullak99.steelHammer, 1, 32767))});
		MCraftingManager.getInstance().addShapedRecipe(new ItemStack(mullak99.paxelBronze), new Object[] {"-I-", " S ", '-', mullak99.ingotBronze, 'I', (new ItemStack(mullak99.paxelBronze, 1, 32767)), 'S', (new ItemStack(mullak99.steelHammer, 1, 32767))});
		MCraftingManager.getInstance().addShapedRecipe(new ItemStack(mullak99.paxelDiamond), new Object[] {"-I-", " S ", '-', Item.diamond, 'I', (new ItemStack(mullak99.paxelDiamond, 1, 32767)), 'S', (new ItemStack(mullak99.steelHammer, 1, 32767))});
		MCraftingManager.getInstance().addShapedRecipe(new ItemStack(mullak99.paxelSteel), new Object[] {"-I-", " S ", '-', mullak99.ingotSteel, 'I', (new ItemStack(mullak99.paxelSteel, 1, 32767)), 'S', (new ItemStack(mullak99.steelHammer, 1, 32767))});
		
		MCraftingManager.getInstance().addShapedRecipe(new ItemStack(mullak99.thorsHammer), new Object[] {"-I-", " S ", '-', mullak99.ingotUru, 'I', (new ItemStack(mullak99.thorsHammer, 1, 32767)), 'S', (new ItemStack(mullak99.enditeHammer, 1, 32767))});
		
		//Ender Battery
		
		if(mullak99.EnderBatteryCrafting) {
			MCraftingManager.getInstance().addShapedRecipe(new ItemStack(mullak99.BatteryEnder), new Object[] {" C ", "ASA", "AEA", "ASA", "ACA", 'C', mullak99.ingotCopper, 'A', mullak99.ingotAluminium, 'S', Item.netherStar, 'E', Block.dragonEgg});
			GameRegistry.addShapelessRecipe(new ItemStack(mullak99.BatteryEnder), mullak99.BatteryEmpty, Item.netherStar, Item.netherStar, Block.dragonEgg);
		}
		else {
			return;
		}
		if(mullak99.ModSpawnEggs) {
			MCraftingManager.getInstance().addShapedRecipe(new ItemStack(Item.monsterPlacer, 1, 3), new Object[] {"BBB", "B-B", "BMB", "B-B", "BBB", 'M', mullak99.mullite, 'B', mullak99.blood, '-', Item.bone});
			MCraftingManager.getInstance().addShapedRecipe(new ItemStack(Item.monsterPlacer, 1, 4), new Object[] {"BBB", "B-B", "BSB", "B-B", "BBB", 'S', Item.sign, 'B', mullak99.blood, '-', Item.bone});
			MCraftingManager.getInstance().addShapedRecipe(new ItemStack(Item.monsterPlacer, 1, 5), new Object[] {"BBB", "B-B", "BCB", "B-B", "BBB", 'C', Item.cookie, 'B', mullak99.blood, '-', Item.bone});
			MCraftingManager.getInstance().addShapedRecipe(new ItemStack(Item.monsterPlacer, 1, 6), new Object[] {"BBB", "B-B", "BMB", "B-B", "BBB", 'M', Item.melon, 'B', mullak99.blood, '-', Item.bone});
		}
		else {
			return;
		}
		
		//Vanilla Spawn Eggs
		if(mullak99.VanillaSpawnEggs) {
			MCraftingManager.getInstance().addShapedRecipe(new ItemStack(Item.monsterPlacer, 1, 90), new Object[] {"BBB", "WWW", "WEW", "WWW", "BBB", 'W', (new ItemStack(Block.cloth, 6, 6)), 'B', mullak99.blood, 'E', Item.egg});
			MCraftingManager.getInstance().addShapedRecipe(new ItemStack(Item.monsterPlacer, 1, 93), new Object[] {"BBB", "FFF", "FFF", "FFF", "BBB", 'F', Item.feather, 'B', mullak99.blood});
			MCraftingManager.getInstance().addShapedRecipe(new ItemStack(Item.monsterPlacer, 1, 92), new Object[] {"BBB", "LLL", "LEL", "LLL", "BBB", 'L', Item.leather, 'B', mullak99.blood, 'E', Item.egg});
			MCraftingManager.getInstance().addShapedRecipe(new ItemStack(Item.monsterPlacer, 1, 91), new Object[] {"BBB", "WWW", "WEW", "WWW", "BBB", 'W', (new ItemStack(Block.cloth, 0, 0)), 'B', mullak99.blood, 'E', Item.egg});
			MCraftingManager.getInstance().addShapedRecipe(new ItemStack(Item.monsterPlacer, 1, 120), new Object[] {"BBB", "GGG", "GEG", "GGG", "BBB", 'G', Item.emerald, 'B', mullak99.blood, 'E', Item.egg});
		}
		else {
			return;
		}
		
		//Smelting
		GameRegistry.addSmelting(mullak99.oreMullite.blockID, new ItemStack(mullak99.mullite), 0.1F);
		GameRegistry.addSmelting(mullak99.oreRoxite.blockID, new ItemStack(mullak99.roxite), 0.1F);
		GameRegistry.addSmelting(mullak99.oreCopper.blockID, new ItemStack(mullak99.ingotCopper), 0.1F);
		GameRegistry.addSmelting(mullak99.oreTin.blockID, new ItemStack(mullak99.ingotTin), 0.1F);
		GameRegistry.addSmelting(mullak99.muttonRaw.itemID, new ItemStack(mullak99.muttonCooked), 0.1F);
		GameRegistry.addSmelting(Item.rottenFlesh.itemID, new ItemStack(mullak99.fleshCooked), 0.1F);
		
		GameRegistry.addSmelting(mullak99.alphaCobble.blockID, new ItemStack(mullak99.alphaStone), 0F);
		GameRegistry.addSmelting(mullak99.marbleCobble.blockID, new ItemStack(mullak99.marble), 0F);
		
		GameRegistry.addSmelting(mullak99.dustMullite.itemID, new ItemStack(mullak99.mullite), 0F);
		GameRegistry.addSmelting(mullak99.dustRoxite.itemID, new ItemStack(mullak99.roxite), 0F);
		GameRegistry.addSmelting(mullak99.dustCopper.itemID, new ItemStack(mullak99.ingotCopper), 0F);
		GameRegistry.addSmelting(mullak99.dustTin.itemID, new ItemStack(mullak99.ingotTin), 0F);
		GameRegistry.addSmelting(mullak99.dustBronze.itemID, new ItemStack(mullak99.ingotBronze), 0F);
		GameRegistry.addSmelting(mullak99.dustCoal.itemID, new ItemStack(Item.coal), 0F);
		GameRegistry.addSmelting(mullak99.dustCharcoal.itemID, new ItemStack(Item.coal, 1, 1), 0F);
		GameRegistry.addSmelting(Block.glass.blockID, new ItemStack(mullak99.clearGlass), 0.1F);
		GameRegistry.addSmelting(Block.thinGlass.blockID, new ItemStack(mullak99.thinClearGlass), 0F);
		GameRegistry.addSmelting(mullak99.oreBauxite.blockID, new ItemStack(mullak99.aluminiumRaw), 0.1F);
		GameRegistry.addSmelting(mullak99.aluminiumRaw.itemID, new ItemStack(mullak99.ingotAluminium), 0.1F);
		GameRegistry.addSmelting(mullak99.dustAluminium.itemID, new ItemStack(mullak99.ingotAluminium), 0.1F);
		GameRegistry.addSmelting(mullak99.bauxite.itemID, new ItemStack(mullak99.aluminiumRaw), 0.1F);
		GameRegistry.addSmelting(mullak99.ingotSteelRaw.itemID, new ItemStack(mullak99.ingotSteel), 0.1F);
		GameRegistry.addSmelting(mullak99.dustAlpha.itemID,new ItemStack(mullak99.ingotAlpha), 0F);
	
		GameRegistry.addSmelting(mullak99.oreSulfur.blockID, new ItemStack(mullak99.sulfur, 4), 0.1F);
		GameRegistry.addSmelting(mullak99.oreNetherSulfur.blockID, new ItemStack(mullak99.sulfur, 8), 0.1F);
	}

}
