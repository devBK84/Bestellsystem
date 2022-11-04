package de.neuefische;

import java.util.ArrayList;
import java.util.List;

public class ShopService {
   // ProducteRepo
    // OrderRepo

    // getProduct
    // listProducts
    // addOrder
    // getOrder
    // listOrder

   private ProductRepo productRepo;
   private OrderRepo orderRepo;

    public ShopService() {
    }

    public ShopService(ProductRepo productRepo, OrderRepo orderRepo) {
        this.productRepo = productRepo;
        this.orderRepo = orderRepo;
    }

    public ProductRepo getProductRepo() {
        return productRepo;
    }

    public void setProductRepo(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    public OrderRepo getOrderRepo() {
        return orderRepo;
    }

    public void setOrderRepo(OrderRepo orderRepo) {
        this.orderRepo = orderRepo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ShopService that)) return false;

        if (getProductRepo() != null ? !getProductRepo().equals(that.getProductRepo()) : that.getProductRepo() != null)
            return false;
        return getOrderRepo() != null ? getOrderRepo().equals(that.getOrderRepo()) : that.getOrderRepo() == null;
    }

    @Override
    public int hashCode() {
        int result = getProductRepo() != null ? getProductRepo().hashCode() : 0;
        result = 31 * result + (getOrderRepo() != null ? getOrderRepo().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ShopService{" +
                "productRepo=" + productRepo +
                ", orderRepo=" + orderRepo +
                '}';
    }

    // getProduct

    // listProducts

    // addOrder
    // getOrder
    // listOrder

public Product getProductFromProductRepo(String name) {
        return productRepo.getProduct(name);
    }
public List<Product> getProductListFromProductRepo() {
        return productRepo.getProductList();
}
public void addOrderToOrderRepo(Order orderToAdd){
        orderRepo.addOrder(orderToAdd);
}
}
