package net.lapisu.xianxiamod.mixininterfaces;

import net.lapisu.xianxiamod.cultivation.Cultivation;
import net.minecraft.entity.player.PlayerEntity;


public interface PlayerMixinInterface {
    Cultivation getCultivation();
}