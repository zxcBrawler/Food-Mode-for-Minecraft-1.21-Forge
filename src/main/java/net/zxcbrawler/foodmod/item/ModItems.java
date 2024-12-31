package net.zxcbrawler.foodmod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.zxcbrawler.foodmod.FoodMod;

import static net.zxcbrawler.foodmod.food.FoodsConfig.CHOCOLATE_CONFIG;
import static net.zxcbrawler.foodmod.food.FoodsConfig.DUBAI_CHOCOLATE_CONFIG;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, FoodMod.MOD_ID);

    public static final RegistryObject<Item> CHOCOLATE = ITEMS.register("chocolate",
            () -> new Item(new Item.Properties().food(CHOCOLATE_CONFIG)));
    public static final RegistryObject<Item> DUBAI_CHOCOLATE = ITEMS.register("dubai_chocolate",
            () -> new Item(new Item.Properties().food(DUBAI_CHOCOLATE_CONFIG)));

    public static final RegistryObject<Item> PISTACHIO = ITEMS.register("pistachio",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
