package net.eqgy.freenights.item;

import net.eqgy.freenights.FreeNights;
import net.eqgy.freenights.entity.ModEntities;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, FreeNights.MODID);

    public static final RegistryObject<Item> RACKET = ITEMS.register("racket", () -> new Racket(new Item.Properties()));

    public static final RegistryObject<Item> FARDIE_MONSTER_SPAWN_EGG = ITEMS.register("fardie_monster_spawn_egg",
    () -> new ForgeSpawnEggItem(ModEntities.FARDIEMONSTER,0x88001b,0x070505,
            new Item.Properties()));


    public static void register(IEventBus bus) {
        ITEMS.register(bus);
    }
}
