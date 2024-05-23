package org.example;

public class PrimitivesEnteros {
    public static void main(String[] args) {
        System.out.println("");

        byte numberByte = 127;
        System.out.println("numberByte = " + numberByte);
        System.out.println("El tipo byte corresponde en byte a " + Byte.BYTES);
        System.out.println("El tipo byte corresponde en bites a " + Byte.SIZE);
        System.out.println("El valor máximo de un byte es de " + Byte.MAX_VALUE);
        System.out.println("El valor mínimo de un byte es de " + Byte.MIN_VALUE);

        System.out.println("");

        short numberShort = 32767;
        System.out.println("numberShort = " + numberShort);
        System.out.println("El tipo short corresponde en byte a " + Short.BYTES);
        System.out.println("El tipo short corresponde en bites a " + Short.SIZE);
        System.out.println("El valor máximo de un short es de " + Short.MAX_VALUE);
        System.out.println("El valor mínimo de un short es de " + Short.MIN_VALUE);

        System.out.println("");

        int numberInt = 2147483647;
        System.out.println("numberInt = " + numberInt);
        System.out.println("El tipo int corresponde en byte a " + Integer.BYTES);
        System.out.println("El tipo int corresponde en bites a " + Integer.SIZE);
        System.out.println("El valor máximo de un int es de " + Integer.MAX_VALUE);
        System.out.println("El valor mínimo de un int es de " + Integer.MIN_VALUE);

        System.out.println("");

        long numberLong = 9223372036854775807L;
        System.out.println("numberLong = " + numberLong);
        System.out.println("El tipo long corresponde en byte a " + Long.BYTES);
        System.out.println("El tipo long corresponde en bites a " + Long.SIZE);
        System.out.println("El valor máximo de un long es de " + Long.MAX_VALUE);
        System.out.println("El valor mínimo de un long es de " + Long.MIN_VALUE);

        System.out.println("");

        var numberVar = 9223372036854775808F;
        System.out.println("numberVar = " + numberVar);
    }
}
