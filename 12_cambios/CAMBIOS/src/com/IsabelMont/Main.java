package com.IsabelMont;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double cantidad;
        double precio;
    do {
        System.out.println(" ¿ Cuánto vale el producto seleccionado?");
        precio = Double.parseDouble(br.readLine());
        System.out.println(" ¿Cuanto dinero has introducido ?");
        cantidad = Double.parseDouble(br.readLine());
    }while (precio>cantidad);


        precio = precio * 100;
        cantidad = cantidad * 100;
        int cambio;

        int precio2 = (int) precio;
        int cantidad2 = (int) cantidad;

        if (cantidad == precio) {
            System.out.println("Muchas gracias por tu compra");
        } else {
            // devolución
            cambio = cantidad2 - precio2;
            // monedas de 2€
            if (cambio / 200 != 0) {
                int monedasde2 = cambio / 200;
                cambio = cambio - (monedasde2 * 200);
                System.out.println("MONEDAS DE 2 : " + monedasde2);
            }
            if (cambio / 100 != 0) {
                int monedasde1 = cambio / 100;
                cambio = cambio - (monedasde1 * 100);
                System.out.println("MONEDAS DE 1:  " + monedasde1);
            }
            if (cambio / 50 != 0) {
                int monedasde50 = cambio / 50;
                cambio = cambio - (monedasde50 * 50);
                System.out.println("MONEDAS DE 50CENTS: " + monedasde50);
            }
            if (cambio / 20 != 0) {
                int monedasde20 = cambio / 20;
                cambio = cambio - (monedasde20 * 20);
                System.out.println("MONEDAS DE 20CENTS  " + monedasde20);
            }
            if (cambio / 10 != 0) {
                int monedasde10 = cambio / 10;
                cambio = cambio - (monedasde10 * 10);
                System.out.println("MONEDAS DE 10 CENTS: " + monedasde10);
            }
            if (cambio / 5 != 0) {
                int monedasde5 = cambio / 5;
                cambio = cambio - (monedasde5 * 5);
                System.out.println("MONEDAS DE 5 CENTS " + monedasde5);
            }

        }



    }
}
