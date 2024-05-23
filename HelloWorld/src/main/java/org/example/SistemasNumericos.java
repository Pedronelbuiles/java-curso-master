package org.example;

import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {

        int numeroDecimal = 0;
        try {
            numeroDecimal = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número entero"));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un número");
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
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
