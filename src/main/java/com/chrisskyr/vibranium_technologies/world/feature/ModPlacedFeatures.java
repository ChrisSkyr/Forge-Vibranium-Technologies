package com.chrisskyr.vibranium_technologies.world.feature;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class ModPlacedFeatures {
    public static  final Holder<PlacedFeature> VIBRANIUM_ORE_PLACED = PlacementUtils.register("vibranium_ore_placed",
            ModConfiguredFeatures.VIBRANIUM_ORE, ModOrePlacement.commonOrePlacement(5,
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));
}
