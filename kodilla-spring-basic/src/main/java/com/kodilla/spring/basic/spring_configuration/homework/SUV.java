package com.kodilla.spring.basic.spring_configuration.homework;

public class SUV implements Car {

    private boolean lights;

    public SUV(boolean lights) {
        this.lights = lights;
    }

    @Override
    public boolean hasHeadlightsTurnedOn() {
        return lights;

    }

    @Override
    public String getCarType() {
        return "SUV";
    }
}
