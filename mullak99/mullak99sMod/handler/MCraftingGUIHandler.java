package mullak99.mullak99sMod.handler;

import mullak99.mullak99sMod.mullak99;
import mullak99.mullak99sMod.container.ContainerMCrafting;
import mullak99.mullak99sMod.gui.MCraftingGUI;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

public class MCraftingGUIHandler implements IGuiHandler {

@Override
public Object getServerGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {

switch(id)
{
case 1: return id == 1 && world.getBlockId(x, y, z) == mullak99.MCraftingTable.blockID ? new ContainerMCrafting(player.inventory, world, x, y, z) : null;
}
return null;
}

@Override
public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {

switch(id)
{
case 1: return id == 1 && world.getBlockId(x, y, z) == mullak99.MCraftingTable.blockID ? new MCraftingGUI(player.inventory, world, x, y, z) : null;
}
return null;
}
}