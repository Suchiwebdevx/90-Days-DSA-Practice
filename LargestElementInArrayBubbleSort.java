//Find the largest element using Bubble Sort

package BubbleSort;

import java.util.Arrays;

public class LargestElementInArrayBubbleSort {
	public static void main(String args[]) {
		int[] arr = {7, 2, 9, 1, 5};
		
         int ans=bubbleSort(arr);
		
		System.out.println("Largest element: " + ans);
		}

      static int bubbleSort(int[] arr) {
    	  
    	  for(int i=0;i<arr.length-1;i++) {
    		  
    		  for(int j=0;j<arr.length-i-1;j++) {
    			  
    			  if(arr[j] >arr[j+1]) {
    				  
    				 //swap
    				  int temp=arr[j];
    				   arr[j]=arr[j+1];
    				   arr[j+1]=temp;
    			  }
    			   
    		  }
    	  }
    	  
    	  //Find the largest element
		  return arr[arr.length-1];
		 
    	  
		
	}

}
