package net.zxcbrawler.foodmod.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlag;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;
import net.zxcbrawler.foodmod.block.ModBlocks;
import org.jetbrains.annotations.NotNull;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    protected ModBlockLootTableProvider(HolderLookup.Provider pRegistries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), pRegistries);
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.PISTACHIO_LOG.get());
        this.dropSelf(ModBlocks.PISTACHIO_WOOD.get());
        this.dropSelf(ModBlocks.PISTACHIO_PLANKS.get());
        this.dropSelf(ModBlocks.STRIPPED_PISTACHIO_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_PISTACHIO_LOG.get());
        this.dropSelf(ModBlocks.PISTACHIO_SAPLING.get());

        this.add(ModBlocks.PISTACHIO_LEAVES.get(), block ->
                createLeavesDrops(block,ModBlocks.PISTACHIO_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
    }

    @Override
    protected @NotNull Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
