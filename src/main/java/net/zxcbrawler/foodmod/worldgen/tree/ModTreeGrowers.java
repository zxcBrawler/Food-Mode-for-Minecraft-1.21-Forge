package net.zxcbrawler.foodmod.worldgen.tree;

import net.minecraft.world.level.block.grower.TreeGrower;
import net.zxcbrawler.foodmod.FoodMod;
import net.zxcbrawler.foodmod.worldgen.ModConfigureFeatures;

import java.util.Optional;

public class ModTreeGrowers {
    public static final TreeGrower PISTACHIO = new TreeGrower(FoodMod.MOD_ID + ":pistachio",
            Optional.empty(), Optional.of(ModConfigureFeatures.PISTACHIO_KEY), Optional.empty());
}
