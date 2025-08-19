package cn.fandmc;

import cn.fandmc.block.ModBlocks;
import cn.fandmc.event.KeyInputHandler;
import cn.fandmc.keybinding.ModKeyBindings;
import cn.fandmc.screen.CircuitFabricatorScreen;
import cn.fandmc.screen.ModScreenHandlers;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.client.render.RenderLayer;

public class MainClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		// 设置防爆玻璃的渲染层为半透明
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BLAST_PROOF_GLASS, RenderLayer.getTranslucent());
		
		// 注册按键绑定
		ModKeyBindings.registerKeyBindings();
		
		// 注册按键事件处理器
		KeyInputHandler.registerKeyInputs();
		
		// 注册GUI屏幕
		HandledScreens.register(ModScreenHandlers.CIRCUIT_FABRICATOR_SCREEN_HANDLER, CircuitFabricatorScreen::new);
	}
}