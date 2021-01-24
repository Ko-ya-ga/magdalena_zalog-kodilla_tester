package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    public static List<Task> getTasks() {
        List<Task> tasks = new ArrayList<>();
        LocalDate taskOneOpened = LocalDate.of(2021, 01, 15);
        LocalDate taskOneDeadline = LocalDate.of(2021, 02, 01);
        LocalDate taskTwoOpened = LocalDate.of(2020, 12, 15);
        LocalDate taskTwoDeadline = LocalDate.of(2020, 12, 30);
        LocalDate taskThreeOpened = LocalDate.of(2020, 10, 25);
        LocalDate taskThreeDeadline = LocalDate.of(2020, 11, 18);
        LocalDate taskFourOpened = LocalDate.of(2021, 01, 03);
        LocalDate taskFourDeadline = LocalDate.of(2021, 03, 01);
        tasks.add(new Task("group project: Physics", taskOneOpened,taskOneDeadline));
        tasks.add(new Task("Maths exam", taskTwoOpened, taskTwoDeadline));
        tasks.add(new Task("art competition", taskThreeOpened, taskThreeDeadline));
        tasks.add(new Task("group project: Geography", taskFourOpened, taskFourDeadline));
        return tasks;
    }
}
