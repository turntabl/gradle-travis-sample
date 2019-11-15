package io.turntabl;

import java.util.List;

public interface ProductDAO {
    public List<ProductTO> showAllProductsByCustomer(String customerName) throws ClassNotFoundException;
//    public List<ProductTO> displayMostPopularProduct() throws ClassNotFoundException;
}
