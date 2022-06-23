package com.chrisskyr.vibranium_technologies.world.feature;

import com.chrisskyr.vibranium_technologies.block.ModBlocks;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;

import java.util.List;

public class ModConfiguredFeatures {

    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_VIBRANIUM_ORES = List.of(
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEPSLATE_VIBRANIUM_ORE.get().defaultBlockState()));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> VIBRANIUM_ORE = FeatureUtils.register(
            "deepslate_vibranium_ore", Feature.ORE, new OreConfiguration(OVERWORLD_VIBRANIUM_ORES, 4));
}
