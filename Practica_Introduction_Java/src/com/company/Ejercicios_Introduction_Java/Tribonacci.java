package com.company;

public class Tribonacci {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c = 1;
        int max = 20;

        System.out.println("The first " + max + " Tribonacci numbers are: ");

        for (int i= 1; i <= max; i++){
            System.out.print(a + " ");
            int sum = a + b + c;
            a = b;
            b = c;
            c = sum;
        }


    }
}
