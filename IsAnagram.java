//Check whether two strings are anagrams

package OOps;

import java.util.Arrays;

public class IsAnagram{
	
	static boolean IsAnagram(String str1,String str2) {
		
		//Coverting to Lowercase
		str1= str1.replace(" ","").toLowerCase();
		str2= str2.replace(" ","").toLowerCase();
		
		//check the length
		if(str1.length()!=str2.length()) {
		return false;
	}
		//covert string to array
	char[] arr1= str1.toCharArray();
	char[] arr2= str2.toCharArray();
	
	//sort 
	Arrays.sort(arr1);
	Arrays.sort(arr2);
	
	//compare both array
	return Arrays.equals(arr1,arr2);
}
	public static void main (String[] args) {
		
		System.out.println(IsAnagram("Listen","silent"));
		System.out.println(IsAnagram("Hello","World"));
		
	}
}        