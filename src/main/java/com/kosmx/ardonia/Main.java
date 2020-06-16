package com.kosmx.ardonia;

import com.kosmx.ardonia.Config.Config;
import me.sargunvohra.mcmods.autoconfig1u.AutoConfig;
import me.sargunvohra.mcmods.autoconfig1u.serializer.JanksonConfigSerializer;
import net.fabricmc.api.ModInitializer;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main implements ModInitializer {

    public static Config config;

    public static Logger LOGGER = LogManager.getLogger();

    public static final String MOD_ID = "ardonia-species";
    public static final String MOD_NAME = "Ardonia species";

    @Override
    public void onInitialize() {
        AutoConfig.register(Config.class, JanksonConfigSerializer::new);
        config = AutoConfig.getConfigHolder(Config.class).getConfig();
        log(Level.INFO, "Initializing");

    }


    public static void log(Level level, String message){
        log(level, message, false);
    }
    public static void log(Level level, String message, boolean always){
        if(always || config.debug) LOGGER.log(level, "["+MOD_NAME+"] " + message);
    }

}