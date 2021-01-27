package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;

public class ForumStats {
    public static void main(String[] args) {
        double avg1 = UsersRepository.getUsersList()
                .stream()
                .filter(u -> u.getAge() >= 40)
                .mapToInt(User::getNumberOfPosts)
                .average()
                .getAsDouble();
        System.out.println(avg1);

        double avg2 = UsersRepository.getUsersList()
                .stream()
                .filter(u -> u.getAge() < 40)
                .mapToInt(User::getNumberOfPosts)
                .average()
                .getAsDouble();
        System.out.println(avg2);
    }
}
