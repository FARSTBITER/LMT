package com.lmt.world.level.block.entity;

import com.lmt.world.item.LMTItems;
import com.lmt.world.level.block.LMTBlocks;

import net.fabricmc.fabric.api.registry.FuelValueEvents;

public class LMTFuelValues {
	
	public static void initialize() {
		
		FuelValueEvents.BUILD.register((builder, context) -> {
			
			if(context.registries() != null) {
			
				builder.add(LMTBlocks.CHARCOAL_BLOCK, 16000);
				builder.add(LMTBlocks.SULFUR_BLOCK, 8000);
				builder.add(LMTBlocks.NITER_BLOCK, 8000);
				builder.add(LMTItems.SULFUR, 800);
				builder.add(LMTItems.NITER, 800);
			
			}
			
		});
		
	}

}