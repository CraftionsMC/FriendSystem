package net.craftions.friends.database;

import net.craftions.friends.config.Config;

import java.sql.*;

public class MySQL {

    public static Connection connection = null;


    public static void init() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://" + Config.mysql_host + ":" + Config.mysql_port + "/" + Config.mysql_database + "?autoReconnect=true&user=" + Config.mysql_user + "&password=" + Config.mysql_password);
    }

    public static void execute(String sql) throws SQLException {
        Statement st = connection.createStatement();
        st.execute(sql);
    }

    public static ResultSet query(String sql) throws SQLException {
        Statement st = connection.createStatement();
        return st.executeQuery(sql);
    }

}
