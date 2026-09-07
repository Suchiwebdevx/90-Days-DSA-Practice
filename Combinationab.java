//leetcode

package com.Arraypractice;

public class Combinationab {
	
	public int numDistinct(String s) {
		
		int n = s.length();
		
		return(1<<n)-1;
	}
	public static void main(String args[]) {
		
		Combinationab c= new Combinationab();
		
		String s="abc";
		
		int ans=c.numDistinct(s);
				
				
		System.out.println(ans);
	}
	
	

}
