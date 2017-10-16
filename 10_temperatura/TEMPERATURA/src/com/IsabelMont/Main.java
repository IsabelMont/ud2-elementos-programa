package com.IsabelMont;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        System.out.println(" Escribe una temperatura en grados  ");
        double a = Double.parseDouble(br.readLine());
        System.out.println(" Escribe una letra F Faherenheit o K para kelvin");
        char c = br.readLine() .charAt(0);
            switch (c)
            {
                case 'f':
                    double resultado = (1.8 * a) + 32;
                    System.out.println("El resultado es  "+resultado);
                    break;
                case 'k':
                    double total = a+273.15;
                    System.out.println("El resultado es  "+total);
                    break;
                default:
                    System.out.println("NO HAY RESPUESTA GRACIAS");


        }
    }
}
