package com.legopitstop.morefood.util;

import com.legopitstop.morefood.MoreFood;
import com.legopitstop.morefood.client.render.ExoticTraderRenderer;
import com.legopitstop.morefood.init.MorefoodEntityTypes;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = MoreFood.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEventBusSubscriber {

    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {
        RenderingRegistry.registerEntityRenderingHandler(MorefoodEntityTypes.EXOTIC_TRADER.get(), ExoticTraderRenderer::new);
    }
}
