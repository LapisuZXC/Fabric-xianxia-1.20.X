package net.lapisu.xianxiamod.item.complexitems;


import net.lapisu.xianxiamod.client.gui.StatsScreenHandler;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.SimpleNamedScreenHandlerFactory;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class GuiItem extends Item    {
    public GuiItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {

        ItemStack stack = user.getStackInHand(hand);
        user.openHandledScreen(createScreenHandlerFactory(stack));
        if (!world.isClient) {
            user.sendMessage(Text.literal("Item is working on client"), true);
            return TypedActionResult.success(stack);
        }
        else {
            user.sendMessage(Text.literal("Item is working on server"), true);
            return TypedActionResult.success(stack);
        }
    }


    private SimpleNamedScreenHandlerFactory createScreenHandlerFactory(ItemStack stack) {
        return new SimpleNamedScreenHandlerFactory(StatsScreenHandler::new, stack.getName());
    }
}
