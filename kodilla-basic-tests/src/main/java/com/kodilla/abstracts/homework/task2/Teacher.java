package com.kodilla.abstracts.homework.task2;

public class Teacher extends Job {
    public Teacher(int salary, String responsibilities) {
        super(2200, "teaching, creating and assessing tests and homeworks, proper raising of the youth");
    }

    public void teacher() {
        System.out.println("This person's responsibilities are " + teacher.getResponsibilities());
    }
    Teacher teacher = new Teacher(2200, "teaching, creating and assessing tests and homeworks, proper raising of the youth");
}
