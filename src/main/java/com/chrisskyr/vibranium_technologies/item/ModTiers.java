package com.chrisskyr.vibranium_technologies.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {

    public static final ForgeTier VIBRANIUM = new ForgeTier(5, 3000,12f,
            6f, 22, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ModItems.VIBRANIUM_INGOT.get()));

}
