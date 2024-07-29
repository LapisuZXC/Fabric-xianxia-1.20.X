package net.lapisu.xianxiamod.cultivation.stats;



public class PlayerSoulStats extends Stats{
    // change to float everywhere
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
