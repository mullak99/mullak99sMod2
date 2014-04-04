package mullak99.mullak99sMod.handler;

import mullak99.mullak99sMod.mullak99Util;
import mullak99.mullak99sMod.mullak99;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.INetworkManager;
import net.minecraft.network.NetLoginHandler;
import net.minecraft.network.packet.NetHandler;
import net.minecraft.network.packet.Packet1Login;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.EnumChatFormatting;
import cpw.mods.fml.common.IPlayerTracker;
import cpw.mods.fml.common.network.IConnectionHandler;
import cpw.mods.fml.common.network.Player;

public class PlayerHandler implements IConnectionHandler, IPlayerTracker {


	@Override
	public void playerLoggedIn(Player player, NetHandler netHandler, INetworkManager manager) {
		if(mullak99.ShortHand) {
			if(mullak99Util.isDevVersionBoolean) {
				netHandler.getPlayer().addChatMessage(EnumChatFormatting.BOLD.toString() + EnumChatFormatting.AQUA.toString() + "- " + mullak99Util.ModID + ", " + mullak99Util.ShortVersion + mullak99Util.DevState + mullak99Util.DevStateNo + " -");
			} else {
				netHandler.getPlayer().addChatMessage(EnumChatFormatting.BOLD.toString() + EnumChatFormatting.AQUA.toString() + "- " + mullak99Util.ModID + ", " + mullak99Util.ShortVersion + " -");
			}
		} else {
			if(mullak99Util.isDevVersionBoolean) {
				netHandler.getPlayer().addChatMessage(EnumChatFormatting.BOLD.toString() + EnumChatFormatting.AQUA.toString() + "- " + mullak99Util.ModID + ", " + mullak99Util.LongVersion + " " + mullak99Util.DevState + mullak99Util.DevStateNo + " -");
			} else {
				netHandler.getPlayer().addChatMessage(EnumChatFormatting.BOLD.toString() + EnumChatFormatting.AQUA.toString() + "- " + mullak99Util.ModID + ", " + mullak99Util.LongVersion + " -");
			}
		}
	
	}

	@Override
	public String connectionReceived(NetLoginHandler netHandler, INetworkManager manager) {
		return null;
	}

	@Override
	public void connectionOpened(NetHandler netClientHandler, String server, int port, INetworkManager manager) {
		
	}

	@Override
	public void connectionOpened(NetHandler netClientHandler, MinecraftServer server, INetworkManager manager) {
		
	}

	@Override
	public void connectionClosed(INetworkManager manager) {
		
	}

	@Override
	public void clientLoggedIn(NetHandler clientHandler, INetworkManager manager, Packet1Login login) {
		
	}

	@Override
	public void onPlayerLogin(EntityPlayer player) {
		
	}

	@Override
	public void onPlayerLogout(EntityPlayer player) {
		
	}

	@Override
	public void onPlayerChangedDimension(EntityPlayer player) {
		
	}

	@Override
	public void onPlayerRespawn(EntityPlayer player) {
		
	}

}
