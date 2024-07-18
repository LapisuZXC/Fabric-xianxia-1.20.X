package net.lapisu.xianxiamod.cultivation.stats;

import java.math.BigDecimal;

public class PlayerSoulStats extends Stats{

    private BigDecimal soulHPModifier = new BigDecimal("0.0");
    private BigDecimal SoulQiModifier = new BigDecimal("0.0");


    public PlayerSoulStats(BigDecimal defaultValue, boolean isModifiable){
        super(defaultValue, isModifiable);
    }

    public BigDecimal getSoulHPModifier(){
        return this.soulHPModifier;
    }

    public void setSoulHPModifier(BigDecimal soulHPModifier){
        this.soulHPModifier = soulHPModifier;
    }

    public BigDecimal getSoulQiModifier(){
        return this.SoulQiModifier;
    }

    public void setSoulQiModifier(BigDecimal soulQiModifier){
        this.SoulQiModifier = soulQiModifier;
    }
}
