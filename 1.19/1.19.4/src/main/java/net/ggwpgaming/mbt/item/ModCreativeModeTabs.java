package net.ggwpgaming.mbt.item;

import net.ggwpgaming.mbt.MoreBeautifulTorches;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid= MoreBeautifulTorches.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTabs {
    public static CreativeModeTab MTC_TAB;

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event) {
        MTC_TAB = event.registerCreativeModeTab(new ResourceLocation(MoreBeautifulTorches.MOD_ID, "mbt_tab"),
                builder -> builder.icon(() -> new ItemStack(Blocks.TORCH)).title(Component.translatable("creativemodetab.mbt_tab")).build());
    }
}