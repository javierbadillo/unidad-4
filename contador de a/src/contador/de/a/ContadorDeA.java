/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contador.de.a;

import java.util.Scanner;

/**
 *
 * @author javie
 */
public class ContadorDeA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     String palabra;   
     int contador = 0;
     Scanner teclado = new Scanner(System.in);
     System.out.println("Ingresa una palabra: ");
     palabra = teclado.nextLine();
     for (int i = 0; i < palabra.length(); i++) {
     if (palabra.charAt(i) == 'a' || palabra.charAt(i) == 'A') {
     contador++;
     }
     }
     System.out.println("La letra 'a' aparece " + contador + " veces.");
    }
    
}
