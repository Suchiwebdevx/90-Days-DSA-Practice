// Search for the maximum value in the array using 2D array linearSearch
import java.util.Arrays;

public class MaxIn2DArray {
	public static void main(String args[]) {
		int[][] arr= {
				{21,34,56},
				{67,89,22},
				{23,45}
				};
		int ans=LinearSearch(arr);
		System.out.println(ans);
		
	}

	   static int LinearSearch(int[][] arr) {
		int max=Integer.MIN_VALUE;
		for(int row= 0;row<arr.length;row++) {
			for(int col=0;col<arr[row].length;col++) {
				if(arr[row][col]>max) {
				 max = arr[row][col];
				
				}
			}
		}
		return max;
	}

}
