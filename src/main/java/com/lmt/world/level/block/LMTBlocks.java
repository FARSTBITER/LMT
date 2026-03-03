package com.lmt.world.level.block;

import java.util.function.Function;

import com.lmt.LMT;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;

public class LMTBlocks {
	
	public static final Block NITER_ORE = register("niter_ore", properties -> new DropExperienceBlock(UniformInt.of(0, 1), properties), BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 3.0F).sound(SoundType.STONE));
	public static final Block DEEPSLATE_NITER_ORE = register("deepslate_niter_ore", properties -> new DropExperienceBlock(UniformInt.of(0, 1), properties), BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE));
	public static final Block NETHER_SULFUR_ORE = register("nether_sulfur_ore", properties -> new DropExperienceBlock(UniformInt.of(0, 1), properties), BlockBehaviour.Properties.of().mapColor(MapColor.NETHER).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 3.0F).sound(SoundType.NETHER_ORE));
	public static final Block CHARCOAL_BLOCK = register("charcoal_block", Block::new, BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_BROWN).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.STONE));
	public static final Block SULFUR_BLOCK = register("sulfur_block", Block::new, BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_YELLOW).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.CALCITE));
	public static final Block NITER_BLOCK = register("niter_block", Block::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.CALCITE));
	
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