package com.company;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public class SumUpperCase {
    public static void main(String[] args) {

        String resultadol2r = left2right("Monica ", "Mendoza");
        String resultador2l = right2left("Milan ", "Daza ");
        imprimir(resultadol2r);
        imprimir(resultador2l);
    }

    public static String left2right(String nombre, String apellido) {
        String rleft2right = nombre + apellido;
        return rleft2right;
    }

    public static String right2left(String nombre, String apellido) {
        String rright2left = apellido + nombre;
        return rright2left;
    }

    public static void imprimir(String palabra) {
        System.out.println(palabra.toUpperCase());
    }
}


