package cn.fandmc;

import cn.fandmc.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.SingleItemRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
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
}