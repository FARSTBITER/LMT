package com.lmt;

import com.lmt.world.item.LMTCreativeModeTabs;
import com.lmt.world.item.LMTItems;
import com.lmt.world.level.block.entity.LMTFuelValues;

import net.fabricmc.api.ModInitializer;

public class LMT implements ModInitializer {
	
	public static final String MOD_ID = "lmt";
	
	@Override
	public void onInitialize() {
		
		LMTItems.initialize();
		LMTFuelValues.initialize();
		LMTCreativeModeTabs.initialize();
		
	}
	
}