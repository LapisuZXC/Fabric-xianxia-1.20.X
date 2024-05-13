package net.lapisu.xianxiamod.cultivation.stats;

import java.math.BigDecimal;

public enum PlayerCultivatioStats {

    QI(new BigDecimal(0.0),true),
    MAX_QI(new BigDecimal(0.0),true),

    ;

    public final BigDecimal defaulValue;
    public final boolean isModifiable;



    PlayerCultivatioStats(BigDecimal defaultValue,boolean isModifiable){
        this.defaulValue = defaultValue;
        this.isModifiable= isModifiable;
    }
}
