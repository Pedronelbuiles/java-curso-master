package org.example;

public class ConversionDeTipos {
    public static void main(String[] args) {
        String numero = "16";

        int numeroInt = Integer.parseInt(numero);
        System.out.println("numeroInt = " + numeroInt + "\n");

        String realStr = "78745.12e-3";
        double realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble = " + realDouble + "\n");

        String logicoStr = "true";
         boolean logicoBoolean = Boolean.parseBoolean(logicoStr);
        System.out.println("logicoBoolean = " + logicoBoolean + "\n");

        int numeroItn2 = 100;
        System.out.println("numeroItn2 = " + numeroItn2 + "\n");

        String numeroStr = Integer.toString(numeroItn2);
        System.out.println("numeroStr = " + numeroStr + "\n");

        numeroStr = String.valueOf(numeroItn2+10);
        System.out.println("numeroStr = " + numeroStr + "\n");

        double realDouble2 = 1.23456e2;
        String realStr2 = Double.toString(realDouble2);
        System.out.println("realStr2 = " + realStr2 + "\n");

        realStr2 = String.valueOf(1.23456e2f);
        System.out.println("realStr2 = " + realStr2 + "\n");

        int entero = 10000;
        short corto = (short)entero; //casting forzar la conversión
        System.out.println("short corto = " + corto + "\n");

        long largo = entero;
        System.out.println("long largo = " + largo + "\n");

        char caracter = (char)entero;
        System.out.println("caracter = " + caracter + "\n");

        float flotante = entero;
        System.out.println("flotante = " + flotante + "\n");
    }
}
