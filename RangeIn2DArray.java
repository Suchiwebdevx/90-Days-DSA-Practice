//Search for the row and column of the 2Darray using linear Search

import java.util.Arrays;

public class RangeIn2DArray {
	public static void main(String args[]) {
		int[][] arr= {
				{21,34,56},
				{67,89,22},
				{23,45}
				};
		int target=56;
		int[] ans=LinearSearch(arr,target);
		System.out.println(Arrays.toString(ans));
		
	}

	  static int[] LinearSearch(int[][] arr,int target) {
		for(int row=0;row<arr.length;row++) {
			for(int col=0;col<arr[row].length;col++) {
				if(arr[row][col]==target) {
					target= arr[row][col];
					return new int[] {row,col};
				}
			}
		}
		return new int[] {-1,-1};


	  }
}
