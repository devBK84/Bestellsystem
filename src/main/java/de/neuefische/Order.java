package de.neuefische;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Order {
    private String id;
    Map<String, Product> orders = new HashMap<>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Map<String, Product> getOrders() {
        return orders;
    }

    public void setOrders(Map<String, Product> orders) {
        this.orders = orders;
    }

    public Order() {
    }

    public Order(String id, Map<String, Product> orders) {
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

//    @Override
//    public int hashCode() {
//        String result = getId();
//        result = 31 * result + (getOrders() != null ? getOrders().hashCode() : 0);
//        return result;
//    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", orderMap=" + orders +
                '}';
    }
}
