/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.item.Item
 *  net.minecraft.item.equipment.ArmorMaterial
 *  net.minecraft.item.equipment.EquipmentAssetKeys
 *  net.minecraft.item.equipment.EquipmentType
 *  net.minecraft.registry.RegistryKey
 *  net.minecraft.registry.entry.RegistryEntry
 *  net.minecraft.registry.tag.TagKey
 *  net.minecraft.sound.SoundEvent
 *  net.minecraft.sound.SoundEvents
 *  net.minecraft.util.Identifier
 *  net.minecraft.util.Util
 */
package com.exline.exlinecopperequipment.item;

import com.exline.exlinecopperequipment.config.ModConfigs;
import com.exline.exlinecopperequipment.item.ModItemTags;
import java.util.EnumMap;
import net.minecraft.item.Item;
import net.minecraft.item.equipment.ArmorMaterial;
import net.minecraft.item.equipment.EquipmentAssetKeys;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

public class ModArmorMaterials {
    public static final ArmorMaterial COPPER = ModArmorMaterials.register("copper", ModConfigs.ARMOR_DURABILITY_MULTIPLIER, (EnumMap)Util.make(new EnumMap(EquipmentType.class), map -> {
        map.put(EquipmentType.BOOTS, ModConfigs.ARMOR_VALUE_BOOTS);
        map.put(EquipmentType.LEGGINGS, ModConfigs.ARMOR_VALUE_LEGGS);
        map.put(EquipmentType.CHESTPLATE, ModConfigs.ARMOR_VALUE_CHEST);
        map.put(EquipmentType.HELMET, ModConfigs.ARMOR_VALUE_HELM);
        map.put(EquipmentType.BODY, ModConfigs.ARMOR_VALUE_HORSE);
    }), ModConfigs.ARMOR_ENCHATABILITY, (RegistryEntry<SoundEvent>)SoundEvents.ITEM_ARMOR_EQUIP_IRON, ModItemTags.COPPER_INGOTS, (float)ModConfigs.ARMOR_TOUGHNESS, (float)ModConfigs.ARMOR_KNOCKBACK_RESIST);
    public static final ArmorMaterial EXPOSED_COPPER = ModArmorMaterials.register("exposed_copper", ModConfigs.ARMOR_DURABILITY_MULTIPLIER, (EnumMap)Util.make(new EnumMap(EquipmentType.class), map -> {
        map.put(EquipmentType.BOOTS, ModConfigs.ARMOR_VALUE_BOOTS);
        map.put(EquipmentType.LEGGINGS, ModConfigs.ARMOR_VALUE_LEGGS);
        map.put(EquipmentType.CHESTPLATE, ModConfigs.ARMOR_VALUE_CHEST);
        map.put(EquipmentType.HELMET, ModConfigs.ARMOR_VALUE_HELM);
        map.put(EquipmentType.BODY, ModConfigs.ARMOR_VALUE_HORSE);
    }), ModConfigs.ARMOR_ENCHATABILITY, (RegistryEntry<SoundEvent>)SoundEvents.ITEM_ARMOR_EQUIP_IRON, ModItemTags.COPPER_INGOTS, (float)ModConfigs.ARMOR_TOUGHNESS, (float)ModConfigs.ARMOR_KNOCKBACK_RESIST);
    public static final ArmorMaterial OXIDIZED_COPPER = ModArmorMaterials.register("oxidized_copper", ModConfigs.ARMOR_DURABILITY_MULTIPLIER, (EnumMap)Util.make(new EnumMap(EquipmentType.class), map -> {
        map.put(EquipmentType.BOOTS, ModConfigs.ARMOR_VALUE_BOOTS);
        map.put(EquipmentType.LEGGINGS, ModConfigs.ARMOR_VALUE_LEGGS);
        map.put(EquipmentType.CHESTPLATE, ModConfigs.ARMOR_VALUE_CHEST);
        map.put(EquipmentType.HELMET, ModConfigs.ARMOR_VALUE_HELM);
        map.put(EquipmentType.BODY, ModConfigs.ARMOR_VALUE_HORSE);
    }), ModConfigs.ARMOR_ENCHATABILITY, (RegistryEntry<SoundEvent>)SoundEvents.ITEM_ARMOR_EQUIP_IRON, ModItemTags.COPPER_INGOTS, (float)ModConfigs.ARMOR_TOUGHNESS, (float)ModConfigs.ARMOR_KNOCKBACK_RESIST);
    public static final ArmorMaterial WEATHERED_COPPER = ModArmorMaterials.register("weathered_copper", ModConfigs.ARMOR_DURABILITY_MULTIPLIER, (EnumMap)Util.make(new EnumMap(EquipmentType.class), map -> {
        map.put(EquipmentType.BOOTS, ModConfigs.ARMOR_VALUE_BOOTS);
        map.put(EquipmentType.LEGGINGS, ModConfigs.ARMOR_VALUE_LEGGS);
        map.put(EquipmentType.CHESTPLATE, ModConfigs.ARMOR_VALUE_CHEST);
        map.put(EquipmentType.HELMET, ModConfigs.ARMOR_VALUE_HELM);
        map.put(EquipmentType.BODY, ModConfigs.ARMOR_VALUE_HORSE);
    }), ModConfigs.ARMOR_ENCHATABILITY, (RegistryEntry<SoundEvent>)SoundEvents.ITEM_ARMOR_EQUIP_IRON, ModItemTags.COPPER_INGOTS, (float)ModConfigs.ARMOR_TOUGHNESS, (float)ModConfigs.ARMOR_KNOCKBACK_RESIST);

    private static ArmorMaterial register(String name, int durability, EnumMap<EquipmentType, Integer> typeProtection, int enchantmentValue, RegistryEntry<SoundEvent> equipSound, TagKey<Item> ingredient, float toughness, float knockbackResistance) {
        Identifier location = Identifier.of((String)"exlinecopperequipment", (String)name);
        RegistryKey layers = RegistryKey.of((RegistryKey)EquipmentAssetKeys.REGISTRY_KEY, (Identifier)location);
        EnumMap<EquipmentType, Integer> typeMap = new EnumMap<EquipmentType, Integer>(EquipmentType.class);
        for (EquipmentType type : EquipmentType.values()) {
            typeMap.put(type, typeProtection.get(type));
        }
        return new ArmorMaterial(durability, typeMap, enchantmentValue, equipSound, toughness, knockbackResistance, ingredient, layers);
    }
}

