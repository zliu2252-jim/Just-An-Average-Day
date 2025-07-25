package org.example;

/**
 * Utility class that provides basic statistical operations
 * on integer arrays using traditional for-loops.
 */
public class ArrayUtilityForLoop {

    /**
     * Finds the maximum value in the given integer array using a for loop.
     *
     * @param nums the array of integers to search
     * @return the largest integer in the array
     * @throws IllegalArgumentException if the array is null or empty
     */
    public static int maximum(int[] nums) {
        if (nums == null || nums.length == 0)
            throw new IllegalArgumentException("Array is empty");
        int max = nums[0];
        for (int num : nums) {
            if (num > max) max = num;
        }
        return max;
    }

    /**
     * Finds the minimum value in the given integer array using a for loop.
     *
     * @param nums the array of integers to search
     * @return the smallest integer in the array
     * @throws IllegalArgumentException if the array is null or empty
     */
    public static int minimum(int[] nums) {
        if (nums == null || nums.length == 0)
            throw new IllegalArgumentException("Array is empty");
        int min = nums[0];
        for (int num : nums) {
            if (num < min) min = num;
        }
        return min;
    }

    /**
     * Calculates the sum of all values in the given integer array using a for loop.
     *
     * @param nums the array of integers to sum
     * @return the sum of the integers in the array
     * @throws IllegalArgumentException if the array is null
     */
    public static int sum(int[] nums) {
        if (nums == null)
            throw new IllegalArgumentException("Array is null");
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }

    /**
     * Calculates the average of the values in the given integer array using a for loop.
     *
     * @param nums the array of integers to average
     * @return the average value as a double
     * @throws IllegalArgumentException if the array is null or empty
     */
    public static double average(int[] nums) {
        if (nums == null || nums.length == 0)
            throw new IllegalArgumentException("Array is empty");
        return (double) sum(nums) / nums.length;
    }
}