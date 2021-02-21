package net.craftions.friends;

import net.craftions.friends.config.Config;
import net.craftions.friends.database.MySQL;
import net.md_5.bungee.api.plugin.Plugin;

import java.io.IOException;
import java.sql.SQLException;

public final class Friends extends Plugin {

    @Override
    public void onEnable() {
        try {
            Config.loadConfig();
            MySQL.init();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
