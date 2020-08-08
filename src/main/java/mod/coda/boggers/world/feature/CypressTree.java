package mod.coda.boggers.world.feature;

import mod.coda.boggers.init.BlockInit;
import net.minecraft.block.trees.Tree;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.foliageplacer.BlobFoliagePlacer;
import net.minecraftforge.common.IPlantable;

import java.util.Random;

public class CypressTree extends Tree {

    public static final TreeFeatureConfig CYPRESS_TREE_CONFIG = (new TreeFeatureConfig.Builder(
            new SimpleBlockStateProvider(BlockInit.CYPRESS_LOG.get().getDefaultState()),
            new SimpleBlockStateProvider(BlockInit.CYPRESS_LEAVES.get().getDefaultState()),
            new BlobFoliagePlacer(5,2))).baseHeight(15).heightRandA(10).foliageHeight(4)
            .setSapling((IPlantable) BlockInit.CYPRESS_SAPLING.get()).build();

    @Override
    protected ConfiguredFeature<TreeFeatureConfig, ?> getTreeFeature(Random randomIn, boolean b) {
        return Feature.NORMAL_TREE.withConfiguration(CYPRESS_TREE_CONFIG);
    }
}
