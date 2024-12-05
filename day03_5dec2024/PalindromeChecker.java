package com.stg.pretest;

import java.util.function.Predicate;

public class PalindromeChecker {
    public static void main(String[] args) {
        // Lambda expression to check if a number is a palindrome
        Predicate<Integer> isPalindrome = num -> {
            String str = num.toString();  // Convert number to String
            String reversed = new StringBuilder(str).reverse().toString();  // Reverse the string
            return str.equals(reversed);  // Check if original and reversed strings are equal
        };

        // Test the lambda function with a number
        int number = 121;
        if (isPalindrome.test(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
    }
}

