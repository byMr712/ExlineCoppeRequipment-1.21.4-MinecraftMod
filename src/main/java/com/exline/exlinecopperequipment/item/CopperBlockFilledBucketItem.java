/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.block.BlockState
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.item.BlockItem
 *  net.minecraft.item.FluidModificationItem
 *  net.minecraft.item.Item$Settings
 *  net.minecraft.item.ItemUsageContext
 *  net.minecraft.registry.entry.RegistryEntry
 *  net.minecraft.sound.SoundCategory
 *  net.minecraft.sound.SoundEvent
 *  net.minecraft.util.ActionResult
 *  net.minecraft.util.hit.BlockHitResult
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.world.World
 *  net.minecraft.world.event.GameEvent
 *  org.jetbrains.annotations.Nullable
 */
package com.exline.exlinecopperequipment.item;

import com.exline.exlinecopperequipment.init.ItemInit;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.FluidModificationItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.ActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.event.GameEvent;
import org.jetbrains.annotations.Nullable;

public class CopperBlockFilledBucketItem
extends BlockItem
implements FluidModificationItem {
    private final SoundEvent placeSound;

    public CopperBlockFilledBucketItem(Block block, SoundEvent placeSound, Item.Settings settings) {
        super(block, settings);
        this.placeSound = placeSound;
    }

    public ActionResult useOnBlock(ItemUsageContext context) {
        ActionResult actionResult = super.useOnBlock(context);
        PlayerEntity playerEntity = context.getPlayer();
        if (actionResult.isAccepted() && playerEntity != null) {
            playerEntity.setStackInHand(context.getHand(), ItemInit.COPPER_BUCKET.getDefaultStack());
        }
        return actionResult;
    }

    protected SoundEvent getPlaceSound(BlockState state) {
        return this.placeSound;
    }

    public boolean placeFluid(@Nullable PlayerEntity player, World world, BlockPos pos, @Nullable BlockHitResult hitResult) {
        if (world.isInBuildLimit(pos) && world.isAir(pos)) {
            if (!world.isClient) {
                world.setBlockState(pos, this.getBlock().getDefaultState(), 3);
            }
            world.emitGameEvent((Entity)player, (RegistryEntry)GameEvent.FLUID_PLACE, pos);
            world.playSound(player, pos, this.placeSound, SoundCategory.BLOCKS, 1.0f, 1.0f);
            return true;
        }
        return false;
    }
}

