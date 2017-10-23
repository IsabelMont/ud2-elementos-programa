package com.IsabelMont;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String texto;
        int mayor = -99999;
        int menor = Integer.MAX_VALUE;
        int total = 0;
        do {
            System.out.println("Escribe un Número");
            texto = br.readLine();

            if (!texto.equalsIgnoreCase("fin")) {
                int a = Integer.parseInt(texto);

                total = total + a;

                if (a > mayor) {
                    mayor = a;
                }

                if (a < menor) {
                    menor = a;
                }
            }
        } while (!texto.equalsIgnoreCase("fin"));
        System.out.println("El número mayor es " + mayor + "\nEl número menor es " + menor + "\nEl total es "+total);
    }
}
