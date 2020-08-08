package mod.coda.boggers.init;

import mod.coda.boggers.Boggers;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(Boggers.MOD_ID)
@Mod.EventBusSubscriber(modid = Boggers.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class BlockInit {
    public static final Block cypress_plank = null;

    @SubscribeEvent
    public static void registerBlocks(final RegistryEvent.Register<Block> event)
    {
        event.getRegistry().register(new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName("cypress_plank"));
    }

    @SubscribeEvent
    public static void registerItemBlocks(final RegistryEvent.Register<Item> event)
    {
        event.getRegistry().register(new BlockItem(cypress_plank, new Item.Properties()).setRegistryName("cypress_plank"));
    }


}
