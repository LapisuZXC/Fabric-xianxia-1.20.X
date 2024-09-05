package net.lapisu.xianxiamod.component;

import dev.onyxstudios.cca.api.v3.component.ComponentKey;
import dev.onyxstudios.cca.api.v3.component.sync.AutoSyncedComponent;
import dev.onyxstudios.cca.api.v3.component.tick.ServerTickingComponent;
import dev.onyxstudios.cca.internal.base.ComponentRegistrationInitializer;
import net.lapisu.xianxiamod.component.interfaces.QiComponentInterface;
import net.lapisu.xianxiamod.registry.XianXiaModComponents;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.NbtCompound;


public class QiComponent implements QiComponentInterface, AutoSyncedComponent, ServerTickingComponent, ComponentRegistrationInitializer {
    private PlayerEntity player;
    private ComponentKey<StatsComponent> statsComponent = XianXiaModComponents.STATS_COMPONENT;
    public int MAX_QI = 100 + statsComponent.get(player).getEnergyStats() * 10;



    public QiComponent(){}

    private int qiValue = 0;
    private int qiTimer = 60;

    public QiComponent(PlayerEntity player) {
        this.player = player;
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
        setQiValue(tag.getInt("qivalue"));
        setQiValue(tag.getInt("qitimer"));
    }

    /**
     * Writes this component's properties to a {@link NbtCompound}.
     *
     * @param tag a {@code NbtCompound} on which to write this component's serializable data
     */
    @Override
    public void writeToNbt(NbtCompound tag) {
        tag.putInt("qivalue", getQiValue());
        tag.putInt("qitimer", getQiTimer());
    }

    @Override
    public int getQiValue() {
        return qiValue;
    }

    @Override
    public void setQiValue(int qiValue) {
        this.qiValue = qiValue;
        XianXiaModComponents.QI_COMPONENT.sync(player);
    }

    @Override
    public int getQiTimer() {
        return qiTimer;
    }

    @Override
    public void setQiTimer(int qiTimer) {
        this.qiTimer = qiTimer;
        XianXiaModComponents.QI_COMPONENT.sync(player);
    }

    @Override
    public boolean fillQi(int amount) {
       if (getQiValue() < MAX_QI) {
           setQiValue(Math.min(MAX_QI, getQiValue() + amount));
           setQiTimer(60);
           return true;
       }
        return false;
    }

    @Override
    public boolean drainQi(int amount) {
        if (getQiValue() - amount >= 0) {
            setQiValue(Math.max(0, getQiValue() - amount));
            setQiTimer(60);
            return true;
        }
        return false;
    }

    @Override
    public void serverTick() {
        if (getQiTimer() > 0) {
            setQiTimer(getQiTimer() - 1);
        }
    }
}


