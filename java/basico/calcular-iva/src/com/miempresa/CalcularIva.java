package com.miempresa;

import java.util.Scanner;

public class CalcularIva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un precio: ");
        int precio = scanner.nextInt();
        int porcIva = 16;
        double precioConIva = calcularIva(precio, porcIva);100
        System.out.println("precioConIva: " + precioConIva);
    }

    static double calcularIva(double precio, double porcIva) {
        return precio + (precio * (porcIva / 100));
    }
}

