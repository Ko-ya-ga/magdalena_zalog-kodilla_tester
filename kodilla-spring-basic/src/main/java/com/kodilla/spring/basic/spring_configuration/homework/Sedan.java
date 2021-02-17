package com.kodilla.spring.basic.spring_configuration.homework;

public class Sedan implements Car {


    private boolean lights;

    public Sedan(boolean lights) {
        this.lights = lights;
    }

    @Override
    public boolean hasHeadlightsTurnedOn() {
        return lights;
    }

    @Override
    public String getCarType() {
        return "Sedan";
    }
}
