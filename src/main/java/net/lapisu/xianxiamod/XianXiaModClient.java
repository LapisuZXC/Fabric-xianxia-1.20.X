package net.lapisu.xianxiamod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.fabricmc.loader.api.FabricLoader;
import net.lapisu.xianxiamod.client.gui.StatsScreen;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import net.minecraft.entity.player.PlayerEntity;
import org.lwjgl.glfw.GLFW;

@Environment(EnvType.CLIENT)
public class XianXiaModClient implements ClientModInitializer {
    public static final PlayerEntity PLAYER = MinecraftClient.getInstance().player;

    private static KeyBinding openStatsScreenKey;

    @Override
    public void onInitializeClient() {
        openStatsScreenKey = KeyBindingHelper.registerKeyBinding(new KeyBinding(
                "key.xianxiamod.open_stats_screen",
                InputUtil.Type.KEYSYM,
                GLFW.GLFW_KEY_O, // You can choose any key you prefer
                "category.xianxiamod"
        ));

        // Register a tick event to check for key presses

        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            while (openStatsScreenKey.wasPressed()) {
                if (client.player != null) {
                    client.setScreen(new StatsScreen());
                }
            }
        });
    }
}
