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
        private PlanetsPlusLiquidTypes() { }

        public static final ResourceLocation
                WATER_STILL_TEXTURE = ResourceLocation.withDefaultNamespace("block/water_still"),
                WATER_FLOWING = ResourceLocation.withDefaultNamespace("block/water_flow"),
                WATER_OVERLAY = ResourceLocation.withDefaultNamespace("block/water_overlay");

        public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(NeoForgeRegistries.Keys.FLUID_TYPES, PlanetsPlus.MOD_ID);

        private static <T extends FluidType> DeferredHolder<FluidType, T> register(String id, T fluidType) {
            return REGISTRY.register(id, () -> fluidType);
        }

        private static DeferredHolder<FluidType, BasicLiquidType> registerSimple(String id, int color, FluidType.Properties props) {
            return REGISTRY.register(id, () -> new BasicLiquidType(
                    WATER_STILL_TEXTURE,
                    WATER_FLOWING,
                    WATER_OVERLAY,
                    color,
                    colourFromHex(color),
                    props
            ));
        }

        private static DeferredHolder<FluidType, BasicLiquidType> registerSimple(String id, int color) {
            return registerSimple(id, color, FluidType.Properties.create());
        }

        private static Vector3f colourFromHex(int color) {
            return new Vector3f(
                    FastColor.ARGB32.red(color),
                    FastColor.ARGB32.green(color),
                    FastColor.ARGB32.blue(color)
            );
        }

        public static final DeferredHolder<FluidType, BasicLiquidType> LIQUID_SULFUR = register("liquid_sulfur", new BasicLiquidType(
                WATER_STILL_TEXTURE,
                WATER_FLOWING,
                WATER_OVERLAY,
                0xFF555555,
                colourFromHex(0xFF555555),
                FluidType.Properties.create()
                        .density(3000)
                        .viscosity(6000)
                        .canSwim(false)
        ) {
            @Override
            public void setItemMovement(@NotNull ItemEntity entity) {
                Vec3 vec3 = entity.getDeltaMovement();
                entity.setDeltaMovement(vec3.x * (double) 0.95F, vec3.y + (double) (vec3.y < (double) 0.06F ? 5.0E-4F : 0.0F), vec3.z * (double) 0.95F);
            }
        });
    }