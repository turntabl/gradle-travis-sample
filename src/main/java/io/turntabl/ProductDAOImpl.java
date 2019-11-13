package io.turntabl;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductDAOImpl implements ProductDAO {

    @Override
    public List<ProductTO> showAllProductsByCustomer(String customerName) throws ClassNotFoundException {
        Class.forName("org.postgresql.Driver");
        String dbUrl = "jdbc:postgresql:northwind";

//        List<ProductTO> allProds = Arrays.asList();
        List<ProductTO> allProds = new ArrayList<>();

        try (Connection db = DriverManager.getConnection(dbUrl, "john-erbynn", "turntabl")) {
            PreparedStatement pst = db.prepareStatement("select product_name, products.unit_price from products " +
                    "inner join order_details on products.product_id = order_details.product_id " +
                    "inner join orders on order_details.order_id = orders.order_id" +
                    "inner join customers on orders.customer_id = customers.customer_id" +
                    "where contact_name = '?' ");
            pst.clearParameters();
            pst.setString(1, customerName);   // => name matched to the first ?

            ResultSet result = pst.executeQuery();

            while (result.next()) {
//                System.out.format("%2s %70s",
//                        result.getString("product_name"),
//                        result.getString("products.unit_price")
//                );

                ProductTO pto = new ProductTO(result.getString("product_name"));
//                System.out.println();
                allProds.add(pto);
            }

        } catch (SQLException sqle) {
            System.err.println("Connection error: " + sqle);
        }

        return allProds;
    }
}
