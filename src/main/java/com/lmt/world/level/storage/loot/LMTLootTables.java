package com.lmt.world.level.storage.loot;

import com.lmt.world.item.LMTItems;

import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.storage.loot.BuiltInLootTables;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;

public class LMTLootTables {
	
	private static final Identifier BLAZE_ID =  Identifier.fromNamespaceAndPath("minecraft", "entities/blaze");
	private static final Identifier PIGLIN_BARTER =  Identifier.fromNamespaceAndPath("minecraft", "gameplay/piglin_bartering");
	
	public static void initialize() {
			
		LootTableEvents.MODIFY.register((key, tableBuilder, source, registry) -> {
		
			if(BLAZE_ID.equals(key.identifier())) {
			
				LootPool.Builder poolBuilder = LootPool.lootPool()
						.setRolls(ConstantValue.exactly(1))
						.conditionally(LootItemRandomChanceCondition.randomChance(0.3F).build())
						.with(LootItem.lootTableItem(LMTItems.SULFUR).build())
						.apply(SetItemCountFunction.setCount(UniformGenerator.between(0, 1)).build());
					
				tableBuilder.pool(poolBuilder.build());
				
			}
			
		});
		
		LootTableEvents.MODIFY.register((key, tableBuilder, source, registry) -> {
			
			if(PIGLIN_BARTER.equals(key.identifier())) {
			
				LootPool.Builder poolBuilder = LootPool.lootPool()
						.setRolls(ConstantValue.exactly(1))
						.conditionally(LootItemRandomChanceCondition.randomChance(0.05F).build())
						.with(LootItem.lootTableItem(LMTItems.SULFUR).build())
						.apply(SetItemCountFunction.setCount(UniformGenerator.between(4, 6)).build());
					
				tableBuilder.pool(poolBuilder.build());
				
			}
			
		});
		
		LootTableEvents.MODIFY.register((key, tableBuilder, source, registry) -> {
			
			if(BuiltInLootTables.BASTION_BRIDGE.equals(key)) {
				
				LootPool.Builder poolBuilder = LootPool.lootPool()
						.setRolls(ConstantValue.exactly(1))
						.conditionally(LootItemRandomChanceCondition.randomChance(0.3F).build())
						.with(LootItem.lootTableItem(LMTItems.SULFUR).build())
						.apply(SetItemCountFunction.setCount(UniformGenerator.between(2, 4)).build());
					
				tableBuilder.pool(poolBuilder.build());
				
			}
			
			if(BuiltInLootTables.BASTION_HOGLIN_STABLE.equals(key)) {
				
				LootPool.Builder poolBuilder = LootPool.lootPool()
						.setRolls(ConstantValue.exactly(1))
						.conditionally(LootItemRandomChanceCondition.randomChance(0.3F).build())
						.with(LootItem.lootTableItem(LMTItems.SULFUR).build())
						.apply(SetItemCountFunction.setCount(UniformGenerator.between(2, 4)).build());
					
				tableBuilder.pool(poolBuilder.build());
				
			}
			
			if(BuiltInLootTables.BASTION_OTHER.equals(key)) {
				
				LootPool.Builder poolBuilder = LootPool.lootPool()
						.setRolls(ConstantValue.exactly(1))
						.conditionally(LootItemRandomChanceCondition.randomChance(0.3F).build())
						.with(LootItem.lootTableItem(LMTItems.SULFUR).build())
						.apply(SetItemCountFunction.setCount(UniformGenerator.between(2, 4)).build());
					
				tableBuilder.pool(poolBuilder.build());
				
			}
			
			if(BuiltInLootTables.BASTION_TREASURE.equals(key)) {
				
				LootPool.Builder poolBuilder = LootPool.lootPool()
						.setRolls(ConstantValue.exactly(1))
						.conditionally(LootItemRandomChanceCondition.randomChance(0.3F).build())
						.with(LootItem.lootTableItem(LMTItems.SULFUR).build())
						.apply(SetItemCountFunction.setCount(UniformGenerator.between(2, 4)).build());
					
				tableBuilder.pool(poolBuilder.build());
				
			}
			
			if(BuiltInLootTables.DESERT_PYRAMID.equals(key)) {
				
				LootPool.Builder poolBuilder = LootPool.lootPool()
						.setRolls(ConstantValue.exactly(1))
						.conditionally(LootItemRandomChanceCondition.randomChance(0.4F).build())
						.with(LootItem.lootTableItem(LMTItems.NITER).build())
						.apply(SetItemCountFunction.setCount(UniformGenerator.between(4, 8)).build());
					
				tableBuilder.pool(poolBuilder.build());
				
			}
			
		});
		
	}
	
}