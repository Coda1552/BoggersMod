package mod.coda.boggers.init;

import mod.coda.boggers.Boggers;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, Boggers.MOD_ID);

    public static final RegistryObject<BlockItem> CYPRESS_SAPLING = ITEMS.register("cypress_sapling", () -> new BlockItem(BlockInit.CYPRESS_SAPLING.get(), new Item.Properties().group(Boggers.GROUP)));
    public static final RegistryObject<BlockItem> CYPRESS_LOG = ITEMS.register("cypress_log", () -> new BlockItem(BlockInit.CYPRESS_LOG.get(), new Item.Properties().group(Boggers.GROUP)));
    public static final RegistryObject<BlockItem> CYPRESS_LEAVES = ITEMS.register("cypress_leaves", () -> new BlockItem(BlockInit.CYPRESS_LEAVES.get(), new Item.Properties().group(Boggers.GROUP)));
    public static final RegistryObject<BlockItem> CYPRESS_PLANKS = ITEMS.register("cypress_planks", () -> new BlockItem(BlockInit.CYPRESS_PLANKS.get(), new Item.Properties().group(Boggers.GROUP)));

}
