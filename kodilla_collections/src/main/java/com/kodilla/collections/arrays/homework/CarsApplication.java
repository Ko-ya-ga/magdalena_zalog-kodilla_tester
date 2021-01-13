package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Mitsubishi;
import com.kodilla.collections.interfaces.homework.Toyota;

import java.util.Random;

public class CarsApplication {
    public static void main(String[] args) {
        Random random = new Random();
        Car[] cars = new Car[random.nextInt(15 + 1)];
        for (int i = 0; i < cars.length; i++)
            cars[i] = drawCar();
        for ( Car car : cars)
            CarUtils.describeCar(car);
    }

    public static Car drawCar() {
        Random random = new Random();
        int drawnCarBrand = random.nextInt(2);
        int a = random.nextInt(30) + 1;
        if (drawnCarBrand == 0)
            return new Mitsubishi(a);
        else
            return new Toyota(a);
    }
}
