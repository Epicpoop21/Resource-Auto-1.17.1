package com.epicpoop21.resourceauto.world.gen;

import net.minecraft.core.Registry;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.OreFeature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.RangeDecoratorConfiguration;
import net.minecraft.world.level.levelgen.placement.ConfiguredDecorator;
import net.minecraft.world.level.levelgen.placement.FeatureDecorator;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.fmllegacy.RegistryObject;

public class ModOreGeneration {
    public static void generateOres(final BiomeLoadingEvent event) {
        for (OreType ore : OreType.values()) {
            OreConfiguration oreFeatureConfig = new OreConfiguration(
                    OreConfiguration.Predicates.NATURAL_STONE,
                    ore.getBlock().get().defaultBlockState(), ore.getMaxVeinSize());

            ConfiguredDecorator<RangeDecoratorConfiguration> configuredPlacement = FeatureDecorator.RANGE.configured(
                    new RangeDecoratorConfiguration(ore.getMinHeight(), ore.getMaxHeight())
            );

            ConfiguredFeature<?, ?> oreFeature = registerOreFeature(ore, oreFeatureConfig, configuredPlacement);

            event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, oreFeature);

        }
    }
    private static ConfiguredFeature<?, ?> registerOreFeature(OreType ore, OreConfiguration oreConfiguration,
                                                              ConfiguredDecorator cnfiguredPlacement) {
        return Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, ore.getBlock().get().getRegistryName(),
                Feature.ORE.configured(oreConfiguration).decorated(ConfiguredDecorator)
                        .square().count(ore.getMaxVeinSize()));
    }
}
