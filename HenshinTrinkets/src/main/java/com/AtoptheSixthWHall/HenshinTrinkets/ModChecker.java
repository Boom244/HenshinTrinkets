package com.AtoptheSixthWHall.HenshinTrinkets;

import cpw.mods.fml.common.Loader;

public class ModChecker {
public static boolean isArmorersWorkshopLoaded;
public ModChecker() {
	
this.isArmorersWorkshopLoaded = Loader.isModLoaded("Armourer's Workshop");
	
 }
}
