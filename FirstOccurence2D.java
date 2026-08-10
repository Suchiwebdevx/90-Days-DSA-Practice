//22.Search for the first occurence of the element in the array

package com.BinarySearch;

public class FirstOccurence2D {

    public static void main(String args[]) {

        int[][] arr = {
            {10, 20, 20},
            {20, 20, 40},
            {50, 60, 70}
        };

        int target = 20;

        int[] ans = firstoccur(arr, target);

        if (ans[0] != -1) {

            System.out.println("First Occurrence: " + target);
            System.out.println("Row: " + ans[0]);
            System.out.println("Column: " + ans[1]);

        } else {

            System.out.println("Element not found");
        }
    }

    static int[] firstoccur(int[][] arr, int target) {

        int rows = arr.length;
        int cols = arr[0].length;

        int start = 0;
        int end = rows * cols - 1;

        int ans = -1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            // Convert 1D index into row and column
            int row = mid / cols;
            int col = mid % cols;

            if (arr[row][col] == target) {

                ans = mid;

                // Search on the left
                end = mid - 1;

            } else if (arr[row][col] > target) {

                // Search on the left
                end = mid - 1;

            } else {

                // Search on the right
                start = mid + 1;
            }
        }

        if (ans == -1) {
            return new int[] {-1, -1};
        }

        // Convert first occurrence index to row and column
        int firstRow = ans / cols;
        int firstCol = ans % cols;

        return new int[] {firstRow, firstCol};
    }
}
