package com.lmt.world.item;

import java.util.function.Function;

import com.lmt.LMT;
import com.lmt.world.food.LMTFoods;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;

public class LMTItems {
	
	public static final Item SULFUR = register("sulfur", Item::new, new Item.Properties());
	public static final Item NITER = register("niter", Item::new, new Item.Properties());
	public static final Item RAG = register("rag", Item::new, new Item.Properties());
	public static final Item JERKY = register("jerky", Item::new, new Item.Properties().food(LMTFoods.JERKY));
	public static final Item FRIED_EGG = register("fried_egg", Item::new, new Item.Properties().food(LMTFoods.FRIED_EGG));
	
	public static void initialize() {
		
	}
	
	public static Item register(String string, Function<Item.Properties, Item> function, Item.Properties properties) {
		
		ResourceKey<Item> resourceKey = ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(LMT.MOD_ID, string));
		Item item = function.apply(properties.setId(resourceKey));
		Registry.register(BuiltInRegistries.ITEM, resourceKey, item);
		
		return item;
		
	}

}