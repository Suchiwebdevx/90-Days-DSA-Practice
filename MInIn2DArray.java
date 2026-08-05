//Search Minimum value in the 2DArray using linearSearch

import java.util.Arrays;

public class MInIn2DArray {
	public static void main(String args[]) {
		int[][] arr= {
				{21,33,56},
				{67,89,22},
				{23,45}
				};
		int ans=LinearSearch(arr);
		System.out.println(ans);
	}

	  static int LinearSearch(int[][] arr) {
		int min=Integer.MAX_VALUE;
		for(int row=0;row<arr.length;row++) {
			for(int col=0;col<arr[row].length;col++) {
				if(arr[row][col]<min) {
					min = arr[row][col];
				}
			}
		}
		return min;
	}
 
}
