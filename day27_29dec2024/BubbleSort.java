package com.demo.recursion;

public class BubbleSort {

    // Function to perform the bubble sort recursively
    public static void bubbleSortRecursive(int[] arr, int n) {
        // Base case: If the size of the array is 1 or less, it's already sorted
        if (n == 1) {
            return;
        }

        // Perform one pass of bubble sort (compare and swap)
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                // Swap the elements if they are in the wrong order
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }

        // Recursively sort the first n-1 elements (since the last element is already in place)
        bubbleSortRecursive(arr, n - 1);
    }

    // Utility function to print the array
    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Original Array:");
        printArray(arr);

        // Perform recursive bubble sort
        bubbleSortRecursive(arr, arr.length);

        System.out.println("Sorted Array:");
        printArray(arr);
    }
}

