package com.company;

import java.util.Scanner;

public class CylinderComputation {
    public static void main(String[] args) {
        double radius;
        double height;
        double baseArea;
        double surfaceArea;
        double volume;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the radius: ");
        radius = scanner.nextInt();

        System.out.println("Enter the height: ");
        height = scanner.nextInt();

        baseArea = Math.PI * radius * radius;
        surfaceArea = 2.0 * Math.PI * radius + 2.0 * baseArea;
        volume = baseArea * height;

        System.out.printf("The base area is: %.2f%n", baseArea);
        System.out.printf("The surface area is: %.2f%n", surfaceArea);
        System.out.printf("The volume is: %.2f%n", volume);

    }
}
