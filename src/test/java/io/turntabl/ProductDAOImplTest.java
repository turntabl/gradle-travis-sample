package io.turntabl;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ProductDAOImplTest {
    private static final String DB_DRIVER = "org.h2.Driver";
    private static final String DB_CONNECTION = "jdbc:h2:~/test";
    private static final String DB_USER = "";
    private static final String DB_PASSWORD = "";

    public static Connection getDBConnection() {
        Connection dbConnection = null;
        try {
            Class.forName(DB_DRIVER);
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        try {
            dbConnection = DriverManager.getConnection(DB_CONNECTION, DB_USER,DB_PASSWORD);
            return dbConnection;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return dbConnection;
    }




    @Test
            public void test() throws ClassNotFoundException {
        ProductDAOImplTest.getDBConnection();
        ProductDAOImpl p = new ProductDAOImpl();
        List<ProductTO> prods = Arrays.asList(
                new ProductTO("Tofu", 18.6000004)
        );

        System.out.println(prods);
        System.out.println(p.showAllProductsByCustomer("Karin Josephs"));

        assertEquals(prods, p.showAllProductsByCustomer("Karin Josephs"));
    }


}