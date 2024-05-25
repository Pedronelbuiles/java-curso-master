package org.example;

public class EjemploStringTestRendimientoConcat {
    public static void main(String[] args) {
        String string1 = "a";
        String string2 = "b";
        String string3 = string1;

        StringBuilder stringBuilder = new StringBuilder(string1);
        long inicio = System.currentTimeMillis();

        for (int i = 0; i < 1000; i++) {
//            string3 = string3.concat(string1).concat(string2).concat("\n"); // 500 => 2ms, 1000 => 4ms
//            string3 += string1 + string2 + "\n"; // 500 => 17ms, 1000 => 17ms
            stringBuilder
                    .append(string1)
                    .append(string2)
                    .append("\n"); // 500 => 1ms, 1000 => 1ms
        }

        long fin = System.currentTimeMillis();
        System.out.println("string3 = " + string3);
        System.out.println("stringBuilder = " + stringBuilder.toString());
        System.out.println(fin - inicio);
    }
}
