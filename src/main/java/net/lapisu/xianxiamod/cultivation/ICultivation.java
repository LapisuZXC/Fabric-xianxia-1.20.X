package net.lapisu.xianxiamod.cultivation;

import net.lapisu.xianxiamod.cultivation.stats.PlayerStats;

import java.math.BigDecimal;

public interface ICultivation {
    BigDecimal getStat(PlayerStats stat);

    BigDecimal calculatePower();

}
