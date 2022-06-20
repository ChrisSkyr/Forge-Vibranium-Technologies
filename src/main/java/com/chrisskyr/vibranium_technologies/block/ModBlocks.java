package com.chrisskyr.vibranium_technologies.block;

import com.chrisskyr.vibranium_technologies.VibraniumTechnologies;
import com.chrisskyr.vibranium_technologies.item.ModCreativeModeTab;
import com.chrisskyr.vibranium_technologies.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, VibraniumTechnologies.MOD_ID);



    public static final  RegistryObject<Block> VIBRANIUM_BLOCK = registerBlock("vibranium_block",
        () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                .strength(9f).requiresCorrectToolForDrops()), ModCreativeModeTab.VIBRANIUM_TECHNOLOGIES_TAB);

    public static final  RegistryObject<Block> DEPSLATE_VIBRANIUM_ORE = registerBlock("deepslate_vibranium_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(9f).requiresCorrectToolForDrops()), ModCreativeModeTab.VIBRANIUM_TECHNOLOGIES_TAB);

    public static final  RegistryObject<Block> RAW_VIBRANIUM_BLOCK = registerBlock("raw_vibranium_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(9f).requiresCorrectToolForDrops()), ModCreativeModeTab.VIBRANIUM_TECHNOLOGIES_TAB);





    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab)
    {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return  toReturn;
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                           CreativeModeTab tab)
    {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }


    public static void  register(IEventBus eventBus)
    {
        BLOCKS.register(eventBus);
    }
}
