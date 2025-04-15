package io.github.nebulamodding.planetsplus.registry;

import com.mojang.serialization.MapCodec;
import io.github.nebulamodding.planetsplus.PlanetsPlus;
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

    public static final DeferredBlock<Block>

    /*
    Jada Blocks
     */
            JADA_SAND = register("jada_sand", () -> new FallingBlock(sandProperties().mapColor(MapColor.COLOR_PURPLE)) {
        @Override
        protected MapCodec<? extends FallingBlock> codec() {
            return null;
        }
    }),

            JADA_STONE = register("jada_stone", () -> new Block(stoneProperties().mapColor(MapColor.COLOR_PURPLE))),
            JADA_COBBLESTONE = register("jada_cobblestone", () -> new Block(stoneProperties().mapColor(MapColor.COLOR_PURPLE))),

    /*
    Diater Blocks
     */
            DIATER_STONE = register("diater_stone", () -> new Block(stoneProperties().mapColor(MapColor.COLOR_LIGHT_BLUE))),
            DIATER_COBBLESTONE = register("diater_cobblestone", () -> new Block(stoneProperties().mapColor(MapColor.COLOR_LIGHT_BLUE))),

    /*
    Io Blocks
     */

    /*
    Europa Blocks
     */

    /*
    Ganymede Blocks
     */
            GANYMEDE_SAND = register("ganymede_sand", () -> new FallingBlock(sandProperties().mapColor(MapColor.COLOR_YELLOW)) {
                @Override
                protected MapCodec<? extends FallingBlock> codec() {
                    return null;
                }
            }),

            GANYMEDE_STONE = register("ganymede_stone", () -> new Block(stoneProperties().mapColor(MapColor.COLOR_YELLOW))),
            GANYMEDE_COBBLESTONE = register("ganymede_cobblestone", () -> new Block(stoneProperties().mapColor(MapColor.COLOR_YELLOW))),
            GANYMEDE_HIGHLANDS_STONE = register("ganymede_highlands_stone", () -> new Block(stoneProperties().mapColor(MapColor.COLOR_BROWN))),
            GANYMEDE_HIGHLANDS_COBBLESTONE = register("ganymede_highlands_cobblestone", () -> new Block(stoneProperties().mapColor(MapColor.COLOR_BROWN))),
     /*
    Callisto Blocks
     */

    /*
    Enceladus Blocks
     */

    /*
    Titan Blocks
     */

     /*
    Iapetus Blocks
     */

    /*
    Pluto Blocks
     */

    /*
    Charon Blocks
     */


    /*
    END OF SOLAR SYSTEM

    START OF KELPER CENTAURI SYSTEM
     */


    /*
    Vulcan Blocks
     */
            VULCAN_STONE = register("vulcan_stone", () -> new Block(stoneProperties().mapColor(MapColor.COLOR_RED))),
            VULCAN_COBBLESTONE = register("vulcan_cobblestone", () -> new Block(stoneProperties().mapColor(MapColor.COLOR_RED))),
            VULCAN_INFERNAL_BASALT = register("vulcan_infernal_basalt", () -> new MagmaBlock(stoneProperties().sound(SoundType.BASALT).mapColor(MapColor.COLOR_RED))),
    /*
    Fierer Blocks
     */

    /*
    Ronxy moon1 Blocks
     */

    /*
    Ronxy moon2 Blocks
     */

    /*
    Galia Blocks
     */
        GALIA_SAND = register("galia_sand", () -> new FallingBlock(sandProperties().mapColor(MapColor.COLOR_MAGENTA)) {
        @Override
        protected MapCodec<? extends FallingBlock> codec() {
            return null;
        }
    }),

            GALIA_STONE = register("galia_stone", () -> new Block(stoneProperties().mapColor(MapColor.COLOR_MAGENTA))),
            GALIA_COBBLESTONE = register("galia_cobblestone", () -> new Block(stoneProperties().mapColor(MapColor.COLOR_MAGENTA))),

    /*
    Dytiona Blocks
     */


    /*
    END OF KELPER CENTAURI SYSTEM

    START OF KELPER 10345 SYSTEM
     */


    /*
    Soulfer Blocks
     */

    /*
    Flade Blocks
     */
        FLADE_SAND = register("flade_sand", () -> new FallingBlock(sandProperties().mapColor(MapColor.COLOR_YELLOW)) {
        @Override
        protected MapCodec<? extends FallingBlock> codec() {
            return null;
        }
    }),

            FLADE_STONE = register("flade_stone", () -> new Block(stoneProperties().mapColor(MapColor.COLOR_YELLOW))),
            FLADE_COBBLESTONE = register("flade_cobblestone", () -> new Block(stoneProperties().mapColor(MapColor.COLOR_YELLOW))),

    /*
    Mixeus Blocks
     */
        MIXEUS_POLISHED_SAND = register("mixeus_polished_sand", () -> new FallingBlock(sandProperties().mapColor(MapColor.COLOR_LIGHT_GRAY)) {
        @Override
        protected MapCodec<? extends FallingBlock> codec() {
            return null;
        }
    }),

        MIXEUS_DUSTY_SAND = register("mixeus_dusty_sand", () -> new FallingBlock(sandProperties().mapColor(MapColor.COLOR_YELLOW)) {
        @Override
        protected MapCodec<? extends FallingBlock> codec() {
            return null;
        }
    }),

            MIXEUS_STONE = register("mixeus_stone", () -> new Block(stoneProperties().mapColor(MapColor.COLOR_LIGHT_GRAY))),
            MIXEUS_COBBLESTONE = register("mixeus_cobblestone", () -> new Block(stoneProperties().mapColor(MapColor.COLOR_LIGHT_GRAY)));


    /*
    Dune Blocks
     */

    /*
    Unity Blocks
     */

     /*
    Dread Blocks
     */

    /*
    Glacies Blocks
     */

    /*
    Voltic Blocks
     */

    /*
    Vonic Blocks
     */

    /*
    Reveda Blocks
     */

    /*
    Obrina Blocks
     */

    /*
    Baydin Blocks
     */

     /*
    Evedva Blocks
     */

    /*
    Eclipsa Blocks
     */

    /*
    Atmas Blocks
     */

    /*
    Ringetic Blocks
     */


    /*
    END OF KELPER 10345 SYSTEM

    START OF KELPER 38516 SYSTEM
     */


    /*
    Sorea Blocks
     */

    /*
    Molvon Blocks
     */

    /*
    Object Blocks
     */

    /*
    Object Blocks
     */

    /*
    Object Blocks
     */



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


