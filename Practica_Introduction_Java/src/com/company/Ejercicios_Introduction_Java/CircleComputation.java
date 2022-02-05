package com.company;

import java.util.Scanner;

public class CircleComputation {
    public static void main(String[] args) {
        double radius;
        double diameter;
        double circumference;
        double area;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the radius: ");
        radius = scanner.nextInt();

        diameter = 2.0 * radius;
        circumference = 2.0 * Math.PI * radius;
        area = Math.PI * radius * radius;

        System.out.printf("The diameter is: %.2f%n",  diameter);
        System.out.printf("The circumference is: %.2f%n", circumference);
        System.out.printf("The area is: %.2f%n", area);





    }
}
