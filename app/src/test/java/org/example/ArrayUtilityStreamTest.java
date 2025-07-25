package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for ArrayUtilityStream.
 * Contains unit tests for all Stream API-based array utility methods.
 */
class ArrayUtilityStreamTest {
    int[] arr = {3, 1, 7, -2, 5};

    /**
     * Tests the maximum method for correct value.
     */
    @Test
    void testMaximum() {
        assertEquals(7, ArrayUtilityStream.maximum(arr));
    }

    /**
     * Tests the minimum method for correct value.
     */
    @Test
    void testMinimum() {
        assertEquals(-2, ArrayUtilityStream.minimum(arr));
    }

    /**
     * Tests the sum method for correct value.
     */
    @Test
    void testSum() {
        assertEquals(14, ArrayUtilityStream.sum(arr));
    }

    /**
     * Tests the average method for correct value.
     */
    @Test
    void testAverage() {
        assertEquals(14.0 / 5, ArrayUtilityStream.average(arr));
    }
}