package com.kodilla.collections.interfaces.homework;

public class Toyota implements Car {
    int speedToyota = 0;

    public Toyota(int speedToyota) {
        this.speedToyota = speedToyota;
    }

    @Override
    public int getSpeed() {
        return speedToyota;
    }

    @Override
    public int increaseSpeed() {
        return speedToyota += 13;
    }

    @Override
    public int decreaseSpeed() {
        return speedToyota -= 8;
    }
}
