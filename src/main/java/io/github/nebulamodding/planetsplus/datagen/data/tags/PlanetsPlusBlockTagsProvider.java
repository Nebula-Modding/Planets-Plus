package io.github.nebulamodding.planetsplus.datagen.data.tags;

import io.github.nebulamodding.planetsplus.PlanetsPlus;
import io.github.nebulamodding.planetsplus.registry.PlanetsPlusBlocks;
import io.github.nebulamodding.planetsplus.registry.PlanetsPlusTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.TagsProvider;
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

import static java.awt.AWTEventMulticaster.add;

public class PlanetsPlusBlockTagsProvider extends BlockTagsProvider {
    public PlanetsPlusBlockTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, PlanetsPlus.MOD_ID, existingFileHelper);
    }
    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider) {
        // Lists with collections of blocks with multiple of the same tag to save on lines of code and make this file more readable

        final List<DeferredBlock<? extends Block>> stones = new ArrayList<>();

        // Planet ores
        final List<DeferredBlock<? extends Block>> jadaStoneOres = new ArrayList<>();
        final List<DeferredBlock<? extends Block>> diaterStoneOres = new ArrayList<>();
        final List<DeferredBlock<? extends Block>> ioStoneOres = new ArrayList<>();
        final List<DeferredBlock<? extends Block>> europaStoneOres = new ArrayList<>();
        final List<DeferredBlock<? extends Block>> ganymedeStoneOres = new ArrayList<>();
        final List<DeferredBlock<? extends Block>> callistoStoneOres = new ArrayList<>();
        final List<DeferredBlock<? extends Block>> enceladusStoneOres = new ArrayList<>();
        final List<DeferredBlock<? extends Block>> titanStoneOres = new ArrayList<>();
        final List<DeferredBlock<? extends Block>> iapetusStoneOres = new ArrayList<>();
        final List<DeferredBlock<? extends Block>> plutoStoneOres = new ArrayList<>();
        final List<DeferredBlock<? extends Block>> charonStoneOres = new ArrayList<>();

        // Kelper Centauri
        final List<DeferredBlock<? extends Block>> vulcanStoneOres = new ArrayList<>();
        final List<DeferredBlock<? extends Block>> fiererStoneOres = new ArrayList<>();
        //final List<DeferredBlock<? extends Block>> ronxymoon1StoneOres = new ArrayList<>();
        //final List<DeferredBlock<? extends Block>> ronxymoon2StoneOres = new ArrayList<>();
        final List<DeferredBlock<? extends Block>> galiaStoneOres = new ArrayList<>();
        final List<DeferredBlock<? extends Block>> dytionaStoneOres = new ArrayList<>();

        // Flarics
        //final List<DeferredBlock<? extends Block>> flacericsplanet1StoneOres = new ArrayList<>();
        final List<DeferredBlock<? extends Block>> vervuStoneOres = new ArrayList<>();
        //final List<DeferredBlock<? extends Block>> flacericsdwarfplanet1StoneOres = new ArrayList<>();
        final List<DeferredBlock<? extends Block>> clixicStoneOres = new ArrayList<>();
        //final List<DeferredBlock<? extends Block>> flacericsplanet1StoneOres = new ArrayList<>();

        //Kelper 10345 PLS RENAME THE DAMN SYSTEMMKASDJNL:HDILHTPA
        final List<DeferredBlock<? extends Block>> soulferStoneOres = new ArrayList<>();
        final List<DeferredBlock<? extends Block>> fladeStoneOres = new ArrayList<>();
        final List<DeferredBlock<? extends Block>> mixeusStoneOres = new ArrayList<>();
        final List<DeferredBlock<? extends Block>> duneStoneOres = new ArrayList<>();
        final List<DeferredBlock<? extends Block>> unityStoneOres = new ArrayList<>();
        final List<DeferredBlock<? extends Block>> dreadStoneOres = new ArrayList<>();
        final List<DeferredBlock<? extends Block>> glaciesStoneOres = new ArrayList<>();
        final List<DeferredBlock<? extends Block>> volticStoneOres = new ArrayList<>();
        final List<DeferredBlock<? extends Block>> vonicStoneOres = new ArrayList<>();
        final List<DeferredBlock<? extends Block>> revedaStoneOres = new ArrayList<>();
        final List<DeferredBlock<? extends Block>> obrinaStoneOres = new ArrayList<>();
        final List<DeferredBlock<? extends Block>> baydinStoneOres = new ArrayList<>();
        final List<DeferredBlock<? extends Block>> evedvaStoneOres = new ArrayList<>();
        final List<DeferredBlock<? extends Block>> eclipsaStoneOres = new ArrayList<>();
        final List<DeferredBlock<? extends Block>> atmasStoneOres = new ArrayList<>();
        final List<DeferredBlock<? extends Block>> ringeticStoneOres = new ArrayList<>();

        //Pydonixs
        final List<DeferredBlock<? extends Block>> soreaStoneOres = new ArrayList<>();
        final List<DeferredBlock<? extends Block>> molvinStoneOres = new ArrayList<>();
        final List<DeferredBlock<? extends Block>> tivicStoneOres = new ArrayList<>();
        final List<DeferredBlock<? extends Block>> quivaStoneOres = new ArrayList<>();
        //final List<DeferredBlock<? extends Block>> quviamoon1StoneOres = new ArrayList<>();
        //final List<DeferredBlock<? extends Block>> planetnamethisplsStoneOres = new ArrayList<>();
        final List<DeferredBlock<? extends Block>> ivoStoneOres = new ArrayList<>();
        //final List<DeferredBlock<? extends Block>> bluvionamoon3StoneOres = new ArrayList<>();
        //final List<DeferredBlock<? extends Block>> hasringsmoon1StoneOres = new ArrayList<>();
        //final List<DeferredBlock<? extends Block>> hasringsmoon2StoneOres = new ArrayList<>();
        //final List<DeferredBlock<? extends Block>> hasringsmoon3StoneOres = new ArrayList<>();
        //final List<DeferredBlock<? extends Block>> hasringsmoon4StoneOres = new ArrayList<>();

        //Syiris
        final List<DeferredBlock<? extends Block>> ryoisStoneOres = new ArrayList<>();
        final List<DeferredBlock<? extends Block>> glyisStoneOres = new ArrayList<>();
        //final List<DeferredBlock<? extends Block>> cryronmoon1StoneOres = new ArrayList<>();
        //final List<DeferredBlock<? extends Block>> cryronmoon2StoneOres = new ArrayList<>();
        final List<DeferredBlock<? extends Block>> viausStoneOres = new ArrayList<>();

        //Exaquad
        final List<DeferredBlock<? extends Block>> blightStoneOres = new ArrayList<>();
        //final List<DeferredBlock<? extends Block>> tiwcoplanetStoneOres = new ArrayList<>();
        //final List<DeferredBlock<? extends Block>> orklomoon1StoneOres = new ArrayList<>();
        final List<DeferredBlock<? extends Block>> miweyeStoneOres = new ArrayList<>();
        final List<DeferredBlock<? extends Block>> berritStoneOres = new ArrayList<>();
        final List<DeferredBlock<? extends Block>> cairritStoneOres = new ArrayList<>();
        final List<DeferredBlock<? extends Block>> kotcloStoneOres = new ArrayList<>();
        //final List<DeferredBlock<? extends Block>> ivoStoneOres = new ArrayList<>();
        //final List<DeferredBlock<? extends Block>> ivoStoneOres = new ArrayList<>();
        //final List<DeferredBlock<? extends Block>> ivoStoneOres = new ArrayList<>();
        //final List<DeferredBlock<? extends Block>> ivoStoneOres = new ArrayList<>();
       // final List<DeferredBlock<? extends Block>> ivoStoneOres = new ArrayList<>();
        //final List<DeferredBlock<? extends Block>> ivoStoneOres = new ArrayList<>();
        //final List<DeferredBlock<? extends Block>> ivoStoneOres = new ArrayList<>();
        //final List<DeferredBlock<? extends Block>> ivoStoneOres = new ArrayList<>();
        //final List<DeferredBlock<? extends Block>> ivoStoneOres = new ArrayList<>();
        //final List<DeferredBlock<? extends Block>> ivoStoneOres = new ArrayList<>();
        //final List<DeferredBlock<? extends Block>> ivoStoneOres = new ArrayList<>();
        //final List<DeferredBlock<? extends Block>> ivoStoneOres = new ArrayList<>();
        //final List<DeferredBlock<? extends Block>> ivoStoneOres = new ArrayList<>();
        //final List<DeferredBlock<? extends Block>> ivoStoneOres = new ArrayList<>();
       // final List<DeferredBlock<? extends Block>> ivoStoneOres = new ArrayList<>();


        //Boks

        //Stonk
        final List<DeferredBlock<? extends Block>> pickaxeStoneStairs = new ArrayList<>();
        final List<DeferredBlock<? extends Block>> pickaxeStoneSlabs = new ArrayList<>();
        final List<DeferredBlock<? extends Block>> pickaxeStoneWalls = new ArrayList<>();
        final List<DeferredBlock<? extends Block>> pickaxeStoneFences = new ArrayList<>();
        final List<DeferredBlock<? extends Block>> stonePressurePlates = new ArrayList<>();
        final List<DeferredBlock<? extends Block>> stoneButtons = new ArrayList<>();

        //wooub
        final List<DeferredBlock<? extends Block>> axeWoodenStairs = new ArrayList<>();
        final List<DeferredBlock<? extends Block>> axeWoodenSlabs = new ArrayList<>();
        final List<DeferredBlock<? extends Block>> axeWoodenWalls = new ArrayList<>();
        final List<DeferredBlock<? extends Block>> axeWoodenFences = new ArrayList<>();
        final List<DeferredBlock<? extends Block>> woodenPressurePlates = new ArrayList<>();
        final List<DeferredBlock<? extends Block>> woodenButtons = new ArrayList<>();


        //exampleList.add(PlanetsPlusBlocks.ExampleBlock);

        /*
        Tool Tags
         */

        tag(BlockTags.MINEABLE_WITH_SHOVEL);
        vulcanStoneOres.forEach(entry -> tag(BlockTags.MINEABLE_WITH_PICKAXE).add(entry.get()));
        pickaxeStoneStairs.forEach(entry -> tag(BlockTags.MINEABLE_WITH_PICKAXE).add(entry.get()));
        pickaxeStoneSlabs.forEach(entry -> tag(BlockTags.MINEABLE_WITH_PICKAXE).add(entry.get()));
        stonePressurePlates.forEach(entry -> tag(BlockTags.MINEABLE_WITH_PICKAXE).add(entry.get()));

        /*
        Tool Tags
         */

        tag(BlockTags.MINEABLE_WITH_PICKAXE)

        //Atmas
                .add(PlanetsPlusBlocks.ATMAS_STONE.get())
                .add(PlanetsPlusBlocks.ATMAS_COBBLESTONE.get())

        //Diater
                .add(PlanetsPlusBlocks.DIATER_STONE.get())
                .add(PlanetsPlusBlocks.DIATER_COBBLESTONE.get())
                .add(PlanetsPlusBlocks.DIATER_IRON_ORE.get())
                .add(PlanetsPlusBlocks.DIATER_DESH_ORE.get())
                .add(PlanetsPlusBlocks.DIATER_LAPIS_ORE.get())
                .add(PlanetsPlusBlocks.DIATER_ICE_SHARD_ORE.get())

        //Dread
                .add(PlanetsPlusBlocks.DREAD_STONE.get())
                .add(PlanetsPlusBlocks.DREAD_COBBLESTONE.get())
                .add(PlanetsPlusBlocks.DREAD_DRIPSTONE.get())
                .add(PlanetsPlusBlocks.POLISHED_DREAD_STONE.get())
                .add(PlanetsPlusBlocks.DREAD_STONE_BRICKS.get())

        //Dytiona
                .add(PlanetsPlusBlocks.DYTIONA_STONE.get())
                .add(PlanetsPlusBlocks.DYTIONA_COBBLESTONE.get())
                .add(PlanetsPlusBlocks.POLISHED_DYTIONA_STONE.get())
                .add(PlanetsPlusBlocks.DYTIONA_STONE_BRICKS.get())

        //Dune
                .add(PlanetsPlusBlocks.DUNE_STONE.get())
                .add(PlanetsPlusBlocks.DUNE_COBBLESTONE.get())
                .add(PlanetsPlusBlocks.POLISHED_DUNE_STONE.get())

        //Eclipsa
                .add(PlanetsPlusBlocks.ECLIPSA_STONE.get())
                .add(PlanetsPlusBlocks.ECLIPSA_COBBLESTONE.get())

        //Fierer
                .add(PlanetsPlusBlocks.FIERER_STONE.get())
                .add(PlanetsPlusBlocks.FIERER_COBBLESTONE.get())
                .add(PlanetsPlusBlocks.POLISHED_FIERER_STONE.get())
                .add(PlanetsPlusBlocks.FIERER_STONE_BRICKS.get())

        //Flade
                .add(PlanetsPlusBlocks.FLADE_STONE.get())
                .add(PlanetsPlusBlocks.FLADE_COBBLESTONE.get())
                .add(PlanetsPlusBlocks.POLISHED_FLADE_STONE.get())
                .add(PlanetsPlusBlocks.FLADE_STONE_BRICKS.get())

        //Galia
                .add(PlanetsPlusBlocks.GALIA_STONE.get())
                .add(PlanetsPlusBlocks.GALIA_COBBLESTONE.get())
                .add(PlanetsPlusBlocks.VOXGLOMERATE.get())
                .add(PlanetsPlusBlocks.GALIA_COAL_ORE.get())
                .add(PlanetsPlusBlocks.GALIA_IRON_ORE.get())
                .add(PlanetsPlusBlocks.GALIA_EMERALD_ORE.get())
                .add(PlanetsPlusBlocks.GALIA_OSTRUM_ORE.get())
                .add(PlanetsPlusBlocks.GALIA_DIAMOND_ORE.get())
                .add(PlanetsPlusBlocks.POLISHED_VOXGLOMERATE.get())
                .add(PlanetsPlusBlocks.POLISHED_GALIA_STONE.get())
                .add(PlanetsPlusBlocks.POLISHED_GALIA_STONE.get())

        //Ganymede
                .add(PlanetsPlusBlocks.GANYMEDE_STONE.get())
                .add(PlanetsPlusBlocks.GANYMEDE_COBBLESTONE.get())
                .add(PlanetsPlusBlocks.GANYMEDE_HIGHLANDS_STONE.get())
                .add(PlanetsPlusBlocks.GANYMEDE_HIGHLANDS_COBBLESTONE.get())
                .add(PlanetsPlusBlocks.GANYMEDE_COPPER_ORE.get())
                .add(PlanetsPlusBlocks.GANYMEDE_IRON_ORE.get())
                .add(PlanetsPlusBlocks.GANYMEDE_ICE_SHARD_ORE.get())
                .add(PlanetsPlusBlocks.GANYMEDE_DESH_ORE.get())
                .add(PlanetsPlusBlocks.GANYMEDE_OSTRUM_ORE.get())
                .add(PlanetsPlusBlocks.POLISHED_GANYMEDE_STONE.get())
                .add(PlanetsPlusBlocks.POLISHED_GANYMEDE_HIGHLANDS_STONE.get())
                .add(PlanetsPlusBlocks.GANYMEDE_STONE_BRICKS.get())
                .add(PlanetsPlusBlocks.GANYMEDE_HIGHLANDS_STONE_BRICKS.get())

        //Io
                .add(PlanetsPlusBlocks.IO_STONE.get())
                .add(PlanetsPlusBlocks.IO_COBBLESTONE.get())
                .add(PlanetsPlusBlocks.POLISHED_IO_STONE.get())
                .add(PlanetsPlusBlocks.IO_STONE_BRICKS.get())

        //Jada
                .add(PlanetsPlusBlocks.JADA_STONE.get())
                .add(PlanetsPlusBlocks.JADA_COBBLESTONE.get())
                .add(PlanetsPlusBlocks.JADA_COPPER_ORE.get())
                .add(PlanetsPlusBlocks.JADA_IRON_ORE.get())
                .add(PlanetsPlusBlocks.JADA_GOLD_ORE.get())
                .add(PlanetsPlusBlocks.JADA_EMERALD_ORE.get())
                .add(PlanetsPlusBlocks.JADA_ICE_SHARD_ORE.get())
                .add(PlanetsPlusBlocks.JADA_OSTRUM_ORE.get())
                .add(PlanetsPlusBlocks.JADA_DIAMOND_ORE.get())

        //Mixeus
                .add(PlanetsPlusBlocks.MIXEUS_STONE.get())
                .add(PlanetsPlusBlocks.MIXEUS_COBBLESTONE.get())
                .add(PlanetsPlusBlocks.POLISHED_MIXEUS_STONE.get())
                .add(PlanetsPlusBlocks.MIXEUS_STONE_BRICKS.get())

        //Ringetic
                .add(PlanetsPlusBlocks.RINGETIC_COBBLESTONE.get())
                .add(PlanetsPlusBlocks.RINGETIC_STONE.get())

        //Soulfer
                .add(PlanetsPlusBlocks.SOULFER_STONE.get())
                .add(PlanetsPlusBlocks.SOULFER_COBBLESTONE.get())
                .add(PlanetsPlusBlocks.SOULFER_COPPER_ORE.get())
                .add(PlanetsPlusBlocks.SOULFER_IRON_ORE.get())
                .add(PlanetsPlusBlocks.SOULFER_OSTRUM_ORE.get())
                .add(PlanetsPlusBlocks.SOULFER_DIAMOND_ORE.get())
                .add(PlanetsPlusBlocks.POLISHED_SOULFER_STONE.get())
                .add(PlanetsPlusBlocks.SOULFER_STONE_BRICKS.get())

        //Vulcan
                .add(PlanetsPlusBlocks.VULCAN_STONE.get())
                .add(PlanetsPlusBlocks.VULCAN_COBBLESTONE.get())
                .add(PlanetsPlusBlocks.VULCAN_INFERNAL_BASALT.get())
                .add(PlanetsPlusBlocks.POLISHED_VULCAN_STONE.get())
                .add(PlanetsPlusBlocks.VULCAN_STONE_BRICKS.get());

        tag(BlockTags.MINEABLE_WITH_AXE);

        tag(BlockTags.MINEABLE_WITH_HOE);

        tag(BlockTags.SWORD_EFFICIENT);

        tag(BlockTags.NEEDS_STONE_TOOL);

        tag(BlockTags.NEEDS_IRON_TOOL);

        tag(BlockTags.NEEDS_DIAMOND_TOOL);

        tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL);

        tag(BlockTags.INCORRECT_FOR_STONE_TOOL);

        tag(BlockTags.INCORRECT_FOR_IRON_TOOL);

        tag(BlockTags.INCORRECT_FOR_GOLD_TOOL);

        tag(BlockTags.INCORRECT_FOR_NETHERITE_TOOL);

        /*
        Block Variant Tags
         */

        pickaxeStoneStairs.forEach(entry -> tag(BlockTags.STAIRS).add(entry.get()));
        tag(BlockTags.STAIRS);
        tag(BlockTags.WOODEN_STAIRS);

        pickaxeStoneSlabs.forEach(entry -> tag(BlockTags.SLABS).add(entry.get()));
        tag(BlockTags.SLABS);
        tag(BlockTags.WOODEN_SLABS);

        pickaxeStoneWalls.forEach(entry -> tag(BlockTags.WALLS).add(entry.get()));
        tag(BlockTags.WALLS);
        tag(BlockTags.PRESSURE_PLATES);

        stonePressurePlates.forEach(entry -> tag(BlockTags.STONE_PRESSURE_PLATES).add(entry.get()));
        tag(BlockTags.STONE_PRESSURE_PLATES);
        tag(BlockTags.WOODEN_PRESSURE_PLATES);
        tag(BlockTags.BUTTONS);

        stoneButtons.forEach(entry -> tag(BlockTags.STONE_BUTTONS).add(entry.get()));
        tag(BlockTags.STONE_BUTTONS);
        tag(BlockTags.WOODEN_BUTTONS);

        /*
        Ore Tags
         */

        tag(BlockTags.COAL_ORES)
        .add(PlanetsPlusBlocks.GALIA_COAL_ORE.get());

        tag(BlockTags.IRON_ORES)
        .add(PlanetsPlusBlocks.DIATER_IRON_ORE.get())
        .add(PlanetsPlusBlocks.GALIA_IRON_ORE.get())
        .add(PlanetsPlusBlocks.GANYMEDE_IRON_ORE.get())
        .add(PlanetsPlusBlocks.JADA_IRON_ORE.get())
        .add(PlanetsPlusBlocks.SOULFER_IRON_ORE.get());

        tag(BlockTags.COPPER_ORES)
        .add(PlanetsPlusBlocks.GANYMEDE_COPPER_ORE.get())
        .add(PlanetsPlusBlocks.JADA_COPPER_ORE.get())
        .add(PlanetsPlusBlocks.SOULFER_COPPER_ORE.get());

        tag(BlockTags.GOLD_ORES)
        .add(PlanetsPlusBlocks.JADA_GOLD_ORE.get());

        tag(BlockTags.REDSTONE_ORES);

        tag(BlockTags.EMERALD_ORES)
        .add(PlanetsPlusBlocks.GALIA_EMERALD_ORE.get())
        .add(PlanetsPlusBlocks.JADA_EMERALD_ORE.get());

        tag(BlockTags.LAPIS_ORES)
        .add(PlanetsPlusBlocks.DIATER_LAPIS_ORE.get());

        tag(BlockTags.DIAMOND_ORES)
        .add(PlanetsPlusBlocks.DIATER_DIAMOND_ORE.get())
        .add(PlanetsPlusBlocks.GALIA_DIAMOND_ORE.get())
        .add(PlanetsPlusBlocks.JADA_DIAMOND_ORE.get())
        .add(PlanetsPlusBlocks.SOULFER_DIAMOND_ORE.get());

        tag(PlanetsPlusTags.PlanetsPlusBlockTags.ORES_ROSINRITE);

        tag(Tags.Blocks.ORE_RATES_DENSE);

        tag(Tags.Blocks.ORE_RATES_SINGULAR);

        tag(Tags.Blocks.ORE_RATES_SPARSE);


        /*
        Stone Tags
         */

        tag(Tags.Blocks.STONES);

        tag(Tags.Blocks.COBBLESTONES)
                .addTag(PlanetsPlusTags.PlanetsPlusBlockTags.COBBLESTONES_VULCAN_STONE);

        tag(PlanetsPlusTags.PlanetsPlusBlockTags.COBBLESTONES_VULCAN_STONE);


        // Base Stone Tags




        /*
        Storage Block Tags
         */

        tag(Tags.Blocks.STORAGE_BLOCKS)
                .addTag(PlanetsPlusTags.PlanetsPlusBlockTags.STORAGE_BLOCKS_ROSINRITE)
                .addTag(PlanetsPlusTags.PlanetsPlusBlockTags.STORAGE_BLOCKS_RAW_ROSINRITE);

        tag(PlanetsPlusTags.PlanetsPlusBlockTags.STORAGE_BLOCKS_ROSINRITE);

        tag(PlanetsPlusTags.PlanetsPlusBlockTags.STORAGE_BLOCKS_RAW_ROSINRITE);


        /*
        Soil Tags
         */

        tag(BlockTags.DIRT);

        tag(BlockTags.CONVERTABLE_TO_MUD);

        tag(BlockTags.ANIMALS_SPAWNABLE_ON);

        tag(BlockTags.SNIFFER_DIGGABLE_BLOCK);

        tag(BlockTags.VALID_SPAWN);

        tag(Tags.Blocks.VILLAGER_FARMLANDS);

        /*
        Tree Tags
         */

        tag(BlockTags.LEAVES);

        tag(BlockTags.LOGS);

        /*
        Plant Tags
         */

        tag(BlockTags.SAPLINGS);

        tag(BlockTags.SMALL_FLOWERS);

        tag(BlockTags.TALL_FLOWERS);

        tag(BlockTags.FLOWER_POTS);

        /*
        Carver Replaceable Tags
         */

        /*
        Worldgen Tags
         */

        //Ores replaceables tags
        //Worldgen btw
        //Solar system
        tag(PlanetsPlusTags.PlanetsPlusBlockTags.JADA_ORE_REPLACEABLES)
                .add(PlanetsPlusBlocks.JADA_STONE.get())
                .add(Blocks.ANDESITE)
                .add(Blocks.TUFF)
                .add(Blocks.SMOOTH_BASALT);

        tag(PlanetsPlusTags.PlanetsPlusBlockTags.DIATER_ORE_REPLACEABLES)
                .add(PlanetsPlusBlocks.DIATER_STONE.get());

        tag(PlanetsPlusTags.PlanetsPlusBlockTags.IO_ORE_REPLACEABLES)
                .add(PlanetsPlusBlocks.IO_STONE.get());

        tag(PlanetsPlusTags.PlanetsPlusBlockTags.EUROPA_ORE_REPLACEABLES);

        tag(PlanetsPlusTags.PlanetsPlusBlockTags.GANYMEDE_ORE_REPLACEABLES)
                .add(PlanetsPlusBlocks.GANYMEDE_STONE.get());

        tag(PlanetsPlusTags.PlanetsPlusBlockTags.CALLISTO_ORE_REPLACEABLES);
        tag(PlanetsPlusTags.PlanetsPlusBlockTags.ENCELEDUS_ORE_REPLACEABLES);
        tag(PlanetsPlusTags.PlanetsPlusBlockTags.TITAN_ORE_REPLACEABLES);
        tag(PlanetsPlusTags.PlanetsPlusBlockTags.IAPETUS_ORE_REPLACEABLES);
        tag(PlanetsPlusTags.PlanetsPlusBlockTags.PLUTO_ORE_REPLACEABLES);
        tag(PlanetsPlusTags.PlanetsPlusBlockTags.CHARON_ORE_REPLACEABLES);

        //Kelper Centauri
        tag(PlanetsPlusTags.PlanetsPlusBlockTags.VULCAN_ORE_REPLACEABLES)
                .add(PlanetsPlusBlocks.VULCAN_STONE.get());

        tag(PlanetsPlusTags.PlanetsPlusBlockTags.FIERER_ORE_REPLACEABLES)
                .add(PlanetsPlusBlocks.FIERER_STONE.get())
                .add(Blocks.YELLOW_WOOL)
                .add(Blocks.COBBLED_DEEPSLATE);

        tag(PlanetsPlusTags.PlanetsPlusBlockTags.GALIA_ORE_REPLACEABLES)
                .add(PlanetsPlusBlocks.GALIA_STONE.get())
                .add(PlanetsPlusBlocks.GALIA_COBBLESTONE.get())
                .add(Blocks.BASALT)
                .add(Blocks.SMOOTH_BASALT)
                .add(Blocks.COBBLESTONE)
                .add(Blocks.TUFF);

        tag(PlanetsPlusTags.PlanetsPlusBlockTags.DYTIONA_ORE_REPLACEABLES)
                .add(PlanetsPlusBlocks.DYTIONA_STONE.get());

        //Syris
        tag(PlanetsPlusTags.PlanetsPlusBlockTags.SOULFER_ORE_REPLACEABLES)
                .add(PlanetsPlusBlocks.SOULFER_STONE.get())
                .add(PlanetsPlusBlocks.SOUL_STONE.get())
                .add(Blocks.SOUL_SAND)
                .add(Blocks.SOUL_SOIL);

        tag(PlanetsPlusTags.PlanetsPlusBlockTags.FLADE_ORE_REPLACEABLES)
                .add(PlanetsPlusBlocks.FLADE_STONE.get())
                .add(Blocks.MAGMA_BLOCK)
                .add(Blocks.SMOOTH_BASALT)
                .add(Blocks.BLACKSTONE);

        tag(PlanetsPlusTags.PlanetsPlusBlockTags.MIXEUS_ORE_REPLACEABLES)
                .add(PlanetsPlusBlocks.MIXEUS_STONE.get())
                .add(Blocks.DIORITE);

        tag(PlanetsPlusTags.PlanetsPlusBlockTags.DUNE_ORE_REPLACEABLES)
                .add(PlanetsPlusBlocks.DUNE_SAND.get())
                .add(PlanetsPlusBlocks.DUNE_STONE.get())
                .add(PlanetsPlusBlocks.DUNE_COBBLESTONE.get());

        tag(PlanetsPlusTags.PlanetsPlusBlockTags.DREAD_ORE_REPLACEABLES)
                .add(PlanetsPlusBlocks.DREAD_STONE.get());

        tag(PlanetsPlusTags.PlanetsPlusBlockTags.GLACIES_ORE_REPLACEABLES)
                .add(PlanetsPlusBlocks.GLACIES_STONE.get())
                .add(Blocks.SNOW_BLOCK)
                .add(Blocks.PACKED_ICE)
                .add(Blocks.BLUE_ICE);

        tag(PlanetsPlusTags.PlanetsPlusBlockTags.VOLTIC_ORE_REPLACEABLES);
        tag(PlanetsPlusTags.PlanetsPlusBlockTags.VONIC_ORE_REPLACEABLES);
        tag(PlanetsPlusTags.PlanetsPlusBlockTags.REVEDA_ORE_REPLACEABLES);
        tag(PlanetsPlusTags.PlanetsPlusBlockTags.OBRINA_ORE_REPLACEABLES);
        tag(PlanetsPlusTags.PlanetsPlusBlockTags.BAYDIN_ORE_REPLACEABLES);
        tag(PlanetsPlusTags.PlanetsPlusBlockTags.EVEDVA_ORE_REPLACEABLES);

        tag(PlanetsPlusTags.PlanetsPlusBlockTags.ECLIPSA_ORE_REPLACEABLES)
                .add(PlanetsPlusBlocks.ECLIPSA_STONE.get())
                .add(Blocks.SMOOTH_BASALT)
                .add(Blocks.PACKED_ICE)
                .add(Blocks.BLACKSTONE)
                .add(Blocks.MAGMA_BLOCK)
                .add(Blocks.COBBLED_DEEPSLATE);

        tag(PlanetsPlusTags.PlanetsPlusBlockTags.ATMAS_ORE_REPLACEABLES)
                .add(PlanetsPlusBlocks.ATMAS_STONE.get())
                .add(PlanetsPlusBlocks.ATMAS_COBBLESTONE.get())
                .add(Blocks.AMETHYST_BLOCK)
                .add(Blocks.SMOOTH_BASALT)
                .add(Blocks.COBBLESTONE)
                .add(Blocks.CALCITE);

        tag(PlanetsPlusTags.PlanetsPlusBlockTags.RINGETIC_ORE_REPLACEABLES)
                .add(PlanetsPlusBlocks.RINGETIC_STONE.get())
                .add(PlanetsPlusBlocks.RINGETIC_COBBLESTONE.get())
                .add(PlanetsPlusBlocks.RINGETIC_FROSTSTONE.get())
                .add(PlanetsPlusBlocks.VOXGLOMERATE.get())
                .add(Blocks.AMETHYST_BLOCK)
                .add(Blocks.COBBLESTONE)
                .add(Blocks.GRANITE);

        //Worldgen spike replaceable (Do them here instead of the datapack)
        tag(PlanetsPlusTags.PlanetsPlusBlockTags.SPIKE_REPLACEABLES)
                //Jada
                .add(PlanetsPlusBlocks.JADA_STONE.get())
                .add(PlanetsPlusBlocks.JADA_COBBLESTONE.get())
                .add(PlanetsPlusBlocks.JADA_COPPER_ORE.get())
                .add(PlanetsPlusBlocks.JADA_IRON_ORE.get())
                .add(PlanetsPlusBlocks.JADA_GOLD_ORE.get())
                .add(PlanetsPlusBlocks.JADA_EMERALD_ORE.get())
                .add(PlanetsPlusBlocks.JADA_ICE_SHARD_ORE.get())
                .add(PlanetsPlusBlocks.JADA_OSTRUM_ORE.get())
                .add(PlanetsPlusBlocks.JADA_DIAMOND_ORE.get())

                //Diater
                .add(PlanetsPlusBlocks.DIATER_STONE.get())
                .add(PlanetsPlusBlocks.DIATER_COBBLESTONE.get())
                .add(PlanetsPlusBlocks.DIATER_IRON_ORE.get())
                .add(PlanetsPlusBlocks.DIATER_DESH_ORE.get())
                .add(PlanetsPlusBlocks.DIATER_LAPIS_ORE.get())
                .add(PlanetsPlusBlocks.DIATER_ICE_SHARD_ORE.get())

                //Io
                .add(PlanetsPlusBlocks.IO_STONE.get())
                .add(PlanetsPlusBlocks.IO_COBBLESTONE.get())
                .add(PlanetsPlusBlocks.POLISHED_IO_STONE.get())
                .add(PlanetsPlusBlocks.IO_STONE_BRICKS.get())

                //Europa

                //Ganymede
                .add(PlanetsPlusBlocks.GANYMEDE_STONE.get())
                .add(PlanetsPlusBlocks.GANYMEDE_COBBLESTONE.get())
                .add(PlanetsPlusBlocks.GANYMEDE_HIGHLANDS_STONE.get())
                .add(PlanetsPlusBlocks.GANYMEDE_HIGHLANDS_COBBLESTONE.get())
                .add(PlanetsPlusBlocks.GANYMEDE_COPPER_ORE.get())
                .add(PlanetsPlusBlocks.GANYMEDE_IRON_ORE.get())
                .add(PlanetsPlusBlocks.GANYMEDE_ICE_SHARD_ORE.get())
                .add(PlanetsPlusBlocks.GANYMEDE_DESH_ORE.get())
                .add(PlanetsPlusBlocks.GANYMEDE_OSTRUM_ORE.get())
                .add(PlanetsPlusBlocks.POLISHED_GANYMEDE_STONE.get())
                .add(PlanetsPlusBlocks.POLISHED_GANYMEDE_HIGHLANDS_STONE.get())
                .add(PlanetsPlusBlocks.GANYMEDE_STONE_BRICKS.get())
                .add(PlanetsPlusBlocks.GANYMEDE_HIGHLANDS_STONE_BRICKS.get())

                //Callisto

                //Enceledus

                //Titan

                //Iapetus

                //Pluto

                //Charon

                //Vulcan
                .add(PlanetsPlusBlocks.VULCAN_STONE.get())
                .add(PlanetsPlusBlocks.VULCAN_COBBLESTONE.get())
                .add(PlanetsPlusBlocks.VULCAN_INFERNAL_BASALT.get())
                .add(PlanetsPlusBlocks.POLISHED_VULCAN_STONE.get())
                .add(PlanetsPlusBlocks.VULCAN_STONE_BRICKS.get())

                //Fierer
                .add(PlanetsPlusBlocks.FIERER_STONE.get())
                .add(PlanetsPlusBlocks.FIERER_COBBLESTONE.get())
                .add(PlanetsPlusBlocks.POLISHED_FIERER_STONE.get())
                .add(PlanetsPlusBlocks.FIERER_STONE_BRICKS.get())

                //Galia
                .add(PlanetsPlusBlocks.GALIA_STONE.get())
                .add(PlanetsPlusBlocks.GALIA_COBBLESTONE.get())
                .add(PlanetsPlusBlocks.VOXGLOMERATE.get())
                .add(PlanetsPlusBlocks.GALIA_COAL_ORE.get())
                .add(PlanetsPlusBlocks.GALIA_IRON_ORE.get())
                .add(PlanetsPlusBlocks.GALIA_EMERALD_ORE.get())
                .add(PlanetsPlusBlocks.GALIA_OSTRUM_ORE.get())
                .add(PlanetsPlusBlocks.GALIA_DIAMOND_ORE.get())
                .add(PlanetsPlusBlocks.POLISHED_VOXGLOMERATE.get())
                .add(PlanetsPlusBlocks.POLISHED_GALIA_STONE.get())
                .add(PlanetsPlusBlocks.POLISHED_GALIA_STONE.get())

                //Dytiona
                .add(PlanetsPlusBlocks.DYTIONA_STONE.get())
                .add(PlanetsPlusBlocks.DYTIONA_COBBLESTONE.get())
                .add(PlanetsPlusBlocks.POLISHED_DYTIONA_STONE.get())
                .add(PlanetsPlusBlocks.DYTIONA_STONE_BRICKS.get())


                //Soulfer
                .add(PlanetsPlusBlocks.SOULFER_STONE.get())
                .add(PlanetsPlusBlocks.SOULFER_COBBLESTONE.get())
                .add(PlanetsPlusBlocks.SOULFER_COPPER_ORE.get())
                .add(PlanetsPlusBlocks.SOULFER_IRON_ORE.get())
                .add(PlanetsPlusBlocks.SOULFER_OSTRUM_ORE.get())
                .add(PlanetsPlusBlocks.SOULFER_DIAMOND_ORE.get())
                .add(PlanetsPlusBlocks.POLISHED_SOULFER_STONE.get())
                .add(PlanetsPlusBlocks.SOULFER_STONE_BRICKS.get())

                //Flade
                .add(PlanetsPlusBlocks.FLADE_STONE.get())
                .add(PlanetsPlusBlocks.FLADE_COBBLESTONE.get())
                .add(PlanetsPlusBlocks.POLISHED_FLADE_STONE.get())
                .add(PlanetsPlusBlocks.FLADE_STONE_BRICKS.get())

                //Mixeus
                .add(PlanetsPlusBlocks.MIXEUS_STONE.get())
                .add(PlanetsPlusBlocks.MIXEUS_COBBLESTONE.get())
                .add(PlanetsPlusBlocks.POLISHED_MIXEUS_STONE.get())
                .add(PlanetsPlusBlocks.MIXEUS_STONE_BRICKS.get())

                //Dune
                .add(PlanetsPlusBlocks.DUNE_STONE.get())
                .add(PlanetsPlusBlocks.DUNE_COBBLESTONE.get())
                .add(PlanetsPlusBlocks.POLISHED_DUNE_STONE.get())

                //Dread
                .add(PlanetsPlusBlocks.DREAD_STONE.get())
                .add(PlanetsPlusBlocks.DREAD_COBBLESTONE.get())
                .add(PlanetsPlusBlocks.DREAD_DRIPSTONE.get())
                .add(PlanetsPlusBlocks.POLISHED_DREAD_STONE.get())
                .add(PlanetsPlusBlocks.DREAD_STONE_BRICKS.get())

                //Eclipsa
                .add(PlanetsPlusBlocks.ECLIPSA_STONE.get())
                .add(PlanetsPlusBlocks.ECLIPSA_COBBLESTONE.get())

                //Atmas
                .add(PlanetsPlusBlocks.ATMAS_STONE.get())
                .add(PlanetsPlusBlocks.ATMAS_COBBLESTONE.get())

                //Ringetic

                .add(PlanetsPlusBlocks.RINGETIC_COBBLESTONE.get())
                .add(PlanetsPlusBlocks.RINGETIC_STONE.get());
        /*
        Miscellaneous Tags
         */

        tag(BlockTags.ENCHANTMENT_POWER_TRANSMITTER);
                // Prevents blocks from interfering with enchanting;

        tag(BlockTags.REPLACEABLE);

        tag(BlockTags.REPLACEABLE_BY_TREES);
    }
}