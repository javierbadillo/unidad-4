/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adivinaelnumero;

import java.util.Scanner;

/**
 *
 * @author javie
 */
public class Adivinaelnumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int numero = 89;
        int numAdivinar;
        int contador = 0;
        Scanner teclado = new Scanner(System.in);
        do { 
            System.out.println("Ingresa un numero: ");
            numAdivinar = teclado.nextInt();
            if(numAdivinar == numero){
                System.out.println("Adivinaste");
            }else{
                System.out.println("Error");
                contador = contador + 1;
            }
        } while (numAdivinar != numero && contador <= 10);
    }
    
}
