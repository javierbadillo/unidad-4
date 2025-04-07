/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calcularmedia;

import java.util.Scanner;

/**
 *
 * @author javie
 */
public class Calcularmedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int numero;
        int suma = 0;
        int contador = 0;
        Scanner teclado = new Scanner(System.in);  
        do {
        System.out.println("Ingresa un numero positivo (ingresa un nmero negativo para terminar): ");
        numero = teclado.nextInt();  
        if (numero >= 0) {  
        suma = suma + numero;  
        contador++; 
        }            
        } while (numero >= 0);  
        if (contador > 0) {
        double media = (double) suma / contador;
        System.out.println("La media de los nmeros positivos ingresados es: " + media);
        } else {
        System.out.println("No se ingresaron nmeros positivos.");
        }        
        teclado.close();  
    }
    
}
