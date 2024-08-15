package net.lapisu.xianxiamod.item.complexitems;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.lapisu.xianxiamod.client.gui.StatsScreen;
import net.lapisu.xianxiamod.cultivation.Cultivation;
import net.lapisu.xianxiamod.mixininterfaces.PlayerMixinInterface;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;


@Environment(EnvType.CLIENT)
public class CultivationIncreaser extends Item {
    public CultivationIncreaser(Settings settings) {
        super(settings);

    }


    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack stack = user.getStackInHand(hand);
        PlayerMixinInterface playerMixinInterface = (PlayerMixinInterface) user;
        Cultivation cultivation = playerMixinInterface.getCultivation();

        if (!world.isClient) {

            user.sendMessage(Text.literal("Item is working on server"), true);
            return TypedActionResult.success(stack);
        } else {

            user.sendMessage(Text.literal("Item is working on client"), true);
            if (MinecraftClient.getInstance().player != null) {
                cultivation.playerBodyStats.setStrenghtValue(cultivation.playerBodyStats.getStrenghtValue() + 1.0f);
                cultivation.updateBodyStats();
            }
            return TypedActionResult.success(stack);
        }
    }
}
