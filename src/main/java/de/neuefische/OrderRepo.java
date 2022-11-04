package de.neuefische;

import java.util.ArrayList;
import java.util.List;

public class OrderRepo {
List<Order> orderList = new ArrayList<>();

    public OrderRepo() {
    }

    public OrderRepo(List<Order> orderList) {
        this.orderList = orderList;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OrderRepo orderRepo)) return false;

        return getOrderList() != null ? getOrderList().equals(orderRepo.getOrderList()) : orderRepo.getOrderList() == null;
    }

    @Override
    public int hashCode() {
        return getOrderList() != null ? getOrderList().hashCode() : 0;
    }

    @Override
    public String toString() {
        return "OrderRepo{" +
                "orderList=" + orderList +
                '}';
    }

    public Order getOrder(int id) {
        for (Order order : orderList) {
            if (order.getId() == id) {
                return order;
            }
        }
        return null;

    }

    // List
    // Get
    // Add

    public void addOrder(Order orderToAdd){
        orderList.add(orderToAdd);
    }

}
