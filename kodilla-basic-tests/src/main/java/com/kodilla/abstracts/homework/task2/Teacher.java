package com.kodilla.abstracts.homework.task2;

public class Teacher extends Job {
    public Teacher() {
        super(2200, "teaching, creating and assessing tests and homeworks, proper raising of the youth");
    }

    @Override
    public void showResponsibilities() {
        System.out.println("This person's responsibilities are " + getResponsibilities());
        // nie teacher.getResponsibilities, bo nie chce to działać bez stworzenia obiektu
        // wystarczy tak, bo to i tak osobna implementacja dla każdego zawodu
    }
}
