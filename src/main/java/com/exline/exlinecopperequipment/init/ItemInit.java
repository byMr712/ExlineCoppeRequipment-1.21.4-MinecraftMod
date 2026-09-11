/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents
 *  net.minecraft.block.Block
 *  net.minecraft.block.Blocks
 *  net.minecraft.component.DataComponentTypes
 *  net.minecraft.component.type.ConsumableComponents
 *  net.minecraft.fluid.Fluid
 *  net.minecraft.fluid.Fluids
 *  net.minecraft.item.AnimalArmorItem
 *  net.minecraft.item.AnimalArmorItem$Type
 *  net.minecraft.item.AxeItem
 *  net.minecraft.item.BowItem
 *  net.minecraft.item.HoeItem
 *  net.minecraft.item.Item
 *  net.minecraft.item.Item$Settings
 *  net.minecraft.item.ItemConvertible
 *  net.minecraft.item.ItemGroups
 *  net.minecraft.item.PickaxeItem
 *  net.minecraft.item.ShearsItem
 *  net.minecraft.item.ShovelItem
 *  net.minecraft.item.SwordItem
 *  net.minecraft.item.ToolMaterial
 *  net.minecraft.item.equipment.ArmorMaterial
 *  net.minecraft.item.equipment.EquipmentType
 *  net.minecraft.registry.Registries
 *  net.minecraft.registry.Registry
 *  net.minecraft.registry.RegistryKey
 *  net.minecraft.registry.RegistryKeys
 *  net.minecraft.sound.SoundEvent
 *  net.minecraft.sound.SoundEvents
 *  net.minecraft.util.Identifier
 */
package com.exline.exlinecopperequipment.init;

import com.exline.exlinecopperequipment.config.ModConfigs;
import com.exline.exlinecopperequipment.item.CopperBlockFilledBucketItem;
import com.exline.exlinecopperequipment.item.CopperBucketItem;
import com.exline.exlinecopperequipment.item.ModArmorMaterials;
import com.exline.exlinecopperequipment.item.ModCopperBootsItem;
import com.exline.exlinecopperequipment.item.ModCopperChestplateItem;
import com.exline.exlinecopperequipment.item.ModCopperHelmetItem;
import com.exline.exlinecopperequipment.item.ModCopperLeggingsItem;
import com.exline.exlinecopperequipment.item.ModExposedCopperBootsItem;
import com.exline.exlinecopperequipment.item.ModExposedCopperChestplateItem;
import com.exline.exlinecopperequipment.item.ModExposedCopperHelmetItem;
import com.exline.exlinecopperequipment.item.ModExposedCopperLeggingsItem;
import com.exline.exlinecopperequipment.item.ModOxidizedCopperBootsItem;
import com.exline.exlinecopperequipment.item.ModOxidizedCopperChestplateItem;
import com.exline.exlinecopperequipment.item.ModOxidizedCopperHelmetItem;
import com.exline.exlinecopperequipment.item.ModOxidizedCopperLeggingsItem;
import com.exline.exlinecopperequipment.item.ModToolMaterials;
import com.exline.exlinecopperequipment.item.ModWeatheredCopperBootsItem;
import com.exline.exlinecopperequipment.item.ModWeatheredCopperChestplateItem;
import com.exline.exlinecopperequipment.item.ModWeatheredCopperHelmetItem;
import com.exline.exlinecopperequipment.item.ModWeatheredCopperLeggingsItem;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.ConsumableComponents;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.AnimalArmorItem;
import net.minecraft.item.AxeItem;
import net.minecraft.item.BowItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShearsItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.item.equipment.ArmorMaterial;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;

public class ItemInit {
    public static final Item COPPER_NUGGET = ItemInit.createItem("copper_nugget");
    public static final Item COPPER_SWORD = ItemInit.createSwordItem("copper_sword", ModToolMaterials.COPPER, Float.valueOf((float)ModConfigs.ATTACK_DAMAGE_SWORD), Float.valueOf((float)ModConfigs.ATTACK_SPEED_SWORD));
    public static final Item COPPER_HELMET = ItemInit.createCopperHelmetArmorItem("copper_helmet", ModArmorMaterials.COPPER, EquipmentType.HELMET);
    public static final Item EXPOSED_COPPER_HELMET = ItemInit.createExposedCopperHelmetArmorItem("exposed_copper_helmet", ModArmorMaterials.EXPOSED_COPPER, EquipmentType.HELMET);
    public static final Item WEATHERED_COPPER_HELMET = ItemInit.createWeatheredCopperHelmetArmorItem("weathered_copper_helmet", ModArmorMaterials.WEATHERED_COPPER, EquipmentType.HELMET);
    public static final Item OXIDIZED_COPPER_HELMET = ItemInit.createOxidizedCopperHelmetArmorItem("oxidized_copper_helmet", ModArmorMaterials.OXIDIZED_COPPER, EquipmentType.HELMET);
    public static final Item COPPER_CHESTPLATE = ItemInit.createCopperChestplateArmorItem("copper_chestplate", ModArmorMaterials.COPPER, EquipmentType.CHESTPLATE);
    public static final Item EXPOSED_COPPER_CHESTPLATE = ItemInit.createExposedCopperChestplateArmorItem("exposed_copper_chestplate", ModArmorMaterials.EXPOSED_COPPER, EquipmentType.CHESTPLATE);
    public static final Item WEATHERED_COPPER_CHESTPLATE = ItemInit.createWeatheredCopperChestplateArmorItem("weathered_copper_chestplate", ModArmorMaterials.WEATHERED_COPPER, EquipmentType.CHESTPLATE);
    public static final Item OXIDIZED_COPPER_CHESTPLATE = ItemInit.createOxidizedCopperChestplateArmorItem("oxidized_copper_chestplate", ModArmorMaterials.OXIDIZED_COPPER, EquipmentType.CHESTPLATE);
    public static final Item COPPER_LEGGINGS = ItemInit.createCopperLeggingsArmorItem("copper_leggings", ModArmorMaterials.COPPER, EquipmentType.LEGGINGS);
    public static final Item EXPOSED_COPPER_LEGGINGS = ItemInit.createExposedCopperLeggingsArmorItem("exposed_copper_leggings", ModArmorMaterials.EXPOSED_COPPER, EquipmentType.LEGGINGS);
    public static final Item WEATHERED_COPPER_LEGGINGS = ItemInit.createWeatheredCopperLeggingsArmorItem("weathered_copper_leggings", ModArmorMaterials.WEATHERED_COPPER, EquipmentType.LEGGINGS);
    public static final Item OXIDIZED_COPPER_LEGGINGS = ItemInit.createOxidizedCopperLeggingsArmorItem("oxidized_copper_leggings", ModArmorMaterials.OXIDIZED_COPPER, EquipmentType.LEGGINGS);
    public static final Item COPPER_BOOTS = ItemInit.createCopperBootsArmorItem("copper_boots", ModArmorMaterials.COPPER, EquipmentType.BOOTS);
    public static final Item EXPOSED_COPPER_BOOTS = ItemInit.createExposedCopperBootsArmorItem("exposed_copper_boots", ModArmorMaterials.EXPOSED_COPPER, EquipmentType.BOOTS);
    public static final Item WEATHERED_COPPER_BOOTS = ItemInit.createWeatheredCopperBootsArmorItem("weathered_copper_boots", ModArmorMaterials.WEATHERED_COPPER, EquipmentType.BOOTS);
    public static final Item OXIDIZED_COPPER_BOOTS = ItemInit.createOxidizedCopperBootsArmorItem("oxidized_copper_boots", ModArmorMaterials.OXIDIZED_COPPER, EquipmentType.BOOTS);
    public static Item COPPER_SHOVEL = ItemInit.createShovelItem("copper_shovel", ModToolMaterials.COPPER, Float.valueOf((float)ModConfigs.ATTACK_DAMAGE_SHOVEL), Float.valueOf((float)ModConfigs.ATTACK_SPEED_SHOVEL));
    public static Item COPPER_PICKAXE = ItemInit.createPickaxeItem("copper_pickaxe", ModToolMaterials.COPPER, Float.valueOf((float)ModConfigs.ATTACK_DAMAGE_PICKAXE), Float.valueOf((float)ModConfigs.ATTACK_SPEED_PICKAXE));
    public static Item COPPER_AXE = ItemInit.createAxeItem("copper_axe", ModToolMaterials.COPPER, Float.valueOf((float)ModConfigs.ATTACK_DAMAGE_AXE), Float.valueOf((float)ModConfigs.ATTACK_SPEED_AXE));
    public static Item COPPER_HOE = ItemInit.createHoeItem("copper_hoe", ModToolMaterials.COPPER, Float.valueOf((float)ModConfigs.ATTACK_DAMAGE_HOE), Float.valueOf((float)ModConfigs.ATTACK_SPEED_HOE));
    public static Item COPPER_HORSE_ARMOR = ItemInit.createAnimalArmorItem("copper_horse_armor", ModArmorMaterials.COPPER, AnimalArmorItem.Type.EQUESTRIAN);
    public static Item EXPOSED_COPPER_HORSE_ARMOR = ItemInit.createAnimalArmorItem("exposed_copper_horse_armor", ModArmorMaterials.EXPOSED_COPPER, AnimalArmorItem.Type.EQUESTRIAN);
    public static Item WEATHERED_COPPER_HORSE_ARMOR = ItemInit.createAnimalArmorItem("weathered_copper_horse_armor", ModArmorMaterials.WEATHERED_COPPER, AnimalArmorItem.Type.EQUESTRIAN);
    public static Item OXIDIZED_COPPER_HORSE_ARMOR = ItemInit.createAnimalArmorItem("oxidized_copper_horse_armor", ModArmorMaterials.OXIDIZED_COPPER, AnimalArmorItem.Type.EQUESTRIAN);
    public static final Item COPPER_SHEARS = ItemInit.createShearsItem("copper_shears");
    public static final Item COPPER_BOW = ItemInit.createBowItem("copper_bow");
    public static final Item COPPER_BUCKET = ItemInit.createEmptyBucketItem(Fluids.EMPTY, "copper_bucket");
    public static final Item COPPER_WATER_BUCKET = ItemInit.createWaterBucketItem((Fluid)Fluids.WATER, "copper_water_bucket");
    public static final Item COPPER_MILK_BUCKET = ItemInit.createMilkBucketItem("copper_milk_bucket");
    public static final Item COPPER_POWDER_SNOW_BUCKET = ItemInit.createBlockFilledBucketItem("copper_powder_snow_bucket", Blocks.POWDER_SNOW, SoundEvents.ITEM_BUCKET_EMPTY_POWDER_SNOW);
    public static final Item COPPER_SAND_BUCKET = ItemInit.createBlockFilledBucketItem("copper_sand_bucket", Blocks.SAND, SoundEvents.BLOCK_SAND_FALL);
    public static final Item COPPER_RED_SAND_BUCKET = ItemInit.createBlockFilledBucketItem("copper_red_sand_bucket", Blocks.RED_SAND, SoundEvents.BLOCK_SAND_FALL);
    public static final Item COPPER_GRAVEL_BUCKET = ItemInit.createBlockFilledBucketItem("copper_gravel_bucket", Blocks.GRAVEL, SoundEvents.BLOCK_GRAVEL_FALL);
    public static final Item COPPER_SOUL_SAND_BUCKET = ItemInit.createBlockFilledBucketItem("copper_soul_sand_bucket", Blocks.SOUL_SAND, SoundEvents.BLOCK_SOUL_SAND_FALL);

    private static Item createItem(String name) {
        Identifier id = Identifier.of((String)"exlinecopperequipment", (String)name);
        RegistryKey key = RegistryKey.of((RegistryKey)RegistryKeys.ITEM, (Identifier)id);
        Item item = new Item(new Item.Settings().registryKey(RegistryKey.of((RegistryKey)RegistryKeys.ITEM, (Identifier)id)));
        Registry.register((Registry)Registries.ITEM, (RegistryKey)key, (Object)item);
        return item;
    }

    private static Item createBowItem(String name) {
        Identifier id = Identifier.of((String)"exlinecopperequipment", (String)name);
        RegistryKey key = RegistryKey.of((RegistryKey)RegistryKeys.ITEM, (Identifier)id);
        BowItem item = new BowItem(new Item.Settings().maxDamage(ModConfigs.COPPER_BOW_DURABILITY).registryKey(RegistryKey.of((RegistryKey)RegistryKeys.ITEM, (Identifier)id)));
        Registry.register((Registry)Registries.ITEM, (RegistryKey)key, (Object)item);
        return item;
    }

    private static Item createEmptyBucketItem(Fluid fluid, String name) {
        Identifier id = Identifier.of((String)"exlinecopperequipment", (String)name);
        RegistryKey key = RegistryKey.of((RegistryKey)RegistryKeys.ITEM, (Identifier)id);
        CopperBucketItem item = new CopperBucketItem(fluid, new Item.Settings().maxCount(16).registryKey(RegistryKey.of((RegistryKey)RegistryKeys.ITEM, (Identifier)id)));
        Registry.register((Registry)Registries.ITEM, (RegistryKey)key, (Object)((Object)item));
        return item;
    }

    private static Item createWaterBucketItem(Fluid fluid, String name) {
        Identifier id = Identifier.of((String)"exlinecopperequipment", (String)name);
        RegistryKey key = RegistryKey.of((RegistryKey)RegistryKeys.ITEM, (Identifier)id);
        CopperBucketItem item = new CopperBucketItem(fluid, new Item.Settings().recipeRemainder(COPPER_BUCKET).maxCount(1).registryKey(RegistryKey.of((RegistryKey)RegistryKeys.ITEM, (Identifier)id)));
        Registry.register((Registry)Registries.ITEM, (RegistryKey)key, (Object)((Object)item));
        return item;
    }

    private static Item createMilkBucketItem(String name) {
        Identifier id = Identifier.of((String)"exlinecopperequipment", (String)name);
        RegistryKey key = RegistryKey.of((RegistryKey)RegistryKeys.ITEM, (Identifier)id);
        Item item = new Item(new Item.Settings().recipeRemainder(COPPER_BUCKET).component(DataComponentTypes.CONSUMABLE, ConsumableComponents.MILK_BUCKET).useRemainder(COPPER_BUCKET).maxCount(1).registryKey(RegistryKey.of((RegistryKey)RegistryKeys.ITEM, (Identifier)id)));
        Registry.register((Registry)Registries.ITEM, (RegistryKey)key, (Object)item);
        return item;
    }

    private static Item createBlockFilledBucketItem(String name, Block block, SoundEvent soundEvent) {
        Identifier id = Identifier.of((String)"exlinecopperequipment", (String)name);
        RegistryKey key = RegistryKey.of((RegistryKey)RegistryKeys.ITEM, (Identifier)id);
        CopperBlockFilledBucketItem item = new CopperBlockFilledBucketItem(block, soundEvent, new Item.Settings().recipeRemainder(COPPER_BUCKET).maxCount(1).registryKey(RegistryKey.of((RegistryKey)RegistryKeys.ITEM, (Identifier)id)));
        Registry.register((Registry)Registries.ITEM, (RegistryKey)key, (Object)((Object)item));
        return item;
    }

    private static Item createShearsItem(String name) {
        Identifier id = Identifier.of((String)"exlinecopperequipment", (String)name);
        RegistryKey key = RegistryKey.of((RegistryKey)RegistryKeys.ITEM, (Identifier)id);
        ShearsItem item = new ShearsItem(new Item.Settings().maxDamage(ModConfigs.MAX_USES_SHEARS).component(DataComponentTypes.TOOL, ShearsItem.createToolComponent()).registryKey(RegistryKey.of((RegistryKey)RegistryKeys.ITEM, (Identifier)id)));
        Registry.register((Registry)Registries.ITEM, (RegistryKey)key, (Object)item);
        return item;
    }

    private static Item createSwordItem(String name, ToolMaterial toolMaterial, Float attackDamage, Float attackSpeed) {
        Identifier id = Identifier.of((String)"exlinecopperequipment", (String)name);
        RegistryKey key = RegistryKey.of((RegistryKey)RegistryKeys.ITEM, (Identifier)id);
        SwordItem item = new SwordItem(toolMaterial, attackDamage.floatValue(), attackSpeed.floatValue(), new Item.Settings().registryKey(RegistryKey.of((RegistryKey)RegistryKeys.ITEM, (Identifier)id)));
        Registry.register((Registry)Registries.ITEM, (RegistryKey)key, (Object)item);
        return item;
    }

    private static Item createShovelItem(String name, ToolMaterial toolMaterial, Float attackDamage, Float attackSpeed) {
        Identifier id = Identifier.of((String)"exlinecopperequipment", (String)name);
        RegistryKey key = RegistryKey.of((RegistryKey)RegistryKeys.ITEM, (Identifier)id);
        ShovelItem item = new ShovelItem(toolMaterial, attackDamage.floatValue(), attackSpeed.floatValue(), new Item.Settings().registryKey(RegistryKey.of((RegistryKey)RegistryKeys.ITEM, (Identifier)id)));
        Registry.register((Registry)Registries.ITEM, (RegistryKey)key, (Object)item);
        return item;
    }

    private static Item createPickaxeItem(String name, ToolMaterial toolMaterial, Float attackDamage, Float attackSpeed) {
        Identifier id = Identifier.of((String)"exlinecopperequipment", (String)name);
        RegistryKey key = RegistryKey.of((RegistryKey)RegistryKeys.ITEM, (Identifier)id);
        PickaxeItem item = new PickaxeItem(toolMaterial, attackDamage.floatValue(), attackSpeed.floatValue(), new Item.Settings().registryKey(RegistryKey.of((RegistryKey)RegistryKeys.ITEM, (Identifier)id)));
        Registry.register((Registry)Registries.ITEM, (RegistryKey)key, (Object)item);
        return item;
    }

    private static Item createAxeItem(String name, ToolMaterial toolMaterial, Float attackDamage, Float attackSpeed) {
        Identifier id = Identifier.of((String)"exlinecopperequipment", (String)name);
        RegistryKey key = RegistryKey.of((RegistryKey)RegistryKeys.ITEM, (Identifier)id);
        AxeItem item = new AxeItem(toolMaterial, attackDamage.floatValue(), attackSpeed.floatValue(), new Item.Settings().registryKey(RegistryKey.of((RegistryKey)RegistryKeys.ITEM, (Identifier)id)));
        Registry.register((Registry)Registries.ITEM, (RegistryKey)key, (Object)item);
        return item;
    }

    private static Item createHoeItem(String name, ToolMaterial toolMaterial, Float attackDamage, Float attackSpeed) {
        Identifier id = Identifier.of((String)"exlinecopperequipment", (String)name);
        RegistryKey key = RegistryKey.of((RegistryKey)RegistryKeys.ITEM, (Identifier)id);
        HoeItem item = new HoeItem(toolMaterial, attackDamage.floatValue(), attackSpeed.floatValue(), new Item.Settings().registryKey(RegistryKey.of((RegistryKey)RegistryKeys.ITEM, (Identifier)id)));
        Registry.register((Registry)Registries.ITEM, (RegistryKey)key, (Object)item);
        return item;
    }

    private static Item createCopperHelmetArmorItem(String name, ArmorMaterial armorMaterial, EquipmentType equipmentType) {
        Identifier id = Identifier.of((String)"exlinecopperequipment", (String)name);
        RegistryKey key = RegistryKey.of((RegistryKey)RegistryKeys.ITEM, (Identifier)id);
        ModCopperHelmetItem item = new ModCopperHelmetItem(armorMaterial, equipmentType, new Item.Settings().registryKey(RegistryKey.of((RegistryKey)RegistryKeys.ITEM, (Identifier)id)));
        Registry.register((Registry)Registries.ITEM, (RegistryKey)key, (Object)((Object)item));
        return item;
    }

    private static Item createExposedCopperHelmetArmorItem(String name, ArmorMaterial armorMaterial, EquipmentType equipmentType) {
        Identifier id = Identifier.of((String)"exlinecopperequipment", (String)name);
        RegistryKey key = RegistryKey.of((RegistryKey)RegistryKeys.ITEM, (Identifier)id);
        ModExposedCopperHelmetItem item = new ModExposedCopperHelmetItem(armorMaterial, equipmentType, new Item.Settings().registryKey(RegistryKey.of((RegistryKey)RegistryKeys.ITEM, (Identifier)id)));
        Registry.register((Registry)Registries.ITEM, (RegistryKey)key, (Object)((Object)item));
        return item;
    }

    private static Item createWeatheredCopperHelmetArmorItem(String name, ArmorMaterial armorMaterial, EquipmentType equipmentType) {
        Identifier id = Identifier.of((String)"exlinecopperequipment", (String)name);
        RegistryKey key = RegistryKey.of((RegistryKey)RegistryKeys.ITEM, (Identifier)id);
        ModWeatheredCopperHelmetItem item = new ModWeatheredCopperHelmetItem(armorMaterial, equipmentType, new Item.Settings().registryKey(RegistryKey.of((RegistryKey)RegistryKeys.ITEM, (Identifier)id)));
        Registry.register((Registry)Registries.ITEM, (RegistryKey)key, (Object)((Object)item));
        return item;
    }

    private static Item createOxidizedCopperHelmetArmorItem(String name, ArmorMaterial armorMaterial, EquipmentType equipmentType) {
        Identifier id = Identifier.of((String)"exlinecopperequipment", (String)name);
        RegistryKey key = RegistryKey.of((RegistryKey)RegistryKeys.ITEM, (Identifier)id);
        ModOxidizedCopperHelmetItem item = new ModOxidizedCopperHelmetItem(armorMaterial, equipmentType, new Item.Settings().registryKey(RegistryKey.of((RegistryKey)RegistryKeys.ITEM, (Identifier)id)));
        Registry.register((Registry)Registries.ITEM, (RegistryKey)key, (Object)((Object)item));
        return item;
    }

    private static Item createCopperChestplateArmorItem(String name, ArmorMaterial armorMaterial, EquipmentType equipmentType) {
        Identifier id = Identifier.of((String)"exlinecopperequipment", (String)name);
        RegistryKey key = RegistryKey.of((RegistryKey)RegistryKeys.ITEM, (Identifier)id);
        ModCopperChestplateItem item = new ModCopperChestplateItem(armorMaterial, equipmentType, new Item.Settings().registryKey(RegistryKey.of((RegistryKey)RegistryKeys.ITEM, (Identifier)id)));
        Registry.register((Registry)Registries.ITEM, (RegistryKey)key, (Object)((Object)item));
        return item;
    }

    private static Item createExposedCopperChestplateArmorItem(String name, ArmorMaterial armorMaterial, EquipmentType equipmentType) {
        Identifier id = Identifier.of((String)"exlinecopperequipment", (String)name);
        RegistryKey key = RegistryKey.of((RegistryKey)RegistryKeys.ITEM, (Identifier)id);
        ModExposedCopperChestplateItem item = new ModExposedCopperChestplateItem(armorMaterial, equipmentType, new Item.Settings().registryKey(RegistryKey.of((RegistryKey)RegistryKeys.ITEM, (Identifier)id)));
        Registry.register((Registry)Registries.ITEM, (RegistryKey)key, (Object)((Object)item));
        return item;
    }

    private static Item createWeatheredCopperChestplateArmorItem(String name, ArmorMaterial armorMaterial, EquipmentType equipmentType) {
        Identifier id = Identifier.of((String)"exlinecopperequipment", (String)name);
        RegistryKey key = RegistryKey.of((RegistryKey)RegistryKeys.ITEM, (Identifier)id);
        ModWeatheredCopperChestplateItem item = new ModWeatheredCopperChestplateItem(armorMaterial, equipmentType, new Item.Settings().registryKey(RegistryKey.of((RegistryKey)RegistryKeys.ITEM, (Identifier)id)));
        Registry.register((Registry)Registries.ITEM, (RegistryKey)key, (Object)((Object)item));
        return item;
    }

    private static Item createOxidizedCopperChestplateArmorItem(String name, ArmorMaterial armorMaterial, EquipmentType equipmentType) {
        Identifier id = Identifier.of((String)"exlinecopperequipment", (String)name);
        RegistryKey key = RegistryKey.of((RegistryKey)RegistryKeys.ITEM, (Identifier)id);
        ModOxidizedCopperChestplateItem item = new ModOxidizedCopperChestplateItem(armorMaterial, equipmentType, new Item.Settings().registryKey(RegistryKey.of((RegistryKey)RegistryKeys.ITEM, (Identifier)id)));
        Registry.register((Registry)Registries.ITEM, (RegistryKey)key, (Object)((Object)item));
        return item;
    }

    private static Item createCopperLeggingsArmorItem(String name, ArmorMaterial armorMaterial, EquipmentType equipmentType) {
        Identifier id = Identifier.of((String)"exlinecopperequipment", (String)name);
        RegistryKey key = RegistryKey.of((RegistryKey)RegistryKeys.ITEM, (Identifier)id);
        ModCopperLeggingsItem item = new ModCopperLeggingsItem(armorMaterial, equipmentType, new Item.Settings().registryKey(RegistryKey.of((RegistryKey)RegistryKeys.ITEM, (Identifier)id)));
        Registry.register((Registry)Registries.ITEM, (RegistryKey)key, (Object)((Object)item));
        return item;
    }

    private static Item createExposedCopperLeggingsArmorItem(String name, ArmorMaterial armorMaterial, EquipmentType equipmentType) {
        Identifier id = Identifier.of((String)"exlinecopperequipment", (String)name);
        RegistryKey key = RegistryKey.of((RegistryKey)RegistryKeys.ITEM, (Identifier)id);
        ModExposedCopperLeggingsItem item = new ModExposedCopperLeggingsItem(armorMaterial, equipmentType, new Item.Settings().registryKey(RegistryKey.of((RegistryKey)RegistryKeys.ITEM, (Identifier)id)));
        Registry.register((Registry)Registries.ITEM, (RegistryKey)key, (Object)((Object)item));
        return item;
    }

    private static Item createWeatheredCopperLeggingsArmorItem(String name, ArmorMaterial armorMaterial, EquipmentType equipmentType) {
        Identifier id = Identifier.of((String)"exlinecopperequipment", (String)name);
        RegistryKey key = RegistryKey.of((RegistryKey)RegistryKeys.ITEM, (Identifier)id);
        ModWeatheredCopperLeggingsItem item = new ModWeatheredCopperLeggingsItem(armorMaterial, equipmentType, new Item.Settings().registryKey(RegistryKey.of((RegistryKey)RegistryKeys.ITEM, (Identifier)id)));
        Registry.register((Registry)Registries.ITEM, (RegistryKey)key, (Object)((Object)item));
        return item;
    }

    private static Item createOxidizedCopperLeggingsArmorItem(String name, ArmorMaterial armorMaterial, EquipmentType equipmentType) {
        Identifier id = Identifier.of((String)"exlinecopperequipment", (String)name);
        RegistryKey key = RegistryKey.of((RegistryKey)RegistryKeys.ITEM, (Identifier)id);
        ModOxidizedCopperLeggingsItem item = new ModOxidizedCopperLeggingsItem(armorMaterial, equipmentType, new Item.Settings().registryKey(RegistryKey.of((RegistryKey)RegistryKeys.ITEM, (Identifier)id)));
        Registry.register((Registry)Registries.ITEM, (RegistryKey)key, (Object)((Object)item));
        return item;
    }

    private static Item createCopperBootsArmorItem(String name, ArmorMaterial armorMaterial, EquipmentType equipmentType) {
        Identifier id = Identifier.of((String)"exlinecopperequipment", (String)name);
        RegistryKey key = RegistryKey.of((RegistryKey)RegistryKeys.ITEM, (Identifier)id);
        ModCopperBootsItem item = new ModCopperBootsItem(armorMaterial, equipmentType, new Item.Settings().registryKey(RegistryKey.of((RegistryKey)RegistryKeys.ITEM, (Identifier)id)));
        Registry.register((Registry)Registries.ITEM, (RegistryKey)key, (Object)((Object)item));
        return item;
    }

    private static Item createExposedCopperBootsArmorItem(String name, ArmorMaterial armorMaterial, EquipmentType equipmentType) {
        Identifier id = Identifier.of((String)"exlinecopperequipment", (String)name);
        RegistryKey key = RegistryKey.of((RegistryKey)RegistryKeys.ITEM, (Identifier)id);
        ModExposedCopperBootsItem item = new ModExposedCopperBootsItem(armorMaterial, equipmentType, new Item.Settings().registryKey(RegistryKey.of((RegistryKey)RegistryKeys.ITEM, (Identifier)id)));
        Registry.register((Registry)Registries.ITEM, (RegistryKey)key, (Object)((Object)item));
        return item;
    }

    private static Item createWeatheredCopperBootsArmorItem(String name, ArmorMaterial armorMaterial, EquipmentType equipmentType) {
        Identifier id = Identifier.of((String)"exlinecopperequipment", (String)name);
        RegistryKey key = RegistryKey.of((RegistryKey)RegistryKeys.ITEM, (Identifier)id);
        ModWeatheredCopperBootsItem item = new ModWeatheredCopperBootsItem(armorMaterial, equipmentType, new Item.Settings().registryKey(RegistryKey.of((RegistryKey)RegistryKeys.ITEM, (Identifier)id)));
        Registry.register((Registry)Registries.ITEM, (RegistryKey)key, (Object)((Object)item));
        return item;
    }

    private static Item createOxidizedCopperBootsArmorItem(String name, ArmorMaterial armorMaterial, EquipmentType equipmentType) {
        Identifier id = Identifier.of((String)"exlinecopperequipment", (String)name);
        RegistryKey key = RegistryKey.of((RegistryKey)RegistryKeys.ITEM, (Identifier)id);
        ModOxidizedCopperBootsItem item = new ModOxidizedCopperBootsItem(armorMaterial, equipmentType, new Item.Settings().registryKey(RegistryKey.of((RegistryKey)RegistryKeys.ITEM, (Identifier)id)));
        Registry.register((Registry)Registries.ITEM, (RegistryKey)key, (Object)((Object)item));
        return item;
    }

    private static Item createAnimalArmorItem(String name, ArmorMaterial armorMaterial, AnimalArmorItem.Type animalArmorItemType) {
        Identifier id = Identifier.of((String)"exlinecopperequipment", (String)name);
        RegistryKey key = RegistryKey.of((RegistryKey)RegistryKeys.ITEM, (Identifier)id);
        AnimalArmorItem item = new AnimalArmorItem(armorMaterial, animalArmorItemType, new Item.Settings().registryKey(RegistryKey.of((RegistryKey)RegistryKeys.ITEM, (Identifier)id)));
        Registry.register((Registry)Registries.ITEM, (RegistryKey)key, (Object)item);
        return item;
    }

    public static void registerItems() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> entries.add((ItemConvertible)COPPER_NUGGET));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> {
            entries.add((ItemConvertible)COPPER_SWORD);
            entries.add((ItemConvertible)COPPER_AXE);
            entries.add((ItemConvertible)COPPER_BOW);
            entries.add((ItemConvertible)COPPER_HELMET);
            entries.add((ItemConvertible)COPPER_CHESTPLATE);
            entries.add((ItemConvertible)COPPER_LEGGINGS);
            entries.add((ItemConvertible)COPPER_BOOTS);
            entries.add((ItemConvertible)COPPER_HORSE_ARMOR);
            entries.add((ItemConvertible)EXPOSED_COPPER_HELMET);
            entries.add((ItemConvertible)EXPOSED_COPPER_CHESTPLATE);
            entries.add((ItemConvertible)EXPOSED_COPPER_LEGGINGS);
            entries.add((ItemConvertible)EXPOSED_COPPER_BOOTS);
            entries.add((ItemConvertible)EXPOSED_COPPER_HORSE_ARMOR);
            entries.add((ItemConvertible)WEATHERED_COPPER_HELMET);
            entries.add((ItemConvertible)WEATHERED_COPPER_CHESTPLATE);
            entries.add((ItemConvertible)WEATHERED_COPPER_LEGGINGS);
            entries.add((ItemConvertible)WEATHERED_COPPER_BOOTS);
            entries.add((ItemConvertible)WEATHERED_COPPER_HORSE_ARMOR);
            entries.add((ItemConvertible)OXIDIZED_COPPER_HELMET);
            entries.add((ItemConvertible)OXIDIZED_COPPER_CHESTPLATE);
            entries.add((ItemConvertible)OXIDIZED_COPPER_LEGGINGS);
            entries.add((ItemConvertible)OXIDIZED_COPPER_BOOTS);
            entries.add((ItemConvertible)OXIDIZED_COPPER_HORSE_ARMOR);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {
            entries.add((ItemConvertible)COPPER_AXE);
            entries.add((ItemConvertible)COPPER_PICKAXE);
            entries.add((ItemConvertible)COPPER_SHOVEL);
            entries.add((ItemConvertible)COPPER_HOE);
            entries.add((ItemConvertible)COPPER_SHEARS);
            entries.add((ItemConvertible)COPPER_BUCKET);
            entries.add((ItemConvertible)COPPER_WATER_BUCKET);
            entries.add((ItemConvertible)COPPER_MILK_BUCKET);
            entries.add((ItemConvertible)COPPER_POWDER_SNOW_BUCKET);
            entries.add((ItemConvertible)COPPER_SAND_BUCKET);
            entries.add((ItemConvertible)COPPER_RED_SAND_BUCKET);
            entries.add((ItemConvertible)COPPER_GRAVEL_BUCKET);
            entries.add((ItemConvertible)COPPER_SOUL_SAND_BUCKET);
        });
    }
}

