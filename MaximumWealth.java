//Search for the richest person using array 
public class MaximumWealth {
	public static void main(String args[]) {
		int[][] arr= {{1,2,3},{2,3,2},{2,4,3}};
		//1,2,3= 1st person
		//2,3,2=2nd person
		//2,4,3=3rd person
		int richest=FindWealth(arr);
		System.out.println("The richest man among all of them is : " + richest);
	}
	static int FindWealth(int[][] arr) {
		int ans=Integer.MIN_VALUE;
		for(int person=0;person<arr.length;person++) {
			int sum=0;
			for(int account=0;account<arr[person].length;account++) {
				sum+=arr[person][account];
				if(sum>ans) {
					ans=sum;
				}
			}
		}
		return ans;
		
	}

}
