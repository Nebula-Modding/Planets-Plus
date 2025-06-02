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
import org.jetbrains.annotations.ApiStatus;

import java.util.function.Supplier;
@SuppressWarnings("unused")
@ApiStatus.NonExtendable

// im not going your going insane im not going your going insane im not going your going insane im not going your going insane im not going your going insane im not going your going insane im not going your going insane  - carrot
        public interface PlanetsPlusLiquids
        {
            DeferredRegister<Fluid> R = DeferredRegister.create(Registries.FLUID, PlanetsPlus.MOD_ID);
            private static DeferredHolder<Fluid, FlowingFluid> regSource(String id, Supplier<BaseFlowingFluid.Properties> properties)
            {
                return R.register(id, () -> new BaseFlowingFluid.Source(properties.get()));
            }

            private static DeferredHolder<Fluid, FlowingFluid> regFlowing(String id, Supplier<BaseFlowingFluid.Properties> properties)
            {
                return R.register(id, () -> new BaseFlowingFluid.Flowing(properties.get()));
            }

            private static DeferredBlock<LiquidBlock> regBlock(String id, Supplier<FlowingFluid> sourceSupplier)
            {
                return PlanetsPlusBlocks.R.register(id, () -> new LiquidBlock(sourceSupplier.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER).noLootTable()));
            }

            private static DeferredItem<BucketItem> regBucket(String id, Supplier<FlowingFluid> sourceSupplier) {
                return PlanetsPlusItems.R.register(id, () -> new BucketItem(sourceSupplier.get(), new Item.Properties().stacksTo(1).craftRemainder(Items.BUCKET)));
            }

            // Liquid Sulfur
            DeferredHolder<Fluid, FlowingFluid> LIQUID_SULFUR = regSource("liquid_sulfur", () -> PlanetsPlusLiquids.LIQUID_SULFUR_PROPERTIES);
            DeferredHolder<Fluid, FlowingFluid> LIQUID_SULFUR_FLOWING = regFlowing("liquid_sulfur_flowing", () -> PlanetsPlusLiquids.LIQUID_SULFUR_PROPERTIES);
            DeferredBlock<LiquidBlock> LIQUID_SULFUR_BLOCK = regBlock("liquid_sulfur", PlanetsPlusLiquids.LIQUID_SULFUR);
            DeferredItem<BucketItem> LIQUID_SULFUR_BUCKET = regBucket("liquid_sulfur_bucket", PlanetsPlusLiquids.LIQUID_SULFUR);

            BaseFlowingFluid.Properties LIQUID_SULFUR_PROPERTIES = new BaseFlowingFluid.Properties(
                    PlanetsPlusLiquidTypes.LIQUID_SULFUR,
                    PlanetsPlusLiquids.LIQUID_SULFUR,
                    PlanetsPlusLiquids.LIQUID_SULFUR_FLOWING
            )
                    .slopeFindDistance(2)
                    .levelDecreasePerBlock(1)
                    .block(PlanetsPlusLiquids.LIQUID_SULFUR_BLOCK)
                    .bucket(PlanetsPlusLiquids.LIQUID_SULFUR_BUCKET);

        }
