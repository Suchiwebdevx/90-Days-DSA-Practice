// Sort a 2D array and search for an element

package BubbleSort;

import java.util.Arrays;

public class SortAndSearch2D {

    public static void main(String[] args) {

        int[][] arr = {
            {40, 10, 30},
            {20, 60, 50},
            {90, 70, 80}
        };

        // Step 1: Sort each row
        bubbleSort(arr);

        System.out.println("Sorted array:");

        for (int[] row : arr) {
            System.out.println(Arrays.toString(row));
        }

        // Step 2: Search for an element
        int target = 50;

        int[] ans = searchElement(arr, target);

        if (ans[0] != -1) {
            System.out.println(
                "Element " + target +
                " found at row: " + ans[0] +
                ", column: " + ans[1]
            );
        } else {
            System.out.println("Element not found");
        }
    }

    // Bubble Sort each row
    static void bubbleSort(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {

            for (int pass = 0; pass < arr[i].length - 1; pass++) {

                for (int j = 0; j < arr[i].length - pass - 1; j++) {

                    if (arr[i][j] > arr[i][j + 1]) {

                        // Swap
                        int temp = arr[i][j];
                        arr[i][j] = arr[i][j + 1];
                        arr[i][j + 1] = temp;
                    }
                }
            }
        }
    }

    // Linear Search
    static int[] searchElement(int[][] arr, int target) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{-1, -1};
    }
}
