package com.aug.princerupertsbedrock.world.gen;

import com.aug.princerupertsbedrock.world.features.ModPlacedFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.gen.GenerationStep;

public class ModFeatureGeneration {

    /*
     * /effect give @a minecraft:night_vision 10000 1
     * /fill ~ -64 ~ ~50 -61 ~50 air replace minecraft:bedrock
     * /fill ~ -64 ~ ~50 -61 ~50 air replace minecraft:deepslate
     */

    public static void generate() {
        BiomeModifications.addFeature(
                BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.OVERWORLD_BEDROCK_TAIL_PLACED_KEY
        );
        BiomeModifications.addFeature(
                BiomeSelectors.foundInTheNether(),
                GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.NETHER_BEDROCK_TAIL_PLACED_KEY
        );
    }

}
