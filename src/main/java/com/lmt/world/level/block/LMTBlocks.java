package com.lmt.world.level.block;

import java.util.function.Function;

import com.lmt.LMT;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;

public class LMTBlocks {
	
	public static final Block SULFUR_BLOCK = register("sulfur_block", Block::new, BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_YELLOW).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.CALCITE));
	
	public static void initialize() {
		
	}
	
	public static Block register(String string, Function<BlockBehaviour.Properties, Block> function, BlockBehaviour.Properties properties) {
		
		ResourceKey<Block> resourceKeyBlock = ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(LMT.MOD_ID, string));
		ResourceKey<Item> resourceKeyItem = ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(LMT.MOD_ID, string));
		Block block = function.apply(properties.setId(resourceKeyBlock));
		BlockItem item = new BlockItem(block, new Item.Properties().setId(resourceKeyItem).useBlockDescriptionPrefix());
		Registry.register(BuiltInRegistries.BLOCK, resourceKeyBlock, block);
		Registry.register(BuiltInRegistries.ITEM, resourceKeyItem, item);
		
		return block;
		
	}

}