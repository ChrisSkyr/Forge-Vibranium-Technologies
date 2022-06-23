package com.chrisskyr.vibranium_technologies.item.custom;

import com.chrisskyr.vibranium_technologies.item.ModArmorMaterials;
import com.google.common.collect.ImmutableMap;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

import java.util.List;
import java.util.Map;




public class ModArmorItem extends ArmorItem {

    public static final List<MobEffectInstance> ARMOR_EFFECTS = List.of(
            new MobEffectInstance(MobEffects.REGENERATION, 200, 1),
            new MobEffectInstance(MobEffects.MOVEMENT_SPEED,200,1),
            new MobEffectInstance(MobEffects.DAMAGE_BOOST,200,1));

    private static final Map<ArmorMaterial, List<MobEffectInstance>> MATERIAL_TO_EFFECT_MAP =
            (new ImmutableMap.Builder<ArmorMaterial, List<MobEffectInstance>>()).put(ModArmorMaterials.VIBRANIUM, ARMOR_EFFECTS).build();




    public ModArmorItem(ArmorMaterial material, EquipmentSlot slot, Properties settings) {
        super(material, slot, settings);
    }

    @Override
    public void onArmorTick(ItemStack stack, Level world, Player player) {
        if(!world.isClientSide()) {
            if(hasFullSuitOfArmorOn(player)) {
                evaluateArmorEffects(player);
            }
        }
    }

    private void evaluateArmorEffects(Player player) {
        for (Map.Entry<ArmorMaterial, List<MobEffectInstance>> entry : MATERIAL_TO_EFFECT_MAP.entrySet()) {
            ArmorMaterial mapArmorMaterial = entry.getKey();
            List<MobEffectInstance> mapStatusEffect = entry.getValue();

            if(hasCorrectArmorOn(mapArmorMaterial, player)) {
                addStatusEffectForMaterial(player, mapArmorMaterial, mapStatusEffect);
            }
        }
    }

    private void addStatusEffectForMaterial(Player player, ArmorMaterial mapArmorMaterial,
                                            List<MobEffectInstance> mapStatusEffect) {
        boolean hasPlayerEffect = player.hasEffect(mapStatusEffect.get(0).getEffect()) &&
                                        player.hasEffect(mapStatusEffect.get(1).getEffect());




         //player.hasEffect(mapStatusEffect.get(0).getEffect())
        //                mapStatusEffect.get(1).getEffect());


        if(hasCorrectArmorOn(mapArmorMaterial, player) && !hasPlayerEffect) {

            for(int i = 0; i < ARMOR_EFFECTS.size(); i++)
            {
                player.addEffect(new MobEffectInstance(mapStatusEffect.get(i).getEffect(),
                        mapStatusEffect.get(i).getDuration(), mapStatusEffect.get(i).getAmplifier()));
            }

        }



            //if(new Random().nextFloat() > 0.6f) { // 40% of damaging the armor! Possibly!
            //    player.getInventory().hurtArmor(DamageSource.MAGIC, 1f, new int[]{0, 1, 2, 3});
            //}

           // player.addEffect(new MobEffectInstance(mapStatusEffect.get(0),
              //      mapStatusEffect.getDuration(), mapStatusEffect.getAmplifier()))

    }

    private boolean hasFullSuitOfArmorOn(Player player) {
        ItemStack boots = player.getInventory().getArmor(0);
        ItemStack leggings = player.getInventory().getArmor(1);
        ItemStack breastplate = player.getInventory().getArmor(2);
        ItemStack helmet = player.getInventory().getArmor(3);

        return !helmet.isEmpty() && !breastplate.isEmpty()
                && !leggings.isEmpty() && !boots.isEmpty();
    }

    private boolean hasCorrectArmorOn(ArmorMaterial material, Player player) {
        for (ItemStack armorStack: player.getInventory().armor) {
            if(!(armorStack.getItem() instanceof ArmorItem)) {
                return false;
            }
        }

        ArmorItem boots = ((ArmorItem)player.getInventory().getArmor(0).getItem());
        ArmorItem leggings = ((ArmorItem)player.getInventory().getArmor(1).getItem());
        ArmorItem breastplate = ((ArmorItem)player.getInventory().getArmor(2).getItem());
        ArmorItem helmet = ((ArmorItem)player.getInventory().getArmor(3).getItem());

        return helmet.getMaterial() == material && breastplate.getMaterial() == material &&
                leggings.getMaterial() == material && boots.getMaterial() == material;
    }
}