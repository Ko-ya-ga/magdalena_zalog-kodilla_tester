package com.kodilla;

public class Application {
    public static void main(String[] args) {
        User adam = new User("Adam", 40.5, 178);

        if (adam.age > 30 && adam.height > 160) {
            System.out.println("User is older than 30 and higher than 160cm");
        } else {
            System.out.println("User is 30 (or younger) or 160cm (or shorter)");
        }
    }
}