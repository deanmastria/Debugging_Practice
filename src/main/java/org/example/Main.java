package org.example;

public class Main {
    public static void main(String[] args) {
        // Step 1: array of integers defined
        int[] array = {1, 2, 3, 4, 5};
        // Intentionally causing an ArrayIndexOutOfBoundsException
        // This will occur on line 10
        try {
            int outOfBoundsValue = array[10]; // This line will throw ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }

        // Define a null array to trigger NullPointerException
        int[] nullArray = null;

        // Call the calculateAverage method from ArrayAverage class and handle exceptions
        try {
            double average = ArrayAverage.calculateAverage(nullArray);
            System.out.println("The average is: " + average);
        } catch (NullPointerException e) {
            System.err.println("Caught NullPointerException: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.err.println("Caught IllegalArgumentException: " + e.getMessage());
        }

        // Continue with valid input
        double average = ArrayAverage.calculateAverage(array);
        System.out.println("The average is: " + average);
    }
}




