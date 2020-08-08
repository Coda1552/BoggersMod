package mod.coda.boggers.init;

import mod.coda.boggers.Boggers;
import mod.coda.boggers.objects.blocks.CypressSaplingBlock;
import mod.coda.boggers.world.feature.CypressTree;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.LeavesBlock;
import net.minecraft.block.LogBlock;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {

    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, Boggers.MOD_ID);

    public static final RegistryObject<Block> CYPRESS_SAPLING = BLOCKS.register("cypress_sapling", () -> new CypressSaplingBlock(() -> new CypressTree(), Block.Properties.from(Blocks.OAK_SAPLING)));

    public static final RegistryObject<Block> CYPRESS_LOG = BLOCKS.register("cypress_log", () -> new LogBlock(MaterialColor.WOOD, Block.Properties.from(Blocks.OAK_LOG)));

    public static final RegistryObject<Block> CYPRESS_LEAVES = BLOCKS.register("cypress_leaves", () -> new LeavesBlock(Block.Properties.from(Blocks.OAK_LEAVES)));

    public static final RegistryObject<Block> CYPRESS_PLANKS = BLOCKS.register("cypress_planks", () -> new Block(Block.Properties.from(Blocks.OAK_PLANKS)));
}
