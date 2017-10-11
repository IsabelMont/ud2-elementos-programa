package com.IsabelMont;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int variable;
        do {
            //pantalla
            System.out.println("Escribe un número  ");
            variable = Integer.parseInt(br.readLine());


            if (variable > 0 && variable !=0 ) {
                int resultado = variable * -1;
                System.out.println("EL NÚMERO ABSOLUTO ES  " + variable  +" y "  + resultado);

            } else {


                if(variable == 0){
                    System.out.println("Fin");

                }else{
                int resultado = variable * -1;
                System.out.println("EL NÚMERO ABSOLUTO ES  " + variable +" y "  + resultado);}}


        } while (variable != 0);
        System.out.println("Thank you");

    }


}
