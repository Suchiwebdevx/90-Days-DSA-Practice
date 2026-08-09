//Find whether 25 exists or not

import java.util.Arrays;

public class LinearSearch {
	public static void main(String args[]) {
		int[] arr = {10, 20, 30, 40, 50};
		int target=25;
		int ans= SearchNumber(arr,target);
		System.out.println(ans);
	}

	static int SearchNumber(int[] arr, int target) {
		
		if(arr.length==0) {
			return -1;
		}
		for(int index=0;index<arr.length;index++) {
			if(arr[index]==target) {
			return index;
			}
		}
		
		return -1;
	}

}
