package net.lapisu.xianxiamod.cultivation.combat;

public class DamageCapability {
    public enum Target{
        BODY,
        SOUL,
        BOTH
    }
    private Target target;
    private float bodyDamage = 0.0f;
    private float soulDamage = 0.0f;

    public DamageCapability(Target target){
        this.target = target;
    }

    public DamageCapability(Target target, float damage) throws Exception{
        switch(target){
            case BODY -> this.bodyDamage = damage;
            case SOUL -> this.soulDamage = damage;
            case BOTH -> throw new Exception("Cannot set both body and soul damage using this constructor.");
        }
    }

    public DamageCapability(Target target, float bodyDamage, float soulDamage) throws Exception{
            switch(target){
                case BODY -> this.bodyDamage = bodyDamage;
                case SOUL -> this.soulDamage = soulDamage;
                case BOTH -> {
                    this.bodyDamage = bodyDamage;
                    this.soulDamage = soulDamage;
                }
            }
    }

    public float getBodyDamage(){
        return this.bodyDamage;
    }

    public void setBodyDamage(float bodyDamage){
        this.bodyDamage = bodyDamage;
    }
    public float getSoulDamage(){
        return this.soulDamage;
    }

    public void setSoulDamage(float soulDamage){
        this.soulDamage = soulDamage;
    }

    public Target getTarget(){
        return this.target;
    }

    public void setTarget(Target target){
        this.target = target;
    }
}
