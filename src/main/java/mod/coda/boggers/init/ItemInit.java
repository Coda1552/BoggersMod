package mod.coda.boggers.init;

import mod.coda.boggers.Boggers;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, Boggers.MOD_ID);

    public static final RegistryObject<BlockItem> CYPRESS_PLANKS = ITEMS.register("cypress_planks", () -> new BlockItem(BlockInit.CYPRESS_PLANKS.get(), new Item.Properties().group(Boggers.GROUP)));

}
