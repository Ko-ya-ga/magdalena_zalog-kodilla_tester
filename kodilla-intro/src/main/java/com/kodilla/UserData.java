package com.kodilla;

public class UserData {
    public static void main(String[] args) {
        User marta = new User("Marta", 19, 156);
        User john = new User("John", 40, 187);
        User sylwia = new User("Sylwia", 32, 173);
        User andrzej = new User("Andrzej", 28, 190);
        User ewa = new User("Ewa", 26, 164);

        User[] users = {marta, john, sylwia, andrzej, ewa};

        double sum = 0;
        for (int i =0; i < users.length; i++) {
            sum += users[i].getAge();
        }
        double mean = sum / users.length;
        System.out.println(sum);
        System.out.println(mean);

        for (int i = 0; i < users.length; i++) {
            if (users[i].getAge() > mean) {
                System.out.println(users[i].getName());
            }
        }
    }
}
