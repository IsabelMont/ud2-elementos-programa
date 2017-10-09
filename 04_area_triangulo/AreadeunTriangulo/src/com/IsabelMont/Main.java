package com.IsabelMont;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     //Pantalla
        System.out.print("Escribe la base de un triangulo");
        //Teclado
        double a = Integer.parseInt(br.readLine());
        //Pantalla
        System.out.print("Escribe la altura de un triangulo");
        double b = Integer.parseInt(br.readLine());

        double c = (a*b)/2;
        
        //PANTALLA
        System.out.print("El area del triangulo es " +c);

    }
}
