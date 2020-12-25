package com.kodilla;

public class UserData {
    public static void main(String[] args) {
        User marta = new User("Marta", 19, 156);
        User john = new User("John", 40, 187);
        User sylwia = new User("Sylwia", 32, 173);
        User andrzej = new User("Andrzej", 28, 190);
        User ewa = new User("Ewa", 26, 164);

        User[] users = {marta, john, sylwia, andrzej, ewa};

        double sum = marta.age + john.age + sylwia.age + andrzej.age + ewa.age;
        double mean = sum / users.length;
        System.out.println(sum);
        System.out.println(mean);
    }
}
