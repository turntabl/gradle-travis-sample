package io.turntabl;
/*
* Connects to DB
* Query
* Return result to business layer
* */

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
//            PreparedStatement pst = db.prepareStatement("select product_name, order_details.unit_price from products " +
//                    "inner join order_details on products.product_id = order_details.product_id " +
//                    "inner join orders on order_details.order_id = orders.order_id" +
//                    "inner join customers on orders.customer_id = customers.customer_id" +
//                    "where customers.contact_name = ? ");

//             String SEARCH_CUSTOMER_NAME_QUERY = "";
            PreparedStatement pst = db.prepareStatement("select product_name, order_details.unit_price from products " +
                    "inner join order_details on products.product_id = order_details.product_id " +
                    "inner join orders on order_details.order_id = orders.order_id " +
                    "inner join customers on orders.customer_id = customers.customer_id where customers.contact_name = ? limit 1");

            pst.clearParameters();
            pst.setString(1, customerName);   // => name matched to the first ?

            ResultSet result = pst.executeQuery();

            while (result.next()) {
//                System.out.format("%2s %70s",
//                        result.getString("product_name"),
//                        result.getString("products.unit_price")
//                );
                ProductTO pto = new ProductTO(result.getString("product_name"), result.getDouble("unit_price"));    // the exact col name ....not order_details.unit_price
//                System.out.println();
                allProds.add(pto);
            }

        } catch (SQLException sqle) {
            System.err.println("Connection error: " + sqle);
        }
        return allProds;
    }



//    @Override
//    public List<ProductTO> displayMostPopularProduct() throws ClassNotFoundException {
//        Class.forName("org.postgresql.Driver");
//        String dbUrl = "jdbc:postgresql:northwind";
//
//        try (Connection db = DriverManager.getConnection(dbUrl, "john-erbynn", "turntabl")) {
//            PreparedStatement pst = db.prepareStatement("select product_name, order_details.unit_price ");
//            pst.clearParameters();
//            pst.setString(1, );   // => name matched to the first ?
//            ResultSet result = pst.executeQuery();
//
//            while (result.next()) {
//                ProductTO pto = new ProductTO(result.getString("product_name"), result.getDouble("unit_price"));    // the exact col name ....not order_details.unit_price
//                allProds.add(pto);
//            }
//
//        } catch (SQLException sqle) {
//            System.err.println("Connection error: " + sqle);
//        }
//        return allProds;
//    }


}
