package net.eqgy.freenights;

import com.mojang.logging.LogUtils;
import net.eqgy.freenights.block.ModBlocks;
import net.eqgy.freenights.entity.ModEntities;
import net.eqgy.freenights.entity.client.FardieMonsterRenderer;
import net.eqgy.freenights.item.ModItems;
import net.eqgy.freenights.sound.ModSounds;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(FreeNights.MODID)
public class FreeNights
{
    // Define mod id in a common place for everything to reference
    public static final String MODID = "freenights";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();



    public FreeNights()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModEntities.register(modEventBus);
        ModSounds.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);

    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event)
    {
        if(event.getTabKey()== CreativeModeTabs.TOOLS_AND_UTILITIES) {
            event.accept(ModItems.RACKET);
            event.accept(ModItems.FARDIE_MONSTER_SPAWN_EGG);
        }
        if(event.getTabKey()== CreativeModeTabs.BUILDING_BLOCKS) {
            event.accept(ModBlocks.FARDIE_WARD);
        }
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            EntityRenderers.register(ModEntities.FARDIEMONSTER.get(), FardieMonsterRenderer::new);
        }
    }
}
