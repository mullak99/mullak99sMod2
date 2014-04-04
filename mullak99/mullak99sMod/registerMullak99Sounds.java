package mullak99.mullak99sMod;

import net.minecraftforge.client.event.sound.SoundLoadEvent;
import net.minecraftforge.event.ForgeSubscribe;

public class registerMullak99Sounds {
	
	@ForgeSubscribe
	public void onSound(SoundLoadEvent event) {
		event.manager.addSound("mullak99:mobs/mullak99Hurt.ogg");
		event.manager.addSound("mullak99:mobs/ThundercoyoteHurt.ogg");
		event.manager.addSound("mullak99:mobs/Pro_Ninja_GamerHurt.ogg");
		event.manager.addSound("mullak99:mobs/lucozade_wallerHurt.ogg");
	}

}
