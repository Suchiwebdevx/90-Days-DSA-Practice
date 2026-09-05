package com.DSA;

import java.util.Scanner;

public class CalculatorUsingdoWhileSwitch {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int choice;
        double a, b, result;

        System.out.println("\n------ Calculator ------");

        System.out.println("1: Addition");
        System.out.println("2: Subtraction");
        System.out.println("3: Multiplication");
        System.out.println("4: Division");
        System.out.println("5: Exit");

        do {

            System.out.println("Enter Your choice:");
            choice = sc.nextInt();

            if (choice >= 1 && choice <= 4) {

                System.out.println("Enter your First Number:");
                a = sc.nextDouble();

                System.out.println("Enter your Second Number:");
                b = sc.nextDouble();

                switch (choice) {

                case 1:
                    result = a + b;
                    System.out.println("Result: " + result);
                    break;

                case 2:
                    result = a - b;
                    System.out.println("Result: " + result);
                    break;

                case 3:
                    result = a * b;
                    System.out.println("Result: " + result);
                    break;

                case 4:
                    if (b != 0) {
                        result = a / b;
                        System.out.println("Result: " + result);
                    } else {
                        System.out.println("Cannot divide by 0");
                    }
                    break;
                }

            } else if (choice != 5) {

                System.out.println("Invalid choice");

            }

        } while (choice != 5);

        System.out.println("Calculator closed.");

        sc.close();
    }
}