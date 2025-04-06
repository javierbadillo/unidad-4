/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edadparavotar;

import java.util.Scanner;

/**
 *
 * @author javie
 */
public class Edadparavotar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int edad;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa tu edad; ");
        edad = teclado.nextInt();
        if (edad >= 18){
            System.out.println("Si puedes votar: ");
        }else{
               System.out.println("No puedes votar: ");
        }
    }
    
}
