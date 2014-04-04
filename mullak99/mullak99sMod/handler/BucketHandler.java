package mullak99.mullak99sMod.handler;

import java.util.HashMap;
import java.util.Map;
import mullak99.mullak99sMod.mullak99;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import net.minecraftforge.event.Event.Result;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.player.FillBucketEvent;

public class BucketHandler {

        @ForgeSubscribe
        public void onTryToFillBucket(FillBucketEvent event) {
        	if(event.current.itemID != Item.bucketEmpty.itemID) return;
        	
        	ItemStack fullBucket = getFluidBucket(event.world, event.target);
        	
        	if(fullBucket == null) return;
        	
        	event.world.setBlockToAir(event.target.blockX, event.target.blockY, event.target.blockZ);
        	event.result = fullBucket;
        	event.setResult(Result.ALLOW);
        }
        
        @ForgeSubscribe
        public void onTryToFillBottle(FillBucketEvent event) {
        	if(event.current.itemID != Item.glassBottle.itemID) return;
        	
        	ItemStack fullBottle = getFluidBottle(event.world, event.target);
        	
        	if(fullBottle == null) return;
        	
        	event.world.setBlockToAir(event.target.blockX, event.target.blockY, event.target.blockZ);
        	event.result = fullBottle;
        	event.setResult(Result.ALLOW);
        }
        
        
        
        private ItemStack getFluidBucket(World world, MovingObjectPosition pos) {
        	int blockID = world.getBlockId(pos.blockX, pos.blockY, pos.blockZ);
        	if(blockID == mullak99.bloodLiquid.blockID) return new ItemStack(mullak99.bloodBucket);

        	
        	return null;
        }
        
        private ItemStack getFluidBottle(World world, MovingObjectPosition pos) {
        	ItemStack k = new ItemStack(Item.potion, 1);
        	int blockID = world.getBlockId(pos.blockX, pos.blockY, pos.blockZ);
        	if(blockID == mullak99.bloodLiquid.blockID) return new ItemStack(mullak99.blood);
    	
    	if(k.equals(k)) {
    		k.stackSize--;
    	}
        	return null;
        }
}