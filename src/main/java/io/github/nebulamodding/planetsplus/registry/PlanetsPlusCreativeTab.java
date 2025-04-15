package io.github.nebulamodding.planetsplus.registry;

import io.github.nebulamodding.planetsplus.PlanetsPlus;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.ArrayList;
import java.util.List;

public class PlanetsPlusCreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PlanetsPlus.MOD_ID);

    public static String CREATIVE_TAB_TITLE = "itemGroup.planetsplus";
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> ET_ULTRA = CREATIVE_MODE_TABS.register("planetsplus", () ->
            CreativeModeTab.builder()
                    .title(Component.translatable(CREATIVE_TAB_TITLE))
                    .icon(() -> new ItemStack(PlanetsPlusBlocks.VULCAN_INFERNAL_BASALT.get()))
                    .build());

    public static void buildCreativeTab(BuildCreativeModeTabContentsEvent event) {
        final List<DeferredBlock<? extends Block>> excludedItems = new ArrayList<>();
        // Blocks excluded from the creative menu
        //excludedItems.add(PlanetsPlusBlocks.ExampleBlock);

        if(event.getTab() == ET_ULTRA.get()) {
            PlanetsPlusItems.ITEMS.getEntries()
                    .stream()
                    .filter(b -> !excludedItems.contains(b))
                    .forEach(item -> event.accept(item.get()));
        }
    }
}