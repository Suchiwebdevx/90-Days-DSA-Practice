package com.Pattern;

import java.io.*;

public class NthNUmber {
	
    // Function to find the nth term of series
    static int term(int n)
    {     
        // Loop to add numbers
        int ans = 0;
        for (int i = 1; i <= n; i++) 
            ans += i; 
        
        return ans;
    }

    
    public static void main(String args[])
    {
        int n = 4;
        System.out.println(term(n));
    }
}