package cn.fandmc.event;

import cn.fandmc.gui.StarMapScreen;
import cn.fandmc.keybinding.ModKeyBindings;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.minecraft.client.MinecraftClient;

public class KeyInputHandler {
    
    public static void registerKeyInputs() {
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            if (ModKeyBindings.openStarMapKey.wasPressed()) {
                client.setScreen(new StarMapScreen());
            }
        });
    }
}