package mullak99.mullak99sMod.mobs;

import mullak99.mullak99sMod.tileentity.TileEntityAlphaFurnace;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraft.util.ChatMessageComponent;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.world.World;

public class mullak99EntityPlayer extends EntityPlayer {

	public mullak99EntityPlayer(World par1World, String par2Str) {
		super(par1World, par2Str);
		// TODO Auto-generated constructor stub
	}
	
	public void displayGUIFurnace(TileEntityAlphaFurnace par1TileEntityAlphaFurnace) {}

	@Override
	public void sendChatToPlayer(ChatMessageComponent chatmessagecomponent) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean canCommandSenderUseCommand(int i, String s) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ChunkCoordinates getPlayerCoordinates() {
		// TODO Auto-generated method stub
		return null;
	}

}
