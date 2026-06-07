package io.github.nebulamodding.planetsplus.datagen.data.tags;

import
io.github.nebulamodding.planetsplus.PlanetsPlus;
import io.github.nebulamodding.planetsplus.registry.PlanetsPlusBlocks;
import io.github.nebulamodding.planetsplus.registry.PlanetsPlusItems;
import io.github.nebulamodding.planetsplus.registry.PlanetsPlusTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;
public class PlanetsPlusItemTagsProvider extends ItemTagsProvider {
    public PlanetsPlusItemTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, BlockTagsProvider provider, ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, provider.contentsGetter(), PlanetsPlus.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider) {

        /*
        Tool Tags
         */

        // None applied yet :^

        /*
        Block Variant Tags
         */

        copy(BlockTags.STAIRS, ItemTags.STAIRS);
        copy(BlockTags.WOODEN_STAIRS, ItemTags.WOODEN_STAIRS);
        copy(BlockTags.SLABS, ItemTags.SLABS);
        copy(BlockTags.WOODEN_SLABS, ItemTags.WOODEN_SLABS);
        copy(BlockTags.WALLS, ItemTags.WALLS);
        copy(BlockTags.WOODEN_PRESSURE_PLATES, ItemTags.WOODEN_PRESSURE_PLATES);
        copy(BlockTags.BUTTONS, ItemTags.BUTTONS);
        copy(BlockTags.STONE_BUTTONS, ItemTags.STONE_BUTTONS);
        copy(BlockTags.WOODEN_BUTTONS, ItemTags.WOODEN_BUTTONS);

        /*
        Ore Tags
         */

        copy(BlockTags.COAL_ORES, ItemTags.COAL_ORES);
        copy(BlockTags.IRON_ORES, ItemTags.IRON_ORES);
        copy(BlockTags.COPPER_ORES, ItemTags.COPPER_ORES);
        copy(BlockTags.GOLD_ORES, ItemTags.GOLD_ORES);
        copy(BlockTags.REDSTONE_ORES, ItemTags.REDSTONE_ORES);
        copy(BlockTags.EMERALD_ORES, ItemTags.EMERALD_ORES);
        copy(BlockTags.LAPIS_ORES, ItemTags.LAPIS_ORES);
        copy(BlockTags.DIAMOND_ORES, ItemTags.DIAMOND_ORES);
        copy(Tags.Blocks.ORE_RATES_DENSE, Tags.Items.ORE_RATES_SINGULAR);
        copy(Tags.Blocks.ORE_RATES_SINGULAR, Tags.Items.ORE_RATES_SINGULAR);
        copy(Tags.Blocks.ORE_RATES_SPARSE, Tags.Items.ORE_RATES_SPARSE);
        ;
        tag(ItemTags.TRIM_MATERIALS)
                .addTag(PlanetsPlusTags.PlanetsPlusItemTags.INGOTS_ROSINRITE)
        ;
        tag(Tags.Items.RAW_MATERIALS)
                .addTag(PlanetsPlusTags.PlanetsPlusItemTags.RAW_MATERIALS_ROSINRITE)
        ;
        tag(Tags.Items.NUGGETS)
                .addTag(PlanetsPlusTags.PlanetsPlusItemTags.NUGGETS_ROSINRITE)
        ;
        tag(Tags.Items.INGOTS)
                .addTag(PlanetsPlusTags.PlanetsPlusItemTags.INGOTS_ROSINRITE)
        ;
        tag(PlanetsPlusTags.PlanetsPlusItemTags.PLATES)
                .addTag(PlanetsPlusTags.PlanetsPlusItemTags.PLATES_ROSINRITE)
        ;
        tag(Tags.Items.RODS)
                .addTag(PlanetsPlusTags.PlanetsPlusItemTags.RODS_ROSINRITE)
        ;
        tag(PlanetsPlusTags.PlanetsPlusItemTags.RAW_MATERIALS_ROSINRITE)
        ;
        tag(PlanetsPlusTags.PlanetsPlusItemTags.NUGGETS_ROSINRITE)
        ;
        tag(PlanetsPlusTags.PlanetsPlusItemTags.INGOTS_ROSINRITE)
        ;
        tag(PlanetsPlusTags.PlanetsPlusItemTags.PLATES_ROSINRITE)
        ;
        tag(PlanetsPlusTags.PlanetsPlusItemTags.RODS_ROSINRITE)
        ;

        /*
        Stone Tags
         */

        copy(Tags.Blocks.STONES, Tags.Items.STONES);
        copy(Tags.Blocks.COBBLESTONES, Tags.Items.COBBLESTONES);

        copy(PlanetsPlusTags.PlanetsPlusBlockTags.COBBLESTONES_VULCAN_STONE, PlanetsPlusTags.PlanetsPlusItemTags.COBBLESTONES_VULCAN_STONE);
        tag(ItemTags.STONE_CRAFTING_MATERIALS);

                // Add cobblestones here
        tag(ItemTags.STONE_TOOL_MATERIALS);

        /*
        Storage Block Tags
         */

        copy(Tags.Blocks.STORAGE_BLOCKS, Tags.Items.STORAGE_BLOCKS);
        copy(PlanetsPlusTags.PlanetsPlusBlockTags.STORAGE_BLOCKS_ROSINRITE, PlanetsPlusTags.PlanetsPlusItemTags.STORAGE_BLOCKS_ROSINRITE);
        copy(PlanetsPlusTags.PlanetsPlusBlockTags.STORAGE_BLOCKS_RAW_ROSINRITE, PlanetsPlusTags.PlanetsPlusItemTags.STORAGE_BLOCKS_RAW_ROSINRITE);

        /*
        Soil Tags
         */

        copy(BlockTags.DIRT, ItemTags.DIRT);

        /*
        Plant Tags
         */

        copy(BlockTags.SAPLINGS, ItemTags.SAPLINGS);
        copy(BlockTags.SMALL_FLOWERS, ItemTags.SMALL_FLOWERS);
        copy(BlockTags.TALL_FLOWERS, ItemTags.TALL_FLOWERS);

        /*
        Miscellaneous Tags
         */

        // Miscellaneous tags go here
    }
}