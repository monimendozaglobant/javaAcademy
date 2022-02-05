package com.company;

public class SumAverageRunningIntSquares {
    public static void main(String[] args) {

        int sumOfSquares = 0;

        for (int numero = 1; numero <= 100; numero++) {
            sumOfSquares = sumOfSquares + (numero * numero);

        }

        System.out.println("The sum of the Squares are " + sumOfSquares);


    }
}
