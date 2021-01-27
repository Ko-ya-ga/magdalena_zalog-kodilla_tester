package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Warehouse {
    static List<Order> orders = new ArrayList<>();

    public static void addOrder(Order order) {
        orders.add(order);
        System.out.println(order);
    }

    public static Order getOrder(String number) throws OrderDoesntExistException {
        Optional<Order> result = orders
                .stream()
                .filter(o -> o.getNumber().equals(number))
                .findAny();
        if (result.isEmpty())
            throw new OrderDoesntExistException();
        return  result.get();
    }
}
