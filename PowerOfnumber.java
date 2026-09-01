//write a program to read two integer number from user and print
//number 1 raise to power number 2 without using math.pow function 
//if input is 2 3 output should be 8

package com.Pattern;

import java.util.Scanner;

public class PowerOfnumber {
	
	public static void main(String args[]) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter your First Number : ");
	    int NumberFirst = sc.nextInt();
	    
	    System.out.println("Enter your Second Number : ");
	    int NumberSecond = sc.nextInt();
	    
	    int result = 1;
	    
	    for(int i = 1; i <= NumberSecond; i++) {
	    	
	    result= result * NumberFirst;
	    	
	    }
	    
	    System.out.println("Result : " + result);
	    
	    sc.close();
	}

}
