/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Pair
 */
package com.exline.exlinecopperequipment.config;

import com.exline.exlinecopperequipment.config.ModConfigProvider;
import com.exline.exlinecopperequipment.config.SimpleConfig;
import com.mojang.datafixers.util.Pair;

public class ModConfigs {
    public static SimpleConfig CONFIG;
    private static ModConfigProvider configs;
    public static int MINING_LEVEL;
    public static int DURABILITY;
    public static double MINING_SPEED;
    public static double ATTACK_DAMAGE;
    public static int ENCHANTABILITY;
    public static int defaultMiningLevel;
    public static int defaultDurability;
    public static double defaultMiningSpeed;
    public static double defaultAttackDamage;
    public static int defaultEnchantability;
    public static int ARMOR_DURABILITY_MULTIPLIER;
    public static int defaultArmorDurability;
    public static int ARMOR_VALUE_HELM;
    public static int ARMOR_VALUE_CHEST;
    public static int ARMOR_VALUE_LEGGS;
    public static int ARMOR_VALUE_BOOTS;
    public static int ARMOR_VALUE_HORSE;
    public static int defaularmorValueHelm;
    public static int defaularmorValueChest;
    public static int defaularmorValueLeggs;
    public static int defaularmorValueBoots;
    public static int defaularmorValueHorse;
    public static int ARMOR_ENCHATABILITY;
    public static int defaultArmorEnchant;
    public static double ARMOR_TOUGHNESS;
    public static double ARMOR_KNOCKBACK_RESIST;
    public static double defaultArmorToughness;
    public static double defaultArmorKnockbackResist;
    public static double ATTACK_DAMAGE_SWORD;
    public static double ATTACK_DAMAGE_SHOVEL;
    public static double ATTACK_DAMAGE_PICKAXE;
    public static double ATTACK_DAMAGE_AXE;
    public static double ATTACK_DAMAGE_HOE;
    public static double defaultAttackDamageSword;
    public static double defaultAttackDamageShovel;
    public static double defaultAttackDamagePickaxe;
    public static double defaultAttackDamageAxe;
    public static double defaultAttackDamageHoe;
    public static double ATTACK_SPEED_SWORD;
    public static double ATTACK_SPEED_SHOVEL;
    public static double ATTACK_SPEED_PICKAXE;
    public static double ATTACK_SPEED_AXE;
    public static double ATTACK_SPEED_HOE;
    public static double defaultAttackSpeedSword;
    public static double defaultAttackSpeedShovel;
    public static double defaultAttackSpeedPickaxe;
    public static double defaultAttackSpeedAxe;
    public static double defaultAttackSpeedHoe;
    public static int MAX_USES_SHEARS;
    public static int defaultMaxUsesShears;
    public static int COPPER_BOW_DURABILITY;
    public static int defaultCopperBowDurability;

    public static void registerConfigs() {
        configs = new ModConfigProvider();
        ModConfigs.createConfigs();
        CONFIG = SimpleConfig.of("exlinecopperequipmentconfig").provider(configs).request();
        ModConfigs.assignConfigs();
    }

    private static void createConfigs() {
        configs.addKeyValuePair(new Pair((Object)"copperequipment.mining.level", (Object)defaultMiningLevel), "int");
        configs.addKeyValuePair(new Pair((Object)"copperequipment.durability", (Object)defaultDurability), "int");
        configs.addKeyValuePair(new Pair((Object)"copperequipment.mining.speed", (Object)defaultMiningSpeed), "double");
        configs.addKeyValuePair(new Pair((Object)"copperequipment.attack.damage", (Object)defaultAttackDamage), "double");
        configs.addKeyValuePair(new Pair((Object)"copperequipment.enchantability", (Object)defaultEnchantability), "int");
        configs.addKeyValuePair(new Pair((Object)"copperequipment.armor.durability", (Object)defaultArmorDurability), "int");
        configs.addKeyValuePair(new Pair((Object)"copperequipment.armorvalue.helm", (Object)defaularmorValueHelm), "int");
        configs.addKeyValuePair(new Pair((Object)"copperequipment.armorvalue.chest", (Object)defaularmorValueChest), "int");
        configs.addKeyValuePair(new Pair((Object)"copperequipment.armorvalue.leggs", (Object)defaularmorValueLeggs), "int");
        configs.addKeyValuePair(new Pair((Object)"copperequipment.armorvalue.boots", (Object)defaularmorValueBoots), "int");
        configs.addKeyValuePair(new Pair((Object)"copperequipment.armorvalue.horse", (Object)defaularmorValueHorse), "int");
        configs.addKeyValuePair(new Pair((Object)"copperequipment.armor.enchantability", (Object)defaultArmorEnchant), "double");
        configs.addKeyValuePair(new Pair((Object)"copperequipment.armor.toughness", (Object)defaultArmorToughness), "double");
        configs.addKeyValuePair(new Pair((Object)"copperequipment.armor.knockback.resistance", (Object)defaultArmorKnockbackResist), "double");
        configs.addKeyValuePair(new Pair((Object)"copperequipment.attack.damage.sword", (Object)defaultAttackDamageSword), "int");
        configs.addKeyValuePair(new Pair((Object)"copperequipment.attack.damage.shovel", (Object)defaultAttackDamageShovel), "double");
        configs.addKeyValuePair(new Pair((Object)"copperequipment.attack.damage.pickaxe", (Object)defaultAttackDamagePickaxe), "double");
        configs.addKeyValuePair(new Pair((Object)"copperequipment.attack.damage.axe", (Object)defaultAttackDamageAxe), "double");
        configs.addKeyValuePair(new Pair((Object)"copperequipment.attack.damage.hoe", (Object)defaultAttackDamageHoe), "double");
        configs.addKeyValuePair(new Pair((Object)"copperequipment.attack.speed.sword", (Object)defaultAttackSpeedSword), "double");
        configs.addKeyValuePair(new Pair((Object)"copperequipment.attack.speed.shovel", (Object)defaultAttackSpeedShovel), "double");
        configs.addKeyValuePair(new Pair((Object)"copperequipment.attack.speed.pickaxe", (Object)defaultAttackSpeedPickaxe), "double");
        configs.addKeyValuePair(new Pair((Object)"copperequipment.attack.speed.axe", (Object)defaultAttackSpeedAxe), "double");
        configs.addKeyValuePair(new Pair((Object)"copperequipment.attack.speed.hoe", (Object)defaultAttackSpeedHoe), "double");
        configs.addKeyValuePair(new Pair((Object)"copperequipment.max.uses.shears", (Object)defaultMaxUsesShears), "int");
        configs.addKeyValuePair(new Pair((Object)"copperequipment.durability.copper.bow", (Object)defaultCopperBowDurability), "int");
    }

    private static void assignConfigs() {
        MINING_LEVEL = CONFIG.getOrDefault("copperequipment.mining.level", defaultMiningLevel);
        DURABILITY = CONFIG.getOrDefault("copperequipment.durability", defaultDurability);
        MINING_SPEED = CONFIG.getOrDefault("copperequipment.mining.speed", defaultMiningSpeed);
        ATTACK_DAMAGE = CONFIG.getOrDefault("copperequipment.attack.damage", defaultAttackDamage);
        ENCHANTABILITY = CONFIG.getOrDefault("copperequipment.enchantability", defaultEnchantability);
        ARMOR_DURABILITY_MULTIPLIER = CONFIG.getOrDefault("copperequipment.armor.durability", defaultArmorDurability);
        ARMOR_VALUE_HELM = CONFIG.getOrDefault("copperequipment.armorvalue.helm", defaularmorValueHelm);
        ARMOR_VALUE_CHEST = CONFIG.getOrDefault("copperequipment.armorvalue.chest", defaularmorValueChest);
        ARMOR_VALUE_LEGGS = CONFIG.getOrDefault("copperequipment.armorvalue.leggs", defaularmorValueLeggs);
        ARMOR_VALUE_BOOTS = CONFIG.getOrDefault("copperequipment.armorvalue.boots", defaularmorValueBoots);
        ARMOR_VALUE_HORSE = CONFIG.getOrDefault("copperequipment.armorvalue.horse", defaularmorValueHorse);
        ARMOR_ENCHATABILITY = CONFIG.getOrDefault("copperequipment.armor.enchantability", defaultArmorEnchant);
        ARMOR_TOUGHNESS = CONFIG.getOrDefault("copperequipment.armor.toughness", defaultArmorToughness);
        ARMOR_KNOCKBACK_RESIST = CONFIG.getOrDefault("copperequipment.knockback.resistance", defaultArmorKnockbackResist);
        ATTACK_DAMAGE_SWORD = CONFIG.getOrDefault("copperequipment.attack.damage.sword", defaultAttackDamageSword);
        ATTACK_DAMAGE_SHOVEL = CONFIG.getOrDefault("copperequipment.attack.damage.shovel", defaultAttackDamageShovel);
        ATTACK_DAMAGE_PICKAXE = CONFIG.getOrDefault("copperequipment.attack.damage.pickaxe", defaultAttackDamagePickaxe);
        ATTACK_DAMAGE_AXE = CONFIG.getOrDefault("copperequipment.attack.damage.axe", defaultAttackDamageAxe);
        ATTACK_DAMAGE_HOE = CONFIG.getOrDefault("copperequipment.attack.damage.hoe", defaultAttackDamageHoe);
        ATTACK_SPEED_SWORD = CONFIG.getOrDefault("copperequipment.attack.speed.sword", defaultAttackSpeedSword);
        ATTACK_SPEED_SHOVEL = CONFIG.getOrDefault("copperequipment.attack.speed.shovel", defaultAttackSpeedShovel);
        ATTACK_SPEED_PICKAXE = CONFIG.getOrDefault("copperequipment.attack.speed.pickaxe", defaultAttackSpeedPickaxe);
        ATTACK_SPEED_AXE = CONFIG.getOrDefault("copperequipment.attack.speed.axe", defaultAttackSpeedAxe);
        ATTACK_SPEED_HOE = CONFIG.getOrDefault("copperequipment.attack.speed.hoe", defaultAttackSpeedHoe);
        MAX_USES_SHEARS = CONFIG.getOrDefault("copperequipment.max.uses.shears", defaultMaxUsesShears);
        COPPER_BOW_DURABILITY = CONFIG.getOrDefault("copperequipment.durability.copper.bow", defaultCopperBowDurability);
        System.out.println("All " + configs.getConfigsList().size() + " have been set properly");
    }

    static {
        defaultMiningLevel = 1;
        defaultDurability = 190;
        defaultMiningSpeed = 5.0;
        defaultAttackDamage = 4.5;
        defaultEnchantability = 10;
        defaultArmorDurability = 10;
        defaularmorValueHelm = 2;
        defaularmorValueChest = 4;
        defaularmorValueLeggs = 3;
        defaularmorValueBoots = 2;
        defaularmorValueHorse = 4;
        defaultArmorEnchant = 12;
        defaultArmorToughness = 0.0;
        defaultArmorKnockbackResist = 0.0;
        defaultAttackDamageSword = -0.5;
        defaultAttackDamageShovel = -2.0;
        defaultAttackDamagePickaxe = -2.5;
        defaultAttackDamageAxe = 3.0;
        defaultAttackDamageHoe = -5.0;
        defaultAttackSpeedSword = -2.4;
        defaultAttackSpeedShovel = -3.0;
        defaultAttackSpeedPickaxe = -2.8;
        defaultAttackSpeedAxe = -3.1;
        defaultAttackSpeedHoe = -1.5;
        defaultMaxUsesShears = 80;
        defaultCopperBowDurability = 618;
    }
}

