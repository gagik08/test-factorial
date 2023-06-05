package com.epam.rd.autotasks;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Factorial Parameterized Testing using CSV")
public class FactorialCsvParametrizedTesting {
    Factorial factorial = new Factorial();
    @ParameterizedTest
    @CsvFileSource(resources = "/csvCases.csv", numLinesToSkip = 1)
    void testFactorial(String input, String expected) {
        String result = factorial.factorial(input);
        assertEquals(expected, result);
    }
}
