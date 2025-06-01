package io.github.nebulamodding.planetsplus.registry;

import io.github.nebulamodding.planetsplus.PlanetsPlus;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.neoforged.neoforge.fluids.BaseFlowingFluid;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

        public final class PlanetsPlusLiquids {
            private PlanetsPlusLiquids() { }

            public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(Registries.FLUID, PlanetsPlus.MOD_ID);

            private static DeferredHolder<Fluid, FlowingFluid> registerSource(String id, Supplier<BaseFlowingFluid.Properties> properties) {
                return REGISTRY.register(id, () -> new BaseFlowingFluid.Source(properties.get()));
            }

            private static DeferredHolder<Fluid, FlowingFluid> registerFlowing(String id, Supplier<BaseFlowingFluid.Properties> properties) {
                return REGISTRY.register(id, () -> new BaseFlowingFluid.Flowing(properties.get()));
            }

            private static DeferredBlock<LiquidBlock> registerBlock(String id, Supplier<FlowingFluid> sourceSupplier) {
                return PlanetsPlusBlocks.register(id, () -> new LiquidBlock(sourceSupplier.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER).noLootTable()));
            }

            private static DeferredItem<BucketItem> registerBucket(String id, Supplier<FlowingFluid> sourceSupplier) {
                return PlanetsPlusItems.register(id, () -> new BucketItem(sourceSupplier.get(), new Item.Properties().stacksTo(1).craftRemainder(Items.BUCKET)));
            }

            // Steam
            public static final DeferredHolder<Fluid, FlowingFluid> LIQUID_SULFUR = registerSource("liquid_sulfur", () -> PlanetsPlusLiquids.LIQUID_SULFUR_PROPERTIES);
            public static final DeferredHolder<Fluid, FlowingFluid> LIQUID_SULFUR_FLOWING = registerFlowing("liquid_sulfur_flowing", () -> PlanetsPlusLiquids.LIQUID_SULFUR_PROPERTIES);
            public static final DeferredBlock<LiquidBlock> LIQUID_SULFUR_BLOCK = registerBlock("liquid_sulfur", PlanetsPlusLiquids.LIQUID_SULFUR);
            public static final DeferredItem<BucketItem> LIQUID_SULFUR_BUCKET = registerBucket("liquid_sulfur_bucket", PlanetsPlusLiquids.LIQUID_SULFUR);

            public static final BaseFlowingFluid.Properties LIQUID_SULFUR_PROPERTIES = new BaseFlowingFluid.Properties(
                    PlanetsPlusLiquids.LIQUID_SULFUR,
                    PlanetsPlusLiquids.LIQUID_SULFUR_FLOWING
            )
                    .slopeFindDistance(2)
                    .levelDecreasePerBlock(1)
                    .block(PlanetsPlusLiquids.LIQUID_SULFUR_BLOCK)
                    .bucket(PlanetsPlusLiquids.LIQUID_SULFUR_BUCKET);

        }
