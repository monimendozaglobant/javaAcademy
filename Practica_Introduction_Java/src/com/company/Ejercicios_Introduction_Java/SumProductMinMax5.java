package com.company;

import java.util.Scanner;

public class SumProductMinMax5 {
    public static void main(String[] args) {
        int num1;
        int num2;
        int num3;
        int num4;
        int num5;
        int suma;
        int producto;
        int min;
        int max;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer numero: ");
        num1 = scanner.nextInt();

        System.out.println("Ingrese el segundo numero: ");
        num2 = scanner.nextInt();

        System.out.println("Ingrese el tercer numero: ");
        num3 = scanner.nextInt();

        System.out.println("Ingrese el cuarto numero: ");
        num4 = scanner.nextInt();

        System.out.println("Ingrese el quinto numero: ");
        num5 = scanner.nextInt();

        suma = num1 + num2 + num3 + num4 + num5;
        System.out.println("El resultado de la suma es: " + suma);

        producto = num1 * num2 * num3 * num4 * num5;
        System.out.println("El producto es: " + producto);

        min = num1;
        if (num2 < min){
            min = num2;
        }
        if (num3 < min){
            min = num3;
        }
        if (num4 < min){
            min = num4;
        }
        if (num5 < min){
            min = num5;
        }

        System.out.println("El valor minimo es: " + min);

        max = num1;
        if(num2 > max){
            max = num2;
        }
        if(num3 > max){
            max = num3;
        }
        if(num4 > max){
            max = num4;
        }
        if(num5 > max){
            max = num5;
        }

        System.out.println("El valor maximo es: " + max);
    }
}
