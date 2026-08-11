//Sort each row independently

package BubbleSort;

import java.util.Arrays;

public class SortAarray {
	public static void main(String args[]) {
		int[][] arr = {
			    {5, 2, 8},
			    {9, 1, 4},
			    {7, 3, 6}
			};
		
		 bubbleSort(arr);
		 
		 System.out.println("Sorted array:");
		 
		 for (int[] row : arr) { 
	    System.out.println(Arrays.toString(row));
	    
	    }
		
	}

	    static void bubbleSort(int[][] arr) {
		
	    	Boolean swapped  ;
	    	
	    	for(int i=0;i<arr.length-1;i++) {
	    		
	    		swapped=false;
	    		
	    		for(int j=0;j<arr.length-i-1;j++) {
	    			
	    			if(arr[i][j] >arr[i][j+1]) {
	    				
	    				//swap 
	    				int temp=arr[i][j];
	    				arr[i][j]=arr[i][j+1];
	    				arr[i][j+1]=temp;
	    				
	    				swapped=true;
	    				
	    			}	
	    				
	    		}
	    		if(!swapped) {
	    			break;
	    		}
	    	}
	}

}
