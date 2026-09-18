package OOps;

import java.util.Scanner;

public class MethodsClaculator {

    static double add(double a, double b) {
        return a + b;
    }

    static double subtract(double a, double b) {
        return a - b;
    }

    static double multiply(double a, double b) {
        return a * b;
    }

    static double divide(double a, double b) {
        return a / b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        System.out.print("Enter operator: ");
        char op = sc.next().charAt(0);

        switch (op) {

        case '+':
            System.out.println(add(a, b));
            break;

        case '-':
            System.out.println(subtract(a, b));
            break;

        case '*':
            System.out.println(multiply(a, b));
            break;

        case '/':
            System.out.println(divide(a, b));
            break;

        default:
            System.out.println("Invalid operator");
        }

        sc.close();
    }
}