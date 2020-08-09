package mod.coda.boggers.init;

import mod.coda.boggers.Boggers;
import mod.coda.boggers.world.biomes.BogBiome;
import mod.coda.boggers.world.biomes.BogSurfaceBuilder;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BiomeInit {
    public static final DeferredRegister<Biome> BIOMES = new DeferredRegister<>(ForgeRegistries.BIOMES, Boggers.MOD_ID);

    public static final RegistryObject<Biome> BOG_BIOME = BIOMES.register("bog_biome", () -> new BogBiome());
    public static final BogSurfaceBuilder BOG_SURFACE_BUILDER = Registry.register(Registry.SURFACE_BUILDER, new ResourceLocation(Boggers.MOD_ID, "bog_surface_builder"), new BogSurfaceBuilder());

    public static void registerBiomes() {
        registerBiome(BOG_BIOME.get(), BiomeDictionary.Type.SWAMP);
    }

    private static void registerBiome(Biome biome, BiomeDictionary.Type... types) {
        BiomeDictionary.addTypes(biome, types);
        BiomeManager.addBiome(BiomeManager.BiomeType.COOL, new BiomeManager.BiomeEntry(biome, 100));
    }

}