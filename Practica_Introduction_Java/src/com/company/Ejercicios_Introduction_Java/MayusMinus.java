package com.company;

import java.util.Locale;

import static java.lang.Character.toUpperCase;

public class MayusMinus {
    public static void main(String[] args) {
        String resultado = orquestador("andres", "Tamano");
        System.out.println(resultado);
    }

    public static String orquestador(String palabra, String operacion) {
        String rOrquestador = "";
        if (operacion.equals("Mayuscula")) {
            rOrquestador = mayuscula(palabra);
        } else if (operacion.equals("Minuscula")) {
            rOrquestador = minuscula(palabra);
        } else if (operacion.equals("Tamano")) {
            rOrquestador = String.valueOf(tamano(palabra));
        }
        return rOrquestador;
    }

    public static String mayuscula(String palabra) {
        return palabra.toUpperCase();
    }

    public static String minuscula(String palabra) {
        return palabra.toLowerCase();
    }

    public static Integer tamano(String palabra) {
        return palabra.length();
    }
}
