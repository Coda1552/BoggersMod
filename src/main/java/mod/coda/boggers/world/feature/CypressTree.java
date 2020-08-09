package mod.coda.boggers.world.feature;

import mod.coda.boggers.init.FeatureInit;
import net.minecraft.block.trees.BigTree;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.gen.feature.*;

import javax.annotation.Nullable;
import java.util.Random;

public class CypressTree extends BigTree {
    @Nullable
    protected ConfiguredFeature<TreeFeatureConfig, ?> getTreeFeature(Random randomIn, boolean p_225546_2_) {
        return (new TreeFeature(TreeFeatureConfig::deserializeJungle)).withConfiguration(DefaultBiomeFeatures.JUNGLE_SAPLING_TREE_CONFIG);
    }

    @Nullable
    protected ConfiguredFeature<HugeTreeFeatureConfig, ?> getHugeTreeFeature(Random p_225547_1_) {
        return FeatureInit.CYPRESS_TREE.withConfiguration(CypressTreeFeature.MEGA_CYPRESS_TREE_CONFIG);
    }
}