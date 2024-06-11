package net.eqgy.freenights.sound;

import net.eqgy.freenights.FreeNights;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraftforge.common.util.ForgeSoundType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, FreeNights.MODID);

    public static final RegistryObject<SoundEvent> FARDIE_DEATH = registerSoundEvents("fardie_death");
    public static final RegistryObject<SoundEvent> FARDIE_ATTACK = registerSoundEvents("fardie_attack");
    public static final RegistryObject<SoundEvent> FARDIE_AMBIENT = registerSoundEvents("fardie_ambient");
    public static final RegistryObject<SoundEvent> FARDIE_HURT = registerSoundEvents("fardie_hurt");

    //public static final ForgeSoundType FARDIE_SOUNDS = new ForgeSoundType(1f,1f,
    //        ModSounds.FARDIE_DEATH, ModSounds.FARDIE_ATTACK, ModSounds.FARDIE_AMBIENT, ModSounds.FARDIE_HURT
    //)

    private static RegistryObject<SoundEvent> registerSoundEvents(String name) {
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(FreeNights.MODID,name)));
    }

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}
