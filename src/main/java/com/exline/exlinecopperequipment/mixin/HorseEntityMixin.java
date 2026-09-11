/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.EntityType
 *  net.minecraft.entity.EquipmentSlot
 *  net.minecraft.entity.VariantHolder
 *  net.minecraft.entity.damage.DamageSource
 *  net.minecraft.entity.passive.AbstractHorseEntity
 *  net.minecraft.entity.passive.HorseColor
 *  net.minecraft.entity.passive.HorseEntity
 *  net.minecraft.item.ItemConvertible
 *  net.minecraft.item.ItemStack
 *  net.minecraft.world.World
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package com.exline.exlinecopperequipment.mixin;

import com.exline.exlinecopperequipment.init.ItemInit;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.VariantHolder;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.passive.AbstractHorseEntity;
import net.minecraft.entity.passive.HorseColor;
import net.minecraft.entity.passive.HorseEntity;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={HorseEntity.class})
public abstract class HorseEntityMixin
extends AbstractHorseEntity
implements VariantHolder<HorseColor> {
    protected HorseEntityMixin(EntityType<? extends AbstractHorseEntity> entityType, World world) {
        super(entityType, world);
    }

    @Inject(method={"damageArmor"}, at={@At(value="HEAD")})
    private void onDamageArmor(DamageSource source, float amount, CallbackInfo ci) {
        HorseEntity horse = (HorseEntity)(Object)this;
        ItemStack currentArmor = horse.getEquippedStack(EquipmentSlot.BODY);
        if (currentArmor.isEmpty()) {
            this.damageEquipment(source, amount, new EquipmentSlot[]{EquipmentSlot.BODY});
            return;
        }
        int maxDamage = currentArmor.getMaxDamage();
        int damage = currentArmor.getDamage();
        float durabilityPercentage = (float)(maxDamage - damage) / (float)maxDamage;
        ItemStack newArmor = ItemStack.EMPTY;
        if (!currentArmor.isOf(ItemInit.OXIDIZED_COPPER_HORSE_ARMOR) && (double)durabilityPercentage <= 0.25) {
            newArmor = new ItemStack((ItemConvertible)ItemInit.OXIDIZED_COPPER_HORSE_ARMOR);
            newArmor.setDamage(damage);
            horse.equipStack(EquipmentSlot.BODY, newArmor);
            this.damageEquipment(source, amount, new EquipmentSlot[]{EquipmentSlot.BODY});
        } else if (!currentArmor.isOf(ItemInit.WEATHERED_COPPER_HORSE_ARMOR) && (double)durabilityPercentage <= 0.5) {
            newArmor = new ItemStack((ItemConvertible)ItemInit.WEATHERED_COPPER_HORSE_ARMOR);
            newArmor.setDamage(damage);
            horse.equipStack(EquipmentSlot.BODY, newArmor);
            this.damageEquipment(source, amount, new EquipmentSlot[]{EquipmentSlot.BODY});
        } else if (!currentArmor.isOf(ItemInit.EXPOSED_COPPER_HORSE_ARMOR) && (double)durabilityPercentage <= 0.75) {
            newArmor = new ItemStack((ItemConvertible)ItemInit.EXPOSED_COPPER_HORSE_ARMOR);
            newArmor.setDamage(damage);
            horse.equipStack(EquipmentSlot.BODY, newArmor);
            this.damageEquipment(source, amount, new EquipmentSlot[]{EquipmentSlot.BODY});
        } else if (!currentArmor.isOf(ItemInit.COPPER_HORSE_ARMOR)) {
            newArmor = new ItemStack((ItemConvertible)ItemInit.COPPER_HORSE_ARMOR);
            newArmor.setDamage(damage);
            horse.equipStack(EquipmentSlot.BODY, newArmor);
            this.damageEquipment(source, amount, new EquipmentSlot[]{EquipmentSlot.BODY});
        }
    }
}

