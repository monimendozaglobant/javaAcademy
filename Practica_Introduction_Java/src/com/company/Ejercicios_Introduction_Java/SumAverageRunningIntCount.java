package com.company;

public class SumAverageRunningIntCount {
    public static void main(String[] args) {
        int sum = 0;
        int lowerbound = 111;
        int upperbound = 8899;
        float average;
        float count = 0;

        for (int number = lowerbound; number <= upperbound; number++) {
            sum = sum + number;
            count++;
        }

        average = sum / count;

        System.out.println("The sum from " + lowerbound + " to " + upperbound + " is " + sum);
        System.out.println("The average is " + average);


    }
}
