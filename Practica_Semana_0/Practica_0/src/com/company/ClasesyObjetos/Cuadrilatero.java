package com.company.ClasesyObjetos;

import java.util.Scanner;

public class Cuadrilatero {

    //Atributos
    private float lado1;
    private float lado2;

    //Metodos
    //Metodo constructor uno (Cuadrilatero)
    public Cuadrilatero(float lado1, float lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    //Metodo constructor dos (Cuadrado)
    public Cuadrilatero(float lado1) {
        this.lado1 = this.lado2 = lado1;
    }

    public float getPerimetro(){
        float perimetro = 2 * (lado1+lado2);
        return perimetro;
    }

    public float getArea (){
        float area = (lado1*lado2);
        return area;
    }

    public static void main(String[] args) {
        Cuadrilatero forma1;
        float lado1, lado2;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite el lado 1: ");
        lado1 = scanner.nextFloat();
        System.out.println("Digite el lado 2: ");
        lado2 = scanner.nextFloat();

        if (lado1 == lado2){ //Este cuadrilatero es un cuadrado
            forma1 = new Cuadrilatero(lado1);
        }
        else {
            forma1 = new Cuadrilatero(lado1, lado2);
        }

        System.out.println("El perimetro es " + forma1.getPerimetro());
        System.out.println("El area es: " + forma1.getArea());




    }



}

