package net.ggwpgaming.mbt.item;

import net.ggwpgaming.mbt.MoreBeautifulTorches;
import net.ggwpgaming.mbt.block.ModBlocks;
import net.minecraft.core.Direction;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.StandingAndWallBlockItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {public static final DeferredRegister<Item> ITEMS =
        DeferredRegister.create(ForgeRegistries.ITEMS, MoreBeautifulTorches.MOD_ID);
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }







    public static final RegistryObject<StandingAndWallBlockItem> OAK_LOG_TORCH_ITEM = ITEMS.register("oak_log_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.OAK_LOG_TORCH.get(), ModBlocks.OAK_LOG_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> OAK_LOG_REDSTONE_TORCH_ITEM = ITEMS.register("oak_log_redstone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.OAK_LOG_REDSTONE_TORCH.get(), ModBlocks.OAK_LOG_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> OAK_PLANKS_TORCH_ITEM = ITEMS.register("oak_planks_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.OAK_PLANKS_TORCH.get(), ModBlocks.OAK_PLANKS_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> OAK_PLANKS_REDSTONE_TORCH_ITEM = ITEMS.register("oak_planks_redstone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.OAK_PLANKS_REDSTONE_TORCH.get(), ModBlocks.OAK_PLANKS_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> SPRUCE_LOG_TORCH_ITEM = ITEMS.register("spruce_log_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.SPRUCE_LOG_TORCH.get(), ModBlocks.SPRUCE_LOG_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> SPRUCE_LOG_REDSTONE_TORCH_ITEM = ITEMS.register("spruce_log_redstone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.SPRUCE_LOG_REDSTONE_TORCH.get(), ModBlocks.SPRUCE_LOG_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> SPRUCE_PLANKS_TORCH_ITEM = ITEMS.register("spruce_planks_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.SPRUCE_PLANKS_TORCH.get(), ModBlocks.SPRUCE_PLANKS_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> SPRUCE_PLANKS_REDSTONE_TORCH_ITEM = ITEMS.register("spruce_planks_redstone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.SPRUCE_PLANKS_REDSTONE_TORCH.get(), ModBlocks.SPRUCE_PLANKS_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> BIRCH_LOG_TORCH_ITEM = ITEMS.register("birch_log_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.BIRCH_LOG_TORCH.get(), ModBlocks.BIRCH_LOG_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> BIRCH_LOG_REDSTONE_TORCH_ITEM = ITEMS.register("birch_log_redstone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.BIRCH_LOG_REDSTONE_TORCH.get(), ModBlocks.BIRCH_LOG_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> BIRCH_PLANKS_TORCH_ITEM = ITEMS.register("birch_planks_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.BIRCH_PLANKS_TORCH.get(), ModBlocks.BIRCH_PLANKS_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> BIRCH_PLANKS_REDSTONE_TORCH_ITEM = ITEMS.register("birch_planks_redstone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.BIRCH_PLANKS_REDSTONE_TORCH.get(), ModBlocks.BIRCH_PLANKS_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> JUNGLE_LOG_TORCH_ITEM = ITEMS.register("jungle_log_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.JUNGLE_LOG_TORCH.get(), ModBlocks.JUNGLE_LOG_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> JUNGLE_LOG_REDSTONE_TORCH_ITEM = ITEMS.register("jungle_log_redstone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.JUNGLE_LOG_REDSTONE_TORCH.get(), ModBlocks.JUNGLE_LOG_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> JUNGLE_PLANKS_TORCH_ITEM = ITEMS.register("jungle_planks_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.JUNGLE_PLANKS_TORCH.get(), ModBlocks.JUNGLE_PLANKS_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> JUNGLE_PLANKS_REDSTONE_TORCH_ITEM = ITEMS.register("jungle_planks_redstone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.JUNGLE_PLANKS_REDSTONE_TORCH.get(), ModBlocks.JUNGLE_PLANKS_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> ACACIA_LOG_TORCH_ITEM = ITEMS.register("acacia_log_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.ACACIA_LOG_TORCH.get(), ModBlocks.ACACIA_LOG_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> ACACIA_LOG_REDSTONE_TORCH_ITEM = ITEMS.register("acacia_log_redstone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.ACACIA_LOG_REDSTONE_TORCH.get(), ModBlocks.ACACIA_LOG_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> ACACIA_PLANKS_TORCH_ITEM = ITEMS.register("acacia_planks_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.ACACIA_PLANKS_TORCH.get(), ModBlocks.ACACIA_PLANKS_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> ACACIA_PLANKS_REDSTONE_TORCH_ITEM = ITEMS.register("acacia_planks_redstone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.ACACIA_PLANKS_REDSTONE_TORCH.get(), ModBlocks.ACACIA_PLANKS_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> DARK_OAK_LOG_TORCH_ITEM = ITEMS.register("dark_oak_log_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.DARK_OAK_LOG_TORCH.get(), ModBlocks.DARK_OAK_LOG_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> DARK_OAK_LOG_REDSTONE_TORCH_ITEM = ITEMS.register("dark_oak_log_redstone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.DARK_OAK_LOG_REDSTONE_TORCH.get(), ModBlocks.DARK_OAK_LOG_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> DARK_OAK_PLANKS_TORCH_ITEM = ITEMS.register("dark_oak_planks_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.DARK_OAK_PLANKS_TORCH.get(), ModBlocks.DARK_OAK_PLANKS_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> DARK_OAK_PLANKS_REDSTONE_TORCH_ITEM = ITEMS.register("dark_oak_planks_redstone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.DARK_OAK_PLANKS_REDSTONE_TORCH.get(), ModBlocks.DARK_OAK_PLANKS_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> MANGROVE_LOG_TORCH_ITEM = ITEMS.register("mangrove_log_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.MANGROVE_LOG_TORCH.get(), ModBlocks.MANGROVE_LOG_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> MANGROVE_LOG_REDSTONE_TORCH_ITEM = ITEMS.register("mangrove_log_redstone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.MANGROVE_LOG_REDSTONE_TORCH.get(), ModBlocks.MANGROVE_LOG_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> MANGROVE_PLANKS_TORCH_ITEM = ITEMS.register("mangrove_planks_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.MANGROVE_PLANKS_TORCH.get(), ModBlocks.MANGROVE_PLANKS_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> MANGROVE_PLANKS_REDSTONE_TORCH_ITEM = ITEMS.register("mangrove_planks_redstone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.MANGROVE_PLANKS_REDSTONE_TORCH.get(), ModBlocks.MANGROVE_PLANKS_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> CRIMSON_STEM_TORCH_ITEM = ITEMS.register("crimson_stem_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.CRIMSON_STEM_TORCH.get(), ModBlocks.CRIMSON_STEM_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> CRIMSON_STEM_REDSTONE_TORCH_ITEM = ITEMS.register("crimson_stem_redstone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.CRIMSON_STEM_REDSTONE_TORCH.get(), ModBlocks.CRIMSON_STEM_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> CRIMSON_PLANKS_TORCH_ITEM = ITEMS.register("crimson_planks_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.CRIMSON_PLANKS_TORCH.get(), ModBlocks.CRIMSON_PLANKS_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> CRIMSON_PLANKS_REDSTONE_TORCH_ITEM = ITEMS.register("crimson_planks_redstone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.CRIMSON_PLANKS_REDSTONE_TORCH.get(), ModBlocks.CRIMSON_PLANKS_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> WARPED_STEM_TORCH_ITEM = ITEMS.register("warped_stem_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.WARPED_STEM_TORCH.get(), ModBlocks.WARPED_STEM_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> WARPED_STEM_REDSTONE_TORCH_ITEM = ITEMS.register("warped_stem_redstone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.WARPED_STEM_REDSTONE_TORCH.get(), ModBlocks.WARPED_STEM_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> WARPED_PLANKS_TORCH_ITEM = ITEMS.register("warped_planks_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.WARPED_PLANKS_TORCH.get(), ModBlocks.WARPED_PLANKS_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> WARPED_PLANKS_REDSTONE_TORCH_ITEM = ITEMS.register("warped_planks_redstone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.WARPED_PLANKS_REDSTONE_TORCH.get(), ModBlocks.WARPED_PLANKS_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> CHERRY_LOG_TORCH_ITEM = ITEMS.register("cherry_log_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.CHERRY_LOG_TORCH.get(), ModBlocks.CHERRY_LOG_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> CHERRY_LOG_REDSTONE_TORCH_ITEM = ITEMS.register("cherry_log_redstone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.CHERRY_LOG_REDSTONE_TORCH.get(), ModBlocks.CHERRY_LOG_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> CHERRY_PLANKS_TORCH_ITEM = ITEMS.register("cherry_planks_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.CHERRY_PLANKS_TORCH.get(), ModBlocks.CHERRY_PLANKS_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> CHERRY_PLANKS_REDSTONE_TORCH_ITEM = ITEMS.register("cherry_planks_redstone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.CHERRY_PLANKS_REDSTONE_TORCH.get(), ModBlocks.CHERRY_PLANKS_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> BAMBOO_BLOCK_TORCH_ITEM = ITEMS.register("bamboo_block_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.BAMBOO_BLOCK_TORCH.get(), ModBlocks.BAMBOO_BLOCK_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> BAMBOO_BLOCK_REDSTONE_TORCH_ITEM = ITEMS.register("bamboo_block_redstone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.BAMBOO_BLOCK_REDSTONE_TORCH.get(), ModBlocks.BAMBOO_BLOCK_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> BAMBOO_PLANKS_TORCH_ITEM = ITEMS.register("bamboo_planks_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.BAMBOO_PLANKS_TORCH.get(), ModBlocks.BAMBOO_PLANKS_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> BAMBOO_PLANKS_REDSTONE_TORCH_ITEM = ITEMS.register("bamboo_planks_redstone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.BAMBOO_PLANKS_REDSTONE_TORCH.get(), ModBlocks.BAMBOO_PLANKS_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> STONE_TORCH_ITEM = ITEMS.register("stone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.STONE_TORCH.get(), ModBlocks.STONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> STONE_REDSTONE_TORCH_ITEM = ITEMS.register("stone_redstone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.STONE_REDSTONE_TORCH.get(), ModBlocks.STONE_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> SMOOTH_STONE_TORCH_ITEM = ITEMS.register("smooth_stone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.SMOOTH_STONE_TORCH.get(), ModBlocks.SMOOTH_STONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> SMOOTH_STONE_REDSTONE_TORCH_ITEM = ITEMS.register("smooth_stone_redstone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.SMOOTH_STONE_REDSTONE_TORCH.get(), ModBlocks.SMOOTH_STONE_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> COBBLESTONE_TORCH_ITEM = ITEMS.register("cobblestone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.COBBLESTONE_TORCH.get(), ModBlocks.COBBLESTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> COBBLESTONE_REDSTONE_TORCH_ITEM = ITEMS.register("cobblestone_redstone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.COBBLESTONE_REDSTONE_TORCH.get(), ModBlocks.COBBLESTONE_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> MOSSY_COBBLESTONE_TORCH_ITEM = ITEMS.register("mossy_cobblestone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.MOSSY_COBBLESTONE_TORCH.get(), ModBlocks.MOSSY_COBBLESTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> MOSSY_COBBLESTONE_REDSTONE_TORCH_ITEM = ITEMS.register("mossy_cobblestone_redstone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.MOSSY_COBBLESTONE_REDSTONE_TORCH.get(), ModBlocks.MOSSY_COBBLESTONE_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> STONE_BRICKS_TORCH_ITEM = ITEMS.register("stone_bricks_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.STONE_BRICKS_TORCH.get(), ModBlocks.STONE_BRICKS_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> STONE_BRICKS_REDSTONE_TORCH_ITEM = ITEMS.register("stone_bricks_redstone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.STONE_BRICKS_REDSTONE_TORCH.get(), ModBlocks.STONE_BRICKS_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> MOSSY_STONE_BRICKS_TORCH_ITEM = ITEMS.register("mossy_stone_bricks_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.MOSSY_STONE_BRICKS_TORCH.get(), ModBlocks.MOSSY_STONE_BRICKS_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> MOSSY_STONE_BRICKS_REDSTONE_TORCH_ITEM = ITEMS.register("mossy_stone_bricks_redstone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.MOSSY_STONE_BRICKS_REDSTONE_TORCH.get(), ModBlocks.MOSSY_STONE_BRICKS_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> CHISELED_STONE_BRICKS_TORCH_ITEM = ITEMS.register("chiseled_stone_bricks_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.CHISELED_STONE_BRICKS_TORCH.get(), ModBlocks.CHISELED_STONE_BRICKS_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> CHISELED_STONE_BRICKS_REDSTONE_TORCH_ITEM = ITEMS.register("chiseled_stone_bricks_redstone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.CHISELED_STONE_BRICKS_REDSTONE_TORCH.get(), ModBlocks.CHISELED_STONE_BRICKS_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> GRANITE_TORCH_ITEM = ITEMS.register("granite_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.GRANITE_TORCH.get(), ModBlocks.GRANITE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> GRANITE_REDSTONE_TORCH_ITEM = ITEMS.register("granite_redstone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.GRANITE_REDSTONE_TORCH.get(), ModBlocks.GRANITE_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> POLISHED_GRANITE_TORCH_ITEM = ITEMS.register("polished_granite_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.POLISHED_GRANITE_TORCH.get(), ModBlocks.POLISHED_GRANITE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> POLISHED_GRANITE_REDSTONE_TORCH_ITEM = ITEMS.register("polished_granite_redstone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.POLISHED_GRANITE_REDSTONE_TORCH.get(), ModBlocks.POLISHED_GRANITE_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> DIORITE_TORCH_ITEM = ITEMS.register("diorite_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.DIORITE_TORCH.get(), ModBlocks.DIORITE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> DIORITE_REDSTONE_TORCH_ITEM = ITEMS.register("diorite_redstone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.DIORITE_REDSTONE_TORCH.get(), ModBlocks.DIORITE_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> POLISHED_DIORITE_TORCH_ITEM = ITEMS.register("polished_diorite_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.POLISHED_DIORITE_TORCH.get(), ModBlocks.POLISHED_DIORITE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> POLISHED_DIORITE_REDSTONE_TORCH_ITEM = ITEMS.register("polished_diorite_redstone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.POLISHED_DIORITE_REDSTONE_TORCH.get(), ModBlocks.POLISHED_DIORITE_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> ANDESITE_TORCH_ITEM = ITEMS.register("andesite_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.ANDESITE_TORCH.get(), ModBlocks.ANDESITE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> ANDESITE_REDSTONE_TORCH_ITEM = ITEMS.register("andesite_redstone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.ANDESITE_REDSTONE_TORCH.get(), ModBlocks.ANDESITE_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> POLISHED_ANDESITE_TORCH_ITEM = ITEMS.register("polished_andesite_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.POLISHED_ANDESITE_TORCH.get(), ModBlocks.POLISHED_ANDESITE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> POLISHED_ANDESITE_REDSTONE_TORCH_ITEM = ITEMS.register("polished_andesite_redstone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.POLISHED_ANDESITE_REDSTONE_TORCH.get(), ModBlocks.POLISHED_ANDESITE_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> DEEPSLATE_TORCH_ITEM = ITEMS.register("deepslate_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.DEEPSLATE_TORCH.get(), ModBlocks.DEEPSLATE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> DEEPSLATE_REDSTONE_TORCH_ITEM = ITEMS.register("deepslate_redstone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.DEEPSLATE_REDSTONE_TORCH.get(), ModBlocks.DEEPSLATE_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> COBBLED_DEEPSLATE_TORCH_ITEM = ITEMS.register("cobbled_deepslate_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.COBBLED_DEEPSLATE_TORCH.get(), ModBlocks.COBBLED_DEEPSLATE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> COBBLED_DEEPSLATE_REDSTONE_TORCH_ITEM = ITEMS.register("cobbled_deepslate_redstone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.COBBLED_DEEPSLATE_REDSTONE_TORCH.get(), ModBlocks.COBBLED_DEEPSLATE_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> CHISELED_DEEPSLATE_TORCH_ITEM = ITEMS.register("chiseled_deepslate_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.CHISELED_DEEPSLATE_TORCH.get(), ModBlocks.CHISELED_DEEPSLATE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> CHISELED_DEEPSLATE_REDSTONE_TORCH_ITEM = ITEMS.register("chiseled_deepslate_redstone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.CHISELED_DEEPSLATE_REDSTONE_TORCH.get(), ModBlocks.CHISELED_DEEPSLATE_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> POLISHED_DEEPSLATE_TORCH_ITEM = ITEMS.register("polished_deepslate_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.POLISHED_DEEPSLATE_TORCH.get(), ModBlocks.POLISHED_DEEPSLATE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> POLISHED_DEEPSLATE_REDSTONE_TORCH_ITEM = ITEMS.register("polished_deepslate_redstone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.POLISHED_DEEPSLATE_REDSTONE_TORCH.get(), ModBlocks.POLISHED_DEEPSLATE_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> DEEPSLATE_BRICKS_TORCH_ITEM = ITEMS.register("deepslate_bricks_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.DEEPSLATE_BRICKS_TORCH.get(), ModBlocks.DEEPSLATE_BRICKS_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> DEEPSLATE_BRICKS_REDSTONE_TORCH_ITEM = ITEMS.register("deepslate_bricks_redstone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.DEEPSLATE_BRICKS_REDSTONE_TORCH.get(), ModBlocks.DEEPSLATE_BRICKS_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> CRACKED_DEEPSLATE_BRICKS_TORCH_ITEM = ITEMS.register("cracked_deepslate_bricks_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.CRACKED_DEEPSLATE_BRICKS_TORCH.get(), ModBlocks.CRACKED_DEEPSLATE_BRICKS_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> CRACKED_DEEPSLATE_BRICKS_REDSTONE_TORCH_ITEM = ITEMS.register("cracked_deepslate_bricks_redstone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.CRACKED_DEEPSLATE_BRICKS_REDSTONE_TORCH.get(), ModBlocks.CRACKED_DEEPSLATE_BRICKS_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> DEEPSLATE_TILES_TORCH_ITEM = ITEMS.register("deepslate_tiles_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.DEEPSLATE_TILES_TORCH.get(), ModBlocks.DEEPSLATE_TILES_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> DEEPSLATE_TILES_REDSTONE_TORCH_ITEM = ITEMS.register("deepslate_tiles_redstone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.DEEPSLATE_TILES_REDSTONE_TORCH.get(), ModBlocks.DEEPSLATE_TILES_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> CRACKED_DEEPSLATE_TILES_TORCH_ITEM = ITEMS.register("cracked_deepslate_tiles_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.CRACKED_DEEPSLATE_TILES_TORCH.get(), ModBlocks.CRACKED_DEEPSLATE_TILES_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> CRACKED_DEEPSLATE_TILES_REDSTONE_TORCH_ITEM = ITEMS.register("cracked_deepslate_tiles_redstone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.CRACKED_DEEPSLATE_TILES_REDSTONE_TORCH.get(), ModBlocks.CRACKED_DEEPSLATE_TILES_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> BRICKS_TORCH_ITEM = ITEMS.register("bricks_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.BRICKS_TORCH.get(), ModBlocks.BRICKS_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> BRICKS_REDSTONE_TORCH_ITEM = ITEMS.register("bricks_redstone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.BRICKS_REDSTONE_TORCH.get(), ModBlocks.BRICKS_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> PACKED_MUD_TORCH_ITEM = ITEMS.register("packed_mud_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.PACKED_MUD_TORCH.get(), ModBlocks.PACKED_MUD_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> PACKED_MUD_REDSTONE_TORCH_ITEM = ITEMS.register("packed_mud_redstone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.PACKED_MUD_REDSTONE_TORCH.get(), ModBlocks.PACKED_MUD_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> MUD_BRICKS_TORCH_ITEM = ITEMS.register("mud_bricks_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.MUD_BRICKS_TORCH.get(), ModBlocks.MUD_BRICKS_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> MUD_BRICKS_REDSTONE_TORCH_ITEM = ITEMS.register("mud_bricks_redstone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.MUD_BRICKS_REDSTONE_TORCH.get(), ModBlocks.MUD_BRICKS_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> SANDSTONE_TORCH_ITEM = ITEMS.register("sandstone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.SANDSTONE_TORCH.get(), ModBlocks.SANDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> SANDSTONE_REDSTONE_TORCH_ITEM = ITEMS.register("sandstone_redstone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.SANDSTONE_REDSTONE_TORCH.get(), ModBlocks.SANDSTONE_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> CHISELED_SANDSTONE_TORCH_ITEM = ITEMS.register("chiseled_sandstone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.CHISELED_SANDSTONE_TORCH.get(), ModBlocks.CHISELED_SANDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> CHISELED_SANDSTONE_REDSTONE_TORCH_ITEM = ITEMS.register("chiseled_sandstone_redstone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.CHISELED_SANDSTONE_REDSTONE_TORCH.get(), ModBlocks.CHISELED_SANDSTONE_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> SMOOTH_SANDSTONE_TORCH_ITEM = ITEMS.register("smooth_sandstone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.SMOOTH_SANDSTONE_TORCH.get(), ModBlocks.SMOOTH_SANDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> SMOOTH_SANDSTONE_REDSTONE_TORCH_ITEM = ITEMS.register("smooth_sandstone_redstone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.SMOOTH_SANDSTONE_REDSTONE_TORCH.get(), ModBlocks.SMOOTH_SANDSTONE_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> CUT_SANDSTONE_TORCH_ITEM = ITEMS.register("cut_sandstone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.CUT_SANDSTONE_TORCH.get(), ModBlocks.CUT_SANDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> CUT_SANDSTONE_REDSTONE_TORCH_ITEM = ITEMS.register("cut_sandstone_redstone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.CUT_SANDSTONE_REDSTONE_TORCH.get(), ModBlocks.CUT_SANDSTONE_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> RED_SANDSTONE_TORCH_ITEM = ITEMS.register("red_sandstone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.RED_SANDSTONE_TORCH.get(), ModBlocks.RED_SANDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> RED_SANDSTONE_REDSTONE_TORCH_ITEM = ITEMS.register("red_sandstone_redstone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.RED_SANDSTONE_REDSTONE_TORCH.get(), ModBlocks.RED_SANDSTONE_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> CHISELED_RED_SANDSTONE_TORCH_ITEM = ITEMS.register("chiseled_red_sandstone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.CHISELED_RED_SANDSTONE_TORCH.get(), ModBlocks.CHISELED_RED_SANDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> CHISELED_RED_SANDSTONE_REDSTONE_TORCH_ITEM = ITEMS.register("chiseled_red_sandstone_redstone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.CHISELED_RED_SANDSTONE_REDSTONE_TORCH.get(), ModBlocks.CHISELED_RED_SANDSTONE_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> SMOOTH_RED_SANDSTONE_TORCH_ITEM = ITEMS.register("smooth_red_sandstone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.SMOOTH_RED_SANDSTONE_TORCH.get(), ModBlocks.SMOOTH_RED_SANDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> SMOOTH_RED_SANDSTONE_REDSTONE_TORCH_ITEM = ITEMS.register("smooth_red_sandstone_redstone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.SMOOTH_RED_SANDSTONE_REDSTONE_TORCH.get(), ModBlocks.SMOOTH_RED_SANDSTONE_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> CUT_RED_SANDSTONE_TORCH_ITEM = ITEMS.register("cut_red_sandstone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.CUT_RED_SANDSTONE_TORCH.get(), ModBlocks.CUT_RED_SANDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> CUT_RED_SANDSTONE_REDSTONE_TORCH_ITEM = ITEMS.register("cut_red_sandstone_redstone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.CUT_RED_SANDSTONE_REDSTONE_TORCH.get(), ModBlocks.CUT_RED_SANDSTONE_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> PRISMARINE_TORCH_ITEM = ITEMS.register("prismarine_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.PRISMARINE_TORCH.get(), ModBlocks.PRISMARINE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> PRISMARINE_REDSTONE_TORCH_ITEM = ITEMS.register("prismarine_redstone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.PRISMARINE_REDSTONE_TORCH.get(), ModBlocks.PRISMARINE_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> PRISMARINE_BRICKS_TORCH_ITEM = ITEMS.register("prismarine_bricks_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.PRISMARINE_BRICKS_TORCH.get(), ModBlocks.PRISMARINE_BRICKS_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> PRISMARINE_BRICKS_REDSTONE_TORCH_ITEM = ITEMS.register("prismarine_bricks_redstone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.PRISMARINE_BRICKS_REDSTONE_TORCH.get(), ModBlocks.PRISMARINE_BRICKS_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> DARK_PRISMARINE_TORCH_ITEM = ITEMS.register("dark_prismarine_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.DARK_PRISMARINE_TORCH.get(), ModBlocks.DARK_PRISMARINE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> DARK_PRISMARINE_REDSTONE_TORCH_ITEM = ITEMS.register("dark_prismarine_redstone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.DARK_PRISMARINE_REDSTONE_TORCH.get(), ModBlocks.DARK_PRISMARINE_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> NETHERRACK_TORCH_ITEM = ITEMS.register("netherrack_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.NETHERRACK_TORCH.get(), ModBlocks.NETHERRACK_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> NETHERRACK_REDSTONE_TORCH_ITEM = ITEMS.register("netherrack_redstone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.NETHERRACK_REDSTONE_TORCH.get(), ModBlocks.NETHERRACK_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> NETHER_BRICKS_TORCH_ITEM = ITEMS.register("nether_bricks_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.NETHER_BRICKS_TORCH.get(), ModBlocks.NETHER_BRICKS_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> NETHER_BRICKS_REDSTONE_TORCH_ITEM = ITEMS.register("nether_bricks_redstone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.NETHER_BRICKS_REDSTONE_TORCH.get(), ModBlocks.NETHER_BRICKS_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> CRACKED_NETHER_BRICKS_TORCH_ITEM = ITEMS.register("cracked_nether_bricks_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.CRACKED_NETHER_BRICKS_TORCH.get(), ModBlocks.CRACKED_NETHER_BRICKS_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> CRACKED_NETHER_BRICKS_REDSTONE_TORCH_ITEM = ITEMS.register("cracked_nether_bricks_redstone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.CRACKED_NETHER_BRICKS_REDSTONE_TORCH.get(), ModBlocks.CRACKED_NETHER_BRICKS_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> CHISELED_NETHER_BRICKS_TORCH_ITEM = ITEMS.register("chiseled_nether_bricks_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.CHISELED_NETHER_BRICKS_TORCH.get(), ModBlocks.CHISELED_NETHER_BRICKS_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> CHISELED_NETHER_BRICKS_REDSTONE_TORCH_ITEM = ITEMS.register("chiseled_nether_bricks_redstone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.CHISELED_NETHER_BRICKS_REDSTONE_TORCH.get(), ModBlocks.CHISELED_NETHER_BRICKS_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> RED_NETHER_BRICKS_TORCH_ITEM = ITEMS.register("red_nether_bricks_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.RED_NETHER_BRICKS_TORCH.get(), ModBlocks.RED_NETHER_BRICKS_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> RED_NETHER_BRICKS_REDSTONE_TORCH_ITEM = ITEMS.register("red_nether_bricks_redstone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.RED_NETHER_BRICKS_REDSTONE_TORCH.get(), ModBlocks.RED_NETHER_BRICKS_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> BASALT_TORCH_ITEM = ITEMS.register("basalt_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.BASALT_TORCH.get(), ModBlocks.BASALT_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> BASALT_REDSTONE_TORCH_ITEM = ITEMS.register("basalt_redstone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.BASALT_REDSTONE_TORCH.get(), ModBlocks.BASALT_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> SMOOTH_BASALT_TORCH_ITEM = ITEMS.register("smooth_basalt_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.SMOOTH_BASALT_TORCH.get(), ModBlocks.SMOOTH_BASALT_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> SMOOTH_BASALT_REDSTONE_TORCH_ITEM = ITEMS.register("smooth_basalt_redstone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.SMOOTH_BASALT_REDSTONE_TORCH.get(), ModBlocks.SMOOTH_BASALT_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> POLISHED_BASALT_TORCH_ITEM = ITEMS.register("polished_basalt_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.POLISHED_BASALT_TORCH.get(), ModBlocks.POLISHED_BASALT_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> POLISHED_BASALT_REDSTONE_TORCH_ITEM = ITEMS.register("polished_basalt_redstone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.POLISHED_BASALT_REDSTONE_TORCH.get(), ModBlocks.POLISHED_BASALT_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> BLACKSTONE_TORCH_ITEM = ITEMS.register("blackstone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.BLACKSTONE_TORCH.get(), ModBlocks.BLACKSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> BLACKSTONE_REDSTONE_TORCH_ITEM = ITEMS.register("blackstone_redstone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.BLACKSTONE_REDSTONE_TORCH.get(), ModBlocks.BLACKSTONE_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> GILDED_BLACKSTONE_TORCH_ITEM = ITEMS.register("gilded_blackstone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.GILDED_BLACKSTONE_TORCH.get(), ModBlocks.GILDED_BLACKSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> GILDED_BLACKSTONE_REDSTONE_TORCH_ITEM = ITEMS.register("gilded_blackstone_redstone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.GILDED_BLACKSTONE_REDSTONE_TORCH.get(), ModBlocks.GILDED_BLACKSTONE_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> CHISELED_POLISHED_BLACKSTONE_TORCH_ITEM = ITEMS.register("chiseled_polished_blackstone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.CHISELED_POLISHED_BLACKSTONE_TORCH.get(), ModBlocks.CHISELED_POLISHED_BLACKSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> CHISELED_POLISHED_BLACKSTONE_REDSTONE_TORCH_ITEM = ITEMS.register("chiseled_polished_blackstone_redstone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.CHISELED_POLISHED_BLACKSTONE_REDSTONE_TORCH.get(), ModBlocks.CHISELED_POLISHED_BLACKSTONE_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> POLISHED_BLACKSTONE_TORCH_ITEM = ITEMS.register("polished_blackstone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.POLISHED_BLACKSTONE_TORCH.get(), ModBlocks.POLISHED_BLACKSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> POLISHED_BLACKSTONE_REDSTONE_TORCH_ITEM = ITEMS.register("polished_blackstone_redstone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.POLISHED_BLACKSTONE_REDSTONE_TORCH.get(), ModBlocks.POLISHED_BLACKSTONE_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> POLISHED_BLACKSTONE_BRICKS_TORCH_ITEM = ITEMS.register("polished_blackstone_bricks_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.POLISHED_BLACKSTONE_BRICKS_TORCH.get(), ModBlocks.POLISHED_BLACKSTONE_BRICKS_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> POLISHED_BLACKSTONE_BRICKS_REDSTONE_TORCH_ITEM = ITEMS.register("polished_blackstone_bricks_redstone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.POLISHED_BLACKSTONE_BRICKS_REDSTONE_TORCH.get(), ModBlocks.POLISHED_BLACKSTONE_BRICKS_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> CRACKED_POLISHED_BLACKSTONE_BRICKS_TORCH_ITEM = ITEMS.register("cracked_polished_blackstone_bricks_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICKS_TORCH.get(), ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICKS_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> CRACKED_POLISHED_BLACKSTONE_BRICKS_REDSTONE_TORCH_ITEM = ITEMS.register("cracked_polished_blackstone_bricks_redstone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICKS_REDSTONE_TORCH.get(), ModBlocks.CRACKED_POLISHED_BLACKSTONE_BRICKS_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> END_STONE_TORCH_ITEM = ITEMS.register("end_stone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.END_STONE_TORCH.get(), ModBlocks.END_STONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> END_STONE_REDSTONE_TORCH_ITEM = ITEMS.register("end_stone_redstone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.END_STONE_REDSTONE_TORCH.get(), ModBlocks.END_STONE_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> END_STONE_BRICKS_TORCH_ITEM = ITEMS.register("end_stone_bricks_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.END_STONE_BRICKS_TORCH.get(), ModBlocks.END_STONE_BRICKS_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> END_STONE_BRICKS_REDSTONE_TORCH_ITEM = ITEMS.register("end_stone_bricks_redstone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.END_STONE_BRICKS_REDSTONE_TORCH.get(), ModBlocks.END_STONE_BRICKS_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> PURPUR_BLOCK_TORCH_ITEM = ITEMS.register("purpur_block_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.PURPUR_BLOCK_TORCH.get(), ModBlocks.PURPUR_BLOCK_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> PURPUR_BLOCK_REDSTONE_TORCH_ITEM = ITEMS.register("purpur_block_redstone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.PURPUR_BLOCK_REDSTONE_TORCH.get(), ModBlocks.PURPUR_BLOCK_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> PURPUR_PILLAR_TORCH_ITEM = ITEMS.register("purpur_pillar_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.PURPUR_PILLAR_TORCH.get(), ModBlocks.PURPUR_PILLAR_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> PURPUR_PILLAR_REDSTONE_TORCH_ITEM = ITEMS.register("purpur_pillar_redstone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.PURPUR_PILLAR_REDSTONE_TORCH.get(), ModBlocks.PURPUR_PILLAR_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> IRON_TORCH_ITEM = ITEMS.register("iron_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.IRON_TORCH.get(), ModBlocks.IRON_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> IRON_REDSTONE_TORCH_ITEM = ITEMS.register("iron_redstone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.IRON_REDSTONE_TORCH.get(), ModBlocks.IRON_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> GOLD_TORCH_ITEM = ITEMS.register("gold_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.GOLD_TORCH.get(), ModBlocks.GOLD_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> GOLD_REDSTONE_TORCH_ITEM = ITEMS.register("gold_redstone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.GOLD_REDSTONE_TORCH.get(), ModBlocks.GOLD_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> REDSTONE_TORCH_ITEM = ITEMS.register("redstone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.REDSTONE_TORCH.get(), ModBlocks.REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> REDSTONE_REDSTONE_TORCH_ITEM = ITEMS.register("redstone_redstone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.REDSTONE_REDSTONE_TORCH.get(), ModBlocks.REDSTONE_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> EMERALD_TORCH_ITEM = ITEMS.register("emerald_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.EMERALD_TORCH.get(), ModBlocks.EMERALD_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> EMERALD_REDSTONE_TORCH_ITEM = ITEMS.register("emerald_redstone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.EMERALD_REDSTONE_TORCH.get(), ModBlocks.EMERALD_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> LAPIS_LAZULI_TORCH_ITEM = ITEMS.register("lapis_lazuli_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.LAPIS_LAZULI_TORCH.get(), ModBlocks.LAPIS_LAZULI_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> LAPIS_LAZULI_REDSTONE_TORCH_ITEM = ITEMS.register("lapis_lazuli_redstone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.LAPIS_LAZULI_REDSTONE_TORCH.get(), ModBlocks.LAPIS_LAZULI_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> DIAMOND_TORCH_ITEM = ITEMS.register("diamond_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.DIAMOND_TORCH.get(), ModBlocks.DIAMOND_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> DIAMOND_REDSTONE_TORCH_ITEM = ITEMS.register("diamond_redstone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.DIAMOND_REDSTONE_TORCH.get(), ModBlocks.DIAMOND_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> NETHERITE_TORCH_ITEM = ITEMS.register("netherite_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.NETHERITE_TORCH.get(), ModBlocks.NETHERITE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> NETHERITE_REDSTONE_TORCH_ITEM = ITEMS.register("netherite_redstone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.NETHERITE_REDSTONE_TORCH.get(), ModBlocks.NETHERITE_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> QUARTZ_TORCH_ITEM = ITEMS.register("quartz_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.QUARTZ_TORCH.get(), ModBlocks.QUARTZ_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> QUARTZ_REDSTONE_TORCH_ITEM = ITEMS.register("quartz_redstone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.QUARTZ_REDSTONE_TORCH.get(), ModBlocks.QUARTZ_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> CHISELED_QUARTZ_TORCH_ITEM = ITEMS.register("chiseled_quartz_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.CHISELED_QUARTZ_TORCH.get(), ModBlocks.CHISELED_QUARTZ_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> CHISELED_QUARTZ_REDSTONE_TORCH_ITEM = ITEMS.register("chiseled_quartz_redstone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.CHISELED_QUARTZ_REDSTONE_TORCH.get(), ModBlocks.CHISELED_QUARTZ_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> QUARTZ_BRICKS_TORCH_ITEM = ITEMS.register("quartz_bricks_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.QUARTZ_BRICKS_TORCH.get(), ModBlocks.QUARTZ_BRICKS_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> QUARTZ_BRICKS_REDSTONE_TORCH_ITEM = ITEMS.register("quartz_bricks_redstone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.QUARTZ_BRICKS_REDSTONE_TORCH.get(), ModBlocks.QUARTZ_BRICKS_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> QUARTZ_PILLAR_TORCH_ITEM = ITEMS.register("quartz_pillar_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.QUARTZ_PILLAR_TORCH.get(), ModBlocks.QUARTZ_PILLAR_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> QUARTZ_PILLAR_REDSTONE_TORCH_ITEM = ITEMS.register("quartz_pillar_redstone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.QUARTZ_PILLAR_REDSTONE_TORCH.get(), ModBlocks.QUARTZ_PILLAR_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> SMOOTH_QUARTZ_TORCH_ITEM = ITEMS.register("smooth_quartz_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.SMOOTH_QUARTZ_TORCH.get(), ModBlocks.SMOOTH_QUARTZ_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> SMOOTH_QUARTZ_REDSTONE_TORCH_ITEM = ITEMS.register("smooth_quartz_redstone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.SMOOTH_QUARTZ_REDSTONE_TORCH.get(), ModBlocks.SMOOTH_QUARTZ_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> AMETHYST_TORCH_ITEM = ITEMS.register("amethyst_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.AMETHYST_TORCH.get(), ModBlocks.AMETHYST_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> AMETHYST_REDSTONE_TORCH_ITEM = ITEMS.register("amethyst_redstone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.AMETHYST_REDSTONE_TORCH.get(), ModBlocks.AMETHYST_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> COPPER_TORCH_ITEM = ITEMS.register("copper_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.COPPER_TORCH.get(), ModBlocks.COPPER_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> COPPER_REDSTONE_TORCH_ITEM = ITEMS.register("copper_redstone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.COPPER_REDSTONE_TORCH.get(), ModBlocks.COPPER_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> CUT_COPPER_TORCH_ITEM = ITEMS.register("cut_copper_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.CUT_COPPER_TORCH.get(), ModBlocks.CUT_COPPER_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> CUT_COPPER_REDSTONE_TORCH_ITEM = ITEMS.register("cut_copper_redstone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.CUT_COPPER_REDSTONE_TORCH.get(), ModBlocks.CUT_COPPER_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> EXPOSED_COPPER_TORCH_ITEM = ITEMS.register("exposed_copper_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.EXPOSED_COPPER_TORCH.get(), ModBlocks.EXPOSED_COPPER_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> EXPOSED_COPPER_REDSTONE_TORCH_ITEM = ITEMS.register("exposed_copper_redstone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.EXPOSED_COPPER_REDSTONE_TORCH.get(), ModBlocks.EXPOSED_COPPER_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> EXPOSED_CUT_COPPER_TORCH_ITEM = ITEMS.register("exposed_cut_copper_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.EXPOSED_CUT_COPPER_TORCH.get(), ModBlocks.EXPOSED_CUT_COPPER_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> EXPOSED_CUT_COPPER_REDSTONE_TORCH_ITEM = ITEMS.register("exposed_cut_copper_redstone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.EXPOSED_CUT_COPPER_REDSTONE_TORCH.get(), ModBlocks.EXPOSED_CUT_COPPER_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> WEATHERED_COPPER_TORCH_ITEM = ITEMS.register("weathered_copper_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.WEATHERED_COPPER_TORCH.get(), ModBlocks.WEATHERED_COPPER_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> WEATHERED_COPPER_REDSTONE_TORCH_ITEM = ITEMS.register("weathered_copper_redstone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.WEATHERED_COPPER_REDSTONE_TORCH.get(), ModBlocks.WEATHERED_COPPER_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> WEATHERED_CUT_COPPER_TORCH_ITEM = ITEMS.register("weathered_cut_copper_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.WEATHERED_CUT_COPPER_TORCH.get(), ModBlocks.WEATHERED_CUT_COPPER_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> WEATHERED_CUT_COPPER_REDSTONE_TORCH_ITEM = ITEMS.register("weathered_cut_copper_redstone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.WEATHERED_CUT_COPPER_REDSTONE_TORCH.get(), ModBlocks.WEATHERED_CUT_COPPER_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> OXIDIZED_COPPER_TORCH_ITEM = ITEMS.register("oxidized_copper_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.OXIDIZED_COPPER_TORCH.get(), ModBlocks.OXIDIZED_COPPER_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> OXIDIZED_COPPER_REDSTONE_TORCH_ITEM = ITEMS.register("oxidized_copper_redstone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.OXIDIZED_COPPER_REDSTONE_TORCH.get(), ModBlocks.OXIDIZED_COPPER_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> OXIDIZED_CUT_COPPER_TORCH_ITEM = ITEMS.register("oxidized_cut_copper_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.OXIDIZED_CUT_COPPER_TORCH.get(), ModBlocks.OXIDIZED_CUT_COPPER_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> OXIDIZED_CUT_COPPER_REDSTONE_TORCH_ITEM = ITEMS.register("oxidized_cut_copper_redstone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.OXIDIZED_CUT_COPPER_REDSTONE_TORCH.get(), ModBlocks.OXIDIZED_CUT_COPPER_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> WAXED_COPPER_TORCH_ITEM = ITEMS.register("waxed_copper_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.WAXED_COPPER_TORCH.get(), ModBlocks.WAXED_COPPER_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> WAXED_COPPER_REDSTONE_TORCH_ITEM = ITEMS.register("waxed_copper_redstone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.WAXED_COPPER_REDSTONE_TORCH.get(), ModBlocks.WAXED_COPPER_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> WAXED_CUT_COPPER_TORCH_ITEM = ITEMS.register("waxed_cut_copper_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.WAXED_CUT_COPPER_TORCH.get(), ModBlocks.WAXED_CUT_COPPER_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> WAXED_CUT_COPPER_REDSTONE_TORCH_ITEM = ITEMS.register("waxed_cut_copper_redstone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.WAXED_CUT_COPPER_REDSTONE_TORCH.get(), ModBlocks.WAXED_CUT_COPPER_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> WAXED_EXPOSED_COPPER_TORCH_ITEM = ITEMS.register("waxed_exposed_copper_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.WAXED_EXPOSED_COPPER_TORCH.get(), ModBlocks.WAXED_EXPOSED_COPPER_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> WAXED_EXPOSED_COPPER_REDSTONE_TORCH_ITEM = ITEMS.register("waxed_exposed_copper_redstone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.WAXED_EXPOSED_COPPER_REDSTONE_TORCH.get(), ModBlocks.WAXED_EXPOSED_COPPER_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> WAXED_EXPOSED_CUT_COPPER_TORCH_ITEM = ITEMS.register("waxed_exposed_cut_copper_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.WAXED_EXPOSED_CUT_COPPER_TORCH.get(), ModBlocks.WAXED_EXPOSED_CUT_COPPER_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> WAXED_EXPOSED_CUT_COPPER_REDSTONE_TORCH_ITEM = ITEMS.register("waxed_exposed_cut_copper_redstone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.WAXED_EXPOSED_CUT_COPPER_REDSTONE_TORCH.get(), ModBlocks.WAXED_EXPOSED_CUT_COPPER_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> WAXED_WEATHERED_COPPER_TORCH_ITEM = ITEMS.register("waxed_weathered_copper_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.WAXED_WEATHERED_COPPER_TORCH.get(), ModBlocks.WAXED_WEATHERED_COPPER_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> WAXED_WEATHERED_COPPER_REDSTONE_TORCH_ITEM = ITEMS.register("waxed_weathered_copper_redstone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.WAXED_WEATHERED_COPPER_REDSTONE_TORCH.get(), ModBlocks.WAXED_WEATHERED_COPPER_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> WAXED_WEATHERED_CUT_COPPER_TORCH_ITEM = ITEMS.register("waxed_weathered_cut_copper_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.WAXED_WEATHERED_CUT_COPPER_TORCH.get(), ModBlocks.WAXED_WEATHERED_CUT_COPPER_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> WAXED_WEATHERED_CUT_COPPER_REDSTONE_TORCH_ITEM = ITEMS.register("waxed_weathered_cut_copper_redstone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.WAXED_WEATHERED_CUT_COPPER_REDSTONE_TORCH.get(), ModBlocks.WAXED_WEATHERED_CUT_COPPER_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> WAXED_OXIDIZED_COPPER_TORCH_ITEM = ITEMS.register("waxed_oxidized_copper_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.WAXED_OXIDIZED_COPPER_TORCH.get(), ModBlocks.WAXED_OXIDIZED_COPPER_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> WAXED_OXIDIZED_COPPER_REDSTONE_TORCH_ITEM = ITEMS.register("waxed_oxidized_copper_redstone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.WAXED_OXIDIZED_COPPER_REDSTONE_TORCH.get(), ModBlocks.WAXED_OXIDIZED_COPPER_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> WAXED_OXIDIZED_CUT_COPPER_TORCH_ITEM = ITEMS.register("waxed_oxidized_cut_copper_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.WAXED_OXIDIZED_CUT_COPPER_TORCH.get(), ModBlocks.WAXED_OXIDIZED_CUT_COPPER_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<StandingAndWallBlockItem> WAXED_OXIDIZED_CUT_COPPER_REDSTONE_TORCH_ITEM = ITEMS.register("waxed_oxidized_cut_copper_redstone_torch",
            () -> new StandingAndWallBlockItem(ModBlocks.WAXED_OXIDIZED_CUT_COPPER_REDSTONE_TORCH.get(), ModBlocks.WAXED_OXIDIZED_CUT_COPPER_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));

}
