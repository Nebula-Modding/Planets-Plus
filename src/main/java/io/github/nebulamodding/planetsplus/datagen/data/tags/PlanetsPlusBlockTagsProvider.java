package io.github.nebulamodding.planetsplus.datagen.data.tags;

import io.github.nebulamodding.planetsplus.PlanetsPlus;
import io.github.nebulamodding.planetsplus.registry.PlanetsPlusTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class PlanetsPlusBlockTagsProvider extends BlockTagsProvider {
    public PlanetsPlusBlockTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, PlanetsPlus.MOD_ID, existingFileHelper);
    }
    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider) {
        // Lists with collections of blocks with multiple of the same tag to save on lines of code and make this file more readable
        final List<DeferredBlock<? extends Block>> vulcanStoneOres = new ArrayList<>();
        final List<DeferredBlock<? extends Block>> pickaxeStairs = new ArrayList<>();
        final List<DeferredBlock<? extends Block>> pickaxeSlabs = new ArrayList<>();
        final List<DeferredBlock<? extends Block>> pickaxeWalls = new ArrayList<>();
        final List<DeferredBlock<? extends Block>> stonePressurePlates = new ArrayList<>();
        final List<DeferredBlock<? extends Block>> stoneButtons = new ArrayList<>();
        final List<DeferredBlock<? extends Block>> woodenPressurePlates = new ArrayList<>();
        final List<DeferredBlock<? extends Block>> woodenButtons = new ArrayList<>();
        //exampleList.add(PlanetsPlusBlocks.ExampleBlock);

        /*
        Tool Tags
         */

        tag(BlockTags.MINEABLE_WITH_SHOVEL)
        ;
        vulcanStoneOres.forEach(entry -> tag(BlockTags.MINEABLE_WITH_PICKAXE).add(entry.get()));
        pickaxeStairs.forEach(entry -> tag(BlockTags.MINEABLE_WITH_PICKAXE).add(entry.get()));
        pickaxeSlabs.forEach(entry -> tag(BlockTags.MINEABLE_WITH_PICKAXE).add(entry.get()));
        stonePressurePlates.forEach(entry -> tag(BlockTags.MINEABLE_WITH_PICKAXE).add(entry.get()));
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
        ;
        tag(BlockTags.MINEABLE_WITH_AXE)
        ;
        tag(BlockTags.MINEABLE_WITH_HOE)
        ;
        tag(BlockTags.SWORD_EFFICIENT)
        ;
        tag(BlockTags.NEEDS_STONE_TOOL)
        ;
        tag(BlockTags.NEEDS_IRON_TOOL)
        ;
        tag(BlockTags.NEEDS_DIAMOND_TOOL)
        ;
        tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
        ;
        tag(BlockTags.INCORRECT_FOR_STONE_TOOL)
        ;
        tag(BlockTags.INCORRECT_FOR_IRON_TOOL)
        ;
        tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
        ;
        tag(BlockTags.INCORRECT_FOR_NETHERITE_TOOL)
        ;

        /*
        Block Variant Tags
         */

        pickaxeStairs.forEach(entry -> tag(BlockTags.STAIRS).add(entry.get()));
        tag(BlockTags.STAIRS)
        ;
        tag(BlockTags.WOODEN_STAIRS)
        ;
        pickaxeSlabs.forEach(entry -> tag(BlockTags.SLABS).add(entry.get()));
        tag(BlockTags.SLABS)
        ;
        tag(BlockTags.WOODEN_SLABS)
        ;
        pickaxeWalls.forEach(entry -> tag(BlockTags.WALLS).add(entry.get()));
        tag(BlockTags.WALLS)
        ;
        tag(BlockTags.PRESSURE_PLATES)
        ;
        stonePressurePlates.forEach(entry -> tag(BlockTags.STONE_PRESSURE_PLATES).add(entry.get()));
        tag(BlockTags.STONE_PRESSURE_PLATES)
        ;
        tag(BlockTags.WOODEN_PRESSURE_PLATES)
        ;
        tag(BlockTags.BUTTONS)
        ;
        stoneButtons.forEach(entry -> tag(BlockTags.STONE_BUTTONS).add(entry.get()));
        tag(BlockTags.STONE_BUTTONS)
        ;
        tag(BlockTags.WOODEN_BUTTONS)
        ;

        /*
        Ore Tags
         */

        tag(BlockTags.COAL_ORES)
        ;
        tag(BlockTags.IRON_ORES)
        ;
        tag(BlockTags.COPPER_ORES)
        ;
        tag(BlockTags.GOLD_ORES)
        ;
        tag(BlockTags.REDSTONE_ORES)
        ;
        tag(BlockTags.EMERALD_ORES)
        ;
        tag(BlockTags.LAPIS_ORES)
        ;
        tag(BlockTags.DIAMOND_ORES)
        ;
        tag(PlanetsPlusTags.PlanetsPlusBlockTags.ORES_ROSINRITE)
        ;
        tag(Tags.Blocks.ORE_RATES_DENSE)
        ;
        tag(Tags.Blocks.ORE_RATES_SINGULAR)
        ;
        tag(Tags.Blocks.ORE_RATES_SPARSE)
        ;
        tag(PlanetsPlusTags.PlanetsPlusBlockTags.ORE_BEARING_GROUND_VULCAN_STONE)
        ;
        tag(PlanetsPlusTags.PlanetsPlusBlockTags.ORES_IN_GROUND_VULCAN_STONE)
        ;
        vulcanStoneOres.forEach(entry -> tag(PlanetsPlusTags.PlanetsPlusBlockTags.ORES_IN_GROUND_VULCAN_STONE).add(entry.get()));

        /*
        Stone Tags
         */

        tag(Tags.Blocks.STONES)
        ;
        tag(Tags.Blocks.COBBLESTONES)
                .addTag(PlanetsPlusTags.PlanetsPlusBlockTags.COBBLESTONES_VULCAN_STONE)
        ;
        tag(PlanetsPlusTags.PlanetsPlusBlockTags.COBBLESTONES_VULCAN_STONE)
        ;

        // Base Stone Tags
        tag(PlanetsPlusTags.PlanetsPlusBlockTags.BASE_STONE_VULCAN)
        ;
        tag(PlanetsPlusTags.PlanetsPlusBlockTags.BASE_STONE_UNITY)
        ;

        /*
        Storage Block Tags
         */

        tag(Tags.Blocks.STORAGE_BLOCKS)
                .addTag(PlanetsPlusTags.PlanetsPlusBlockTags.STORAGE_BLOCKS_ROSINRITE)
                .addTag(PlanetsPlusTags.PlanetsPlusBlockTags.STORAGE_BLOCKS_RAW_ROSINRITE)
        ;
        tag(PlanetsPlusTags.PlanetsPlusBlockTags.STORAGE_BLOCKS_ROSINRITE)
        ;
        tag(PlanetsPlusTags.PlanetsPlusBlockTags.STORAGE_BLOCKS_RAW_ROSINRITE)
        ;

        /*
        Soil Tags
         */

        tag(BlockTags.DIRT)
        ;
        tag(BlockTags.CONVERTABLE_TO_MUD)
        ;
        tag(BlockTags.ANIMALS_SPAWNABLE_ON)
        ;
        tag(BlockTags.SNIFFER_DIGGABLE_BLOCK)
        ;
        tag(BlockTags.VALID_SPAWN)
        ;
        tag(Tags.Blocks.VILLAGER_FARMLANDS)
        ;

        /*
        Tree Tags
         */

        tag(BlockTags.LEAVES)
        ;
        tag(BlockTags.LOGS)
        ;

        /*
        Plant Tags
         */

        tag(BlockTags.SAPLINGS)
        ;
        tag(BlockTags.SMALL_FLOWERS)
        ;
        tag(BlockTags.TALL_FLOWERS)
        ;
        tag(BlockTags.FLOWER_POTS)
        ;

        /*
        Carver Replaceable Tags
         */

        tag(PlanetsPlusTags.PlanetsPlusBlockTags.UNITY_CARVER_REPLACEABLES)
                .addTag(PlanetsPlusTags.PlanetsPlusBlockTags.BASE_STONE_UNITY)
                .addTag(BlockTags.DIRT)
                .addTag(BlockTags.SAND)
                .addTag(BlockTags.COPPER_ORES)
                .addTag(BlockTags.IRON_ORES)
                .addTag(BlockTags.SNOW)
                .add(Blocks.PACKED_ICE)
                .add(Blocks.RAW_COPPER_BLOCK)
                .add(Blocks.RAW_IRON_BLOCK)
                .add(Blocks.WATER)
        ;

        /*
        Ore Replaceable Tags
         */

        tag(PlanetsPlusTags.PlanetsPlusBlockTags.VULCAN_STONE_ORE_REPLACEABLES)
        ;

        /*
        Miscellaneous Tags
         */

        tag(BlockTags.ENCHANTMENT_POWER_TRANSMITTER)
                // Prevents blocks from interfering with enchanting
        ;
        tag(BlockTags.REPLACEABLE)
        ;
        tag(BlockTags.REPLACEABLE_BY_TREES)
        ;
    }
}