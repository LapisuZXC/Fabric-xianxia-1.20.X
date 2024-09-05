package net.lapisu.xianxiamod.component;

import net.lapisu.xianxiamod.component.interfaces.StatsComponentInerface;
import net.lapisu.xianxiamod.registry.XianXiaModComponents;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.NbtCompound;

public class StatsComponent implements StatsComponentInerface {


    private int bodyStats;
    private int energyStats;
    private int soulStats;

    private PlayerEntity player;

    public StatsComponent(){}

    public StatsComponent(PlayerEntity player) {
        this.player = player;
    }

    @Override
    public int getBodyStats() {
        return bodyStats;
    }

    @Override
    public int getEnergyStats() {
        return energyStats;
    }

    @Override
    public int getSoulStats() {
        return soulStats;
    }

    @Override
    public void setBodyStats(int bodyStats) {
        this.bodyStats = bodyStats;
        XianXiaModComponents.STATS_COMPONENT.sync(player);
    }

    @Override
    public void setEnergyStats(int energyStats) {
        this.energyStats = energyStats;
        XianXiaModComponents.STATS_COMPONENT.sync(player);
    }

    @Override
    public void setSoulStats(int soulStats) {
        this.soulStats = soulStats;
        XianXiaModComponents.STATS_COMPONENT.sync(player);
    }

    @Override
    public PlayerEntity getPlayerEntity() {
        return player;
    }

    /**
     * Reads this component's properties from a {@link NbtCompound}.
     *
     * @param tag a {@code NbtCompound} on which this component's serializable data has been written
     * @implNote implementations should not assert that the data written on the tag corresponds to any
     * specific scheme, as saved data is susceptible to external tempering, and may come from an earlier
     * version.
     */
    @Override
    public void readFromNbt(NbtCompound tag) {
        setBodyStats(tag.getInt("bodystats"));
        setEnergyStats(tag.getInt("energystats"));
        setSoulStats(tag.getInt("soulstats"));
    }

    /**
     * Writes this component's properties to a {@link NbtCompound}.
     *
     * @param tag a {@code NbtCompound} on which to write this component's serializable data
     */
    @Override
    public void writeToNbt(NbtCompound tag) {
        tag.putInt("bodystats", getBodyStats());
        tag.putInt("energystats", getEnergyStats());
        tag.putInt("soulstats", getSoulStats());
    }


}
