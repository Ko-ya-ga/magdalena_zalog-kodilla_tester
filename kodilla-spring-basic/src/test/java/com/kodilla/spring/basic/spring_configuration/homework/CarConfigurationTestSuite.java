package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CarConfigurationTestSuite {

    @Autowired
    private Car car;
    CarConfiguration carConfiguration = new CarConfiguration();

    @Test
    public void checkChooseCar() {
        Assertions.assertFalse(car.hasHeadlightsTurnedOn());
        Assertions.assertEquals("SUV", carConfiguration.chooseCar().getCarType());
    }
}