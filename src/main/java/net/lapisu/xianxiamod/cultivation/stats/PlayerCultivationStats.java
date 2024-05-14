package net.lapisu.xianxiamod.cultivation.stats;

import java.math.BigDecimal;

public enum PlayerCultivationStats {

    QI(new BigDecimal(0.0),true),
    MAX_QI(new BigDecimal(0.0),true),
    TOTALPOWER(new BigDecimal(0.0), false)
    ;

    public final BigDecimal defaulValue;
    public final boolean isModifiable;



    PlayerCultivationStats(BigDecimal defaultValue,boolean isModifiable){
        this.defaulValue = defaultValue;
        this.isModifiable= isModifiable;
    }
}
