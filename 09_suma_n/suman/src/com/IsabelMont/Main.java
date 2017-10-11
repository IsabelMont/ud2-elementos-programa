package com.IsabelMont;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Escribe cuántos números quieres escribir por favor  ");
        int vueltas = Integer.parseInt(br.readLine());
        int resultado = 0;

        for (int i = 0; i <vueltas ; i++) {
            System.out.println("Escribe un número   ");
            int dato = Integer.parseInt(br.readLine());
            resultado = resultado + dato;

        }
        System.out.println("El resultado de la suma de los números es   "+resultado);

    }
}
