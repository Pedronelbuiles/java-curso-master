package org.example;

public class PrimitivosCharacters {
    public static void main(String[] args) {
        System.out.println("");

        char character = 'p';
        char decimal = 112;
        System.out.println("character = " + character);
        System.out.println("decimal = " + decimal);
        System.out.println("Las variables character y devimal son iguales ? " + (decimal == character));

        char space = '\u0020';
        char retroseso = '\b';
        char tabuladpr = '\t';
        char newLine = '\n';
        char retornoCarro = '\r';

        System.out.println("El type char corresponde en byte a " + Character.BYTES);
        System.out.println("El type char corresponde en bites a " + Character.SIZE);
        System.out.println("El valor máximo del type char " + Character.MAX_VALUE);
        System.out.println("El valor mínimo del type char " + Character.MIN_VALUE);

        System.out.println("");

        System.out.println("El type char space" + space + Character.BYTES);
        System.out.println("El type char retroseso 123" + retroseso + Character.BYTES);
        System.out.println("El type char tabulador" + tabuladpr + Character.BYTES);
        System.out.println("El type char newLine" + newLine + Character.BYTES);
        System.out.println("El type char retornoCarro" + retornoCarro + Character.BYTES);
        System.out.println("El type char tabulador" + System.getProperty("line.separator") + Character.BYTES);
        System.out.println("El type char tabulador" + System.lineSeparator() + Character.BYTES);
    }
}
