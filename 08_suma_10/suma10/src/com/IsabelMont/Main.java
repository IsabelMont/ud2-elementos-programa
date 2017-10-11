package com.IsabelMont;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = 0;


        for (int i = 0; i < 10; i++) {

            System.out.println("Escribe un número  ");
            int a = Integer.parseInt(br.readLine());

            t = a + t;
        }


        System.out.println("El resultado es  "+t);

    }
}
