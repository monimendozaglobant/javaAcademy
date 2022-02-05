package com.company;
import java.util.ArrayList;
import java.util.List;

public class ListUser {

    public static void main(String[] args) {

        List<Integer> numeros;
        numeros = new ArrayList<>();

        numeros.add(1);
        numeros.add(15);
        numeros.add(21);

        numeros.remove(1);

        System.out.println(numeros.get(1));
        System.out.println(numeros.size());

        List<User> Usuarios = new ArrayList<>();

        User usuario1 = new User();
        usuario1.nombre = "Andres";
        usuario1.apellido = "Daza";
        usuario1.edad = 32;

        Usuarios.add(usuario1);
    }


}
