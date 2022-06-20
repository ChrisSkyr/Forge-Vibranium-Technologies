package com.chrisskyr.vibranium_technologies.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab VIBRANIUM_TECHNOLOGIES_TAB = new CreativeModeTab("vibranium_technologies_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.VIBRANIUM_DUST.get());
        }
    };

}
