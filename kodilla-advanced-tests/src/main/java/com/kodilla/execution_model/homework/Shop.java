package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Shop {
    private Set<Order> orders = new HashSet<>();

    public void addOrder(Order order) {
        this.orders.add(order);
    }

    public double sumOrdersValues() {
        double sum = 0;
        double ordersValueSum = 0;
        for (Order order : orders) {
            double i = order.getOrderValue();
            ordersValueSum = sum += i;
        }
        return ordersValueSum;
    }

    public Set<Order> getOrderByDate(LocalDate from, LocalDate to) {
        return this.orders
                .stream()
                .filter(order -> order.getDate().isAfter(from) && order.getDate().isBefore(to))
                .collect(Collectors.toSet());
    }

    public Set<Order> getOrderByValue(double minValue, double maxValue) {
        return this.orders
                .stream()
                .filter(order -> order.getOrderValue() >= minValue && order.getOrderValue() <= maxValue)
                .collect(Collectors.toSet());
    }


    public int getSize() {
        return this.orders.size();
    }
}
