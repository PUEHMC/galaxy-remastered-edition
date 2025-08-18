package cn.fandmc.datagen;

import cn.fandmc.block.ModBlocks;
import cn.fandmc.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class VerticalSlabLootTableGenerator extends FabricBlockLootTableProvider {
    public VerticalSlabLootTableGenerator(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        // 木质竖半砖 - 使用斧头挖掘
        addDrop(ModBlocks.OAK_VERTICAL_SLAB, slabDrops(ModBlocks.OAK_VERTICAL_SLAB));
        addDrop(ModBlocks.SPRUCE_VERTICAL_SLAB, slabDrops(ModBlocks.SPRUCE_VERTICAL_SLAB));
        addDrop(ModBlocks.BIRCH_VERTICAL_SLAB, slabDrops(ModBlocks.BIRCH_VERTICAL_SLAB));
        addDrop(ModBlocks.JUNGLE_VERTICAL_SLAB, slabDrops(ModBlocks.JUNGLE_VERTICAL_SLAB));
        addDrop(ModBlocks.ACACIA_VERTICAL_SLAB, slabDrops(ModBlocks.ACACIA_VERTICAL_SLAB));
        addDrop(ModBlocks.DARK_OAK_VERTICAL_SLAB, slabDrops(ModBlocks.DARK_OAK_VERTICAL_SLAB));
        addDrop(ModBlocks.MANGROVE_VERTICAL_SLAB, slabDrops(ModBlocks.MANGROVE_VERTICAL_SLAB));
        addDrop(ModBlocks.CRIMSON_VERTICAL_SLAB, slabDrops(ModBlocks.CRIMSON_VERTICAL_SLAB));
        addDrop(ModBlocks.WARPED_VERTICAL_SLAB, slabDrops(ModBlocks.WARPED_VERTICAL_SLAB));
        
        // 石质竖半砖 - 使用镐子挖掘
        addDrop(ModBlocks.STONE_VERTICAL_SLAB, slabDrops(ModBlocks.STONE_VERTICAL_SLAB));
        addDrop(ModBlocks.COBBLESTONE_VERTICAL_SLAB, slabDrops(ModBlocks.COBBLESTONE_VERTICAL_SLAB));
        addDrop(ModBlocks.MOSSY_COBBLESTONE_VERTICAL_SLAB, slabDrops(ModBlocks.MOSSY_COBBLESTONE_VERTICAL_SLAB));
        addDrop(ModBlocks.SMOOTH_STONE_VERTICAL_SLAB, slabDrops(ModBlocks.SMOOTH_STONE_VERTICAL_SLAB));
        addDrop(ModBlocks.STONE_BRICK_VERTICAL_SLAB, slabDrops(ModBlocks.STONE_BRICK_VERTICAL_SLAB));
        addDrop(ModBlocks.MOSSY_STONE_BRICK_VERTICAL_SLAB, slabDrops(ModBlocks.MOSSY_STONE_BRICK_VERTICAL_SLAB));
        addDrop(ModBlocks.GRANITE_VERTICAL_SLAB, slabDrops(ModBlocks.GRANITE_VERTICAL_SLAB));
        addDrop(ModBlocks.POLISHED_GRANITE_VERTICAL_SLAB, slabDrops(ModBlocks.POLISHED_GRANITE_VERTICAL_SLAB));
        addDrop(ModBlocks.DIORITE_VERTICAL_SLAB, slabDrops(ModBlocks.DIORITE_VERTICAL_SLAB));
        addDrop(ModBlocks.POLISHED_DIORITE_VERTICAL_SLAB, slabDrops(ModBlocks.POLISHED_DIORITE_VERTICAL_SLAB));
        addDrop(ModBlocks.ANDESITE_VERTICAL_SLAB, slabDrops(ModBlocks.ANDESITE_VERTICAL_SLAB));
        addDrop(ModBlocks.POLISHED_ANDESITE_VERTICAL_SLAB, slabDrops(ModBlocks.POLISHED_ANDESITE_VERTICAL_SLAB));
        addDrop(ModBlocks.DEEPSLATE_VERTICAL_SLAB, slabDrops(ModBlocks.DEEPSLATE_VERTICAL_SLAB));
        addDrop(ModBlocks.COBBLED_DEEPSLATE_VERTICAL_SLAB, slabDrops(ModBlocks.COBBLED_DEEPSLATE_VERTICAL_SLAB));
        addDrop(ModBlocks.POLISHED_DEEPSLATE_VERTICAL_SLAB, slabDrops(ModBlocks.POLISHED_DEEPSLATE_VERTICAL_SLAB));
        addDrop(ModBlocks.DEEPSLATE_BRICK_VERTICAL_SLAB, slabDrops(ModBlocks.DEEPSLATE_BRICK_VERTICAL_SLAB));
        addDrop(ModBlocks.DEEPSLATE_TILE_VERTICAL_SLAB, slabDrops(ModBlocks.DEEPSLATE_TILE_VERTICAL_SLAB));
        
        // 砂岩竖半砖
        addDrop(ModBlocks.CUT_SANDSTONE_VERTICAL_SLAB, slabDrops(ModBlocks.CUT_SANDSTONE_VERTICAL_SLAB));
        addDrop(ModBlocks.SMOOTH_RED_SANDSTONE_VERTICAL_SLAB, slabDrops(ModBlocks.SMOOTH_RED_SANDSTONE_VERTICAL_SLAB));
        addDrop(ModBlocks.CUT_RED_SANDSTONE_VERTICAL_SLAB, slabDrops(ModBlocks.CUT_RED_SANDSTONE_VERTICAL_SLAB));
        
        // 砖块竖半砖
        addDrop(ModBlocks.BRICK_VERTICAL_SLAB, slabDrops(ModBlocks.BRICK_VERTICAL_SLAB));
        
        // 下界竖半砖
        addDrop(ModBlocks.NETHER_BRICK_VERTICAL_SLAB, slabDrops(ModBlocks.NETHER_BRICK_VERTICAL_SLAB));
        addDrop(ModBlocks.RED_NETHER_BRICK_VERTICAL_SLAB, slabDrops(ModBlocks.RED_NETHER_BRICK_VERTICAL_SLAB));
        addDrop(ModBlocks.BLACKSTONE_VERTICAL_SLAB, slabDrops(ModBlocks.BLACKSTONE_VERTICAL_SLAB));
        addDrop(ModBlocks.POLISHED_BLACKSTONE_VERTICAL_SLAB, slabDrops(ModBlocks.POLISHED_BLACKSTONE_VERTICAL_SLAB));
        addDrop(ModBlocks.POLISHED_BLACKSTONE_BRICK_VERTICAL_SLAB, slabDrops(ModBlocks.POLISHED_BLACKSTONE_BRICK_VERTICAL_SLAB));
        
        // 末地竖半砖
        addDrop(ModBlocks.END_STONE_BRICK_VERTICAL_SLAB, slabDrops(ModBlocks.END_STONE_BRICK_VERTICAL_SLAB));
        
        // 海晶石竖半砖
        addDrop(ModBlocks.PRISMARINE_VERTICAL_SLAB, slabDrops(ModBlocks.PRISMARINE_VERTICAL_SLAB));
        addDrop(ModBlocks.PRISMARINE_BRICK_VERTICAL_SLAB, slabDrops(ModBlocks.PRISMARINE_BRICK_VERTICAL_SLAB));
        addDrop(ModBlocks.DARK_PRISMARINE_VERTICAL_SLAB, slabDrops(ModBlocks.DARK_PRISMARINE_VERTICAL_SLAB));
        
        // 紫珀竖半砖
        addDrop(ModBlocks.PURPUR_VERTICAL_SLAB, slabDrops(ModBlocks.PURPUR_VERTICAL_SLAB));
        
        // 石英竖半砖
        addDrop(ModBlocks.QUARTZ_VERTICAL_SLAB, slabDrops(ModBlocks.QUARTZ_VERTICAL_SLAB));
        addDrop(ModBlocks.SMOOTH_QUARTZ_VERTICAL_SLAB, slabDrops(ModBlocks.SMOOTH_QUARTZ_VERTICAL_SLAB));
        
        // 铜竖半砖
        addDrop(ModBlocks.CUT_COPPER_VERTICAL_SLAB, slabDrops(ModBlocks.CUT_COPPER_VERTICAL_SLAB));
        addDrop(ModBlocks.EXPOSED_CUT_COPPER_VERTICAL_SLAB, slabDrops(ModBlocks.EXPOSED_CUT_COPPER_VERTICAL_SLAB));
        addDrop(ModBlocks.WEATHERED_CUT_COPPER_VERTICAL_SLAB, slabDrops(ModBlocks.WEATHERED_CUT_COPPER_VERTICAL_SLAB));
        addDrop(ModBlocks.OXIDIZED_CUT_COPPER_VERTICAL_SLAB, slabDrops(ModBlocks.OXIDIZED_CUT_COPPER_VERTICAL_SLAB));
        addDrop(ModBlocks.WAXED_CUT_COPPER_VERTICAL_SLAB, slabDrops(ModBlocks.WAXED_CUT_COPPER_VERTICAL_SLAB));
        addDrop(ModBlocks.WAXED_EXPOSED_CUT_COPPER_VERTICAL_SLAB, slabDrops(ModBlocks.WAXED_EXPOSED_CUT_COPPER_VERTICAL_SLAB));
        addDrop(ModBlocks.WAXED_WEATHERED_CUT_COPPER_VERTICAL_SLAB, slabDrops(ModBlocks.WAXED_WEATHERED_CUT_COPPER_VERTICAL_SLAB));
        addDrop(ModBlocks.WAXED_OXIDIZED_CUT_COPPER_VERTICAL_SLAB, slabDrops(ModBlocks.WAXED_OXIDIZED_CUT_COPPER_VERTICAL_SLAB));
        
        // 彩色红石灯 - 掉落自身
        addDrop(ModBlocks.WHITE_REDSTONE_LAMP);
        addDrop(ModBlocks.ORANGE_REDSTONE_LAMP);
        addDrop(ModBlocks.PINK_REDSTONE_LAMP);
        addDrop(ModBlocks.YELLOW_REDSTONE_LAMP);
        addDrop(ModBlocks.RED_REDSTONE_LAMP);
        addDrop(ModBlocks.PURPLE_REDSTONE_LAMP);
        addDrop(ModBlocks.BLUE_REDSTONE_LAMP);
        addDrop(ModBlocks.GREEN_REDSTONE_LAMP);
        addDrop(ModBlocks.BLACK_REDSTONE_LAMP);
        
        // 防爆玻璃 - 掉落自身
        addDrop(ModBlocks.BLAST_PROOF_GLASS);
        
        // 铝矿石 - 掉落自身
        addDrop(ModBlocks.ALUMINUM_ORE);
        
        // 锡矿石 - 掉落自身
        addDrop(ModBlocks.TIN_ORE);
        
        // 硅矿石 - 掉落自身
        addDrop(ModBlocks.SILICON_ORE);
        
        // 铜矿石 - 掉落自身
        addDrop(ModBlocks.COPPER_ORE);
        
        // 金属块 - 掉落自身
        addDrop(ModBlocks.ALUMINUM_BLOCK);
        addDrop(ModBlocks.COPPER_BLOCK);
        addDrop(ModBlocks.SILICON_BLOCK);
        addDrop(ModBlocks.TIN_BLOCK);
        
        // 铝线 - 掉落自身
        addDrop(ModBlocks.ALUMINUM_WIRE);
    }
}