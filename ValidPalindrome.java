package com.Pattern;

public class ValidPalindrome {

    public static void main(String[] args) {

        String str = "madam";

        int start = 0;
        int end = str.length() - 1;

        boolean palindrome = true;

        while (start < end) {

            if (str.charAt(start) != str.charAt(end)) {

                palindrome = false;
                break;
            }

            start++;
            end--;
        }

        System.out.println("Palindrome: " + palindrome);
    }
}