package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Principal ($1k - $1M): ");
        int principal = scanner.nextInt();

        if ((principal < 1000) && (principal > 1000000) {
            System.out.println("Enter a number between 1000 and 1000000");
        } else if ((principal >= 1000) && (principal <= 1000000)) {
            System.out.println("Anual Interest Rate:");
            float interest = scanner.nextFloat();

            if ((interest <= 0) && (interest <30)){
                System.out.println("Enter a value greater than 0 and less than or equal to 30 ");
            }else if ((interest > 0) && (interest >= 30)){
                System.out.println("Period (Years):");
                int period = scanner.nextInt();
            }
        }


                ;
    }
}
