package de.neuefische;

import java.util.*;

public class OrderRepo {
    private final Map<String, Order> orderList = new HashMap<>();

    public OrderRepo() {
    }

    public Map<String, Order> getOrderList() {
        return orderList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OrderRepo orderRepo)) return false;

        return getOrderList() != null ? getOrderList().equals(orderRepo.getOrderList())
                : orderRepo.getOrderList() == null;
    }

//    @Override
//    public String hashCode() {
//        return getOrderList() != null ? getOrderList().hashCode() : 0;
//    }

    @Override
    public String toString() {
        return "OrderRepo{" +
                "orderList=" + orderList +
                '}';
    }

    public Order getOrder(String id) {
        return orderList.get(id);
    }

    // List
    // Get
    // Add

    public void addOrder(Order orderToAdd) {
        orderList.put(UUID.randomUUID().toString(), orderToAdd);
    }

}
