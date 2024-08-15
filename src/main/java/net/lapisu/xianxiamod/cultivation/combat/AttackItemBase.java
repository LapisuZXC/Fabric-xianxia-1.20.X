package net.lapisu.xianxiamod.cultivation.combat;

import com.google.common.collect.ImmutableMultimap;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolItem;
import net.minecraft.item.ToolMaterial;


public class AttackItemBase extends ToolItem {
    private DamageCapability damageCapability;
    private float attackDamage = 0.0f;
    public AttackItemBase(ToolMaterial toolMaterial, Settings settings, DamageCapability damageCapability, float attackDamage, float attackSpeed) {
        super(toolMaterial, settings);
        this.damageCapability = damageCapability;
        this.attackDamage = attackDamage;
        ImmutableMultimap.Builder<EntityAttribute, EntityAttributeModifier> builder = ImmutableMultimap.builder();
        builder.put(EntityAttributes.GENERIC_ATTACK_DAMAGE, new EntityAttributeModifier(ATTACK_DAMAGE_MODIFIER_ID, "Weapon modifier", (double)this.attackDamage, EntityAttributeModifier.Operation.ADDITION));
        builder.put(EntityAttributes.GENERIC_ATTACK_SPEED, new EntityAttributeModifier(ATTACK_SPEED_MODIFIER_ID, "Weapon modifier", (double)attackSpeed, EntityAttributeModifier.Operation.ADDITION));
    }


    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker){
        return false;
    }




}
