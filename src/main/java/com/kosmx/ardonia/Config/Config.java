package com.kosmx.ardonia.Config;

import com.kosmx.ardonia.Main;
import me.sargunvohra.mcmods.autoconfig1u.ConfigData;
import me.sargunvohra.mcmods.autoconfig1u.annotation.ConfigEntry;

@me.sargunvohra.mcmods.autoconfig1u.annotation.Config(name = Main.MOD_ID)
public class Config implements ConfigData {
    public boolean debug = false;

}
