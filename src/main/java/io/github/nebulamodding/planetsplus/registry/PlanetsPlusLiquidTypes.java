package io.github.nebulamodding.planetsplus.registry;


import io.github.nebulamodding.planetsplus.PlanetsPlus;
import jdk.jfr.FlightRecorder;
import io.github.nebulamodding.planetsplus.foundation.liquids.BasicLiquidType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.FastColor;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.phys.Vec3;
import net.neoforged.neoforge.fluids.FluidType;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;
import org.jetbrains.annotations.NotNull;
import org.joml.Vector3f;

    public final class PlanetsPlusLiquidTypes {
        private PlanetsPlusLiquidTypes() {
        }

        DeferredRegister<FluidType> R = DeferredRegister.create(NeoForgeRegistries.FLUID_TYPES, PlanetsPlus.MOD_ID);

        static ResourceLocation
                WATER_STILL_TEXTURE = ResourceLocation.withDefaultNamespace("block/water_still");
        static ResourceLocation WATER_FLOWING = ResourceLocation.withDefaultNamespace("block/water_flow");
        static ResourceLocation WATER_OVERLAY = ResourceLocation.withDefaultNamespace("block/water_overlay");

        static <T extends FluidType> DeferredHolder<FluidType, T> reg(String id, T liquidType)
        {
            return R.register(id, () -> liquidType);
        }
        static DeferredHolder<FluidType, BasicLiquidType> reg(String id, int colour, FluidType.Properties properties)
        {
            return reg(id, new BasicLiquidType(
                    WATER_STILL_TEXTURE,
                    WATER_FLOWING,
                    WATER_OVERLAY,
                    colour,
                    new Vector3f(
                            FastColor.ARGB32.red(colour),
                            FastColor.ARGB32.green(colour),
                            FastColor.ARGB32.blue(colour)
                    ),
                    properties
            ));
        }

        static DeferredHolder<FluidType, BasicLiquidType> LIQUID_SULFUR = reg("liquid_sulfur", 0xEFEFEFDD, FluidType.Properties.create());
    }

