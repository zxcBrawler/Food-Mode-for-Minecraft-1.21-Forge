package net.zxcbrawler.foodmod.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.zxcbrawler.foodmod.FoodMod;
import net.zxcbrawler.foodmod.block.ModBlocks;
import net.zxcbrawler.foodmod.item.ModItems;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, FoodMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.CHOCOLATE.get());
        basicItem(ModItems.DUBAI_CHOCOLATE.get());
        basicItem(ModItems.PISTACHIO.get());

        saplingItem(ModBlocks.PISTACHIO_SAPLING);
    }

    private ItemModelBuilder saplingItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("item/generated")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(FoodMod.MOD_ID,"block/" + item.getId().getPath()));
    }
}
