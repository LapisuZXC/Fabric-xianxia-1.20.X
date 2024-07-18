package net.lapisu.xianxiamod.cultivation;

import net.lapisu.xianxiamod.cultivation.stats.PlayerBodyStats;
import net.lapisu.xianxiamod.cultivation.stats.PlayerCultivationStats;
import net.lapisu.xianxiamod.cultivation.stats.PlayerSoulStats;

import java.math.BigDecimal;

public interface ICultivation {


    // 3 systems: Body, Energy and Soul


    public BigDecimal[] getBodyStats(PlayerBodyStats stat);

    public void setBodyStats(PlayerBodyStats stat, BigDecimal[] stats);

    public BigDecimal[] getCultivationStats(PlayerCultivationStats stat);

    public void setCultivationStats(PlayerCultivationStats stat, BigDecimal[] stats);

    public BigDecimal[] getSoulStats(PlayerSoulStats stat);

    public void setSoulStats(PlayerSoulStats stat, BigDecimal[] stats);

}
