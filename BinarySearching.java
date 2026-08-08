//Searching elements using Binary search in the array
//Find the middle element
//Target->mid->search in the right else search in left

package com.BinarySearch;

public class BinarySearching {
	public static void main(String args[]) {
		
		int arr[]= {10,20,30,40,50,60,70,80};
		
		int target=-2;
		
		int ans=SearchNumber(arr,target);
		
		System.out.println(ans);		
	}

	static int SearchNumber(int[] arr, int target) {
		int start=0;
		
		int end=arr.length-1;

		while(start <= end) {
			
			int mid= start + (end-start)/2;
			
			if(target<arr[mid]) {
				
			  end = mid - 1;
			}
			
			else if(target>arr[mid]) {
				
			   start = mid + 1;
			   
			}else { 
				
				return mid;
			}
			
		}
		
		return -1;
		
	}

}
