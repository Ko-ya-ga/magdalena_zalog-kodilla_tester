package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        boolean correct = ResultChecker.assertEquals(13, sumResult);
        if (correct) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
            } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
            }
        int subtractResult = calculator.subtract(a,b);
        boolean subtractCorrect = ResultChecker.assertEquals(-3, subtractResult);
        if (subtractCorrect) {
            System.out.println("Metoda subtract działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda subtract nie działa poprawnie dla liczb " + a + " i " + b);
        }
        int compoundResult = calculator.compound(a, b);
        boolean compoundCorrect = ResultChecker.assertEquals(390625, compoundResult);
        if (compoundCorrect) {
            System.out.println("Metoda compound działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda compound nie działa poprawnie dla liczb " + a + " i " + b);
        }
    }
}
