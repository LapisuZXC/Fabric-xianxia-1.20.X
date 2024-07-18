package net.lapisu.xianxiamod.cultivation.stats;

import java.math.BigDecimal;

public class Stats {
    public BigDecimal defaultValue = new BigDecimal("0.0");
    public boolean isModifiable = true;

    Stats(BigDecimal defaultValue, boolean isModifiable){
        this.defaultValue = defaultValue;
        this.isModifiable = isModifiable;
    }
    public BigDecimal getStats(){
        return this.defaultValue;
    }

    public void setStats(BigDecimal stats){
        this.defaultValue = stats;
    }
}
