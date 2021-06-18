package com.elenai.elenaihardcore.subscriber;

import com.elenai.elenaihardcore.ElenaiHardcore;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod.EventBusSubscriber(modid = ElenaiHardcore.MODID, bus = Bus.MOD)
public class CommonEventBusSubscriber {

	@SubscribeEvent
	public static void onStaticCommonSetup(FMLCommonSetupEvent event) {
		

	}


}
