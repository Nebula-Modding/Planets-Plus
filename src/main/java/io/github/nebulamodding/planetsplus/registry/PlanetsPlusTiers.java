package io.github.nebulamodding.planetsplus.registry;

import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;

public class PlanetsPlusTiers {
    public static final Tier
            // Hey Carrot, you'll most likely want to change these values to fit the material, they're all 1 as a placeholder
            ROSINRITE = new SimpleTier(PlanetsPlusTags.PlanetsPlusBlockTags.NEEDS_ROSINRITE_TOOL,
            839,
            10,
            6.5f,
            13,
            () -> Ingredient.of(PlanetsPlusTags.PlanetsPlusItemTags.INGOTS_ROSINRITE));
}