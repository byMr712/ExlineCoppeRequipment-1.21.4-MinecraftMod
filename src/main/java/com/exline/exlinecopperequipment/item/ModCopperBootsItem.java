/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityType
 *  net.minecraft.entity.EquipmentSlot
 *  net.minecraft.entity.LightningEntity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.item.ArmorItem
 *  net.minecraft.item.Item$Settings
 *  net.minecraft.item.ItemConvertible
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.equipment.ArmorMaterial
 *  net.minecraft.item.equipment.EquipmentType
 *  net.minecraft.particle.ParticleEffect
 *  net.minecraft.particle.ParticleTypes
 *  net.minecraft.server.world.ServerWorld
 *  net.minecraft.sound.SoundCategory
 *  net.minecraft.sound.SoundEvents
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.world.World
 */
package com.exline.exlinecopperequipment.item;

import com.exline.exlinecopperequipment.init.ItemInit;
import com.exline.exlinecopperequipment.sounds.ModSounds;
import java.util.Random;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LightningEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemStack;
import net.minecraft.item.equipment.ArmorMaterial;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class ModCopperBootsItem
extends ArmorItem {
    private int tickCount = 0;
    private boolean isInRainAndThundering = false;
    private static final int LIGHTNING_DELAY_TICKS = 50;

    public ModCopperBootsItem(ArmorMaterial material, EquipmentType type, Item.Settings settings) {
        super(material, type, settings);
    }

    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        super.inventoryTick(stack, world, entity, slot, selected);
        if (this.tickCount < 0) {
            this.tickCount = 0;
        }
        if (entity instanceof PlayerEntity) {
            PlayerEntity player = (PlayerEntity)entity;
            ItemStack boots = player.getEquippedStack(EquipmentSlot.FEET);
            int maxDamage = boots.getMaxDamage();
            int damage = stack.getDamage();
            BlockPos playerPos = player.getBlockPos();
            Vec3d playerPosition = player.getPos();
            boolean isRainingAtPlayer = world.hasRain(playerPos);
            boolean isThundering = world.isThundering();
            Random random = new Random();
            if (isRainingAtPlayer && random.nextInt(1000) == 0) {
                stack.setDamage(damage + 1);
            }
            int bound = Math.max(1, Math.abs(50 - this.tickCount));
            if (isThundering && isRainingAtPlayer && random.nextInt(bound) == 0) {
                if (!this.isInRainAndThundering) {
                    this.isInRainAndThundering = true;
                    this.tickCount = 0;
                }
                ++this.tickCount;
                player.playSound(ModSounds.STATIC_SOUND, 1.0f, 1.0f);
                world.addParticle((ParticleEffect)ParticleTypes.ELECTRIC_SPARK, playerPosition.getX() - 0.5 + (double)random.nextFloat(1.0f), playerPosition.getY() + 1.0, playerPosition.getZ() - 0.5 + (double)random.nextFloat(1.0f), 0.0, 2.0, 0.0);
                if (this.tickCount >= 50 && !world.isClient) {
                    LightningEntity lightning = new LightningEntity(EntityType.LIGHTNING_BOLT, world);
                    lightning.refreshPositionAfterTeleport(player.getPos());
                    lightning.setCosmetic(false);
                    ((ServerWorld)world).spawnEntity((Entity)lightning);
                    player.playSound(SoundEvents.ENTITY_LIGHTNING_BOLT_THUNDER, 1.0f, 1.0f);
                    lightning.getWorld().playSound(null, lightning.getX(), lightning.getY(), lightning.getZ(), SoundEvents.ENTITY_LIGHTNING_BOLT_IMPACT, SoundCategory.WEATHER, 10000.0f, 1.0f);
                    this.tickCount = 0;
                }
            }
            ItemStack newBoots = new ItemStack((ItemConvertible)ItemInit.OXIDIZED_COPPER_BOOTS);
            if (boots.getItem() == this && boots.getDamage() >= maxDamage * 3 / 4) {
                newBoots = new ItemStack((ItemConvertible)ItemInit.OXIDIZED_COPPER_BOOTS);
                newBoots.setDamage(damage);
                player.equipStack(EquipmentSlot.FEET, newBoots);
            } else if (boots.getItem() == this && boots.getDamage() >= maxDamage / 2) {
                newBoots = new ItemStack((ItemConvertible)ItemInit.WEATHERED_COPPER_BOOTS);
                newBoots.setDamage(damage);
                player.equipStack(EquipmentSlot.FEET, newBoots);
            } else if (boots.getItem() == this && boots.getDamage() >= maxDamage / 4) {
                newBoots = new ItemStack((ItemConvertible)ItemInit.EXPOSED_COPPER_BOOTS);
                newBoots.setDamage(damage);
                player.equipStack(EquipmentSlot.FEET, newBoots);
            }
        }
    }
}

