package OOps;

import java.util.Scanner;

public class CircleCircumference {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        double circumference = 2 * Math.PI * radius;

        System.out.println("Circumference = " + circumference);
    }
}