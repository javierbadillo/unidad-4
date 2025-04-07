/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package secuenciaaritmetica;

import java.util.Scanner;

/**
 *
 * @author javie
 */
public class Secuenciaaritmetica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int primerNumero, diferencia, numeroMaximo, actual;
        Scanner teclado = new Scanner(System.in);        
        System.out.print("Ingresa el primer numero de la secuencia: ");
        primerNumero = teclado.nextInt();       
        System.out.print("Ingresa la diferencia entre los numeros: ");
        diferencia = teclado.nextInt();        
        System.out.print("Ingresa el numero maximo de la secuencia: ");
        numeroMaximo = teclado.nextInt();       
        actual = primerNumero;        
        do {
            System.out.println(actual);
            actual += diferencia;
        } while (actual <= numeroMaximo);      
        teclado.close();
    }
    
}
