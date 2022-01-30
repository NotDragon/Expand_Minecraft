package net.mcgrand.expandminecraft.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodCompoments {
    public static FoodComponent APPLE_OF_THE_END_COMP = new FoodComponent.Builder().hunger(5).saturationModifier(1.4f).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 800, 2), 1.0f).statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 4000, 1), 1.0f).statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 2000, 1), 1.0f).statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 3400, 4), 1.0f).alwaysEdible().build();
}
