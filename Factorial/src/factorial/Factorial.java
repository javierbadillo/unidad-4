/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factorial;

import java.util.Scanner;

/**
 *
 * @author javie
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int numero, factorial = 1;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa un numero: ");
        numero = teclado.nextInt();
        for (int i = 1; i <= numero; i++) {
        factorial = factorial * i;
        }
        System.out.println("El factorial de " + numero + " es: " + factorial);
    }
    
}
