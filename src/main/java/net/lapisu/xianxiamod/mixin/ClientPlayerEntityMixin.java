package net.lapisu.xianxiamod.mixin;

import net.lapisu.xianxiamod.cultivation.Cultivation;
import net.lapisu.xianxiamod.mixininterfaces.PlayerMixinInterface;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayerEntity;
import org.spongepowered.asm.mixin.Mixin;


@Mixin(ClientPlayerEntity.class)
public class ClientPlayerEntityMixin implements PlayerMixinInterface {

    private Cultivation cultivation = new Cultivation(MinecraftClient.getInstance().player);
    @Override
    public Cultivation getCultivation() {
        return cultivation;
    }
}
