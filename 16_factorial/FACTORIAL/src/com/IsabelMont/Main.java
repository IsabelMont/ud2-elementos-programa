package com.IsabelMont;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Escribe un número");
        int a = Integer.parseInt(br.readLine());
        int respuesta = 1;

        for (int i = 1; i <= a; i++) {

            respuesta = respuesta * i;


            System.out.println(respuesta);


        }
    }
}
