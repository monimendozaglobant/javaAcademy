package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class SumAverageRunningInt {
    public static void main(String[] args) {
        int sum = 0;
        final int lowerBound = 1;
        final int upperBound = 100;
        float average;
        float contador = 0;

        for (int number = lowerBound; number <= upperBound; number++) {
            sum = sum + number;
            contador++;
        }

        average = sum / contador;

        System.out.println("The sum from " + lowerBound + " to " + upperBound + " is " + sum);
        System.out.println("The average is " + average);


    }

}

