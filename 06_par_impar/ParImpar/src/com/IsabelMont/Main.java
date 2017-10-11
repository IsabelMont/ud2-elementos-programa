package com.IsabelMont;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            //Pantalla
            System.out.println("Write a number");
            //Teclado
            double a = Integer.parseInt(br.readLine());
           //Instrucción
            if (a % 2 == 0){
                System.out.println("The number it's pair");}
            else {
           //Pantalla
            System.out.println("The number it´s odd");}
        } catch (NumberFormatException e){
        //Pantalla
        System.out.println("SYSTEM ERROR, PLEASE TRY AGAIN");}
        }



    }

