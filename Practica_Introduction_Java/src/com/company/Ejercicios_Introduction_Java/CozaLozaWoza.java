package com.company;

public class CozaLozaWoza {
    public static void main(String[] args) {
        final int lowerbound = 1;
        final int upperbound = 110;

        for (int number = lowerbound; number <= upperbound; ++number) {
            if (number % 3 == 0) {
                System.out.print("Coza");
            }
            if (number % 5 == 0) {
                System.out.print("Loza");
            }
            if (number % 7 == 0) {
                System.out.print("Woza");
            }
            if (number % 3 != 0 && number % 5 != 0 && number % 7 != 0) {
                System.out.print(number);
            }
            if (number % 11 == 0) {
                System.out.println();
            } else {
                System.out.print(" ");
            }


        }
    }
}
