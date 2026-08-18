//Sort the array in ascending order using Insertion Sort.

package InsertionSort;

import java.util.Arrays;

public class InsertionSortExample {
	
    public static void main(String[] args) {

        int[] arr = {12, 5, 9, 3, 15, 1};

        for (int i = 1; i < arr.length; i++) {

            int current = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = current;
        }

        System.out.println(Arrays.toString(arr));
    }
}