package com.kodilla.spring.basic.dependency_injection.homework;

public class CourierNotificationService implements NotificationService {
    @Override
    public void success(String address) {
        System.out.println("Package delivered to: " + address + " by courier");
    }

    @Override
    public void fail(String address) {
        System.out.println("Package not delivered to: " + address);
    }
}
