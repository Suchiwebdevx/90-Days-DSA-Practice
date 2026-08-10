
//19. Search for an element using Binary Search in:

package com.BinarySearch;

import java.util.Arrays;

public class SearchingUsingBinary {
	public static void main(String args[]) {
		
		int[][] arr = {
			    {10, 20, 30},
			    {40, 50, 60},
			    {70, 80, 90}
			};
		
		int target=30;
		
		int[] ans= SearchingElement(arr,target);
		
		if(ans[0]!=-1) {
			System.out.println("Element found that row " + ans[0]);
			System.out.println("Element found that column " + ans[1]);
		}else {
			System.out.println("Element found that found!!");
		}
	}

	static int[] SearchingElement(int[][] arr, int target) {
		
		int row=arr.length;
		int col=arr[0].length;
		
		int start=0;
		int end=row * col-1;
		
		while(start<=end) {
			
			int mid= start+(end-start)/2;
			
			//convert row and col into 1D array
			int row1= mid/col;
			int col1= mid % col;
			
			if(arr[row1][col1] == target) {
				return new int[] {row1,col1};
					}
				if(arr[row1][col1]< target) {
					start=mid+1;
				}else {
					end= mid-1;
				}
		}
		return new int[] {-1,-1};
		
	}

}
