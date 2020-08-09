package mod.coda.boggers.world.feature;

import mod.coda.boggers.init.BlockInit;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.gen.IWorldGenerationReader;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraftforge.common.IPlantable;

import java.util.Random;
import java.util.Set;

public class CypressTreeFeature extends HugeTreesFeature<HugeTreeFeatureConfig> {

    public CypressTreeFeature() {
        super(data -> MEGA_CYPRESS_TREE_CONFIG);
    }

    public static final HugeTreeFeatureConfig MEGA_CYPRESS_TREE_CONFIG = (new HugeTreeFeatureConfig.Builder(
            new SimpleBlockStateProvider(BlockInit.CYPRESS_LOG.get().getDefaultState()),
            new SimpleBlockStateProvider(BlockInit.CYPRESS_LEAVES.get().getDefaultState())).setSapling((IPlantable) BlockInit.CYPRESS_SAPLING.get()).baseHeight(20).heightInterval(5).crownHeight(5).build());

    public boolean place(IWorldGenerationReader generationReader, Random rand, BlockPos positionIn, Set<BlockPos> setPos1, Set<BlockPos> setPos2, MutableBoundingBox boundingBoxIn, HugeTreeFeatureConfig configIn) {
        int i = this.func_227256_a_(rand, configIn);
        if (!this.hasRoom(generationReader, positionIn, i, configIn)) {
            return false;
        } else {
            this.func_227252_c_(generationReader, rand, positionIn.up(i), 2, setPos2, boundingBoxIn, configIn);

            for(int j = positionIn.getY() + i - 2 - rand.nextInt(4); j > positionIn.getY() + i / 2; j -= 2 + rand.nextInt(4)) {
                float f = rand.nextFloat() * ((float)Math.PI * 2F);
                int k = positionIn.getX() + (int)(0.5F + MathHelper.cos(f) * 4.0F);
                int l = positionIn.getZ() + (int)(0.5F + MathHelper.sin(f) * 4.0F);

                for(int i1 = 0; i1 < 5; ++i1) {
                    k = positionIn.getX() + (int)(1.5F + MathHelper.cos(f) * (float)i1);
                    l = positionIn.getZ() + (int)(1.5F + MathHelper.sin(f) * (float)i1);
                    BlockPos blockpos = new BlockPos(k, j - 3 + i1 / 2, l);
                    this.setLog(generationReader, rand, blockpos, setPos1, boundingBoxIn, configIn);
                }

                int l1 = 1 + rand.nextInt(2);
                int i2 = j;

                for(int j1 = j - l1; j1 <= i2; ++j1) {
                    int k1 = j1 - i2;
                    this.func_227257_b_(generationReader, rand, new BlockPos(k, j1, l), 1 - k1, setPos2, boundingBoxIn, configIn);
                }
            }

            this.func_227254_a_(generationReader, rand, positionIn, i, setPos1, boundingBoxIn, configIn);
            return true;
        }
    }

    private void func_227252_c_(IWorldGenerationReader p_227252_1_, Random p_227252_2_, BlockPos p_227252_3_, int p_227252_4_, Set<BlockPos> p_227252_5_, MutableBoundingBox p_227252_6_, BaseTreeFeatureConfig p_227252_7_) {
        int i = 2;

        for(int j = -2; j <= 0; ++j) {
            this.func_227255_a_(p_227252_1_, p_227252_2_, p_227252_3_.up(j), p_227252_4_ + 1 - j, p_227252_5_, p_227252_6_, p_227252_7_);
        }
    }
}