package cn.fandmc.datagen;

import cn.fandmc.block.ModBlocks;
import cn.fandmc.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.data.server.recipe.SingleItemRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public class VerticalSlabRecipeGenerator extends FabricRecipeProvider {
    public VerticalSlabRecipeGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        // 木质竖半砖配方
        createVerticalSlabRecipes(exporter, Blocks.OAK_PLANKS, ModBlocks.OAK_VERTICAL_SLAB, "oak");
        createVerticalSlabRecipes(exporter, Blocks.SPRUCE_PLANKS, ModBlocks.SPRUCE_VERTICAL_SLAB, "spruce");
        createVerticalSlabRecipes(exporter, Blocks.BIRCH_PLANKS, ModBlocks.BIRCH_VERTICAL_SLAB, "birch");
        createVerticalSlabRecipes(exporter, Blocks.JUNGLE_PLANKS, ModBlocks.JUNGLE_VERTICAL_SLAB, "jungle");
        createVerticalSlabRecipes(exporter, Blocks.ACACIA_PLANKS, ModBlocks.ACACIA_VERTICAL_SLAB, "acacia");
        createVerticalSlabRecipes(exporter, Blocks.DARK_OAK_PLANKS, ModBlocks.DARK_OAK_VERTICAL_SLAB, "dark_oak");
        createVerticalSlabRecipes(exporter, Blocks.MANGROVE_PLANKS, ModBlocks.MANGROVE_VERTICAL_SLAB, "mangrove");
        createVerticalSlabRecipes(exporter, Blocks.CRIMSON_PLANKS, ModBlocks.CRIMSON_VERTICAL_SLAB, "crimson");
        createVerticalSlabRecipes(exporter, Blocks.WARPED_PLANKS, ModBlocks.WARPED_VERTICAL_SLAB, "warped");
        
        // 石质竖半砖配方
        createVerticalSlabRecipes(exporter, Blocks.STONE, ModBlocks.STONE_VERTICAL_SLAB, "stone");
        createVerticalSlabRecipes(exporter, Blocks.COBBLESTONE, ModBlocks.COBBLESTONE_VERTICAL_SLAB, "cobblestone");
        createVerticalSlabRecipes(exporter, Blocks.MOSSY_COBBLESTONE, ModBlocks.MOSSY_COBBLESTONE_VERTICAL_SLAB, "mossy_cobblestone");
        createVerticalSlabRecipes(exporter, Blocks.SMOOTH_STONE, ModBlocks.SMOOTH_STONE_VERTICAL_SLAB, "smooth_stone");
        createVerticalSlabRecipes(exporter, Blocks.STONE_BRICKS, ModBlocks.STONE_BRICK_VERTICAL_SLAB, "stone_brick");
        createVerticalSlabRecipes(exporter, Blocks.MOSSY_STONE_BRICKS, ModBlocks.MOSSY_STONE_BRICK_VERTICAL_SLAB, "mossy_stone_brick");
        createVerticalSlabRecipes(exporter, Blocks.GRANITE, ModBlocks.GRANITE_VERTICAL_SLAB, "granite");
        createVerticalSlabRecipes(exporter, Blocks.POLISHED_GRANITE, ModBlocks.POLISHED_GRANITE_VERTICAL_SLAB, "polished_granite");
        createVerticalSlabRecipes(exporter, Blocks.DIORITE, ModBlocks.DIORITE_VERTICAL_SLAB, "diorite");
        createVerticalSlabRecipes(exporter, Blocks.POLISHED_DIORITE, ModBlocks.POLISHED_DIORITE_VERTICAL_SLAB, "polished_diorite");
        createVerticalSlabRecipes(exporter, Blocks.ANDESITE, ModBlocks.ANDESITE_VERTICAL_SLAB, "andesite");
        createVerticalSlabRecipes(exporter, Blocks.POLISHED_ANDESITE, ModBlocks.POLISHED_ANDESITE_VERTICAL_SLAB, "polished_andesite");
        createVerticalSlabRecipes(exporter, Blocks.DEEPSLATE, ModBlocks.DEEPSLATE_VERTICAL_SLAB, "deepslate");
        createVerticalSlabRecipes(exporter, Blocks.COBBLED_DEEPSLATE, ModBlocks.COBBLED_DEEPSLATE_VERTICAL_SLAB, "cobbled_deepslate");
        createVerticalSlabRecipes(exporter, Blocks.POLISHED_DEEPSLATE, ModBlocks.POLISHED_DEEPSLATE_VERTICAL_SLAB, "polished_deepslate");
        createVerticalSlabRecipes(exporter, Blocks.DEEPSLATE_BRICKS, ModBlocks.DEEPSLATE_BRICK_VERTICAL_SLAB, "deepslate_brick");
        createVerticalSlabRecipes(exporter, Blocks.DEEPSLATE_TILES, ModBlocks.DEEPSLATE_TILE_VERTICAL_SLAB, "deepslate_tile");
        createVerticalSlabRecipes(exporter, Blocks.CUT_SANDSTONE, ModBlocks.CUT_SANDSTONE_VERTICAL_SLAB, "cut_sandstone");
        createVerticalSlabRecipes(exporter, Blocks.SMOOTH_RED_SANDSTONE, ModBlocks.SMOOTH_RED_SANDSTONE_VERTICAL_SLAB, "smooth_red_sandstone");
        createVerticalSlabRecipes(exporter, Blocks.CUT_RED_SANDSTONE, ModBlocks.CUT_RED_SANDSTONE_VERTICAL_SLAB, "cut_red_sandstone");
        createVerticalSlabRecipes(exporter, Blocks.BRICKS, ModBlocks.BRICK_VERTICAL_SLAB, "brick");
        createVerticalSlabRecipes(exporter, Blocks.NETHER_BRICKS, ModBlocks.NETHER_BRICK_VERTICAL_SLAB, "nether_brick");
        createVerticalSlabRecipes(exporter, Blocks.RED_NETHER_BRICKS, ModBlocks.RED_NETHER_BRICK_VERTICAL_SLAB, "red_nether_brick");
        createVerticalSlabRecipes(exporter, Blocks.BLACKSTONE, ModBlocks.BLACKSTONE_VERTICAL_SLAB, "blackstone");
        createVerticalSlabRecipes(exporter, Blocks.POLISHED_BLACKSTONE, ModBlocks.POLISHED_BLACKSTONE_VERTICAL_SLAB, "polished_blackstone");
        createVerticalSlabRecipes(exporter, Blocks.POLISHED_BLACKSTONE_BRICKS, ModBlocks.POLISHED_BLACKSTONE_BRICK_VERTICAL_SLAB, "polished_blackstone_brick");
        createVerticalSlabRecipes(exporter, Blocks.END_STONE_BRICKS, ModBlocks.END_STONE_BRICK_VERTICAL_SLAB, "end_stone_brick");
        createVerticalSlabRecipes(exporter, Blocks.PRISMARINE, ModBlocks.PRISMARINE_VERTICAL_SLAB, "prismarine");
        createVerticalSlabRecipes(exporter, Blocks.PRISMARINE_BRICKS, ModBlocks.PRISMARINE_BRICK_VERTICAL_SLAB, "prismarine_brick");
        createVerticalSlabRecipes(exporter, Blocks.DARK_PRISMARINE, ModBlocks.DARK_PRISMARINE_VERTICAL_SLAB, "dark_prismarine");
        createVerticalSlabRecipes(exporter, Blocks.PURPUR_BLOCK, ModBlocks.PURPUR_VERTICAL_SLAB, "purpur");
        createVerticalSlabRecipes(exporter, Blocks.QUARTZ_BLOCK, ModBlocks.QUARTZ_VERTICAL_SLAB, "quartz");
        createVerticalSlabRecipes(exporter, Blocks.SMOOTH_QUARTZ, ModBlocks.SMOOTH_QUARTZ_VERTICAL_SLAB, "smooth_quartz");
        
        // 铜制竖半砖配方
        createVerticalSlabRecipes(exporter, Blocks.CUT_COPPER, ModBlocks.CUT_COPPER_VERTICAL_SLAB, "cut_copper");
        createVerticalSlabRecipes(exporter, Blocks.EXPOSED_CUT_COPPER, ModBlocks.EXPOSED_CUT_COPPER_VERTICAL_SLAB, "exposed_cut_copper");
        createVerticalSlabRecipes(exporter, Blocks.WEATHERED_CUT_COPPER, ModBlocks.WEATHERED_CUT_COPPER_VERTICAL_SLAB, "weathered_cut_copper");
        createVerticalSlabRecipes(exporter, Blocks.OXIDIZED_CUT_COPPER, ModBlocks.OXIDIZED_CUT_COPPER_VERTICAL_SLAB, "oxidized_cut_copper");
        createVerticalSlabRecipes(exporter, Blocks.WAXED_CUT_COPPER, ModBlocks.WAXED_CUT_COPPER_VERTICAL_SLAB, "waxed_cut_copper");
        createVerticalSlabRecipes(exporter, Blocks.WAXED_EXPOSED_CUT_COPPER, ModBlocks.WAXED_EXPOSED_CUT_COPPER_VERTICAL_SLAB, "waxed_exposed_cut_copper");
        createVerticalSlabRecipes(exporter, Blocks.WAXED_WEATHERED_CUT_COPPER, ModBlocks.WAXED_WEATHERED_CUT_COPPER_VERTICAL_SLAB, "waxed_weathered_cut_copper");
        createVerticalSlabRecipes(exporter, Blocks.WAXED_OXIDIZED_CUT_COPPER, ModBlocks.WAXED_OXIDIZED_CUT_COPPER_VERTICAL_SLAB, "waxed_oxidized_cut_copper");
        
        // 彩色红石灯配方
        createColoredRedstoneLampRecipes(exporter);
        
        // 生成铜质导线配方
        createCopperWireRecipe(exporter);
        
        // 生成防爆玻璃配方
        createBlastProofGlassRecipe(exporter);
        
        // 生成铝锭熔炉配方
        createAluminumIngotRecipe(exporter);
        
        // 生成锡锭熔炉配方
        createTinIngotRecipe(exporter);
        
        // 创建硅锭配方
        createSiliconIngotRecipe(exporter);
        
        // 创建铜锭配方
        createCopperIngotRecipe(exporter);
        
        // 创建金属块配方
        createMetalBlockRecipes(exporter);
    }
    
    private void createVerticalSlabRecipes(Consumer<RecipeJsonProvider> exporter, ItemConvertible input, Block output, String name) {
        // 工作台配方 - 竖着的3个方块
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 6)
            .pattern("#")
            .pattern("#")
            .pattern("#")
            .input('#', input)
            .criterion(hasItem(input), conditionsFromItem(input))
            .offerTo(exporter, getRecipeName(output));
        
        // 切石机配方
        SingleItemRecipeJsonBuilder.createStonecutting(
            net.minecraft.recipe.Ingredient.ofItems(input), 
            RecipeCategory.BUILDING_BLOCKS, 
            output, 
            2
        )
        .criterion(hasItem(input), conditionsFromItem(input))
        .offerTo(exporter, getRecipeName(output) + "_from_" + name + "_stonecutting");
    }
    
    private void createColoredRedstoneLampRecipes(Consumer<RecipeJsonProvider> exporter) {
        // 白色红石灯 - 使用骨粉
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.WHITE_REDSTONE_LAMP, 1)
            .pattern("#D#")
            .pattern("DRD")
            .pattern("#D#")
            .input('#', Blocks.REDSTONE_TORCH)
            .input('D', Items.BONE_MEAL)
            .input('R', Blocks.REDSTONE_LAMP)
            .criterion(hasItem(Blocks.REDSTONE_LAMP), conditionsFromItem(Blocks.REDSTONE_LAMP))
            .offerTo(exporter);
            
        // 橙色红石灯 - 使用橙色染料
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.ORANGE_REDSTONE_LAMP, 1)
            .pattern("#D#")
            .pattern("DRD")
            .pattern("#D#")
            .input('#', Blocks.REDSTONE_TORCH)
            .input('D', Items.ORANGE_DYE)
            .input('R', Blocks.REDSTONE_LAMP)
            .criterion(hasItem(Blocks.REDSTONE_LAMP), conditionsFromItem(Blocks.REDSTONE_LAMP))
            .offerTo(exporter);
            
        // 粉红色红石灯 - 使用粉红色染料
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.PINK_REDSTONE_LAMP, 1)
            .pattern("#D#")
            .pattern("DRD")
            .pattern("#D#")
            .input('#', Blocks.REDSTONE_TORCH)
            .input('D', Items.PINK_DYE)
            .input('R', Blocks.REDSTONE_LAMP)
            .criterion(hasItem(Blocks.REDSTONE_LAMP), conditionsFromItem(Blocks.REDSTONE_LAMP))
            .offerTo(exporter);
            
        // 黄色红石灯 - 使用黄色染料
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.YELLOW_REDSTONE_LAMP, 1)
            .pattern("#D#")
            .pattern("DRD")
            .pattern("#D#")
            .input('#', Blocks.REDSTONE_TORCH)
            .input('D', Items.YELLOW_DYE)
            .input('R', Blocks.REDSTONE_LAMP)
            .criterion(hasItem(Blocks.REDSTONE_LAMP), conditionsFromItem(Blocks.REDSTONE_LAMP))
            .offerTo(exporter);
            
        // 红色红石灯 - 使用红色染料
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.RED_REDSTONE_LAMP, 1)
            .pattern("#D#")
            .pattern("DRD")
            .pattern("#D#")
            .input('#', Blocks.REDSTONE_TORCH)
            .input('D', Items.RED_DYE)
            .input('R', Blocks.REDSTONE_LAMP)
            .criterion(hasItem(Blocks.REDSTONE_LAMP), conditionsFromItem(Blocks.REDSTONE_LAMP))
            .offerTo(exporter);
            
        // 紫色红石灯 - 使用紫色染料
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.PURPLE_REDSTONE_LAMP, 1)
            .pattern("#D#")
            .pattern("DRD")
            .pattern("#D#")
            .input('#', Blocks.REDSTONE_TORCH)
            .input('D', Items.PURPLE_DYE)
            .input('R', Blocks.REDSTONE_LAMP)
            .criterion(hasItem(Blocks.REDSTONE_LAMP), conditionsFromItem(Blocks.REDSTONE_LAMP))
            .offerTo(exporter);
            
        // 蓝色红石灯 - 使用蓝色染料
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.BLUE_REDSTONE_LAMP, 1)
            .pattern("#D#")
            .pattern("DRD")
            .pattern("#D#")
            .input('#', Blocks.REDSTONE_TORCH)
            .input('D', Items.BLUE_DYE)
            .input('R', Blocks.REDSTONE_LAMP)
            .criterion(hasItem(Blocks.REDSTONE_LAMP), conditionsFromItem(Blocks.REDSTONE_LAMP))
            .offerTo(exporter);
            
        // 绿色红石灯 - 使用绿色染料
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.GREEN_REDSTONE_LAMP, 1)
            .pattern("#D#")
            .pattern("DRD")
            .pattern("#D#")
            .input('#', Blocks.REDSTONE_TORCH)
            .input('D', Items.GREEN_DYE)
            .input('R', Blocks.REDSTONE_LAMP)
            .criterion(hasItem(Blocks.REDSTONE_LAMP), conditionsFromItem(Blocks.REDSTONE_LAMP))
            .offerTo(exporter);
            
        // 黑色红石灯 - 使用墨囊
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.BLACK_REDSTONE_LAMP, 1)
            .pattern("#D#")
            .pattern("DRD")
            .pattern("#D#")
            .input('#', Blocks.REDSTONE_TORCH)
            .input('D', Items.INK_SAC)
            .input('R', Blocks.REDSTONE_LAMP)
            .criterion(hasItem(Blocks.REDSTONE_LAMP), conditionsFromItem(Blocks.REDSTONE_LAMP))
            .offerTo(exporter);
    }
    
    private void createCopperWireRecipe(Consumer<RecipeJsonProvider> exporter) {
        // 铜质导线配方 - 3个铜锭横向排列
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.COPPER_WIRE, 8)
            .pattern("###")
            .input('#', Items.COPPER_INGOT)
            .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
            .offerTo(exporter, getRecipeName(ModItems.COPPER_WIRE));
    }
    
    private void createBlastProofGlassRecipe(Consumer<RecipeJsonProvider> exporter) {
        // 防爆玻璃配方 - 四周8个普通玻璃，中间1个黑曜石，合成8个防爆玻璃
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLAST_PROOF_GLASS, 8)
            .pattern("###")
            .pattern("#O#")
            .pattern("###")
            .input('#', Blocks.GLASS)
            .input('O', Blocks.OBSIDIAN)
            .criterion(hasItem(Blocks.GLASS), conditionsFromItem(Blocks.GLASS))
            .criterion(hasItem(Blocks.OBSIDIAN), conditionsFromItem(Blocks.OBSIDIAN))
            .offerTo(exporter, getRecipeName(ModBlocks.BLAST_PROOF_GLASS));
    }
    
    private void createAluminumIngotRecipe(Consumer<RecipeJsonProvider> exporter) {
        // 熔炉配方 - 铝矿石烧制成铝锭
        offerSmelting(exporter, 
            java.util.List.of(ModBlocks.ALUMINUM_ORE), 
            RecipeCategory.MISC, 
            ModItems.ALUMINUM_INGOT, 
            0.7f, 
            200, 
            "aluminum_ingot");
        
        // 高炉配方 - 铝矿石烧制成铝锭（更快）
        offerBlasting(exporter, 
            java.util.List.of(ModBlocks.ALUMINUM_ORE), 
            RecipeCategory.MISC, 
            ModItems.ALUMINUM_INGOT, 
            0.7f, 
            100, 
            "aluminum_ingot");
    }
    
    private void createTinIngotRecipe(Consumer<RecipeJsonProvider> exporter) {
        // 熔炉配方 - 锡矿石烧制成锡锭
        offerSmelting(exporter, 
            java.util.List.of(ModBlocks.TIN_ORE), 
            RecipeCategory.MISC, 
            ModItems.TIN_INGOT, 
            0.7f, 
            200, 
            "tin_ingot");
        
        // 高炉配方 - 锡矿石烧制成锡锭（更快）
        offerBlasting(exporter, 
            java.util.List.of(ModBlocks.TIN_ORE), 
            RecipeCategory.MISC, 
            ModItems.TIN_INGOT, 
            0.7f, 
            100, 
            "tin_ingot");
    }
    
    private void createSiliconIngotRecipe(Consumer<RecipeJsonProvider> exporter) {
        // 熔炉配方 - 硅矿石烧制成原硅
        offerSmelting(exporter, 
            java.util.List.of(ModBlocks.SILICON_ORE), 
            RecipeCategory.MISC, 
            ModItems.RAW_SILICON, 
            0.7f, 
            200, 
            "raw_silicon");
        
        // 高炉配方 - 硅矿石烧制成原硅（更快）
        offerBlasting(exporter, 
            java.util.List.of(ModBlocks.SILICON_ORE), 
            RecipeCategory.MISC, 
            ModItems.RAW_SILICON, 
            0.7f, 
            100, 
            "raw_silicon");
            
        // 熔炉配方 - 原硅烧制成硅锭
        offerSmelting(exporter, 
            java.util.List.of(ModItems.RAW_SILICON), 
            RecipeCategory.MISC, 
            ModItems.SILICON_INGOT, 
            0.7f, 
            200, 
            "silicon_ingot");
        
        // 高炉配方 - 原硅烧制成硅锭（更快）
        offerBlasting(exporter, 
            java.util.List.of(ModItems.RAW_SILICON), 
            RecipeCategory.MISC, 
            ModItems.SILICON_INGOT, 
            0.7f, 
            100, 
            "silicon_ingot");
    }
    
    private void createCopperIngotRecipe(Consumer<RecipeJsonProvider> exporter) {
        // 熔炉配方 - 铜矿石烧制成铜锭
        offerSmelting(exporter, 
            java.util.List.of(ModBlocks.COPPER_ORE), 
            RecipeCategory.MISC, 
            ModItems.COPPER_INGOT, 
            0.7f, 
            200, 
            "copper_ingot_from_ore");
        
        // 高炉配方 - 铜矿石烧制成铜锭（更快）
        offerBlasting(exporter, 
            java.util.List.of(ModBlocks.COPPER_ORE), 
            RecipeCategory.MISC, 
            ModItems.COPPER_INGOT, 
            0.7f, 
            100, 
            "copper_ingot_from_ore");
    }
    
    private void createMetalBlockRecipes(Consumer<RecipeJsonProvider> exporter) {
        // 铝块配方 - 9个铝锭合成1个铝块
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ALUMINUM_BLOCK)
            .pattern("AAA")
            .pattern("AAA")
            .pattern("AAA")
            .input('A', ModItems.ALUMINUM_INGOT)
            .criterion(hasItem(ModItems.ALUMINUM_INGOT), conditionsFromItem(ModItems.ALUMINUM_INGOT))
            .offerTo(exporter);
        
        // 铝块分解配方 - 1个铝块分解为9个铝锭
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ALUMINUM_INGOT, 9)
            .input(ModBlocks.ALUMINUM_BLOCK)
            .criterion(hasItem(ModBlocks.ALUMINUM_BLOCK), conditionsFromItem(ModBlocks.ALUMINUM_BLOCK))
            .offerTo(exporter, "aluminum_ingot_from_block");
        
        // 铜块配方 - 9个铜锭合成1个铜块
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.COPPER_BLOCK)
            .pattern("CCC")
            .pattern("CCC")
            .pattern("CCC")
            .input('C', ModItems.COPPER_INGOT)
            .criterion(hasItem(ModItems.COPPER_INGOT), conditionsFromItem(ModItems.COPPER_INGOT))
            .offerTo(exporter);
        
        // 铜块分解配方 - 1个铜块分解为9个铜锭
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.COPPER_INGOT, 9)
            .input(ModBlocks.COPPER_BLOCK)
            .criterion(hasItem(ModBlocks.COPPER_BLOCK), conditionsFromItem(ModBlocks.COPPER_BLOCK))
            .offerTo(exporter, "copper_ingot_from_block");
        
        // 硅块配方 - 9个硅锭合成1个硅块
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SILICON_BLOCK)
            .pattern("SSS")
            .pattern("SSS")
            .pattern("SSS")
            .input('S', ModItems.SILICON_INGOT)
            .criterion(hasItem(ModItems.SILICON_INGOT), conditionsFromItem(ModItems.SILICON_INGOT))
            .offerTo(exporter);
        
        // 硅块分解配方 - 1个硅块分解为9个硅锭
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SILICON_INGOT, 9)
            .input(ModBlocks.SILICON_BLOCK)
            .criterion(hasItem(ModBlocks.SILICON_BLOCK), conditionsFromItem(ModBlocks.SILICON_BLOCK))
            .offerTo(exporter, "silicon_ingot_from_block");
        
        // 锡块配方 - 9个锡锭合成1个锡块
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TIN_BLOCK)
            .pattern("TTT")
            .pattern("TTT")
            .pattern("TTT")
            .input('T', ModItems.TIN_INGOT)
            .criterion(hasItem(ModItems.TIN_INGOT), conditionsFromItem(ModItems.TIN_INGOT))
            .offerTo(exporter);
        
        // 锡块分解配方 - 1个锡块分解为9个锡锭
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.TIN_INGOT, 9)
            .input(ModBlocks.TIN_BLOCK)
            .criterion(hasItem(ModBlocks.TIN_BLOCK), conditionsFromItem(ModBlocks.TIN_BLOCK))
            .offerTo(exporter, "tin_ingot_from_block");
    }
}