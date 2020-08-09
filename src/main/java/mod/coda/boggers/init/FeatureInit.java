package mod.coda.boggers.init;

import mod.coda.boggers.Boggers;
import mod.coda.boggers.world.biomes.BogSurfaceBuilder;
import mod.coda.boggers.world.feature.CypressTreeFeature;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SaplingBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.feature.Feature;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class FeatureInit {
//    public static final DeferredRegister<Feature<?>> FEATURES = new DeferredRegister<>(ForgeRegistries.FEATURES, Boggers.MOD_ID);

    public static final CypressTreeFeature CYPRESS_TREE = Registry.register(Registry.FEATURE, new ResourceLocation(Boggers.MOD_ID, "cypress_tree"), new CypressTreeFeature());
}
