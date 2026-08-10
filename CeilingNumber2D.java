//21.search for the ceiling number in 2D array

package com.BinarySearch;

public class CeilingNumber2D {
	public static void main(String args[]) {
		int[][] arr = {
			    {10, 20, 30},
			    {40, 50, 60},
			    {70, 80, 90}
			};
		
		int target=51;
		
		int[] ans= ceilingsearch(arr,target);
		
		if (ans[0] != -1) {
			
		 System.out.println("Ceiling element: " + ans[2]);
		 System.out.println("Row: " + ans[0]);
		 System.out.println("Column: " + ans[1]); 
		 } else { 
			 System.out.println("Ceiling does not exist");
			 }	
		}

	  static int[] ceilingsearch(int[][] arr, int target) {
		
		  int row=arr.length;
		  int col=arr[0].length;
		  
		  int start=0;
		  int end= row * col -1;
		  
		  while(start<=end) {
			  
			  int mid= start+(end-start)/2;
			  
			// coverting rows and columns into 1D array
			  
			  int rows=mid / col;
			  int cols=mid % col;
			  
			  if(arr[rows][cols]== target) {
				  return new int[] {rows,cols,arr[rows][cols]};
			  }
			  
			  if(arr[rows][cols]<target) {
				  start=mid+1;
			  }else {
				  end=mid-1;
				  
			  }  
	   }
		// start is now the position of the ceiling 
		  if (start < row * col) {
			  
			 int ceilingRow = start / col;
			 
			 int ceilingCol = start % col; 
			 
			 return new int[] { 
					 
					 ceilingRow, ceilingCol, arr[ceilingRow][ceilingCol]
							
			 }; 
			 } 
		  // No ceiling exists 
		  return new int[] {-1, -1, -1};
			
	}

}
