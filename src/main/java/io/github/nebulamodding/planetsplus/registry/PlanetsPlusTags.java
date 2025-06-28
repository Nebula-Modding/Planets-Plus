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

                /*
                Common Tags
                 */

                // Cobblestones
                COBBLESTONES_VULCAN_STONE = commonBlockTag("cobblestones/vulcan_stone"),

                // Ore Bearing Ground
                ORE_BEARING_GROUND_VULCAN_STONE = commonBlockTag("ore_bearing_ground/vulcan_stone"),

                // Ores In Ground
                ORES_IN_GROUND_VULCAN_STONE = commonBlockTag("ores_in_ground/vulcan_stone"),

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

                // Base Stones
                BASE_STONE_VULCAN = blockTag("base_stone_vulcan"),
                BASE_STONE_UNITY = blockTag("base_stone_unity"),

                // Carver Replacables
                VULCAN_CARVER_REPLACEABLES = blockTag("vulcan_carver_replaceables"),
                UNITY_CARVER_REPLACEABLES = blockTag("unity_carver_replaceables"),

                // Ore Replaceables
                VULCAN_STONE_ORE_REPLACEABLES = blockTag("vulcan_stone_ore_replaceables"),

                // World Gen


                SPIKE_REPLACEABLE = blockTag("spike_replaceables");


    }
    public static class PlanetsPlusItemTags {
        // Block Items
        public static final TagKey<Item>
                // Cobblestones
                COBBLESTONES_VULCAN_STONE = commonItemTag("cobblestones/vulcan_stone"),

                // Ore Bearing Ground
                ORE_BEARING_GROUND_VULCAN_STONE = commonItemTag("ore_bearing_ground/vulcan_stone"),

                // Ores In Ground
                ORES_IN_GROUND_VULCAN_STONE = commonItemTag("ores_in_ground/vulcan_stone"),

                // Ore Blocks
                ORES_ROSINRITE = commonItemTag("ores/rosinrite"),

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