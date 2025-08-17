package cn.fandmc;

import cn.fandmc.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class VerticalSlabTagGenerator extends FabricTagProvider.BlockTagProvider {
    public VerticalSlabTagGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        // 木质竖半砖 - 斧头挖掘
        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
            .add(ModBlocks.OAK_VERTICAL_SLAB)
            .add(ModBlocks.SPRUCE_VERTICAL_SLAB)
            .add(ModBlocks.BIRCH_VERTICAL_SLAB)
            .add(ModBlocks.JUNGLE_VERTICAL_SLAB)
            .add(ModBlocks.ACACIA_VERTICAL_SLAB)
            .add(ModBlocks.DARK_OAK_VERTICAL_SLAB)
            .add(ModBlocks.MANGROVE_VERTICAL_SLAB)
            .add(ModBlocks.CRIMSON_VERTICAL_SLAB)
            .add(ModBlocks.WARPED_VERTICAL_SLAB);
        
        // 石质竖半砖 - 镐子挖掘
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
            .add(ModBlocks.STONE_VERTICAL_SLAB)
            .add(ModBlocks.COBBLESTONE_VERTICAL_SLAB)
            .add(ModBlocks.MOSSY_COBBLESTONE_VERTICAL_SLAB)
            .add(ModBlocks.SMOOTH_STONE_VERTICAL_SLAB)
            .add(ModBlocks.STONE_BRICK_VERTICAL_SLAB)
            .add(ModBlocks.MOSSY_STONE_BRICK_VERTICAL_SLAB)
            .add(ModBlocks.GRANITE_VERTICAL_SLAB)
            .add(ModBlocks.POLISHED_GRANITE_VERTICAL_SLAB)
            .add(ModBlocks.DIORITE_VERTICAL_SLAB)
            .add(ModBlocks.POLISHED_DIORITE_VERTICAL_SLAB)
            .add(ModBlocks.ANDESITE_VERTICAL_SLAB)
            .add(ModBlocks.POLISHED_ANDESITE_VERTICAL_SLAB)
            .add(ModBlocks.DEEPSLATE_VERTICAL_SLAB)
            .add(ModBlocks.COBBLED_DEEPSLATE_VERTICAL_SLAB)
            .add(ModBlocks.POLISHED_DEEPSLATE_VERTICAL_SLAB)
            .add(ModBlocks.DEEPSLATE_BRICK_VERTICAL_SLAB)
            .add(ModBlocks.DEEPSLATE_TILE_VERTICAL_SLAB)
            .add(ModBlocks.CUT_SANDSTONE_VERTICAL_SLAB)
            .add(ModBlocks.SMOOTH_RED_SANDSTONE_VERTICAL_SLAB)
            .add(ModBlocks.CUT_RED_SANDSTONE_VERTICAL_SLAB)
            .add(ModBlocks.BRICK_VERTICAL_SLAB)
            .add(ModBlocks.NETHER_BRICK_VERTICAL_SLAB)
            .add(ModBlocks.RED_NETHER_BRICK_VERTICAL_SLAB)
            .add(ModBlocks.BLACKSTONE_VERTICAL_SLAB)
            .add(ModBlocks.POLISHED_BLACKSTONE_VERTICAL_SLAB)
            .add(ModBlocks.POLISHED_BLACKSTONE_BRICK_VERTICAL_SLAB)
            .add(ModBlocks.END_STONE_BRICK_VERTICAL_SLAB)
            .add(ModBlocks.PRISMARINE_VERTICAL_SLAB)
            .add(ModBlocks.PRISMARINE_BRICK_VERTICAL_SLAB)
            .add(ModBlocks.DARK_PRISMARINE_VERTICAL_SLAB)
            .add(ModBlocks.PURPUR_VERTICAL_SLAB)
            .add(ModBlocks.QUARTZ_VERTICAL_SLAB)
            .add(ModBlocks.SMOOTH_QUARTZ_VERTICAL_SLAB)
            .add(ModBlocks.CUT_COPPER_VERTICAL_SLAB)
            .add(ModBlocks.EXPOSED_CUT_COPPER_VERTICAL_SLAB)
            .add(ModBlocks.WEATHERED_CUT_COPPER_VERTICAL_SLAB)
            .add(ModBlocks.OXIDIZED_CUT_COPPER_VERTICAL_SLAB)
            .add(ModBlocks.WAXED_CUT_COPPER_VERTICAL_SLAB)
            .add(ModBlocks.WAXED_EXPOSED_CUT_COPPER_VERTICAL_SLAB)
            .add(ModBlocks.WAXED_WEATHERED_CUT_COPPER_VERTICAL_SLAB)
            .add(ModBlocks.WAXED_OXIDIZED_CUT_COPPER_VERTICAL_SLAB);
        
        // 添加到半砖标签
        getOrCreateTagBuilder(BlockTags.SLABS)
            .add(ModBlocks.OAK_VERTICAL_SLAB)
            .add(ModBlocks.SPRUCE_VERTICAL_SLAB)
            .add(ModBlocks.BIRCH_VERTICAL_SLAB)
            .add(ModBlocks.JUNGLE_VERTICAL_SLAB)
            .add(ModBlocks.ACACIA_VERTICAL_SLAB)
            .add(ModBlocks.DARK_OAK_VERTICAL_SLAB)
            .add(ModBlocks.MANGROVE_VERTICAL_SLAB)
            .add(ModBlocks.CRIMSON_VERTICAL_SLAB)
            .add(ModBlocks.WARPED_VERTICAL_SLAB)
            .add(ModBlocks.STONE_VERTICAL_SLAB)
            .add(ModBlocks.COBBLESTONE_VERTICAL_SLAB)
            .add(ModBlocks.MOSSY_COBBLESTONE_VERTICAL_SLAB)
            .add(ModBlocks.SMOOTH_STONE_VERTICAL_SLAB)
            .add(ModBlocks.STONE_BRICK_VERTICAL_SLAB)
            .add(ModBlocks.MOSSY_STONE_BRICK_VERTICAL_SLAB)
            .add(ModBlocks.GRANITE_VERTICAL_SLAB)
            .add(ModBlocks.POLISHED_GRANITE_VERTICAL_SLAB)
            .add(ModBlocks.DIORITE_VERTICAL_SLAB)
            .add(ModBlocks.POLISHED_DIORITE_VERTICAL_SLAB)
            .add(ModBlocks.ANDESITE_VERTICAL_SLAB)
            .add(ModBlocks.POLISHED_ANDESITE_VERTICAL_SLAB)
            .add(ModBlocks.DEEPSLATE_VERTICAL_SLAB)
            .add(ModBlocks.COBBLED_DEEPSLATE_VERTICAL_SLAB)
            .add(ModBlocks.POLISHED_DEEPSLATE_VERTICAL_SLAB)
            .add(ModBlocks.DEEPSLATE_BRICK_VERTICAL_SLAB)
            .add(ModBlocks.DEEPSLATE_TILE_VERTICAL_SLAB)
            .add(ModBlocks.CUT_SANDSTONE_VERTICAL_SLAB)
            .add(ModBlocks.SMOOTH_RED_SANDSTONE_VERTICAL_SLAB)
            .add(ModBlocks.CUT_RED_SANDSTONE_VERTICAL_SLAB)
            .add(ModBlocks.BRICK_VERTICAL_SLAB)
            .add(ModBlocks.NETHER_BRICK_VERTICAL_SLAB)
            .add(ModBlocks.RED_NETHER_BRICK_VERTICAL_SLAB)
            .add(ModBlocks.BLACKSTONE_VERTICAL_SLAB)
            .add(ModBlocks.POLISHED_BLACKSTONE_VERTICAL_SLAB)
            .add(ModBlocks.POLISHED_BLACKSTONE_BRICK_VERTICAL_SLAB)
            .add(ModBlocks.END_STONE_BRICK_VERTICAL_SLAB)
            .add(ModBlocks.PRISMARINE_VERTICAL_SLAB)
            .add(ModBlocks.PRISMARINE_BRICK_VERTICAL_SLAB)
            .add(ModBlocks.DARK_PRISMARINE_VERTICAL_SLAB)
            .add(ModBlocks.PURPUR_VERTICAL_SLAB)
            .add(ModBlocks.QUARTZ_VERTICAL_SLAB)
            .add(ModBlocks.SMOOTH_QUARTZ_VERTICAL_SLAB)
            .add(ModBlocks.CUT_COPPER_VERTICAL_SLAB)
            .add(ModBlocks.EXPOSED_CUT_COPPER_VERTICAL_SLAB)
            .add(ModBlocks.WEATHERED_CUT_COPPER_VERTICAL_SLAB)
            .add(ModBlocks.OXIDIZED_CUT_COPPER_VERTICAL_SLAB)
            .add(ModBlocks.WAXED_CUT_COPPER_VERTICAL_SLAB)
            .add(ModBlocks.WAXED_EXPOSED_CUT_COPPER_VERTICAL_SLAB)
            .add(ModBlocks.WAXED_WEATHERED_CUT_COPPER_VERTICAL_SLAB)
            .add(ModBlocks.WAXED_OXIDIZED_CUT_COPPER_VERTICAL_SLAB);
    }
}