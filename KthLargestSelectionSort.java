//Find the Kth Largest Element Using Selection Sort

package Selectionsort;

public class KthLargestSelectionSort {
	public static void main(String args[]) {
		
		int arr[]= {23,40,30,50,67};
		
		int k=2;
		
		for(int i=0;i<k;i++) {
			
			int minIndex=i;
			
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[j]>arr[minIndex]) {
					minIndex=j;
				}
			}
				
				//swap
				int temp=arr[i];
				arr[i]=arr[minIndex];
				arr[minIndex]=temp;
			  }
			
			System.out.println(k + "rd Largest element: " + arr[k - 1]);
			
			
		}
	}


