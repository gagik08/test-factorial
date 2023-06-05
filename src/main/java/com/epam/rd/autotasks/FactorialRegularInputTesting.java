package com.epam.rd.autotasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FactorialRegularInputTesting {

    Factorial factorial = new Factorial();

    @Test
    void testFactorialOfZero() {
        String result = factorial.factorial("0");
        assertEquals("1", result);
    }

    @Test
    void testFactorialOfOne() {
        String result = factorial.factorial("1");
        assertEquals("1", result);
    }

    @Test
    void testFactorialOfFive() {
        String result = factorial.factorial("5");
        assertEquals("120", result);
    }
}
