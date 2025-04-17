package io.github.nebulamodding.planetsplus.registry;

import com.mojang.serialization.MapCodec;
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

    // Jada Blocks
    public static final DeferredBlock<Block>
            JADA_SAND = register("jada_sand", () -> new ColoredFallingBlock(new ColorRGBA(0x6b5868), sandProperties().mapColor(MapColor.TERRACOTTA_BLUE))),
            JADA_STONE = register("jada_stone", () -> new Block(stoneProperties().mapColor(MapColor.TERRACOTTA_BLUE))),
            JADA_COBBLESTONE = register("jada_cobblestone", () -> new Block(stoneProperties().mapColor(MapColor.TERRACOTTA_BLUE)));

    // Diater Blocks
    public static final DeferredBlock<Block>
            DIATER_STONE = register("diater_stone", () -> new Block(stoneProperties().mapColor(MapColor.COLOR_LIGHT_BLUE))),
            DIATER_COBBLESTONE = register("diater_cobblestone", () -> new Block(stoneProperties().mapColor(MapColor.COLOR_LIGHT_BLUE)));

    // Io Blocks


    // Europa Blocks


    // Ganymede Blocks
    public static final DeferredBlock<Block>
            GANYMEDE_SAND = register("ganymede_sand", () -> new ColoredFallingBlock(new ColorRGBA(0xb5a37c), sandProperties().mapColor(MapColor.TERRACOTTA_LIGHT_GRAY))),
            GANYMEDE_STONE = register("ganymede_stone", () -> new Block(stoneProperties().mapColor(MapColor.TERRACOTTA_LIGHT_GRAY))),
            GANYMEDE_COBBLESTONE = register("ganymede_cobblestone", () -> new Block(stoneProperties().mapColor(MapColor.TERRACOTTA_LIGHT_GRAY))),
            GANYMEDE_HIGHLANDS_STONE = register("ganymede_highlands_stone", () -> new Block(stoneProperties().mapColor(MapColor.TERRACOTTA_GRAY))),
            GANYMEDE_HIGHLANDS_COBBLESTONE = register("ganymede_highlands_cobblestone", () -> new Block(stoneProperties().mapColor(MapColor.TERRACOTTA_GRAY)));

    // Callisto Blocks


    // Enceladus Blocks


    // Titan Blocks


    // Iapetus Blocks


    // Pluto Blocks


    // Charon Blocks


    /*
    Kepler Centauri
     */

    // Vulcan Blocks
    public static final DeferredBlock<Block>
            VULCAN_STONE = register("vulcan_stone", () -> new Block(stoneProperties().mapColor(MapColor.COLOR_RED))),
            VULCAN_COBBLESTONE = register("vulcan_cobblestone", () -> new Block(stoneProperties().mapColor(MapColor.COLOR_RED))),
            VULCAN_INFERNAL_BASALT = register("vulcan_infernal_basalt", () -> new MagmaBlock(stoneProperties().sound(SoundType.BASALT).mapColor(MapColor.COLOR_RED)));

    // Fierer Blocks


    // Ronxy Moon1 Blocks


    // Ronxy Moon2 Blocks


    // Galia Blocks
    public static final DeferredBlock<Block>
            GALIA_SAND = register("galia_sand", () -> new ColoredFallingBlock(new ColorRGBA(0xcc4380), sandProperties().mapColor(MapColor.COLOR_PINK))),
            GALIA_STONE = register("galia_stone", () -> new Block(stoneProperties().mapColor(MapColor.COLOR_PINK))),
            GALIA_COBBLESTONE = register("galia_cobblestone", () -> new Block(stoneProperties().mapColor(MapColor.COLOR_PINK)));

    // Dytiona Blocks


    /*
    Kepler 10345
     */

    //Soulfer Blocks


    // Flade Blocks
    public static final DeferredBlock<Block>
            FLADE_SAND = register("flade_sand", () -> new ColoredFallingBlock(new ColorRGBA(0xcdd15c), sandProperties().mapColor(MapColor.COLOR_YELLOW))),
            FLADE_STONE = register("flade_stone", () -> new Block(stoneProperties().mapColor(MapColor.COLOR_YELLOW))),
            FLADE_COBBLESTONE = register("flade_cobblestone", () -> new Block(stoneProperties().mapColor(MapColor.COLOR_YELLOW)));

    // Mixeus Blocks
    public static final DeferredBlock<Block>
            MIXEUS_POLISHED_SAND = register("mixeus_polished_sand", () -> new ColoredFallingBlock(new ColorRGBA(0xd7d2c9), sandProperties().mapColor(MapColor.TERRACOTTA_WHITE))),
            MIXEUS_DUSTY_SAND = register("mixeus_dusty_sand", () -> new ColoredFallingBlock(new ColorRGBA(0xcc9d64), sandProperties().mapColor(MapColor.COLOR_ORANGE))),
            MIXEUS_STONE = register("mixeus_stone", () -> new Block(stoneProperties().mapColor(MapColor.SNOW))),
            MIXEUS_COBBLESTONE = register("mixeus_cobblestone", () -> new Block(stoneProperties().mapColor(MapColor.SNOW)));

    // Dune Blocks


    // Unity Blocks


    // Dread Blocks


    // Glacies Blocks


    // Voltic Blocks


    // Vonic Blocks


    // Reveda Blocks


    // Obrina Blocks


    // Baydin Blocks


    // Evedva Blocks


    // Eclipsa Blocks


    // Atmas Blocks


    // Ringetic Blocks


    /*
    Kepler 38516
     */

    // Sorea Blocks


    // Molvon Blocks


    /*
    Common Properties
     */

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
    private static BlockBehaviour.Properties stoneProperties() {
        return BlockBehaviour.Properties.ofFullCopy(Blocks.STONE);
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
    private static <T extends Block> DeferredBlock<T> register(String id, Supplier<T> block) {
        var registeredBlock = BLOCKS.register(id, block);
        PlanetsPlusItems.ITEMS.registerSimpleBlockItem(registeredBlock);
        return registeredBlock;
    }
}


