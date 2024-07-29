package net.lapisu.xianxiamod.cultivation.stats;

import java.math.BigDecimal;

public class PlayerCultivationStats extends Stats {
    // change to float everywhere
    private float qiModifier = 20.0f;
    private float energyShieldModifier = 0.0f;
    enum Stage{
        MORTAL,
        PULSE_CONDENSATION,
        FOUNDATION_FORMING,
        GOLDEN_CORE,
        LIFE_DESTRUCTION,
        DIVINE_SEA,
        ;
    }


    public PlayerCultivationStats(){
        super();
    }

    public float getQiModifier(){
        return this.qiModifier;
    }

    public void setQiModifier(float qiModifier){
        this.qiModifier = qiModifier;
    }

    public float getEnergyShieldModifier(){
        return this.energyShieldModifier;
    }

    public void setEnergyShieldModifier(float energyShieldModifier){
        this.energyShieldModifier = energyShieldModifier;
    }
}
