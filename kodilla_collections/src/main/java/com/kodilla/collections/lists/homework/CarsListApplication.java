package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Mitsubishi;
import com.kodilla.collections.interfaces.homework.Toyota;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        Mitsubishi mitsubishi = new Mitsubishi(11);
        cars.add(mitsubishi);
        cars.add(new Mitsubishi(10));
        cars.add(new Toyota(15));
        cars.add(new Toyota(13));
        cars.add(new Toyota(14));

        cars.remove(3);
        cars.remove(mitsubishi);

        System.out.println(cars.size());

        for (Car car : cars) {
            CarUtils.describeCar(car);
        }
    }
}
