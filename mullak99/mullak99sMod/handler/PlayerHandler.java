package mullak99.mullak99sMod.handler;

import mullak99.mullak99sMod.mullak99;
import mullak99.mullak99sMod.mullak99Util;
import mullak99.mullak99sMod.mullak99VersionInfo;
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
		if (mullak99.JoinMsg) {
			if(mullak99VersionInfo.isDevVersion && !mullak99VersionInfo.isPreVersion) {
				if(mullak99.ShortHand) {
					netHandler.getPlayer().addChatMessage(EnumChatFormatting.BOLD.toString() + EnumChatFormatting.AQUA.toString() + "= " + mullak99Util.ModID + ", " + mullak99VersionInfo.ShortVersion + mullak99VersionInfo.DevStateS + mullak99VersionInfo.DevStateNo + " =");
				} else {
					netHandler.getPlayer().addChatMessage(EnumChatFormatting.BOLD.toString() + EnumChatFormatting.AQUA.toString() + "= " + mullak99Util.ModID + ", " + mullak99VersionInfo.LongVersion + " " + mullak99VersionInfo.DevState + mullak99VersionInfo.DevStateNo + " =");
				}
			}
			else if(!mullak99VersionInfo.isDevVersion && mullak99VersionInfo.isPreVersion) {
				if(mullak99.ShortHand) {
					netHandler.getPlayer().addChatMessage(EnumChatFormatting.BOLD.toString() + EnumChatFormatting.AQUA.toString() + "= " + mullak99Util.ModID + ", " + mullak99VersionInfo.ShortVersion + mullak99VersionInfo.PreStateS + mullak99VersionInfo.PreStateNo + " =");
				} else {
					netHandler.getPlayer().addChatMessage(EnumChatFormatting.BOLD.toString() + EnumChatFormatting.AQUA.toString() + "= " + mullak99Util.ModID + ", " + mullak99VersionInfo.LongVersion + " " + mullak99VersionInfo.PreState + mullak99VersionInfo.PreStateNo + " =");
				}
			} 
			else if(mullak99VersionInfo.isDevVersion && mullak99VersionInfo.isPreVersion) {
				if(mullak99.ShortHand) {
					netHandler.getPlayer().addChatMessage(EnumChatFormatting.BOLD.toString() + EnumChatFormatting.AQUA.toString() + "= " + mullak99Util.ModID + ", " + mullak99VersionInfo.ShortVersion + mullak99VersionInfo.PreStateS + mullak99VersionInfo.PreStateNo + " - " + mullak99VersionInfo.DevStateS + mullak99VersionInfo.DevStateNo + " =");
				} else {
					netHandler.getPlayer().addChatMessage(EnumChatFormatting.BOLD.toString() + EnumChatFormatting.AQUA.toString() + "= " + mullak99Util.ModID + ", " + mullak99VersionInfo.LongVersion + " " + mullak99VersionInfo.PreState + mullak99VersionInfo.PreStateNo + " - " + mullak99VersionInfo.DevState + mullak99VersionInfo.DevStateNo + " =");
				}
			} else if(!mullak99VersionInfo.isDevVersion && !mullak99VersionInfo.isPreVersion) {
				if(mullak99.ShortHand) {
					netHandler.getPlayer().addChatMessage(EnumChatFormatting.BOLD.toString() + EnumChatFormatting.AQUA.toString() + "= " + mullak99Util.ModID + ", " + mullak99VersionInfo.ShortVersion + " =");
				} else {
					netHandler.getPlayer().addChatMessage(EnumChatFormatting.BOLD.toString() + EnumChatFormatting.AQUA.toString() + "= " + mullak99Util.ModID + ", " + mullak99VersionInfo.LongVersion + " =");
				}
			} else {
				System.out.println(mullak99Util.mullak99sMod2String + "Error in playerLoggedIn, PlayerHandler.class - Please report this to mullak99");
			}
		} else {
			return;
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
