package cn.fandmc.worldgen;

import cn.fandmc.Main;
import cn.fandmc.block.ModBlocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;

import java.util.List;

public class ModConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> ALUMINUM_ORE_KEY = registerKey("aluminum_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TIN_ORE_KEY = registerKey("tin_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> SILICON_ORE_KEY = registerKey("silicon_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> COPPER_ORE_KEY = registerKey("copper_ore");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceables = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

        List<OreFeatureConfig.Target> aluminumOreTargets = List.of(
                OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.ALUMINUM_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.ALUMINUM_ORE.getDefaultState())
        );

        List<OreFeatureConfig.Target> tinOreTargets = List.of(
                OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.TIN_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.TIN_ORE.getDefaultState())
        );

        List<OreFeatureConfig.Target> siliconOreTargets = List.of(
                OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.SILICON_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.SILICON_ORE.getDefaultState())
        );

        List<OreFeatureConfig.Target> copperOreTargets = List.of(
                OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.COPPER_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.COPPER_ORE.getDefaultState())
        );

        register(context, ALUMINUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(aluminumOreTargets, 9));
        register(context, TIN_ORE_KEY, Feature.ORE, new OreFeatureConfig(tinOreTargets, 9));
        register(context, SILICON_ORE_KEY, Feature.ORE, new OreFeatureConfig(siliconOreTargets, 9));
        register(context, COPPER_ORE_KEY, Feature.ORE, new OreFeatureConfig(copperOreTargets, 9));
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(Main.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(
            Registerable<ConfiguredFeature<?, ?>> context,
            RegistryKey<ConfiguredFeature<?, ?>> key,
            F feature,
            FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}