package com.company;

import java.util.Scanner;

public class ArraysPractice3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float[] numeros = new float[5];
        int nElementos = numeros.length;

        System.out.println("Guardando los datos en el arreglo");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println((i + 1) + " Digite un numero");
            numeros[i] = scanner.nextFloat();
        }
        System.out.println("\nImprimir ");


    }
}
