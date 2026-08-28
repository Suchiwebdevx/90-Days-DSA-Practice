//Find the maximum profit

package com.DSA;

public class MaximumDifference {

    public static void main(String[] args) {

        int[] arr = {7, 1, 5, 3, 6, 4};

        int min = arr[0];
        int maxDifference = 0;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] < min) {
                min = arr[i];
            }

            int difference = arr[i] - min;

            if (difference > maxDifference) {
                maxDifference = difference;
            }
        }

        System.out.println("Maximum Difference: " + maxDifference);
    }
}