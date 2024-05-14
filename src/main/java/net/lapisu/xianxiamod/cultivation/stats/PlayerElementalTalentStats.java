package net.lapisu.xianxiamod.cultivation.stats;

import java.math.BigDecimal;

public enum PlayerElementalTalentStats {

    FIRE_TALENT(new BigDecimal(0.0), false),
    WATER_TALENT(new BigDecimal(0.0), false),
    LIGHTING_TALENT(new BigDecimal(0.0), false),
    EARTH_TALENT(new BigDecimal(0.0), false),
    METAL_TALENT(new BigDecimal(0.0), false),
    ;

    public final BigDecimal defaultValue;


    public final boolean isModifiable;

    PlayerElementalTalentStats(BigDecimal defaultValue, boolean isModifiable){
        this.defaultValue = defaultValue;
        this.isModifiable = isModifiable;
    }
}
