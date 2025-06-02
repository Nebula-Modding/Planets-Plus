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
// im not going your going insane im not going your going insane im not going your going insane - carrot
        public interface PlanetsPlusLiquids
        {
            DeferredRegister<Fluid> REGISTER = DeferredRegister.create(Registries.FLUID, PlanetsPlus.MOD_ID);
            private static DeferredHolder<Fluid, FlowingFluid> regSource(Supplier<BaseFlowingFluid.Properties> properties)
            {
                return REGISTER.register("liquid_sulfur", () -> new BaseFlowingFluid.Source(properties.get()));
            }

            private static DeferredHolder<Fluid, FlowingFluid> regFlowing(Supplier<BaseFlowingFluid.Properties> properties)
            {
                return REGISTER.register("liquid_sulfur_flowing", () -> new BaseFlowingFluid.Flowing(properties.get()));
            }

            private static DeferredBlock<LiquidBlock> regBlock()
            {
                return PlanetsPlusBlocks.BLOCKS.register("liquid_sulfur", () -> new LiquidBlock(((Supplier<FlowingFluid>) PlanetsPlusLiquids.LIQUID_SULFUR).get(), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER).noLootTable()));
            }

            private static DeferredItem<BucketItem> regBucket() {
                return PlanetsPlusItems.ITEMS.register("liquid_sulfur_bucket", () -> new BucketItem(((Supplier<FlowingFluid>) PlanetsPlusLiquids.LIQUID_SULFUR).get(), new Item.Properties().stacksTo(1).craftRemainder(Items.BUCKET)));
            }

            // Liquid Sulfur
            DeferredHolder<Fluid, FlowingFluid> LIQUID_SULFUR = regSource(() -> PlanetsPlusLiquids.LIQUID_SULFUR_PROPERTIES);
            DeferredHolder<Fluid, FlowingFluid> LIQUID_SULFUR_FLOWING = regFlowing(() -> PlanetsPlusLiquids.LIQUID_SULFUR_PROPERTIES);
            DeferredBlock<LiquidBlock> LIQUID_SULFUR_BLOCK = regBlock();
            DeferredItem<BucketItem> LIQUID_SULFUR_BUCKET = regBucket();

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
