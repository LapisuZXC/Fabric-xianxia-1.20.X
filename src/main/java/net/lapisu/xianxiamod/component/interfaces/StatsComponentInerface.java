package net.lapisu.xianxiamod.component.interfaces;

import dev.onyxstudios.cca.api.v3.component.ComponentV3;
import net.minecraft.entity.player.PlayerEntity;

public interface StatsComponentInerface extends ComponentV3 {

    int getBodyStats();

    int getEnergyStats();

    int getSoulStats();

    void setBodyStats(int bodyStats);

    void setEnergyStats(int energyStats);

    void setSoulStats(int soulStats);

    PlayerEntity getPlayerEntity();

}
