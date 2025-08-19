package cn.fandmc.screen;

import cn.fandmc.Main;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class CircuitFabricatorScreen extends HandledScreen<CircuitFabricatorScreenHandler> {
    private static final Identifier TEXTURE = new Identifier(Main.MOD_ID, "textures/gui/circuit_fabricator.png");
    
    public CircuitFabricatorScreen(CircuitFabricatorScreenHandler handler, PlayerInventory inventory, Text title) {
        super(handler, inventory, title);
        this.backgroundHeight = 192; // 根据用户提供的信息，主UI高度为192
        this.backgroundWidth = 176;  // 根据用户提供的信息，主UI宽度为176
        this.playerInventoryTitleY = this.backgroundHeight - 82; // 调整玩家背包标题位置，匹配新的背包位置
    }
    
    @Override
    protected void init() {
        super.init();
        // 根据用户提供的信息调整GUI位置
        // 主UI区域位于左上角，尺寸为176x192
        this.titleX = (this.backgroundWidth - this.textRenderer.getWidth(this.title)) / 2;
    }
    
    @Override
    protected void drawBackground(DrawContext context, float delta, int mouseX, int mouseY) {
        int x = (width - backgroundWidth) / 2;
        int y = (height - backgroundHeight) / 2;
        context.drawTexture(TEXTURE, x, y, 0, 0, backgroundWidth, backgroundHeight);
    }
    
    @Override
    public void render(DrawContext context, int mouseX, int mouseY, float delta) {
        renderBackground(context);
        super.render(context, mouseX, mouseY, delta);
        drawMouseoverTooltip(context, mouseX, mouseY);
    }
}