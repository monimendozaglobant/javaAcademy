package com.company;

import java.util.Scanner;

public class Add2Integers {
    public static void main(String[] args) {
        int firstInteger;
        int secondInteger;
        int sum;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        firstInteger = scanner.nextInt();

        System.out.println("Enter the second number: ");
        secondInteger = scanner.nextInt();

        sum = firstInteger + secondInteger;
        System.out.println("The sum is: " + sum);

    }
}
