package mullak99.mullak99sMod.event;

import mullak99.mullak99sMod.mullak99;
import mullak99.mullak99sMod.blocks.alphaSapling;
import mullak99.mullakCore.mullakCore;
import net.minecraft.block.Block;
import net.minecraft.block.BlockCocoa;
import net.minecraft.block.BlockCrops;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.BlockSapling;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeHooks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.Event.Result;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.player.BonemealEvent;

public class mullak99TreeBonemealEvent {
	
    private int BlockID;
    
    @ForgeSubscribe
    public void bonemealUsed(BonemealEvent event) {

		if(event.world.getBlockId(event.X, event.Y, event.Z) == mullak99.alphaSapling.blockID)
			{
			   ((alphaSapling)mullak99.alphaSapling).markOrGrowMarked(event.world, event.X, event.Y, event.Z, event.world.rand);
			   event.setResult(Result.ALLOW);
			}

    	}
	 
}
