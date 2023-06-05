package com.epam.rd.autotasks;

public class Factorial {
    public static String factorial(String n) {
        int number;
        try {
            number = Integer.parseInt(n);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid input: " + n);
        }

        if (number < 0) {
            throw new IllegalArgumentException("Input must be non-negative: " + number);
        }

        int result = 1;
        for (int i = 2; i <= number; i++) {
            result *= i;
        }

        return Integer.toString(result);
    }
}
