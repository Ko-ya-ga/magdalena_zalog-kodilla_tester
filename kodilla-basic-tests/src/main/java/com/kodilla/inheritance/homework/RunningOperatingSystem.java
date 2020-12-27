package com.kodilla.inheritance.homework;

public class RunningOperatingSystem {
    public static void main(String[] args) {
        WindowsXP windowsXP = new WindowsXP(2001);
        windowsXP.turnOn();
        windowsXP.turnOff();

        WindowsVista windowsVista = new WindowsVista(2007);
        windowsVista.turnOn();
        windowsVista.turnOff();
    }
}
