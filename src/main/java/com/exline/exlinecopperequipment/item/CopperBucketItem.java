/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.advancement.criterion.Criteria
 *  net.minecraft.block.Block
 *  net.minecraft.block.BlockState
 *  net.minecraft.block.Blocks
 *  net.minecraft.block.FluidDrainable
 *  net.minecraft.block.FluidFillable
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.fluid.FlowableFluid
 *  net.minecraft.fluid.Fluid
 *  net.minecraft.fluid.Fluids
 *  net.minecraft.item.FluidModificationItem
 *  net.minecraft.item.Item
 *  net.minecraft.item.Item$Settings
 *  net.minecraft.item.ItemConvertible
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.ItemUsage
 *  net.minecraft.particle.ParticleEffect
 *  net.minecraft.particle.ParticleTypes
 *  net.minecraft.registry.entry.RegistryEntry
 *  net.minecraft.registry.tag.FluidTags
 *  net.minecraft.server.network.ServerPlayerEntity
 *  net.minecraft.sound.SoundCategory
 *  net.minecraft.sound.SoundEvent
 *  net.minecraft.sound.SoundEvents
 *  net.minecraft.stat.Stats
 *  net.minecraft.util.ActionResult
 *  net.minecraft.util.Hand
 *  net.minecraft.util.hit.BlockHitResult
 *  net.minecraft.util.hit.HitResult$Type
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Direction
 *  net.minecraft.world.BlockView
 *  net.minecraft.world.RaycastContext$FluidHandling
 *  net.minecraft.world.World
 *  net.minecraft.world.WorldAccess
 *  net.minecraft.world.event.GameEvent
 *  org.jetbrains.annotations.Nullable
 */
package com.exline.exlinecopperequipment.item;

import com.exline.exlinecopperequipment.init.ItemInit;
import net.minecraft.advancement.criterion.Criteria;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.FluidDrainable;
import net.minecraft.block.FluidFillable;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.FluidModificationItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsage;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.registry.tag.FluidTags;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.stat.Stats;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.BlockView;
import net.minecraft.world.RaycastContext;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.event.GameEvent;
import org.jetbrains.annotations.Nullable;

public class CopperBucketItem
extends Item
implements FluidModificationItem {
    private final Fluid fluid;

    public CopperBucketItem(Fluid fluid, Item.Settings settings) {
        super(settings);
        this.fluid = fluid;
    }

    public ActionResult use(World world, PlayerEntity user, Hand hand) {
        ItemStack itemStack = user.getStackInHand(hand);
        BlockHitResult blockHitResult = CopperBucketItem.raycast((World)world, (PlayerEntity)user, (RaycastContext.FluidHandling)(this.fluid == Fluids.EMPTY ? RaycastContext.FluidHandling.SOURCE_ONLY : RaycastContext.FluidHandling.NONE));
        if (blockHitResult.getType() == HitResult.Type.MISS) {
            return ActionResult.PASS;
        }
        if (!blockHitResult.equals(Blocks.LAVA)) {
            BlockPos blockPos = blockHitResult.getBlockPos();
            Direction direction = blockHitResult.getSide();
            BlockPos blockPos2 = blockPos.offset(direction);
            if (world.canPlayerModifyAt(user, blockPos) && user.canPlaceOn(blockPos2, direction, itemStack)) {
                BlockPos blockPos3;
                if (this.fluid == Fluids.EMPTY) {
                    ItemStack itemStack3;
                    ItemStack itemStack2;
                    BlockState blockState = world.getBlockState(blockPos);
                    Block block = blockState.getBlock();
                    if (block == Blocks.WATER) {
                        FluidDrainable fluidDrainable = (FluidDrainable)block;
                        itemStack2 = ItemInit.COPPER_WATER_BUCKET.getDefaultStack();
                        if (!itemStack2.isEmpty()) {
                            user.incrementStat(Stats.USED.getOrCreateStat(this));
                            fluidDrainable.getBucketFillSound().ifPresent(sound -> user.playSound(sound, 1.0f, 1.0f));
                            world.emitGameEvent((Entity)user, (RegistryEntry)GameEvent.FLUID_PICKUP, blockPos);
                            ItemStack itemStack32 = ItemUsage.exchangeStack((ItemStack)itemStack, (PlayerEntity)user, (ItemStack)itemStack2);
                            if (!world.isClient) {
                                Criteria.FILLED_BUCKET.trigger((ServerPlayerEntity)user, itemStack2);
                            }
                            world.setBlockState(blockPos, Blocks.AIR.getDefaultState());
                            return ActionResult.SUCCESS.withNewHandStack(itemStack32);
                        }
                    }
                    if (block == Blocks.POWDER_SNOW) {
                        itemStack2 = ItemInit.COPPER_POWDER_SNOW_BUCKET.getDefaultStack();
                        user.incrementStat(Stats.USED.getOrCreateStat(this));
                        itemStack3 = ItemUsage.exchangeStack((ItemStack)itemStack, (PlayerEntity)user, (ItemStack)itemStack2);
                        if (!world.isClient) {
                            Criteria.FILLED_BUCKET.trigger((ServerPlayerEntity)user, itemStack2);
                        }
                        world.setBlockState(blockPos, Blocks.AIR.getDefaultState());
                        return ActionResult.SUCCESS.withNewHandStack(itemStack3);
                    }
                    if (block == Blocks.SAND) {
                        itemStack2 = ItemInit.COPPER_SAND_BUCKET.getDefaultStack();
                        user.incrementStat(Stats.USED.getOrCreateStat(this));
                        itemStack3 = ItemUsage.exchangeStack((ItemStack)itemStack, (PlayerEntity)user, (ItemStack)itemStack2);
                        if (!world.isClient) {
                            Criteria.FILLED_BUCKET.trigger((ServerPlayerEntity)user, itemStack2);
                        }
                        world.setBlockState(blockPos, Blocks.AIR.getDefaultState());
                        return ActionResult.SUCCESS.withNewHandStack(itemStack3);
                    }
                    if (block == Blocks.RED_SAND) {
                        itemStack2 = ItemInit.COPPER_RED_SAND_BUCKET.getDefaultStack();
                        user.incrementStat(Stats.USED.getOrCreateStat(this));
                        itemStack3 = ItemUsage.exchangeStack((ItemStack)itemStack, (PlayerEntity)user, (ItemStack)itemStack2);
                        if (!world.isClient) {
                            Criteria.FILLED_BUCKET.trigger((ServerPlayerEntity)user, itemStack2);
                        }
                        world.setBlockState(blockPos, Blocks.AIR.getDefaultState());
                        return ActionResult.SUCCESS.withNewHandStack(itemStack3);
                    }
                    if (block == Blocks.GRAVEL) {
                        itemStack2 = ItemInit.COPPER_GRAVEL_BUCKET.getDefaultStack();
                        user.incrementStat(Stats.USED.getOrCreateStat(this));
                        itemStack3 = ItemUsage.exchangeStack((ItemStack)itemStack, (PlayerEntity)user, (ItemStack)itemStack2);
                        if (!world.isClient) {
                            Criteria.FILLED_BUCKET.trigger((ServerPlayerEntity)user, itemStack2);
                        }
                        world.setBlockState(blockPos, Blocks.AIR.getDefaultState());
                        return ActionResult.SUCCESS.withNewHandStack(itemStack3);
                    }
                    if (block == Blocks.SOUL_SAND) {
                        itemStack2 = ItemInit.COPPER_SOUL_SAND_BUCKET.getDefaultStack();
                        user.incrementStat(Stats.USED.getOrCreateStat(this));
                        itemStack3 = ItemUsage.exchangeStack((ItemStack)itemStack, (PlayerEntity)user, (ItemStack)itemStack2);
                        if (!world.isClient) {
                            Criteria.FILLED_BUCKET.trigger((ServerPlayerEntity)user, itemStack2);
                        }
                        world.setBlockState(blockPos, Blocks.AIR.getDefaultState());
                        return ActionResult.SUCCESS.withNewHandStack(itemStack3);
                    }
                    return ActionResult.FAIL;
                }
                BlockState blockState = world.getBlockState(blockPos);
                BlockPos blockPos4 = blockPos3 = blockState.getBlock() instanceof FluidFillable && this.fluid == Fluids.WATER ? blockPos : blockPos2;
                if (this.placeFluid(user, world, blockPos3, blockHitResult)) {
                    this.onEmptied(user, world, itemStack, blockPos3);
                    if (user instanceof ServerPlayerEntity) {
                        Criteria.PLACED_BLOCK.trigger((ServerPlayerEntity)user, blockPos3, itemStack);
                    }
                    user.incrementStat(Stats.USED.getOrCreateStat(this));
                    ItemStack itemStack2 = ItemUsage.exchangeStack((ItemStack)itemStack, (PlayerEntity)user, (ItemStack)CopperBucketItem.getEmptiedStack(itemStack, user));
                    return ActionResult.SUCCESS.withNewHandStack(itemStack2);
                }
                return ActionResult.FAIL;
            }
            return ActionResult.FAIL;
        }
        return ActionResult.FAIL;
    }

    public static ItemStack getEmptiedStack(ItemStack stack, PlayerEntity player) {
        return !player.isInCreativeMode() ? new ItemStack((ItemConvertible)ItemInit.COPPER_BUCKET) : stack;
    }

    public void onEmptied(@Nullable PlayerEntity player, World world, ItemStack stack, BlockPos pos) {
    }

    public boolean placeFluid(@Nullable PlayerEntity player, World world, BlockPos pos, @Nullable BlockHitResult hitResult) {
        FluidFillable fluidFillable;
        Fluid var6 = this.fluid;
        if (!(var6 instanceof FlowableFluid)) {
            return false;
        }
        FlowableFluid flowableFluid = (FlowableFluid)var6;
        BlockState blockState = world.getBlockState(pos);
        Block block = blockState.getBlock();
        boolean bl = blockState.canBucketPlace(this.fluid);
        boolean var10000 = blockState.isAir() || bl || block instanceof FluidFillable && (fluidFillable = (FluidFillable)block).canFillWithFluid(player, (BlockView)world, pos, blockState, this.fluid);
        boolean bl2 = var10000;
        if (!bl2) {
            return hitResult != null && this.placeFluid(player, world, hitResult.getBlockPos().offset(hitResult.getSide()), null);
        }
        if (world.getDimension().ultrawarm() && this.fluid.isIn(FluidTags.WATER)) {
            int i = pos.getX();
            int j = pos.getY();
            int k = pos.getZ();
            world.playSound(player, pos, SoundEvents.BLOCK_FIRE_EXTINGUISH, SoundCategory.BLOCKS, 0.5f, 2.6f + (world.random.nextFloat() - world.random.nextFloat()) * 0.8f);
            for (int l = 0; l < 8; ++l) {
                world.addParticle((ParticleEffect)ParticleTypes.LARGE_SMOKE, (double)i + Math.random(), (double)j + Math.random(), (double)k + Math.random(), 0.0, 0.0, 0.0);
            }
            return true;
        }
        if (block instanceof FluidFillable) {
            fluidFillable = (FluidFillable)block;
            if (this.fluid == Fluids.WATER) {
                fluidFillable.tryFillWithFluid((WorldAccess)world, pos, blockState, flowableFluid.getStill(false));
                this.playEmptyingSound(player, (WorldAccess)world, pos);
                return true;
            }
        }
        if (!world.isClient && bl && !blockState.isLiquid()) {
            world.breakBlock(pos, true);
        }
        if (!world.setBlockState(pos, this.fluid.getDefaultState().getBlockState(), 11) && !blockState.getFluidState().isStill()) {
            return false;
        }
        this.playEmptyingSound(player, (WorldAccess)world, pos);
        return true;
    }

    protected void playEmptyingSound(@Nullable PlayerEntity player, WorldAccess world, BlockPos pos) {
        SoundEvent soundEvent = SoundEvents.ITEM_BUCKET_EMPTY;
        world.playSound(player, pos, soundEvent, SoundCategory.BLOCKS, 1.0f, 1.0f);
        world.emitGameEvent((Entity)player, (RegistryEntry)GameEvent.FLUID_PLACE, pos);
    }
}

