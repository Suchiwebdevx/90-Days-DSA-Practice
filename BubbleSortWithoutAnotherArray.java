// Bubble Sort without using another array
// Sort each row independently

package BubbleSort;

import java.util.Arrays;

public class BubbleSortWithoutAnotherArray {

    public static void main(String[] args) {

        int[][] arr = {
            {10, 4, 8},
            {3, 15, 2},
            {7, 1, 9}
        };

        bubbleSort(arr);

        System.out.println("Sorted array:");

        for (int[] row : arr) {
            System.out.println(Arrays.toString(row));
        }
    }

    static void bubbleSort(int[][] arr) {

        // Select each row
        for (int i = 0; i < arr.length; i++) {

            // Bubble Sort for current row
            for (int pass = 0; pass < arr[i].length - 1; pass++) {

                for (int j = 0; j < arr[i].length - pass - 1; j++) {

                    if (arr[i][j] > arr[i][j + 1]) {

                        // Swap elements in the same array
                        int temp = arr[i][j];
                        arr[i][j] = arr[i][j + 1];
                        arr[i][j + 1] = temp;
                    }
                }
            }
        }
    }
}

