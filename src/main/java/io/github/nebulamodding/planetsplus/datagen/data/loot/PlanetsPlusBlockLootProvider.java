package io.github.nebulamodding.planetsplus.datagen.data.loot;

import io.github.nebulamodding.planetsplus.registry.PlanetsPlusBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredHolder;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class PlanetsPlusBlockLootProvider extends BlockLootSubProvider {
    public PlanetsPlusBlockLootProvider(HolderLookup.Provider provider) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), provider);
    }
    @Override
    protected void generate() {
        final List<DeferredHolder<Block, ? extends Block>> excludedBlocks = new ArrayList<>();
        // Blocks excluded from having a drop automatically provided

        /*
        Manual Loot Tables
         */

        // Loot tables go here

        /*
        Automated Loot Tables
         */

        PlanetsPlusBlocks.BLOCKS.getEntries()
                .stream()
                .filter(b -> !excludedBlocks.contains(b))
                .forEach(entry -> dropSelf(entry.get()));
    }

    @Override
    protected @NotNull Iterable<Block> getKnownBlocks() {
        return PlanetsPlusBlocks.BLOCKS.getEntries()
                .stream()
                .map(DeferredHolder::get)
                .collect(Collectors.toSet());
    }
}