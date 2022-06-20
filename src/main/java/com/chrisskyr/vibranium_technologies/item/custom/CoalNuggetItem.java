package com.chrisskyr.vibranium_technologies.item.custom;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import org.jetbrains.annotations.Nullable;

public class CoalNuggetItem extends Item {
    public CoalNuggetItem(Properties pProperties) {
        super(pProperties);
    }


    @Override
    public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
        return 178;
    }
}
