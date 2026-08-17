//Sort only a specific array using a method

package InsertionSort;

import java.util.Arrays;

public class InsertionSortMethod {

    static void insertionSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {

            int key = arr[i];
            
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
            	
                arr[j + 1] = arr[j];
                
                j--;
            }

            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {

        int[] arr = {10, 5, 8, 2, 7};

        insertionSort(arr);

        System.out.println(Arrays.toString(arr));
    }
}