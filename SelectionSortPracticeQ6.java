// Use Selection Sort to arrange the elements in ascending order.

package SelectionSortPractice;

import java.util.Arrays;

public class SelectionSortPracticeQ6 {

    public static void main(String[] args) {

        int[] arr = {29, 10, 14, 37, 13};

        selectionSort(arr);

        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            int minIndex = i;

            // Find the smallest element
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}