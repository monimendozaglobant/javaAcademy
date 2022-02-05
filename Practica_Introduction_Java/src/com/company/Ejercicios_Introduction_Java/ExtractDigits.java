package com.company;

public class ExtractDigits {
    public static void main(String[] args) {
        int number = 3455;

        while (number > 0){
            int digit = number % 10;
            System.out.print(digit + " ");
            number = number / 10;
        }
    }
}
