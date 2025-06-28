package io.github.nebulamodding.planetsplus.foundation.liquids;

import com.mojang.blaze3d.shaders.FogShape;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.Camera;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.renderer.FogRenderer;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.client.extensions.common.IClientFluidTypeExtensions;
import net.neoforged.neoforge.fluids.FluidType;
import org.jetbrains.annotations.NotNull;
import org.joml.Vector3f;

import javax.annotation.ParametersAreNonnullByDefault;

// https://github.com/Tutorials-By-Kaupenjoe/NeoForge-Course-121-Module-5/blob/2c56e563d3411f9b585c1f3208653196a977087f/src/main/java/net/kaupenjoe/mccourse/fluid/BaseFluidType.java
public class BasicLiquidType extends FluidType {
    public final ResourceLocation stillTexture, flowingTexture, overlayTexture;
    public final int tintColour;
    public final Vector3f fogColour;

    public BasicLiquidType(ResourceLocation stillTexture, ResourceLocation flowingTexture, ResourceLocation overlayTexture, int tintColour, Vector3f fogColour, FluidType.Properties properties) {
        super(properties);
        this.stillTexture = stillTexture;
        this.flowingTexture = flowingTexture;
        this.overlayTexture = overlayTexture;
        this.tintColour = tintColour;
        this.fogColour = fogColour;
    }

    public static IClientFluidTypeExtensions getClientExtensionsFor(BasicLiquidType FluidType) {
        return new IClientFluidTypeExtensions() {
            @Override
            public @NotNull ResourceLocation getStillTexture() {
                return FluidType.stillTexture;
            }

            @Override
            public @NotNull ResourceLocation getFlowingTexture() {
                return FluidType.flowingTexture;
            }

            @Override
            public @NotNull ResourceLocation getOverlayTexture() {
                return FluidType.overlayTexture;
            }

            @Override
            public int getTintColor() {
                return FluidType.tintColour;
            }

            @Override
            @ParametersAreNonnullByDefault
            public @NotNull Vector3f modifyFogColor(Camera camera, float partialTick, ClientLevel level, int renderDistance, float darkenWorldAmount, Vector3f fluidFogColour) {
                return FluidType.fogColour;
            }

            @Override
            @ParametersAreNonnullByDefault
            public void modifyFogRender(Camera camera, FogRenderer.FogMode fogMode, float renderDistance, float partialTick, float nearDistance, float farDistance, FogShape fogShape) {
                RenderSystem.setShaderFogStart(1f);
                RenderSystem.setShaderFogEnd(6f); // Distance when the fog starts
            }
        };
    }
}