package org.example;

public class ArrayAverage {

    /**
     * Method to calculate the average of an array of integers.
     * @param numbers Array of integers.
     * @return The average as a double.
     */
    public static double calculateAverage(int[] numbers) {
        // Step 1: Check for null or empty array to prevent NullPointerException or division by zero
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        // Step 2: Initialize the sum variable
        int sum = 0;

        // Step 3: Iterate over the array and calculate the sum
        for (int number : numbers) {
            sum += number;
        }

        // Step 4: Calculate the average and cast the sum to double to avoid integer division
        return (double) sum / numbers.length;
    }

    public static void main(String[] args) {
        // Step 5: Test with a normal array
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Average: " + calculateAverage(numbers));  // Should print 3.0

        // Step 6: Introduce a null pointer exception
        try {
            int[] nullArray = null;
            System.out.println("Average: " + calculateAverage(nullArray));  // This will cause a NullPointerException
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        // Step 7: Introduce an array index out of bounds exception (in the previous version of the method)
        try {
            int[] outOfBoundsArray = {1, 2, 3};
            // Incorrect loop in previous version (i <= numbers.length) would cause an exception here
            // Simulate previous code to show where the error occurs
            System.out.println("Simulated Average: " + simulateArrayIndexOutOfBounds(outOfBoundsArray));
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        // Step 8: Introduce a logic error (in the previous version of the method)
        try {
            int[] logicErrorArray = {1, 2, 3, 4, 5};
            // Integer division logic error in previous version (return sum / numbers.length)
            // Simulate previous code to show where the logic error occurs
            System.out.println("Simulated Average: " + simulateLogicError(logicErrorArray));  // Should print 3.0 but logic error would give incorrect result
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    // Method to simulate ArrayIndexOutOfBoundsException from previous version of calculateAverage
    public static double simulateArrayIndexOutOfBounds(int[] numbers) {
        int sum = 0;
        for (int i = 0; i <= numbers.length; i++) {  // Intentional off-by-one error
            sum += numbers[i];
        }
        return (double) sum / numbers.length;
    }

    // Method to simulate logic error from previous version of calculateAverage
    public static double simulateLogicError(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum / numbers.length;  // Intentional logic error, missing cast to double
    }
}



//DEBUGGING
//Breakpoints were set at ciritcal lines to inspect the state of the program
//Inspected variables at the breakpoints to understand their values and states
//identified the issues i made in NullPointerException, ArrayOutOfBoudnsException and Logic error


//NullPointerException
// line 26 in main method when calling calculateAverage

//FIX Added a check to throw an IllegalArgumentException if the array is null or empty.

//ArrayOutofBoundsException
// line 34 when calling simulateArrayOutOfBoundIndex
//line 61 in simArrayOutOfBoundsMethod when i equals numbers.length

//FIX Corrected the loop condition to ensure the index stays within the bounds of the array.

//Logic Error
//line 44 in main method when calling simulateLogicError
//line 70 in sumulateLogicError when perform integer division

// FIX Cast the sum to double before dividing to ensure floating-point division.


