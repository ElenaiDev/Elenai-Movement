package com.elenai.elenaidodge2.potions;

import com.elenai.elenaidodge2.ElenaiDodge2;
import com.elenai.elenaidodge2.api.FeathersHelper;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.attributes.AbstractAttributeMap;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.potion.Potion;
import net.minecraft.util.ResourceLocation;

public class ReplenishmentPotion extends Potion {

	public ReplenishmentPotion(String name, boolean isBadEffectIn, int liquidColorIn, int iconIndexX, int iconIndexY) {
		super(isBadEffectIn, liquidColorIn);
		
		setPotionName("effect." + name);
		setIconIndex(iconIndexX, iconIndexY);
		setRegistryName(new ResourceLocation(ElenaiDodge2.MODID + ":" + name));
	}
	
	@Override
	public boolean hasStatusIcon() {
		Minecraft.getMinecraft().getTextureManager().bindTexture(new ResourceLocation(ElenaiDodge2.MODID, "textures/gui/icons.png"));
		return true;
	}
	
	@Override
	 public void applyAttributesModifiersToEntity(EntityLivingBase entityLivingBaseIn, AbstractAttributeMap attributeMapIn, int amplifier) {
		super.applyAttributesModifiersToEntity(entityLivingBaseIn, attributeMapIn, amplifier);
		
		if(entityLivingBaseIn instanceof EntityPlayerMP) {
			FeathersHelper.decreaseRegenModifier((EntityPlayerMP) entityLivingBaseIn, ((amplifier+1)*20) + 30);
		}
	}
	
	@Override
	public void removeAttributesModifiersFromEntity(EntityLivingBase entityLivingBaseIn, AbstractAttributeMap attributeMapIn, int amplifier) {
		super.removeAttributesModifiersFromEntity(entityLivingBaseIn, attributeMapIn, amplifier);	
		
		if(entityLivingBaseIn instanceof EntityPlayerMP) {
			FeathersHelper.increaseRegenModifier((EntityPlayerMP) entityLivingBaseIn, ((amplifier+1)*20) + 30);
		}
	}

}
