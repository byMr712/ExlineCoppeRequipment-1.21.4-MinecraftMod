/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.registry.Registries
 *  net.minecraft.registry.Registry
 *  net.minecraft.sound.SoundEvent
 *  net.minecraft.util.Identifier
 */
package com.exline.exlinecopperequipment.sounds;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {
    public static final SoundEvent STATIC_SOUND = ModSounds.registerSoundEvent("electric_crackle");

    public static SoundEvent registerSoundEvent(String name) {
        Identifier id = Identifier.of((String)"exlinecopperequipment", (String)name);
        return (SoundEvent)Registry.register((Registry)Registries.SOUND_EVENT, (Identifier)id, (Object)SoundEvent.of((Identifier)id));
    }

    public static void registerSounds() {
    }
}

