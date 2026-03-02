package com.lmt.world.level.storage.loot;

import com.lmt.world.item.LMTItems;

import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;

public class LMTLootTables {
	
	private static final Identifier BLAZE_KEY =  Identifier.fromNamespaceAndPath("minecraft", "entities/blaze");
	
	public static void initialize() {
			
			LootTableEvents.MODIFY.register((key, tableBuilder, source, registry) -> {
				
				if(BLAZE_KEY.equals(key.identifier())) {
					
					LootPool.Builder poolBuilder = LootPool.lootPool()
							.setRolls(ConstantValue.exactly(1))
							.conditionally(LootItemRandomChanceCondition.randomChance(0.3F).build())
							.with(LootItem.lootTableItem(LMTItems.SULFUR).build())
							.apply(SetItemCountFunction.setCount(UniformGenerator.between(0, 1)).build());
							
					tableBuilder.pool(poolBuilder.build());
							
			}
				
		});
		
	}

}