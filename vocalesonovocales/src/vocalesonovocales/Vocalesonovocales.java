/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vocalesonovocales;

import java.util.Scanner;

/**
 *
 * @author javie
 */
public class Vocalesonovocales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String letra;
       Scanner teclado = new Scanner(System.in);         
        do {
        System.out.println("Ingresa una letra (o un espacio para salir): ");
        letra = teclado.nextLine();             
        if (letra.equals(" ")) {
        System.out.println("El programa ha terminado.");
        break;
        }
        if (letra.length() == 1) { 
        char c = letra.charAt(0);  
        if ("aeiouAEIOU".indexOf(c) != -1) {
        System.out.println("Es una vocal.");
        } else {
       System.out.println("Es una consonante.");
        }
        } else {
        System.out.println("Por favor ingresa solo una letra.");
        }                    
        } while (true);  
        teclado.close();  
    }
    
}
