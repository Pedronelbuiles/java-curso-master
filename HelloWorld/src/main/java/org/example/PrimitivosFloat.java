package org.example;

public class PrimitivosFloat {
    public static void main(String[] args) {
        System.out.println("");

        float realFloat = 3.4028235E38F;
        System.out.println("realFloat = " + realFloat);
        System.out.println("El tipo float corresponde en byte a " + Float.BYTES);
        System.out.println("El tipo float corresponde en bites a " + Float.SIZE);
        System.out.println("El valor máximo de un float es de " + Float.MAX_VALUE);
        System.out.println("El valor mpinimo de un float es de " + Float.MIN_VALUE);
        System.out.println("El exponente máximo de un float es de " + Float.MAX_EXPONENT);
        System.out.println("El exponente mínimo de un float es de " + Float.MIN_EXPONENT);

        System.out.println("");

        double realDouble = 1.7976931348623157E308;
        System.out.println("realDouble = " + realDouble);
        System.out.println("El tipo double corresponde en byte a " + Double.BYTES);
        System.out.println("El tipo double corresponde en bites a " + Double.SIZE);
        System.out.println("El valor máximo de un double es de " + Double.MAX_VALUE);
        System.out.println("El valor mpinimo de un double es de " + Double.MIN_VALUE);
        System.out.println("El exponente máximo de un double es de " + Double.MAX_EXPONENT);
        System.out.println("El exponente mínimo de un double es de " + Double.MIN_EXPONENT);

        System.out.println("");

        var realVar = 3.1416;
        System.out.println("realVar = " + realVar);
    }
}
