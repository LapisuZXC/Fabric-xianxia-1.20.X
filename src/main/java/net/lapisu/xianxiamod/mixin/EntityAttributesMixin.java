package net.lapisu.xianxiamod.mixin;


import net.lapisu.xianxiamod.XianXiaMod;
import net.minecraft.entity.attribute.ClampedEntityAttribute;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributes;
import org.lwjgl.system.Platform;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(EntityAttributes.class)
public class EntityAttributesMixin {

    @Inject(method = "<clinit>", at = @At("TAIL"))
    private static void injected(CallbackInfo ci) {
        XianXiaMod.registerAttributes();
    }
}
