//Find largest of three

package com.DSA;

public class LargestThree {
	
    public static void main(String[] args) {

        int a = 25;
        int b = 40;
        int c = 30;

        if (a > b && a > c) {
            System.out.println(a);
        } else if (b > c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }
}