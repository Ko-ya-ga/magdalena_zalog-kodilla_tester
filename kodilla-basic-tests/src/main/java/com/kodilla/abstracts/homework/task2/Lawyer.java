package com.kodilla.abstracts.homework.task2;

public class Lawyer extends Job {
    public Lawyer(int salary, String responsibilities) {
        super(6000, "providing legal advice and guidance, representing clients in trials, writing contracts");
    }

    public void lawyer() {
        System.out.println("This person's responsibilities are " + lawyer.getResponsibilities());
    }

    Lawyer lawyer = new Lawyer(6000, "providing legal advice and guidance, representing clients in trials, writing contracts");
}
