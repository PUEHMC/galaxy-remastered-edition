package cn.fandmc;

import cn.fandmc.block.ModBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class MainClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		// 设置防爆玻璃的渲染层为半透明
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BLAST_PROOF_GLASS, RenderLayer.getTranslucent());
	}
}