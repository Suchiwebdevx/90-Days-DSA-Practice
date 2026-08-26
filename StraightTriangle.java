package com.Pattern;

public class StraightTriangle {

    public static void main(String[] args) {

        int n = 5;

        // Increasing triangle
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Decreasing triangle
        for (int i = n - 1; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}