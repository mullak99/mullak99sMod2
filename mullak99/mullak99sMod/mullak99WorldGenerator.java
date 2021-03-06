package mullak99.mullak99sMod;

import java.util.Random;

import mullak99.mullakCore.gen.WorldGenEndMinable;
import mullak99.mullakCore.gen.WorldGenNetherMinable;
import net.minecraft.world.World;
import net.minecraft.world.WorldProviderEnd;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class mullak99WorldGenerator implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch(world.provider.dimensionId) {
		case 1 : generateEnd(world, random, chunkX*16, chunkZ*16);
		case 0 : generateSurface(world, random, chunkX*16, chunkZ*16);
		case -1 : generateNether(world, random, chunkX*16, chunkZ*16);
		}

	}

	private void generateSurface(World world, Random random, int BlockX, int BlockZ) {
		if(mullak99.MulliteGen) {
			for(int i =0; i<1; i++) {
				int Xcoord = BlockX + random.nextInt(16);
				int Zcoord = BlockZ + random.nextInt(16);
				int Ycoord = random.nextInt(11);
				
				(new WorldGenMinable (mullak99.oreMullite.blockID, 2)).generate(world, random, Xcoord, Ycoord, Zcoord);
			}
		}
		
		if(mullak99.RoxiteGen) {
			for(int i =0; i<1; i++) {
				int Xcoord = BlockX + random.nextInt(16);
				int Zcoord = BlockZ + random.nextInt(16);
				int Ycoord = random.nextInt(11);
				
				(new WorldGenMinable (mullak99.oreRoxite.blockID, 2)).generate(world, random, Xcoord, Ycoord, Zcoord);
			}
		}
		if(mullak99.CopperGen){
			for(int i =0; i<10; i++) {
				int Xcoord = BlockX + random.nextInt(16);
				int Zcoord = BlockZ + random.nextInt(16);
				int Ycoord = random.nextInt(64);
					
				(new WorldGenMinable (mullak99.oreCopper.blockID, 8)).generate(world, random, Xcoord, Ycoord, Zcoord);
				
			}
		}
		if(mullak99.TinGen) {
			for(int i =0; i<9; i++) {
				int Xcoord = BlockX + random.nextInt(16);
				int Zcoord = BlockZ + random.nextInt(16);
				int Ycoord = random.nextInt(64);
					
				(new WorldGenMinable (mullak99.oreTin.blockID, 8)).generate(world, random, Xcoord, Ycoord, Zcoord);
				
			}	
		}
		if(mullak99.AlphaGen) {
			for(int i =0; i<7; i++) {
				int Xcoord = BlockX + random.nextInt(16);
				int Zcoord = BlockZ + random.nextInt(16);
				int Ycoord = random.nextInt(45);
					
				(new WorldGenMinable (mullak99.oreAlpha.blockID, 3)).generate(world, random, Xcoord, Ycoord, Zcoord);
				
			}
		}
		if(mullak99.BauxiteGen) {
			for(int i =0; i<7; i++) {
				int Xcoord = BlockX + random.nextInt(16);
				int Zcoord = BlockZ + random.nextInt(16);
				int Ycoord = random.nextInt(45);
					
				(new WorldGenMinable (mullak99.oreBauxite.blockID, 5)).generate(world, random, Xcoord, Ycoord, Zcoord);
				
			}
		}
		if(mullak99.SilverGen) {
			for(int i =0; i<8; i++) {
				int Xcoord = BlockX + random.nextInt(16);
				int Zcoord = BlockZ + random.nextInt(16);
				int Ycoord = random.nextInt(40);
					
				(new WorldGenMinable (mullak99.oreSilver.blockID, 4)).generate(world, random, Xcoord, Ycoord, Zcoord);
				
			}
		}
		if(mullak99.SulfurGen) {
			for(int i =0; i<4; i++) {
				int Xcoord = BlockX + random.nextInt(16);
				int Zcoord = BlockZ + random.nextInt(16);
				int Ycoord = random.nextInt(16);
					
				(new WorldGenMinable (mullak99.oreSulfur.blockID, 10)).generate(world, random, Xcoord, Ycoord, Zcoord);
				
			}
		}
	}
	
	private void generateNether(World world, Random random, int BlockX, int BlockZ) {
		
		if(mullak99.NetherSulfurGen) {
			for(int i =0; i<10; i++) {
				int Xcoord = BlockX + random.nextInt(16);
				int Zcoord = BlockZ + random.nextInt(16);
				int Ycoord = random.nextInt(126);
					
				(new WorldGenNetherMinable (mullak99.oreNetherSulfur.blockID, 6)).generate(world, random, Xcoord, Ycoord, Zcoord);
				
			}
		}
	}
	
	private void generateEnd(World world, Random random, int BlockX, int BlockZ) {
		if(mullak99.EnditeGen) {
			for(int i =0; i<325; i++) {
				int Xcoord = BlockX + random.nextInt(16);
				int Zcoord = BlockZ + random.nextInt(16);
				int Ycoord = random.nextInt(100);
					
				(new WorldGenEndMinable (mullak99.oreEndite.blockID, 3)).generate(world, random, Xcoord, Ycoord, Zcoord);
				
			}
		}
	}
}
