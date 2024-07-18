package net.lapisu.xianxiamod.cultivation.stats;

import java.math.BigDecimal;

public class PlayerCultivationStats extends Stats {

    private BigDecimal qiModifier = new BigDecimal("20.0");
    private BigDecimal energyShieldModifier = new BigDecimal("0.0");

    public PlayerCultivationStats(BigDecimal defaultValue, boolean isModifiable){
        super(defaultValue, isModifiable);
    }

    public BigDecimal getQiModifier(){
        return this.qiModifier;
    }

    public void setQiModifier(BigDecimal qiModifier){
        this.qiModifier = qiModifier;
    }

    public BigDecimal getEnergyShieldModifier(){
        return this.energyShieldModifier;
    }

    public void setEnergyShieldModifier(BigDecimal energyShieldModifier){
        this.energyShieldModifier = energyShieldModifier;
    }
}
