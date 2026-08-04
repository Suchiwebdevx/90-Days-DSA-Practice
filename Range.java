// search for 3 in the range of index [1,4]
public class Range {
	
	public static void main(String args[]) {
		int[]arr = {18,12,-7,3,14,28};
		int target=-7;
		int ans=LinearSearch(target,arr,1,4);
		System.out.println(ans);
		
	}

      static int LinearSearch(int target, int[] arr,int start,int end) {
		if(arr.length==0) {
		return -1;
	}
		for(int index=start; index<=end;index++) {
			if(arr[index]==target) {
				return index;
			}
		}
		return -1;

}
}
