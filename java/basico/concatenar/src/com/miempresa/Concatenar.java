package com.miempresa;

public class Concatenar {
    public static void main(String[] args) {
        String[] nombres = {"Juan", "Pedro", "Maria", "Carlos", "Patricio"};
        String resultado = "";
        for (String nombre : nombres) {
            resultado = resultado.concat(nombre).concat(" ");
        }
        System.out.println(resultado);
    }
}
