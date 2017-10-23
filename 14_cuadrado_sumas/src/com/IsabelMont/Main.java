package com.IsabelMont;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Escribe un número por favor");
        int a = Integer.parseInt(br.readLine());
        int b = 0;

        for (int i = 0; i < a; i++) {

            b = b + a;

        }
        System.out.println(b);
    }
}
