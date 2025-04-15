package io.github.nebulamodding.planetsplus.datagen.assets;

import io.github.nebulamodding.planetsplus.PlanetsPlus;
import io.github.nebulamodding.planetsplus.registry.PlanetsPlusBlocks;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PlanetsPlusBlockStateProvider extends BlockStateProvider {
    public PlanetsPlusBlockStateProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, PlanetsPlus.MOD_ID, existingFileHelper);
    }
    @Override
    protected void registerStatesAndModels() {
        final List<DeferredBlock<? extends Block>> excludedBlocks = new ArrayList<>();
        // Blocks excluded from having blockstates and models provided
        //excludedBlocks.add(PlanetsPlusBlocks.ExampleBlock);

        /*
        Automated Block Models
         */

        for (var entry : PlanetsPlusBlocks.BLOCKS.getEntries()
                .stream()
                .filter(b -> !excludedBlocks.contains(b))
                .collect(Collectors.toSet())
        ) {
            var model = new ModelFile.UncheckedModelFile(entry.getId().withPrefix("block/"));
            if (entry.get() instanceof RotatedPillarBlock pillarBlock) {
                logBlock(pillarBlock);
                simpleBlockItem(entry.get(), model);
            } else if (entry.get() instanceof StairBlock stairBlock) {
                ResourceLocation texture = entry.getId().withPath(entry.getId().withPrefix("block/").getPath().replace("_stairs", ""));
                stairsBlock(stairBlock, texture);
                simpleBlockItem(stairBlock, model);
            } else if (entry.get() instanceof SlabBlock slabBlock) {
                ResourceLocation textureId = entry.getId().withPath(entry.getId().withPrefix("block/").getPath().replace("_slab", ""));
                slabBlock(
                        slabBlock,
                        models().slab(name(slabBlock), textureId, textureId, textureId),
                        models().slabTop(name(slabBlock) + "_top", textureId, textureId, textureId),
                        new ModelFile.UncheckedModelFile(textureId)
                );
                simpleBlockItem(slabBlock, model);
            } else if (entry.get() instanceof WallBlock wallBlock) {
                ResourceLocation texture = entry.getId().withPath(entry.getId().withPrefix("block/").getPath().replace("_wall", ""));
                wallBlock(wallBlock, texture);
                models().wallInventory(entry.getId().getPath() + "_inventory", texture);
                simpleBlockItem(wallBlock, new ModelFile.UncheckedModelFile(entry.getId().withPrefix("block/").withSuffix("_inventory")));
            } else if (entry.get() instanceof ButtonBlock buttonBlock) {
                ResourceLocation texture = entry.getId().withPath(entry.getId().withPrefix("block/").getPath().replace("_button", ""));
                buttonBlock(buttonBlock, texture);
                models().buttonInventory(entry.getId().getPath() + "_inventory", texture);
                simpleBlockItem(buttonBlock, new ModelFile.UncheckedModelFile(entry.getId().withPrefix("block/").withSuffix("_inventory")));
            } else if (entry.get() instanceof PressurePlateBlock pressurePlateBlock) {
                ResourceLocation texture = entry.getId().withPath(entry.getId().withPrefix("block/").getPath().replace("_pressure_plate", ""));
                pressurePlateBlock(pressurePlateBlock, texture);
                simpleBlockItem(pressurePlateBlock, model);
            } else {
                cubeAll(entry.get());
                simpleBlock(entry.get());
                simpleBlockItem(entry.get(), model);
            }
        }

        /*
        Manual Block Models
         */

        // Manual models go here
    }
    // Helpers
    private void simpleBlock(DeferredBlock<? extends Block> block) {
        super.simpleBlock(block.get());
        simpleBlockItem(block.get(), new ModelFile.UncheckedModelFile(block.getId().withPrefix("block/")));
    }
    public void simpleBlockWithoutItem(DeferredBlock<? extends Block> block, ModelFile model) {
        super.simpleBlock(block.get(), model);
    }
    public void axisBlock(DeferredBlock<Block> block, ResourceLocation texture, ResourceLocation texture2) {
        super.axisBlock((RotatedPillarBlock) block.get(), texture, texture2);
        simpleBlockItem(block.get(), new ModelFile.UncheckedModelFile(block.getId().withPrefix("block/")));
    }
    private void stairsBlock(DeferredBlock<Block> block, ResourceLocation texture) {
        super.stairsBlock((StairBlock) block.get(), texture);
        simpleBlockItem(block.get(), new ModelFile.UncheckedModelFile(block.getId().withPrefix("block/")));
    }
    private void slabBlock(DeferredBlock<? extends Block> block, ResourceLocation doubleslab, ResourceLocation texture) {
        super.slabBlock((SlabBlock) block.get(), doubleslab, texture);
        simpleBlockItem(block.get(), new ModelFile.UncheckedModelFile(block.getId().withPrefix("block/")));
    }
    private void fenceBlock(DeferredBlock<? extends Block> block, ResourceLocation texture) {
        super.fenceBlock((FenceBlock) block.get(), texture);
        models().fenceInventory(block.getId().getPath() + "_inventory", texture);
        simpleBlockItem(block.get(), new ModelFile.UncheckedModelFile(block.getId().withPrefix("block/").withSuffix("_inventory")));
    }
    private void fenceGateBlock(DeferredBlock<? extends Block> block, ResourceLocation texture) {
        super.fenceGateBlock((FenceGateBlock) block.get(), texture);
        models().fenceInventory(block.getId().getPath() + "_inventory", texture);
        simpleBlockItem(block.get(), new ModelFile.UncheckedModelFile(block.getId().withPrefix("block/").withSuffix("_inventory")));
    }
    private void pressurePlateBlock(DeferredBlock<? extends Block> block, ResourceLocation texture) {
        super.pressurePlateBlock((PressurePlateBlock) block.get(), texture);
        simpleBlockItem(block.get(), new ModelFile.UncheckedModelFile(block.getId().withPrefix("block/")));
    }
    public void buttonBlock(DeferredBlock<? extends Block> block, ResourceLocation texture) {
        super.buttonBlock((ButtonBlock) block.get(), texture);
        models().buttonInventory(block.getId().getPath() + "_inventory", texture);
        simpleBlockItem(block.get(), new ModelFile.UncheckedModelFile(block.getId().withPrefix("block/").withSuffix("_inventory")));
    }
    public void wallBlock(DeferredBlock<? extends Block> block, ResourceLocation texture) {
        super.wallBlock((WallBlock) block.get(), texture);
        models().wallInventory(block.getId().getPath() + "_inventory", texture);
        simpleBlockItem(block.get(), new ModelFile.UncheckedModelFile(block.getId().withPrefix("block/").withSuffix("_inventory")));
    }
    public void doorBlockWithRenderType(DeferredBlock<? extends Block> block, ResourceLocation bottom, ResourceLocation top, String renderType) {
        super.doorBlockWithRenderType((DoorBlock) block.get(), bottom, top, renderType);
    }
    public void trapDoorBlockWithRenderType(DeferredBlock<? extends Block> block, ResourceLocation texture, boolean orientable, String renderType) {
        super.trapdoorBlockWithRenderType((TrapDoorBlock) block.get(), texture, orientable, renderType);
    }
    private ResourceLocation blockLoc(DeferredBlock<? extends Block> block) {
        return modLoc("block/" + block.getId().getPath());
    }
    public ResourceLocation blockLoc(DeferredBlock<? extends Block> block, String suffix) {
        return modLoc("block/" + block.getId().getPath() + "_" + suffix);
    }
    private ResourceLocation key(Block block) {
        return BuiltInRegistries.BLOCK.getKey(block);
    }
    private String name(Block block) {
        return key(block).getPath();
    }
}