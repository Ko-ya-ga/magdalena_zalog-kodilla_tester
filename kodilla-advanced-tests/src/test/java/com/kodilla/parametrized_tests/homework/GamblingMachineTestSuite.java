package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.HashSet;
import java.util.Set;

class GamblingMachineTestSuite {
    private GamblingMachine gamblingMachine = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources = "/gamblingMachine_correctSize.csv", delimiter = ',')
    public void createSetWithCorrectSize(int number1, int number2, int number3, int number4, int number5, int number6) throws InvalidNumbersException {
        // given
        Set<Integer> numbers = new HashSet<>();
        numbers.add(number1);
        numbers.add(number2);
        numbers.add(number3);
        numbers.add(number4);
        numbers.add(number5);
        numbers.add(number6);
        GamblingMachine gamblingMachine = new GamblingMachine();
        // when
        gamblingMachine.howManyWins(numbers);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/gamblingMachine_IncorrectNumbers.csv", delimiter = ',')
    public void invalidNumbersShouldCauseThrowingException(int invalidNumbers) throws InvalidNumbersException {
        // given
        Set<Integer> numbers = new HashSet<>();
        numbers.add(invalidNumbers);
        // when
        Assertions.assertThrows(InvalidNumbersException.class, () -> {
            gamblingMachine.howManyWins(numbers);
        });
    }
}