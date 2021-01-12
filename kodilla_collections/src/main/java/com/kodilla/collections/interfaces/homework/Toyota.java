package com.kodilla.collections.interfaces.homework;

public class Toyota implements Car {
    int speedToyota = 0;

    @Override
    public int getSpeed() {
        return speedToyota;
    }

    @Override
    public void increaseSpeed() {
        speedToyota += 13;
    }

    @Override
    public void decreaseSpeed() {
        speedToyota -= 8;
    }
}
