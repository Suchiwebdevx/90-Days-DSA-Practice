//Leaders in an Array

package com.Arraypractice;

public class LeaderElement {
	public static void main(String args[]) {
		
		int[] arr = {16, 17, 4, 3, 5, 2};

		int maxRight = arr[arr.length - 1];

		System.out.println(maxRight);

		for (int i = arr.length - 2; i >= 0; i--) {

		    if (arr[i] > maxRight) {

		        System.out.println(arr[i]);

		        maxRight = arr[i];
		    }
		}
	}

}
