package net.lapisu.xianxiamod.cultivation.stats;



public class PlayerSoulStats extends Stats{

    private float soulHPValue = 0.0f;
    private float soulQiValue = 0.0f;
    private float soulHPModifier = 0.0f;
    private float SoulQiModifier = 0.0f;

    enum Stage{
        MORTAL,
        SOUL_BASIC_REINFORCEMENT,
        SOUL_ADVANCED_REINFORCEMENT,
        SOUL_TRANSFORMATION,
        SOUL_REBIRTH,
        SOUL_ASCENSION
        ;
    }

    public PlayerSoulStats(){
        super();
        this.setStats((this.getSoulHPValue() + this.getSoulQiValue()) / 2.0f);
    }


    public float getSoulHPValue(){
        return this.soulHPValue;
    }

    public void setSoulHPValue(float soulHPValue){
        this.soulHPValue = soulHPValue;
    }

    public float getSoulQiValue(){
        return this.soulQiValue;
    }

    public void setSoulQiValue(float soulQiValue){
        this.soulQiValue = soulQiValue;
    }

    public float getSoulHPModifier(){
        return this.soulHPModifier;
    }

    public void setSoulHPModifier(float soulHPModifier){
        this.soulHPModifier = soulHPModifier;
    }

    public float getSoulQiModifier(){
        return this.SoulQiModifier;
    }

    public void setSoulQiModifier(float soulQiModifier){
        this.SoulQiModifier = soulQiModifier;
    }
}
