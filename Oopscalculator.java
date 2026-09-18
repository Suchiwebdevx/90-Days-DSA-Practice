package OOps;

import java.util.Scanner;

class Calculator {

    double a;
    double b;

    Calculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    void calculate(char operator) {

        switch (operator) {

        case '+':
            System.out.println("Result: " + (a + b));
            break;

        case '-':
            System.out.println("Result: " + (a - b));
            break;

        case '*':
            System.out.println("Result: " + (a * b));
            break;

        case '/':
            if (b != 0)
                System.out.println("Result: " + (a / b));
            else
                System.out.println("Cannot divide by zero");
            break;

        default:
            System.out.println("Invalid operator");
        }
    }
}

public class Oopscalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        System.out.print("Enter operator: ");
        char operator = sc.next().charAt(0);

        Calculator c = new Calculator(a, b);

        c.calculate(operator);

        sc.close();
    }
}