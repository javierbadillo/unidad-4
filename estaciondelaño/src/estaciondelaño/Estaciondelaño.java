/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estaciondelaño;

import java.util.Scanner;

/**
 *
 * @author javie
 */
public class Estaciondelaño {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int mes;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa un numero del 1 al 12: ");
        mes = teclado.nextInt();
        switch(mes){
        case 1:
        System.out.println("Es primavera");
        break;
        case 2:
        System.out.println("Es primavera");
        break;
        case 3:
        System.out.println("Es primavera");
        break;
        case 4:
        System.out.println("Es verano");
        break;
        case 5:
        System.out.println("Es verano");
        break;
        case 6:
        System.out.println("Es verano");
        break;
        case 7:
        System.out.println("Es otoño");
        break;
        case 8:
        System.out.println("Es otoño");
        break;
        case 9:
        System.out.println("Es otoño");
        break;
        case 10:
        System.out.println("Es invierno");
        break;
        case 11:
        System.out.println("Es invierno");  
        break;
        case 12:
        System.out.println("Es invierno");    
        break;
        default:
        System.out.println("El mes ingresado no existe");
        break;
        
                
    }
    }

    private static void Switch(int estacion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
