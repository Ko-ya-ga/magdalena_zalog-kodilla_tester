package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class bmiSources {
    static Stream<Arguments> provideDataForTestingBmiCalculator() {
        return Stream.of(
                Arguments.of(new Person(1.79, 46), "Very severely underweight"),
                Arguments.of(new Person(1.79, 51), "Severely underweight"),
                Arguments.of(new Person(1.79, 52), "Underweight"),
                Arguments.of(new Person(1.79, 59), "Underweight"),
                Arguments.of(new Person(1.79, 60), "Normal (healthy weight)"),
                Arguments.of(new Person(1.79, 80), "Normal (healthy weight)"),
                Arguments.of(new Person(1.79, 81), "Overweight"),
                Arguments.of(new Person(1.79, 96), "Overweight"),
                Arguments.of(new Person(1.79, 97), "Obese Class I (Moderately obese)"),
                Arguments.of(new Person(1.79, 112), "Obese Class I (Moderately obese)"),
                Arguments.of(new Person(1.79, 113), "Obese Class II (Severely obese)"),
                Arguments.of(new Person(1.79, 128), "Obese Class II (Severely obese)"),
                Arguments.of(new Person(1.79, 129), "Obese Class III (Very severely obese)"),
                Arguments.of(new Person(1.79, 144), "Obese Class III (Very severely obese)"),
                Arguments.of(new Person(1.79, 145), "Obese Class IV (Morbidly Obese)"),
                Arguments.of(new Person(1.79, 160), "Obese Class IV (Morbidly Obese)"),
                Arguments.of(new Person(1.79, 161), "Obese Class V (Super Obese)"),
                Arguments.of(new Person(1.79, 192), "Obese Class V (Super Obese)"),
                Arguments.of(new Person(1.79, 193), "Obese Class VI (Hyper Obese)")
        );
    }
}
