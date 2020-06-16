package com.kosmx.ardonia.Config;

import com.kosmx.ardonia.Main;
import io.github.prospector.modmenu.api.ModMenuApi;
import me.sargunvohra.mcmods.autoconfig1u.AutoConfig;
import net.minecraft.client.gui.screen.Screen;

import java.util.function.Function;

public class ConfigGui implements ModMenuApi {

    @Override
    public String getModId() {
        return Main.MOD_ID;
    }

    @Override
    public Function<Screen, ? extends Screen> getConfigScreenFactory() {
        return screen -> AutoConfig.getConfigScreen(Config.class, screen).get();
    }
}
