package com.aug.princerupertsbedrock.world.features;

import com.aug.princerupertsbedrock.PrinceRupertsBedrock;
import com.aug.princerupertsbedrock.block.ModBlocks;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;

public class ModConfiguredFeatures {

    public static final RegistryKey<ConfiguredFeature<?, ?>> BEDROCK_TAIL_KEY = registryKey("bedrock_tail");

    public static ConfiguredFeature<?, ?> BEDROCK_TAIL = register(
            Feature.SIMPLE_BLOCK.configure(
                    new SimpleBlockFeatureConfig(
                            BlockStateProvider.of(ModBlocks.BEDROCK_TAIL.getDefaultState())
                    )
            ),
            BEDROCK_TAIL_KEY
    );

    private static RegistryKey<ConfiguredFeature<?, ?>> registryKey(String name) {
        return RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(PrinceRupertsBedrock.MOD_ID, name));
    }

    private static ConfiguredFeature<?, ?> register(ConfiguredFeature<?, ?> configuredFeature, RegistryKey<ConfiguredFeature<?, ?>> configuredKey) {
        return Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, configuredKey.getValue(), configuredFeature);
    }

    public static void registerConfiguredFeatures() {
        System.out.println("Registering ModConfiguredFeatures for " + PrinceRupertsBedrock.MOD_ID);
    }

}
