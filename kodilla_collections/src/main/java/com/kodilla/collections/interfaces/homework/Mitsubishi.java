package com.kodilla.collections.interfaces.homework;

public class Mitsubishi implements Car {
    private int speedMitsubishi = 0;

    @Override
    public int getSpeed() {
        return speedMitsubishi;
    }

    @Override
    public void increaseSpeed() {
        speedMitsubishi += 11; // przyspieszenie, nie muszę sobie tego wcześniej dopisywać do zmiennej, chodzi tylko o zastosowanie interfejsu

    }

    @Override
    public void decreaseSpeed() {
        speedMitsubishi -= 7; // analogicznie
    }
}
