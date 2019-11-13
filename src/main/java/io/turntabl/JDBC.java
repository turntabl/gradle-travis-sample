package io.turntabl;

import java.sql.*;

public class JDBC {
    public static void jdbcConnection() throws ClassNotFoundException {
        // load the JDBC driver from prostgresql
        Class.forName("org.postgresql.Driver");

        // build the connection string
        String dbUrl = "jdbc:postgresql:northwind";

        // get the connection object

        try (Connection db = DriverManager.getConnection(dbUrl, "john-erbynn", "turntabl")) {

        } catch (SQLException sqle) {
            System.err.println("Connection error: " + sqle);
        }
    }


}
