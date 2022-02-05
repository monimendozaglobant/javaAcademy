package com.company.ejerciciosTutoria;

public class Ejercicio0 {
    public static void main(String[] args) {

        int[] bloquesxColumna = {3, 4, 2, 4, 2};
        int cantidadColumnas = bloquesxColumna.length;
        int totalBloques = 0;

        for (int i = 0; i < cantidadColumnas; i++) {
            totalBloques = totalBloques + bloquesxColumna[i];
        }

        if (totalBloques % cantidadColumnas == 0) {
            int promedioBloquesxColumna = totalBloques / cantidadColumnas;
            int bloquesFaltantes = 0;
            int bloquesSobrantes = 0;

            for (int i = 0; i < cantidadColumnas; i++) {
                int numeroBloquesxColumna = bloquesxColumna[i];
                if (numeroBloquesxColumna < promedioBloquesxColumna) {
                    bloquesFaltantes = bloquesFaltantes + (promedioBloquesxColumna - numeroBloquesxColumna);
                } else if (numeroBloquesxColumna > promedioBloquesxColumna) {
                    bloquesSobrantes = bloquesSobrantes + (numeroBloquesxColumna - promedioBloquesxColumna);
                }
            }

            if(bloquesFaltantes == bloquesSobrantes){
                System.out.println("Es necesario mover " + bloquesFaltantes + " bloques para igualar la pared");
            } else {
                System.out.println("No es posible igualar la pared");
            }
        } else {
            System.out.println("No es posible igualar la pared");
        }


    }
}
