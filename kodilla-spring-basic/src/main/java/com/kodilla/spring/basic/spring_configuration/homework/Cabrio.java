package com.kodilla.spring.basic.spring_configuration.homework;

public class Cabrio implements Car {

    private boolean lights;

    public Cabrio(boolean lights) {
        this.lights = lights;
    }

    @Override
    public boolean hasHeadlightsTurnedOn() {
        return lights;
    }

    @Override
    public String getCarType() {
        return "Cabrio";
    }
}
