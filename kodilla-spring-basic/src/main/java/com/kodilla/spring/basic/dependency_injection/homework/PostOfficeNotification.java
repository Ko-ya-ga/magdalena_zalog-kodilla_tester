package com.kodilla.spring.basic.dependency_injection.homework;

public class PostOfficeNotification implements Notification {
    @Override
    public void success(String address) {
        System.out.println("Package delivered to: " + address + " by post office");
    }

    @Override
    public void fail(String address) {
        System.out.println("Package not delivered to: " + address);
    }
}
