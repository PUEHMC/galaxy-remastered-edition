package cn.fandmc.blockentity;

import cn.fandmc.Main;
import cn.fandmc.block.ModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlockEntities {
    public static final BlockEntityType<CircuitFabricatorBlockEntity> CIRCUIT_FABRICATOR_BLOCK_ENTITY =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(Main.MOD_ID, "circuit_fabricator_block_entity"),
                    FabricBlockEntityTypeBuilder.create(CircuitFabricatorBlockEntity::new,
                            ModBlocks.CIRCUIT_FABRICATOR).build());
    
    public static void registerBlockEntities() {
        Main.LOGGER.info("正在注册 " + Main.MOD_ID + " 的方块实体");
    }
}