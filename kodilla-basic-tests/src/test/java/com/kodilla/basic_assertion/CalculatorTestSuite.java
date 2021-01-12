package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {
    Calculator calculator = new Calculator();
    @Test
    public void testSum() {
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    }

    @Test
    public void testSubtract() {
        int a = 5;
        int b = 8;
        int subtractResult = calculator.subtract(a,b);
        assertEquals(-3, subtractResult);
    }

    @Test
    public void testCompoundPositiveNumber() {
        int a = 5;
        int b = 8;
        int compoundResult = calculator.compound(a, b);
        assertEquals(390625, compoundResult);
    }

    @Test
    public void testCompundZero() {
        int a = 0;
        int b = 5;
        int compoundResult = calculator.compound(a, b);
        assertEquals(0, compoundResult);
    }

    @Test
    public void testCompoundNegativeNumber() {
        int a = -5;
        int b = 8;
        int compoundResult = calculator.compound(a, b);
        assertEquals(390625, compoundResult);
    }
}
