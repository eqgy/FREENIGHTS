package net.eqgy.freenights.entity.events;

import net.eqgy.freenights.FreeNights;
import net.eqgy.freenights.entity.ModEntities;
import net.eqgy.freenights.entity.custom.FardieMonsterEntity;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = FreeNights.MODID,bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.FARDIEMONSTER.get(), FardieMonsterEntity.createAttributes().build());
    }
}
