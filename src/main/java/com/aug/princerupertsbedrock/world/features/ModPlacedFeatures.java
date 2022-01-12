package com.aug.princerupertsbedrock.world.features;

import com.aug.princerupertsbedrock.PrinceRupertsBedrock;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.decorator.*;
import net.minecraft.world.gen.feature.PlacedFeature;

public class ModPlacedFeatures {

    public static final RegistryKey<PlacedFeature> OVERWORLD_BEDROCK_TAIL_PLACED_KEY = registryKey("overworld_bedrock_tail");
    public static final RegistryKey<PlacedFeature> NETHER_BEDROCK_TAIL_PLACED_KEY = registryKey("nether_bedrock_tail");


    public static PlacedFeature OVERWORLD_BEDROCK_TAIL_PLACED = register(
            ModConfiguredFeatures.BEDROCK_TAIL.withPlacement(
                    RandomOffsetPlacementModifier.horizontally(UniformIntProvider.create(0, 15)),
                    HeightRangePlacementModifier.trapezoid(YOffset.getBottom(), YOffset.aboveBottom(4))
            ),
            OVERWORLD_BEDROCK_TAIL_PLACED_KEY
    );
    public static PlacedFeature NETHER_BEDROCK_TAIL_PLACED = register(
            ModConfiguredFeatures.BEDROCK_TAIL.withPlacement(
                    RandomOffsetPlacementModifier.horizontally(UniformIntProvider.create(0, 15)),
                    HeightRangePlacementModifier.trapezoid(YOffset.getBottom(), YOffset.aboveBottom(4)),
                    HeightRangePlacementModifier.trapezoid(YOffset.getTop(), YOffset.belowTop(4))
            ),
            NETHER_BEDROCK_TAIL_PLACED_KEY
    );

    private static PlacedFeature register(PlacedFeature placedFeature, RegistryKey<PlacedFeature> placedKey) {
        return Registry.register(BuiltinRegistries.PLACED_FEATURE, placedKey.getValue(), placedFeature);
    }

    private static RegistryKey<PlacedFeature> registryKey(String name) {
        return RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(PrinceRupertsBedrock.MOD_ID, name));
    }

    public static void registerPlacedFeatures() {
        System.out.println("Registering ModPlacedFeatures for " + PrinceRupertsBedrock.MOD_ID);
    }

}
