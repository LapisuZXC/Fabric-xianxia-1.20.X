package net.lapisu.xianxiamod.client.gui;

import net.lapisu.xianxiamod.XianXiaMod;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ScreenHandlerType;
import org.jetbrains.annotations.Nullable;

public class StatsScreenHandler extends ScreenHandler {


    public StatsScreenHandler(@Nullable ScreenHandlerType<?> type, int syncId) {
        super(type, syncId);
    }
    public StatsScreenHandler(int syncId, PlayerInventory playerInventory) {
        super(XianXiaMod.STATS_SCREEN_HANDLER_TYPE, syncId);
    }


    @Override
    public ItemStack quickMove(PlayerEntity player, int slot) {
        return null;
    }

    @Override
    public boolean canUse(PlayerEntity player) {
        return false;
    }
}
