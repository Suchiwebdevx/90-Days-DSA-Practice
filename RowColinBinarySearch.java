//20.Find the row and column of 60 in the above 2D array.

package com.BinarySearch;

public class RowColinBinarySearch {
	public static void main(String args[]) {
		int[][] arr = {
			    {10, 20, 30},
			    {40, 50, 60},
			    {70, 80, 90}
			};
		
		int target=60;
		
		int[] ans=search(arr,target);
		
		if(ans[0]!=-1) {
			System.out.println("LENGTH = " + ans.length);
			System.out.println("ROW = " + ans[0]);
			System.out.println("COL = " + ans[1]);
		}else {
			System.out.println("Element found that found!!");
		}
	}

	 static int[] search(int[][] arr, int target) {
		int rows=arr.length;
		int cols=arr[0].length;
		
		int start=0;
		int end=rows * cols -1;
		
		while(start <= end) {
			
			int mid= start +(end-start)/2;
			
			//coverting row and cols into 1D arrays
			
			int row=mid/cols;
			int col=mid % cols;
			
			if(arr[row][col]== target) {
				return new int[] {row,col};
				
				}
			if(arr[row][col]< target) {
					start=mid +1;
				}else {
					end= mid-1;
				}
		}
		return new int[] {-1,-1};
	}

}
