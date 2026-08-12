//Use Selection Sort to arrange the array in descending order.

package SelectionSortPractice;

import java.util.Arrays;

public class DescendingOrderUsingSC {
	public static void main(String[] args) {
		
		int arr[]= {0,89,-32,98,12};
		
		selectionsort(arr);
		
		System.out.println(Arrays.toString(arr));
		
		
		
	}

	   static void selectionsort(int[] arr) {
		
		   for(int i=0;i<arr.length-1;i++) {
			   
			   int maxIndex=i;
			   
			   for(int j=i+1;j<arr.length;j++) {
				   
				   if(arr[j] > arr[maxIndex]) {
					   
					   maxIndex=j;
				   }
			   }
					   
					   //Swap after finding minimum value 
					   
					   int temp=arr[i];
					   arr[i]=arr[maxIndex];
					   arr[maxIndex]=temp;
		   }
		
	}

}
