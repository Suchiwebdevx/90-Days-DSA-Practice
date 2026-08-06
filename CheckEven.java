//Search for the even digits in the even array 

import java.util.Arrays;

public class CheckEven {
	public static void main(String []args) {
		int[] arr= {12,33,44,67,120};
		int count=countEvenNumbers(arr);
		System.out.println(count);
		}

	 static int countEvenNumbers(int[] arr) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				count++;
	
	}
			}
		return count;
	}
	 

}
