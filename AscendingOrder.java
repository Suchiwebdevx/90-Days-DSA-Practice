//Sort the array in ascending order using bubble sort

package BubbleSort;

import java.util.Arrays;

public class AscendingOrder {
	public static void main(String args[]) {
		
		int[] arr = {5, 2, 8, 1, 3};
		
        bubblesort(arr);
		
		System.out.println(Arrays.toString(arr));
		
		
	}

	   static void bubblesort(int[] arr) {
		
		   Boolean Swapped ;
		   
		   for(int i=0;i<arr.length;i++) {
			   
			   Swapped=false;
			   
			   for(int j=1;j<arr.length-i;j++) {
				   
				   if(arr[j] < arr[j-1]) {
					   
					   //swap
					   int temp=arr[j-1];
					   arr[j-1]=arr[j];
					   arr[j]=temp;
					   Swapped=true;
				   }
			   }
			   if(!Swapped) {
					break;
		   }
		
		}
	}

}
