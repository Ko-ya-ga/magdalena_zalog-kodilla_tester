package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.Objects;

public class Task {
    private String task;
    private LocalDate opened;
    private LocalDate deadline;

    public Task(String task, LocalDate opened, LocalDate deadline) {
        this.task = task;
        this.opened = opened;
        this.deadline = deadline;
    }

    public String getTask() {
        return task;
    }

    public LocalDate getOpened() {
        return opened;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task1 = (Task) o;
        return Objects.equals(task, task1.task) &&
                Objects.equals(opened, task1.opened) &&
                Objects.equals(deadline, task1.deadline);
    }

    @Override
    public int hashCode() {
        return Objects.hash(task, opened, deadline);
    }
}
