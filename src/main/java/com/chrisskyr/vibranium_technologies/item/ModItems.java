package com.chrisskyr.vibranium_technologies.item;

import com.chrisskyr.vibranium_technologies.VibraniumTechnologies;
import com.chrisskyr.vibranium_technologies.item.custom.CoalNuggetItem;
import com.chrisskyr.vibranium_technologies.item.custom.ModArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static  final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, VibraniumTechnologies.MOD_ID);



//                                       --ITEMS--
    public static final RegistryObject<Item> RAW_VIBRANIUM = ITEMS.register("raw_vibranium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.VIBRANIUM_TECHNOLOGIES_TAB)));

    public static final RegistryObject<Item> VIBRANIUM_INGOT = ITEMS.register("vibranium_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.VIBRANIUM_TECHNOLOGIES_TAB)));

    public static final RegistryObject<Item> VIBRANIUM_NUGGET = ITEMS.register("vibranium_nugget",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.VIBRANIUM_TECHNOLOGIES_TAB)));

    public static final RegistryObject<Item> COAL_NUGGET = ITEMS.register("coal_nugget",
            () -> new CoalNuggetItem(new Item.Properties().tab(ModCreativeModeTab.VIBRANIUM_TECHNOLOGIES_TAB)));

    //                                    --TOOLS--

    public static final RegistryObject<Item> VIBRANIUM_SWORD = ITEMS.register("vibranium_sword",
            () -> new SwordItem(ModTiers.VIBRANIUM,2,3f,
                    new Item.Properties().tab(ModCreativeModeTab.VIBRANIUM_TECHNOLOGIES_TAB)));

    public static final RegistryObject<Item> VIBRANIUM_PICKAXE = ITEMS.register("vibranium_pickaxe",
            () -> new PickaxeItem(ModTiers.VIBRANIUM,1,1f,
                    new Item.Properties().tab(ModCreativeModeTab.VIBRANIUM_TECHNOLOGIES_TAB)));

    public static final RegistryObject<Item> VIBRANIUM_SHOVEL = ITEMS.register("vibranium_shovel",
            () -> new ShovelItem(ModTiers.VIBRANIUM,0,3f,
                    new Item.Properties().tab(ModCreativeModeTab.VIBRANIUM_TECHNOLOGIES_TAB)));

    public static final RegistryObject<Item> VIBRANIUM_AXE = ITEMS.register("vibranium_axe",
            () -> new AxeItem(ModTiers.VIBRANIUM,4,0f,
                    new Item.Properties().tab(ModCreativeModeTab.VIBRANIUM_TECHNOLOGIES_TAB)));

    public static final RegistryObject<Item> VIBRANIUM_HOE = ITEMS.register("vibranium_hoe",
            () -> new HoeItem(ModTiers.VIBRANIUM,0,0f,
                    new Item.Properties().tab(ModCreativeModeTab.VIBRANIUM_TECHNOLOGIES_TAB)));

    //                                     --ARMOR--


    public static final RegistryObject<Item> VIBRANIUM_HELMET = ITEMS.register("vibranium_helmet",
            () -> new ModArmorItem(ModArmorMaterials.VIBRANIUM, EquipmentSlot.HEAD
                    ,new Item.Properties().tab(ModCreativeModeTab.VIBRANIUM_TECHNOLOGIES_TAB)));

    public static final RegistryObject<Item> VIBRANIUM_CHESTPLATE = ITEMS.register("vibranium_chestplate",
            () -> new ArmorItem(ModArmorMaterials.VIBRANIUM, EquipmentSlot.CHEST
                    ,new Item.Properties().tab(ModCreativeModeTab.VIBRANIUM_TECHNOLOGIES_TAB)));

    public static final RegistryObject<Item> VIBRANIUM_LEGGINGS = ITEMS.register("vibranium_leggings",
            () -> new ArmorItem(ModArmorMaterials.VIBRANIUM, EquipmentSlot.LEGS
                    ,new Item.Properties().tab(ModCreativeModeTab.VIBRANIUM_TECHNOLOGIES_TAB)));

    public static final RegistryObject<Item> VIBRANIUM_BOOTS = ITEMS.register("vibranium_boots",
            () -> new ArmorItem(ModArmorMaterials.VIBRANIUM, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModeTab.VIBRANIUM_TECHNOLOGIES_TAB)));






    public static  void regiser(IEventBus eventBus)
    {
        ITEMS.register((eventBus));
    }

}
