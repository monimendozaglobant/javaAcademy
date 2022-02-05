package com.company;

public class Calculadora {

    public static void main(String[] args) {

        Calculadora miCalculadora = new Calculadora();
        int resultado = miCalculadora.orquestador(90, 3, "Resta", miCalculadora);
        System.out.println(resultado);
    }

    public int orquestador(int numero1, int numero2, String operacion, Calculadora miCalculadora2) {
        int resultado = 0;
        if (operacion.equals("Suma")) {
            resultado = miCalculadora2.sumar(numero1, numero2);
        } else if (operacion.equals("Resta")) {
            resultado = miCalculadora2.restar(numero1, numero2);
        } else if (operacion.equals("Multiplicacion")) {
            resultado = miCalculadora2.multiplicar(numero1, numero2);
        } else if (operacion.equals("Division")) {
            resultado = miCalculadora2.dividir(numero1, numero2);
        }
        return resultado;
    }

    public int sumar(int numero1, int numero2) {
        int resultado = numero1 + numero2;
        return resultado;
    }

    public int restar(int numero1, int numero2) {
        int resultado = numero1 - numero2;
        return resultado;
    }

    public int multiplicar(int numero1, int numero2) {
        int resultado = numero1 * numero2;
        return resultado;
    }

    public int dividir(int numero1, int numero2) {
        int resultado = numero1 / numero2;
        return resultado;
    }

    public static class ArraysPractice {
        public static void main(String[] args) {

            String[][] arraynew = {{"Monica ", "Mendoza "}, {"Jacobo ", "Daza"}};

            int numerofilas = arraynew.length;

            for (int i = 0; i < numerofilas; i++) {
                int numerocolumporfila = arraynew[i].length;
                for (int p = 0; p < numerocolumporfila; p++) {
                    System.out.print(arraynew[i][p]);
                }
                System.out.print("\n");
            }
        }

    }
}

