package mod.coda.boggers.init;

import mod.coda.boggers.Boggers;
import mod.coda.boggers.objects.blocks.*;
import mod.coda.boggers.world.feature.CypressTree;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {

    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, Boggers.MOD_ID);

    public static final RegistryObject<Block> CYPRESS_SAPLING = BLOCKS.register("cypress_sapling", () -> new CypressSaplingBlock(() -> new CypressTree(), Block.Properties.from(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> CYPRESS_LOG = BLOCKS.register("cypress_log", () -> new LogBlock(MaterialColor.WOOD, Block.Properties.from(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> CYPRESS_WOOD = BLOCKS.register("cypress_wood", () -> new Block(Block.Properties.from(Blocks.OAK_WOOD)));
    public static final RegistryObject<Block> STRIPPED_CYPRESS_LOG = BLOCKS.register("stripped_cypress_log", () -> new LogBlock(MaterialColor.WOOD, Block.Properties.from(Blocks.STRIPPED_OAK_LOG)));
    public static final RegistryObject<Block> CYPRESS_LEAVES = BLOCKS.register("cypress_leaves", () -> new LeavesBlock(Block.Properties.from(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> CYPRESS_PLANKS = BLOCKS.register("cypress_planks", () -> new Block(Block.Properties.from(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> CYPRESS_STAIRS = BLOCKS.register("cypress_stairs", () -> new StairsBlock(() -> BlockInit.CYPRESS_PLANKS.get().getDefaultState(), Block.Properties.from(Blocks.OAK_STAIRS)));
    public static final RegistryObject<Block> CYPRESS_FENCE = BLOCKS.register("cypress_fence", () -> new FenceBlock(Block.Properties.from(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> CYPRESS_SLAB = BLOCKS.register("cypress_slab", () -> new SlabBlock(Block.Properties.from(Blocks.OAK_SLAB)));
    public static final RegistryObject<Block> CYPRESS_PRESSURE_PLATE = BLOCKS.register("cypress_pressure_plate", () -> new CypressPressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, Block.Properties.from(Blocks.OAK_PRESSURE_PLATE)));
    public static final RegistryObject<Block> CYPRESS_BUTTON = BLOCKS.register("cypress_button", () -> new CypressButtonBlock(Block.Properties.from(Blocks.OAK_BUTTON)));
    public static final RegistryObject<Block> CYPRESS_TRAPDOOR = BLOCKS.register("cypress_trapdoor", () -> new CypressTrapdoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)));
    public static final RegistryObject<Block> CYPRESS_DOOR = BLOCKS.register("cypress_door", () -> new CypressDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)));
}
