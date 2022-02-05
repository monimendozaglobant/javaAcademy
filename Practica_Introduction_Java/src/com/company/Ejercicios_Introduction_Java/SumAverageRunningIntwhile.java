package com.company;

public class SumAverageRunningIntwhile {
    public static void main(String[] args) {
        int sum = 0;
        int lowerbound = 1;
        int upperbound = 100;
        int number = lowerbound;
        float average;
        float contador = 0;

        while (number <= upperbound) {
            sum = sum + number;
            number++;
            contador ++;
        }
        average = sum / contador;

        System.out.println("The sum from " + lowerbound + " to " + upperbound + " is " + sum);
        System.out.println("The average is " + average);

    }
}
