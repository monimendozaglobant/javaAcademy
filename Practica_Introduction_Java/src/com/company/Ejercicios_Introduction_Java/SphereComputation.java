package com.company;

import java.util.Scanner;

public class SphereComputation {
    public static void main(String[] args) {
        double radius;
        double surfaceArea;
        double volume;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the radius: ");
        radius = scanner.nextInt();

        surfaceArea = 4 * Math.PI * radius * radius;
        volume = (4 * Math.PI * radius * radius * radius) / 3;

        System.out.printf("The surface area is: %.2f%n", surfaceArea);
        System.out.printf("The volume is: %.2f%n", volume);
    }
}
