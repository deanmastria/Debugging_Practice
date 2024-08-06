package org.example;

public class ArrayAverage {

    //Calculate the average  of an array of integers.

    public static double calculateAverage(int[] numbers) {
        // Check if the input array is null or empty
        if (numbers == null || numbers.length == 0) {

            //IllegalArgumentException if the array is null or empty
            throw new IllegalArgumentException("Array must be non-null and non-empty");
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
