//Sort each row of a 2D array in ascending order

package InsertionSort;

import java.util.Arrays;

public class InsertionSort2D {
    public static void main(String[] args) {

        int[][] arr = {
            {8, 3, 5},
            {9, 2, 6},
            {7, 1, 4}
        };

        for (int i = 0; i < arr.length; i++) {

            for (int j = 1; j < arr[i].length; j++) {

                int key = arr[i][j];
                int k = j - 1;

                while (k >= 0 && arr[i][k] > key) {
                    arr[i][k + 1] = arr[i][k];
                    k--;
                }

                arr[i][k + 1] = key;
            }
        }

        for (int[] row : arr) {
            System.out.println(Arrays.toString(row));
        }
    }
}