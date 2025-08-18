package cn.fandmc.block;

import cn.fandmc.Main;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    
    // 木质竖半砖
    public static final Block OAK_VERTICAL_SLAB = registerBlock("oak_vertical_slab",
            AbstractBlock.Settings.copy(Blocks.OAK_SLAB));
    public static final Block SPRUCE_VERTICAL_SLAB = registerBlock("spruce_vertical_slab",
            AbstractBlock.Settings.copy(Blocks.SPRUCE_SLAB));
    public static final Block BIRCH_VERTICAL_SLAB = registerBlock("birch_vertical_slab",
            AbstractBlock.Settings.copy(Blocks.BIRCH_SLAB));
    public static final Block JUNGLE_VERTICAL_SLAB = registerBlock("jungle_vertical_slab",
            AbstractBlock.Settings.copy(Blocks.JUNGLE_SLAB));
    public static final Block ACACIA_VERTICAL_SLAB = registerBlock("acacia_vertical_slab",
            AbstractBlock.Settings.copy(Blocks.ACACIA_SLAB));
    public static final Block DARK_OAK_VERTICAL_SLAB = registerBlock("dark_oak_vertical_slab",
            AbstractBlock.Settings.copy(Blocks.DARK_OAK_SLAB));
    public static final Block MANGROVE_VERTICAL_SLAB = registerBlock("mangrove_vertical_slab",
            AbstractBlock.Settings.copy(Blocks.MANGROVE_SLAB));
    public static final Block CRIMSON_VERTICAL_SLAB = registerBlock("crimson_vertical_slab",
            AbstractBlock.Settings.copy(Blocks.CRIMSON_SLAB));
    public static final Block WARPED_VERTICAL_SLAB = registerBlock("warped_vertical_slab",
            AbstractBlock.Settings.copy(Blocks.WARPED_SLAB));
    
    // 石质竖半砖
    public static final Block STONE_VERTICAL_SLAB = registerBlock("stone_vertical_slab",
            AbstractBlock.Settings.copy(Blocks.STONE_SLAB));
    public static final Block COBBLESTONE_VERTICAL_SLAB = registerBlock("cobblestone_vertical_slab",
            AbstractBlock.Settings.copy(Blocks.COBBLESTONE_SLAB));
    public static final Block MOSSY_COBBLESTONE_VERTICAL_SLAB = registerBlock("mossy_cobblestone_vertical_slab",
            AbstractBlock.Settings.copy(Blocks.MOSSY_COBBLESTONE_SLAB));
    public static final Block SMOOTH_STONE_VERTICAL_SLAB = registerBlock("smooth_stone_vertical_slab",
            AbstractBlock.Settings.copy(Blocks.SMOOTH_STONE_SLAB));
    public static final Block STONE_BRICK_VERTICAL_SLAB = registerBlock("stone_brick_vertical_slab",
            AbstractBlock.Settings.copy(Blocks.STONE_BRICK_SLAB));
    public static final Block MOSSY_STONE_BRICK_VERTICAL_SLAB = registerBlock("mossy_stone_brick_vertical_slab",
            AbstractBlock.Settings.copy(Blocks.MOSSY_STONE_BRICK_SLAB));
    public static final Block GRANITE_VERTICAL_SLAB = registerBlock("granite_vertical_slab",
            AbstractBlock.Settings.copy(Blocks.GRANITE_SLAB));
    public static final Block POLISHED_GRANITE_VERTICAL_SLAB = registerBlock("polished_granite_vertical_slab",
            AbstractBlock.Settings.copy(Blocks.POLISHED_GRANITE_SLAB));
    public static final Block DIORITE_VERTICAL_SLAB = registerBlock("diorite_vertical_slab",
            AbstractBlock.Settings.copy(Blocks.DIORITE_SLAB));
    public static final Block POLISHED_DIORITE_VERTICAL_SLAB = registerBlock("polished_diorite_vertical_slab",
            AbstractBlock.Settings.copy(Blocks.POLISHED_DIORITE_SLAB));
    public static final Block ANDESITE_VERTICAL_SLAB = registerBlock("andesite_vertical_slab",
            AbstractBlock.Settings.copy(Blocks.ANDESITE_SLAB));
    public static final Block POLISHED_ANDESITE_VERTICAL_SLAB = registerBlock("polished_andesite_vertical_slab",
            AbstractBlock.Settings.copy(Blocks.POLISHED_ANDESITE_SLAB));
    public static final Block DEEPSLATE_VERTICAL_SLAB = registerBlock("deepslate_vertical_slab",
            AbstractBlock.Settings.copy(Blocks.COBBLED_DEEPSLATE_SLAB));
    public static final Block COBBLED_DEEPSLATE_VERTICAL_SLAB = registerBlock("cobbled_deepslate_vertical_slab",
            AbstractBlock.Settings.copy(Blocks.COBBLED_DEEPSLATE_SLAB));
    public static final Block POLISHED_DEEPSLATE_VERTICAL_SLAB = registerBlock("polished_deepslate_vertical_slab",
            AbstractBlock.Settings.copy(Blocks.POLISHED_DEEPSLATE_SLAB));
    public static final Block DEEPSLATE_BRICK_VERTICAL_SLAB = registerBlock("deepslate_brick_vertical_slab",
            AbstractBlock.Settings.copy(Blocks.DEEPSLATE_BRICK_SLAB));
    public static final Block DEEPSLATE_TILE_VERTICAL_SLAB = registerBlock("deepslate_tile_vertical_slab",
            AbstractBlock.Settings.copy(Blocks.DEEPSLATE_TILE_SLAB));

    // 砂岩竖半砖
    public static final Block CUT_SANDSTONE_VERTICAL_SLAB = registerBlock("cut_sandstone_vertical_slab",
            AbstractBlock.Settings.copy(Blocks.CUT_SANDSTONE_SLAB));
    public static final Block SMOOTH_RED_SANDSTONE_VERTICAL_SLAB = registerBlock("smooth_red_sandstone_vertical_slab",
            AbstractBlock.Settings.copy(Blocks.SMOOTH_RED_SANDSTONE_SLAB));
    public static final Block CUT_RED_SANDSTONE_VERTICAL_SLAB = registerBlock("cut_red_sandstone_vertical_slab",
            AbstractBlock.Settings.copy(Blocks.CUT_RED_SANDSTONE_SLAB));
    
    // 砖块竖半砖
    public static final Block BRICK_VERTICAL_SLAB = registerBlock("brick_vertical_slab",
            AbstractBlock.Settings.copy(Blocks.BRICK_SLAB));
    
    // 下界竖半砖
    public static final Block NETHER_BRICK_VERTICAL_SLAB = registerBlock("nether_brick_vertical_slab",
            AbstractBlock.Settings.copy(Blocks.NETHER_BRICK_SLAB));
    public static final Block RED_NETHER_BRICK_VERTICAL_SLAB = registerBlock("red_nether_brick_vertical_slab",
            AbstractBlock.Settings.copy(Blocks.RED_NETHER_BRICK_SLAB));
    public static final Block BLACKSTONE_VERTICAL_SLAB = registerBlock("blackstone_vertical_slab",
            AbstractBlock.Settings.copy(Blocks.BLACKSTONE_SLAB));
    public static final Block POLISHED_BLACKSTONE_VERTICAL_SLAB = registerBlock("polished_blackstone_vertical_slab",
            AbstractBlock.Settings.copy(Blocks.POLISHED_BLACKSTONE_SLAB));
    public static final Block POLISHED_BLACKSTONE_BRICK_VERTICAL_SLAB = registerBlock("polished_blackstone_brick_vertical_slab",
            AbstractBlock.Settings.copy(Blocks.POLISHED_BLACKSTONE_BRICK_SLAB));
    
    // 末地竖半砖
    public static final Block END_STONE_BRICK_VERTICAL_SLAB = registerBlock("end_stone_brick_vertical_slab",
            AbstractBlock.Settings.copy(Blocks.END_STONE_BRICK_SLAB));
    
    // 海晶石竖半砖
    public static final Block PRISMARINE_VERTICAL_SLAB = registerBlock("prismarine_vertical_slab",
            AbstractBlock.Settings.copy(Blocks.PRISMARINE_SLAB));
    public static final Block PRISMARINE_BRICK_VERTICAL_SLAB = registerBlock("prismarine_brick_vertical_slab",
            AbstractBlock.Settings.copy(Blocks.PRISMARINE_BRICK_SLAB));
    public static final Block DARK_PRISMARINE_VERTICAL_SLAB = registerBlock("dark_prismarine_vertical_slab",
            AbstractBlock.Settings.copy(Blocks.DARK_PRISMARINE_SLAB));
    
    // 紫珀竖半砖
    public static final Block PURPUR_VERTICAL_SLAB = registerBlock("purpur_vertical_slab",
            AbstractBlock.Settings.copy(Blocks.PURPUR_SLAB));
    
    // 石英竖半砖
    public static final Block QUARTZ_VERTICAL_SLAB = registerBlock("quartz_vertical_slab",
            AbstractBlock.Settings.copy(Blocks.QUARTZ_SLAB));
    public static final Block SMOOTH_QUARTZ_VERTICAL_SLAB = registerBlock("smooth_quartz_vertical_slab",
            AbstractBlock.Settings.copy(Blocks.SMOOTH_QUARTZ_SLAB));
    
    // 铜竖半砖
    public static final Block CUT_COPPER_VERTICAL_SLAB = registerBlock("cut_copper_vertical_slab",
            AbstractBlock.Settings.copy(Blocks.CUT_COPPER_SLAB));
    public static final Block EXPOSED_CUT_COPPER_VERTICAL_SLAB = registerBlock("exposed_cut_copper_vertical_slab",
            AbstractBlock.Settings.copy(Blocks.EXPOSED_CUT_COPPER_SLAB));
    public static final Block WEATHERED_CUT_COPPER_VERTICAL_SLAB = registerBlock("weathered_cut_copper_vertical_slab",
            AbstractBlock.Settings.copy(Blocks.WEATHERED_CUT_COPPER_SLAB));
    public static final Block OXIDIZED_CUT_COPPER_VERTICAL_SLAB = registerBlock("oxidized_cut_copper_vertical_slab",
            AbstractBlock.Settings.copy(Blocks.OXIDIZED_CUT_COPPER_SLAB));
    public static final Block WAXED_CUT_COPPER_VERTICAL_SLAB = registerBlock("waxed_cut_copper_vertical_slab",
            AbstractBlock.Settings.copy(Blocks.WAXED_CUT_COPPER_SLAB));
    public static final Block WAXED_EXPOSED_CUT_COPPER_VERTICAL_SLAB = registerBlock("waxed_exposed_cut_copper_vertical_slab",
            AbstractBlock.Settings.copy(Blocks.WAXED_EXPOSED_CUT_COPPER_SLAB));
    public static final Block WAXED_WEATHERED_CUT_COPPER_VERTICAL_SLAB = registerBlock("waxed_weathered_cut_copper_vertical_slab",
            AbstractBlock.Settings.copy(Blocks.WAXED_WEATHERED_CUT_COPPER_SLAB));
    public static final Block WAXED_OXIDIZED_CUT_COPPER_VERTICAL_SLAB = registerBlock("waxed_oxidized_cut_copper_vertical_slab",
            AbstractBlock.Settings.copy(Blocks.WAXED_OXIDIZED_CUT_COPPER_SLAB));
    
    // 彩色红石灯
    public static final Block WHITE_REDSTONE_LAMP = registerColoredRedstoneLamp("white_redstone_lamp");
    public static final Block ORANGE_REDSTONE_LAMP = registerColoredRedstoneLamp("orange_redstone_lamp");
    public static final Block PINK_REDSTONE_LAMP = registerColoredRedstoneLamp("pink_redstone_lamp");
    public static final Block YELLOW_REDSTONE_LAMP = registerColoredRedstoneLamp("yellow_redstone_lamp");
    public static final Block RED_REDSTONE_LAMP = registerColoredRedstoneLamp("red_redstone_lamp");
    public static final Block PURPLE_REDSTONE_LAMP = registerColoredRedstoneLamp("purple_redstone_lamp");
    public static final Block BLUE_REDSTONE_LAMP = registerColoredRedstoneLamp("blue_redstone_lamp");
    public static final Block GREEN_REDSTONE_LAMP = registerColoredRedstoneLamp("green_redstone_lamp");
    public static final Block BLACK_REDSTONE_LAMP = registerColoredRedstoneLamp("black_redstone_lamp");
    
    // 防爆玻璃
    public static final Block BLAST_PROOF_GLASS = registerBlock("blast_proof_glass",
            new BlastProofGlassBlock(AbstractBlock.Settings.copy(Blocks.GLASS).resistance(1200.0f).hardness(5.0f)));
    
    // 铝矿石
    public static final Block ALUMINUM_ORE = registerBlock("aluminum_ore",
            new Block(AbstractBlock.Settings.copy(Blocks.IRON_ORE)));
    
    // 锡矿石
    public static final Block TIN_ORE = registerBlock("tin_ore",
            new Block(AbstractBlock.Settings.copy(Blocks.IRON_ORE)));
    
    // 硅矿石
    public static final Block SILICON_ORE = registerBlock("silicon_ore",
            new Block(AbstractBlock.Settings.copy(Blocks.IRON_ORE)));
    
    // 铜矿石
    public static final Block COPPER_ORE = registerBlock("copper_ore",
            new Block(AbstractBlock.Settings.copy(Blocks.COPPER_ORE)));
    
    // 金属块
    public static final Block ALUMINUM_BLOCK = registerBlock("aluminum_block",
            new Block(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK)));
    public static final Block COPPER_BLOCK = registerBlock("copper_block",
            new Block(AbstractBlock.Settings.copy(Blocks.COPPER_BLOCK)));
    public static final Block SILICON_BLOCK = registerBlock("silicon_block",
            new Block(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK)));
    public static final Block TIN_BLOCK = registerBlock("tin_block",
            new Block(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK)));
    public static final Block METEORIC_IRON_BLOCK = registerBlock("meteoric_iron_block",
            new Block(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK)));
    
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, name), block);
    }
    
    private static Block registerBlock(String name, AbstractBlock.Settings settings) {
        Block block = new VerticalSlabBlock(settings);
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, name), block);
    }
    
    private static Block registerColoredRedstoneLamp(String name) {
        Block block = new ColoredRedstoneLampBlock(AbstractBlock.Settings.copy(Blocks.REDSTONE_LAMP));
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, name), block);
    }
    
    private static void registerBlockItem(String name, Block block) {
        BlockItem blockItem = new BlockItem(block, new Item.Settings());
        Registry.register(Registries.ITEM, new Identifier(Main.MOD_ID, name), blockItem);
    }
    
    public static void registerModBlocks() {
        Main.LOGGER.info("正在注册 " + Main.MOD_ID + " 的方块");
    }
}