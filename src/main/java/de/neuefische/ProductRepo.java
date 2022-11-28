package de.neuefische;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductRepo {

    Map<String, Product> productList = new HashMap<>();

    public void setProductList(Map<String, Product> productList) {
        this.productList = productList;
    }

    public Map<String, Product> getProductList() {
        return productList;
    }

    public Map<String,Product> list() {
        return productList;
    }


    public Product getProduct(String name) {
        return productList.get(name);
    }

    @Override
    public String toString() {
        return "ProductRepo{" +
                "productList=" + productList +
                '}';
    }
}

