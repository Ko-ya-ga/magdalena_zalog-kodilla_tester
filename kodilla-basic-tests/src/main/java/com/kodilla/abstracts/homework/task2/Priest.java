package com.kodilla.abstracts.homework.task2;

public class Priest extends Job {
    public Priest() {
        super(3000, "administering the seven sacraments, providing pastoral care, visiting the sick");
    }

    @Override
    public void showResponsibilities() {
        System.out.println("This person's responsibilities are " + getResponsibilities());
    }

}
