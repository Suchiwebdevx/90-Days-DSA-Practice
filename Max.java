//search for the maximum value in the array using linear search
public class Max {
	public static void main(String args[]) {
		int[] arr= {18,12,7,3,14,28};
		int ans=LinearSearch(arr);
		System.out.println(ans);
	}
	static int LinearSearch(int[] arr) {
		int ans=arr[0];
		for(int i =0;i<arr.length;i++) {
			if(arr[i]>ans) {
				ans=arr[i];
			}
		}
		return ans;
	}
      
}
