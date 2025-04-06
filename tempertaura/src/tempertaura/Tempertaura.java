/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tempertaura;

import java.util.Scanner;

/**
 *
 * @author javie
 */
public class Tempertaura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double celsius, resultado;
        int opcion;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa la temperatura en grados celsius: ");
        celsius = teclado.nextDouble();
        System.out.println("Ingre 1 para convertir a Kelvin o 2 para Fahrenheit: ");
        opcion = teclado.nextInt();
        switch (opcion){
        case 1:
        resultado = celsius + 273.15;
        System.out.println(" Son " + resultado + " grados Kelvin.");
        break;  
        case 2:
        resultado = (celsius * 9 / 5) + 32;
        System.out.println( " Son " + resultado + " grados Fahrenheit.");
        break;  
        default:
        System.out.println("Opcion no valida. Elige 1 para Kelvin o 2 para Fahrenheit.");
        break;
        }
        
    }
    
}
