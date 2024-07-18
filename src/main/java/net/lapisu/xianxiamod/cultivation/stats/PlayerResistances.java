package net.lapisu.xianxiamod.cultivation.stats;

import java.math.BigDecimal;

public enum PlayerResistances {
    FIRE_RESISTANCE(new BigDecimal(0.0), false),
    WATER_RESISTANCE(new BigDecimal(0.0), false),
    LIGHTING_RESISTANCE(new BigDecimal(0.0), false),
    EARTH_RESISTANCE(new BigDecimal(0.0), false),
    METAL_RESISTANCE(new BigDecimal(0.0), false),
    ;
    public final BigDecimal defaultValue;


    public final boolean isModifiable;

    PlayerResistances(BigDecimal defaultValue, boolean isModifiable){
        this.defaultValue = defaultValue;
        this.isModifiable = isModifiable;
    }
}
