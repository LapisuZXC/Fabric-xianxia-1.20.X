package net.lapisu.xianxiamod.cultivation.stats;

import java.math.BigDecimal;

public class PlayerBodyStats extends Stats{
    private BigDecimal resistancesModifier = new BigDecimal("0.0");
    private BigDecimal hpModifier = new BigDecimal("2.0");

    public PlayerBodyStats(BigDecimal defaultValue, boolean isModifiable){
        super(defaultValue, isModifiable);
    }

    public BigDecimal getResistancesModifier(){
        return this.resistancesModifier;
    }

    public void setResistancesModifier(BigDecimal resistancesModifier){
        this.resistancesModifier = resistancesModifier;
    }

    public BigDecimal getHpModifier(){
        return this.hpModifier;
    }

    public void setHpModifier(BigDecimal hpModifier){
        this.hpModifier = hpModifier;
    }
}
