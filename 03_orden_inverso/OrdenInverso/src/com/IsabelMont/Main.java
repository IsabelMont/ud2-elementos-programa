package com.IsabelMont;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //Pantalla
        System.out.print("Escribe un número: ");

        //Teclado
        int a = Integer.parseInt(br.readLine());

        //Pantalla
        System.out.print("Escribe un numero: ");

        //Teclado

        int b = Integer.parseInt(br.readLine());

        //Pantalla
        System.out.print("Escribe un último número: ");

        //teclado
        int c = Integer.parseInt(br.readLine());

        //Pantalla
        System.out.print("El orden inverso de los números es: " + c + "-" + b + "-" + a);
    }
}
