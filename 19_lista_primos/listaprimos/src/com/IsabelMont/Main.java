package com.IsabelMont;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Escribe un número");
        int respuesta = Integer.parseInt(br.readLine());
        int b = 2;
        int resto;

        for (int i = 0; i <= respuesta; i++) {

            b = 2;
            do {
                resto = i % b;
                b = b + 1;
            }
            while (i > b && resto != 0);
            if (resto != 0) {
                System.out.println(i);
            }

        }

    }
}
