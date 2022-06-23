package com.chrisskyr.vibranium_technologies.world;

import com.chrisskyr.vibranium_technologies.VibraniumTechnologies;
import com.chrisskyr.vibranium_technologies.world.gen.ModOreGeneration;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = VibraniumTechnologies.MOD_ID)
public class ModWorldEvents {
    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event)
    {
        ModOreGeneration.generateOres(event);
    }
}
