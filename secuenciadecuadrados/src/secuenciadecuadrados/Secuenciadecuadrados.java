/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package secuenciadecuadrados;

import java.util.Scanner;

/**
 *
 * @author javie
 */
public class Secuenciadecuadrados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;
        int i = 1;
        Scanner teclado = new Scanner(System.in);       
        System.out.print("Ingresa un numero entero positivo: ");
        numero = teclado.nextInt();       
        do {
            System.out.println(i * i);
            i++;
        } while (i <= numero);      
        teclado.close();
    }
    
}
