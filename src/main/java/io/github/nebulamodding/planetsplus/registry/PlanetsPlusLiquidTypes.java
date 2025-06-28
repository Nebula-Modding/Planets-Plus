package io.github.nebulamodding.planetsplus.registry;

import io.github.nebulamodding.planetsplus.PlanetsPlus;
import io.github.nebulamodding.planetsplus.foundation.liquids.BasicLiquidType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.FastColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.fluids.FluidType;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;
import org.joml.Vector3f;

public interface PlanetsPlusLiquidTypes
{
    DeferredRegister<FluidType> REGISTER = DeferredRegister.create(NeoForgeRegistries.FLUID_TYPES, PlanetsPlus.MOD_ID);

    ResourceLocation
            WATER_STILL_TEXTURE = ResourceLocation.withDefaultNamespace("block/water_still"),
            WATER_FLOWING = ResourceLocation.withDefaultNamespace("block/water_flow"),
            WATER_OVERLAY = ResourceLocation.withDefaultNamespace("block/water_overlay");

    static <T extends FluidType> DeferredHolder<FluidType, T> reg(String id, T FluidType)
    {
        return REGISTER.register(id, () -> FluidType);
    }

    static DeferredHolder<FluidType, BasicLiquidType > reg(String id, int color, FluidType.Properties properties)
    {
        return reg(id, new BasicLiquidType(
                WATER_STILL_TEXTURE,
                WATER_FLOWING,
                WATER_OVERLAY,
                color,
                new Vector3f(
                        FastColor.ARGB32.red(color),
                        FastColor.ARGB32.green(color),
                        FastColor.ARGB32.blue(color)
                ),
                properties
        ));
    }

    DeferredHolder<FluidType, BasicLiquidType> LIQUID_SULFUR = reg("liquid_sulfur", 0xEFEFEFDD,FluidType.Properties.create());

    static void reg(IEventBus ignoredEventBus) {
    }
}