package com.IsabelMont;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Escribe tu número de dni");
        int numero = Integer.parseInt(br.readLine());
        System.out.println("Dime tu letra del dni");
        String respuesta = br.readLine();

        switch (numero % 23) {

            case 0:
            if (respuesta.equalsIgnoreCase("t"))
            {
                System.out.println("El dni es correcto");
            }else{
                System.out.println("DNI NO VÁLIDO, REVISE SI ES CORRECTO POR FAVOR");
            }
            String t;
            break;
            case 1:
                if (respuesta.equalsIgnoreCase("r"))
                {
                    System.out.println("El dni es correcto");
                }else{
                    System.out.println("DNI NO VÁLIDO, REVISE SI ES CORRECTO POR FAVOR");
                }
                String R;
                break;
            case 2:
                if (respuesta.equalsIgnoreCase("w"))
                {
                    System.out.println("El dni es correcto");
                }else{
                    System.out.println("DNI NO VÁLIDO, REVISE SI ES CORRECTO POR FAVOR");
                }
                String w;
                break;
            case 3:
                if (respuesta.equalsIgnoreCase("a"))
                {
                    System.out.println("El dni es correcto");
                }else{
                    System.out.println("DNI NO VÁLIDO, REVISE SI ES CORRECTO POR FAVOR");
                }
                String a;
                break;
            case 4:
                if (respuesta.equalsIgnoreCase("g"))
                {
                    System.out.println("El dni es correcto");
                }else{
                    System.out.println("DNI NO VÁLIDO, REVISE SI ES CORRECTO POR FAVOR");
                }
                String G;
                break;
            case 5:
                if (respuesta.equalsIgnoreCase("m"))
                {
                    System.out.println("El dni es correcto");
                }else{
                    System.out.println("DNI NO VÁLIDO, REVISE SI ES CORRECTO POR FAVOR");
                }
                String M;
                break;
            case 6:
                if (respuesta.equalsIgnoreCase("y"))
                {
                    System.out.println("El dni es correcto");
                }else{
                    System.out.println("DNI NO VÁLIDO, REVISE SI ES CORRECTO POR FAVOR");
                }
                String Y;
                break;
            case 7:
                if (respuesta.equalsIgnoreCase("f"))
                {
                    System.out.println("El dni es correcto");
                }else{
                    System.out.println("DNI NO VÁLIDO, REVISE SI ES CORRECTO POR FAVOR");
                }
                String F;
                break;
            case 8:
                if (respuesta.equalsIgnoreCase("p"))
                {
                    System.out.println("El dni es correcto");
                }else{
                    System.out.println("DNI NO VÁLIDO, REVISE SI ES CORRECTO POR FAVOR");
                }
                String p;
                break;
            case 9:
                if (respuesta.equalsIgnoreCase("d"))
                {
                    System.out.println("El dni es correcto");
                }else{
                    System.out.println("DNI NO VÁLIDO, REVISE SI ES CORRECTO POR FAVOR");
                }
                String d;
                break;
            case 10:
                if (respuesta.equalsIgnoreCase("x"))
                {
                    System.out.println("El dni es correcto");
                }else{
                    System.out.println("DNI NO VÁLIDO, REVISE SI ES CORRECTO POR FAVOR");
                }
                String x;
                break;
            case 11:
                if (respuesta.equalsIgnoreCase("b"))
                {
                    System.out.println("El dni es correcto");
                }else{
                    System.out.println("DNI NO VÁLIDO, REVISE SI ES CORRECTO POR FAVOR");
                }
                String B;
                break;
            case 12:
                if (respuesta.equalsIgnoreCase("n"))
                {
                    System.out.println("El dni es correcto");
                }else{
                    System.out.println("DNI NO VÁLIDO, REVISE SI ES CORRECTO POR FAVOR");
                }
                String n;
                break;
            case 13:
                if (respuesta.equalsIgnoreCase("j"))
                {
                    System.out.println("El dni es correcto");
                }else{
                    System.out.println("DNI NO VÁLIDO, REVISE SI ES CORRECTO POR FAVOR");
                }
                String j;
                break;
            case 14:
                if (respuesta.equalsIgnoreCase("z"))
                {
                    System.out.println("El dni es correcto");
                }else{
                    System.out.println("DNI NO VÁLIDO, REVISE SI ES CORRECTO POR FAVOR");
                }
                String z;
                break;
            case 15:
                if (respuesta.equalsIgnoreCase("s"))
                {
                    System.out.println("El dni es correcto");
                }else{
                    System.out.println("DNI NO VÁLIDO, REVISE SI ES CORRECTO POR FAVOR");
                }
                String s;
                break;
            case 16:
                if (respuesta.equalsIgnoreCase("q"))
                {
                    System.out.println("El dni es correcto");
                }else{
                    System.out.println("DNI NO VÁLIDO, REVISE SI ES CORRECTO POR FAVOR");
                }
                String q;
                break;
            case 17:
                if (respuesta.equalsIgnoreCase("v"))
                {
                    System.out.println("El dni es correcto");
                }else{
                    System.out.println("DNI NO VÁLIDO, REVISE SI ES CORRECTO POR FAVOR");
                }
                String v;
                break;
            case 18:
                if (respuesta.equalsIgnoreCase("h"))
                {
                    System.out.println("El dni es correcto");
                }else{
                    System.out.println("DNI NO VÁLIDO, REVISE SI ES CORRECTO POR FAVOR");
                }
                String h;
                break;
            case 19:
                if (respuesta.equalsIgnoreCase("l"))
                {
                    System.out.println("El dni es correcto");
                }else{
                    System.out.println("DNI NO VÁLIDO, REVISE SI ES CORRECTO POR FAVOR");
                }
                String L;
                break;
            case 20:
                if (respuesta.equalsIgnoreCase("c"))
                {
                    System.out.println("El dni es correcto");
                }else{
                    System.out.println("DNI NO VÁLIDO, REVISE SI ES CORRECTO POR FAVOR");
                }
                String c;
                break;
            case 21:
                if (respuesta.equalsIgnoreCase("k"))
                {
                    System.out.println("El dni es correcto");
                }else{
                    System.out.println("DNI NO VÁLIDO, REVISE SI ES CORRECTO POR FAVOR");
                }
                String k;
                break;
            case 22:
                if (respuesta.equalsIgnoreCase("e"))
                {
                    System.out.println("El dni es correcto");
                }else{
                    System.out.println("DNI NO VÁLIDO, REVISE SI ES CORRECTO POR FAVOR");
                }
                String E;
                break;
        }


    }
}
