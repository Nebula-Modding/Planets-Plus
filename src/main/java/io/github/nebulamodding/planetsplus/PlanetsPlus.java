package io.github.nebulamodding.planetsplus;

import io.github.nebulamodding.planetsplus.datagen.PlanetsPlusDataGeneration;
import io.github.nebulamodding.planetsplus.foundation.liquids.BasicLiquidType;
import io.github.nebulamodding.planetsplus.registry.*;
import net.minecraft.tags.FluidTags;
import net.neoforged.neoforge.fluids.FluidType;
import net.neoforged.neoforge.registries.DeferredHolder;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.minecraft.client.Minecraft;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

@Mod(PlanetsPlus.MOD_ID)
public class PlanetsPlus {
    public static final String MOD_ID = "planetsplus";
    public static final Logger LOGGER = LogUtils.getLogger();

    public PlanetsPlus(IEventBus eventBus, ModContainer modContainer) {
        PlanetsPlusBlocks.BLOCKS.register(eventBus);
        PlanetsPlusItems.ITEMS.register(eventBus);
        PlanetsPlusCreativeTab.CREATIVE_MODE_TABS.register(eventBus);



        eventBus.addListener(PlanetsPlusCreativeTab::buildCreativeTab);
        eventBus.addListener(PlanetsPlusDataGeneration::gatherData);

        eventBus.addListener(this::commonSetup);
        NeoForge.EVENT_BUS.register(this);

        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);

    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        LOGGER.info("Placeholder (common setup message)");
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        LOGGER.info("Placeholder (server starting message)");
    }

    @EventBusSubscriber(modid = MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)

    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            LOGGER.info("Placeholder (client setup message)");
            LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());
        }
    }
}
