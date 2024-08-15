package net.lapisu.xianxiamod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.lapisu.xianxiamod.XianXiaMod;
import net.lapisu.xianxiamod.item.attack.ExplosivePunch;
import net.lapisu.xianxiamod.item.complexitems.CultivationIncreaser;
import net.lapisu.xianxiamod.item.complexitems.GuiItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item IMMORTAL_STONE = registerItem("immortal_stone", new Item(new FabricItemSettings()));

    public static final Item GUI_ITEM = registerItem("gui_item", new GuiItem(new FabricItemSettings()));

    public static final Item CULTIVATION_INCREASER = registerItem("cultivation_increaser", new CultivationIncreaser(new FabricItemSettings()));

    public static final Item EXPLOSIVE_PUNCH = registerItem("explosive_punch", new ExplosivePunch(new FabricItemSettings()));

    public static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries){
        entries.add(IMMORTAL_STONE);
        entries.add(GUI_ITEM);
        entries.add(CULTIVATION_INCREASER);
        entries.add(EXPLOSIVE_PUNCH);
    }



    public  static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(XianXiaMod.MOD_ID,name), item);
    }

    public static void registerModItems(){
        XianXiaMod.LOGGER.info("Registring Mod Items for" + XianXiaMod.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
