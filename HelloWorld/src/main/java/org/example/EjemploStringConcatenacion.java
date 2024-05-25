package org.example;

public class EjemploStringConcatenacion {
    public static void main(String[] args) {
        String curso = "Programación Java";
        String profesor = "Pedro Nel Builes Moreno";
        String detalle = curso + " con el mejor de todos " + profesor;

        System.out.println(detalle);

        int numeroA = 10;
        int numeroB = 5;

        System.out.println(detalle + numeroA + numeroB);
        System.out.println(detalle + (numeroA + numeroB));
        System.out.println(numeroA + numeroB + detalle);

        String deatalle2 = curso.concat(" con el mejor de todos ").concat(profesor);
        System.out.println(deatalle2);
    }
}
