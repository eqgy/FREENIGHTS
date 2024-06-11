package net.eqgy.freenights.entity.events;

import net.eqgy.freenights.FreeNights;
import net.eqgy.freenights.entity.client.FardieMonsterModel;
import net.eqgy.freenights.entity.client.ModModelLayers;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
@Mod.EventBusSubscriber(modid = FreeNights.MODID,bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventBusClientEvents {
    @SubscribeEvent
    public static void registerLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(ModModelLayers.FARDIEMONSTER_LAYER, FardieMonsterModel::createBodyLayer);
    }
}
