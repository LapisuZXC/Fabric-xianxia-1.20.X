package net.lapisu.xianxiamod.cultivation;

import net.lapisu.xianxiamod.XianXiaMod;
import net.minecraft.entity.attribute.ClampedEntityAttribute;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Identifier;

import java.util.List;

public class CultivationAttributes{


    //creating attributes
    public static final String soulHealthName = "soul_health";
    public static final Identifier soulHealthId = new Identifier(XianXiaMod.MOD_ID + ":" + soulHealthName);
    public static final EntityAttribute SOUL_HEALTH = (new ClampedEntityAttribute("attribute.name.xianxia" + soulHealthName,
            0.0, 0.0, 20.0).setTracked(true));
    //^^^
    public static final String QiName = "qi";
    public static final Identifier QiId = new Identifier(XianXiaMod.MOD_ID + ":" + QiName);
    public static final EntityAttribute QI = (new ClampedEntityAttribute("attribute.name.xianxia" + QiName,
            0.0, 0.0, 20.0).setTracked(true));

    //list of attributes for utility (may not be needed)
    public static List<EntityAttribute> attributes;

    static {
        attributes = List.of(SOUL_HEALTH, QI);
    }

    public enum AttributeType {
        SOUL_HEALTH,
        QI
    }

    public static double getAttributeValue(PlayerEntity player,AttributeType type){
        switch(type){
            case SOUL_HEALTH -> {
                var value = player.getAttributeValue(SOUL_HEALTH);
                return value;
            }
            case QI -> {
                var value = player.getAttributeValue(QI);
                return value;
            }
        }

        return -1; // should not happen
    }

}