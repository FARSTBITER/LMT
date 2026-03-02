package com.lmt.world.item;

import com.lmt.world.level.block.LMTBlocks;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Items;

public class LMTCreativeModeTabs {
	
	public static void initialize() {
		
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.INGREDIENTS).register((itemGroup) -> {
			
			itemGroup.addAfter(Items.QUARTZ, LMTItems.SULFUR);
			
		});
		
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register((itemGroup) -> {
			
			itemGroup.addAfter(Items.QUARTZ_BLOCK, LMTBlocks.SULFUR_BLOCK);
			
		});
		
	}

}