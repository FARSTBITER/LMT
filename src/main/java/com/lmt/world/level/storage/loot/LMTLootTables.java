package com.lmt.world.level.storage.loot;

import com.lmt.world.item.LMTItems;

import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.storage.loot.BuiltInLootTables;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;

public class LMTLootTables {
	
	private static final Identifier BLAZE_ID =  Identifier.fromNamespaceAndPath("minecraft", "entities/blaze");
	
	public static void initialize() {
		
		addEntryToBuiltInTable(BuiltInLootTables.BASTION_BRIDGE, LMTItems.SULFUR, 0.3F, 2, 4);
		addEntryToBuiltInTable(BuiltInLootTables.BASTION_HOGLIN_STABLE, LMTItems.SULFUR, 0.3F, 2, 4);
		addEntryToBuiltInTable(BuiltInLootTables.BASTION_OTHER, LMTItems.SULFUR, 0.3F, 2, 4);
		addEntryToBuiltInTable(BuiltInLootTables.BASTION_TREASURE, LMTItems.SULFUR, 0.3F, 2, 4);
		addEntryToBuiltInTable(BuiltInLootTables.DESERT_PYRAMID, LMTItems.NITER, 0.4F, 4, 8);
		addEntryToBuiltInTable(BuiltInLootTables.PIGLIN_BARTERING, LMTItems.SULFUR, 0.3F, 0, 1);
		
		addEntryToBuiltInMobTable(BLAZE_ID, LMTItems.SULFUR, 0.05F, 4, 6);
		
	}
	
	public static void addEntryToBuiltInTable(ResourceKey<LootTable> resourceKey, Item item, float chance, float minCount, float maxCount) {
		
		LootTableEvents.MODIFY.register((key, tableBuilder, source, registry) -> {
			
			if(registry != null && source.isBuiltin() && resourceKey.equals(key)) {
				
				LootPool.Builder poolBuilder = LootPool.lootPool()
						.setRolls(ConstantValue.exactly(1))
						.add(LootItem.lootTableItem(item)
								.when(LootItemRandomChanceCondition.randomChance(chance))
								.apply(SetItemCountFunction.setCount(UniformGenerator.between(minCount, maxCount)))
						.build());
				
				tableBuilder.pool(poolBuilder.build());
				
			}
			
		});
		
	}
	
	public static void addEntryToBuiltInMobTable(Identifier identifier, Item item, float chance, float minCount, float maxCount) {
		
		LootTableEvents.MODIFY.register((key, tableBuilder, source, registry) -> {
			
			if(registry != null && source.isBuiltin() && identifier.equals(key.identifier())) {
				
				LootPool.Builder poolBuilder = LootPool.lootPool()
						.setRolls(ConstantValue.exactly(1))
						.add(LootItem.lootTableItem(item)
								.when(LootItemRandomChanceCondition.randomChance(chance))
								.apply(SetItemCountFunction.setCount(UniformGenerator.between(minCount, maxCount)))
						.build());
				
				tableBuilder.pool(poolBuilder.build());
				
			}
			
		});
		
	}
	
}