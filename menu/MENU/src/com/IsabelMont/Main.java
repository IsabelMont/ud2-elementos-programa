package com.IsabelMont;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Escribe un Número");
        int primero = Integer.parseInt(br.readLine());
        System.out.println("Escribe otro número");
        int segundo = Integer.parseInt(br.readLine());
        String respuesta;
        do {
            System.out.println(" MENÚ\n-----------\na)Sumar\nb)Restar\nc)Multiplicación\nd)División\ne)Resto\nf)Fin ");
            respuesta = br.readLine();

            switch (respuesta) {
                case "a":
                case "A":
                    int resultado = primero + segundo;
                    System.out.println(" La respuest es " + resultado);
                    break;

                case "b":
                case "B":
                    int resultadoresta = primero - segundo;
                    System.out.println("El resultado es " + resultadoresta);
                    break;
                case "c":
                case "C":
                    int resultadomulti = primero * segundo;
                    System.out.println("El resultado es " + resultadomulti);
                    break;
                case "d":
                case "D":
                    int resultadodivi = primero / segundo;
                    System.out.println("El resultado es  " + resultadodivi);
                    break;
                case "e":
                case "E":
                    int resultadoresto = primero % segundo;
                    System.out.println("El resultao es " + resultadoresto);
                case "f":
                case "F":
                    System.out.println("Fin, gracias");}

        }
        while (!respuesta.equals("f")) ;

    }
}