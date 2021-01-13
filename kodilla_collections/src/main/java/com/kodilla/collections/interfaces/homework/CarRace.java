package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Mitsubishi mitsubishi = new Mitsubishi(0);
        doRace(mitsubishi); // nie mitsubishi.doRace();
        System.out.println(mitsubishi.getSpeed());
        Toyota toyota = new Toyota(0);
        doRace(toyota);
        System.out.println(toyota.getSpeed());
    }

    public static void doRace(Car car) {
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed(); // po prostu wypisać sobie ręcznie jedno pod drugim, bez żadnych pętli, tablic ani kombinacji
        // nie trzeba dodawać przyspieszenia za każdym razem do powiększonej zmiennej z szybkością początkową
        // ZA BARDZO KOMBINUJE

    }
}
