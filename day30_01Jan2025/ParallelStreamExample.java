package com.stg.pretest;
import java.util.Arrays;
import java.util.List;

public class ParallelStreamExample {
	/*
	 * Calculate the sum of squared values of even numbers in a list of integers. 
	 * This is a computationally heavy task that will benefit from parallelism.
	 */
    public static void main(String[] args) {
        // Sample list of integers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Using parallel stream to filter even numbers, square them, and sum them
        int sumOfSquares = numbers.parallelStream() // Use parallel stream
                .filter(n -> n % 2 == 0) // Filter even numbers
                .mapToInt(n -> n * n) // Square the numbers
                .sum(); // Sum the squared numbers

        System.out.println("Sum of squares of even numbers: " + sumOfSquares);
    }
}

