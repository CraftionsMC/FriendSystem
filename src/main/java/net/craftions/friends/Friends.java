package net.craftions.friends;

import net.craftions.friends.config.Config;
import net.md_5.bungee.api.plugin.Plugin;

import java.io.IOException;

public final class Friends extends Plugin {

    @Override
    public void onEnable() {
        try {
            Config.loadConfig();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
