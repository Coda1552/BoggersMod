package mod.coda.boggers;

import mod.coda.boggers.init.BiomeInit;
import mod.coda.boggers.init.BlockInit;
import mod.coda.boggers.init.FeatureInit;
import mod.coda.boggers.init.ItemInit;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Boggers.MOD_ID)
public class Boggers {

    public static final String MOD_ID = "boggers";
    public static Boggers instance;

    public Boggers() {
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::setup);
        modEventBus.addListener(this::doClientStuff);

        ItemInit.ITEMS.register(modEventBus);
        BlockInit.BLOCKS.register(modEventBus);
        BiomeInit.BIOMES.register(modEventBus);

        instance = this;
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public static void onRegisterBiomes(final RegistryEvent.Register<Biome>event) {
        BiomeInit.registerBiomes();
    }

    private void setup(final FMLCommonSetupEvent event) {
    }

    private void doClientStuff(final FMLCommonSetupEvent event) {
    }

    public final static ItemGroup GROUP = new ItemGroup("boggers_item_group") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(BlockInit.CYPRESS_PLANKS.get());
        }
    };
}
