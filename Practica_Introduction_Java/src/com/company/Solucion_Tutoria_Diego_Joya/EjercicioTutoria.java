package com.company.ejerciciosTutoria;

public class EjercicioTutoria {
    public static void main(String[] args) {

        int[] bloquesPorColumna = {3, 4, 2, 4, 2};
        int numeroColumnas = bloquesPorColumna.length;
        int totalbloques = 0;

        for (int i = 0; i < numeroColumnas; i++) {
            totalbloques = totalbloques + bloquesPorColumna[i];
        }

        if (totalbloques % numeroColumnas == 0) {
            int promedioBloquesPorColumna = totalbloques / numeroColumnas;

            int faltanteBloques = 0;
            int sobranteBloques = 0;

            for (int i = 0; i < numeroColumnas; i++) {
                int numeroBloquesPorColumna = bloquesPorColumna[i];
                if (numeroBloquesPorColumna < promedioBloquesPorColumna) {
                    faltanteBloques = faltanteBloques + (promedioBloquesPorColumna - numeroBloquesPorColumna);

                } else if (numeroBloquesPorColumna > promedioBloquesPorColumna) {
                    sobranteBloques = sobranteBloques + (numeroBloquesPorColumna - promedioBloquesPorColumna);
                }
            }

            if (sobranteBloques == faltanteBloques) {
                System.out.println("Es necesario mover " + faltanteBloques + " bloques para igualar la pared");
            } else {
                System.out.println("No es posible igualar la pared");
            }
        } else {
            System.out.println("No es posible igualar la pared");
        }


    }
}
