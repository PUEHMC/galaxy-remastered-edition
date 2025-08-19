package cn.fandmc;

import cn.fandmc.block.ModBlocks;
import cn.fandmc.blockentity.ModBlockEntities;
import cn.fandmc.item.ModItems;
import cn.fandmc.screen.ModScreenHandlers;
import cn.fandmc.worldgen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main implements ModInitializer {
	public static final String MOD_ID = "galaxy-remastered-edition";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		ModBlocks.registerModBlocks();
		ModItems.registerModItems();
		ModBlockEntities.registerBlockEntities();
		ModScreenHandlers.registerScreenHandlers();
		ModWorldGeneration.generateModWorldGen();

		LOGGER.info("Galaxy - Remastered Edition 模组已加载！");
	}
}