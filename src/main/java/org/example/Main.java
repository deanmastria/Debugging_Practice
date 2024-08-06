package org.example;

public class Main {
    public static void main(String[] args) {
        //array of integers defined
        int[] array = {1, 2, 3, 4, 5};

        //call the calculateAverage method from ArrayAverage class and store the result
        double average = ArrayAverage.calculateAverage(array);

        //print the calculated average to the console
        System.out.println("Average: " + average);
    }
}