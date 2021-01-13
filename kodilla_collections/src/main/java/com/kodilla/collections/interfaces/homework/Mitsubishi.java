package com.kodilla.collections.interfaces.homework;

public class Mitsubishi implements Car {
    private int speedMitsubishi = 0;

    public Mitsubishi(int speedMitsubishi) {
        this.speedMitsubishi = speedMitsubishi;
    }

    @Override
    public int getSpeed() {
        return speedMitsubishi;
    }

    @Override
    public int increaseSpeed() {
        return speedMitsubishi += 11; // przyspieszenie, nie muszę sobie tego wcześniej dopisywać do zmiennej, chodzi tylko o zastosowanie interfejsu

    }

    @Override
    public int decreaseSpeed() {
        return speedMitsubishi -= 7; // analogicznie
    }
}
