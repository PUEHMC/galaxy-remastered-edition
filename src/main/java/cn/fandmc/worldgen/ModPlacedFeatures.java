package cn.fandmc.worldgen;

import cn.fandmc.Main;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.CountPlacementModifier;
import net.minecraft.world.gen.placementmodifier.SquarePlacementModifier;
import net.minecraft.world.gen.placementmodifier.BiomePlacementModifier;

import java.util.List;

public class ModPlacedFeatures {
    public static final RegistryKey<PlacedFeature> ALUMINUM_ORE_PLACED_KEY = registerKey("aluminum_ore_placed");
    public static final RegistryKey<PlacedFeature> TIN_ORE_PLACED_KEY = registerKey("tin_ore_placed");
    public static final RegistryKey<PlacedFeature> SILICON_ORE_PLACED_KEY = registerKey("silicon_ore_placed");
    public static final RegistryKey<PlacedFeature> COPPER_ORE_PLACED_KEY = registerKey("copper_ore_placed");

    public static void bootstrap(Registerable<PlacedFeature> context) {
        var configuredFeatureRegistryEntryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        register(context, ALUMINUM_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.ALUMINUM_ORE_KEY),
                modifiersWithCount(7, // 每个区块尝试生成7次
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-64), YOffset.fixed(80)))); // 在Y=-64到Y=80之间生成
        
        register(context, TIN_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.TIN_ORE_KEY),
                modifiersWithCount(6, // 每个区块尝试生成6次
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-64), YOffset.fixed(72)))); // 在Y=-64到Y=72之间生成
        
        register(context, SILICON_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.SILICON_ORE_KEY),
                modifiersWithCount(5, // 每个区块尝试生成5次
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-64), YOffset.fixed(64)))); // 在Y=-64到Y=64之间生成
        
        register(context, COPPER_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.COPPER_ORE_KEY),
                modifiersWithCount(8, // 每个区块尝试生成8次
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-64), YOffset.fixed(96)))); // 在Y=-64到Y=96之间生成
    }

    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, Identifier.of(Main.MOD_ID, name));
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                 List<net.minecraft.world.gen.placementmodifier.PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static List<net.minecraft.world.gen.placementmodifier.PlacementModifier> modifiers(net.minecraft.world.gen.placementmodifier.PlacementModifier countModifier, net.minecraft.world.gen.placementmodifier.PlacementModifier heightModifier) {
        return List.of(countModifier, SquarePlacementModifier.of(), heightModifier, BiomePlacementModifier.of());
    }

    private static List<net.minecraft.world.gen.placementmodifier.PlacementModifier> modifiersWithCount(int count, net.minecraft.world.gen.placementmodifier.PlacementModifier heightModifier) {
        return modifiers(CountPlacementModifier.of(count), heightModifier);
    }
}