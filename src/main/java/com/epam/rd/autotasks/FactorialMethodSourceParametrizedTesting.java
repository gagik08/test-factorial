package com.epam.rd.autotasks;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class FactorialMethodSourceParametrizedTesting {

    @ParameterizedTest(name = "Factorial of {0} should be {1}")
    @MethodSource("testCases")
    public void testFactorial(String input, String expected) {
        String actual = Factorial.factorial(input);
        assertEquals(expected, actual);
    }


    static Stream<String[]> testCases() {
        return Stream.of(
                new String[]{"0", "1"},
                new String[]{"1", "1"},
                new String[]{"2", "2"},
                new String[]{"3", "6"},
                new String[]{"4", "24"}
        );
    }
}
