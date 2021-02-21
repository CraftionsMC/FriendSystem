package net.craftions.friends.config;

import org.ini4j.Ini;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Config {

    public static String mysql_host;
    public static String mysql_port;
    public static String mysql_user;
    public static String mysql_password;
    public static String mysql_database;
    public static String mysql_table_prefix;

    public static void loadConfig() throws IOException {
        File config = new File("plugins/Friends/config.ini");
        if(!config.exists()){
            config.getParentFile().mkdirs();
            config.createNewFile();
            FileWriter writer = new FileWriter(config);
            writer.write(
                    "[mysql]\n" +
                    "host=localhost" +
                    "port=3306\n" +
                    "user=friends\n" +
                    "password=friends\n" +
                    "database=friends\n" +
                    "tableprefix=friends_"
            );
            writer.close();
        }
        Ini ini = new Ini(config);
        mysql_host = ini.get("mysql", "host");
        mysql_port = ini.get("mysql", "port");
        mysql_user = ini.get("mysql", "user");
        mysql_password = ini.get("mysql", "password");
        mysql_database = ini.get("mysql", "database");
        mysql_table_prefix = ini.get("mysql", "tableprefix");

    }
}
