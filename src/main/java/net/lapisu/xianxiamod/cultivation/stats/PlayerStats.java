package net.lapisu.xianxiamod.cultivation.stats;

import java.math.BigDecimal;

public enum PlayerStats {
    CURRENT_HEALTH(new BigDecimal(20.0),true),
    MAX_HEALTH(new BigDecimal(20.0),true),
    ;

    public final BigDecimal defaultValue;


    public final boolean isModifiable;

    PlayerStats(BigDecimal defaultValue, boolean isModifiable){
        this.defaultValue = defaultValue;
        this.isModifiable = isModifiable;
    }
}
