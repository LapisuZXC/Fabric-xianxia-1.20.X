package net.lapisu.xianxiamod;

import net.fabricmc.api.ModInitializer;

import net.lapisu.xianxiamod.block.ModBlocks;
import net.lapisu.xianxiamod.item.ModItems;
import net.lapisu.xianxiamod.item.ModItemsGroups;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class XianXiaMod implements ModInitializer {
	public static final String MOD_ID = "xianxia-mod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItemsGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}