// Solve the following to find the index  of the 30 from the given array

public class PracticeLinearSearch {
	public static void main(String args[]) {
		
		int[] arr = {40, 10, 30, 20, 50};
		
		int target=30;
		
		int solution=search(arr,target);
		
		System.out.println(solution)	;	
	}

	  static int search(int[] arr, int target) {
		
		  for(int i=0;i<arr.length;i++) {
			  
			  if(arr[i]==target) {
				  target =i;
				  return i;
			  }
			  
		  }
		
		return -1;
	}

}
