//Find the missing value in the array

package com.BinarySearch;

public class MissingNumberUsingArray {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 5};

        int n = 5;

        int expectedSum = n * (n + 1) / 2;

        int actualSum = 0;

        for (int i = 0; i < arr.length; i++) {

            actualSum = actualSum + arr[i];
        }

        int missing = expectedSum - actualSum;

        System.out.println("Missing number: " + missing);
    }
}