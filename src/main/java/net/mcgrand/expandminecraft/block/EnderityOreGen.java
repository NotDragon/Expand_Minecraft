package net.mcgrand.expandminecraft.block;


import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.mcgrand.expandminecraft.ExpandMinecraft;
import net.minecraft.block.Blocks;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.decorator.CountPlacementModifier;
import net.minecraft.world.gen.decorator.HeightRangePlacementModifier;
import net.minecraft.world.gen.decorator.SquarePlacementModifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.PlacedFeature;

public class EnderityOreGen implements ModInitializer {
    private static ConfiguredFeature<?, ?> ENDERITY_ORE_CONFIGURED_FEATURE =Feature.ORE
            .configure(new OreFeatureConfig(
                    new BlockMatchRuleTest(Blocks.END_STONE),
                    ModBlocks.ENDERITY_ORE.getDefaultState(),
                    9));

    public static PlacedFeature ENDERITY_ORE_PLACED_FEATURE = ENDERITY_ORE_CONFIGURED_FEATURE.withPlacement(
            CountPlacementModifier.of(20),
            SquarePlacementModifier.of(),
            HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(256)));

    @Override
    public void onInitialize() {
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
                new Identifier(ExpandMinecraft.MOD_ID, "block:enderity_ore"), ENDERITY_ORE_CONFIGURED_FEATURE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(ExpandMinecraft.MOD_ID, "block:enderity_ore"),
                ENDERITY_ORE_PLACED_FEATURE);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES,
                RegistryKey.of(Registry.PLACED_FEATURE_KEY,
                        new Identifier(ExpandMinecraft.MOD_ID, "block:enderity_ore")));
    }

    public static void registerModOres(){
        ExpandMinecraft.LOGGER.info("Registering Mod Ores");
    }
}
