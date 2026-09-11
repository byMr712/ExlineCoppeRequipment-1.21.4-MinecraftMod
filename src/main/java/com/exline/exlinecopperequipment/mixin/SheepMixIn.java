/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityType
 *  net.minecraft.entity.LivingEntity
 *  net.minecraft.entity.Shearable
 *  net.minecraft.entity.passive.AnimalEntity
 *  net.minecraft.entity.passive.SheepEntity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.item.ItemStack
 *  net.minecraft.registry.entry.RegistryEntry
 *  net.minecraft.server.world.ServerWorld
 *  net.minecraft.sound.SoundCategory
 *  net.minecraft.util.ActionResult
 *  net.minecraft.util.Hand
 *  net.minecraft.world.World
 *  net.minecraft.world.event.GameEvent
 *  org.spongepowered.asm.mixin.Mixin
 */
package com.exline.exlinecopperequipment.mixin;

import com.exline.exlinecopperequipment.item.ModItemTags;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Shearable;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.passive.SheepEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;
import net.minecraft.world.event.GameEvent;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(value={SheepEntity.class})
public abstract class SheepMixIn
extends AnimalEntity
implements Shearable {
    protected SheepMixIn(EntityType<? extends AnimalEntity> entityType, World world) {
        super(entityType, world);
    }

    public ActionResult interactMob(PlayerEntity player, Hand hand) {
        ItemStack itemStack = player.getStackInHand(hand);
        if (itemStack.isIn(ModItemTags.SHEARS)) {
            World var5 = this.getWorld();
            if (var5 instanceof ServerWorld) {
                ServerWorld serverWorld = (ServerWorld)var5;
                if (this.isShearable()) {
                    this.sheared(serverWorld, SoundCategory.PLAYERS, itemStack);
                    this.emitGameEvent((RegistryEntry)GameEvent.SHEAR, (Entity)player);
                    itemStack.damage(1, (LivingEntity)player, SheepMixIn.getSlotForHand((Hand)hand));
                    return ActionResult.SUCCESS_SERVER;
                }
            }
            return ActionResult.CONSUME;
        }
        return super.interactMob(player, hand);
    }
}

