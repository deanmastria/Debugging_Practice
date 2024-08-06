package org.example;

public class ArrayAverage {

    //Calculate the average  of an array of integers.

    public static double calculateAverage(int[] numbers) {
        // Intentionally causing a NullPointerException if the array is null
        // This will occur on line 18
        if (numbers == null) {
            int length = numbers.length; // This line will throw NullPointerException if numbers is null
        }

        // Check if the array is empty
        if (numbers.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

    // Initialize the sum variable to store the total of array elements
    int sum = 0;

    // Iterate through each element in the array to calculate the sum
    for (int number : numbers) {
        sum += number;

    }

    // Calculate the average by dividing the sum by the number of elements
    // Cast sum to double to ensure the result is a double
    return (double) sum / numbers.length;
}
}
