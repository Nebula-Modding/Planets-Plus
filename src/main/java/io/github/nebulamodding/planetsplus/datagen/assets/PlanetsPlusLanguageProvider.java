package io.github.nebulamodding.planetsplus.datagen.assets;

import io.github.nebulamodding.planetsplus.PlanetsPlus;
import io.github.nebulamodding.planetsplus.registry.PlanetsPlusBlocks;
import io.github.nebulamodding.planetsplus.registry.PlanetsPlusCreativeTab;
import io.github.nebulamodding.planetsplus.registry.PlanetsPlusItems;
import io.github.nebulamodding.planetsplus.registry.PlanetsPlusTags;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.LanguageProvider;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import org.codehaus.plexus.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class PlanetsPlusLanguageProvider extends LanguageProvider {
    public PlanetsPlusLanguageProvider(PackOutput output) {
        super(output, PlanetsPlus.MOD_ID, "en_us");
    }
    @Override
    protected void addTranslations() {
        final List<DeferredBlock<? extends Block>> excludedBlocks = new ArrayList<>();
        // Blocks excluded from having a translation automatically provided
        //excludedBlocks.add(PlanetsPlusBlocks.ExampleBlock);

        final List<DeferredItem<? extends Item>> excludedItems = new ArrayList<>();
        // Items excluded from having a translation automatically provided
        //excludedBlocks.add(PlanetsPlusItems.ExampleItem);

        /*
        Manual Translations
         */

        // Blocks
        //addBlock(PlanetsPlusBlocks.ExampleBlock, "Example Block");

        // Items
        //addItem(PlanetsPlusItems.ExampleItem, "Example Item");

        /*
        Tag Translations
         */

        // Block Tags
        add(PlanetsPlusTags.PlanetsPlusBlockTags.COBBLESTONES_VULCAN_STONE, "Vulcan Stone Cobblestones");
        add(PlanetsPlusTags.PlanetsPlusBlockTags.ORE_BEARING_GROUND_VULCAN_STONE, "Vulcan Stone Ore Bearing Ground");
        add(PlanetsPlusTags.PlanetsPlusBlockTags.ORES_IN_GROUND_VULCAN_STONE, "Vulcan Stone Ores In Ground");
        add(PlanetsPlusTags.PlanetsPlusBlockTags.ORES_ROSINRITE, "Rosinrite Ores");
        add(PlanetsPlusTags.PlanetsPlusBlockTags.STORAGE_BLOCKS_ROSINRITE, "Rosinrite Storage Blocks");
        add(PlanetsPlusTags.PlanetsPlusBlockTags.STORAGE_BLOCKS_RAW_ROSINRITE, "Raw Rosinrite Storage Blocks");

        // Block Item Tags
        add(PlanetsPlusTags.PlanetsPlusItemTags.COBBLESTONES_VULCAN_STONE, "Vulcan Stone Cobblestones");
        add(PlanetsPlusTags.PlanetsPlusItemTags.ORE_BEARING_GROUND_VULCAN_STONE, "Vulcan Stone Ore Bearing Ground");
        add(PlanetsPlusTags.PlanetsPlusItemTags.ORES_IN_GROUND_VULCAN_STONE, "Vulcan Stone Ores In Ground");
        add(PlanetsPlusTags.PlanetsPlusItemTags.ORES_ROSINRITE, "Rosinrite Ores");
        add(PlanetsPlusTags.PlanetsPlusItemTags.STORAGE_BLOCKS_ROSINRITE, "Rosinrite Storage Blocks");
        add(PlanetsPlusTags.PlanetsPlusItemTags.STORAGE_BLOCKS_RAW_ROSINRITE, "Raw Rosinrite Storage Blocks");

        // Item Tags
        add(PlanetsPlusTags.PlanetsPlusItemTags.RAW_MATERIALS_ROSINRITE, "Rosinrite Raw Materials");
        add(PlanetsPlusTags.PlanetsPlusItemTags.NUGGETS_ROSINRITE, "Rosinrite Nuggets");
        add(PlanetsPlusTags.PlanetsPlusItemTags.INGOTS_ROSINRITE, "Rosinrite Ingots");

        /*
        Miscellaneous Translations
         */

        add(PlanetsPlusCreativeTab.CREATIVE_TAB_TITLE, "Planets+");

        /*
        Automated Translations
         */

        // Blocks
        PlanetsPlusBlocks.BLOCKS.getEntries()
                .stream()
                .filter(b -> !excludedBlocks.contains(b))
                .forEach(entry -> addBlock(entry,
                        StringUtils.capitaliseAllWords(entry
                                .getId()
                                .getPath()
                                .replace("_", " "))));
        // Items
        PlanetsPlusItems.ITEMS.getEntries()
                .stream()
                .filter(i -> !(i.get() instanceof BlockItem) && !excludedItems.contains(i))
                .forEach(entry -> addItem(entry,
                        StringUtils.capitaliseAllWords(entry
                                .getId()
                                .getPath()
                                .replace("_", " "))));
    }
}
