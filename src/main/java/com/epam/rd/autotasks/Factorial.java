package com.epam.rd.autotasks;


public class Factorial {
    public static String factorial(String input) {
        // Parse the input as an integer
        int n = Integer.parseInt(input);

        if (n < 0) {
            throw new IllegalArgumentException("Input must be a non-negative integer");
        }

        if (n == 0 || n == 1) {
            return "1";
        }

        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }

        return Long.toString(result);
    }
}

