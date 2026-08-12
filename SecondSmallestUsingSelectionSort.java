// Find the 2nd smallest element using Selection Sort

package SelectionSortPractice;

public class SecondSmallestUsingSelectionSort {

    public static void main(String[] args) {

        int[] arr = {40, 10, 30, 20, 50};

        int secondSmallest = selectionSort(arr);

        System.out.println("2nd smallest element: " + secondSmallest);
    }

    static int selectionSort(int[] arr) {

        for (int i = 0; i < 2; i++) {

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

        return arr[1];
    }
}