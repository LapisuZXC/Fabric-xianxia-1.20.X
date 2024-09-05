package net.lapisu.xianxiamod.component.interfaces;

import dev.onyxstudios.cca.api.v3.component.ComponentV3;

public interface QiComponentInterface extends ComponentV3 {

    int getQiValue();

    void setQiValue(int value);

    int getQiTimer();

    void setQiTimer(int value);

    boolean fillQi(int amount);

    boolean drainQi(int amount);
}
