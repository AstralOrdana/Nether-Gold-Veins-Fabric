package com.ordana.ngv;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.PlacedFeature;

public class NGV implements ModInitializer {



    public static final String MOD_ID = "ngv";

    @Override
    public void onInitialize() {

        RegistryKey<PlacedFeature> nether_gold_vein = RegistryKey.of(Registry.PLACED_FEATURE_KEY,
                new Identifier("ngv", "nether_gold_vein"));
        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES, nether_gold_vein);

    }
}
