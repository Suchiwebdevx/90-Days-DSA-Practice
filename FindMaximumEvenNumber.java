// Search for the maximum Even number for the array
public class FindMaximumEvenNumber {
	public static void main(String args[]) {
		int arr[]= {2,14,22,44,88,92,100};
		int Largest=FindMaximum(arr);
		System.out.println(Largest);	
	}

	  static int FindMaximum(int[] arr) {
		int ans=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0 && arr[i]>ans) {
				ans=arr[i];
			}
		}
		return ans;
	}

}
