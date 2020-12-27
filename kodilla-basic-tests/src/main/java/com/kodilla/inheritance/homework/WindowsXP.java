package com.kodilla.inheritance.homework;

public class WindowsXP extends OperatingSystem {
    public WindowsXP(int year) {
        super(year);
    }

    @Override
    public void turnOn() {
        System.out.println("Turning system Windows XP on");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning system Windows XP off");
    }
}
