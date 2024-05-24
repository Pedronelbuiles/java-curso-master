package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosScanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número entero");
        int numeroDecimal = 0;
        try {
            numeroDecimal = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Debe ingresar un número");
            main(args);
            System.exit(0);
        }

        String textoBinario = Integer.toBinaryString(numeroDecimal);
        String textoOctal = Integer.toOctalString(numeroDecimal);
        String textoHex = Integer.toHexString(numeroDecimal);

        int numeroBinario = Integer.parseInt(textoBinario);
        int numeroOctal = Integer.parseInt(textoOctal);
        int numeroHex = Integer.parseInt(textoHex, 16);

        String mensaje = "numeroDecimal = " + numeroDecimal+ "\n" +
                "numero binario de " + numeroDecimal + " = " + numeroBinario + "\n" +
                "numeroBinario = " + numeroBinario+ "\n" +
                "numero octal de " + numeroDecimal + " = " + numeroOctal+ "\n" +
                "numeroOctal = " + numeroOctal+ "\n" +
                "numero hexadecimal de " + numeroDecimal + " = " + numeroHex + "\n" +
                "numeroHex = " + numeroHex+ "\n";
        System.out.println(mensaje);
    }
}
