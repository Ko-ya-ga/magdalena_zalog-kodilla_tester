package com.kodilla.inheritance.homework;

public class WindowsVista extends OperatingSystem {
    public WindowsVista(int year) {
        super(year);
    }

    @Override
    public void turnOn() {
        System.out.println("Turning system Windows Vista on");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning system Windows Vista off");
    }
}
