package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

/**
 * Test class for App.
 * Verifies that the main method runs without throwing any exceptions.
 */
class AppTest {

    /**
     * Ensures main runs without exception with no arguments.
     */
    @Test
    void mainRunsWithoutExceptionWithNoArgs() {
        assertDoesNotThrow(() -> App.main(new String[]{}));
    }

    /**
     * Ensures main runs without exception with a single argument.
     */
    @Test
    void mainRunsWithoutExceptionWithOneArg() {
        assertDoesNotThrow(() -> App.main(new String[]{"test"}));
    }

    /**
     * Ensures main runs without exception with multiple arguments.
     */
    @Test
    void mainRunsWithoutExceptionWithMultipleArgs() {
        assertDoesNotThrow(() -> App.main(new String[]{"a", "b", "c"}));
    }

    /**
     * Ensures main runs without exception with null arguments.
     */
    @Test
    void mainRunsWithoutExceptionWithNullArgs() {
        assertDoesNotThrow(() -> App.main(null));
    }
}
