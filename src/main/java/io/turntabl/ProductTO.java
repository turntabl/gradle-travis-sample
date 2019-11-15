package io.turntabl;

public class ProductTO {
    private String productName;
    private Double price;   // not double

    public ProductTO(String productName, Double price) {
        this.productName = productName;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public Double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "ProductTO{" +
                "productName='" + productName + '\'' +
                ", price=" + price +
                '}';
    }
}
