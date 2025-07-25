package org.example;

/**
 * Entry point and demonstration for array utility methods.
 * Shows how to use both for-loop and Stream API methods for maximum, minimum, sum, and average.
 */
public class App {
    public static void main(String[] args) {
        int[] arr = {3, 1, 7, -2, 5};

        // Using for-loop methods
        System.out.println("Using for-loop methods:");
        System.out.println("Max: " + ArrayUtilityForLoop.maximum(arr));
        System.out.println("Min: " + ArrayUtilityForLoop.minimum(arr));
        System.out.println("Sum: " + ArrayUtilityForLoop.sum(arr));
        System.out.println("Average: " + ArrayUtilityForLoop.average(arr));

        // Using Stream API methods
        System.out.println("\nUsing Stream API methods:");
        System.out.println("Max: " + ArrayUtilityStream.maximum(arr));
        System.out.println("Min: " + ArrayUtilityStream.minimum(arr));
        System.out.println("Sum: " + ArrayUtilityStream.sum(arr));
        System.out.println("Average: " + ArrayUtilityStream.average(arr));
    }
}
