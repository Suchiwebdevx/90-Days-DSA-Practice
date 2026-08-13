// Solve the following to find the index  of the 30 from the given array

public class PracticeLinearSearchUsing2D {
	public static void main(String args[]) {
		
		int arr[][]= {
				{21,34,56},
				{76,30,67},
				{98,85,75}
		
		};
		int target=30;
		
		int[] solution=search(arr,target);
		
		System.out.println("The index of 30 is: ["
                + solution[0] + ", " + solution[1] + "]");
		
	}

	static int[] search(int[][] arr, int target) {
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=0;j<arr.length;j++) {
				
				if(arr[i][j]==target) {
					
					target=arr[i][j];
					
					return new int[] { i,j};
					
				}
			}
		}
		return new int [] {-1,-1};
	}

}
