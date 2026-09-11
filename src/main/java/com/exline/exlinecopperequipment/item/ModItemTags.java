/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.item.Item
 *  net.minecraft.registry.RegistryKey
 *  net.minecraft.registry.RegistryKeys
 *  net.minecraft.registry.tag.TagKey
 *  net.minecraft.util.Identifier
 */
package com.exline.exlinecopperequipment.item;

import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModItemTags {
    public static final TagKey<Item> SHEARS = TagKey.of((RegistryKey)RegistryKeys.ITEM, (Identifier)Identifier.of((String)"exlinecopperequipment", (String)"shears"));
    public static final TagKey<Item> COPPER_INGOTS = TagKey.of((RegistryKey)RegistryKeys.ITEM, (Identifier)Identifier.of((String)"exlinecopperequipment", (String)"copper_ingots"));

    public static void register() {
    }
}

