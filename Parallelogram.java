package OOps;

import java.util.Scanner;

public class Parallelogram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base: ");
        double base = sc.nextDouble();

        System.out.print("Enter height: ");
        double height = sc.nextDouble();

        System.out.print("Enter side: ");
        double side = sc.nextDouble();

        double area = base * height;
        double perimeter = 2 * (base + side);

        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);
    }
}