package com.company;

public class SumAverageRunningIntDoWhile {
    public static void main(String[] args) {
        int sum = 0;
        int lowerbound = 1;
        int upperbound = 100;
        float average;
        float contador = 0;
        int number = lowerbound;

        do {
            sum = sum + number;
            number++;
            contador++;

        } while (number <= upperbound);

        average = sum / contador;

        System.out.println("The sum from " + lowerbound + " to " + upperbound + " is " + sum);
        System.out.println("The average is " + average);

    }
}
