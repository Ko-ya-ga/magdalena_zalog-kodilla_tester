package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;


public class TaskManager {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        List<LocalDate> tasksDeadlines = TaskRepository.getTasks()
                .stream()
                .filter(t -> t.getDeadline().isAfter(currentDate))
                .map(Task::getDeadline)
                .collect(Collectors.toList());
        System.out.println(tasksDeadlines);
    }
}
