package com.lmt.world.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Items;

public class LMTCreativeModeTabs {
	
	public static void initialize() {
		
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.INGREDIENTS).register((itemGroup) -> {
			
			itemGroup.addAfter(Items.COAL, LMTItems.SULFUR);
			
		});
		
	}

}