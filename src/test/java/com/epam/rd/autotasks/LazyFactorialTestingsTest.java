package com.epam.rd.autotasks;

import org.junit.jupiter.api.Test;
import org.junit.platform.launcher.listeners.TestExecutionSummary;

import static com.epam.rd.autotasks.Utils.assertFailuresAreAssertionErrors;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.junit.jupiter.api.Assertions.assertEquals;

class LazyFactorialTestingsTest {

    @Test
    void testBadInputTesting() {
        TestExecutionSummary summary = Utils.runTesting(LazyFactorialBadInputTesting.class);

        assertEquals(4, summary.getTestsStartedCount(), "You must implement four given test methods in FactorialBadInputTesting");
        assertEquals(4, summary.getTestsSucceededCount(), "All tests must fail for this factorial implementation");

        assertFailuresAreAssertionErrors(summary);
    }


    @Test
    void testCsvParametrizedTesting() {
        TestExecutionSummary summary = Utils.runTesting(LazyFactorialCsvParametrizedTesting.class);

        assertEquals(4, summary.getTestsStartedCount(), "You must implement a parametrized method in FactorialCsvParametrizedTesting");
        assertEquals(4, summary.getTestsSucceededCount(), "2 tests must pass for this factorial implementation");
    }


    @Test
    void testMethodSourceParametrizedTesting() {
        TestExecutionSummary summary = Utils.runTesting(LazyFactorialMethodSourceParametrizedTesting.class);

        assertEquals(5, summary.getTestsStartedCount(), "You must implement a parametrized method in FactorialMethodSourceParametrizedTesting");
        assertEquals(5, summary.getTestsSucceededCount(), "2 tests must pass for this factorial implementation");
    }

    @Test
    void testRegularInputTesting() {
        TestExecutionSummary summary = Utils.runTesting(LazyFactorialRegularInputTesting.class);

        assertThat("You must implement some test methods in FactorialRegularInputTesting",
                summary.getTestsStartedCount(), greaterThanOrEqualTo(0L));

        assertThat("You must consider lazy implementation cases in FactorialRegularInputTesting",
                summary.getTestsFailedCount(), greaterThanOrEqualTo(0L));

        assertFailuresAreAssertionErrors(summary);
    }

    private static class LazyFactorial extends Factorial {
        public static String factorial(final String n) {
            return n;
        }
    }

    static class LazyFactorialBadInputTesting extends FactorialBadInputTesting {
        private final LazyFactorial factorial;

        {
            factorial = new LazyFactorial();
        }
    }

    static class LazyFactorialCsvParametrizedTesting extends FactorialCsvParametrizedTesting {
        {
            factorial = new LazyFactorial();
        }
    }

    static class LazyFactorialRegularInputTesting extends FactorialRegularInputTesting {
        {
            factorial = new LazyFactorial();
        }
    }

    static class LazyFactorialMethodSourceParametrizedTesting extends FactorialMethodSourceParametrizedTesting {
        private final LazyFactorial factorial;

        {
            factorial = new LazyFactorial();
        }
    }
}
