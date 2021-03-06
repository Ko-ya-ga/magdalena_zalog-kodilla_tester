package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class CalculatorTestSuite {
    @Autowired
    private Calculator bean;

    @Test
    public void shouldAddNumbers() {
        double value = bean.add(1, 1);
        Assertions.assertEquals(2, value);
    }

    @Test
    public void shouldSubtractNumbers() {
        double value = bean.subtract(3, 1);
        Assertions.assertEquals(2, value);
    }

    @Test
    public void shouldMultiplyNumbers() {
        double value = bean.multiply(2, 2);
        Assertions.assertEquals(4, value);
    }

    @Test
    public void shouldDivideNumbers() {
        double value = bean.divide(15, 5);
        Assertions.assertEquals(3, value);
    }
}
