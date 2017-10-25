package com.IsabelMont;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Escribe un número");
        int a = Integer.parseInt(br.readLine());
        int c = 2;
        int total;

        do {
            total = a % c;
            c = c + 1;

        } while (c < a && total != 0);

        if (total != 0) {
            System.out.println(" El número es primo");
        }
        if (total == 0) {
            System.out.println(" El número no es primo");
        }


    }
}

