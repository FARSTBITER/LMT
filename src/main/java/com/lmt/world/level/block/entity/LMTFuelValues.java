package com.lmt.world.level.block.entity;

import com.lmt.world.item.LMTItems;
import com.lmt.world.level.block.LMTBlocks;

import net.fabricmc.fabric.api.registry.FuelRegistryEvents;

public class LMTFuelValues {
	
	public static void initialize() {
		
		FuelRegistryEvents.BUILD.register((builder, context) -> {
			
			builder.add(LMTBlocks.SULFUR_BLOCK, 8000);
			builder.add(LMTBlocks.NITER_BLOCK, 8000);
			builder.add(LMTItems.SULFUR, 800);
			builder.add(LMTItems.NITER, 800);
			
		});
		
	}

}