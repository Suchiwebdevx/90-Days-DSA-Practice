//Find the Duplicate Number

package com.DSA;

public class FindDuplicate {
    public static void main(String[] args) {

        int[] arr = {1, 3, 4, 2, 2};

        int i = 0;

        while (i < arr.length) {

            int correctIndex = arr[i] - 1;

            if (arr[i] != arr[correctIndex]) {

                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;

            } else {
                i++;
            }
        }

        for (int index = 0; index < arr.length; index++) {

            if (arr[index] != index + 1) {
                System.out.println("Duplicate number: " + arr[index]);
                break;
            }
        }
    }
}