package mullak99.mullak99sMod;

import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Loader;

public class mullak99Util {
	
	public static String ModID = "mullak99's Mod 2";
	
	public static String DevCapePicURL = "https://raw.github.com/mullak99/mullak99sMod2/master/capes/DevCape/DevCape.png";
	public static String DevCapeTXTURL = "https://raw.github.com/mullak99/mullak99sMod2/master/capes/DevCape/DevCapes.txt";
	
	public static String TesterCapePicURL = "https://raw.github.com/mullak99/mullak99sMod2/master/capes/TesterCape/TesterCape.png";
	public static String TesterCapeTXTURL = "https://raw.github.com/mullak99/mullak99sMod2/master/capes/TesterCape/TesterCapes.txt";
	
	public static String YoutuberCapePicURL = "https://raw.github.com/mullak99/mullak99sMod2/master/capes/YoutuberCape/YoutuberCape.png";
	public static String YoutuberCapeTXTURL = "https://raw2.github.com/mullak99/mullak99sMod2/master/capes/YoutuberCape/YoutuberCapes.txt";
	
	public static String DonatorCape1PicURL = "https://raw.github.com/mullak99/mullak99sMod2/master/capes/DonatorCape1/DonatorCape1.png";
	public static String DonatorCape1TXTURL = "https://raw.github.com/mullak99/mullak99sMod2/master/capes/DonatorCape1/DonatorCape1.txt";
	
	public static String DonatorCape2PicURL = "https://raw.github.com/mullak99/mullak99sMod2/master/capes/DonatorCape1/DonatorCape2.png";
	public static String DonatorCape2TXTURL = "https://raw.github.com/mullak99/mullak99sMod2/master/capes/DonatorCape1/DonatorCape2.txt";
	
	public static String DonatorCape3PicURL = "https://raw.github.com/mullak99/mullak99sMod2/master/capes/DonatorCape1/DonatorCape3.png";
	public static String DonatorCape3TXTURL = "https://raw.github.com/mullak99/mullak99sMod2/master/capes/DonatorCape1/DonatorCape3.txt";
	
	public static String MelonCapePicURL = "https://raw.github.com/mullak99/mullak99sMod2/master/capes/MelonCape/MelonCape.png";
	public static String MelonCapeTXTURL = "https://raw.github.com/mullak99/mullak99sMod2/master/capes/MelonCape/MelonCape.txt";
	
	
	public static void CoreLoaded() {
		
	
		//Are essential mods loaded?
	
			/* *
			 * Checks if mullakCore is installed, Gives Log message for easier debugging
			 */
			if(Loader.isModLoaded("mullakCore")) {
				FMLLog.fine("[mullak99's Mod] Sucess: mullakCore Found!");
			}
			
			else {
				FMLLog.severe("[mullak99's Mod] Error: mullakCore not found!");
				System.exit(1);
			}
	}

}
