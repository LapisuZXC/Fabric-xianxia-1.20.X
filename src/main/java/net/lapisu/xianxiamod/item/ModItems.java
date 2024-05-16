package net.lapisu.xianxiamod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.lapisu.xianxiamod.XianXiaMod;
import net.lapisu.xianxiamod.block.ModBlocks;
import net.lapisu.xianxiamod.item.complexitems.GuiItem;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class ModItems {

    public static final Item IMMORTAL_STONE = registerItem("immortal_stone", new Item(new FabricItemSettings()));

    public static final Item GUI_ITEM = registerItem("gui_item", new GuiItem(new FabricItemSettings()));

    public static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries){
        entries.add(IMMORTAL_STONE);
    }



    public  static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(XianXiaMod.MOD_ID,name), item);
    }

    public static void registerModItems(){
        XianXiaMod.LOGGER.info("Registring Mod Items for" + XianXiaMod.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
