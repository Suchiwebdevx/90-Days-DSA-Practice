package com.BinarySearch;

public class FirstOccurrenceBS {

    public static void main(String[] args) {

        int arr[] = {10, 20, 20, 20, 30, 40, 50, 60};

        int target = 20;

        int ans = FirstOccurrence(arr, target);

        System.out.println(ans);
    }

    static int FirstOccurrence(int[] arr2, int target2) {

        int start = 0;
        int end = arr2.length - 1;
        int ans = -1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr2[mid] == target2) {

                ans = mid;
                end = mid - 1;   // Search left

            } else if (arr2[mid] > target2) {

                end = mid - 1;   // Search left

            } else {

                start = mid + 1; // Search right
            }
        }

        return ans;
    }
}
