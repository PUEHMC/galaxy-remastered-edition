package cn.fandmc.screen;

import cn.fandmc.Main;
import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;

public class ModScreenHandlers {
    public static final ScreenHandlerType<CircuitFabricatorScreenHandler> CIRCUIT_FABRICATOR_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, new Identifier(Main.MOD_ID, "circuit_fabricator"),
                    new ScreenHandlerType<CircuitFabricatorScreenHandler>(CircuitFabricatorScreenHandler::new, null));
    
    public static void registerScreenHandlers() {
        Main.LOGGER.info("正在注册 " + Main.MOD_ID + " 的屏幕处理器");
    }
}