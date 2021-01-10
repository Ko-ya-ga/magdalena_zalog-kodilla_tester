package com.kodilla.abstracts.homework.task2;

public class Priest extends Job {
    public Priest(int salary, String responsibilities) {
        super(3000, "administering the seven sacraments, providing pastoral care, visiting the sick");
    }

    public void priest() {
        System.out.println("This person's responsibilities are " + priest.getResponsibilities());
    }

    Priest priest = new Priest(3000, "administering the seven sacraments, providing pastoral care, visiting the sick");
}
