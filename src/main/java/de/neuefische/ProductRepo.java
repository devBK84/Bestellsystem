package de.neuefische;

import java.util.ArrayList;
import java.util.List;

public class ProductRepo {

    List<Product> productList = new ArrayList<>();

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public List<Product> list() {
        return productList;
    }

    public Product getProduct(String name) {
        for (Product product : productList) {
            if (product.getName() == name) {
                return product;
            }

        }
        return null;

    }
}

