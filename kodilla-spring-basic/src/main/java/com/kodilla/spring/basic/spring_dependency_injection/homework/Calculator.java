package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.springframework.stereotype.Component;

@Component
public class Calculator {
    private Display display;

    public Calculator(Display display) {
        this.display = display;
    }

    public Double add(double a, double b) {
        double value = a + b;
        display.display(value);
        return value;
    }

    public Double subtract(double a, double b) {
        double value = a - b;
        display.display(value);
        return value;
    }

    public Double multiply(double a, double b) {
        double value = a * b;
        display.display(value);
        return value;
    }

    public Double divide(double a, double b) {
        double value = a / b;
        display.display(value);
        return value;
    }
}
