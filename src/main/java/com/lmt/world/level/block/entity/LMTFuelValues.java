package com.lmt.world.level.block.entity;

import com.lmt.world.item.LMTItems;

import net.fabricmc.fabric.api.registry.FuelRegistryEvents;

public class LMTFuelValues {
	
	public static void initialize() {
		
		FuelRegistryEvents.BUILD.register((builder, context) -> {
			
			builder.add(LMTItems.SULFUR, 800);
			
		});
		
	}

}