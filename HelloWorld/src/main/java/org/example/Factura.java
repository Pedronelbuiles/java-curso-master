package org.example;

import java.util.Scanner;

public class Factura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Ingrese la cantida de productos en la factura");
        int cantProductos = 0;
        try {
            cantProductos = scanner.nextInt();
        }catch (Exception e) {
            System.out.println("Debe ingresar un número");
            main(args);
            System.exit(0);
        }

        System.out.println("Ingrese el nombre de la factura");
        String facName = scanner.nextLine();

        String[] nombresProductos = new String[cantProductos];
        double[] valorProductos = new double[cantProductos];
        double total = 0;

        for (int i = 0; i < cantProductos; i++) {
            System.out.println("Ingrese el nombre del producto");
            nombresProductos[i] = scanner.nextLine();
            System.out.println("Ingrese el valor del producto");
            try {
                valorProductos[i] = scanner.nextDouble();
            } catch (Exception e) {
                System.out.println("Debe ingresar un valor númerico, ahora debe comenzar desde el inicio >:v");
                main(args);
                System.exit(0);
            }
            total += valorProductos[i];
        }

        System.out.println("La factura " + facName + "\n");
        System.out.println("Tiene los siguientes productos: ");
        for (int i = 0; i < cantProductos; i++) {
            System.out.println(nombresProductos[i] + ": $" + valorProductos[i]);
        }
        System.out.println("");
        System.out.println("Para un valor total de: $" + total);


    }
}
