package com.epicpoop21.resourceauto.world.gen;


import com.google.common.collect.ImmutableList;
import com.epicpoop21.resourceauto.ResourceAuto;
import com.epicpoop21.resourceauto.block.ModBlocks;
import com.epicpoop21.resourceauto.util.ModWorldGen;
import net.minecraft.core.Registry;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;


public final class ModOreGen
{
    public static ConfiguredFeature<?, ?> ELEMENTAL_OVERWORLD;

    public static ImmutableList<OreConfiguration.TargetBlockState> ELEMENTAL_TARGET_BLOCKS;

    public static ConfiguredFeature<?, ?> buildOverworldOre(ImmutableList<OreConfiguration.TargetBlockState> targets, int veinSize, int maxHeight, int timesRarer)
    {
        return Feature.ORE.configured(new OreConfiguration(targets,
                        veinSize))
                .rangeUniform(VerticalAnchor.bottom(),
                        VerticalAnchor.aboveBottom(maxHeight)).squared()
                .squared()
                .rarity(timesRarer);

    }

    public static void registerConfiguredFeature() {

        ELEMENTAL_TARGET_BLOCKS = ImmutableList.of(OreConfiguration.target(OreConfiguration.Predicates.STONE_ORE_REPLACEABLES, ModBlocks.ELEMENTAL_ORE.get().defaultBlockState()));
        ELEMENTAL_OVERWORLD = buildOverworldOre(ELEMENTAL_TARGET_BLOCKS, ModWorldGen.elementalOrePerCluster.get(), ModWorldGen.elementalOreMaxY.get(), ModWorldGen.elementalOreMaxClustersPerChunk.get());


        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(ResourceAuto.MOD_ID, "elemental_ore"), ELEMENTAL_OVERWORLD);

    }
}

