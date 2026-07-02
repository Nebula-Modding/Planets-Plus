package io.github.nebulamodding.planetsplus.registry;

import io.github.nebulamodding.planetsplus.PlanetsPlus;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class PlanetsPlusTags {
    public static TagKey<Block> commonBlockTag(String name) {
        return BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", name));
    }
    public static TagKey<Item> commonItemTag(String name) {
        return ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", name));
    }
    public static TagKey<Block> blockTag(String name) {
        return BlockTags.create(ResourceLocation.fromNamespaceAndPath(PlanetsPlus.MOD_ID, name));
    }
    public static TagKey<Item> itemTag(String name) {
        return ItemTags.create(ResourceLocation.fromNamespaceAndPath(PlanetsPlus.MOD_ID, name));
    }
    public static class PlanetsPlusBlockTags {
        // Blocks
        public static final TagKey<Block>

                // This is where you declare a tag to exist then you go to the TagsProviders to add stuff to them

                /*
                Common Tags
                 */

                //Stones
                STONES = commonBlockTag("stones"),

                // Cobblestones
                COBBLESTONES_VULCAN_STONE = commonBlockTag("cobblestones/vulcan_stone"),

                // Ore Blocks
                ORES_ROSINRITE = commonBlockTag("ores/rosinrite"),

                // Storage Blocks
                STORAGE_BLOCKS_ROSINRITE = commonBlockTag("storage_blocks/rosinrite"),
                STORAGE_BLOCKS_RAW_ROSINRITE = commonBlockTag("storage_blocks/raw_rosinrite"),

                /*
                Planets+ Tags
                 */



                // Needs Tools
                NEEDS_ROSINRITE_TOOL = blockTag("needs_rosinrite_tool"),

                // World Gen

                // Ore Replaceables
                //Worldgen
                //Solar System
                        JADA_ORE_REPLACEABLES = blockTag("jada_ore_replaceables"),
                        DIATER_ORE_REPLACEABLES = blockTag("diater_ore_replaceables"),
                        IO_ORE_REPLACEABLES = blockTag("io_ore_replaceables"),
                        EUROPA_ORE_REPLACEABLES = blockTag("europa_ore_replaceables"),
                        GANYMEDE_ORE_REPLACEABLES = blockTag("ganymede_ore_replaceables"),
                        CALLISTO_ORE_REPLACEABLES = blockTag("callisto_ore_replaceables"),
                        ENCELEDUS_ORE_REPLACEABLES = blockTag("enceledus_ore_replaceables"),
                        TITAN_ORE_REPLACEABLES = blockTag("titan_ore_replaceables"),
                        IAPETUS_ORE_REPLACEABLES = blockTag("iapedus_ore_replaceables"),
                        PLUTO_ORE_REPLACEABLES = blockTag("pluto_ore_replaceables"),
                        CHARON_ORE_REPLACEABLES = blockTag("charon_ore_replaceables"),

                // Kepler Centauri
                        VULCAN_ORE_REPLACEABLES = blockTag("vulcan_ore_replaceables"),
                        FIERER_ORE_REPLACEABLES = blockTag("fierer_ore_replaceables"),
                        GALIA_ORE_REPLACEABLES = blockTag("galia_stone_ore_replaceables"),
                        DYTIONA_ORE_REPLACEABLES = blockTag("dytiona_stone_ore_replaceables"),

                // Syris
                        SOULFER_ORE_REPLACEABLES = blockTag("soulfer_ore_replaceables"),
                        FLADE_ORE_REPLACEABLES = blockTag("flade_ore_replaceables"),
                        MIXEUS_ORE_REPLACEABLES = blockTag("mixeus_ore_replaceables"),
                        DUNE_ORE_REPLACEABLES = blockTag("dune_ore_replaceables"),
                        DREAD_ORE_REPLACEABLES = blockTag("dread_ore_replaceables"),
                        GLACIES_ORE_REPLACEABLES = blockTag("glacies_ore_replaceables"),
                        VOLTIC_ORE_REPLACEABLES = blockTag("voltic_ore_replaceables"),
                        VONIC_ORE_REPLACEABLES = blockTag("vonic_ore_replaceables"),
                        REVEDA_ORE_REPLACEABLES = blockTag("reveda_ore_replaceables"),
                        OBRINA_ORE_REPLACEABLES = blockTag("obrina_ore_replaceables"),
                        BAYDIN_ORE_REPLACEABLES = blockTag("baydin_ore_replaceables"),
                        EVEDVA_ORE_REPLACEABLES = blockTag("evedva_ore_replaceables"),
                        ECLIPSA_ORE_REPLACEABLES = blockTag("eclipsa_ore_replaceables"),
                        ATMAS_ORE_REPLACEABLES = blockTag("atmas_ore_replaceables"),
                        RINGETIC_ORE_REPLACEABLES = blockTag("ringetic_ore_replaceables"),


                SPIKE_REPLACEABLES = blockTag("worldgen/spike_replaceables");



    }
    public static class PlanetsPlusItemTags {
        // Block Items
        public static final TagKey<Item>
                //

                // Cobblestones
                COBBLESTONES_VULCAN_STONE = commonItemTag("cobblestones/vulcan_stone"),


                // Storage Blocks
                STORAGE_BLOCKS_ROSINRITE = commonItemTag("storage_blocks/rosinrite"),
                STORAGE_BLOCKS_RAW_ROSINRITE = commonItemTag("storage_blocks/raw_rosinrite");

        // Items
        public static final TagKey<Item>
                // Adds a plates tag because neoforge doesn't have a common tag for it by default
                PLATES = commonItemTag("plates"),

                // Metals
                RAW_MATERIALS_ROSINRITE = commonItemTag("raw_material/rosinrite"),
                NUGGETS_ROSINRITE = commonItemTag("nuggets/rosinrite"),
                INGOTS_ROSINRITE = commonItemTag("ingots/rosinrite"),
                PLATES_ROSINRITE = commonItemTag("plates/rosinrite"),
                RODS_ROSINRITE = commonItemTag("rods/rosinrite");
    }
}