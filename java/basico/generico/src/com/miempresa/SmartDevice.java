package com.miempresa;

public class SmartDevice {

    String so;
    float version;

    String marca;

    public static void main(String[] args) {

        SmartPhone smartPhone = new SmartPhone("Android",20.1f, "Samsung",6,128);
        System.out.println("Smartphone: " + smartPhone.toString());
        SmartWatch smartWatch = new SmartWatch("Ios", 16f, "Apple", "rosado", "femenino");
        System.out.println("SmartWatch: " + smartWatch.toString());
    }

    public SmartDevice(String so, float version, String marca){
        this.so = so;
        this.version = version;
        this.marca = marca;
    }

    public static class SmartPhone extends SmartDevice{
        int ram;
        int espacio;

        public SmartPhone(String so, float version, String marca, int ram, int esp){
            super(so, version, marca);
            this.ram = ram;
            this.espacio = espacio;
        }

        @Override
        public String toString() {
            return "So: " + so
                    + " Versión: " + version
                    + " Marca: " + marca
                    + " Ram: " + ram
                    + " Espacio: " + espacio;
        }
    }

    public static class SmartWatch extends SmartDevice{
        String color;

        String genero;

        public SmartWatch(String so, float version, String marca, String color, String genero){
            super(so, version, marca);
            this.color = color;
            this.genero = genero;
        }

        @Override
        public String toString() {
            return "So: " + so
                    + " Versión: " + version
                    + " Marca: " + marca
                    + " Color: " + color
                    + " Genero: " + genero;
        }
    }

}
