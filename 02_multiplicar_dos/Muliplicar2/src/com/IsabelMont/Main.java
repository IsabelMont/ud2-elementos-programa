package com.IsabelMont;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //pantalla
        System.out.print("Escribe un numero: ");
        //teclado
        int a = Integer.parseInt(br.readLine());
        //Pantalla
        System.out.print("Escribe otro numero: ");
       //Teclado
        int b = Integer.parseInt(br.readLine());
        //Instrucción
        int c = a * b;
        //Resultado en pantalla
        System.out.println("El resultado de la multiplicación es: " + c);

    }
}
