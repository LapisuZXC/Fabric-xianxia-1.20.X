package net.lapisu.xianxiamod.cultivation.stats;



public class Stats {
    private float defaultValue;
    private boolean isModifiable;

    Stats(){
        this.defaultValue = 0.0f;
        this.isModifiable = true;
    }
    public float getStats(){
        return this.defaultValue;
    }

    public void setStats(float stats){
        this.defaultValue = stats;
    }

    public void suspendStat(){
        this.isModifiable = false;
    }

    public void resumeStat(){
        this.isModifiable = true;
    }
}
