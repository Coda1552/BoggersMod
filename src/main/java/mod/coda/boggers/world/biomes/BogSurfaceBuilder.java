package mod.coda.boggers.world.biomes;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.IChunk;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;

import java.util.Random;

public class BogSurfaceBuilder extends SurfaceBuilder<SurfaceBuilderConfig> {
    public BogSurfaceBuilder() {
        super(SurfaceBuilderConfig::deserialize);
    }

    @Override
    public void buildSurface(Random random, IChunk chunkIn, Biome biomeIn, int x, int z, int startHeight, double noise, BlockState defaultBlock, BlockState defaultFluid, int seaLevel, long seed, SurfaceBuilderConfig config) {
        x &= 15;
        z &= 15;
        BlockPos.Mutable pos = new BlockPos.Mutable();
        double groundHeight = startHeight * 0.936507937;

        for(int y = 255; y >= 0; --y) {
            pos.setPos(x, y, z);
            if(y < 63) {
                if(y <= groundHeight) {
                    chunkIn.setBlockState(pos, config.getUnderWaterMaterial(), false);
                }
                else {
                    chunkIn.setBlockState(pos, defaultFluid, false);
                }
            }
            else {
                if(chunkIn.getBlockState(pos).getBlock() == Blocks.STONE) {
                    chunkIn.setBlockState(pos, Blocks.AIR.getDefaultState(), false);
                }
            }
        }
    }
}
