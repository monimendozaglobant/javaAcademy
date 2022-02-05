package com.company;

public class Fibonacci {
    public static void main(String[] args) {

        int fnMinus1 = 0;
        int fnMinus2 = 1;
        int nMax = 20;


        System.out.println("The first " + nMax + " Fibonacci numbers are: ");

        int n = 1;
        while (n <= nMax) {
            System.out.print(fnMinus1 + " ");
            int sum = fnMinus1 + fnMinus2;
            fnMinus1 = fnMinus2;
            fnMinus2 = sum;
            n++;
        }

    }
}

