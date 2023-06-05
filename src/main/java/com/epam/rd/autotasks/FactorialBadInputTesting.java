package com.epam.rd.autotasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FactorialBadInputTesting {
    @Test
    public void testNullInput() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> Factorial.factorial(null));
    }

    @Test
    public void testNegativeInput() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> Factorial.factorial("-5"));
    }

    @Test
    public void testFractionalInput() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> Factorial.factorial("2.5"));
    }

    @Test
    public void testNonDigitalInput() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> Factorial.factorial("abc"));
    }
}

