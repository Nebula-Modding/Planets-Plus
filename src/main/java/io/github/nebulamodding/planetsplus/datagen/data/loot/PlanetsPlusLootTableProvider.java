package io.github.nebulamodding.planetsplus.datagen.data.loot;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;

import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class PlanetsPlusLootTableProvider extends LootTableProvider {
    public PlanetsPlusLootTableProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, Set.of(), List.of(new SubProviderEntry(PlanetsPlusBlockLootProvider::new, LootContextParamSets.BLOCK), new SubProviderEntry(PlanetsPlusEntityLootProvider::new, LootContextParamSets.ENTITY)), registries);
    }
}
