package com.company;

public class Product1ToN {
    public static void main(String[] args) {

        long product = 1;

        for (long number = 1; number <= 13; number++){
            product = product * number;
        }

        System.out.println(product);
    }
}
