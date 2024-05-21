package net.lapisu.xianxiamod;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.lapisu.xianxiamod.block.ModBlocks;
import net.lapisu.xianxiamod.client.gui.StatsScreenHandler;
import net.lapisu.xianxiamod.item.ModItems;
import net.lapisu.xianxiamod.item.ModItemsGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.resource.featuretoggle.FeatureFlags;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class XianXiaMod implements ModInitializer {
	public static final String MOD_ID = "xianxia-mod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static final Identifier STATS_SCREEN_ID = new Identifier(MOD_ID, "statsscreen");
	public static final ScreenHandlerType<StatsScreenHandler> STATS_SCREEN_HANDLER= new ScreenHandlerType<>(StatsScreenHandler::new, FeatureFlags.VANILLA_FEATURES);


	@Override
	public void onInitialize() {

		Registry.register(Registries.SCREEN_HANDLER, STATS_SCREEN_ID,STATS_SCREEN_HANDLER);
		ModItemsGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}