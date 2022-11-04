package de.neuefische;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private int id;
    List<Product> orders = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Product> getOrders() {
        return orders;
    }

    public void setOrders(List<Product> orders) {
        this.orders = orders;
    }

    public Order() {
    }

    public Order(int id, List<Product> orders) {
        this.id = id;
        this.orders = orders;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order order)) return false;

        if (getId() != order.getId()) return false;
        return getOrders() != null ? getOrders().equals(order.getOrders()) : order.getOrders() == null;
    }

    @Override
    public int hashCode() {
        int result = getId();
        result = 31 * result + (getOrders() != null ? getOrders().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", orderList=" + orders +
                '}';
    }
}
