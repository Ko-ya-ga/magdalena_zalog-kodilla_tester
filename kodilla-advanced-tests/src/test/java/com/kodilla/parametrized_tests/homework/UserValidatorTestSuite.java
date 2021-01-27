package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.NullSource;

import static org.junit.jupiter.api.Assertions.assertFalse;


public class UserValidatorTestSuite {
    UserValidator validateUsername = new UserValidator();

    @ParameterizedTest
    @CsvSource(value = {"Me, 12, ku, DJ, a, ."})
    public void shouldReturnFalseIfUsernameIsShorterThanThreeChars(String input) {
        assertFalse(validateUsername.validateEmail(input));
    }

    @ParameterizedTest
    @NullSource
    public void shouldReturnFalseIfUsernameIsEmpty(String input) {
        assertFalse(validateUsername.validateEmail(input));
    }

    @ParameterizedTest
    @CsvSource(value = {",? :? &? #?"}, delimiter = '?')
    public void shouldReturnFalseIfUsernameContainsForbiddenChars(String input) {
        assertFalse(validateUsername.validateEmail(input));
    }
}

