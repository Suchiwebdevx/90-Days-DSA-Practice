//Sort every column independently

package InsertionSort;

import java.util.Arrays;

public class SortColumns {

    public static void main(String[] args) {

        int[][] arr = {
            {5, 2, 8},
            {9, 1, 4},
            {7, 3, 6}
        };

        for (int col = 0; col < arr[0].length; col++) {

            for (int row = 1; row < arr.length; row++) {

                int key = arr[row][col];
                int k = row - 1;

                while (k >= 0 && arr[k][col] > key) {

                    arr[k + 1][col] = arr[k][col];
                    k--;
                }

                arr[k + 1][col] = key;
            }
        }

        for (int[] row : arr) {
        	
            System.out.println(Arrays.toString(row));
        }
    }
}