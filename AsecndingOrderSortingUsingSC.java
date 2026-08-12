//Use Selection Sort to arrange the elements in ascending order.

package SelectionSortPractice;

import java.util.Arrays;

public class AsecndingOrderSortingUsingSC {
         public static void main(String args[]) {
		
		    int[] arr = {5, 2, 8, 1, 3};
		    
		    selectionSort(arr);
		    
		    System.out.println(Arrays.toString(arr));
		    
         }
			   
			   static void selectionSort(int[] arr) {

				    for (int i = 0; i < arr.length - 1; i++) {

				        int minindex = i;

				        // Find the minimum value
				        for (int j = i + 1; j < arr.length; j++) {

				            if (arr[j] < arr[minindex]) {
				                minindex = j;
				            }
				        }

				        // Swap AFTER finding the minimum
				        int temp = arr[i];
				        arr[i] = arr[minindex];
				        arr[minindex] = temp;
				   
				}
           }
       }
    
   
