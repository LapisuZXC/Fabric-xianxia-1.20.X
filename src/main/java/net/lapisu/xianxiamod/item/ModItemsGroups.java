package net.lapisu.xianxiamod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.lapisu.xianxiamod.XianXiaMod;
import net.lapisu.xianxiamod.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemsGroups {

    public static final ItemGroup XIANXIA_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(XianXiaMod.MOD_ID,"xianxia"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.xianxia"))
                    .icon(() -> new ItemStack(ModItems.IMMORTAL_STONE)).entries((displayContext, entries) -> {
                        entries.add(ModItems.IMMORTAL_STONE);
                        entries.add(ModBlocks.IMMORTAL_BLOCK);
                    }).build());

    public static void registerItemGroups(){

        XianXiaMod.LOGGER.info("Registring item groups for" + XianXiaMod.MOD_ID);

    }

}
