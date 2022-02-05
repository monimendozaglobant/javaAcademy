package com.company;

public class CalculadoraStatic {
    public static void main(String[] args) {
        int resultadofinal = Orquestador(45, 56, "resta");
        System.out.println(resultadofinal);

    }

    public static int Orquestador(int primervalor, int segundovalor, String tipodeOperacion) {
        int resultadoOrquestador = 0;
        if (tipodeOperacion.equals("suma")) {
            resultadoOrquestador = suma(primervalor, segundovalor);
        } else if(tipodeOperacion.equals ("resta")){
            resultadoOrquestador = resta(primervalor,segundovalor);
        }
        return resultadoOrquestador;

    }

    public static int suma(int primervalor, int segundovalor) {
        int suma = primervalor + segundovalor;
        return suma;
    }

    public static int resta(int primervalor, int segundovalor){
        int resta = primervalor - segundovalor;
        return resta;
    }

    public static int multiplicacion(int primervalor, int segundovalor){
        return 0;
    }



}



