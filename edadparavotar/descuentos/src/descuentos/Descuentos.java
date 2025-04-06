/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package descuentos;

import java.util.Scanner;

/**
 *
 * @author javie
 */
public class Descuentos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double precio, preciofinal = 0, descuento;
        // <=100 sin descuento, >100 y <=200 10%descuento, >200 y <=500 20%descuento, >500 25%descuento
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa el precio: ");
        precio = teclado.nextInt();
        if(precio <=100){
            System.out.println("Sin descuento");
            preciofinal = precio;
        }else if(precio >100 && precio <=200){
            System.out.println("10% de descuento");
            descuento = precio * 0.10;
            preciofinal = precio - descuento;
        }else if(precio >200 && precio <=500){
            System.out.println("20% de descuento");
            descuento = precio * 0.20;
            preciofinal = precio - descuento;
        }else if(precio >500){
            System.out.println("25% de descuento");
            descuento = precio * 0.25;
            preciofinal = precio - descuento;
        }
          System.out.println("El precio total es: " +preciofinal);     
    }
    
}
