package de.neuefische;

import java.util.ArrayList;
import java.util.List;

public class ProductRepo extends Product{

    List<Product>productList = new ArrayList<>();

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public List<Product> getProductList(){
        return null;
    }
}
