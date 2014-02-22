package mullak99.mullak99sMod;

import net.minecraftforge.client.event.sound.SoundLoadEvent;
import net.minecraftforge.event.ForgeSubscribe;

public class registerMullak99Sounds {
	
	@ForgeSubscribe
	public void onSound(SoundLoadEvent event) {
		event.manager.addSound("mullak99:mob/mullak99_Living.ogg");
		event.manager.addSound("mullak99:mob/mullak99_Death.ogg");
		event.manager.addSound("mullak99:mob/mullak99_Hurt.ogg");
		
		event.manager.addSound("mullak99:mob/Thundercoyote_Living.ogg");
		event.manager.addSound("mullak99:mob/Thundercoyote_Death.ogg");
		event.manager.addSound("mullak99:mob/Thundercoyote_Hurt.ogg");
	}

}
