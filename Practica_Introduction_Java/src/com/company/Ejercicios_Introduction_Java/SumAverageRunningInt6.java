package com.company;

public class SumAverageRunningInt6 {
    public static void main(String[] args) {

        int sumEven = 0;
        int sumOdd = 0;
        int diff;

        for (int number = 1; number <= 100; number++) {
            if (number % 2 == 0) {
                sumEven = sumEven + number;
            } else {
                sumOdd = sumOdd + number;
            }

        }
        System.out.println("The Accumulating sum of even numbers from 1 to 100 is " + sumEven);
        System.out.println("The Accumulating sum of Odd numbers from 1 to 100 is " + sumOdd);

        if (sumOdd > sumEven) {
            diff = sumOdd - sumEven;
        } else {
            diff = sumEven - sumOdd;
        }

        System.out.println("The absolute difference is: " + diff);

    }
}
