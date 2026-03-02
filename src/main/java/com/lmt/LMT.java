package com.lmt;

import com.lmt.world.item.LMTCreativeModeTabs;
import com.lmt.world.item.LMTItems;
import com.lmt.world.level.block.LMTBlocks;
import com.lmt.world.level.block.LMTFlammableBlocks;
import com.lmt.world.level.block.entity.LMTFuelValues;
import com.lmt.world.level.storage.loot.LMTLootTables;

import net.fabricmc.api.ModInitializer;

public class LMT implements ModInitializer {
	
	public static final String MOD_ID = "lmt";
	
	@Override
	public void onInitialize() {
		
		LMTBlocks.initialize();
		LMTFlammableBlocks.initialize();
		LMTItems.initialize();
		LMTFuelValues.initialize();
		LMTLootTables.initialize();
		LMTCreativeModeTabs.initialize();
		
	}
	
}