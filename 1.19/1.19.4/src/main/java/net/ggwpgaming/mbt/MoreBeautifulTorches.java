package net.ggwpgaming.mbt;

import com.mojang.logging.LogUtils;
import net.ggwpgaming.mbt.block.ModBlocks;
import net.ggwpgaming.mbt.item.ModCreativeModeTabs;
import net.ggwpgaming.mbt.item.ModItems;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(MoreBeautifulTorches.MOD_ID)
public class MoreBeautifulTorches
{
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "mbt";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public MoreBeautifulTorches()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Register the Deferred Register to the mod event bus so blocks get registered
        ModBlocks.register(modEventBus);
        // Register the Deferred Register to the mod event bus so items get registered
        ModItems.register(modEventBus);

        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);


        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
        // Some common setup code
//        LOGGER.info("HELLO FROM COMMON SETUP");
//        LOGGER.info("DIRT BLOCK >> {}", ForgeRegistries.BLOCKS.getKey(Blocks.DIRT));
    }

    private void addCreative(CreativeModeTabEvent.BuildContents event)
    {
        if (event.getTab() == ModCreativeModeTabs.MTC_TAB) {
            event.accept(ModItems.OAK_LOG_TORCH_ITEM);
            event.accept(ModItems.OAK_LOG_REDSTONE_TORCH_ITEM);
            event.accept(ModItems.OAK_PLANKS_TORCH_ITEM);
            event.accept(ModItems.OAK_PLANKS_REDSTONE_TORCH_ITEM);
            event.accept(ModItems.SPRUCE_LOG_TORCH_ITEM);
            event.accept(ModItems.SPRUCE_LOG_REDSTONE_TORCH_ITEM);
            event.accept(ModItems.SPRUCE_PLANKS_TORCH_ITEM);
            event.accept(ModItems.SPRUCE_PLANKS_REDSTONE_TORCH_ITEM);
            event.accept(ModItems.BIRCH_LOG_TORCH_ITEM);
            event.accept(ModItems.BIRCH_LOG_REDSTONE_TORCH_ITEM);
            event.accept(ModItems.BIRCH_PLANKS_TORCH_ITEM);
            event.accept(ModItems.BIRCH_PLANKS_REDSTONE_TORCH_ITEM);
            event.accept(ModItems.JUNGLE_LOG_TORCH_ITEM);
            event.accept(ModItems.JUNGLE_LOG_REDSTONE_TORCH_ITEM);
            event.accept(ModItems.JUNGLE_PLANKS_TORCH_ITEM);
            event.accept(ModItems.JUNGLE_PLANKS_REDSTONE_TORCH_ITEM);
            event.accept(ModItems.ACACIA_LOG_TORCH_ITEM);
            event.accept(ModItems.ACACIA_LOG_REDSTONE_TORCH_ITEM);
            event.accept(ModItems.ACACIA_PLANKS_TORCH_ITEM);
            event.accept(ModItems.ACACIA_PLANKS_REDSTONE_TORCH_ITEM);
            event.accept(ModItems.DARK_OAK_LOG_TORCH_ITEM);
            event.accept(ModItems.DARK_OAK_LOG_REDSTONE_TORCH_ITEM);
            event.accept(ModItems.DARK_OAK_PLANKS_TORCH_ITEM);
            event.accept(ModItems.DARK_OAK_PLANKS_REDSTONE_TORCH_ITEM);
            event.accept(ModItems.MANGROVE_LOG_TORCH_ITEM);
            event.accept(ModItems.MANGROVE_LOG_REDSTONE_TORCH_ITEM);
            event.accept(ModItems.MANGROVE_PLANKS_TORCH_ITEM);
            event.accept(ModItems.MANGROVE_PLANKS_REDSTONE_TORCH_ITEM);
            event.accept(ModItems.CRIMSON_STEM_TORCH_ITEM);
            event.accept(ModItems.CRIMSON_STEM_REDSTONE_TORCH_ITEM);
            event.accept(ModItems.CRIMSON_PLANKS_TORCH_ITEM);
            event.accept(ModItems.CRIMSON_PLANKS_REDSTONE_TORCH_ITEM);
            event.accept(ModItems.WARPED_STEM_TORCH_ITEM);
            event.accept(ModItems.WARPED_STEM_REDSTONE_TORCH_ITEM);
            event.accept(ModItems.WARPED_PLANKS_TORCH_ITEM);
            event.accept(ModItems.WARPED_PLANKS_REDSTONE_TORCH_ITEM);
            event.accept(ModItems.CHERRY_LOG_TORCH_ITEM);
            event.accept(ModItems.CHERRY_LOG_REDSTONE_TORCH_ITEM);
            event.accept(ModItems.CHERRY_PLANKS_TORCH_ITEM);
            event.accept(ModItems.CHERRY_PLANKS_REDSTONE_TORCH_ITEM);
            event.accept(ModItems.BAMBOO_BLOCK_TORCH_ITEM);
            event.accept(ModItems.BAMBOO_BLOCK_REDSTONE_TORCH_ITEM);
            event.accept(ModItems.BAMBOO_PLANKS_TORCH_ITEM);
            event.accept(ModItems.BAMBOO_PLANKS_REDSTONE_TORCH_ITEM);
            event.accept(ModItems.STONE_TORCH_ITEM);
            event.accept(ModItems.STONE_REDSTONE_TORCH_ITEM);
            event.accept(ModItems.SMOOTH_STONE_TORCH_ITEM);
            event.accept(ModItems.SMOOTH_STONE_REDSTONE_TORCH_ITEM);
            event.accept(ModItems.COBBLESTONE_TORCH_ITEM);
            event.accept(ModItems.COBBLESTONE_REDSTONE_TORCH_ITEM);
            event.accept(ModItems.MOSSY_COBBLESTONE_TORCH_ITEM);
            event.accept(ModItems.MOSSY_COBBLESTONE_REDSTONE_TORCH_ITEM);
            event.accept(ModItems.STONE_BRICKS_TORCH_ITEM);
            event.accept(ModItems.STONE_BRICKS_REDSTONE_TORCH_ITEM);
            event.accept(ModItems.MOSSY_STONE_BRICKS_TORCH_ITEM);
            event.accept(ModItems.MOSSY_STONE_BRICKS_REDSTONE_TORCH_ITEM);
            event.accept(ModItems.CHISELED_STONE_BRICKS_TORCH_ITEM);
            event.accept(ModItems.CHISELED_STONE_BRICKS_REDSTONE_TORCH_ITEM);
            event.accept(ModItems.GRANITE_TORCH_ITEM);
            event.accept(ModItems.GRANITE_REDSTONE_TORCH_ITEM);
            event.accept(ModItems.POLISHED_GRANITE_TORCH_ITEM);
            event.accept(ModItems.POLISHED_GRANITE_REDSTONE_TORCH_ITEM);
            event.accept(ModItems.DIORITE_TORCH_ITEM);
            event.accept(ModItems.DIORITE_REDSTONE_TORCH_ITEM);
            event.accept(ModItems.POLISHED_DIORITE_TORCH_ITEM);
            event.accept(ModItems.POLISHED_DIORITE_REDSTONE_TORCH_ITEM);
            event.accept(ModItems.ANDESITE_TORCH_ITEM);
            event.accept(ModItems.ANDESITE_REDSTONE_TORCH_ITEM);
            event.accept(ModItems.POLISHED_ANDESITE_TORCH_ITEM);
            event.accept(ModItems.POLISHED_ANDESITE_REDSTONE_TORCH_ITEM);
            event.accept(ModItems.DEEPSLATE_TORCH_ITEM);
            event.accept(ModItems.DEEPSLATE_REDSTONE_TORCH_ITEM);
            event.accept(ModItems.COBBLED_DEEPSLATE_TORCH_ITEM);
            event.accept(ModItems.COBBLED_DEEPSLATE_REDSTONE_TORCH_ITEM);
            event.accept(ModItems.CHISELED_DEEPSLATE_TORCH_ITEM);
            event.accept(ModItems.CHISELED_DEEPSLATE_REDSTONE_TORCH_ITEM);
            event.accept(ModItems.POLISHED_DEEPSLATE_TORCH_ITEM);
            event.accept(ModItems.POLISHED_DEEPSLATE_REDSTONE_TORCH_ITEM);
            event.accept(ModItems.DEEPSLATE_BRICKS_TORCH_ITEM);
            event.accept(ModItems.DEEPSLATE_BRICKS_REDSTONE_TORCH_ITEM);
            event.accept(ModItems.CRACKED_DEEPSLATE_BRICKS_TORCH_ITEM);
            event.accept(ModItems.CRACKED_DEEPSLATE_BRICKS_REDSTONE_TORCH_ITEM);
            event.accept(ModItems.DEEPSLATE_TILES_TORCH_ITEM);
            event.accept(ModItems.DEEPSLATE_TILES_REDSTONE_TORCH_ITEM);
            event.accept(ModItems.CRACKED_DEEPSLATE_TILES_TORCH_ITEM);
            event.accept(ModItems.CRACKED_DEEPSLATE_TILES_REDSTONE_TORCH_ITEM);
            event.accept(ModItems.BRICKS_TORCH_ITEM);
            event.accept(ModItems.BRICKS_REDSTONE_TORCH_ITEM);
            event.accept(ModItems.PACKED_MUD_TORCH_ITEM);
            event.accept(ModItems.PACKED_MUD_REDSTONE_TORCH_ITEM);
            event.accept(ModItems.MUD_BRICKS_TORCH_ITEM);
            event.accept(ModItems.MUD_BRICKS_REDSTONE_TORCH_ITEM);
            event.accept(ModItems.SANDSTONE_TORCH_ITEM);
            event.accept(ModItems.SANDSTONE_REDSTONE_TORCH_ITEM);
            event.accept(ModItems.CHISELED_SANDSTONE_TORCH_ITEM);
            event.accept(ModItems.CHISELED_SANDSTONE_REDSTONE_TORCH_ITEM);
            event.accept(ModItems.SMOOTH_SANDSTONE_TORCH_ITEM);
            event.accept(ModItems.SMOOTH_SANDSTONE_REDSTONE_TORCH_ITEM);
            event.accept(ModItems.CUT_SANDSTONE_TORCH_ITEM);
            event.accept(ModItems.CUT_SANDSTONE_REDSTONE_TORCH_ITEM);
            event.accept(ModItems.RED_SANDSTONE_TORCH_ITEM);
            event.accept(ModItems.RED_SANDSTONE_REDSTONE_TORCH_ITEM);
            event.accept(ModItems.CHISELED_RED_SANDSTONE_TORCH_ITEM);
            event.accept(ModItems.CHISELED_RED_SANDSTONE_REDSTONE_TORCH_ITEM);
            event.accept(ModItems.SMOOTH_RED_SANDSTONE_TORCH_ITEM);
            event.accept(ModItems.SMOOTH_RED_SANDSTONE_REDSTONE_TORCH_ITEM);
            event.accept(ModItems.CUT_RED_SANDSTONE_TORCH_ITEM);
            event.accept(ModItems.CUT_RED_SANDSTONE_REDSTONE_TORCH_ITEM);
            event.accept(ModItems.PRISMARINE_TORCH_ITEM);
            event.accept(ModItems.PRISMARINE_REDSTONE_TORCH_ITEM);
            event.accept(ModItems.PRISMARINE_BRICKS_TORCH_ITEM);
            event.accept(ModItems.PRISMARINE_BRICKS_REDSTONE_TORCH_ITEM);
            event.accept(ModItems.DARK_PRISMARINE_TORCH_ITEM);
            event.accept(ModItems.DARK_PRISMARINE_REDSTONE_TORCH_ITEM);
            event.accept(ModItems.NETHERRACK_TORCH_ITEM);
            event.accept(ModItems.NETHERRACK_REDSTONE_TORCH_ITEM);
            event.accept(ModItems.NETHER_BRICKS_TORCH_ITEM);
            event.accept(ModItems.NETHER_BRICKS_REDSTONE_TORCH_ITEM);
            event.accept(ModItems.CRACKED_NETHER_BRICKS_TORCH_ITEM);
            event.accept(ModItems.CRACKED_NETHER_BRICKS_REDSTONE_TORCH_ITEM);
            event.accept(ModItems.CHISELED_NETHER_BRICKS_TORCH_ITEM);
            event.accept(ModItems.CHISELED_NETHER_BRICKS_REDSTONE_TORCH_ITEM);
            event.accept(ModItems.RED_NETHER_BRICKS_TORCH_ITEM);
            event.accept(ModItems.RED_NETHER_BRICKS_REDSTONE_TORCH_ITEM);
            event.accept(ModItems.BASALT_TORCH_ITEM);
            event.accept(ModItems.BASALT_REDSTONE_TORCH_ITEM);
            event.accept(ModItems.SMOOTH_BASALT_TORCH_ITEM);
            event.accept(ModItems.SMOOTH_BASALT_REDSTONE_TORCH_ITEM);
            event.accept(ModItems.POLISHED_BASALT_TORCH_ITEM);
            event.accept(ModItems.POLISHED_BASALT_REDSTONE_TORCH_ITEM);
            event.accept(ModItems.BLACKSTONE_TORCH_ITEM);
            event.accept(ModItems.BLACKSTONE_REDSTONE_TORCH_ITEM);
            event.accept(ModItems.GILDED_BLACKSTONE_TORCH_ITEM);
            event.accept(ModItems.GILDED_BLACKSTONE_REDSTONE_TORCH_ITEM);
            event.accept(ModItems.CHISELED_POLISHED_BLACKSTONE_TORCH_ITEM);
            event.accept(ModItems.CHISELED_POLISHED_BLACKSTONE_REDSTONE_TORCH_ITEM);
            event.accept(ModItems.POLISHED_BLACKSTONE_TORCH_ITEM);
            event.accept(ModItems.POLISHED_BLACKSTONE_REDSTONE_TORCH_ITEM);
            event.accept(ModItems.POLISHED_BLACKSTONE_BRICKS_TORCH_ITEM);
            event.accept(ModItems.POLISHED_BLACKSTONE_BRICKS_REDSTONE_TORCH_ITEM);
            event.accept(ModItems.CRACKED_POLISHED_BLACKSTONE_BRICKS_TORCH_ITEM);
            event.accept(ModItems.CRACKED_POLISHED_BLACKSTONE_BRICKS_REDSTONE_TORCH_ITEM);
            event.accept(ModItems.END_STONE_TORCH_ITEM);
            event.accept(ModItems.END_STONE_REDSTONE_TORCH_ITEM);
            event.accept(ModItems.END_STONE_BRICKS_TORCH_ITEM);
            event.accept(ModItems.END_STONE_BRICKS_REDSTONE_TORCH_ITEM);
            event.accept(ModItems.PURPUR_BLOCK_TORCH_ITEM);
            event.accept(ModItems.PURPUR_BLOCK_REDSTONE_TORCH_ITEM);
            event.accept(ModItems.PURPUR_PILLAR_TORCH_ITEM);
            event.accept(ModItems.PURPUR_PILLAR_REDSTONE_TORCH_ITEM);
            event.accept(ModItems.IRON_TORCH_ITEM);
            event.accept(ModItems.IRON_REDSTONE_TORCH_ITEM);
            event.accept(ModItems.GOLD_TORCH_ITEM);
            event.accept(ModItems.GOLD_REDSTONE_TORCH_ITEM);
            event.accept(ModItems.REDSTONE_TORCH_ITEM);
            event.accept(ModItems.REDSTONE_REDSTONE_TORCH_ITEM);
            event.accept(ModItems.EMERALD_TORCH_ITEM);
            event.accept(ModItems.EMERALD_REDSTONE_TORCH_ITEM);
            event.accept(ModItems.LAPIS_LAZULI_TORCH_ITEM);
            event.accept(ModItems.LAPIS_LAZULI_REDSTONE_TORCH_ITEM);
            event.accept(ModItems.DIAMOND_TORCH_ITEM);
            event.accept(ModItems.DIAMOND_REDSTONE_TORCH_ITEM);
            event.accept(ModItems.NETHERITE_TORCH_ITEM);
            event.accept(ModItems.NETHERITE_REDSTONE_TORCH_ITEM);
            event.accept(ModItems.QUARTZ_TORCH_ITEM);
            event.accept(ModItems.QUARTZ_REDSTONE_TORCH_ITEM);
            event.accept(ModItems.CHISELED_QUARTZ_TORCH_ITEM);
            event.accept(ModItems.CHISELED_QUARTZ_REDSTONE_TORCH_ITEM);
            event.accept(ModItems.QUARTZ_BRICKS_TORCH_ITEM);
            event.accept(ModItems.QUARTZ_BRICKS_REDSTONE_TORCH_ITEM);
            event.accept(ModItems.QUARTZ_PILLAR_TORCH_ITEM);
            event.accept(ModItems.QUARTZ_PILLAR_REDSTONE_TORCH_ITEM);
            event.accept(ModItems.SMOOTH_QUARTZ_TORCH_ITEM);
            event.accept(ModItems.SMOOTH_QUARTZ_REDSTONE_TORCH_ITEM);
            event.accept(ModItems.AMETHYST_TORCH_ITEM);
            event.accept(ModItems.AMETHYST_REDSTONE_TORCH_ITEM);
            event.accept(ModItems.COPPER_TORCH_ITEM);
            event.accept(ModItems.COPPER_REDSTONE_TORCH_ITEM);
            event.accept(ModItems.CUT_COPPER_TORCH_ITEM);
            event.accept(ModItems.CUT_COPPER_REDSTONE_TORCH_ITEM);
            event.accept(ModItems.EXPOSED_COPPER_TORCH_ITEM);
            event.accept(ModItems.EXPOSED_COPPER_REDSTONE_TORCH_ITEM);
            event.accept(ModItems.EXPOSED_CUT_COPPER_TORCH_ITEM);
            event.accept(ModItems.EXPOSED_CUT_COPPER_REDSTONE_TORCH_ITEM);
            event.accept(ModItems.WEATHERED_COPPER_TORCH_ITEM);
            event.accept(ModItems.WEATHERED_COPPER_REDSTONE_TORCH_ITEM);
            event.accept(ModItems.WEATHERED_CUT_COPPER_TORCH_ITEM);
            event.accept(ModItems.WEATHERED_CUT_COPPER_REDSTONE_TORCH_ITEM);
            event.accept(ModItems.OXIDIZED_COPPER_TORCH_ITEM);
            event.accept(ModItems.OXIDIZED_COPPER_REDSTONE_TORCH_ITEM);
            event.accept(ModItems.OXIDIZED_CUT_COPPER_TORCH_ITEM);
            event.accept(ModItems.OXIDIZED_CUT_COPPER_REDSTONE_TORCH_ITEM);
            event.accept(ModItems.WAXED_COPPER_TORCH_ITEM);
            event.accept(ModItems.WAXED_COPPER_REDSTONE_TORCH_ITEM);
            event.accept(ModItems.WAXED_CUT_COPPER_TORCH_ITEM);
            event.accept(ModItems.WAXED_CUT_COPPER_REDSTONE_TORCH_ITEM);
            event.accept(ModItems.WAXED_EXPOSED_COPPER_TORCH_ITEM);
            event.accept(ModItems.WAXED_EXPOSED_COPPER_REDSTONE_TORCH_ITEM);
            event.accept(ModItems.WAXED_EXPOSED_CUT_COPPER_TORCH_ITEM);
            event.accept(ModItems.WAXED_EXPOSED_CUT_COPPER_REDSTONE_TORCH_ITEM);
            event.accept(ModItems.WAXED_WEATHERED_COPPER_TORCH_ITEM);
            event.accept(ModItems.WAXED_WEATHERED_COPPER_REDSTONE_TORCH_ITEM);
            event.accept(ModItems.WAXED_WEATHERED_CUT_COPPER_TORCH_ITEM);
            event.accept(ModItems.WAXED_WEATHERED_CUT_COPPER_REDSTONE_TORCH_ITEM);
            event.accept(ModItems.WAXED_OXIDIZED_COPPER_TORCH_ITEM);
            event.accept(ModItems.WAXED_OXIDIZED_COPPER_REDSTONE_TORCH_ITEM);
            event.accept(ModItems.WAXED_OXIDIZED_CUT_COPPER_TORCH_ITEM);
            event.accept(ModItems.WAXED_OXIDIZED_CUT_COPPER_REDSTONE_TORCH_ITEM);
        }
//        if (event.getTab() == CreativeModeTabs.BUILDING_BLOCKS)
//            event.accept(EXAMPLE_BLOCK_ITEM);
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
        // Do something when the server starts
//        LOGGER.info("HELLO from server starting");
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            // Some client setup code
//            LOGGER.info("HELLO FROM CLIENT SETUP");
//            LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());
        }
    }
}
