package net.lapisu.xianxiamod.event;

import net.fabricmc.fabric.api.event.Event;
import net.minecraft.entity.player.PlayerEntity;

import java.math.BigDecimal;

public class CultivationEvent extends Event{
    @Override
    public void register(Object listener) {

    }
    private final PlayerEntity player;

    private BigDecimal increaseAmount;

    CultivationEvent(PlayerEntity player, BigDecimal increaseAmount){
        this.player = player;
        this.increaseAmount= increaseAmount;
    }

    public PlayerEntity getPlayer() {
        return player;
    }

    public BigDecimal getIncreaseAmount() {
        return increaseAmount;
    }

    public void setIncreaseAmount(BigDecimal increaseAmount) {
        this.increaseAmount = increaseAmount;
    }
}
