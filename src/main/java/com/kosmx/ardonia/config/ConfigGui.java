package com.kosmx.ardonia.config;

import com.kosmx.ardonia.Main;
import io.github.prospector.modmenu.api.ModMenuApi;
import me.sargunvohra.mcmods.autoconfig1u.AutoConfig;
import net.minecraft.client.gui.screen.Screen;

import java.util.Optional;
import java.util.function.Supplier;

public class ConfigGui implements ModMenuApi {

    @Override
    public String getModId() {
        return Main.MOD_ID;
    }

    /*
    @Override
    public Function<Screen, ? extends Screen> getConfigScreenFactory() {
        return screen -> AutoConfig.getConfigScreen(Config.class, screen).get();
    }*/

    @Override
    public Optional<Supplier<Screen>> getConfigScreen(Screen screen) {
        return Optional.of(AutoConfig.getConfigScreen(Config.class, screen));
    }
}
