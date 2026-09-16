package OOps;

import java.util.Scanner;

public class Trapezium {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter parallel side 1: ");
        double a = sc.nextDouble();

        System.out.print("Enter parallel side 2: ");
        double b = sc.nextDouble();

        System.out.print("Enter height: ");
        double height = sc.nextDouble();

        System.out.print("Enter side 3: ");
        double c = sc.nextDouble();

        System.out.print("Enter side 4: ");
        double d = sc.nextDouble();

        double area = 0.5 * (a + b) * height;
        double perimeter = a + b + c + d;

        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);
    }
}