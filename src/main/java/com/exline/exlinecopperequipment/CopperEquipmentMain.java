/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.ModInitializer
 *  net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup
 *  net.minecraft.item.ItemConvertible
 *  net.minecraft.item.ItemGroup
 *  net.minecraft.item.ItemStack
 *  net.minecraft.registry.Registries
 *  net.minecraft.registry.Registry
 *  net.minecraft.text.Text
 *  net.minecraft.util.Identifier
 */
package com.exline.exlinecopperequipment;

import com.exline.exlinecopperequipment.config.ModConfigs;
import com.exline.exlinecopperequipment.init.ItemInit;
import com.exline.exlinecopperequipment.item.ModToolMaterials;
import com.exline.exlinecopperequipment.sounds.ModSounds;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class CopperEquipmentMain
implements ModInitializer {
    public static final String MOD_ID = "exlinecopperequipment";
    public static final ItemGroup MOD_ITEM_GROUP = (ItemGroup)Registry.register((Registry)Registries.ITEM_GROUP, (Identifier)Identifier.of((String)"exlinecopperequipment", (String)"tab"), (Object)FabricItemGroup.builder().icon(() -> new ItemStack((ItemConvertible)ItemInit.COPPER_SWORD)).displayName((Text)Text.translatable((String)"itemGroup.exlinecopperequipment.tab")).entries((displayContext, entries) -> {
        entries.add((ItemConvertible)ItemInit.COPPER_SWORD);
        entries.add((ItemConvertible)ItemInit.COPPER_SHOVEL);
        entries.add((ItemConvertible)ItemInit.COPPER_PICKAXE);
        entries.add((ItemConvertible)ItemInit.COPPER_AXE);
        entries.add((ItemConvertible)ItemInit.COPPER_HOE);
        entries.add((ItemConvertible)ItemInit.COPPER_SHEARS);
        entries.add((ItemConvertible)ItemInit.COPPER_BOW);
        entries.add((ItemConvertible)ItemInit.COPPER_HELMET);
        entries.add((ItemConvertible)ItemInit.COPPER_CHESTPLATE);
        entries.add((ItemConvertible)ItemInit.COPPER_LEGGINGS);
        entries.add((ItemConvertible)ItemInit.COPPER_BOOTS);
        entries.add((ItemConvertible)ItemInit.COPPER_HORSE_ARMOR);
        entries.add((ItemConvertible)ItemInit.EXPOSED_COPPER_HELMET);
        entries.add((ItemConvertible)ItemInit.EXPOSED_COPPER_CHESTPLATE);
        entries.add((ItemConvertible)ItemInit.EXPOSED_COPPER_LEGGINGS);
        entries.add((ItemConvertible)ItemInit.EXPOSED_COPPER_BOOTS);
        entries.add((ItemConvertible)ItemInit.EXPOSED_COPPER_HORSE_ARMOR);
        entries.add((ItemConvertible)ItemInit.WEATHERED_COPPER_HELMET);
        entries.add((ItemConvertible)ItemInit.WEATHERED_COPPER_CHESTPLATE);
        entries.add((ItemConvertible)ItemInit.WEATHERED_COPPER_LEGGINGS);
        entries.add((ItemConvertible)ItemInit.WEATHERED_COPPER_BOOTS);
        entries.add((ItemConvertible)ItemInit.WEATHERED_COPPER_HORSE_ARMOR);
        entries.add((ItemConvertible)ItemInit.OXIDIZED_COPPER_HELMET);
        entries.add((ItemConvertible)ItemInit.OXIDIZED_COPPER_CHESTPLATE);
        entries.add((ItemConvertible)ItemInit.OXIDIZED_COPPER_LEGGINGS);
        entries.add((ItemConvertible)ItemInit.OXIDIZED_COPPER_BOOTS);
        entries.add((ItemConvertible)ItemInit.OXIDIZED_COPPER_HORSE_ARMOR);
        entries.add((ItemConvertible)ItemInit.COPPER_BUCKET);
        entries.add((ItemConvertible)ItemInit.COPPER_WATER_BUCKET);
        entries.add((ItemConvertible)ItemInit.COPPER_MILK_BUCKET);
        entries.add((ItemConvertible)ItemInit.COPPER_POWDER_SNOW_BUCKET);
        entries.add((ItemConvertible)ItemInit.COPPER_SAND_BUCKET);
        entries.add((ItemConvertible)ItemInit.COPPER_RED_SAND_BUCKET);
        entries.add((ItemConvertible)ItemInit.COPPER_GRAVEL_BUCKET);
        entries.add((ItemConvertible)ItemInit.COPPER_SOUL_SAND_BUCKET);
        entries.add((ItemConvertible)ItemInit.COPPER_NUGGET);
    }).build());

    public void onInitialize() {
        ModConfigs.registerConfigs();
        ModSounds.registerSounds();
        ModToolMaterials.init();
        ItemInit.registerItems();
    }
}

