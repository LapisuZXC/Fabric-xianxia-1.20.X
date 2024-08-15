package net.lapisu.xianxiamod.item.attack;

import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import java.lang.reflect.Array;

public class ExplosivePunch extends Item {

    public ExplosivePunch(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        Vec3d lookDirection = user.getRotationVec(1.0F);
        Vec3d startPosition = user.getCameraPosVec(1.0F).add(2.0D, 2.0D, 2.0D);
        MinecraftClient client = MinecraftClient.getInstance();
        for (int i = 0; i < 10; i++) {

            Vec3d explosionPosition = startPosition.add(lookDirection.x * i, lookDirection.y * i, lookDirection.z * i);


            world.createExplosion(user, explosionPosition.x, explosionPosition.y, explosionPosition.z, 2, World.ExplosionSourceType.NONE);
        }

        System.out.println(lookDirection);
        System.out.println(startPosition);
        return TypedActionResult.success(user.getStackInHand(hand));
    }
}