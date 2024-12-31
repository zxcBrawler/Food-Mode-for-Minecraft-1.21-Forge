package net.zxcbrawler.foodmod.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.zxcbrawler.foodmod.FoodMod;
import net.zxcbrawler.foodmod.block.ModBlocks;

import java.util.Objects;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, FoodMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        logBlock(ModBlocks.PISTACHIO_LOG.get());
        logBlock(ModBlocks.STRIPPED_PISTACHIO_LOG.get());

        axisBlock(ModBlocks.PISTACHIO_WOOD.get(), blockTexture(ModBlocks.PISTACHIO_LOG.get()), blockTexture(ModBlocks.PISTACHIO_LOG.get()));
        axisBlock(ModBlocks.STRIPPED_PISTACHIO_WOOD.get(), blockTexture(ModBlocks.STRIPPED_PISTACHIO_LOG.get()), blockTexture(ModBlocks.STRIPPED_PISTACHIO_LOG.get()));

        blockItem(ModBlocks.PISTACHIO_LOG);
        blockItem(ModBlocks.PISTACHIO_WOOD);
        blockItem(ModBlocks.STRIPPED_PISTACHIO_LOG);
        blockItem(ModBlocks.STRIPPED_PISTACHIO_WOOD);

        blockWithItem(ModBlocks.PISTACHIO_PLANKS);

        leavesBlock(ModBlocks.PISTACHIO_LEAVES);
        saplingBlock(ModBlocks.PISTACHIO_SAPLING);
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject){
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
    private void blockItem(RegistryObject<? extends Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile("foodmod:block/" +
                Objects.requireNonNull(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get())).getPath()));
    }

    private void blockItem(RegistryObject<? extends Block> blockRegistryObject, String appendix) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile("foodmod:block/" +
                Objects.requireNonNull(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get())).getPath() + appendix));
    }

    private void saplingBlock(RegistryObject<Block> blockRegistryObject) {
        simpleBlock(blockRegistryObject.get(),
                models().cross(Objects.requireNonNull(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get())).getPath(), blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    private void leavesBlock(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(),
                models().singleTexture(Objects.requireNonNull(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get())).getPath(), ResourceLocation.parse("minecraft:block/leaves"),
                        "all", blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }
}
