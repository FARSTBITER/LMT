package com.lmt.world.item;

import com.lmt.world.level.block.LMTBlocks;

import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Items;

public class LMTCreativeModeTabs {
	
	public static void initialize() {
		
		CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.INGREDIENTS).register((itemGroup) -> {
			
			itemGroup.insertBefore(Items.COAL, LMTItems.NITER);
			itemGroup.insertBefore(Items.QUARTZ, LMTItems.SULFUR);
			itemGroup.insertBefore(Items.LEATHER, LMTItems.RAG);
			
		});
		
		CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.BUILDING_BLOCKS).register((itemGroup) -> {
			
			itemGroup.insertAfter(Items.COAL_BLOCK, LMTBlocks.CHARCOAL_BLOCK);
			itemGroup.insertBefore(Items.COAL_BLOCK, LMTBlocks.SULFUR_BLOCK);
			itemGroup.insertBefore(LMTBlocks.SULFUR_BLOCK, LMTBlocks.NITER_BLOCK);
			
		});
		
		CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.NATURAL_BLOCKS).register((itemGroup) -> {
			
			itemGroup.insertBefore(Items.COAL_ORE, LMTBlocks.NITER_ORE);
			itemGroup.insertAfter(LMTBlocks.NITER_ORE, LMTBlocks.DEEPSLATE_NITER_ORE);
			itemGroup.insertAfter(Items.NETHER_QUARTZ_ORE, LMTBlocks.NETHER_SULFUR_ORE);
			
		});
		
		CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.FOOD_AND_DRINKS).register((itemGroup) -> {
			
			itemGroup.insertAfter(Items.ROTTEN_FLESH, LMTItems.JERKY);
			itemGroup.insertAfter(Items.PUMPKIN_PIE, LMTItems.FRIED_EGG);
			
		});
		
	}

}