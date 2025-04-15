package io.github.nebulamodding.planetsplus.datagen.assets;

import io.github.nebulamodding.planetsplus.PlanetsPlus;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.common.data.SoundDefinition;
import net.neoforged.neoforge.common.data.SoundDefinitionsProvider;

public class PlanetsPlusSoundDefinitionsProvider extends SoundDefinitionsProvider {
    public PlanetsPlusSoundDefinitionsProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, PlanetsPlus.MOD_ID, existingFileHelper);
    }
    @Override
    public void registerSounds() {
        // Sounds go here
    }
    private SoundDefinition addSubtitle(String subtitle) {
        return definition().subtitle("subtitles." + subtitle);
    }
}
