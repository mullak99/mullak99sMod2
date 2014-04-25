package mullak99.Addons.nuclear;

import java.util.Random;

import mullak99.mullakCore.gen.WorldGenEndMinable;
import mullak99.mullakCore.gen.WorldGenNetherMinable;
import net.minecraft.world.World;
import net.minecraft.world.WorldProviderEnd;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class NuclearWorldGenerator implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch(world.provider.dimensionId) {
		case 1 : generateEnd(world, random, chunkX*16, chunkZ*16);
		case 0 : generateSurface(world, random, chunkX*16, chunkZ*16);
		case -1 : generateNether(world, random, chunkX*16, chunkZ*16);
		}

	}

	private void generateSurface(World world, Random random, int BlockX, int BlockZ) {
		if(NuclearAddon.UraniumGen) {
			for(int i =0; i<4; i++) {
				int Xcoord = BlockX + random.nextInt(16);
				int Zcoord = BlockZ + random.nextInt(16);
				int Ycoord = random.nextInt(20);
					
				(new WorldGenMinable (NuclearAddon.oreUranium.blockID, 4)).generate(world, random, Xcoord, Ycoord, Zcoord);
				
			}
		}
		
	}
	
	private void generateNether(World world, Random random, int BlockX, int BlockZ) {
		
		
	}
	
	private void generateEnd(World world, Random random, int BlockX, int BlockZ) {

		
	}
}
