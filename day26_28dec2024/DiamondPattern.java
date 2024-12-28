package com.demo.recursion;

public class DiamondPattern {
    // Recursive function to print the upper half of the diamond
    public static void printUpperDiamond(int n, int currentRow) {
        // Base case: When currentRow exceeds n, stop recursion
        if (currentRow > n) {
            return;
        }
        // Print spaces for the current row
        for (int i = 0; i < n - currentRow; i++) {
            System.out.print(" ");
        }

        // Print stars for the current row
        for (int i = 0; i < 2 * currentRow - 1; i++) {
            System.out.print("*");
        }
        // Move to the next line
        System.out.println();

        // Recur for the next row (upper part of the diamond)
        printUpperDiamond(n, currentRow + 1);
    }

    // Recursive function to print the lower half of the diamond
    public static void printLowerDiamond(int n, int currentRow) {
        // Base case: When currentRow becomes 0, stop recursion
        if (currentRow == 0) {
            return;
        }

        // Print spaces for the current row
        for (int i = 0; i < n - currentRow; i++) {
            System.out.print(" ");
        }
        // Print stars for the current row
        for (int i = 0; i < 2 * currentRow - 1; i++) {
            System.out.print("*");
        }
        // Move to the next line
        System.out.println();

        // Recur for the next row (lower part of the diamond)
        printLowerDiamond(n, currentRow - 1);
    }

    public static void main(String[] args) {
        int n = 5; // number of rows in the upper half of the diamond
        printUpperDiamond(n, 1); // Print upper half of the diamond
        printLowerDiamond(n, n - 1); // Print lower half of the diamond
    }
}

