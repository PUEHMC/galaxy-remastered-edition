package cn.fandmc.gui;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.text.Text;

public class StarMapScreen extends Screen {
    private float scale = 1.0f;
    private float offsetX = 0.0f;
    private float offsetY = 0.0f;
    private boolean isDragging = false;
    private double lastMouseX = 0;
    private double lastMouseY = 0;
    
    public StarMapScreen() {
        super(Text.translatable("gui.galaxy-remastered-edition.star_map"));
    }
    
    @Override
    protected void init() {
        super.init();
    }
    
    @Override
    public void render(DrawContext context, int mouseX, int mouseY, float delta) {
        // 渲染背景
        this.renderBackground(context);
        
        // 获取屏幕尺寸
        int screenWidth = this.width;
        int screenHeight = this.height;
        
        // 绘制外层边框 (#646464, 14px)
        context.fill(0, 0, screenWidth, 14, 0xFF646464); // 上边框
        context.fill(0, screenHeight - 14, screenWidth, screenHeight, 0xFF646464); // 下边框
        context.fill(0, 14, 14, screenHeight - 14, 0xFF646464); // 左边框
        context.fill(screenWidth - 14, 14, screenWidth, screenHeight - 14, 0xFF646464); // 右边框
        
        // 绘制内层边框 (#505050, 3px)
        context.fill(14, 14, screenWidth - 14, 17, 0xFF505050); // 上边框
        context.fill(14, screenHeight - 17, screenWidth - 14, screenHeight - 14, 0xFF505050); // 下边框
        context.fill(14, 17, 17, screenHeight - 17, 0xFF505050); // 左边框
        context.fill(screenWidth - 17, 17, screenWidth - 14, screenHeight - 17, 0xFF505050); // 右边框
        
        // 填充内部区域为黑色
        context.fill(17, 17, screenWidth - 17, screenHeight - 17, 0xFF000000);
    
        
        super.render(context, mouseX, mouseY, delta);
    }
    
    @Override
    public boolean shouldPause() {
        return false;
    }
    
    @Override
    public boolean keyPressed(int keyCode, int scanCode, int modifiers) {
        if (super.keyPressed(keyCode, scanCode, modifiers)) {
            return true;
        }
        
        // ESC键关闭界面
        if (keyCode == 256) { // GLFW.GLFW_KEY_ESCAPE
            this.close();
            return true;
        }
        
        return false;
    }
  
    @Override
    public boolean mouseScrolled(double mouseX, double mouseY, double amount) {
        // 缩放功能
        float oldScale = scale;
        scale += amount * 0.1f;
        scale = Math.max(0.1f, Math.min(5.0f, scale)); // 限制缩放范围
        
        // 调整偏移以保持鼠标位置为缩放中心
        if (scale != oldScale) {
            float scaleChange = scale / oldScale;
            offsetX = (float)(offsetX + (mouseX - offsetX) * (1 - scaleChange));
            offsetY = (float)(offsetY + (mouseY - offsetY) * (1 - scaleChange));
        }
        
        return true;
    }
    
    @Override
    public boolean mouseDragged(double mouseX, double mouseY, int button, double deltaX, double deltaY) {
        // 拖拽功能
        if (button == 0) { // 左键拖拽
            offsetX += deltaX;
            offsetY += deltaY;
            return true;
        }
        return super.mouseDragged(mouseX, mouseY, button, deltaX, deltaY);
    }
    
    @Override
    public boolean mouseClicked(double mouseX, double mouseY, int button) {
        if (button == 0) {
            isDragging = true;
            lastMouseX = mouseX;
            lastMouseY = mouseY;
        }
        return super.mouseClicked(mouseX, mouseY, button);
    }
    
    @Override
    public boolean mouseReleased(double mouseX, double mouseY, int button) {
        if (button == 0) {
            isDragging = false;
        }
        return super.mouseReleased(mouseX, mouseY, button);
    }
}