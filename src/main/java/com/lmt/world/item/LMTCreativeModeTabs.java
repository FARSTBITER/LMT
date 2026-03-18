package com.lmt.world.item;

import com.lmt.world.level.block.LMTBlocks;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Items;

public class LMTCreativeModeTabs {
	
	public static void initialize() {
		
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.INGREDIENTS).register((itemGroup) -> {
			
			itemGroup.addBefore(Items.COAL, LMTItems.NITER);
			itemGroup.addBefore(Items.QUARTZ, LMTItems.SULFUR);
			itemGroup.addBefore(Items.LEATHER, LMTItems.RAG);
			
		});
		
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register((itemGroup) -> {
			
			itemGroup.addAfter(Items.COAL_BLOCK, LMTBlocks.CHARCOAL_BLOCK);
			itemGroup.addBefore(Items.COAL_BLOCK, LMTBlocks.SULFUR_BLOCK);
			itemGroup.addBefore(LMTBlocks.SULFUR_BLOCK, LMTBlocks.NITER_BLOCK);
			
		});
		
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.NATURAL_BLOCKS).register((itemGroup) -> {
			
			itemGroup.addBefore(Items.COAL_ORE, LMTBlocks.NITER_ORE);
			itemGroup.addAfter(LMTBlocks.NITER_ORE, LMTBlocks.DEEPSLATE_NITER_ORE);
			itemGroup.addAfter(Items.NETHER_QUARTZ_ORE, LMTBlocks.NETHER_SULFUR_ORE);
			
		});
		
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.FOOD_AND_DRINKS).register((itemGroup) -> {
			
			itemGroup.addAfter(Items.ROTTEN_FLESH, LMTItems.JERKY);
			itemGroup.addAfter(Items.PUMPKIN_PIE, LMTItems.FRIED_EGG);
			
		});
		
	}

}