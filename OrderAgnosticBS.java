// To search whether array is in ascending order or descanding order

package com.BinarySearch;

public class OrderAgnosticBS {

    public static void main(String args[]) {

        int arr[] = {80,70,60,50,40,30,20,10};

        int target = 50;

        int ans = SearchNumber(arr, target);

        System.out.println(ans);
    }

    static int SearchNumber(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        boolean isAsc;

        if (arr[start] < arr[end]) {
            isAsc = true;
        } else {
            isAsc = false;
        }

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {

                // Ascending order
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            } else {

                // Descending order
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return -1;
    }
}