package com.IsabelMont;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //pantalla
        System.out.println("Escribe un número: ");
    //teclado
        int a = Integer.parseInt(br.readLine());

    //Programa

        if( a >= 1 && a <= 7 ) {
            switch (a) {
                case 1:
                    System.out.println("Es el LUNES");
                    break;
                case 2:
                    System.out.println("Es el MARTES");
                    break;
                case 3:
                    System.out.println("Es el MIERCOLES");
                    break;
                case 4:
                    System.out.println("Es el JUEVES");
                    break;
                case 5:
                    System.out.println("Es el VIERNES");
                    break;
                case 6:
                    System.out.println("Es el SABADO");
                    break;
                case 7:
                    System.out.println("Es el DOMINGO");
            }

        } else {
            System.out.println("Número no válido ");

        }


     }
}
