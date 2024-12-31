package net.zxcbrawler.foodmod.food;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class FoodsConfig {

    public static final FoodProperties CHOCOLATE_CONFIG = new FoodProperties.Builder()
            .nutrition(5)
            .saturationModifier(0.4f)
            .effect(new MobEffectInstance(MobEffects.JUMP, 600, 3), 0.9f)
            .build();

    public static final FoodProperties DUBAI_CHOCOLATE_CONFIG = new FoodProperties.Builder()
            .nutrition(5)
            .saturationModifier(0.4f)
            .effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 100, 2), 0.9f)
            .build();
}
