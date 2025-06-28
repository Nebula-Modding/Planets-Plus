package io.github.nebulamodding.planetsplus.datagen;

import io.github.nebulamodding.planetsplus.PlanetsPlus;
import io.github.nebulamodding.planetsplus.datagen.assets.PlanetsPlusBlockStateProvider;
import io.github.nebulamodding.planetsplus.datagen.assets.PlanetsPlusItemModelProvider;
import io.github.nebulamodding.planetsplus.datagen.assets.PlanetsPlusLanguageProvider;
import io.github.nebulamodding.planetsplus.datagen.assets.PlanetsPlusSoundDefinitionsProvider;
import io.github.nebulamodding.planetsplus.datagen.data.PlanetsPlusBuiltinEntriesProvider;
import io.github.nebulamodding.planetsplus.datagen.data.loot.PlanetsPlusLootTableProvider;
import io.github.nebulamodding.planetsplus.datagen.data.tags.PlanetsPlusBlockTagsProvider;
import io.github.nebulamodding.planetsplus.datagen.data.tags.PlanetsPlusItemTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.concurrent.CompletableFuture;

public class PlanetsPlusDataGeneration {
    public static void gatherData(GatherDataEvent event) {
        try {
            DataGenerator generator = event.getGenerator();
            PackOutput output = generator.getPackOutput();
            ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

            if (event.includeClient()) {
                // Generates the client-sided assets
                generator.addProvider(true, new PlanetsPlusLanguageProvider(output));
                generator.addProvider(true, new PlanetsPlusBlockStateProvider(output, existingFileHelper));
                generator.addProvider(true, new PlanetsPlusItemModelProvider(output, existingFileHelper));
                generator.addProvider(true, new PlanetsPlusSoundDefinitionsProvider(output, existingFileHelper));
            }
            if (event.includeServer()) {
                // Generates the server-sided data
                PlanetsPlusBlockTagsProvider blockTagsProvider = new PlanetsPlusBlockTagsProvider(output, event.getLookupProvider(), existingFileHelper);
                generator.addProvider(true, blockTagsProvider);
                generator.addProvider(true, new PlanetsPlusItemTagsProvider(output, event.getLookupProvider(), blockTagsProvider, existingFileHelper));

                CompletableFuture<HolderLookup.Provider> newLookup = generator.addProvider(event.includeServer(), new PlanetsPlusBuiltinEntriesProvider(output, event.getLookupProvider())).getRegistryProvider();
                generator.addProvider(true, new PlanetsPlusLootTableProvider(output, newLookup));
            }
        } catch (RuntimeException e) {
            PlanetsPlus.LOGGER.error("Failed to gather Planets+'s data (only found Moons- data :/)", e);
        }
    }
}