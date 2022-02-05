package com.company.ejerciciosTutoria;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EjercicioTutoria2 {


    static Map<Integer, Usuario> cache = new HashMap<>();
    static List<Usuario> baseDeDatos = new ArrayList<>();

    public static void main(String[] args) {
        //usuario de prueba

        Usuario usuarioA = new Usuario();
        usuarioA.id = 10;
        usuarioA.nombre = "Pepe";

        Usuario usuarioB = new Usuario();
        usuarioB.id = 20;
        usuarioB.nombre = "Santi";

        Usuario usuarioC = new Usuario();
        usuarioC.id = 30;
        usuarioC.nombre = "Cami";

        Usuario usuarioD = new Usuario();
        usuarioD.id = 40;
        usuarioD.nombre = "Luca";

        Usuario usuarioE = new Usuario();
        usuarioE.id = 50;
        usuarioE.nombre = "Toni";

        //Agregar usuarios en la lista llamada baseDeDatos
        baseDeDatos.add(usuarioA);
        baseDeDatos.add(usuarioB);
        baseDeDatos.add(usuarioC);
        baseDeDatos.add(usuarioD);
        baseDeDatos.add(usuarioE);

        Integer idAbuscar = 10;
        System.out.println(buscarPorId(idAbuscar));
        System.out.println(buscarPorId(idAbuscar));

     }

    public static String buscarPorId(Integer idAbuscar) {
        Usuario usuarioABuscar = null;

        if (cache.containsKey(idAbuscar)) {
            usuarioABuscar = cache.get(idAbuscar);
            System.out.println("usuario encontrado en Cache");
        } else {

            for (Usuario usuarioEnBase:baseDeDatos) {

                if (usuarioEnBase.id == idAbuscar) {
                    usuarioABuscar = usuarioEnBase;
                    cache.put(usuarioEnBase.id, usuarioEnBase);
                    System.out.println("usuario encontrado en base de datos");
                    break;
                }
            }
        }

        if (usuarioABuscar != null) {
            return "usuario encontrado: " + usuarioABuscar.nombre;
        }

        return ("usuario no encontrado");
    }

}
