//Find the Missing Number

package com.DSA;

public class MissingNumber {
	
    public static void main(String[] args) {

        int[] arr = {4, 0, 2, 1};

        int i = 0;

        while (i < arr.length) {

            int correctIndex = arr[i];

            if (arr[i] < arr.length &&
                arr[i] != arr[correctIndex]) {

                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;

            } else {
                i++;
            }
        }

        for (int index = 0; index < arr.length; index++) {

            if (arr[index] != index) {
                System.out.println("Missing number: " + index);
                return;
            }
        }

        System.out.println("Missing number: " + arr.length);
    }
}