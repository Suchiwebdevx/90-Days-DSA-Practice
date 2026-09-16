package OOps;

import java.util.Scanner;

public class Rhombus {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter diagonal 1: ");
        double d1 = sc.nextDouble();

        System.out.print("Enter diagonal 2: ");
        double d2 = sc.nextDouble();

        System.out.print("Enter side: ");
        double side = sc.nextDouble();

        double area = 0.5 * d1 * d2;
        double perimeter = 4 * side;

        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);
    }
}