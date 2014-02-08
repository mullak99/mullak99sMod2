package mullak99.mullak99sMod;

import net.minecraftforge.client.event.sound.SoundLoadEvent;
import net.minecraftforge.event.ForgeSubscribe;

public class registerMullak99Sounds {
	
	@ForgeSubscribe
	public void onSound(SoundLoadEvent event) {
		event.manager.addSound("mullak99:sound/step/grass1.ogg");
		event.manager.addSound("mullak99:sound/step/grass2.ogg");
		event.manager.addSound("mullak99:sound/step/grass3.ogg");
		event.manager.addSound("mullak99:sound/step/grass4.ogg");
		event.manager.addSound("mullak99:sound/step/grass5.ogg");
		event.manager.addSound("mullak99:sound/step/grass6.ogg");
		event.manager.addSound("mullak99:sound/step/stone1.ogg");
		event.manager.addSound("mullak99:sound/step/stone2.ogg");
		event.manager.addSound("mullak99:sound/step/stone3.ogg");
		event.manager.addSound("mullak99:sound/step/stone4.ogg");
		event.manager.addSound("mullak99:sound/step/stone5.ogg");
		event.manager.addSound("mullak99:sound/step/stone6.ogg");
	}

}
