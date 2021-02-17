package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.LocalTime;

@Configuration
public class CarConfiguration {

    @Bean
    public Car chooseCar() {
        LocalDate date = LocalDate.now();
        Car car;
        if (date.getMonthValue() >= 6 && date.getMonthValue() <= 8) {
            car = new Cabrio(LocalTime.now().getHour() >= 20 || LocalTime.now().getHour() <= 6);
        } else if (date.getMonthValue() >=1  && date.getMonthValue() <= 3) {
            car = new SUV(LocalTime.now().getHour() >= 20 || LocalTime.now().getHour() <= 6);
        } else if (date.getMonthValue() >= 4 && date.getMonthValue() <= 5 || date.getMonthValue() >= 9 && date.getMonthValue() <= 12) {
            car = new Sedan(LocalTime.now().getHour() >= 20 || LocalTime.now().getHour() <= 6);
        } else {
            return null;
        }
        return car;
    }
}
