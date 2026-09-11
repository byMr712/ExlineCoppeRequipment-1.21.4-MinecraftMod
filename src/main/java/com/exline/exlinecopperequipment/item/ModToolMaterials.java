/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.item.ToolMaterial
 *  net.minecraft.registry.tag.BlockTags
 *  net.minecraft.registry.tag.ItemTags
 */
package com.exline.exlinecopperequipment.item;

import com.exline.exlinecopperequipment.config.ModConfigs;
import net.minecraft.item.ToolMaterial;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;

public class ModToolMaterials {
    public static ToolMaterial COPPER;

    public ModToolMaterials() {
        throw new AssertionError();
    }

    public static void init() {
        COPPER = new ToolMaterial(BlockTags.INCORRECT_FOR_STONE_TOOL, ModConfigs.DURABILITY, (float)ModConfigs.MINING_SPEED, (float)ModConfigs.ATTACK_DAMAGE, ModConfigs.ENCHANTABILITY, ItemTags.COPPER_ORES);
    }
}

