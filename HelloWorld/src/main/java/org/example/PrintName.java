package org.example;

public class PrintName {
    public static void main(String[] args) {
        String mensaje = "Pedro Nel Builes Moreno es el MEJOR!!!";
        System.out.println(mensaje);
        System.out.println("mensaje.toUpperCase() = " + mensaje.toUpperCase());
        
        int edad = 29;
        System.out.println("edad = " + edad);
        
        boolean isValid = true;

        int numero2 = 0;
        if (isValid) {
            System.out.println("isValid = " + isValid);
            numero2 = 10;
        }
        System.out.println("numero2 = " + numero2);

        var numero3 = "15";
        System.out.println("numero3 = " + numero3);

        String name;

        if (edad < 10) {
            name = "Pedro";
        } else {
            name = "Nel";
        }

        System.out.println("name = " + name);

        int personAge = 5;
        System.out.println("personAge = " + personAge);

        //Comentario de una sola linea
        /*
          Comentario de varias lineas
          o
          de bloque
        */
    }
}
