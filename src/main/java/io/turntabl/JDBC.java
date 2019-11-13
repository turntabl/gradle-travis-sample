package io.turntabl;

import java.sql.*;

public class JDBC {

    public static void jdbc_read_data() throws ClassNotFoundException {
        // load the JDBC driver from prostgresql
        Class.forName("org.postgresql.Driver");

        // build the connection string
        String dbUrl = "jdbc:postgresql:northwind";

        // get the connection object
        try (Connection db = DriverManager.getConnection(dbUrl, "john-erbynn", "turntabl")) {
            // obtain statement object
            Statement s = db.createStatement();

            // statement execution with cursor
            ResultSet rs = s.executeQuery("select * from customers limit 5; ");

            // headings
            System.out.println("*****************************************************************************************************************************************");
            System.out.printf("%10s %10s %30s %1s %10s %10s %10s", "CONTACT NAME", "CONTACT TITLE", "ADDRESS", "CITY", "REGION", "COUNTRY", "PHONE \n");
            System.out.println("*****************************************************************************************************************************************");

            // result manipulation
            while (rs.next()) {
                System.out.format("%10s %10s %30s %1s %10s %10s %10s",
                        rs.getString("contact_name"),
                        rs.getString("contact_title"),
                        rs.getString("address"),
                        rs.getString("city"),
                        rs.getString("region"),
                        rs.getString("country"),
                        rs.getString("phone"));
            }
        } catch (SQLException sqle) {
            System.err.println("Connection error: " + sqle);
        }



    }


}
