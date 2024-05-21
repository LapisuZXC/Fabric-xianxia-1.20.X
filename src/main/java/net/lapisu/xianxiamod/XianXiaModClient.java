package net.lapisu.xianxiamod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;
import net.lapisu.xianxiamod.client.gui.StatsScreen;

public class XianXiaModClient implements ClientModInitializer {


    @Override
    public void onInitializeClient() {
        ScreenRegistry.register(XianXiaMod.STATS_SCREEN_HANDLER, StatsScreen::new);

    }
}
