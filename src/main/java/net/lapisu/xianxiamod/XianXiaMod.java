package net.lapisu.xianxiamod;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.lapisu.xianxiamod.block.ModBlocks;
import net.lapisu.xianxiamod.client.gui.StatsScreenHandler;
import net.lapisu.xianxiamod.item.ModItems;
import net.lapisu.xianxiamod.item.ModItemsGroups;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class XianXiaMod implements ModInitializer {
	public static final String MOD_ID = "xianxia-mod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static final Identifier STATS_SCREEN_ID = new Identifier(MOD_ID, "stats_screen");
	public static ScreenHandlerType<StatsScreenHandler> STATS_SCREEN_HANDLER_TYPE;

	@Override
	public void onInitialize() {
		STATS_SCREEN_HANDLER_TYPE = ScreenHandlerRegistry.registerSimple(STATS_SCREEN_ID, StatsScreenHandler::new);
		ModItemsGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}