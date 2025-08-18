package cn.fandmc.datagen;

import cn.fandmc.block.ModBlocks;
import cn.fandmc.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Block;
import net.minecraft.data.client.*;
import net.minecraft.registry.Registries;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;
import net.minecraft.block.enums.SlabType;
import net.minecraft.data.client.TextureMap;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Supplier;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;

import java.util.HashMap;
import java.util.Map;

public class VerticalSlabDataGenerator {
	public static class VerticalSlabModelProvider extends FabricModelProvider {
		public VerticalSlabModelProvider(FabricDataOutput output) {
			super(output);
		}

		@Override
		public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
			// 定义所有竖半砖及其对应的纹理
			Map<Block, String> verticalSlabs = new HashMap<>();
			
			// 木质竖半砖
			verticalSlabs.put(ModBlocks.OAK_VERTICAL_SLAB, "minecraft:block/oak_planks");
			verticalSlabs.put(ModBlocks.SPRUCE_VERTICAL_SLAB, "minecraft:block/spruce_planks");
			verticalSlabs.put(ModBlocks.BIRCH_VERTICAL_SLAB, "minecraft:block/birch_planks");
			verticalSlabs.put(ModBlocks.JUNGLE_VERTICAL_SLAB, "minecraft:block/jungle_planks");
			verticalSlabs.put(ModBlocks.ACACIA_VERTICAL_SLAB, "minecraft:block/acacia_planks");
			verticalSlabs.put(ModBlocks.DARK_OAK_VERTICAL_SLAB, "minecraft:block/dark_oak_planks");
			verticalSlabs.put(ModBlocks.MANGROVE_VERTICAL_SLAB, "minecraft:block/mangrove_planks");
			verticalSlabs.put(ModBlocks.CRIMSON_VERTICAL_SLAB, "minecraft:block/crimson_planks");
			verticalSlabs.put(ModBlocks.WARPED_VERTICAL_SLAB, "minecraft:block/warped_planks");
			
			// 石质竖半砖
			verticalSlabs.put(ModBlocks.STONE_VERTICAL_SLAB, "minecraft:block/stone");
			verticalSlabs.put(ModBlocks.COBBLESTONE_VERTICAL_SLAB, "minecraft:block/cobblestone");
			verticalSlabs.put(ModBlocks.MOSSY_COBBLESTONE_VERTICAL_SLAB, "minecraft:block/mossy_cobblestone");
			verticalSlabs.put(ModBlocks.SMOOTH_STONE_VERTICAL_SLAB, "minecraft:block/smooth_stone");
			verticalSlabs.put(ModBlocks.STONE_BRICK_VERTICAL_SLAB, "minecraft:block/stone_bricks");
			verticalSlabs.put(ModBlocks.MOSSY_STONE_BRICK_VERTICAL_SLAB, "minecraft:block/mossy_stone_bricks");
			verticalSlabs.put(ModBlocks.GRANITE_VERTICAL_SLAB, "minecraft:block/granite");
			verticalSlabs.put(ModBlocks.POLISHED_GRANITE_VERTICAL_SLAB, "minecraft:block/polished_granite");
			verticalSlabs.put(ModBlocks.DIORITE_VERTICAL_SLAB, "minecraft:block/diorite");
			verticalSlabs.put(ModBlocks.POLISHED_DIORITE_VERTICAL_SLAB, "minecraft:block/polished_diorite");
			verticalSlabs.put(ModBlocks.ANDESITE_VERTICAL_SLAB, "minecraft:block/andesite");
			verticalSlabs.put(ModBlocks.POLISHED_ANDESITE_VERTICAL_SLAB, "minecraft:block/polished_andesite");
			verticalSlabs.put(ModBlocks.CUT_SANDSTONE_VERTICAL_SLAB, "minecraft:block/cut_sandstone");
			verticalSlabs.put(ModBlocks.SMOOTH_RED_SANDSTONE_VERTICAL_SLAB, "minecraft:block/red_sandstone_top");
			verticalSlabs.put(ModBlocks.CUT_RED_SANDSTONE_VERTICAL_SLAB, "minecraft:block/cut_red_sandstone");
			verticalSlabs.put(ModBlocks.BRICK_VERTICAL_SLAB, "minecraft:block/bricks");
			verticalSlabs.put(ModBlocks.PRISMARINE_VERTICAL_SLAB, "minecraft:block/prismarine");
			verticalSlabs.put(ModBlocks.PRISMARINE_BRICK_VERTICAL_SLAB, "minecraft:block/prismarine_bricks");
			verticalSlabs.put(ModBlocks.DARK_PRISMARINE_VERTICAL_SLAB, "minecraft:block/dark_prismarine");
			verticalSlabs.put(ModBlocks.NETHER_BRICK_VERTICAL_SLAB, "minecraft:block/nether_bricks");
			verticalSlabs.put(ModBlocks.RED_NETHER_BRICK_VERTICAL_SLAB, "minecraft:block/red_nether_bricks");
			verticalSlabs.put(ModBlocks.QUARTZ_VERTICAL_SLAB, "minecraft:block/quartz_block_side");
			verticalSlabs.put(ModBlocks.SMOOTH_QUARTZ_VERTICAL_SLAB, "minecraft:block/quartz_block_bottom");
			verticalSlabs.put(ModBlocks.PURPUR_VERTICAL_SLAB, "minecraft:block/purpur_block");
			verticalSlabs.put(ModBlocks.END_STONE_BRICK_VERTICAL_SLAB, "minecraft:block/end_stone_bricks");
			verticalSlabs.put(ModBlocks.BLACKSTONE_VERTICAL_SLAB, "minecraft:block/blackstone");
			verticalSlabs.put(ModBlocks.POLISHED_BLACKSTONE_VERTICAL_SLAB, "minecraft:block/polished_blackstone");
			verticalSlabs.put(ModBlocks.POLISHED_BLACKSTONE_BRICK_VERTICAL_SLAB, "minecraft:block/polished_blackstone_bricks");
			verticalSlabs.put(ModBlocks.CUT_COPPER_VERTICAL_SLAB, "minecraft:block/cut_copper");
			verticalSlabs.put(ModBlocks.EXPOSED_CUT_COPPER_VERTICAL_SLAB, "minecraft:block/exposed_cut_copper");
			verticalSlabs.put(ModBlocks.WEATHERED_CUT_COPPER_VERTICAL_SLAB, "minecraft:block/weathered_cut_copper");
			verticalSlabs.put(ModBlocks.OXIDIZED_CUT_COPPER_VERTICAL_SLAB, "minecraft:block/oxidized_cut_copper");
			verticalSlabs.put(ModBlocks.WAXED_CUT_COPPER_VERTICAL_SLAB, "minecraft:block/cut_copper");
			verticalSlabs.put(ModBlocks.WAXED_EXPOSED_CUT_COPPER_VERTICAL_SLAB, "minecraft:block/exposed_cut_copper");
			verticalSlabs.put(ModBlocks.WAXED_WEATHERED_CUT_COPPER_VERTICAL_SLAB, "minecraft:block/weathered_cut_copper");
			verticalSlabs.put(ModBlocks.WAXED_OXIDIZED_CUT_COPPER_VERTICAL_SLAB, "minecraft:block/oxidized_cut_copper");
			verticalSlabs.put(ModBlocks.DEEPSLATE_VERTICAL_SLAB, "minecraft:block/deepslate");
			verticalSlabs.put(ModBlocks.COBBLED_DEEPSLATE_VERTICAL_SLAB, "minecraft:block/cobbled_deepslate");
			verticalSlabs.put(ModBlocks.POLISHED_DEEPSLATE_VERTICAL_SLAB, "minecraft:block/polished_deepslate");
			verticalSlabs.put(ModBlocks.DEEPSLATE_BRICK_VERTICAL_SLAB, "minecraft:block/deepslate_bricks");
			verticalSlabs.put(ModBlocks.DEEPSLATE_TILE_VERTICAL_SLAB, "minecraft:block/deepslate_tiles");
			
			// 为每个竖半砖生成模型
			for (Map.Entry<Block, String> entry : verticalSlabs.entrySet()) {
				generateVerticalSlabModels(blockStateModelGenerator, entry.getKey(), entry.getValue());
			}
			
			// 生成彩色红石灯模型
            generateColoredRedstoneLamp(blockStateModelGenerator, ModBlocks.WHITE_REDSTONE_LAMP, "white");
            generateColoredRedstoneLamp(blockStateModelGenerator, ModBlocks.ORANGE_REDSTONE_LAMP, "orange");
            generateColoredRedstoneLamp(blockStateModelGenerator, ModBlocks.PINK_REDSTONE_LAMP, "pink");
            generateColoredRedstoneLamp(blockStateModelGenerator, ModBlocks.YELLOW_REDSTONE_LAMP, "yellow");
            generateColoredRedstoneLamp(blockStateModelGenerator, ModBlocks.RED_REDSTONE_LAMP, "red");
            generateColoredRedstoneLamp(blockStateModelGenerator, ModBlocks.PURPLE_REDSTONE_LAMP, "purple");
            generateColoredRedstoneLamp(blockStateModelGenerator, ModBlocks.BLUE_REDSTONE_LAMP, "blue");
            generateColoredRedstoneLamp(blockStateModelGenerator, ModBlocks.GREEN_REDSTONE_LAMP, "green");
            generateColoredRedstoneLamp(blockStateModelGenerator, ModBlocks.BLACK_REDSTONE_LAMP, "black");
            
            // 生成防爆玻璃模型
            blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLAST_PROOF_GLASS);
            
            // 生成铝矿石模型
            blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ALUMINUM_ORE);
            
            // 生成锡矿石模型
            blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TIN_ORE);
            
            // 生成硅矿石模型
            blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SILICON_ORE);
            
            // 生成铜矿石模型
            blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.COPPER_ORE);
            
            // 生成金属块模型
            blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ALUMINUM_BLOCK);
            blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.COPPER_BLOCK);
            blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SILICON_BLOCK);
            blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TIN_BLOCK);
            blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.METEORIC_IRON_BLOCK);
		}

		@Override
		public void generateItemModels(ItemModelGenerator itemModelGenerator) {
			// 物品模型会自动从方块模型继承
			
			// 生成铜质导线物品模型
            itemModelGenerator.register(ModItems.COPPER_WIRE, Models.GENERATED);
            
            // 生成铝锭物品模型
            itemModelGenerator.register(ModItems.ALUMINUM_INGOT, Models.GENERATED);
            
            // 生成铜锭物品模型
            itemModelGenerator.register(ModItems.COPPER_INGOT, Models.GENERATED);
            
            // 生成锡锭物品模型
            itemModelGenerator.register(ModItems.TIN_INGOT, Models.GENERATED);
            
            // 生成原硅物品模型
            itemModelGenerator.register(ModItems.SILICON_RAW, Models.GENERATED);
            
            // 生成原生陨铁物品模型
            itemModelGenerator.register(ModItems.RAW_METEORIC_IRON, Models.GENERATED);
            
            // 生成陨铁锭物品模型
            itemModelGenerator.register(ModItems.METEORIC_IRON_INGOT, Models.GENERATED);
		}
		
		private void generateVerticalSlabModels(BlockStateModelGenerator generator, Block block, String texture) {
			// 获取方块名称
			Identifier blockId = Registries.BLOCK.getId(block);
			String blockName = blockId.getPath();
			Identifier textureId = new Identifier(texture);
			
			// 创建纹理映射
			TextureMap verticalSlabTextureMap = new TextureMap()
				.put(TextureKey.BOTTOM, textureId)
				.put(TextureKey.TOP, textureId)
				.put(TextureKey.SIDE, textureId)
				.put(TextureKey.PARTICLE, textureId);
			
			TextureMap cubeAllTextureMap = new TextureMap()
				.put(TextureKey.ALL, textureId)
				.put(TextureKey.PARTICLE, textureId);
			
			// 定义自定义模型模板
			Model verticalSlabModel = new Model(Optional.of(new Identifier("galaxy-remastered-edition", "block/vertical_slab")), Optional.empty(), TextureKey.BOTTOM, TextureKey.TOP, TextureKey.SIDE, TextureKey.PARTICLE);
			Model verticalSlabTopModel = new Model(Optional.of(new Identifier("galaxy-remastered-edition", "block/vertical_slab_top")), Optional.empty(), TextureKey.BOTTOM, TextureKey.TOP, TextureKey.SIDE, TextureKey.PARTICLE);
			Model verticalSlabNorthModel = new Model(Optional.of(new Identifier("galaxy-remastered-edition", "block/vertical_slab_north")), Optional.empty(), TextureKey.BOTTOM, TextureKey.TOP, TextureKey.SIDE, TextureKey.PARTICLE);
			Model verticalSlabNorthTopModel = new Model(Optional.of(new Identifier("galaxy-remastered-edition", "block/vertical_slab_north_top")), Optional.empty(), TextureKey.BOTTOM, TextureKey.TOP, TextureKey.SIDE, TextureKey.PARTICLE);
			
			// 生成所有方向和类型的模型
			Identifier baseModel = new Identifier(blockId.getNamespace(), "block/" + blockName);
			Identifier northModel = new Identifier(blockId.getNamespace(), "block/" + blockName + "_north");
			Identifier northTopModel = new Identifier(blockId.getNamespace(), "block/" + blockName + "_north_top");
			Identifier southModel = new Identifier(blockId.getNamespace(), "block/" + blockName + "_south");
			Identifier southTopModel = new Identifier(blockId.getNamespace(), "block/" + blockName + "_south_top");
			Identifier eastModel = new Identifier(blockId.getNamespace(), "block/" + blockName + "_east");
			Identifier eastTopModel = new Identifier(blockId.getNamespace(), "block/" + blockName + "_east_top");
			Identifier westModel = new Identifier(blockId.getNamespace(), "block/" + blockName + "_west");
			Identifier westTopModel = new Identifier(blockId.getNamespace(), "block/" + blockName + "_west_top");
			Identifier doubleModel = new Identifier(blockId.getNamespace(), "block/" + blockName + "_double");
			
			// 模型文件
			// Base model - 基础模型（用于物品显示）
			createVerticalSlabModel(generator.modelCollector, baseModel, "galaxy-remastered-edition:block/vertical_slab", verticalSlabTextureMap, 0);
			
			// West facing - Y轴旋转270度
			createVerticalSlabModel(generator.modelCollector, westModel, "galaxy-remastered-edition:block/vertical_slab", verticalSlabTextureMap, 270);
			
			// West top - Y轴旋转270度
			createVerticalSlabModel(generator.modelCollector, westTopModel, "galaxy-remastered-edition:block/vertical_slab_top", verticalSlabTextureMap, 270);
			
			// North facing - 无旋转
			createVerticalSlabModel(generator.modelCollector, northModel, "galaxy-remastered-edition:block/vertical_slab_north_south", verticalSlabTextureMap, 0);
			
			// North top - 无旋转
			createVerticalSlabModel(generator.modelCollector, northTopModel, "galaxy-remastered-edition:block/vertical_slab_north_south_top", verticalSlabTextureMap, 0);
			
			// South facing - 无旋转
			createVerticalSlabModel(generator.modelCollector, southModel, "galaxy-remastered-edition:block/vertical_slab_north_south", verticalSlabTextureMap, 0);
			
			// South top - 无旋转
			createVerticalSlabModel(generator.modelCollector, southTopModel, "galaxy-remastered-edition:block/vertical_slab_north_south_top", verticalSlabTextureMap, 0);
			
			// East facing - Y轴旋转90度
			createVerticalSlabModel(generator.modelCollector, eastModel, "galaxy-remastered-edition:block/vertical_slab", verticalSlabTextureMap, 0);
			
			// East top - Y轴旋转90度
			createVerticalSlabModel(generator.modelCollector, eastTopModel, "galaxy-remastered-edition:block/vertical_slab_top", verticalSlabTextureMap, 0);
			
			// Double model (使用cube_all)
			Models.CUBE_ALL.upload(doubleModel, cubeAllTextureMap, generator.modelCollector);
			
			// 生成方块状态文件
			generator.blockStateCollector.accept(createVerticalSlabBlockState(block, baseModel, northModel, northTopModel, southModel, southTopModel, eastModel, eastTopModel, westModel, westTopModel, doubleModel));
			
			// 注册物品模型
			generator.registerParentedItemModel(block, baseModel);
		}
		
		// 创建带旋转参数的竖半砖模型
	private static void createVerticalSlabModel(BiConsumer<Identifier, Supplier<JsonElement>> modelCollector, 
											   Identifier modelId, String parentTemplate, 
											   TextureMap textureMap, int yRotation) {
		modelCollector.accept(modelId, () -> {
			JsonObject model = new JsonObject();
			model.addProperty("parent", parentTemplate);
			
			// 添加纹理
			JsonObject textures = new JsonObject();
			textures.addProperty("bottom", textureMap.getTexture(TextureKey.BOTTOM).toString());
			textures.addProperty("top", textureMap.getTexture(TextureKey.TOP).toString());
			textures.addProperty("side", textureMap.getTexture(TextureKey.SIDE).toString());
			textures.addProperty("particle", textureMap.getTexture(TextureKey.PARTICLE).toString());
			model.add("textures", textures);
			
			// 添加旋转参数（如果不为0）
			if (yRotation != 0) {
				model.addProperty("y", yRotation);
			}
			
			return model;
		});
	}
		
		private void generateColoredRedstoneLamp(BlockStateModelGenerator generator, net.minecraft.block.Block block, String color) {
			Identifier offTexture = new Identifier("galaxy-remastered-edition", "block/" + color + "_redstone_lamp_off");
			Identifier onTexture = new Identifier("galaxy-remastered-edition", "block/" + color + "_redstone_lamp_on");
			
			// 创建关闭状态的模型
			Identifier offModel = Models.CUBE_ALL.upload(
				ModelIds.getBlockModelId(block).withSuffixedPath("_off"),
				TextureMap.all(offTexture),
				generator.modelCollector
			);
			
			// 创建开启状态的模型
			Identifier onModel = Models.CUBE_ALL.upload(
				ModelIds.getBlockModelId(block).withSuffixedPath("_on"),
				TextureMap.all(onTexture),
				generator.modelCollector
			);
			
			// 生成方块状态
			generator.blockStateCollector.accept(
				VariantsBlockStateSupplier.create(block)
					.coordinate(BlockStateVariantMap.create(net.minecraft.state.property.Properties.LIT)
						.register(false, BlockStateVariant.create().put(VariantSettings.MODEL, offModel))
						.register(true, BlockStateVariant.create().put(VariantSettings.MODEL, onModel))
					)
			);
			
			// 注册物品模型（使用关闭状态的模型）
			generator.registerParentedItemModel(block, offModel);
		}
		
		private static BlockStateSupplier createVerticalSlabBlockState(Block block, Identifier baseModel, Identifier northModel, Identifier northTopModel, Identifier southModel, Identifier southTopModel, Identifier eastModel, Identifier eastTopModel, Identifier westModel, Identifier westTopModel, Identifier doubleModel) {
			return VariantsBlockStateSupplier.create(block)
				.coordinate(BlockStateVariantMap.create(Properties.HORIZONTAL_FACING, Properties.SLAB_TYPE, Properties.WATERLOGGED)
					// North
					.register(Direction.NORTH, SlabType.BOTTOM, false, BlockStateVariant.create().put(VariantSettings.MODEL, northModel))
					.register(Direction.NORTH, SlabType.BOTTOM, true, BlockStateVariant.create().put(VariantSettings.MODEL, northModel))
					.register(Direction.NORTH, SlabType.TOP, false, BlockStateVariant.create().put(VariantSettings.MODEL, northTopModel))
					.register(Direction.NORTH, SlabType.TOP, true, BlockStateVariant.create().put(VariantSettings.MODEL, northTopModel))
					// South
					.register(Direction.SOUTH, SlabType.BOTTOM, false, BlockStateVariant.create().put(VariantSettings.MODEL, southModel).put(VariantSettings.Y, VariantSettings.Rotation.R180))
					.register(Direction.SOUTH, SlabType.BOTTOM, true, BlockStateVariant.create().put(VariantSettings.MODEL, southModel).put(VariantSettings.Y, VariantSettings.Rotation.R180))
					.register(Direction.SOUTH, SlabType.TOP, false, BlockStateVariant.create().put(VariantSettings.MODEL, southTopModel).put(VariantSettings.Y, VariantSettings.Rotation.R180))
					.register(Direction.SOUTH, SlabType.TOP, true, BlockStateVariant.create().put(VariantSettings.MODEL, southTopModel).put(VariantSettings.Y, VariantSettings.Rotation.R180))
					// East
					.register(Direction.EAST, SlabType.BOTTOM, false, BlockStateVariant.create().put(VariantSettings.MODEL, eastModel).put(VariantSettings.Y, VariantSettings.Rotation.R180))
					.register(Direction.EAST, SlabType.BOTTOM, true, BlockStateVariant.create().put(VariantSettings.MODEL, eastModel).put(VariantSettings.Y, VariantSettings.Rotation.R180))
					.register(Direction.EAST, SlabType.TOP, false, BlockStateVariant.create().put(VariantSettings.MODEL, eastTopModel).put(VariantSettings.Y, VariantSettings.Rotation.R180))
					.register(Direction.EAST, SlabType.TOP, true, BlockStateVariant.create().put(VariantSettings.MODEL, eastTopModel).put(VariantSettings.Y, VariantSettings.Rotation.R180))
					// West
					.register(Direction.WEST, SlabType.BOTTOM, false, BlockStateVariant.create().put(VariantSettings.MODEL, westModel))
					.register(Direction.WEST, SlabType.BOTTOM, true, BlockStateVariant.create().put(VariantSettings.MODEL, westModel))
					.register(Direction.WEST, SlabType.TOP, false, BlockStateVariant.create().put(VariantSettings.MODEL, westTopModel))
					.register(Direction.WEST, SlabType.TOP, true, BlockStateVariant.create().put(VariantSettings.MODEL, westTopModel))
					// Double
					.register(Direction.NORTH, SlabType.DOUBLE, false, BlockStateVariant.create().put(VariantSettings.MODEL, doubleModel))
					.register(Direction.NORTH, SlabType.DOUBLE, true, BlockStateVariant.create().put(VariantSettings.MODEL, doubleModel))
					.register(Direction.SOUTH, SlabType.DOUBLE, false, BlockStateVariant.create().put(VariantSettings.MODEL, doubleModel))
					.register(Direction.SOUTH, SlabType.DOUBLE, true, BlockStateVariant.create().put(VariantSettings.MODEL, doubleModel))
					.register(Direction.EAST, SlabType.DOUBLE, false, BlockStateVariant.create().put(VariantSettings.MODEL, doubleModel))
					.register(Direction.EAST, SlabType.DOUBLE, true, BlockStateVariant.create().put(VariantSettings.MODEL, doubleModel))
					.register(Direction.WEST, SlabType.DOUBLE, false, BlockStateVariant.create().put(VariantSettings.MODEL, doubleModel))
					.register(Direction.WEST, SlabType.DOUBLE, true, BlockStateVariant.create().put(VariantSettings.MODEL, doubleModel)));
		}
	}
}