package cn.fandmc.keybinding;

import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import org.lwjgl.glfw.GLFW;

public class ModKeyBindings {
    public static final String KEY_CATEGORY_GALAXY = "key.category.galaxy-remastered-edition.galaxy";
    public static final String KEY_OPEN_STAR_MAP = "key.galaxy-remastered-edition.open_star_map";
    
    public static KeyBinding openStarMapKey;
    
    public static void registerKeyBindings() {
        openStarMapKey = KeyBindingHelper.registerKeyBinding(new KeyBinding(
                KEY_OPEN_STAR_MAP,
                InputUtil.Type.KEYSYM,
                GLFW.GLFW_KEY_M,
                KEY_CATEGORY_GALAXY
        ));
    }
}