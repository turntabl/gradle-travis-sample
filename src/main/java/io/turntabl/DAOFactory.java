package io.turntabl;

public interface DAOFactory {
    public CustomerDAO getCustomerDAO();
    public ProductDAO getProductDAO();
    public SalesDAO getSalesDAO();
}
