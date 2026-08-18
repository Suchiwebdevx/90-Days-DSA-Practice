//Sort in descending order

package InsertionSort;

import java.util.Arrays;

public class InsertionSortDescending2D {
    public static void main(String[] args) {

        int[] arr = {10, 4, 15, 2, 8};

        for (int i = 1; i < arr.length; i++) {

            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] < key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }

        System.out.println(Arrays.toString(arr));
    }
}