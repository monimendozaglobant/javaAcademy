package com.company;

import java.util.Scanner;

public class SumProductMinMax3 {
    public static void main(String[] args) {
        int num1;
        int num2;
        int num3;
        int sum;
        int product;
        int min;
        int max;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        num1 = scanner.nextInt();

        System.out.println("Enter the second number: ");
        num2 = scanner.nextInt();

        System.out.println("Enter the third number");
        num3 = scanner.nextInt();

        sum = num1 + num2 + num3;
        System.out.println("The sum is: " + sum);

        product = (num1 * num2) * num3;
        System.out.println("The product is: " + product);

        min = num1;
        if (num2 < min) {
            min = num2;
        }
        if (num3 < min) {
            min = num3;
        }
        System.out.println("The min is: " +  min);

        max = num1;
        if (num2 > max){
            max = num2;
        }
        if (num3 > max){
            max = num3;
        }
        System.out.println("The max is: " +  max);
    }
}

