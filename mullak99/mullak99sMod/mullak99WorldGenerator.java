package mullak99.mullak99sMod;

import java.util.Random;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class mullak99WorldGenerator implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch(world.provider.dimensionId) {
		case 0 : generateSurface(world, random, chunkX*16, chunkZ*16);
		
		}

	}

	private void generateSurface(World world, Random random, int BlockX, int BlockZ) {
		for(int i =0; i<1; i++) {
			int Xcoord = BlockX + random.nextInt(16);
			int Zcoord = BlockZ + random.nextInt(16);
			int Ycoord = random.nextInt(12);
			
			(new WorldGenMinable (mullak99.oreMullite.blockID, 2)).generate(world, random, Xcoord, Ycoord, Zcoord);
		}
		
		for(int i =0; i<1; i++) {
			int Xcoord = BlockX + random.nextInt(16);
			int Zcoord = BlockZ + random.nextInt(16);
			int Ycoord = random.nextInt(12);
			
			(new WorldGenMinable (mullak99.oreRoxite.blockID, 2)).generate(world, random, Xcoord, Ycoord, Zcoord);
		}
		
		for(int i =0; i<10; i++) {
			int Xcoord = BlockX + random.nextInt(16);
			int Zcoord = BlockZ + random.nextInt(16);
			int Ycoord = random.nextInt(63);
				
			(new WorldGenMinable (mullak99.oreCopper.blockID, 10)).generate(world, random, Xcoord, Ycoord, Zcoord);
			
		}
		
		for(int i =0; i<9; i++) {
			int Xcoord = BlockX + random.nextInt(16);
			int Zcoord = BlockZ + random.nextInt(16);
			int Ycoord = random.nextInt(63);
				
			(new WorldGenMinable (mullak99.oreTin.blockID, 8)).generate(world, random, Xcoord, Ycoord, Zcoord);
			
		}	
		
		for(int i =0; i<9; i++) {
			int Xcoord = BlockX + random.nextInt(16);
			int Zcoord = BlockZ + random.nextInt(16);
			int Ycoord = random.nextInt(50);
				
			(new WorldGenMinable (mullak99.oreAlpha.blockID, 6)).generate(world, random, Xcoord, Ycoord, Zcoord);
			
		}
		
	}

}
