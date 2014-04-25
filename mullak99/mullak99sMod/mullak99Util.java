package mullak99.mullak99sMod;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

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
	
	public static final String NBT_ITEM_CRAFTING_GUI_OPEN = "itemCraftingGuiOpen";
	
	public static URL currentVersionSRC;
	public static BufferedReader currentVersion;
	public static String currentVersionText;
	
	
	public static String mullak99sMod2String = "[" + ModID +"] ";
	public static String MTNTDisabledMSG = mullak99sMod2String + "Mullite TNT explosion is currently disabled on this client/server, but you can still place it";
	public static String MTNTWARNING = mullak99sMod2String + "Mullite TNT could cause lag, crashes, corruption and massive destruction, use with caution!";
	
	public static final int AdvancedCraftingTable = 0;
	public static final int PortableCrafting = 1;
	
	public void VersionChecker() {
		
		try {
			currentVersionSRC = new URL("https://raw.githubusercontent.com/mullak99/mullak99sMod2/master/version/currentVersion.txt");
			currentVersion = new BufferedReader(new InputStreamReader(currentVersionSRC.openStream()));
			
			
			while ((currentVersionText = currentVersion.readLine()) != null) {
                System.out.println(currentVersionText);
            }
            
		} catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
	
	
	
	
	public static void CoreLoaded() {
		
	
		//Are essential mods loaded?
	
			/* *
			 * Checks if mullakCore is installed, Gives Log message for easier debugging
			 */
			if(Loader.isModLoaded("mullakCore")) {
				System.out.println("[mullak99's Mod 2] Sucess: mullakCore Found!");
			}
			
			else {
				System.out.println("[mullak99's Mod 2] Error: mullakCore not found!");
				System.exit(1);
			}
	}
	
	private static void initNBTTagCompound(ItemStack itemStack)
    {

        if (itemStack.stackTagCompound == null)
        {
            itemStack.setTagCompound(new NBTTagCompound());
        }
    }
	
	public static void setBoolean(ItemStack itemStack, String keyName, boolean keyValue)
    {

        initNBTTagCompound(itemStack);

        itemStack.stackTagCompound.setBoolean(keyName, keyValue);
    }
	
	public static String OldModVersionWarning;
	
	public static void VersionChecker(FMLPreInitializationEvent event) {
		//OldModVersionWarning = mullak99sMod2String + "You are using version" + event.getModMetadata().version + "and the latest version is " + currentVersionText + ", consider updating.";
		
	}
}
