package cn.fandmc.item;

import cn.fandmc.Main;
import cn.fandmc.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItems {
    // 竖半砖物品组
    public static final ItemGroup VERTICAL_SLABS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Main.MOD_ID, "vertical_slabs"),
            FabricItemGroup.builder()
                    .displayName(Text.translatable("itemgroup.galaxy-remastered-edition.vertical_slabs"))
                    .icon(() -> new ItemStack(ModBlocks.OAK_VERTICAL_SLAB))
                    .entries((displayContext, entries) -> {
                        // 木质竖半砖
                        entries.add(ModBlocks.OAK_VERTICAL_SLAB);
                        entries.add(ModBlocks.SPRUCE_VERTICAL_SLAB);
                        entries.add(ModBlocks.BIRCH_VERTICAL_SLAB);
                        entries.add(ModBlocks.JUNGLE_VERTICAL_SLAB);
                        entries.add(ModBlocks.ACACIA_VERTICAL_SLAB);
                        entries.add(ModBlocks.DARK_OAK_VERTICAL_SLAB);
                        entries.add(ModBlocks.MANGROVE_VERTICAL_SLAB);
                        entries.add(ModBlocks.CRIMSON_VERTICAL_SLAB);
                        entries.add(ModBlocks.WARPED_VERTICAL_SLAB);
                        
                        // 石质竖半砖
                        entries.add(ModBlocks.STONE_VERTICAL_SLAB);
                        entries.add(ModBlocks.COBBLESTONE_VERTICAL_SLAB);
                        entries.add(ModBlocks.MOSSY_COBBLESTONE_VERTICAL_SLAB);
                        entries.add(ModBlocks.SMOOTH_STONE_VERTICAL_SLAB);
                        entries.add(ModBlocks.STONE_BRICK_VERTICAL_SLAB);
                        entries.add(ModBlocks.MOSSY_STONE_BRICK_VERTICAL_SLAB);
                        entries.add(ModBlocks.GRANITE_VERTICAL_SLAB);
                        entries.add(ModBlocks.POLISHED_GRANITE_VERTICAL_SLAB);
                        entries.add(ModBlocks.DIORITE_VERTICAL_SLAB);
                        entries.add(ModBlocks.POLISHED_DIORITE_VERTICAL_SLAB);
                        entries.add(ModBlocks.ANDESITE_VERTICAL_SLAB);
                        entries.add(ModBlocks.POLISHED_ANDESITE_VERTICAL_SLAB);
                        entries.add(ModBlocks.DEEPSLATE_VERTICAL_SLAB);
                        entries.add(ModBlocks.COBBLED_DEEPSLATE_VERTICAL_SLAB);
                        entries.add(ModBlocks.POLISHED_DEEPSLATE_VERTICAL_SLAB);
                        entries.add(ModBlocks.DEEPSLATE_BRICK_VERTICAL_SLAB);
                        entries.add(ModBlocks.DEEPSLATE_TILE_VERTICAL_SLAB);
                        
                        // 砂岩竖半砖
                        entries.add(ModBlocks.CUT_SANDSTONE_VERTICAL_SLAB);
                        entries.add(ModBlocks.SMOOTH_RED_SANDSTONE_VERTICAL_SLAB);
                        entries.add(ModBlocks.CUT_RED_SANDSTONE_VERTICAL_SLAB);
                        
                        // 砖块竖半砖
                        entries.add(ModBlocks.BRICK_VERTICAL_SLAB);
                        
                        // 下界竖半砖
                        entries.add(ModBlocks.NETHER_BRICK_VERTICAL_SLAB);
                        entries.add(ModBlocks.RED_NETHER_BRICK_VERTICAL_SLAB);
                        entries.add(ModBlocks.BLACKSTONE_VERTICAL_SLAB);
                        entries.add(ModBlocks.POLISHED_BLACKSTONE_VERTICAL_SLAB);
                        entries.add(ModBlocks.POLISHED_BLACKSTONE_BRICK_VERTICAL_SLAB);
                        
                        // 末地竖半砖
                        entries.add(ModBlocks.END_STONE_BRICK_VERTICAL_SLAB);
                        
                        // 海晶石竖半砖
                        entries.add(ModBlocks.PRISMARINE_VERTICAL_SLAB);
                        entries.add(ModBlocks.PRISMARINE_BRICK_VERTICAL_SLAB);
                        entries.add(ModBlocks.DARK_PRISMARINE_VERTICAL_SLAB);
                        
                        // 紫珀竖半砖
                        entries.add(ModBlocks.PURPUR_VERTICAL_SLAB);
                        
                        // 石英竖半砖
                        entries.add(ModBlocks.QUARTZ_VERTICAL_SLAB);
                        entries.add(ModBlocks.SMOOTH_QUARTZ_VERTICAL_SLAB);
                        
                        // 铜竖半砖
                        entries.add(ModBlocks.CUT_COPPER_VERTICAL_SLAB);
                        entries.add(ModBlocks.EXPOSED_CUT_COPPER_VERTICAL_SLAB);
                        entries.add(ModBlocks.WEATHERED_CUT_COPPER_VERTICAL_SLAB);
                        entries.add(ModBlocks.OXIDIZED_CUT_COPPER_VERTICAL_SLAB);
                        entries.add(ModBlocks.WAXED_CUT_COPPER_VERTICAL_SLAB);
                        entries.add(ModBlocks.WAXED_EXPOSED_CUT_COPPER_VERTICAL_SLAB);
                        entries.add(ModBlocks.WAXED_WEATHERED_CUT_COPPER_VERTICAL_SLAB);
                        entries.add(ModBlocks.WAXED_OXIDIZED_CUT_COPPER_VERTICAL_SLAB);
                    })
                    .build());
    
    // 彩色红石灯物品组
    public static final ItemGroup COLORED_REDSTONE_LAMPS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Main.MOD_ID, "colored_redstone_lamps"),
            FabricItemGroup.builder()
                    .displayName(Text.translatable("itemgroup.galaxy-remastered-edition.colored_redstone_lamps"))
                    .icon(() -> new ItemStack(ModBlocks.RED_REDSTONE_LAMP))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.WHITE_REDSTONE_LAMP);
                        entries.add(ModBlocks.ORANGE_REDSTONE_LAMP);
                        entries.add(ModBlocks.PINK_REDSTONE_LAMP);
                        entries.add(ModBlocks.YELLOW_REDSTONE_LAMP);
                        entries.add(ModBlocks.RED_REDSTONE_LAMP);
                        entries.add(ModBlocks.PURPLE_REDSTONE_LAMP);
                        entries.add(ModBlocks.BLUE_REDSTONE_LAMP);
                        entries.add(ModBlocks.GREEN_REDSTONE_LAMP);
                        entries.add(ModBlocks.BLACK_REDSTONE_LAMP);
                    })
                    .build());
    
    public static void registerModItems() {
        Main.LOGGER.info("正在注册 " + Main.MOD_ID + " 的物品");
    }
}