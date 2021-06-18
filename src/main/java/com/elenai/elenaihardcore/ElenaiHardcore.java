package com.elenai.elenaihardcore;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.elenai.elenaihardcore.config.ConfigHandler;

import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;

@Mod(ElenaiHardcore.MODID)
public class ElenaiHardcore {

	public static final String NAME = "Elenai Hardcore";
	public static final String MODID = "elenaihardcore";
    public static final String VERSION = "1.0.0";
	
	public static final Logger LOG = LogManager.getLogger("ElenaiHardcore");
	
	public ElenaiHardcore() {
		
		ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, ConfigHandler.CLIENT_SPEC);
		ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, ConfigHandler.COMMON_SPEC);

	   }
}
