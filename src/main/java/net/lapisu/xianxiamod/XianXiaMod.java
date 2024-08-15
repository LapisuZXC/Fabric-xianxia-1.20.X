package net.lapisu.xianxiamod;

import net.fabricmc.api.ModInitializer;


import net.lapisu.xianxiamod.block.ModBlocks;
import net.lapisu.xianxiamod.cultivation.CultivationAttributes;
import net.lapisu.xianxiamod.item.ModItems;
import net.lapisu.xianxiamod.item.ModItemsGroups;
import net.minecraft.client.MinecraftClient;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;


import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class XianXiaMod implements ModInitializer {
	public static final String MOD_ID = "xianxia-mod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static final Identifier STATS_SCREEN_ID = new Identifier(MOD_ID, "statsscreen");


	public static final PlayerEntity PLAYER = MinecraftClient.getInstance().player;


	@Override
	public void onInitialize() {
		ModItemsGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
	public static void registerAttributes() {
		Registry.register(Registries.ATTRIBUTE, CultivationAttributes.soulHealthId, CultivationAttributes.SOUL_HEALTH);
		Registry.register(Registries.ATTRIBUTE, CultivationAttributes.QiId, CultivationAttributes.QI);
	}
}