package org.example;

import java.util.Arrays;

/**
 * Utility class that provides basic statistical operations
 * on integer arrays using the Java Stream API.
 */
public class ArrayUtilityStream {

    /**
     * Finds the maximum value in the given integer array using the Java Stream API.
     *
     * @param nums the array of integers to search
     * @return the largest integer in the array
     * @throws IllegalArgumentException if the array is empty
     */
    public static int maximum(int[] nums) {
        return Arrays.stream(nums)
                .max()
                .orElseThrow(() -> new IllegalArgumentException("Array is empty"));
    }

    /**
     * Finds the minimum value in the given integer array using the Java Stream API.
     *
     * @param nums the array of integers to search
     * @return the smallest integer in the array
     * @throws IllegalArgumentException if the array is empty
     */
    public static int minimum(int[] nums) {
        return Arrays.stream(nums)
                .min()
                .orElseThrow(() -> new IllegalArgumentException("Array is empty"));
    }

    /**
     * Calculates the sum of all values in the given integer array using the Java Stream API.
     *
     * @param nums the array of integers to sum
     * @return the sum of the integers in the array
     */
    public static int sum(int[] nums) {
        return Arrays.stream(nums).sum();
    }

    /**
     * Calculates the average of the values in the given integer array using the Java Stream API.
     *
     * @param nums the array of integers to average
     * @return the average value as a double
     * @throws IllegalArgumentException if the array is empty
     */
    public static double average(int[] nums) {
        return Arrays.stream(nums)
                .average()
                .orElseThrow(() -> new IllegalArgumentException("Array is empty"));
    }
}