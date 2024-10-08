package net.lapisu.xianxiamod.mixin;

import net.lapisu.xianxiamod.cultivation.Cultivation;
import net.lapisu.xianxiamod.cultivation.CultivationAttributes;
import net.lapisu.xianxiamod.mixininterfaces.PlayerMixinInterface;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(PlayerEntity.class)
public abstract class PlayerEntityMixin extends LivingEntity implements PlayerMixinInterface {

    public PlayerEntityMixin(EntityType<? extends LivingEntity> entityType, World world) {
        super(entityType, world);
    }
    private final PlayerEntity playerEntity = (PlayerEntity) (Object) this;
    private final Cultivation cultivation  = new Cultivation(playerEntity);

    @Inject(method = "readCustomDataFromNbt", at = @At(value = "TAIL"))
    private void readCustomDataFromNbtMixin(NbtCompound nbt, CallbackInfo ci) {
        this.cultivation.readNbt(nbt);
    }

    @Inject(method = "writeCustomDataToNbt", at = @At("HEAD"))
    private void writeCustomDataToNbtMixin(NbtCompound nbt, CallbackInfo ci) {
        this.cultivation.writeNbt(nbt);
    }


    @Override
    public Cultivation getCultivation() {
        return this.cultivation;
    }


    @Inject(
            method = "createPlayerAttributes",
            require = 1, allow = 1, at = @At("RETURN"))
    private static void addAttributes(CallbackInfoReturnable<DefaultAttributeContainer.Builder> cir) {
        for (var attribute: CultivationAttributes.attributes) {
            cir.getReturnValue().add(attribute);
        }
    }
}
