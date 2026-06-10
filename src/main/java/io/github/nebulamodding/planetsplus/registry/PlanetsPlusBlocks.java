package io.github.nebulamodding.planetsplus.registry;

import io.github.nebulamodding.planetsplus.PlanetsPlus;
import net.minecraft.util.ColorRGBA;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class PlanetsPlusBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(PlanetsPlus.MOD_ID);

    /*
    Sol
     */

    // Common/Earth blocks
    public static final DeferredBlock<Block>
            SILVER_ORE = register("silver_ore", () -> new Block(stoneProperties().mapColor(MapColor.TERRACOTTA_BLUE))),
            LEAD_ORE = register("lead_ore", () -> new Block(stoneProperties().mapColor(MapColor.TERRACOTTA_BLUE))),


    // Jada Blocks
            JADA_SAND = register("jada_sand", () -> new ColoredFallingBlock(new ColorRGBA(0x6b5868), sandProperties().mapColor(MapColor.TERRACOTTA_BLUE))),
            JADA_STONE = register("jada_stone", () -> new Block(stoneProperties().mapColor(MapColor.TERRACOTTA_BLUE))),
            JADA_COBBLESTONE = register("jada_cobblestone", () -> new Block(cobblestoneProperties().mapColor(MapColor.TERRACOTTA_BLUE))),

            //Ores / Why does it keep trying indenting it when I hit space

            JADA_IRON_ORE = register("jada_iron_ore", () -> new Block(stoneProperties().mapColor(MapColor.TERRACOTTA_BLUE))),
            JADA_GOLD_ORE = register("jada_gold_ore", () -> new Block(stoneProperties().mapColor(MapColor.TERRACOTTA_BLUE))),
            JADA_EMERALD_ORE = register("jada_emerald_ore", () -> new Block(stoneProperties().mapColor(MapColor.TERRACOTTA_BLUE))),
            JADA_DIAMOND_ORE = register("jada_diamond_ore", () -> new Block(stoneProperties().mapColor(MapColor.TERRACOTTA_BLUE))),
            JADA_OSTRUM_ORE = register("jada_ostrum_ore", () -> new Block(stoneProperties().mapColor(MapColor.TERRACOTTA_BLUE))),
            JADA_ICE_SHARD_ORE = register("jada_ice_shard_ore", () -> new Block(stoneProperties().mapColor(MapColor.TERRACOTTA_BLUE))),
            JADA_ROSINRITE_ORE = register("jada_rosinrite_ore", () -> new Block(stoneProperties().mapColor(MapColor.TERRACOTTA_BLUE))), JADA_COPPER_ORE = register("jada_copper_ore", () -> new Block(stoneProperties().mapColor(MapColor.TERRACOTTA_BLUE))),

            //Building blocks

            POLISHED_JADA_STONE = register("polished_jada_stone", () -> new Block(stoneProperties().mapColor(MapColor.TERRACOTTA_BLUE))),
            JADA_STONE_BRICKS = register("jada_stone_bricks", () -> new Block(stoneProperties().mapColor(MapColor.TERRACOTTA_BLUE))),
            CHISELED_JADA_STONE_BRICKS = register("chiseled_jada_stone_bricks", () -> new Block(stoneProperties().mapColor(MapColor.TERRACOTTA_BLUE))),

    // Diater Blocks
            DIATER_STONE = register("diater_stone", () -> new Block(stoneProperties().mapColor(MapColor.COLOR_LIGHT_BLUE))),
            DIATER_COBBLESTONE = register("diater_cobblestone", () -> new Block(cobblestoneProperties().mapColor(MapColor.COLOR_LIGHT_BLUE))),

            //Ores

            DIATER_DIAMOND_ORE = register("diater_diamond_ore", () -> new Block(stoneProperties().mapColor(MapColor.COLOR_LIGHT_BLUE))),
            DIATER_LAPIS_ORE = register("diater_lapis_ore", () -> new Block(stoneProperties().mapColor(MapColor.COLOR_LIGHT_BLUE))),
            DIATER_ICE_SHARD_ORE = register("diater_ice_shard_ore", () -> new Block(stoneProperties().mapColor(MapColor.COLOR_LIGHT_BLUE))),
            DIATER_DESH_ORE = register("diater_desh_ore", () -> new Block(stoneProperties().mapColor(MapColor.COLOR_LIGHT_BLUE))),
            DIATER_IRON_ORE = register("diater_iron_ore", () -> new Block(stoneProperties().mapColor(MapColor.COLOR_LIGHT_BLUE))),

    // Io Blocks
            IO_SULFURIC_SAND = register("io_sulfuric_sand", () -> new ColoredFallingBlock(new ColorRGBA(0x6b5868), sandProperties().mapColor(MapColor.TERRACOTTA_YELLOW))),
            IO_STONE = register("io_stone", () -> new Block(stoneProperties().mapColor(MapColor.TERRACOTTA_ORANGE))),
            IO_COBBLESTONE = register("io_cobblestone", () -> new Block(cobblestoneProperties().mapColor(MapColor.TERRACOTTA_ORANGE))),

            // Building blocks

            IO_STONE_BRICKS = register("io_stone_bricks", () -> new Block(stoneProperties().mapColor(MapColor.TERRACOTTA_ORANGE))),
            POLISHED_IO_STONE = register("polished_io_stone", () -> new Block(stoneProperties().mapColor(MapColor.TERRACOTTA_ORANGE))),

    // Europa Blocks

    EUROPA_STONE = register("europa_stone", () -> new Block(stoneProperties().mapColor(MapColor.TERRACOTTA_ORANGE))),
    EUROPA_COBBLESTONE = register("europa_cobblestone", () -> new Block(stoneProperties().mapColor(MapColor.TERRACOTTA_ORANGE))),

    // Ganymede Blocks
            GANYMEDE_SAND = register("ganymede_sand", () -> new ColoredFallingBlock(new ColorRGBA(0xb5a37c), sandProperties().mapColor(MapColor.TERRACOTTA_LIGHT_GRAY))),
            GANYMEDE_STONE = register("ganymede_stone", () -> new Block(stoneProperties().mapColor(MapColor.TERRACOTTA_LIGHT_GRAY))),
            GANYMEDE_COBBLESTONE = register("ganymede_cobblestone", () -> new Block(cobblestoneProperties().mapColor(MapColor.TERRACOTTA_LIGHT_GRAY))),
            GANYMEDE_HIGHLANDS_STONE = register("ganymede_highlands_stone", () -> new Block(stoneProperties().mapColor(MapColor.TERRACOTTA_GRAY))),
            GANYMEDE_HIGHLANDS_COBBLESTONE = register("ganymede_highlands_cobblestone", () -> new Block(cobblestoneProperties().mapColor(MapColor.TERRACOTTA_GRAY))),

            //Ores

            GANYMEDE_DESH_ORE = register("ganymede_desh_ore", () -> new Block(stoneProperties().mapColor(MapColor.TERRACOTTA_LIGHT_GRAY))),
            GANYMEDE_IRON_ORE = register("ganymede_iron_ore", () -> new Block(stoneProperties().mapColor(MapColor.TERRACOTTA_LIGHT_GRAY))),
            GANYMEDE_COPPER_ORE = register("ganymede_copper_ore", () -> new Block(stoneProperties().mapColor(MapColor.TERRACOTTA_LIGHT_GRAY))),
            GANYMEDE_OSTRUM_ORE = register("ganymede_ostrum_ore", () -> new Block(stoneProperties().mapColor(MapColor.TERRACOTTA_LIGHT_GRAY))),
            GANYMEDE_ICE_SHARD_ORE = register("ganymede_ice_shard_ore", () -> new Block(stoneProperties().mapColor(MapColor.TERRACOTTA_LIGHT_GRAY))),

            // Building blocks

            GANYMEDE_STONE_BRICKS = register("ganymede_stone_bricks", () -> new Block(stoneProperties().mapColor(MapColor.TERRACOTTA_LIGHT_GRAY))),
            GANYMEDE_HIGHLANDS_STONE_BRICKS = register("ganymede_highlands_stone_bricks", () -> new Block(stoneProperties().mapColor(MapColor.TERRACOTTA_LIGHT_GRAY))),
            POLISHED_GANYMEDE_STONE = register("polished_ganymede_stone", () -> new Block(stoneProperties().mapColor(MapColor.TERRACOTTA_LIGHT_GRAY))),
            POLISHED_GANYMEDE_HIGHLANDS_STONE = register("polished_ganymede_highlands_stone", () -> new Block(stoneProperties().mapColor(MapColor.TERRACOTTA_GRAY))),

    // Callisto Blocks


    // Enceladus Blocks


    // Titan Blocks (Next block set)

    TITAN_SAND = register("titan_sand", () -> new ColoredFallingBlock(new ColorRGBA(0xb5a37c), sandProperties().mapColor(MapColor.TERRACOTTA_LIGHT_GRAY))),
    TITAN_STONE = register("titan_stone", () -> new Block(stoneProperties().mapColor(MapColor.TERRACOTTA_LIGHT_GRAY))),
    TITAN_COBBLESTONE = register("titan_cobblestone", () -> new Block(cobblestoneProperties().mapColor(MapColor.TERRACOTTA_LIGHT_GRAY))),

    // Iapetus Blocks


    // Pluto Blocks
    PLUTO_HARDENED_ICE = register("pluto_hardened_ice", () -> new Block(stoneProperties().mapColor(MapColor.TERRACOTTA_ORANGE))),
    PLUTO_COBBLED_ICE = register("pluto_cobbled_ice", () -> new Block(stoneProperties().mapColor(MapColor.TERRACOTTA_LIGHT_GRAY))),
    PLUTO_THOLINED_HARDENED_ICE = register("pluto_hardened_tholined_ice", () -> new Block(stoneProperties().mapColor(MapColor.TERRACOTTA_ORANGE))),
    PLUTO_THOLINED_COBBLED_ICE = register("pluto_cobbled_tholined_ice", () -> new Block(stoneProperties().mapColor(MapColor.TERRACOTTA_LIGHT_GRAY))),

    // Charon Blocks
    CHARON_HARDENED_ICE = register("charon_hardened_ice", () -> new Block(stoneProperties().mapColor(MapColor.TERRACOTTA_ORANGE))),
    CHARON_COBBLED_ICE = register("charon_cobbled_ice", () -> new Block(stoneProperties().mapColor(MapColor.TERRACOTTA_LIGHT_GRAY))),

    /*
    Kepler Centauri
     */

    // Vulcan Block
            VULCAN_STONE = register("vulcan_stone", () -> new Block(stoneProperties().mapColor(MapColor.COLOR_RED))),
            VULCAN_COBBLESTONE = register("vulcan_cobblestone", () -> new Block(cobblestoneProperties().mapColor(MapColor.COLOR_RED))),
            VULCAN_INFERNAL_BASALT = register("vulcan_infernal_basalt", () -> new MagmaBlock(stoneProperties().sound(SoundType.BASALT).mapColor(MapColor.COLOR_RED))),
            VULCAN_CHARRED_STONE = register("vulcan_charred_stone", () -> new Block(stoneProperties().mapColor(MapColor.COLOR_RED))),
            VULCAN_CHARRED_COBBLESTONE = register("vulcan_charred_cobblestone", () -> new Block(cobblestoneProperties().mapColor(MapColor.COLOR_RED))),
            VULCAN_BURNT_STONE = register("vulcan_burnt_stone", () -> new Block(stoneProperties().mapColor(MapColor.COLOR_RED))),
            VULCAN_BURNT_COBBLESTONE = register("vulcan_burnt_cobblestone", () -> new Block(cobblestoneProperties().mapColor(MapColor.COLOR_RED))),
            // Building blocks
            VULCAN_STONE_BRICKS = register("vulcan_stone_bricks", () -> new Block(stoneProperties().mapColor(MapColor.COLOR_RED))),
            POLISHED_VULCAN_STONE = register("polished_vulcan_stone", () -> new Block(stoneProperties().mapColor(MapColor.COLOR_RED))),

    // Fierer Blocks
            FIERER_STONE = register("fierer_stone", () -> new Block(stoneProperties().mapColor(MapColor.COLOR_RED))),
            FIERER_COBBLESTONE = register("fierer_cobblestone", () -> new Block(cobblestoneProperties().mapColor(MapColor.COLOR_RED))),

            //Building blocks
            FIERER_STONE_BRICKS = register("fierer_stone_bricks", () -> new Block(stoneProperties().mapColor(MapColor.COLOR_RED))),
            POLISHED_FIERER_STONE = register("polished_fierer_stone", () -> new Block(stoneProperties().mapColor(MapColor.COLOR_RED))),

    // Ronxy system
    // Ronxy Moon1 Blocks


    // Ronxy Moon2 Blocks


    // Galia Blocks
            GALIA_SAND = register("galia_sand", () -> new ColoredFallingBlock(new ColorRGBA(0xcc4380), sandProperties().mapColor(MapColor.COLOR_PINK))),
            GALIA_STONE = register("galia_stone", () -> new Block(stoneProperties().mapColor(MapColor.COLOR_PINK))),
            GALIA_COBBLESTONE = register("galia_cobblestone", () -> new Block(cobblestoneProperties().mapColor(MapColor.COLOR_PINK))),
            VOXGLOMERATE = register("voxglomerate", () -> new Block(stoneProperties().mapColor(MapColor.COLOR_PURPLE))),
            GALIA_IMPACT_MUSHROOM = register("galia_impact_mushroom", () -> new Block(mushroomProperties().mapColor(MapColor.COLOR_PINK))),
            GALIA_IMPACT_MUSHROOM_STEM = register("galia_impact_mushroom_stem", () -> new Block(mushroomProperties().mapColor(MapColor.COLOR_PINK))),

            //Building blocks
            GALIA_STONE_BRICKS = register("galia_stone_bricks", () -> new Block(stoneProperties().mapColor(MapColor.COLOR_PINK))),
            POLISHED_VOXGLOMERATE = register("polished_voxglomerate", () -> new Block(stoneProperties().mapColor(MapColor.COLOR_PURPLE))),
            POLISHED_GALIA_STONE = register("polished_galia_stone", () -> new Block(stoneProperties().mapColor(MapColor.COLOR_PURPLE))),

            //Ores

            GALIA_OSTRUM_ORE = register("galia_ostrum_ore", () -> new Block(stoneProperties().mapColor(MapColor.COLOR_PINK))),
            GALIA_IRON_ORE = register("galia_iron_ore", () -> new Block(stoneProperties().mapColor(MapColor.COLOR_PINK))),
            GALIA_DIAMOND_ORE = register("galia_diamond_ore", () -> new Block(stoneProperties().mapColor(MapColor.COLOR_PINK))),
            GALIA_COAL_ORE = register("galia_coal_ore", () -> new Block(stoneProperties().mapColor(MapColor.COLOR_PINK))),
            GALIA_EMERALD_ORE = register("galia_emerald_ore", () -> new Block(stoneProperties().mapColor(MapColor.COLOR_PINK))),


    // Dytiona Blocks
            DYTIONA_SAND = register("dytiona_sand", () -> new ColoredFallingBlock(new ColorRGBA(0xE0DACA), sandProperties().mapColor(MapColor.TERRACOTTA_WHITE))),
            DYTIONA_STONE = register("dytiona_stone", () -> new Block(stoneProperties().mapColor(MapColor.TERRACOTTA_WHITE))),
            DYTIONA_COBBLESTONE = register("dytiona_cobblestone", () -> new Block(cobblestoneProperties().mapColor(MapColor.TERRACOTTA_WHITE))),

            //Building blocks

            DYTIONA_STONE_BRICKS = register("dytiona_stone_bricks", () -> new Block(stoneProperties().mapColor(MapColor.TERRACOTTA_WHITE))),
            POLISHED_DYTIONA_STONE = register("polished_dytiona_stone", () -> new Block(stoneProperties().mapColor(MapColor.TERRACOTTA_WHITE))),

    /*
    Kepler 10345
     */

    //Soulfer Blocks
    SOULFER_STONE = register("soulfer_stone", () -> new Block(stoneProperties().mapColor(MapColor.TERRACOTTA_ORANGE))),
    SOULFER_COBBLESTONE = register("soulfer_cobblestone", () -> new Block(cobblestoneProperties().mapColor(MapColor.TERRACOTTA_ORANGE))),

            //Building blocks

    POLISHED_SOULFER_STONE = register("polished_soulfer_stone", () -> new Block(stoneProperties().mapColor(MapColor.TERRACOTTA_ORANGE))),
    SOULFER_STONE_BRICKS = register("soulfer_stone_bricks", () -> new Block(stoneProperties().mapColor(MapColor.TERRACOTTA_ORANGE))),
    CHISELED_SOULFER_STONE_BRICKS = register("chiseled_soulfer_stone_bricks", () -> new Block(stoneProperties().mapColor(MapColor.TERRACOTTA_ORANGE))),

            //Ores

    SOULFER_COPPER_ORE = register("soulfer_copper_ore", () -> new Block(stoneProperties().mapColor(MapColor.TERRACOTTA_ORANGE))),
    SOULFER_IRON_ORE = register("soulfer_iron_ore", () -> new Block(stoneProperties().mapColor(MapColor.TERRACOTTA_ORANGE))),
    SOULFER_OSTRUM_ORE = register("soulfer_ostrum_ore", () -> new Block(stoneProperties().mapColor(MapColor.TERRACOTTA_ORANGE))),
    SOULFER_DIAMOND_ORE = register("soulfer_diamond_ore", () -> new Block(stoneProperties().mapColor(MapColor.TERRACOTTA_ORANGE))),

    //Graze system//

    // Flade Blocks

            FLADE_SAND = register("flade_sand", () -> new ColoredFallingBlock(new ColorRGBA(0xcdd15c), sandProperties().mapColor(MapColor.COLOR_YELLOW))),
            FLADE_STONE = register("flade_stone", () -> new Block(stoneProperties().mapColor(MapColor.COLOR_YELLOW))),
            FLADE_COBBLESTONE = register("flade_cobblestone", () -> new Block(cobblestoneProperties().mapColor(MapColor.COLOR_YELLOW))),

            //Building blocks
            FLADE_STONE_BRICKS = register("flade_stone_bricks", () -> new Block(stoneProperties().mapColor(MapColor.COLOR_YELLOW))),
            POLISHED_FLADE_STONE = register("polished_flade_stone", () -> new Block(stoneProperties().mapColor(MapColor.COLOR_YELLOW))),

    // Mixeus Blocks

            MIXEUS_POLISHED_SAND = register("mixeus_polished_sand", () -> new ColoredFallingBlock(new ColorRGBA(0xd7d2c9), sandProperties().mapColor(MapColor.TERRACOTTA_WHITE))),
            MIXEUS_DUSTY_SAND = register("mixeus_dusty_sand", () -> new ColoredFallingBlock(new ColorRGBA(0xcc9d64), sandProperties().mapColor(MapColor.COLOR_ORANGE))),
            MIXEUS_STONE = register("mixeus_stone", () -> new Block(stoneProperties().mapColor(MapColor.SNOW))),
            MIXEUS_COBBLESTONE = register("mixeus_cobblestone", () -> new Block(cobblestoneProperties().mapColor(MapColor.SNOW))),

            //Building blocks

            POLISHED_MIXEUS_STONE = register("polished_mixeus_stone", () -> new Block(stoneProperties().mapColor(MapColor.SNOW))),
            MIXEUS_STONE_BRICKS = register("mixeus_stone_bricks", () -> new Block(stoneProperties().mapColor(MapColor.SNOW))),

    // Dune Blocks
            DUNE_SAND = register("dune_sand", () -> new ColoredFallingBlock(new ColorRGBA(0xd47a4a), sandProperties().mapColor(MapColor.TERRACOTTA_ORANGE))),
            DUNE_STONE = register("dune_stone", () -> new Block(stoneProperties().mapColor(MapColor.TERRACOTTA_ORANGE))),
            DUNE_COBBLESTONE = register("dune_cobblestone", () -> new Block(cobblestoneProperties().mapColor(MapColor.TERRACOTTA_ORANGE))),

            //Building blocks

            POLISHED_DUNE_STONE = register("polished_dune_stone", () -> new Block(stoneProperties().mapColor(MapColor.TERRACOTTA_ORANGE))),

    // Unity Blocks


    // Dread Blocks
            DREAD_COBBLED_GRAVEL = register("dread_cobbled_gravel", () -> new ColoredFallingBlock(new ColorRGBA(0xb5a78f), gravelProperties().mapColor(MapColor.TERRACOTTA_LIGHT_GRAY))),
            DREAD_STONE = register("dread_stone", () -> new Block(stoneProperties().mapColor(MapColor.TERRACOTTA_LIGHT_GRAY))),
            DREAD_COBBLESTONE = register("dread_cobblestone", () -> new Block(cobblestoneProperties().mapColor(MapColor.TERRACOTTA_LIGHT_GRAY))),
            DREAD_DRIPSTONE = register("dread_dripstone", () -> new Block(stoneProperties().mapColor(MapColor.TERRACOTTA_LIGHT_GRAY))),

            //Building blocks

            DREAD_STONE_BRICKS = register("dread_stone_bricks", () -> new Block(stoneProperties().mapColor(MapColor.TERRACOTTA_LIGHT_GRAY))),
            POLISHED_DREAD_STONE = register("polished_dread_stone", () -> new Block(stoneProperties().mapColor(MapColor.TERRACOTTA_LIGHT_GRAY))),

    // Glacies Blocks
            GLACIES_SAND = register("glacies_sand", () -> new ColoredFallingBlock(new ColorRGBA(0xC7AF50), sandProperties().mapColor(MapColor.TERRACOTTA_YELLOW))),
            GLACIES_STONE = register("glacies_stone", () -> new Block(stoneProperties().mapColor(MapColor.TERRACOTTA_YELLOW))),
            GLACIES_COBBLESTONE = register("glacies_cobblestone", () -> new Block(cobblestoneProperties().mapColor(MapColor.TERRACOTTA_YELLOW))),

            //Building blocks

            GLACIES_STONE_BRICKS = register("glacies_stone_bricks", () -> new Block(stoneProperties().mapColor(MapColor.TERRACOTTA_YELLOW))),
            POLISHED_GLACIES_STONE= register("polished_glacies_stone", () -> new Block(stoneProperties().mapColor(MapColor.TERRACOTTA_YELLOW))),

    //Javea system
    // Voltic Blocks


    // Vonic Blocks


    // Reveda Blocks


    // Obrina Blocks


    // Baydin Blocks


    // Evedva Blocks


    // Eclipsa Blocks
    ECLIPSA_SAND = register("eclipsa_sand", () -> new ColoredFallingBlock(new ColorRGBA(0x7D5456), sandProperties().mapColor(MapColor.TERRACOTTA_RED))),
    ECLIPSA_STONE= register("eclipsa_stone", () -> new Block(stoneProperties().mapColor(MapColor.TERRACOTTA_RED))),
    ECLIPSA_COBBLESTONE = register("eclipsa_cobblestone", () -> new Block(cobblestoneProperties().mapColor(MapColor.TERRACOTTA_RED))),

    // Atmas Blocks
    ATMAS_STONE = register("atmas_stone", () -> new Block(stoneProperties().mapColor(MapColor.TERRACOTTA_BLUE))),
    ATMAS_COBBLESTONE = register("atmas_cobblestone", () -> new Block(cobblestoneProperties().mapColor(MapColor.TERRACOTTA_BLUE))),


    // Ringetic Blocks
    RINGETIC_SAND = register("ringetic_sand", () -> new ColoredFallingBlock(new ColorRGBA(0xD9B24C), sandProperties().mapColor(MapColor.TERRACOTTA_YELLOW))),
    RINGETIC_STONE = register("ringetic_stone", () -> new Block(stoneProperties().mapColor(MapColor.TERRACOTTA_YELLOW))),
    RINGETIC_COBBLESTONE = register("ringetic_cobblestone", () -> new Block(cobblestoneProperties().mapColor(MapColor.TERRACOTTA_YELLOW))),
    RINGETIC_FROSTSTONE= register("ringetic_froststone", () -> new Block(stoneProperties().mapColor(MapColor.ICE)));
    /*
    Kepler 38516
     */

    // Sorea Blocks


    // Molvon Blocks

    /*
    Generic blocks
     */
    public static final DeferredBlock<Block>
    // Ore metal plates

    ROSINRITE_PLATING = register("rosinrite_plating", () -> new Block(rosinriteplatingProperties().mapColor(MapColor.TERRACOTTA_MAGENTA))),
    ROSINRITE_PILLAR = register("rosinrite_pillar", () -> new RotatedPillarBlock(rosinriteplatingProperties().mapColor(MapColor.TERRACOTTA_MAGENTA))),
    ROSINRITE_PLATEBLOCK = register("rosinrite_plateblock", () -> new Block(rosinriteplatingProperties().mapColor(MapColor.TERRACOTTA_MAGENTA))),
    ROSINRITE_PANEL = register("rosinrite_panel", () -> new Block(rosinriteplatingProperties().mapColor(MapColor.TERRACOTTA_MAGENTA))),
    //Common stuff

    BASALT_SAND = register("basalt_sand", () -> new ColoredFallingBlock(new ColorRGBA(0x605F5F),sandProperties().mapColor(MapColor.STONE))),
    SULFUR = register("sulfur", () -> new Block(stoneProperties().mapColor(MapColor.COLOR_YELLOW).sound(SoundType.BASALT))),
    SOUL_STONE = register("soul_stone", () -> new Block(stoneProperties().mapColor(MapColor.TERRACOTTA_BROWN))),
    SOUL_MAGMA = register("soul_magma", () -> new MagmaBlock(magmaProperties().mapColor(MapColor.WARPED_WART_BLOCK)));

    /*
    Common Properties
     */

    // How the fuck do you add fluids / liquids. You cant - carrot
    private static BlockBehaviour.Properties iceProperties() {
        return BlockBehaviour.Properties.ofFullCopy(Blocks.ICE);
    }
    private static BlockBehaviour.Properties plantProperties() {
        return BlockBehaviour.Properties.of()
                .noCollission()
                .instabreak()
                .sound(SoundType.GRASS)
                .pushReaction(PushReaction.DESTROY);
    }
    private static BlockBehaviour.Properties liquidProperties() {
        return BlockBehaviour.Properties.ofFullCopy(Blocks.WATER);
    }
    private static BlockBehaviour.Properties grassProperties() {
        return BlockBehaviour.Properties.ofFullCopy(Blocks.GRASS_BLOCK);
    }
    private static BlockBehaviour.Properties dirtProperties() {
        return BlockBehaviour.Properties.ofFullCopy(Blocks.DIRT);
    }
    private static BlockBehaviour.Properties pathProperties() {
        return BlockBehaviour.Properties.ofFullCopy(Blocks.DIRT_PATH);
    }
    private static BlockBehaviour.Properties farmlandProperties() {
        return BlockBehaviour.Properties.ofFullCopy(Blocks.FARMLAND);
    }
    private static BlockBehaviour.Properties mushroomProperties() {
        return BlockBehaviour.Properties.ofFullCopy(Blocks.RED_MUSHROOM_BLOCK);
    }
    private static BlockBehaviour.Properties stoneProperties() {
        return BlockBehaviour.Properties.ofFullCopy(Blocks.STONE);
    }
    private static BlockBehaviour.Properties cobblestoneProperties() {
        return BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE);
    }
    private static BlockBehaviour.Properties magmaProperties() {
        return BlockBehaviour.Properties.ofFullCopy(Blocks.MAGMA_BLOCK);
    }
    private static BlockBehaviour.Properties deepslateProperties() {
        return BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE);
    }
    private static BlockBehaviour.Properties stoneOreProperties() {
        return BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE);
    }
    private static BlockBehaviour.Properties stoneRedstoneOreProperties() {
        return BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_ORE);
    }
    private static BlockBehaviour.Properties deepslateOreProperties() {
        return BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_IRON_ORE);
    }
    private static BlockBehaviour.Properties deepslateRedstoneOreProperties() {
        return BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_REDSTONE_ORE);
    }
    private static BlockBehaviour.Properties crystalProperties() {
        return BlockBehaviour.Properties.of()
                .sound(SoundType.AMETHYST)
                .instrument(NoteBlockInstrument.CHIME)
                .requiresCorrectToolForDrops()
                .strength(1.5f, 1.5f);
    }
    private static BlockBehaviour.Properties compressedDustProperties() {
        return BlockBehaviour.Properties.of()
                .sound(SoundType.DEEPSLATE)
                .instrument(NoteBlockInstrument.CHIME)
                .requiresCorrectToolForDrops()
                .strength(2, 2);
    }
    private static BlockBehaviour.Properties sandProperties() {
        return BlockBehaviour.Properties.ofFullCopy(Blocks.SAND);
    }
    private static BlockBehaviour.Properties gravelProperties() {
        return BlockBehaviour.Properties.ofFullCopy(Blocks.GRAVEL);
    }
    private static BlockBehaviour.Properties rawBlockProperties() {
        return BlockBehaviour.Properties.ofFullCopy(Blocks.RAW_IRON_BLOCK);
    }

    // Metal Properties
    private static BlockBehaviour.Properties steelProperties() {
        return BlockBehaviour.Properties.of()
                .mapColor(MapColor.COLOR_GRAY)
                .instrument(NoteBlockInstrument.IRON_XYLOPHONE)
                .requiresCorrectToolForDrops()
                .strength(5, 12)
                .sound(SoundType.COPPER);
    }
    private static BlockBehaviour.Properties deshProperties() {
        return BlockBehaviour.Properties.of()
                .mapColor(MapColor.COLOR_ORANGE)
                .instrument(NoteBlockInstrument.IRON_XYLOPHONE)
                .requiresCorrectToolForDrops()
                .strength(5, 9)
                .sound(SoundType.COPPER);
    }
    private static BlockBehaviour.Properties ostrumProperties() {
        return BlockBehaviour.Properties.of()
                .mapColor(MapColor.COLOR_PURPLE)
                .instrument(NoteBlockInstrument.IRON_XYLOPHONE)
                .requiresCorrectToolForDrops()
                .strength(5, 16)
                .sound(SoundType.COPPER);
    }
    private static BlockBehaviour.Properties aerolyteProperties() {
        return BlockBehaviour.Properties.of()
                .mapColor(MapColor.COLOR_YELLOW)
                .instrument(NoteBlockInstrument.IRON_XYLOPHONE)
                .requiresCorrectToolForDrops()
                .strength(5, 9)
                .sound(SoundType.COPPER);
    }
    private static BlockBehaviour.Properties rosinriteProperties() {
        return BlockBehaviour.Properties.of()
                .mapColor(MapColor.COLOR_ORANGE)
                .instrument(NoteBlockInstrument.BIT)
                .requiresCorrectToolForDrops()
                .strength(5, 16)
                .sound(SoundType.NETHERITE_BLOCK);
    }
    // Metal plating blocks
    private static BlockBehaviour.Properties rosinriteplatingProperties() {
        return BlockBehaviour.Properties.of()
                .mapColor(MapColor.COLOR_ORANGE)
                .instrument(NoteBlockInstrument.BIT)
                .requiresCorrectToolForDrops()
                .strength(1.5f, 12)
                .sound(SoundType.METAL);
    }
    public static <T extends Block> DeferredBlock<T> register(String id, Supplier<T> block) {
        var registeredBlock = BLOCKS.register(id, block);
        PlanetsPlusItems.ITEMS.registerSimpleBlockItem(registeredBlock);
        return registeredBlock;
    }
}


