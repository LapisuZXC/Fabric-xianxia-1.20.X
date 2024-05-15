package net.lapisu.xianxiamod.cultivation;

import net.lapisu.xianxiamod.cultivation.stats.PlayerStats;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Cultivation implements ICultivation{
    @Override
    public BigDecimal getStat(PlayerStats stat) {
        return stat.defaultValue;
    }

    @Override
    public BigDecimal calculatePower() {
        return null;
    }
}
