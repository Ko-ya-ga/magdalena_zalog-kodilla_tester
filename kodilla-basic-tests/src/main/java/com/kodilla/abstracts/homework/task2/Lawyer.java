package com.kodilla.abstracts.homework.task2;

public class Lawyer extends Job {
    public Lawyer() {
        super(6000, "providing legal advice and guidance, representing clients in trials, writing contracts");
    }

    @Override
    public void showResponsibilities() {
        System.out.println("This person's responsibilities are " + getResponsibilities());
    }

}
