package io.turntabl;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException {
        JDBC jdbc = new JDBC();
//        jdbc.jdbc_read_data();

        /*System.out.println("Enter name: >>> ");
        Scanner inp = new Scanner(System.in);
        String name = inp.nextLine();
        jdbc.searchCustomerName(name);*/

//        jdbc.searchCategoryByName("Beverages");
//        jdbc.searchCategoryByName();

        ProductDAOImpl productDAO = new ProductDAOImpl();
        productDAO.showAllProductsByCustomer("Karin Josephs");


    }
}
