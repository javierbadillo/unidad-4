/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contadordedigito;

import java.util.Scanner;

/**
 *
 * @author javie
 */
public class Contadordedigito {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero, digitos = 0;
        Scanner teclado = new Scanner(System.in);  
        System.out.println("Ingresa un numero entero: ");
        numero = teclado.nextInt();  
        numero = Math.abs(numero);
        if (numero == 0) {
        digitos = 1;  
        } else {
        while (numero > 0) {
        numero /= 10;  
        digitos++;  
        }
        }
        System.out.println("El numero tiene " + digitos + " digitos.");
    }
    
}
