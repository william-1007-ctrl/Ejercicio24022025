package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int veinte = 0;
        int cincuenta = 0;
        int Cien = 0;
        int Doscientos = 0;
        int Quinientos = 0;
        int totalDinero = 0;
        int numero;
        int alcancia=0;

        do {

            System.out.println("Ingrese un valor para ingresar a la alcancia");
            System.out.print("1. 20 pesos \n");
            System.out.print("2. 50 pesos \n");
            System.out.print("3. 100 pesos \n");
            System.out.print("4. 200 pesos \n");
            System.out.print("5. 500 pesos \n");
            System.out.print("6. Total por denominacion \n");
            System.out.print("7. Ahorro total \n");
            System.out.print("8. Romper alcancia \n");

            numero = scanner.nextInt();

            switch (numero) {
                case 1: {
                    alcancia = alcancia+20;
                    System.out.println("Haz añadido 20: ");
                    veinte=veinte+1;
                    break;
                }

                case 2: {
                    alcancia = alcancia+50;
                    System.out.println("Haz añadido 50: ");
                    cincuenta=cincuenta+1;
                    break;
                }

                case 3: {
                    alcancia = alcancia+100;
                    System.out.println("Haz añadido 100: ");
                    Cien=Cien+1;
                    break;
                }
                case 4: {
                    alcancia = alcancia+200;
                    System.out.println("Haz añadido 200: ");
                    Doscientos=Doscientos+1;
                    break;
                }
                case 5: {
                    alcancia = alcancia+500;
                    System.out.println("Haz añadido 500: ");
                    Quinientos=Quinientos+1;
                    break;
                }
                case 6: {
                    System.out.println("Usted tiene un total de"  +veinte+ "monedas de 20");
                    System.out.println("Usted tiene un total de" +cincuenta+ "monedas de 50");
                    System.out.println("Usted tiene un total de" +Cien+ "monedas de 100");
                    System.out.println("Usted tiene un total de" +Doscientos+ "monedas de 200");
                    System.out.println("Usted tiene un total de" +Quinientos+ "monedas de 200");
                    break;

                }
                case 7: {

                    System.out.println("Usted tiene un total de" +alcancia+ "pesos ahorrados");
                    break;
                }
                case 8: {
                    System.out.println("Se ha quebrado la alcancia. Su ahorro es de:"+totalDinero+"pesos ahorrados");
                    break;
                }
                default:
                    System.out.println("Ingrese una de las opciones entre 1 y 8");
                    break;
            }
        } while(numero !=8 );

        scanner.close();
    }
}