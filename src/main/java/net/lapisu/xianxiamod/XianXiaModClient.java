package net.lapisu.xianxiamod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;
import net.lapisu.xianxiamod.client.gui.StatsScreen;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.client.network.ClientPlayerEntity;

public class XianXiaModClient implements ClientModInitializer {
    public static final PlayerEntity PLAYER = MinecraftClient.getInstance().player;
    public static final ClientPlayerEntity PLAYERENTITY = MinecraftClient.getInstance().player;
    @Override
    public void onInitializeClient() {
        ScreenRegistry.register(XianXiaMod.STATS_SCREEN_HANDLER, StatsScreen::new);
        


    }
}
