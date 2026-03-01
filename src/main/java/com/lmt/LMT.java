package com.lmt;

import com.lmt.world.item.LMTCreativeModeTabs;
import com.lmt.world.item.LMTItems;

import net.fabricmc.api.ModInitializer;

public class LMT implements ModInitializer {
	
	public static final String MOD_ID = "lmt";
	
	@Override
	public void onInitialize() {
		
		LMTItems.initialize();
		LMTCreativeModeTabs.initialize();
		
	}
	
}