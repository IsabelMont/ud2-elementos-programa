package com.IsabelMont;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Escribe par o impar");
        String texto = br.readLine();
        if (texto.equalsIgnoreCase("par") || texto.equalsIgnoreCase("impar")) {
            for (int i = 0; i < 200; i++) {
                if (texto.equalsIgnoreCase("PAR") && i % 2 == 0) {
                    System.out.println(i);
                } else {
                    if (texto.equalsIgnoreCase("IMPAR") && i % 2 == 1) {
                        System.out.println(i);
                    }
                }
            }
        } else {
            System.out.println("texto no válido");
        }
    }
}
