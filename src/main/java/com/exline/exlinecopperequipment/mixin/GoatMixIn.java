/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.EntityType
 *  net.minecraft.entity.passive.AnimalEntity
 *  net.minecraft.entity.passive.GoatEntity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.item.ItemConvertible
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.ItemUsage
 *  net.minecraft.sound.SoundEvents
 *  net.minecraft.util.ActionResult
 *  net.minecraft.util.Hand
 *  net.minecraft.world.World
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package com.exline.exlinecopperequipment.mixin;

import com.exline.exlinecopperequipment.init.ItemInit;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.passive.GoatEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsage;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={GoatEntity.class})
public abstract class GoatMixIn
extends AnimalEntity {
    protected GoatMixIn(EntityType<? extends AnimalEntity> entityType, World world) {
        super(entityType, world);
    }

    @Inject(method={"interactMob"}, at={@At(value="HEAD")}, cancellable=true)
    private void injectCopperMilk(PlayerEntity player, Hand hand, CallbackInfoReturnable<ActionResult> cir) {
        ItemStack itemStack = player.getStackInHand(hand);
        if (itemStack.isOf(ItemInit.COPPER_BUCKET) && !((GoatEntity)(Object)this).isBaby()) {
            player.playSound(SoundEvents.ENTITY_GOAT_MILK, 1.0f, 1.0f);
            ItemStack copperMilkBucket = new ItemStack((ItemConvertible)ItemInit.COPPER_MILK_BUCKET);
            player.setStackInHand(hand, ItemUsage.exchangeStack((ItemStack)itemStack, (PlayerEntity)player, (ItemStack)copperMilkBucket));
            cir.setReturnValue(ActionResult.SUCCESS);
        }
    }
}

