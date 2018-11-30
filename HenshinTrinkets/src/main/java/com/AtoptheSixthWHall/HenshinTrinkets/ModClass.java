package com.AtoptheSixthWHall.HenshinTrinkets;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

@Mod(modid = Reference.ModID, version = Reference.Version, name = Reference.ModName, dependencies = Reference.Dependencies )
public class ModClass {

	public static Item itemTransform;
	
	@EventHandler
	public void PreInit(FMLPreInitializationEvent event)
	{
		//For Initialization of blocks and Items
		itemTransform = new ItemTransform().setUnlocalizedName("ItemTransform").setTextureName("htrinkets:itemtransformation");
		GameRegistry.registerItem(itemTransform, itemTransform.getUnlocalizedName().substring(5));
		//Configuration Handling!
	}
	@EventHandler
	public void Init(FMLInitializationEvent event) {
		//Proxy, Tile, Entities, GUI and PacketHandling
		
	}
	@EventHandler
	public void PostInit(FMLPostInitializationEvent event) {
		
	}
}
