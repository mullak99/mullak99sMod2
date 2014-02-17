package mullak99.mullak99sMod.feature;

import mullak99.mullak99sMod.mullak99;
import mullak99.mullak99sMod.blocks.alphaSapling;
import net.minecraftforge.event.Event.Result;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.player.BonemealEvent;

public class AlphaTreeBonemeal {
	
	@ForgeSubscribe
    public void onUseBonemeal(BonemealEvent event)
    {
            if (event.ID == mullak99.alphaSapling.blockID)
            {
                    if (!event.world.isRemote)
                    {
                            ((alphaSapling) mullak99.alphaSapling).growTree(event.world, event.X, event.Y, event.Z, event.world.rand);
                    }
            }
    }

}
