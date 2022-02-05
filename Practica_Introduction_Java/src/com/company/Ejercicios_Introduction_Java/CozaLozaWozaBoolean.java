package com.company;

public class CozaLozaWozaBoolean {
    public static void main(String[] args) {
        final int lowerbound = 1;
        final int upperbound = 110;
        boolean printed;

        for (int number = lowerbound; number <= upperbound; number++) {
            printed = false;
            if (number % 3 == 0) {
                System.out.print("Coza");
                printed = true;
            }
            if (number % 5 == 0) {
                System.out.print("Loza");
                printed = true;
            }
            if (number % 7 == 0){
                System.out.print("Woza");
                printed = true;
            }
            if (!printed){
                System.out.print(number);
            }
            if (number % 11 == 0){
                System.out.println();
            } else {
                System.out.println(" ");
            }
        }
    }
}
