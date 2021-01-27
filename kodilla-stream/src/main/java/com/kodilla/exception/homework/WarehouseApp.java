package com.kodilla.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse.addOrder(new Order("1657885"));
        Warehouse.addOrder(new Order("2290339"));
        Warehouse.addOrder(new Order("3758302"));
        Warehouse.addOrder(new Order("4573819"));
        Warehouse.addOrder(new Order("5043958"));

        try {
            Order isOrderPresent = Warehouse.getOrder("9875654");
            System.out.println("This order exists");
        } catch (OrderDoesntExistException e) {
            System.out.println("Sorry, this order doesn't exist");
        }
    }
}
