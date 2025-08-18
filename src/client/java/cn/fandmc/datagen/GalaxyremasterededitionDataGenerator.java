package cn.fandmc.datagen;

import cn.fandmc.worldgen.ModConfiguredFeatures;
import cn.fandmc.worldgen.ModPlacedFeatures;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;

public class GalaxyremasterededitionDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
		// 注册竖半砖数据生成器
		pack.addProvider(VerticalSlabDataGenerator.VerticalSlabModelProvider::new);
		// 注册竖半砖 loot table 数据生成器
		pack.addProvider(VerticalSlabLootTableGenerator::new);
		// 注册竖半砖标签数据生成器
		pack.addProvider(VerticalSlabTagGenerator::new);
		// 注册竖半砖配方数据生成器
        pack.addProvider(VerticalSlabRecipeGenerator::new);
        // 注册世界生成数据生成器
        pack.addProvider(ModWorldGenProvider::new);
	}

	@Override
	public void buildRegistry(RegistryBuilder registryBuilder) {
		registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, ModConfiguredFeatures::bootstrap);
		registryBuilder.addRegistry(RegistryKeys.PLACED_FEATURE, ModPlacedFeatures::bootstrap);
	}
}
