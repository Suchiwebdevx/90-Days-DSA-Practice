//Find the Kth Smallest Element Using Selection Sort

package Selectionsort;

public class KthSmallestSelectionSort {

    public static void main(String[] args) {

        int[] arr = {40, 10, 30, 20, 50};
        int k = 3;

        
        for (int i = 0; i < k; i++) {

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

        System.out.println(k + "rd smallest element: " + arr[k - 1]);
    }
}