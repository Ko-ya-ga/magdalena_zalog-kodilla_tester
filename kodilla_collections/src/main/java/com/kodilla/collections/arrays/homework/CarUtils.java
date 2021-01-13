package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Mitsubishi;
import com.kodilla.collections.interfaces.homework.Toyota;

import java.util.Random;

public class CarUtils {
    public static void describeCar(Car car) {
        System.out.println("-------------------------------");
        System.out.println("Car brand: " + getCarBrand(car));
        System.out.println("Increase speed: " + car.increaseSpeed());
    }

    public static String getCarBrand(Car car) {
        if (car instanceof Mitsubishi)
            return "Mitsubishi";
        else if (car instanceof Toyota)
            return "Toyota";
        else
            return "Unknown car name";
    }
}
