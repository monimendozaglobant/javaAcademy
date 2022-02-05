package com.company;

public class ComputePI {
    public static void main(String[] args) {

        double sum = 0.0;
        int max_Denominator = 1000;

        for (int denominator = 1; denominator <= max_Denominator; denominator += 2) {
            if (denominator % 4 == 1) {
                sum = sum + denominator;
            } else if (denominator % 4 ==3){
                sum = sum - denominator;
            } else {
                System.out.println("Impossible!");
            }
        }
        System.out.println(sum);
    }

}

