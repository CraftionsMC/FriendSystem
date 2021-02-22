package net.craftions.friends.database;

import net.craftions.friends.config.Config;
import net.md_5.bungee.api.connection.ProxiedPlayer;

import java.sql.SQLException;

public class MySQLUtil {

    public static void setFriend(ProxiedPlayer p0, ProxiedPlayer p1, Boolean s){
        try {
            MySQL.execute("INSERT INTO " + Config.mysql_table_prefix + "friends ");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
