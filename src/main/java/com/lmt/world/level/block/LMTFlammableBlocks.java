package com.lmt.world.level.block;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;

public class LMTFlammableBlocks {
	
	public static void initialize() {
		
		FlammableBlockRegistry.getDefaultInstance().add(LMTBlocks.SALTPETER_BLOCK, 10, 10);
		FlammableBlockRegistry.getDefaultInstance().add(LMTBlocks.SULFUR_BLOCK, 10, 10);
		
	}

}