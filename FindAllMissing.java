//Find All Missing Numbers

package com.DSA;

import java.util.ArrayList;

public class FindAllMissing {
	
    public static void main(String[] args) {

        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};

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

        ArrayList<Integer> missing = new ArrayList<>();

        for (int index = 0; index < arr.length; index++) {

            if (arr[index] != index + 1) {
                missing.add(index + 1);
            }
        }

        System.out.println(missing);
    }
}