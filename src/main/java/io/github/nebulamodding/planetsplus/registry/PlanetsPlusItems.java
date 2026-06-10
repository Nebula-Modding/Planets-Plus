
package io.github.nebulamodding.planetsplus.registry;

import io.github.nebulamodding.planetsplus.PlanetsPlus;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class PlanetsPlusItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(PlanetsPlus.MOD_ID);

    public static final DeferredItem<Item>
    DESH_HANDLE = ITEMS.register("desh_handle", () -> new Item(new Item.Properties())),

    //Ores
    RAW_ROSINRITE = ITEMS.register("raw_rosinrite", () -> new Item(new Item.Properties())),
    ROSINRITE_INGOT = ITEMS.register("rosinrite_ingot", () -> new Item(new Item.Properties())),
    ROSINRITE_NUGGET = ITEMS.register("rosinrite_nugget", () -> new Item(new Item.Properties()));
    // Weapons and tools

    public static final Supplier<SwordItem> ROSINRITE_SWORD = ITEMS.register("rosinrite_sword", ()-> new SwordItem(
            PlanetsPlusTiers.ROSINRITE,
            new Item.Properties().attributes(
                    SwordItem.createAttributes(
                            PlanetsPlusTiers.ROSINRITE,
                            0,
                            -2.6f
                    )

            )
    ));

    /*
    Helpers
     */

    private static DeferredItem<ShovelItem> registerShovelItem(String id, Tier tier, float attackDamage, float attackSpeed) {
        return ITEMS.register(id, () -> new ShovelItem(tier, new Item.Properties()
                .attributes(ShovelItem.createAttributes(tier, attackDamage, attackSpeed)
                )
        ));
    }

    private static DeferredItem<PickaxeItem> registerPickaxeItem(String id, Tier tier, float attackDamage, float attackSpeed) {
        return ITEMS.register(id, () -> new PickaxeItem(tier, new Item.Properties()
                .attributes(PickaxeItem.createAttributes(tier, attackDamage, attackSpeed))
        ));
    }

    private static DeferredItem<AxeItem> registerAxeItem(String id, Tier tier, float attackDamage, float attackSpeed) {
        return ITEMS.register(id, () -> new AxeItem(tier, new Item.Properties()
                .attributes(AxeItem.createAttributes(tier, attackDamage, attackSpeed))
        ));
    }

    private static DeferredItem<HoeItem> registerHoeItem(String id, Tier tier, float attackDamage, float attackSpeed) {
        return ITEMS.register(id, () -> new HoeItem(tier, new Item.Properties()
                .attributes(HoeItem.createAttributes(tier, attackDamage, attackSpeed))
        ));
    }

    private static DeferredItem<SwordItem> registerSwordItem(String id, Tier tier, float attackDamage, float attackSpeed) {
        return ITEMS.register(id, () -> new SwordItem(tier, new Item.Properties()
                .attributes(SwordItem.createAttributes(tier, attackDamage, attackSpeed))
        ));
    }

    private static DeferredItem<MaceItem> registerMaceItem(String id, Tier tier, float attackDamage, float attackSpeed) {
        return ITEMS.register(id, () -> new MaceItem(new Item.Properties()
                .attributes(SwordItem.createAttributes(tier, attackDamage, attackSpeed))
        ));
    }

    public static void register(String id, Object o) {
    }
}