//Find the Largest Element in an Array

package com.DSA;

public class BiggestElement {
	
    public static void main(String[] args) {

        int[] arr = {10, 25, 7, 45, 18};

        int largest = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > largest) {
            	
                largest = arr[i];
            }
        }

        System.out.println("Largest: " + largest);
    }
}