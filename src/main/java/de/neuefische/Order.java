package de.neuefische;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private int id;
    List<Product>orderList = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Product> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Product> orderList) {
        this.orderList = orderList;
    }

    public Order() {
    }

    public Order(int id, List<Product> orderList) {
        this.id = id;
        this.orderList = orderList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order order)) return false;

        if (getId() != order.getId()) return false;
        return getOrderList() != null ? getOrderList().equals(order.getOrderList()) : order.getOrderList() == null;
    }

    @Override
    public int hashCode() {
        int result = getId();
        result = 31 * result + (getOrderList() != null ? getOrderList().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", orderList=" + orderList +
                '}';
    }
}
