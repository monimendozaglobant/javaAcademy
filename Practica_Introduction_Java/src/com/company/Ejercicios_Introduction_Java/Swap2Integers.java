package com.company;

import java.util.Scanner;

public class Swap2Integers {
    public static void main(String[] args) {
        int number1;
        int number2;
        int temp;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        number1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        number2 = scanner.nextInt();

        System.out.println("Before swapping the numbers are: " + number1 + " " + number2);

        temp = number1;
        number1 = number2;
        number2 = temp;

        System.out.println("After swapping the numbers are: " + number1 + " " + number2);

    }
}
