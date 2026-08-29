//Find the largest digit

package com.BinarySearch;

public class LargestDigit {
	
    public static void main(String[] args) {

        int n = 58329;
        int largest = 0;

        while (n > 0) {

            int digit = n % 10;

            if (digit > largest) {
                largest = digit;
            }

            n = n / 10;
        }

        System.out.println("Largest digit = " + largest);
    }
}