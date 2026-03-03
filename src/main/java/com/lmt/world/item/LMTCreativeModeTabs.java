package com.lmt.world.item;

import com.lmt.world.level.block.LMTBlocks;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Items;

public class LMTCreativeModeTabs {
	
	public static void initialize() {
		
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.INGREDIENTS).register((itemGroup) -> {
			
			itemGroup.addBefore(Items.QUARTZ, LMTItems.SULFUR);
			itemGroup.addAfter(Items.COAL, LMTItems.SALTPETER);
			
		});
		
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register((itemGroup) -> {
			
			itemGroup.addBefore(Items.REDSTONE_BLOCK, LMTBlocks.SULFUR_BLOCK);
			
		});
		
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.NATURAL_BLOCKS).register((itemGroup) -> {
			
			itemGroup.addBefore(Items.NETHER_QUARTZ_ORE, LMTBlocks.NETHER_SULFUR_ORE);
			
		});
		
	}

}