package OOps;

import java.util.Scanner;

public class QuadrilateralPerimeter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side 1: ");
        double side1 = sc.nextDouble();

        System.out.print("Enter side 2: ");
        double side2 = sc.nextDouble();

        System.out.print("Enter side 3: ");
        double side3 = sc.nextDouble();

        System.out.print("Enter side 4: ");
        double side4 = sc.nextDouble();

        double perimeter = side1 + side2 + side3 + side4;

        System.out.println("Perimeter = " + perimeter);
    }
}