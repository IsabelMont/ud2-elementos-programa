package com.IsabelMont;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        //PANTALLA
        System.out.println("Hola ¿ Que tal estas ?");
        //TECLADO
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String texto = br.readLine();
        //PANTALLA
        System.out.println("Me has dicho que estas " +texto);
    }
}
