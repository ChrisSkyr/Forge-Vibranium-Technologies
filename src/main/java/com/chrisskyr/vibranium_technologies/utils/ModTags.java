package com.chrisskyr.vibranium_technologies.utils;

import com.chrisskyr.vibranium_technologies.VibraniumTechnologies;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;

public class ModTags {
    public static class Blocks {

        public static final TagKey<Block> VIBRANIUM_BLOCK = forgeTag("storage_blocks/vibranium");
        public static final TagKey<Block> RAW_VIBRANIUM_BLOCK = forgeTag("storage_blocks/raw_vibranium");

        private static TagKey<Block> tag(String name){
            return BlockTags.create(new ResourceLocation(VibraniumTechnologies.MOD_ID, name));
        }

        private static TagKey<Block> forgeTag(String name){
            return BlockTags.create(new ResourceLocation("forge", name));
        }

    }

    public static class Items {

        public static final TagKey<Item> VIBRANIUM_ORE = forgeTag("ingots/vibranium");
        public static final TagKey<Item> RAW_VIBRANIUM = forgeTag("raw_materials/vibranium");
        public static final TagKey<Item> VIBRANIUM_NUGGET = forgeTag("nuggets/vibranium");
        public static final TagKey<Item> COAL_NUGGET = forgeTag("nuggets/coal");
        public static final TagKey<Item> VIBRANIUM_ARMOR = forgeTag("armor/vibranium");
        public static final TagKey<Item> VIBRANIUM_TOOLS = forgeTag("tools/vibranium");





        private  static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(VibraniumTechnologies.MOD_ID, name));
        }

        private  static TagKey<Item> forgeTag(String name) {
            return ItemTags.create(new ResourceLocation("forge", name));
        }
    }
}
