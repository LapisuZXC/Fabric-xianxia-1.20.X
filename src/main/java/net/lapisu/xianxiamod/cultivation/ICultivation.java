package net.lapisu.xianxiamod.cultivation;

import net.lapisu.xianxiamod.cultivation.stats.PlayerBodyStats;
import net.lapisu.xianxiamod.cultivation.stats.PlayerCultivationStats;
import net.lapisu.xianxiamod.cultivation.stats.PlayerSoulStats;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.NbtCompound;

public interface ICultivation {

    public PlayerEntity getPlayerEntity();
    // 3 systems: Body, Energy and Soul


    public float getBodyStats();



    public void updateBodyStats();

    public float getCultivationStats();

    public void updateCultivationStats();

    public float getSoulHPStats();

    public float getSoulQiStats();

    public void updateSoulStats();

    public float calculateTotalPower(PlayerCultivationStats stat, PlayerBodyStats bodyStats, PlayerSoulStats soulStats);

}
