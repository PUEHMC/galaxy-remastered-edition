package cn.fandmc;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

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
	}


}
