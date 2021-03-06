package com.elenai.elenaidodge2.event;

import com.elenai.elenaidodge2.api.DodgeEvent.RequestDodgeEvent;
import com.elenai.elenaidodge2.network.PacketHandler;
import com.elenai.elenaidodge2.network.message.SDodgeMessage;
import com.elenai.elenaidodge2.util.ClientStorage;

import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class CoreDodgeEventListener {
	
	/*
	 * The CORE Dodge event listener for the Client.
	 * 1) This class notifies the Server that a Dodge event has been performed.
	 * 2) This class notifies the Server of the player's feathers.
	 * 3) This class sets the hardcoded client cooldown to 8.
	 * Essentially, this is the core of the mod, no smokes and mirrors.
	 */

	@SubscribeEvent
	public void onClientDodge(RequestDodgeEvent event) {
		PacketHandler.instance.sendToServer(new SDodgeMessage(event.getDirection().toString()));
		ClientStorage.cooldown = 8;
	}
}
