// search how many times 5 occure in the array using linear search

public class SearchOccurenceforNum {
	
	public static void main(String args[]) {
		
		int[] arr = {5, 2, 5, 8, 5, 10, 3};
		
		int target=5;
		
		int ans=LinearSearch(arr,target);
		
		System.out.println(ans);
	}

	static int LinearSearch(int[] arr, int target) {
		
		  int ans=0;
		  
		for(int index=0;index<arr.length;index++) {
			
			if(arr[index]==target) {
				
				ans++;
			}
			
		}
		
		 return ans++;
	}

}
