package net.zxcbrawler.foodmod.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.zxcbrawler.foodmod.FoodMod;
import net.zxcbrawler.foodmod.block.ModBlocks;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pLookupProvider, CompletableFuture<TagLookup<Block>> pBlockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(pOutput, pLookupProvider, pBlockTags, FoodMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider pProvider) {

        tag(ItemTags.LOGS_THAT_BURN)
                .add(ModBlocks.PISTACHIO_LOG.get().asItem())
                .add(ModBlocks.PISTACHIO_WOOD.get().asItem())
                .add(ModBlocks.STRIPPED_PISTACHIO_WOOD.get().asItem())
                .add(ModBlocks.STRIPPED_PISTACHIO_LOG.get().asItem());

        tag(ItemTags.PLANKS)
                .add(ModBlocks.PISTACHIO_PLANKS.get().asItem());

    }
}
