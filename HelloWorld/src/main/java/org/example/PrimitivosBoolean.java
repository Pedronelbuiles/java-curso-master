package org.example;

public class PrimitivosBoolean {
    public static void main(String[] args) {
        System.out.println("");

        boolean dataLogico = true;
        System.out.println("dataLogico = " + dataLogico);
        System.out.println("");

        double numberDouble = 98765.43e-3;
        System.out.println("numberDouble = " + numberDouble);
        float numberFloat = 12345e2f;
        System.out.println("numberFloat = " + numberFloat);

        dataLogico = (numberDouble > numberFloat);

        System.out.println("dataLogico = " + dataLogico);
        System.out.println("");
        
        boolean esIgual = (3-2 == 1);
        System.out.println("esIgual = " + esIgual);
    }
}
