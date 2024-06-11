package net.eqgy.freenights.entity;

import net.eqgy.freenights.FreeNights;
import net.eqgy.freenights.entity.custom.FardieMonsterEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.phys.AABB;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static net.minecraftforge.registries.ForgeRegistries.ENTITY_TYPES;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, FreeNights.MODID);

    public static final RegistryObject<EntityType<FardieMonsterEntity>> FARDIEMONSTER =
            ENTITY_TYPES.register("fardiemonster", () -> EntityType.Builder.of(FardieMonsterEntity::new, MobCategory.MONSTER)
                    .sized(2.5f,6f)
                    .build("fardiemonster"));


    public static void register(IEventBus bus) {
        ENTITY_TYPES.register(bus);
    }


            
}
