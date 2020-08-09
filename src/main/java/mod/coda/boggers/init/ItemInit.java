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
    public static final RegistryObject<BlockItem> CYPRESS_WOOD = ITEMS.register("cypress_wood", () -> new BlockItem(BlockInit.CYPRESS_WOOD.get(), new Item.Properties().group(Boggers.GROUP)));
    public static final RegistryObject<BlockItem> STRIPPED_CYPRESS_LOG = ITEMS.register("stripped_cypress_log", () -> new BlockItem(BlockInit.STRIPPED_CYPRESS_LOG.get(), new Item.Properties().group(Boggers.GROUP)));
    public static final RegistryObject<BlockItem> CYPRESS_LEAVES = ITEMS.register("cypress_leaves", () -> new BlockItem(BlockInit.CYPRESS_LEAVES.get(), new Item.Properties().group(Boggers.GROUP)));
    public static final RegistryObject<BlockItem> CYPRESS_PLANKS = ITEMS.register("cypress_planks", () -> new BlockItem(BlockInit.CYPRESS_PLANKS.get(), new Item.Properties().group(Boggers.GROUP)));
    public static final RegistryObject<BlockItem> CYPRESS_STAIRS = ITEMS.register("cypress_stairs", () -> new BlockItem(BlockInit.CYPRESS_STAIRS.get(), new Item.Properties().group(Boggers.GROUP)));
    public static final RegistryObject<BlockItem> CYPRESS_FENCE = ITEMS.register("cypress_fence", () -> new BlockItem(BlockInit.CYPRESS_FENCE.get(), new Item.Properties().group(Boggers.GROUP)));
    public static final RegistryObject<BlockItem> CYPRESS_SLAB = ITEMS.register("cypress_slab", () -> new BlockItem(BlockInit.CYPRESS_SLAB.get(), new Item.Properties().group(Boggers.GROUP)));
    public static final RegistryObject<BlockItem> CYPRESS_PRESSURE_PLATE = ITEMS.register("cypress_pressure_plate", () -> new BlockItem(BlockInit.CYPRESS_PRESSURE_PLATE.get(), new Item.Properties().group(Boggers.GROUP)));
    public static final RegistryObject<BlockItem> CYPRESS_BUTTON = ITEMS.register("cypress_button", () -> new BlockItem(BlockInit.CYPRESS_BUTTON.get(), new Item.Properties().group(Boggers.GROUP)));
    public static final RegistryObject<BlockItem> CYPRESS_TRAPDOOR = ITEMS.register("cypress_trapdoor", () -> new BlockItem(BlockInit.CYPRESS_TRAPDOOR.get(), new Item.Properties().group(Boggers.GROUP)));
    public static final RegistryObject<BlockItem> CYPRESS_DOOR = ITEMS.register("cypress_door", () -> new BlockItem(BlockInit.CYPRESS_DOOR.get(), new Item.Properties().group(Boggers.GROUP)));

}
